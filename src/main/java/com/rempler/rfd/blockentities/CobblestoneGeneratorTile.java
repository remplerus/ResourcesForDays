package com.rempler.rfd.blockentities;

import com.rempler.rfd.setup.Config;
import com.rempler.rfd.setup.ModBE;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class CobblestoneGeneratorTile extends BaseGeneratorTile {
    public CobblestoneGeneratorTile(Config.Tiers tiers, BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(tiers, type, pos, state);
    }
    //
    //public void tickServer() {
    //    tickServer(Blocks.COBBLESTONE);
    //}
//
    //public static CobblestoneGeneratorTile create(int Tier, BlockPos pos, BlockState state) {
    //    return switch(Tier) {
    //        case 1 -> new CobblestoneGeneratorTile(Config.tier1, ModBE.COBBLE_T1_BE.get(), pos, state);
    //        case 2 -> new CobblestoneGeneratorTile(Config.tier2, ModBE.COBBLE_T2_BE.get(), pos, state);
    //        case 3 -> new CobblestoneGeneratorTile(Config.tier3, ModBE.COBBLE_T3_BE.get(), pos, state);
    //        case 4 -> new CobblestoneGeneratorTile(Config.tier4, ModBE.COBBLE_T4_BE.get(), pos, state);
    //        case 5 -> new CobblestoneGeneratorTile(Config.tier5, ModBE.COBBLE_T5_BE.get(), pos, state);
    //        default -> throw new IllegalArgumentException("Unknown Tier: " + Tier);
    //    };
    //}
//
    //public static BlockEntityType.BlockEntitySupplier<CobblestoneGeneratorTile> makeSupplier(int Tier) {
    //    return switch(Tier) {
    //        case 1 -> (pos, state) -> new CobblestoneGeneratorTile(Config.tier1, ModBE.COBBLE_T1_BE.get(), pos, state);
    //        case 2 -> (pos, state) -> new CobblestoneGeneratorTile(Config.tier2, ModBE.COBBLE_T2_BE.get(), pos, state);
    //        case 3 -> (pos, state) -> new CobblestoneGeneratorTile(Config.tier3, ModBE.COBBLE_T3_BE.get(), pos, state);
    //        case 4 -> (pos, state) -> new CobblestoneGeneratorTile(Config.tier4, ModBE.COBBLE_T4_BE.get(), pos, state);
    //        case 5 -> (pos, state) -> new CobblestoneGeneratorTile(Config.tier5, ModBE.COBBLE_T5_BE.get(), pos, state);
    //        default -> throw new IllegalArgumentException("Unknown Tier: " + Tier);
    //    };
    //}

}
