package com.rempler.rfd.blockentities;

import com.rempler.rfd.setup.Config;
import com.rempler.rfd.setup.ModBE;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.registries.ForgeRegistries;

public class OreGeneratorTile extends BaseRandomGeneratorTile {
    
    public OreGeneratorTile(Config.Tiers tiers, BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(tiers, type, pos, state);

        int key = 1;

        for (String oreGeneratorItem : Config.ORE_GENERATOR_ITEMS.get()) {
            if (oreGeneratorItem == null || oreGeneratorItem.trim().equals("")) {
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

            ResourceLocation resourceKey = new ResourceLocation(itemName);
            if (ForgeRegistries.ITEMS.containsKey(resourceKey)) {
                Item item = ForgeRegistries.ITEMS.getValue(resourceKey);

                rndItems.put(key, item);
                rndProbs.put(key, (int)(probability * 100));
                key++;
            }
        }

        //if (key == 1) {
        //    rndItems.put(key, Items.COAL_ORE);
        //    rndProbs.put(key++, (int)(0.50 * 100));
//
        //    rndItems.put(key, Items.IRON_ORE);
        //    rndProbs.put(key++, (int)(0.45 * 100));
//
        //    rndItems.put(key, Items.GOLD_ORE);
        //    rndProbs.put(key++, (int)(0.25 * 100));
//
        //    rndItems.put(key, Items.LAPIS_ORE);
        //    rndProbs.put(key++, (int)(0.10 * 100));
//
        //    rndItems.put(key, Items.REDSTONE_ORE);
        //    rndProbs.put(key++, (int)(0.10 * 100));
//
        //    rndItems.put(key, Items.DIAMOND_ORE);
        //    rndProbs.put(key++, (int)(0.05 * 100));
//
        //    rndItems.put(key, Items.EMERALD_ORE);
        //    rndProbs.put(key++, (int)(0.01 * 100));
//
        //    rndItems.put(key, Items.NETHER_QUARTZ_ORE);
        //    rndProbs.put(key++, (int)(0.08 * 100));
        //}
    }

    public void tickServer() {
        tickServer(getRandomItem());
    }

    public static OreGeneratorTile create(int Tier, BlockPos pos, BlockState state) {
        return switch(Tier) {
            case 1 -> new OreGeneratorTile(Config.tier1, ModBE.ORE_T1_BE.get(), pos, state);
            case 2 -> new OreGeneratorTile(Config.tier2, ModBE.ORE_T2_BE.get(), pos, state);
            case 3 -> new OreGeneratorTile(Config.tier3, ModBE.ORE_T3_BE.get(), pos, state);
            case 4 -> new OreGeneratorTile(Config.tier4, ModBE.ORE_T4_BE.get(), pos, state);
            case 5 -> new OreGeneratorTile(Config.tier5, ModBE.ORE_T5_BE.get(), pos, state);
            default -> throw new IllegalArgumentException("Unknown Tier: " + Tier);
        };
    }

    public static BlockEntityType.BlockEntitySupplier<OreGeneratorTile> makeSupplier(int Tier) {
        return switch(Tier) {
            case 1 -> (pos, state) -> new OreGeneratorTile(Config.tier1, ModBE.ORE_T1_BE.get(), pos, state);
            case 2 -> (pos, state) -> new OreGeneratorTile(Config.tier2, ModBE.ORE_T2_BE.get(), pos, state);
            case 3 -> (pos, state) -> new OreGeneratorTile(Config.tier3, ModBE.ORE_T3_BE.get(), pos, state);
            case 4 -> (pos, state) -> new OreGeneratorTile(Config.tier4, ModBE.ORE_T4_BE.get(), pos, state);
            case 5 -> (pos, state) -> new OreGeneratorTile(Config.tier5, ModBE.ORE_T5_BE.get(), pos, state);
            default -> throw new IllegalArgumentException("Unknown Tier: " + Tier);
        };
    }

}
