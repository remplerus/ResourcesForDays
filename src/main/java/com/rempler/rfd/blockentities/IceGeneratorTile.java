package com.rempler.rfd.blockentities;

import com.rempler.rfd.setup.Config;
import com.rempler.rfd.setup.ModBE;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class IceGeneratorTile extends BaseGeneratorTile {

	public static final Block GENERATION_BLOCK = Blocks.ICE;

    public IceGeneratorTile(Config.Tiers tiers, BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(tiers, type, pos, state);
    }

    public void tickServer() {
        tickServer(GENERATION_BLOCK);
    }

    public static IceGeneratorTile create(int Tier, BlockPos pos, BlockState state) {
        return switch(Tier) {
            case 1 -> new IceGeneratorTile(Config.tier1, ModBE.ICE_T1_BE.get(), pos, state);
            case 2 -> new IceGeneratorTile(Config.tier2, ModBE.ICE_T2_BE.get(), pos, state);
            case 3 -> new IceGeneratorTile(Config.tier3, ModBE.ICE_T3_BE.get(), pos, state);
            case 4 -> new IceGeneratorTile(Config.tier4, ModBE.ICE_T4_BE.get(), pos, state);
            case 5 -> new IceGeneratorTile(Config.tier5, ModBE.ICE_T5_BE.get(), pos, state);
            default -> throw new IllegalArgumentException("Unknown Tier: " + Tier);
        };
    }

    public static BlockEntityType.BlockEntitySupplier<IceGeneratorTile> makeSupplier(int Tier) {
        return switch(Tier) {
            case 1 -> (pos, state) -> new IceGeneratorTile(Config.tier1, ModBE.ICE_T1_BE.get(), pos, state);
            case 2 -> (pos, state) -> new IceGeneratorTile(Config.tier2, ModBE.ICE_T2_BE.get(), pos, state);
            case 3 -> (pos, state) -> new IceGeneratorTile(Config.tier3, ModBE.ICE_T3_BE.get(), pos, state);
            case 4 -> (pos, state) -> new IceGeneratorTile(Config.tier4, ModBE.ICE_T4_BE.get(), pos, state);
            case 5 -> (pos, state) -> new IceGeneratorTile(Config.tier5, ModBE.ICE_T5_BE.get(), pos, state);
            default -> throw new IllegalArgumentException("Unknown Tier: " + Tier);
        };
    }

}
