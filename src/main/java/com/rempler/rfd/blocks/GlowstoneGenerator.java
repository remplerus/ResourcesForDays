package com.rempler.rfd.blocks;

import com.rempler.rfd.blockentities.GlowstoneGeneratorTile;
import com.rempler.rfd.setup.Config;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.world.item.TooltipFlag;
import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.network.chat.Component;
import net.minecraft.world.level.BlockGetter;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.lwjgl.glfw.GLFW;

import javax.annotation.Nullable;
import java.util.List;

public class GlowstoneGenerator extends BaseGenerator {
    private final int tier;
    public GlowstoneGenerator(int Tier){
        super(15); // set to 15 as this generator uses lava
        this.tier = Tier;
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack stack, @Nullable BlockGetter worldIn, List<Component> tooltip, TooltipFlag flags) {

        if (InputConstants.isKeyDown(Minecraft.getInstance().getWindow().getWindow(), GLFW.GLFW_KEY_LEFT_SHIFT)) {
            Component information = Component.translatable("block.generator.information");

            String text = information.getString();

            if (Boolean.TRUE.equals(Config.GENERATE_DUST.get())) {
                text = text.replace("{item}", GlowstoneGeneratorTile.GENERATION_ITEM.getDescription().getString());
            } else {
                text = text.replace("{item}", GlowstoneGeneratorTile.GENERATION_BLOCK.getName().getString());
            }
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
        return GlowstoneGeneratorTile.create(this.tier, pos, state);
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> type) {
        if (!level.isClientSide) {
            return (level1, blockPos, blockState, t) -> {
                if (t instanceof GlowstoneGeneratorTile tile) {
                    tile.tickServer();
                }
            };
        }
        return null;
    }
}
