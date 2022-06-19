package com.rempler.rfd.blockentities;

import com.rempler.rfd.setup.Config;
import com.rempler.rfd.setup.ModBE;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.Tags;
import net.minecraftforge.registries.ForgeRegistries;

public class DyeGeneratorTile extends BaseRandomGeneratorTile {
    
    public DyeGeneratorTile(Config.Tiers tiers, BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(tiers, type, pos, state);

        int key = 1;

        for (Item item : ForgeRegistries.ITEMS.tags().getTag(Tags.Items.DYES).stream().toList()) {
            rndItems.put(key, item);
            rndProbs.put(key++, (int) (0.10 * 100));
        }
    }

    public void tickServer() {
        tickServer(getRandomItem());
    }

    public static DyeGeneratorTile create(int Tier, BlockPos pos, BlockState state) {
        return switch(Tier) {
            case 1 -> new DyeGeneratorTile(Config.tier1, ModBE.DYE_T1_BE.get(), pos, state);
            case 2 -> new DyeGeneratorTile(Config.tier2, ModBE.DYE_T2_BE.get(), pos, state);
            case 3 -> new DyeGeneratorTile(Config.tier3, ModBE.DYE_T3_BE.get(), pos, state);
            case 4 -> new DyeGeneratorTile(Config.tier4, ModBE.DYE_T4_BE.get(), pos, state);
            case 5 -> new DyeGeneratorTile(Config.tier5, ModBE.DYE_T5_BE.get(), pos, state);
            default -> throw new IllegalArgumentException("Unknown Tier: " + Tier);
        };
    }

    public static net.minecraft.world.level.block.entity.BlockEntityType.BlockEntitySupplier<DyeGeneratorTile> makeSupplier(int Tier) {
        return switch(Tier) {
            case 1 -> (pos, state) -> new DyeGeneratorTile(Config.tier1, ModBE.DYE_T1_BE.get(), pos, state);
            case 2 -> (pos, state) -> new DyeGeneratorTile(Config.tier2, ModBE.DYE_T2_BE.get(), pos, state);
            case 3 -> (pos, state) -> new DyeGeneratorTile(Config.tier3, ModBE.DYE_T3_BE.get(), pos, state);
            case 4 -> (pos, state) -> new DyeGeneratorTile(Config.tier4, ModBE.DYE_T4_BE.get(), pos, state);
            case 5 -> (pos, state) -> new DyeGeneratorTile(Config.tier5, ModBE.DYE_T5_BE.get(), pos, state);
            default -> throw new IllegalArgumentException("Unknown Tier: " + Tier);
        };
    }

}
