package com.rempler.rfd.blockentities;

import com.rempler.rfd.setup.Config;
import com.rempler.rfd.setup.ModBE;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class ObsidianGeneratorTile extends BaseGeneratorTile {

	public static final Block GENERATION_BLOCK = Blocks.OBSIDIAN;

    public ObsidianGeneratorTile(Config.Tiers tiers, BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(tiers, type, pos, state);
    }

    public void tickServer() {
        tickServer(GENERATION_BLOCK);
    }

    public static ObsidianGeneratorTile create(int Tier, BlockPos pos, BlockState state) {
        return switch(Tier) {
            case 1 -> new ObsidianGeneratorTile(Config.tier1, ModBE.OBSIDIAN_T1_BE.get(), pos, state);
            case 2 -> new ObsidianGeneratorTile(Config.tier2, ModBE.OBSIDIAN_T2_BE.get(), pos, state);
            case 3 -> new ObsidianGeneratorTile(Config.tier3, ModBE.OBSIDIAN_T3_BE.get(), pos, state);
            case 4 -> new ObsidianGeneratorTile(Config.tier4, ModBE.OBSIDIAN_T4_BE.get(), pos, state);
            case 5 -> new ObsidianGeneratorTile(Config.tier5, ModBE.OBSIDIAN_T5_BE.get(), pos, state);
            default -> throw new IllegalArgumentException("Unknown Tier: " + Tier);
        };
    }

    public static BlockEntityType.BlockEntitySupplier<ObsidianGeneratorTile> makeSupplier(int Tier) {
        return switch(Tier) {
            case 1 -> (pos, state) -> new ObsidianGeneratorTile(Config.tier1, ModBE.OBSIDIAN_T1_BE.get(), pos, state);
            case 2 -> (pos, state) -> new ObsidianGeneratorTile(Config.tier2, ModBE.OBSIDIAN_T2_BE.get(), pos, state);
            case 3 -> (pos, state) -> new ObsidianGeneratorTile(Config.tier3, ModBE.OBSIDIAN_T3_BE.get(), pos, state);
            case 4 -> (pos, state) -> new ObsidianGeneratorTile(Config.tier4, ModBE.OBSIDIAN_T4_BE.get(), pos, state);
            case 5 -> (pos, state) -> new ObsidianGeneratorTile(Config.tier5, ModBE.OBSIDIAN_T5_BE.get(), pos, state);
            default -> throw new IllegalArgumentException("Unknown Tier: " + Tier);
        };
    }

}
