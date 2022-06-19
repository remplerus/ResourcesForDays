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

public class GlowstoneGeneratorTile extends BaseGeneratorTile {

	public static final Block GENERATION_BLOCK = Blocks.GLOWSTONE;
	public static final Item GENERATION_ITEM = Items.GLOWSTONE_DUST;

    public GlowstoneGeneratorTile(Config.Tiers tiers, BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(tiers, type, pos, state);
    }

    public void tickServer() {
        tickServer(GENERATION_ITEM, GENERATION_BLOCK);
    }

    public static GlowstoneGeneratorTile create(int Tier, BlockPos pos, BlockState state) {
        return switch(Tier) {
            case 1 -> new GlowstoneGeneratorTile(Config.tier1, ModBE.GLOWSTONE_T1_BE.get(), pos, state);
            case 2 -> new GlowstoneGeneratorTile(Config.tier2, ModBE.GLOWSTONE_T2_BE.get(), pos, state);
            case 3 -> new GlowstoneGeneratorTile(Config.tier3, ModBE.GLOWSTONE_T3_BE.get(), pos, state);
            case 4 -> new GlowstoneGeneratorTile(Config.tier4, ModBE.GLOWSTONE_T4_BE.get(), pos, state);
            case 5 -> new GlowstoneGeneratorTile(Config.tier5, ModBE.GLOWSTONE_T5_BE.get(), pos, state);
            default -> throw new IllegalArgumentException("Unknown Tier: " + Tier);
        };
    }

    public static BlockEntityType.BlockEntitySupplier<GlowstoneGeneratorTile> makeSupplier(int Tier) {
        return switch(Tier) {
            case 1 -> (pos, state) -> new GlowstoneGeneratorTile(Config.tier1, ModBE.GLOWSTONE_T1_BE.get(), pos, state);
            case 2 -> (pos, state) -> new GlowstoneGeneratorTile(Config.tier2, ModBE.GLOWSTONE_T2_BE.get(), pos, state);
            case 3 -> (pos, state) -> new GlowstoneGeneratorTile(Config.tier3, ModBE.GLOWSTONE_T3_BE.get(), pos, state);
            case 4 -> (pos, state) -> new GlowstoneGeneratorTile(Config.tier4, ModBE.GLOWSTONE_T4_BE.get(), pos, state);
            case 5 -> (pos, state) -> new GlowstoneGeneratorTile(Config.tier5, ModBE.GLOWSTONE_T5_BE.get(), pos, state);
            default -> throw new IllegalArgumentException("Unknown Tier: " + Tier);
        };
    }

}
