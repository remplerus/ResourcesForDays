package com.rempler.rfd.datagen;

import com.rempler.rfd.ResourcesForDays;
import com.rempler.rfd.setup.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.ForgeRegistries;

public class RfDBlockStateGen extends BlockStateProvider {
    ResourceLocation stillLava = modLoc(blockLoc + "lava_still");
    ResourceLocation stillWater = modLoc(blockLoc + "water_still");
    private static final String blockLoc = "block/";
    private static final String tier1 = "tier_1";
    private static final String tier2 = "tier_2";
    private static final String tier3 = "tier_3";
    private static final String tier4 = "tier_4";
    private static final String tier5 = "tier_5";
    public RfDBlockStateGen(DataGenerator generator, ExistingFileHelper fileHelper) {
        super(generator, ResourcesForDays.MODID, fileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        createGenModels(ModBlocks.CLAY_GEN_T1.get(),mcLoc(blockLoc + "clay"), stillWater, tier1);
        createGenModels(ModBlocks.CLAY_GEN_T2.get(),mcLoc(blockLoc + "clay"), stillWater, tier2);
        createGenModels(ModBlocks.CLAY_GEN_T3.get(),mcLoc(blockLoc + "clay"), stillWater, tier3);
        createGenModels(ModBlocks.CLAY_GEN_T4.get(),mcLoc(blockLoc + "clay"), stillWater, tier4);
        createGenModels(ModBlocks.CLAY_GEN_T5.get(),mcLoc(blockLoc + "clay"), stillWater, tier5);
        createGenModels(ModBlocks.CLEAN_GEN_T1.get(),mcLoc(blockLoc + "stone"), tier1);
        createGenModels(ModBlocks.CLEAN_GEN_T2.get(),mcLoc(blockLoc + "stone"), tier2);
        createGenModels(ModBlocks.CLEAN_GEN_T3.get(),mcLoc(blockLoc + "stone"), tier3);
        createGenModels(ModBlocks.CLEAN_GEN_T4.get(),mcLoc(blockLoc + "stone"), tier4);
        createGenModels(ModBlocks.CLEAN_GEN_T5.get(),mcLoc(blockLoc + "stone"), tier5);
        //createGenModels(ModBlocks.COBBLE_GEN_T1.get(),mcLoc(blockLoc + Blocks.COBBLESTONE.getName().getString()), tier1);
        //createGenModels(ModBlocks.COBBLE_GEN_T2.get(),mcLoc(blockLoc + Blocks.COBBLESTONE.getName().getString()), tier2);
        //createGenModels(ModBlocks.COBBLE_GEN_T3.get(),mcLoc(blockLoc + Blocks.COBBLESTONE.getName().getString()), tier3);
        //createGenModels(ModBlocks.COBBLE_GEN_T4.get(),mcLoc(blockLoc + Blocks.COBBLESTONE.getName().getString()), tier4);
        //createGenModels(ModBlocks.COBBLE_GEN_T5.get(),mcLoc(blockLoc + Blocks.COBBLESTONE.getName().getString()), tier5);
        createGenModels(ModBlocks.DIRT_GEN_T1.get(),mcLoc(blockLoc + "dirt"), stillWater, tier1);
        createGenModels(ModBlocks.DIRT_GEN_T2.get(),mcLoc(blockLoc + "dirt"), stillWater, tier2);
        createGenModels(ModBlocks.DIRT_GEN_T3.get(),mcLoc(blockLoc + "dirt"), stillWater, tier3);
        createGenModels(ModBlocks.DIRT_GEN_T4.get(),mcLoc(blockLoc + "dirt"), stillWater, tier4);
        createGenModels(ModBlocks.DIRT_GEN_T5.get(),mcLoc(blockLoc + "dirt"), stillWater, tier5);
        createGenModels(ModBlocks.DYE_GEN_T1.get(),mcLoc(blockLoc + "white_wool"), stillWater, tier1);
        createGenModels(ModBlocks.DYE_GEN_T2.get(),mcLoc(blockLoc + "white_wool"), stillWater, tier2);
        createGenModels(ModBlocks.DYE_GEN_T3.get(),mcLoc(blockLoc + "white_wool"), stillWater, tier3);
        createGenModels(ModBlocks.DYE_GEN_T4.get(),mcLoc(blockLoc + "white_wool"), stillWater, tier4);
        createGenModels(ModBlocks.DYE_GEN_T5.get(),mcLoc(blockLoc + "white_wool"), stillWater, tier5);
        createGenModels(ModBlocks.END_GEN_T1.get(),mcLoc(blockLoc + "end_stone"), stillLava, tier1);
        createGenModels(ModBlocks.END_GEN_T2.get(),mcLoc(blockLoc + "end_stone"), stillLava, tier2);
        createGenModels(ModBlocks.END_GEN_T3.get(),mcLoc(blockLoc + "end_stone"), stillLava, tier3);
        createGenModels(ModBlocks.END_GEN_T4.get(),mcLoc(blockLoc + "end_stone"), stillLava, tier4);
        createGenModels(ModBlocks.END_GEN_T5.get(),mcLoc(blockLoc + "end_stone"), stillLava, tier5);
        createGenModels(ModBlocks.GLOWSTONE_GEN_T1.get(),mcLoc(blockLoc + "glowstone"), stillLava, tier1);
        createGenModels(ModBlocks.GLOWSTONE_GEN_T2.get(),mcLoc(blockLoc + "glowstone"), stillLava, tier2);
        createGenModels(ModBlocks.GLOWSTONE_GEN_T3.get(),mcLoc(blockLoc + "glowstone"), stillLava, tier3);
        createGenModels(ModBlocks.GLOWSTONE_GEN_T4.get(),mcLoc(blockLoc + "glowstone"), stillLava, tier4);
        createGenModels(ModBlocks.GLOWSTONE_GEN_T5.get(),mcLoc(blockLoc + "glowstone"), stillLava, tier5);
        createGenModels(ModBlocks.GRAVEL_GEN_T1.get(),mcLoc(blockLoc + "gravel"), tier1);
        createGenModels(ModBlocks.GRAVEL_GEN_T2.get(),mcLoc(blockLoc + "gravel"), tier2);
        createGenModels(ModBlocks.GRAVEL_GEN_T3.get(),mcLoc(blockLoc + "gravel"), tier3);
        createGenModels(ModBlocks.GRAVEL_GEN_T4.get(),mcLoc(blockLoc + "gravel"), tier4);
        createGenModels(ModBlocks.GRAVEL_GEN_T5.get(),mcLoc(blockLoc + "gravel"), tier5);
        createGenModels(ModBlocks.ICE_GEN_T1.get(),mcLoc(blockLoc + "ice"), stillWater, tier1);
        createGenModels(ModBlocks.ICE_GEN_T2.get(),mcLoc(blockLoc + "ice"), stillWater, tier2);
        createGenModels(ModBlocks.ICE_GEN_T3.get(),mcLoc(blockLoc + "ice"), stillWater, tier3);
        createGenModels(ModBlocks.ICE_GEN_T4.get(),mcLoc(blockLoc + "ice"), stillWater, tier4);
        createGenModels(ModBlocks.ICE_GEN_T5.get(),mcLoc(blockLoc + "ice"), stillWater, tier5);
        createGenModels(ModBlocks.NETHERRACK_GEN_T1.get(),mcLoc(blockLoc + "netherrack"), stillLava, tier1);
        createGenModels(ModBlocks.NETHERRACK_GEN_T2.get(),mcLoc(blockLoc + "netherrack"), stillLava, tier2);
        createGenModels(ModBlocks.NETHERRACK_GEN_T3.get(),mcLoc(blockLoc + "netherrack"), stillLava, tier3);
        createGenModels(ModBlocks.NETHERRACK_GEN_T4.get(),mcLoc(blockLoc + "netherrack"), stillLava, tier4);
        createGenModels(ModBlocks.NETHERRACK_GEN_T5.get(),mcLoc(blockLoc + "netherrack"), stillLava, tier5);
        createGenModels(ModBlocks.OBSIDIAN_GEN_T1.get(),mcLoc(blockLoc + "obsidian"), tier1);
        createGenModels(ModBlocks.OBSIDIAN_GEN_T2.get(),mcLoc(blockLoc + "obsidian"), tier2);
        createGenModels(ModBlocks.OBSIDIAN_GEN_T3.get(),mcLoc(blockLoc + "obsidian"), tier3);
        createGenModels(ModBlocks.OBSIDIAN_GEN_T4.get(),mcLoc(blockLoc + "obsidian"), tier4);
        createGenModels(ModBlocks.OBSIDIAN_GEN_T5.get(),mcLoc(blockLoc + "obsidian"), tier5);
        createGenModels(ModBlocks.ORE_GEN_T1.get(),mcLoc(blockLoc + "diamond_ore"), tier1);
        createGenModels(ModBlocks.ORE_GEN_T2.get(),mcLoc(blockLoc + "diamond_ore"), tier2);
        createGenModels(ModBlocks.ORE_GEN_T3.get(),mcLoc(blockLoc + "diamond_ore"), tier3);
        createGenModels(ModBlocks.ORE_GEN_T4.get(),mcLoc(blockLoc + "diamond_ore"), tier4);
        createGenModels(ModBlocks.ORE_GEN_T5.get(),mcLoc(blockLoc + "diamond_ore"), tier5);
        createGenModels(ModBlocks.QUARTZ_GEN_T1.get(),mcLoc(blockLoc + "quartz_block_top"), stillLava, tier1);
        createGenModels(ModBlocks.QUARTZ_GEN_T2.get(),mcLoc(blockLoc + "quartz_block_top"), stillLava, tier2);
        createGenModels(ModBlocks.QUARTZ_GEN_T3.get(),mcLoc(blockLoc + "quartz_block_top"), stillLava, tier3);
        createGenModels(ModBlocks.QUARTZ_GEN_T4.get(),mcLoc(blockLoc + "quartz_block_top"), stillLava, tier4);
        createGenModels(ModBlocks.QUARTZ_GEN_T5.get(),mcLoc(blockLoc + "quartz_block_top"), stillLava, tier5);
        createGenModels(ModBlocks.REDSTONE_GEN_T1.get(),mcLoc(blockLoc + "redstone_block"), tier1);
        createGenModels(ModBlocks.REDSTONE_GEN_T2.get(),mcLoc(blockLoc + "redstone_block"), tier2);
        createGenModels(ModBlocks.REDSTONE_GEN_T3.get(),mcLoc(blockLoc + "redstone_block"), tier3);
        createGenModels(ModBlocks.REDSTONE_GEN_T4.get(),mcLoc(blockLoc + "redstone_block"), tier4);
        createGenModels(ModBlocks.REDSTONE_GEN_T5.get(),mcLoc(blockLoc + "redstone_block"), tier5);
        createGenModels(ModBlocks.SAND_GEN_T1.get(),mcLoc(blockLoc + "sand"), tier1);
        createGenModels(ModBlocks.SAND_GEN_T2.get(),mcLoc(blockLoc + "sand"), tier2);
        createGenModels(ModBlocks.SAND_GEN_T3.get(),mcLoc(blockLoc + "sand"), tier3);
        createGenModels(ModBlocks.SAND_GEN_T4.get(),mcLoc(blockLoc + "sand"), tier4);
        createGenModels(ModBlocks.SAND_GEN_T5.get(),mcLoc(blockLoc + "sand"), tier5);
        createGenModels(ModBlocks.SNOW_GEN_T1.get(),mcLoc(blockLoc + "snow"), stillWater, tier1);
        createGenModels(ModBlocks.SNOW_GEN_T2.get(),mcLoc(blockLoc + "snow"), stillWater, tier2);
        createGenModels(ModBlocks.SNOW_GEN_T3.get(),mcLoc(blockLoc + "snow"), stillWater, tier3);
        createGenModels(ModBlocks.SNOW_GEN_T4.get(),mcLoc(blockLoc + "snow"), stillWater, tier4);
        createGenModels(ModBlocks.SNOW_GEN_T5.get(),mcLoc(blockLoc + "snow"), stillWater, tier5);
        createGenModels(ModBlocks.SOULSAND_GEN_T1.get(),mcLoc(blockLoc + "soul_sand"), stillLava, tier1);
        createGenModels(ModBlocks.SOULSAND_GEN_T2.get(),mcLoc(blockLoc + "soul_sand"), stillLava, tier2);
        createGenModels(ModBlocks.SOULSAND_GEN_T3.get(),mcLoc(blockLoc + "soul_sand"), stillLava, tier3);
        createGenModels(ModBlocks.SOULSAND_GEN_T4.get(),mcLoc(blockLoc + "soul_sand"), stillLava, tier4);
        createGenModels(ModBlocks.SOULSAND_GEN_T5.get(),mcLoc(blockLoc + "soul_sand"), stillLava, tier5);

        String exnihilo = "exnihilosequentia";
        if (ModList.get().isLoaded(exnihilo)) {
            ResourceLocation blockLowc = new ResourceLocation(exnihilo, blockLoc + "crushed_end_stone");
            createGenModels(ModBlocks.CRUSHED_ENDSTONE_GEN_T1.get(), blockLowc, tier1);
            createGenModels(ModBlocks.CRUSHED_ENDSTONE_GEN_T2.get(), blockLowc, tier2);
            createGenModels(ModBlocks.CRUSHED_ENDSTONE_GEN_T3.get(), blockLowc, tier3);
            createGenModels(ModBlocks.CRUSHED_ENDSTONE_GEN_T4.get(), blockLowc, tier4);
            createGenModels(ModBlocks.CRUSHED_ENDSTONE_GEN_T5.get(), blockLowc, tier5);
            blockLowc = (new ResourceLocation(exnihilo, blockLoc + "crushed_netherrack"));
            createGenModels(ModBlocks.CRUSHED_NETHERRACK_GEN_T1.get(), blockLowc, stillLava, tier1);
            createGenModels(ModBlocks.CRUSHED_NETHERRACK_GEN_T2.get(), blockLowc, stillLava, tier2);
            createGenModels(ModBlocks.CRUSHED_NETHERRACK_GEN_T3.get(), blockLowc, stillLava, tier3);
            createGenModels(ModBlocks.CRUSHED_NETHERRACK_GEN_T4.get(), blockLowc, stillLava, tier4);
            createGenModels(ModBlocks.CRUSHED_NETHERRACK_GEN_T5.get(), blockLowc, stillLava, tier5);
            blockLowc = (new ResourceLocation(exnihilo, blockLoc + "dust"));
            createGenModels(ModBlocks.DUST_GEN_T1.get(), blockLowc, tier1);
            createGenModels(ModBlocks.DUST_GEN_T2.get(), blockLowc, tier2);
            createGenModels(ModBlocks.DUST_GEN_T3.get(), blockLowc, tier3);
            createGenModels(ModBlocks.DUST_GEN_T4.get(), blockLowc, tier4);
            createGenModels(ModBlocks.DUST_GEN_T5.get(), blockLowc, tier5);
        }

        String grass = blockLoc + "grass_block";
        String fungus = blockLoc + "mycelium";
        createGenModels(ModBlocks.GRASS_GEN_T1.get(),modLoc(grass + "_top"),newMCLoc(grass, "side"), stillWater, tier1);
        createGenModels(ModBlocks.GRASS_GEN_T2.get(),modLoc(grass + "_top"),newMCLoc(grass, "side"), stillWater, tier2);
        createGenModels(ModBlocks.GRASS_GEN_T3.get(),modLoc(grass + "_top"),newMCLoc(grass, "side"), stillWater, tier3);
        createGenModels(ModBlocks.GRASS_GEN_T4.get(),modLoc(grass + "_top"),newMCLoc(grass, "side"), stillWater, tier4);
        createGenModels(ModBlocks.GRASS_GEN_T5.get(),modLoc(grass + "_top"),newMCLoc(grass, "side"), stillWater, tier5);
        createGenModels(ModBlocks.FUNGUS_GEN_T1.get(),newMCLoc(fungus, "top"),newMCLoc(fungus, "side"), stillWater, tier1);
        createGenModels(ModBlocks.FUNGUS_GEN_T2.get(),newMCLoc(fungus, "top"),newMCLoc(fungus, "side"), stillWater, tier2);
        createGenModels(ModBlocks.FUNGUS_GEN_T3.get(),newMCLoc(fungus, "top"),newMCLoc(fungus, "side"), stillWater, tier3);
        createGenModels(ModBlocks.FUNGUS_GEN_T4.get(),newMCLoc(fungus, "top"),newMCLoc(fungus, "side"), stillWater, tier4);
        createGenModels(ModBlocks.FUNGUS_GEN_T5.get(),newMCLoc(fungus, "top"),newMCLoc(fungus, "side"), stillWater, tier5);
    }

    private ResourceLocation newMCLoc(String block, String side) {
        return new ResourceLocation(block + "_" + side);
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
        return ForgeRegistries.BLOCKS.getKey(b).getPath();
    }
}
