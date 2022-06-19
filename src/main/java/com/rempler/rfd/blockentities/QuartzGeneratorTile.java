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

public class QuartzGeneratorTile extends BaseGeneratorTile {

	public static final Block GENERATION_BLOCK = Blocks.QUARTZ_BLOCK;
	public static final Item GENERATION_ITEM = Items.QUARTZ;

    public QuartzGeneratorTile(Config.Tiers tiers, BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(tiers, type, pos, state);
    }
    
    public void tickServer() {
        tickServer(GENERATION_ITEM, GENERATION_BLOCK);
    }

    public static QuartzGeneratorTile create(int Tier, BlockPos pos, BlockState state) {
        return switch(Tier) {
            case 1 -> new QuartzGeneratorTile(Config.tier1, ModBE.QUARTZ_T1_BE.get(), pos, state);
            case 2 -> new QuartzGeneratorTile(Config.tier2, ModBE.QUARTZ_T2_BE.get(), pos, state);
            case 3 -> new QuartzGeneratorTile(Config.tier3, ModBE.QUARTZ_T3_BE.get(), pos, state);
            case 4 -> new QuartzGeneratorTile(Config.tier4, ModBE.QUARTZ_T4_BE.get(), pos, state);
            case 5 -> new QuartzGeneratorTile(Config.tier5, ModBE.QUARTZ_T5_BE.get(), pos, state);
            default -> throw new IllegalArgumentException("Unknown Tier: " + Tier);
        };
    }

    public static BlockEntityType.BlockEntitySupplier<QuartzGeneratorTile> makeSupplier(int Tier) {
        return switch(Tier) {
            case 1 -> (pos, state) -> new QuartzGeneratorTile(Config.tier1, ModBE.QUARTZ_T1_BE.get(), pos, state);
            case 2 -> (pos, state) -> new QuartzGeneratorTile(Config.tier2, ModBE.QUARTZ_T2_BE.get(), pos, state);
            case 3 -> (pos, state) -> new QuartzGeneratorTile(Config.tier3, ModBE.QUARTZ_T3_BE.get(), pos, state);
            case 4 -> (pos, state) -> new QuartzGeneratorTile(Config.tier4, ModBE.QUARTZ_T4_BE.get(), pos, state);
            case 5 -> (pos, state) -> new QuartzGeneratorTile(Config.tier5, ModBE.QUARTZ_T5_BE.get(), pos, state);
            default -> throw new IllegalArgumentException("Unknown Tier: " + Tier);
        };
    }

}
