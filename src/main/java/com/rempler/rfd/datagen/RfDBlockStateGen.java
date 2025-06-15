package com.rempler.rfd.datagen;

import com.rempler.rfd.ResourcesForDays;
import com.rempler.rfd.api.DefaultMaterials;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.fml.ModList;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class RfDBlockStateGen extends BlockStateProvider {
    ResourceLocation stillLava = modLoc(blockLoc + "lava_still");
    ResourceLocation stillWater = modLoc(blockLoc + "water_still");
    private static final String blockLoc = "block/";
    private static final String tier1 = "tier_1";
    private static final String tier2 = "tier_2";
    private static final String tier3 = "tier_3";
    private static final String tier4 = "tier_4";
    private static final String tier5 = "tier_5";
    public RfDBlockStateGen(PackOutput generator, ExistingFileHelper fileHelper) {
        super(generator, ResourcesForDays.MODID, fileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        createGenModels(DefaultMaterials.CLAY_GEN_T1.getBlock(),mcLoc(blockLoc + "clay"), stillWater, tier1);
        createGenModels(DefaultMaterials.CLAY_GEN_T2.getBlock(),mcLoc(blockLoc + "clay"), stillWater, tier2);
        createGenModels(DefaultMaterials.CLAY_GEN_T3.getBlock(),mcLoc(blockLoc + "clay"), stillWater, tier3);
        createGenModels(DefaultMaterials.CLAY_GEN_T4.getBlock(),mcLoc(blockLoc + "clay"), stillWater, tier4);
        createGenModels(DefaultMaterials.CLAY_GEN_T5.getBlock(),mcLoc(blockLoc + "clay"), stillWater, tier5);
        createGenModels(DefaultMaterials.CLEAN_GEN_T1.getBlock(),mcLoc(blockLoc + "stone"), tier1);
        createGenModels(DefaultMaterials.CLEAN_GEN_T2.getBlock(),mcLoc(blockLoc + "stone"), tier2);
        createGenModels(DefaultMaterials.CLEAN_GEN_T3.getBlock(),mcLoc(blockLoc + "stone"), tier3);
        createGenModels(DefaultMaterials.CLEAN_GEN_T4.getBlock(),mcLoc(blockLoc + "stone"), tier4);
        createGenModels(DefaultMaterials.CLEAN_GEN_T5.getBlock(),mcLoc(blockLoc + "stone"), tier5);
        createGenModels(DefaultMaterials.COBBLE_GEN_T1.getBlock(),mcLoc(blockLoc + "cobblestone"), tier1);
        createGenModels(DefaultMaterials.COBBLE_GEN_T2.getBlock(),mcLoc(blockLoc + "cobblestone"), tier2);
        createGenModels(DefaultMaterials.COBBLE_GEN_T3.getBlock(),mcLoc(blockLoc + "cobblestone"), tier3);
        createGenModels(DefaultMaterials.COBBLE_GEN_T4.getBlock(),mcLoc(blockLoc + "cobblestone"), tier4);
        createGenModels(DefaultMaterials.COBBLE_GEN_T5.getBlock(),mcLoc(blockLoc + "cobblestone"), tier5);
        createGenModels(DefaultMaterials.DIRT_GEN_T1.getBlock(),mcLoc(blockLoc + "dirt"), stillWater, tier1);
        createGenModels(DefaultMaterials.DIRT_GEN_T2.getBlock(),mcLoc(blockLoc + "dirt"), stillWater, tier2);
        createGenModels(DefaultMaterials.DIRT_GEN_T3.getBlock(),mcLoc(blockLoc + "dirt"), stillWater, tier3);
        createGenModels(DefaultMaterials.DIRT_GEN_T4.getBlock(),mcLoc(blockLoc + "dirt"), stillWater, tier4);
        createGenModels(DefaultMaterials.DIRT_GEN_T5.getBlock(),mcLoc(blockLoc + "dirt"), stillWater, tier5);
        createGenModels(DefaultMaterials.DYE_GEN_T1.getBlock(),mcLoc(blockLoc + "white_wool"), stillWater, tier1);
        createGenModels(DefaultMaterials.DYE_GEN_T2.getBlock(),mcLoc(blockLoc + "white_wool"), stillWater, tier2);
        createGenModels(DefaultMaterials.DYE_GEN_T3.getBlock(),mcLoc(blockLoc + "white_wool"), stillWater, tier3);
        createGenModels(DefaultMaterials.DYE_GEN_T4.getBlock(),mcLoc(blockLoc + "white_wool"), stillWater, tier4);
        createGenModels(DefaultMaterials.DYE_GEN_T5.getBlock(),mcLoc(blockLoc + "white_wool"), stillWater, tier5);
        createGenModels(DefaultMaterials.END_GEN_T1.getBlock(),mcLoc(blockLoc + "end_stone"), stillLava, tier1);
        createGenModels(DefaultMaterials.END_GEN_T2.getBlock(),mcLoc(blockLoc + "end_stone"), stillLava, tier2);
        createGenModels(DefaultMaterials.END_GEN_T3.getBlock(),mcLoc(blockLoc + "end_stone"), stillLava, tier3);
        createGenModels(DefaultMaterials.END_GEN_T4.getBlock(),mcLoc(blockLoc + "end_stone"), stillLava, tier4);
        createGenModels(DefaultMaterials.END_GEN_T5.getBlock(),mcLoc(blockLoc + "end_stone"), stillLava, tier5);
        createGenModels(DefaultMaterials.GLOWSTONE_GEN_T1.getBlock(),mcLoc(blockLoc + "glowstone"), stillLava, tier1);
        createGenModels(DefaultMaterials.GLOWSTONE_GEN_T2.getBlock(),mcLoc(blockLoc + "glowstone"), stillLava, tier2);
        createGenModels(DefaultMaterials.GLOWSTONE_GEN_T3.getBlock(),mcLoc(blockLoc + "glowstone"), stillLava, tier3);
        createGenModels(DefaultMaterials.GLOWSTONE_GEN_T4.getBlock(),mcLoc(blockLoc + "glowstone"), stillLava, tier4);
        createGenModels(DefaultMaterials.GLOWSTONE_GEN_T5.getBlock(),mcLoc(blockLoc + "glowstone"), stillLava, tier5);
        createGenModels(DefaultMaterials.GRAVEL_GEN_T1.getBlock(),mcLoc(blockLoc + "gravel"), tier1);
        createGenModels(DefaultMaterials.GRAVEL_GEN_T2.getBlock(),mcLoc(blockLoc + "gravel"), tier2);
        createGenModels(DefaultMaterials.GRAVEL_GEN_T3.getBlock(),mcLoc(blockLoc + "gravel"), tier3);
        createGenModels(DefaultMaterials.GRAVEL_GEN_T4.getBlock(),mcLoc(blockLoc + "gravel"), tier4);
        createGenModels(DefaultMaterials.GRAVEL_GEN_T5.getBlock(),mcLoc(blockLoc + "gravel"), tier5);
        createGenModels(DefaultMaterials.ICE_GEN_T1.getBlock(),mcLoc(blockLoc + "ice"), stillWater, tier1);
        createGenModels(DefaultMaterials.ICE_GEN_T2.getBlock(),mcLoc(blockLoc + "ice"), stillWater, tier2);
        createGenModels(DefaultMaterials.ICE_GEN_T3.getBlock(),mcLoc(blockLoc + "ice"), stillWater, tier3);
        createGenModels(DefaultMaterials.ICE_GEN_T4.getBlock(),mcLoc(blockLoc + "ice"), stillWater, tier4);
        createGenModels(DefaultMaterials.ICE_GEN_T5.getBlock(),mcLoc(blockLoc + "ice"), stillWater, tier5);
        createGenModels(DefaultMaterials.NETHERRACK_GEN_T1.getBlock(),mcLoc(blockLoc + "netherrack"), stillLava, tier1);
        createGenModels(DefaultMaterials.NETHERRACK_GEN_T2.getBlock(),mcLoc(blockLoc + "netherrack"), stillLava, tier2);
        createGenModels(DefaultMaterials.NETHERRACK_GEN_T3.getBlock(),mcLoc(blockLoc + "netherrack"), stillLava, tier3);
        createGenModels(DefaultMaterials.NETHERRACK_GEN_T4.getBlock(),mcLoc(blockLoc + "netherrack"), stillLava, tier4);
        createGenModels(DefaultMaterials.NETHERRACK_GEN_T5.getBlock(),mcLoc(blockLoc + "netherrack"), stillLava, tier5);
        createGenModels(DefaultMaterials.OBSIDIAN_GEN_T1.getBlock(),mcLoc(blockLoc + "obsidian"), tier1);
        createGenModels(DefaultMaterials.OBSIDIAN_GEN_T2.getBlock(),mcLoc(blockLoc + "obsidian"), tier2);
        createGenModels(DefaultMaterials.OBSIDIAN_GEN_T3.getBlock(),mcLoc(blockLoc + "obsidian"), tier3);
        createGenModels(DefaultMaterials.OBSIDIAN_GEN_T4.getBlock(),mcLoc(blockLoc + "obsidian"), tier4);
        createGenModels(DefaultMaterials.OBSIDIAN_GEN_T5.getBlock(),mcLoc(blockLoc + "obsidian"), tier5);
        createGenModels(DefaultMaterials.ORE_GEN_T1.getBlock(),mcLoc(blockLoc + "diamond_ore"), tier1);
        createGenModels(DefaultMaterials.ORE_GEN_T2.getBlock(),mcLoc(blockLoc + "diamond_ore"), tier2);
        createGenModels(DefaultMaterials.ORE_GEN_T3.getBlock(),mcLoc(blockLoc + "diamond_ore"), tier3);
        createGenModels(DefaultMaterials.ORE_GEN_T4.getBlock(),mcLoc(blockLoc + "diamond_ore"), tier4);
        createGenModels(DefaultMaterials.ORE_GEN_T5.getBlock(),mcLoc(blockLoc + "diamond_ore"), tier5);
        createGenModels(DefaultMaterials.QUARTZ_GEN_T1.getBlock(),mcLoc(blockLoc + "quartz_block_top"), stillLava, tier1);
        createGenModels(DefaultMaterials.QUARTZ_GEN_T2.getBlock(),mcLoc(blockLoc + "quartz_block_top"), stillLava, tier2);
        createGenModels(DefaultMaterials.QUARTZ_GEN_T3.getBlock(),mcLoc(blockLoc + "quartz_block_top"), stillLava, tier3);
        createGenModels(DefaultMaterials.QUARTZ_GEN_T4.getBlock(),mcLoc(blockLoc + "quartz_block_top"), stillLava, tier4);
        createGenModels(DefaultMaterials.QUARTZ_GEN_T5.getBlock(),mcLoc(blockLoc + "quartz_block_top"), stillLava, tier5);
        createGenModels(DefaultMaterials.REDSTONE_GEN_T1.getBlock(),mcLoc(blockLoc + "redstone_block"), tier1);
        createGenModels(DefaultMaterials.REDSTONE_GEN_T2.getBlock(),mcLoc(blockLoc + "redstone_block"), tier2);
        createGenModels(DefaultMaterials.REDSTONE_GEN_T3.getBlock(),mcLoc(blockLoc + "redstone_block"), tier3);
        createGenModels(DefaultMaterials.REDSTONE_GEN_T4.getBlock(),mcLoc(blockLoc + "redstone_block"), tier4);
        createGenModels(DefaultMaterials.REDSTONE_GEN_T5.getBlock(),mcLoc(blockLoc + "redstone_block"), tier5);
        createGenModels(DefaultMaterials.SAND_GEN_T1.getBlock(),mcLoc(blockLoc + "sand"), tier1);
        createGenModels(DefaultMaterials.SAND_GEN_T2.getBlock(),mcLoc(blockLoc + "sand"), tier2);
        createGenModels(DefaultMaterials.SAND_GEN_T3.getBlock(),mcLoc(blockLoc + "sand"), tier3);
        createGenModels(DefaultMaterials.SAND_GEN_T4.getBlock(),mcLoc(blockLoc + "sand"), tier4);
        createGenModels(DefaultMaterials.SAND_GEN_T5.getBlock(),mcLoc(blockLoc + "sand"), tier5);
        createGenModels(DefaultMaterials.SNOW_GEN_T1.getBlock(),mcLoc(blockLoc + "snow"), stillWater, tier1);
        createGenModels(DefaultMaterials.SNOW_GEN_T2.getBlock(),mcLoc(blockLoc + "snow"), stillWater, tier2);
        createGenModels(DefaultMaterials.SNOW_GEN_T3.getBlock(),mcLoc(blockLoc + "snow"), stillWater, tier3);
        createGenModels(DefaultMaterials.SNOW_GEN_T4.getBlock(),mcLoc(blockLoc + "snow"), stillWater, tier4);
        createGenModels(DefaultMaterials.SNOW_GEN_T5.getBlock(),mcLoc(blockLoc + "snow"), stillWater, tier5);
        createGenModels(DefaultMaterials.SOUL_SAND_GEN_T1.getBlock(),mcLoc(blockLoc + "soul_sand"), stillLava, tier1);
        createGenModels(DefaultMaterials.SOUL_SAND_GEN_T2.getBlock(),mcLoc(blockLoc + "soul_sand"), stillLava, tier2);
        createGenModels(DefaultMaterials.SOUL_SAND_GEN_T3.getBlock(),mcLoc(blockLoc + "soul_sand"), stillLava, tier3);
        createGenModels(DefaultMaterials.SOUL_SAND_GEN_T4.getBlock(),mcLoc(blockLoc + "soul_sand"), stillLava, tier4);
        createGenModels(DefaultMaterials.SOUL_SAND_GEN_T5.getBlock(),mcLoc(blockLoc + "soul_sand"), stillLava, tier5);

        if (ModList.get().isLoaded("exnihilosequentia")) {
            ResourceLocation blockLowc = ResourceLocation.fromNamespaceAndPath("exnihilosequentia", blockLoc + "crushed_end_stone");
            createGenModels(DefaultMaterials.CRUSHED_END_STONE_GEN_T1.getBlock(), blockLowc, tier1);
            createGenModels(DefaultMaterials.CRUSHED_END_STONE_GEN_T2.getBlock(), blockLowc, tier2);
            createGenModels(DefaultMaterials.CRUSHED_END_STONE_GEN_T3.getBlock(), blockLowc, tier3);
            createGenModels(DefaultMaterials.CRUSHED_END_STONE_GEN_T4.getBlock(), blockLowc, tier4);
            createGenModels(DefaultMaterials.CRUSHED_END_STONE_GEN_T5.getBlock(), blockLowc, tier5);
            blockLowc = ResourceLocation.fromNamespaceAndPath("exnihilosequentia", blockLoc + "crushed_netherrack");
            createGenModels(DefaultMaterials.CRUSHED_NETHERRACK_GEN_T1.getBlock(), blockLowc, stillLava, tier1);
            createGenModels(DefaultMaterials.CRUSHED_NETHERRACK_GEN_T2.getBlock(), blockLowc, stillLava, tier2);
            createGenModels(DefaultMaterials.CRUSHED_NETHERRACK_GEN_T3.getBlock(), blockLowc, stillLava, tier3);
            createGenModels(DefaultMaterials.CRUSHED_NETHERRACK_GEN_T4.getBlock(), blockLowc, stillLava, tier4);
            createGenModels(DefaultMaterials.CRUSHED_NETHERRACK_GEN_T5.getBlock(), blockLowc, stillLava, tier5);
            blockLowc = ResourceLocation.fromNamespaceAndPath("exnihilosequentia", blockLoc + "dust");
            createGenModels(DefaultMaterials.DUST_GEN_T1.getBlock(), blockLowc, tier1);
            createGenModels(DefaultMaterials.DUST_GEN_T2.getBlock(), blockLowc, tier2);
            createGenModels(DefaultMaterials.DUST_GEN_T3.getBlock(), blockLowc, tier3);
            createGenModels(DefaultMaterials.DUST_GEN_T4.getBlock(), blockLowc, tier4);
            createGenModels(DefaultMaterials.DUST_GEN_T5.getBlock(), blockLowc, tier5);
        }

        String grass = blockLoc + "grass_block";
        String fungus = blockLoc + "mycelium";
        createGenModels(DefaultMaterials.GRASS_GEN_T1.getBlock(),modLoc(grass + "_top"),newMCLoc(grass, "side"), stillWater, tier1);
        createGenModels(DefaultMaterials.GRASS_GEN_T2.getBlock(),modLoc(grass + "_top"),newMCLoc(grass, "side"), stillWater, tier2);
        createGenModels(DefaultMaterials.GRASS_GEN_T3.getBlock(),modLoc(grass + "_top"),newMCLoc(grass, "side"), stillWater, tier3);
        createGenModels(DefaultMaterials.GRASS_GEN_T4.getBlock(),modLoc(grass + "_top"),newMCLoc(grass, "side"), stillWater, tier4);
        createGenModels(DefaultMaterials.GRASS_GEN_T5.getBlock(),modLoc(grass + "_top"),newMCLoc(grass, "side"), stillWater, tier5);
        createGenModels(DefaultMaterials.MYCELIUM_GEN_T1.getBlock(),newMCLoc(fungus, "top"),newMCLoc(fungus, "side"), stillWater, tier1);
        createGenModels(DefaultMaterials.MYCELIUM_GEN_T2.getBlock(),newMCLoc(fungus, "top"),newMCLoc(fungus, "side"), stillWater, tier2);
        createGenModels(DefaultMaterials.MYCELIUM_GEN_T3.getBlock(),newMCLoc(fungus, "top"),newMCLoc(fungus, "side"), stillWater, tier3);
        createGenModels(DefaultMaterials.MYCELIUM_GEN_T4.getBlock(),newMCLoc(fungus, "top"),newMCLoc(fungus, "side"), stillWater, tier4);
        createGenModels(DefaultMaterials.MYCELIUM_GEN_T5.getBlock(),newMCLoc(fungus, "top"),newMCLoc(fungus, "side"), stillWater, tier5);
    }

    private ResourceLocation newMCLoc(String block, String side) {
        return ResourceLocation.fromNamespaceAndPath("minecraft", block + "_" + side);
    }

    private void createGenModels(Block block, ResourceLocation texture, String tier) {
        createGenModels(block, texture, texture, null, tier);
    }

    private void createGenModels(Block block, ResourceLocation texture, ResourceLocation fluid, String tier) {
        createGenModels(block, texture, texture, fluid, tier);
    }

    private void createGenModels(Block block, ResourceLocation textureTop, ResourceLocation textureSide, ResourceLocation fluid, String tier) {
        ResourceLocation stillLava = modLoc(blockLoc + "lava_still");
        ResourceLocation stillWater = modLoc(blockLoc + "water_still");
        if (fluid != null) {
            if (fluid == stillLava) {
                stillWater = stillLava;
            } else {
                stillLava = stillWater;
            }
        }
        ConfiguredModel model = createTierModels(block, textureTop, textureSide, stillLava, stillWater, tier);
        simpleItem(block, model.model);
    }

    private ConfiguredModel createTierModels(Block block, ResourceLocation textureTop, ResourceLocation textureSide, ResourceLocation fluida, ResourceLocation fluidb, String tier) {
        return new ConfiguredModel(
                models().withExistingParent(getRegistryName(block), modLoc(blockLoc + tier))
                        .texture("texture_side", textureSide)
                        .texture("texture_up", textureTop)
                        .texture("water", fluida)
                        .texture("lava", fluidb)
                        .renderType("cutout")
        );
    }

    private void simpleItem(Block block, ModelFile modelFile) {
        simpleBlockItem(block, modelFile);
        simpleBlock(block, modelFile);
    }

    private String getRegistryName(Block b) {
        return BuiltInRegistries.BLOCK.getKey(b).getPath();
    }
}
