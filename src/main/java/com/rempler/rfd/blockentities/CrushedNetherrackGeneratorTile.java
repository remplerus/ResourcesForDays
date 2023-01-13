package com.rempler.rfd.blockentities;

import com.rempler.rfd.setup.Config;
import com.rempler.rfd.setup.ModBE;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.registries.ForgeRegistries;

public class CrushedNetherrackGeneratorTile extends BaseGeneratorTile {

    public static final String RESOURCE_KEY = "exnihilosequentia:crushed_netherrack";
	public static final Block GENERATION_BLOCK = Blocks.NETHERRACK;

    public CrushedNetherrackGeneratorTile(Config.Tiers tiers, BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(tiers, type, pos, state);
    }

    public void tickServer() {
        ResourceLocation key = new ResourceLocation(RESOURCE_KEY);

        if (ForgeRegistries.BLOCKS.containsKey(key)) {
            Block block = ForgeRegistries.BLOCKS.getValue(key);
            tickServer(block);
        } else {
            tickServer(GENERATION_BLOCK);
        }
    }

    public static CrushedNetherrackGeneratorTile create(int Tier, BlockPos pos, BlockState state) {
        return switch(Tier) {
            case 1 -> new CrushedNetherrackGeneratorTile(Config.tier1, ModBE.CRUSHED_NETHERRACK_T1_BE.get(), pos, state);
            case 2 -> new CrushedNetherrackGeneratorTile(Config.tier2, ModBE.CRUSHED_NETHERRACK_T2_BE.get(), pos, state);
            case 3 -> new CrushedNetherrackGeneratorTile(Config.tier3, ModBE.CRUSHED_NETHERRACK_T3_BE.get(), pos, state);
            case 4 -> new CrushedNetherrackGeneratorTile(Config.tier4, ModBE.CRUSHED_NETHERRACK_T4_BE.get(), pos, state);
            case 5 -> new CrushedNetherrackGeneratorTile(Config.tier5, ModBE.CRUSHED_NETHERRACK_T5_BE.get(), pos, state);
            default -> throw new IllegalArgumentException("Unknown Tier: " + Tier);
        };
    }

    public static BlockEntityType.BlockEntitySupplier<CrushedNetherrackGeneratorTile> makeSupplier(int Tier) {
        return switch(Tier) {
            case 1 -> (pos, state) -> new CrushedNetherrackGeneratorTile(Config.tier1, ModBE.CRUSHED_NETHERRACK_T1_BE.get(), pos, state);
            case 2 -> (pos, state) -> new CrushedNetherrackGeneratorTile(Config.tier2, ModBE.CRUSHED_NETHERRACK_T2_BE.get(), pos, state);
            case 3 -> (pos, state) -> new CrushedNetherrackGeneratorTile(Config.tier3, ModBE.CRUSHED_NETHERRACK_T3_BE.get(), pos, state);
            case 4 -> (pos, state) -> new CrushedNetherrackGeneratorTile(Config.tier4, ModBE.CRUSHED_NETHERRACK_T4_BE.get(), pos, state);
            case 5 -> (pos, state) -> new CrushedNetherrackGeneratorTile(Config.tier5, ModBE.CRUSHED_NETHERRACK_T5_BE.get(), pos, state);
            default -> throw new IllegalArgumentException("Unknown Tier: " + Tier);
        };
    }

}
