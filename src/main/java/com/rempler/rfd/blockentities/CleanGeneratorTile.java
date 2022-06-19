package com.rempler.rfd.blockentities;

import com.rempler.rfd.setup.Config;
import com.rempler.rfd.setup.ModBE;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class CleanGeneratorTile extends BaseGeneratorTile {

	public static final Block GENERATION_BLOCK = Blocks.STONE;

    public CleanGeneratorTile(Config.Tiers tiers, BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(tiers, type, pos, state);
    }
    
    public void tickServer() {
        tickServer(GENERATION_BLOCK);
    }
    
    public static CleanGeneratorTile create(int Tier, BlockPos pos, BlockState state) {
        return switch(Tier) {
            case 1 -> new CleanGeneratorTile(Config.tier1, ModBE.CLEAN_T1_BE.get(), pos, state);
            case 2 -> new CleanGeneratorTile(Config.tier2, ModBE.CLEAN_T2_BE.get(), pos, state);
            case 3 -> new CleanGeneratorTile(Config.tier3, ModBE.CLEAN_T3_BE.get(), pos, state);
            case 4 -> new CleanGeneratorTile(Config.tier4, ModBE.CLEAN_T4_BE.get(), pos, state);
            case 5 -> new CleanGeneratorTile(Config.tier5, ModBE.CLEAN_T5_BE.get(), pos, state);
            default -> throw new IllegalArgumentException("Unknown Tier: " + Tier);
        };
    }

    public static BlockEntityType.BlockEntitySupplier<CleanGeneratorTile> makeSupplier(int Tier) {
        return switch(Tier) {
            case 1 -> (pos, state) -> new CleanGeneratorTile(Config.tier1, ModBE.CLEAN_T1_BE.get(), pos, state);
            case 2 -> (pos, state) -> new CleanGeneratorTile(Config.tier2, ModBE.CLEAN_T2_BE.get(), pos, state);
            case 3 -> (pos, state) -> new CleanGeneratorTile(Config.tier3, ModBE.CLEAN_T3_BE.get(), pos, state);
            case 4 -> (pos, state) -> new CleanGeneratorTile(Config.tier4, ModBE.CLEAN_T4_BE.get(), pos, state);
            case 5 -> (pos, state) -> new CleanGeneratorTile(Config.tier5, ModBE.CLEAN_T5_BE.get(), pos, state);
            default -> throw new IllegalArgumentException("Unknown Tier: " + Tier);
        };
    }

}
