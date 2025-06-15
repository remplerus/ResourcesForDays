package com.rempler.rfd.blockentities;

import com.rempler.rfd.setup.Config;
import com.rempler.rfd.setup.ModBE;
import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.common.Tags;

import java.util.HashMap;

public class DyeGeneratorEntity extends BaseRandomGeneratorEntity {
    
    public DyeGeneratorEntity(Config.Tiers tiers, BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(tiers, type, pos, state);
    }

    public void tickServer() {
        if (this.rndItems.isEmpty() || this.rndProbs.isEmpty()) {
            int key = 1;

            for (HolderSet.Named<Item> itemNamed : BuiltInRegistries.ITEM.getTag(Tags.Items.DYES).stream().toList()) {
                for (var realItem : itemNamed) {
                    Item item = realItem.value();
                    this.rndItems.put(key, item);
                    this.rndProbs.put(key++, (int) (Config.DYE_PROBABILITY.get() * 100));
                }
            }
        }
        tickServer(getRandomItem());
    }

    public static DyeGeneratorEntity create(int Tier, BlockPos pos, BlockState state) {
        return switch(Tier) {
            case 1 -> new DyeGeneratorEntity(Config.tier1, ModBE.DYE_T1_BE.get(), pos, state);
            case 2 -> new DyeGeneratorEntity(Config.tier2, ModBE.DYE_T2_BE.get(), pos, state);
            case 3 -> new DyeGeneratorEntity(Config.tier3, ModBE.DYE_T3_BE.get(), pos, state);
            case 4 -> new DyeGeneratorEntity(Config.tier4, ModBE.DYE_T4_BE.get(), pos, state);
            case 5 -> new DyeGeneratorEntity(Config.tier5, ModBE.DYE_T5_BE.get(), pos, state);
            default -> throw new IllegalArgumentException("Unknown Tier: " + Tier);
        };
    }

    public static BlockEntityType.BlockEntitySupplier<DyeGeneratorEntity> makeSupplier(int Tier) {
        return switch(Tier) {
            case 1 -> (pos, state) -> new DyeGeneratorEntity(Config.tier1, ModBE.DYE_T1_BE.get(), pos, state);
            case 2 -> (pos, state) -> new DyeGeneratorEntity(Config.tier2, ModBE.DYE_T2_BE.get(), pos, state);
            case 3 -> (pos, state) -> new DyeGeneratorEntity(Config.tier3, ModBE.DYE_T3_BE.get(), pos, state);
            case 4 -> (pos, state) -> new DyeGeneratorEntity(Config.tier4, ModBE.DYE_T4_BE.get(), pos, state);
            case 5 -> (pos, state) -> new DyeGeneratorEntity(Config.tier5, ModBE.DYE_T5_BE.get(), pos, state);
            default -> throw new IllegalArgumentException("Unknown Tier: " + Tier);
        };
    }

    public Item getRandomItem() {
        int[] arr = new int[rndProbs.size()];
        int index = 0;

        for (int key = 1; key <= rndProbs.size(); key++) {
            if (rndProbs.containsKey(key)) {
                arr[index] = rndProbs.get(key);
            }
            index++;
        }

        int key = myRand(arr);
        return rndItems.get(key);
    }

}
