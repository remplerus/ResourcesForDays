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

public class RedstoneGeneratorTile extends BaseGeneratorTile {

	public static final Block GENERATION_BLOCK = Blocks.REDSTONE_BLOCK;
	public static final Item GENERATION_ITEM = Items.REDSTONE;

    public RedstoneGeneratorTile(Config.Tiers tiers, BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(tiers, type, pos, state);
    }

    public void tickServer() {
        tickServer(GENERATION_ITEM, GENERATION_BLOCK);
    }

    public static RedstoneGeneratorTile create(int Tier, BlockPos pos, BlockState state) {
        return switch(Tier) {
            case 1 -> new RedstoneGeneratorTile(Config.tier1, ModBE.REDSTONE_T1_BE.get(), pos, state);
            case 2 -> new RedstoneGeneratorTile(Config.tier2, ModBE.REDSTONE_T2_BE.get(), pos, state);
            case 3 -> new RedstoneGeneratorTile(Config.tier3, ModBE.REDSTONE_T3_BE.get(), pos, state);
            case 4 -> new RedstoneGeneratorTile(Config.tier4, ModBE.REDSTONE_T4_BE.get(), pos, state);
            case 5 -> new RedstoneGeneratorTile(Config.tier5, ModBE.REDSTONE_T5_BE.get(), pos, state);
            default -> throw new IllegalArgumentException("Unknown Tier: " + Tier);
        };
    }

    public static BlockEntityType.BlockEntitySupplier<RedstoneGeneratorTile> makeSupplier(int Tier) {
        return switch(Tier) {
            case 1 -> (pos, state) -> new RedstoneGeneratorTile(Config.tier1, ModBE.REDSTONE_T1_BE.get(), pos, state);
            case 2 -> (pos, state) -> new RedstoneGeneratorTile(Config.tier2, ModBE.REDSTONE_T2_BE.get(), pos, state);
            case 3 -> (pos, state) -> new RedstoneGeneratorTile(Config.tier3, ModBE.REDSTONE_T3_BE.get(), pos, state);
            case 4 -> (pos, state) -> new RedstoneGeneratorTile(Config.tier4, ModBE.REDSTONE_T4_BE.get(), pos, state);
            case 5 -> (pos, state) -> new RedstoneGeneratorTile(Config.tier5, ModBE.REDSTONE_T5_BE.get(), pos, state);
            default -> throw new IllegalArgumentException("Unknown Tier: " + Tier);
        };
    }

}
