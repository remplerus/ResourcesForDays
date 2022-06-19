package com.rempler.rfd.blockentities;

import com.rempler.rfd.setup.Config;
import com.rempler.rfd.setup.ModBE;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class GravelGeneratorTile extends BaseGeneratorTile {

	public static final Block GENERATION_BLOCK = Blocks.GRAVEL;

    public GravelGeneratorTile(Config.Tiers tiers, BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(tiers, type, pos, state);
    }

    public void tickServer() {
        tickServer(GENERATION_BLOCK);
    }
    
    public static GravelGeneratorTile create(int Tier, BlockPos pos, BlockState state) {
        return switch(Tier) {
            case 1 -> new GravelGeneratorTile(Config.tier1, ModBE.GRAVEL_T1_BE.get(), pos, state);
            case 2 -> new GravelGeneratorTile(Config.tier2, ModBE.GRAVEL_T2_BE.get(), pos, state);
            case 3 -> new GravelGeneratorTile(Config.tier3, ModBE.GRAVEL_T3_BE.get(), pos, state);
            case 4 -> new GravelGeneratorTile(Config.tier4, ModBE.GRAVEL_T4_BE.get(), pos, state);
            case 5 -> new GravelGeneratorTile(Config.tier5, ModBE.GRAVEL_T5_BE.get(), pos, state);
            default -> throw new IllegalArgumentException("Unknown Tier: " + Tier);
        };
    }

    public static BlockEntityType.BlockEntitySupplier<GravelGeneratorTile> makeSupplier(int Tier) {
        return switch(Tier) {
            case 1 -> (pos, state) -> new GravelGeneratorTile(Config.tier1, ModBE.GRAVEL_T1_BE.get(), pos, state);
            case 2 -> (pos, state) -> new GravelGeneratorTile(Config.tier2, ModBE.GRAVEL_T2_BE.get(), pos, state);
            case 3 -> (pos, state) -> new GravelGeneratorTile(Config.tier3, ModBE.GRAVEL_T3_BE.get(), pos, state);
            case 4 -> (pos, state) -> new GravelGeneratorTile(Config.tier4, ModBE.GRAVEL_T4_BE.get(), pos, state);
            case 5 -> (pos, state) -> new GravelGeneratorTile(Config.tier5, ModBE.GRAVEL_T5_BE.get(), pos, state);
            default -> throw new IllegalArgumentException("Unknown Tier: " + Tier);
        };
    }

}
