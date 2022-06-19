package com.rempler.rfd.blockentities;

import com.rempler.rfd.setup.Config;
import com.rempler.rfd.setup.ModBE;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class ClayGeneratorTile extends BaseGeneratorTile {

    public ClayGeneratorTile(Config.Tiers tiers, BlockEntityType<?> be, BlockPos pos, BlockState state) {
        super(tiers, be, pos, state);
    }

    public void tickServer() {
        tickServer(Items.CLAY_BALL, Blocks.CLAY);
    }

    public static ClayGeneratorTile create(int Tier, BlockPos pos, BlockState state) {
        return switch(Tier) {
            case 1 -> new ClayGeneratorTile(Config.tier1, ModBE.CLAY_T1_BE.get(), pos, state);
            case 2 -> new ClayGeneratorTile(Config.tier2, ModBE.CLAY_T2_BE.get(), pos, state);
            case 3 -> new ClayGeneratorTile(Config.tier3, ModBE.CLAY_T3_BE.get(), pos, state);
            case 4 -> new ClayGeneratorTile(Config.tier4, ModBE.CLAY_T4_BE.get(), pos, state);
            case 5 -> new ClayGeneratorTile(Config.tier5, ModBE.CLAY_T5_BE.get(), pos, state);
            default -> throw new IllegalArgumentException("Unknown Tier: " + Tier);
        };
    }

    public static BlockEntityType.BlockEntitySupplier<ClayGeneratorTile> makeSupplier(int Tier) {
        return switch(Tier) {
            case 1 -> (pos, state) -> new ClayGeneratorTile(Config.tier1, ModBE.CLAY_T1_BE.get(), pos, state);
            case 2 -> (pos, state) -> new ClayGeneratorTile(Config.tier2, ModBE.CLAY_T2_BE.get(), pos, state);
            case 3 -> (pos, state) -> new ClayGeneratorTile(Config.tier3, ModBE.CLAY_T3_BE.get(), pos, state);
            case 4 -> (pos, state) -> new ClayGeneratorTile(Config.tier4, ModBE.CLAY_T4_BE.get(), pos, state);
            case 5 -> (pos, state) -> new ClayGeneratorTile(Config.tier5, ModBE.CLAY_T5_BE.get(), pos, state);
            default -> throw new IllegalArgumentException("Unknown Tier: " + Tier);
        };
    }

}
