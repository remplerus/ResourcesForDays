package com.rempler.rfd.blockentities;

import com.rempler.rfd.setup.Config;
import com.rempler.rfd.setup.ModBE;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class SnowGeneratorTile extends BaseGeneratorTile {

	public static final Block GENERATION_BLOCK = Blocks.SNOW_BLOCK;
	public static final Item GENERATION_ITEM = Items.SNOWBALL;

    public SnowGeneratorTile(Config.Tiers tiers, BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(tiers, type, pos, state);
    }

    public void tickServer() {
        tickServer(GENERATION_ITEM, GENERATION_BLOCK);
    }

    public static SnowGeneratorTile create(int Tier, BlockPos pos, BlockState state) {
        return switch(Tier) {
            case 1 -> new SnowGeneratorTile(Config.tier1, ModBE.SNOW_T1_BE.get(), pos, state);
            case 2 -> new SnowGeneratorTile(Config.tier2, ModBE.SNOW_T2_BE.get(), pos, state);
            case 3 -> new SnowGeneratorTile(Config.tier3, ModBE.SNOW_T3_BE.get(), pos, state);
            case 4 -> new SnowGeneratorTile(Config.tier4, ModBE.SNOW_T4_BE.get(), pos, state);
            case 5 -> new SnowGeneratorTile(Config.tier5, ModBE.SNOW_T5_BE.get(), pos, state);
            default -> throw new IllegalArgumentException("Unknown Tier: " + Tier);
        };
    }

    public static BlockEntityType.BlockEntitySupplier<SnowGeneratorTile> makeSupplier(int Tier) {
        return switch(Tier) {
            case 1 -> (pos, state) -> new SnowGeneratorTile(Config.tier1, ModBE.SNOW_T1_BE.get(), pos, state);
            case 2 -> (pos, state) -> new SnowGeneratorTile(Config.tier2, ModBE.SNOW_T2_BE.get(), pos, state);
            case 3 -> (pos, state) -> new SnowGeneratorTile(Config.tier3, ModBE.SNOW_T3_BE.get(), pos, state);
            case 4 -> (pos, state) -> new SnowGeneratorTile(Config.tier4, ModBE.SNOW_T4_BE.get(), pos, state);
            case 5 -> (pos, state) -> new SnowGeneratorTile(Config.tier5, ModBE.SNOW_T5_BE.get(), pos, state);
            default -> throw new IllegalArgumentException("Unknown Tier: " + Tier);
        };
    }

}
