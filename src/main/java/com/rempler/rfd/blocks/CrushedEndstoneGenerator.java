package com.rempler.rfd.blocks;

import com.rempler.rfd.blockentities.CrushedEndstoneGeneratorTile;
import com.rempler.rfd.setup.Config;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.world.item.TooltipFlag;
import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.world.level.BlockGetter;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.glfw.GLFW;

import javax.annotation.Nullable;
import java.util.List;

public class CrushedEndstoneGenerator {/*extends BaseGenerator {
    private final int tier;
    public CrushedEndstoneGenerator(int Tier){
        super(15); // set to 15 as this generator uses lava
        this.tier = Tier;
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(@NotNull ItemStack stack, @Nullable BlockGetter worldIn, @NotNull List<Component> tooltip, @NotNull TooltipFlag flags) {

        if (InputConstants.isKeyDown(Minecraft.getInstance().getWindow().getWindow(), GLFW.GLFW_KEY_LEFT_SHIFT)) {
            Component information = Component.translatable("block.generator.information");

            ResourceLocation key = new ResourceLocation("exnihilosequentia:crushed_end_stone");
            String text = information.getString();

            if (ForgeRegistries.BLOCKS.containsKey(key)) {
                Block block = ForgeRegistries.BLOCKS.getValue(key);
                assert block != null;
                text = text.replace("{item}", block.getName().getString());
            } else {
                text = text.replace("{item}", CrushedEndstoneGeneratorTile.GENERATION_BLOCK.getName().getString());
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
    public BlockEntity newBlockEntity(@NotNull BlockPos pos, @NotNull BlockState state) {
        return CrushedEndstoneGeneratorTile.create(this.tier, pos, state);
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, @NotNull BlockState state, @NotNull BlockEntityType<T> type) {
        if (!level.isClientSide) {
            return (level1, blockPos, blockState, t) -> {
                if (t instanceof CrushedEndstoneGeneratorTile tile) {
                    tile.tickServer();
                }
            };
        }
        return null;
    }*/
}
