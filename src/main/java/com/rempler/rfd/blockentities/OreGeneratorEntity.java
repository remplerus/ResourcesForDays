package com.rempler.rfd.blockentities;

import com.rempler.rfd.setup.Config;
import com.rempler.rfd.setup.ModBE;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.common.Tags;

import java.util.HashMap;

public class OreGeneratorEntity extends BaseRandomGeneratorEntity {
    public OreGeneratorEntity(Config.Tiers tiers, BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(tiers, type, pos, state);
    }

    public void tickServer() {
        if (this.rndItems.isEmpty() || this.rndProbs.isEmpty()) {
            int key = 1;

            for (String oreGeneratorItem : Config.ORE_GENERATOR_ITEMS.get()) {
                if (oreGeneratorItem == null || oreGeneratorItem.trim().isEmpty()) {
                    continue;
                }

                String[] itemParts = oreGeneratorItem.split("[*]");
                String itemName = itemParts[0];
                double probability = 0.0;

                if (itemParts.length == 2) {
                    try {
                        probability = Double.parseDouble(itemParts[1]);
                        probability = Math.min(1, probability);
                        probability = Math.max(0, probability);
                    }
                    catch (NumberFormatException ex) {
                        probability = 0.0;
                    }
                }

                ResourceLocation resourceKey = ResourceLocation.parse(itemName);
                if (BuiltInRegistries.ITEM.containsKey(resourceKey)) {
                    Item item = BuiltInRegistries.ITEM.get(resourceKey);

                    this.rndItems.put(key, item);
                    this.rndProbs.put(key, (int)(probability * 100));
                    key++;
                }
            }
        }
        tickServer(getRandomItem());
    }

    public static OreGeneratorEntity create(int Tier, BlockPos pos, BlockState state) {
        return switch(Tier) {
            case 1 -> new OreGeneratorEntity(Config.tier1, ModBE.ORE_T1_BE.get(), pos, state);
            case 2 -> new OreGeneratorEntity(Config.tier2, ModBE.ORE_T2_BE.get(), pos, state);
            case 3 -> new OreGeneratorEntity(Config.tier3, ModBE.ORE_T3_BE.get(), pos, state);
            case 4 -> new OreGeneratorEntity(Config.tier4, ModBE.ORE_T4_BE.get(), pos, state);
            case 5 -> new OreGeneratorEntity(Config.tier5, ModBE.ORE_T5_BE.get(), pos, state);
            default -> throw new IllegalArgumentException("Unknown Tier: " + Tier);
        };
    }

    public static BlockEntityType.BlockEntitySupplier<OreGeneratorEntity> makeSupplier(int Tier) {
        return switch(Tier) {
            case 1 -> (pos, state) -> new OreGeneratorEntity(Config.tier1, ModBE.ORE_T1_BE.get(), pos, state);
            case 2 -> (pos, state) -> new OreGeneratorEntity(Config.tier2, ModBE.ORE_T2_BE.get(), pos, state);
            case 3 -> (pos, state) -> new OreGeneratorEntity(Config.tier3, ModBE.ORE_T3_BE.get(), pos, state);
            case 4 -> (pos, state) -> new OreGeneratorEntity(Config.tier4, ModBE.ORE_T4_BE.get(), pos, state);
            case 5 -> (pos, state) -> new OreGeneratorEntity(Config.tier5, ModBE.ORE_T5_BE.get(), pos, state);
            default -> throw new IllegalArgumentException("Unknown Tier: " + Tier);
        };
    }
}
