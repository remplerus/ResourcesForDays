package com.rempler.rfd.blocks;

import com.mojang.blaze3d.platform.InputConstants;
import com.mojang.serialization.MapCodec;
import com.rempler.rfd.blockentities.TieredGeneratorTile;
import com.rempler.rfd.setup.Config;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.level.BlockGetter;
import org.lwjgl.glfw.GLFW;

import javax.annotation.Nullable;
import java.util.List;

public class BaseGenerator extends HorizontalDirectionalBlock implements EntityBlock {

    private static final VoxelShape RENDER_SHAPE = Shapes.join(
            box(0.0D,  0.0D, 0.0D, 16.0D,  4.0D, 16.0D),
            box(0.0D, 12.0D, 0.0D, 16.0D, 16.0D, 16.0D),
            BooleanOp.OR);
    private final int tier;
    private final Item item;
    private final Block block;

    protected BaseGenerator(int lightLevel) {
        this(lightLevel, 1, Items.AIR, Blocks.AIR);
    }

    public BaseGenerator(int lightLevel, int Tier, Item item, Block block) {
        super(Properties.of()
                .sound(SoundType.STONE)
                .strength(2.0f)
                .lightLevel((light) -> lightLevel)
                .pushReaction(PushReaction.BLOCK)
        );
        this.tier = Tier;
        this.item = item;
        this.block = block;
    }

    @SuppressWarnings("deprecation")
    @Override
    public VoxelShape getOcclusionShape(BlockState state, BlockGetter worldIn, BlockPos pos) {
        return RENDER_SHAPE;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable BlockGetter worldIn, List<Component> tooltip, TooltipFlag flags) {
        if (InputConstants.isKeyDown(Minecraft.getInstance().getWindow().getWindow(), GLFW.GLFW_KEY_LEFT_SHIFT)) {
            Component information = Component.translatable("block.generator.information");

            String text = information.getString();

            text = text.replace("{item}", this.block.getName().getString());
            String ticks;
            switch (tier) {
                case 2 -> ticks = Config.tier2.interval.get().toString();
                case 3 -> ticks = Config.tier3.interval.get().toString();
                case 4 -> ticks = Config.tier4.interval.get().toString();
                case 5 -> ticks = Config.tier5.interval.get().toString();
                default -> ticks = Config.tier1.interval.get().toString();
            }
            text = text.replace("{ticks}", ticks);

            tooltip.add(Component.literal(text));
        } else {
            tooltip.add(Component.translatable("block.holdshift.information"));
        }
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return TieredGeneratorTile.create(this.tier, pos, state);
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> type) {
        if (!level.isClientSide) {
            return (level1, blockPos, blockState, t) -> {
                if (t instanceof TieredGeneratorTile tile) {
                    tile.tickServer(item, block);
                }
            };
        }
        return null;
    }

    @Override
    protected MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return null;
    }
}
