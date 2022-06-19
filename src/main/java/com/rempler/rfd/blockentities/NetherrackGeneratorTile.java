package com.rempler.rfd.blockentities;

import com.rempler.rfd.setup.Config;
import com.rempler.rfd.setup.ModBE;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class NetherrackGeneratorTile extends BaseGeneratorTile {

	public static final Block GENERATION_BLOCK = Blocks.NETHERRACK;

    public NetherrackGeneratorTile(Config.Tiers tiers, BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(tiers, type, pos, state);
    }

    public void tickServer() {
        tickServer(GENERATION_BLOCK);
    }

    public static NetherrackGeneratorTile create(int Tier, BlockPos pos, BlockState state) {
        return switch(Tier) {
            case 1 -> new NetherrackGeneratorTile(Config.tier1, ModBE.NETHERRACK_T1_BE.get(), pos, state);
            case 2 -> new NetherrackGeneratorTile(Config.tier2, ModBE.NETHERRACK_T2_BE.get(), pos, state);
            case 3 -> new NetherrackGeneratorTile(Config.tier3, ModBE.NETHERRACK_T3_BE.get(), pos, state);
            case 4 -> new NetherrackGeneratorTile(Config.tier4, ModBE.NETHERRACK_T4_BE.get(), pos, state);
            case 5 -> new NetherrackGeneratorTile(Config.tier5, ModBE.NETHERRACK_T5_BE.get(), pos, state);
            default -> throw new IllegalArgumentException("Unknown Tier: " + Tier);
        };
    }

    public static BlockEntityType.BlockEntitySupplier<NetherrackGeneratorTile> makeSupplier(int Tier) {
        return switch(Tier) {
            case 1 -> (pos, state) -> new NetherrackGeneratorTile(Config.tier1, ModBE.NETHERRACK_T1_BE.get(), pos, state);
            case 2 -> (pos, state) -> new NetherrackGeneratorTile(Config.tier2, ModBE.NETHERRACK_T2_BE.get(), pos, state);
            case 3 -> (pos, state) -> new NetherrackGeneratorTile(Config.tier3, ModBE.NETHERRACK_T3_BE.get(), pos, state);
            case 4 -> (pos, state) -> new NetherrackGeneratorTile(Config.tier4, ModBE.NETHERRACK_T4_BE.get(), pos, state);
            case 5 -> (pos, state) -> new NetherrackGeneratorTile(Config.tier5, ModBE.NETHERRACK_T5_BE.get(), pos, state);
            default -> throw new IllegalArgumentException("Unknown Tier: " + Tier);
        };
    }

}
