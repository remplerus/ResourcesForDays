package com.rempler.rfd.datagen;

import com.rempler.rfd.ResourcesForDays;
import com.rempler.rfd.setup.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.ModList;

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
        createGenModels(ModBlocks.CLAY_GEN_T1.get(),mcLoc(blockLoc + Blocks.CLAY.getRegistryName().getPath()), stillWater, tier1);
        createGenModels(ModBlocks.CLAY_GEN_T2.get(),mcLoc(blockLoc + Blocks.CLAY.getRegistryName().getPath()), stillWater, tier2);
        createGenModels(ModBlocks.CLAY_GEN_T3.get(),mcLoc(blockLoc + Blocks.CLAY.getRegistryName().getPath()), stillWater, tier3);
        createGenModels(ModBlocks.CLAY_GEN_T4.get(),mcLoc(blockLoc + Blocks.CLAY.getRegistryName().getPath()), stillWater, tier4);
        createGenModels(ModBlocks.CLAY_GEN_T5.get(),mcLoc(blockLoc + Blocks.CLAY.getRegistryName().getPath()), stillWater, tier5);
        createGenModels(ModBlocks.CLEAN_GEN_T1.get(),mcLoc(blockLoc + Blocks.STONE.getRegistryName().getPath()), tier1);
        createGenModels(ModBlocks.CLEAN_GEN_T2.get(),mcLoc(blockLoc + Blocks.STONE.getRegistryName().getPath()), tier2);
        createGenModels(ModBlocks.CLEAN_GEN_T3.get(),mcLoc(blockLoc + Blocks.STONE.getRegistryName().getPath()), tier3);
        createGenModels(ModBlocks.CLEAN_GEN_T4.get(),mcLoc(blockLoc + Blocks.STONE.getRegistryName().getPath()), tier4);
        createGenModels(ModBlocks.CLEAN_GEN_T5.get(),mcLoc(blockLoc + Blocks.STONE.getRegistryName().getPath()), tier5);
        //createGenModels(ModBlocks.COBBLE_GEN_T1.get(),mcLoc(blockLoc + Blocks.COBBLESTONE.getRegistryName().getPath()), tier1);
        //createGenModels(ModBlocks.COBBLE_GEN_T2.get(),mcLoc(blockLoc + Blocks.COBBLESTONE.getRegistryName().getPath()), tier2);
        //createGenModels(ModBlocks.COBBLE_GEN_T3.get(),mcLoc(blockLoc + Blocks.COBBLESTONE.getRegistryName().getPath()), tier3);
        //createGenModels(ModBlocks.COBBLE_GEN_T4.get(),mcLoc(blockLoc + Blocks.COBBLESTONE.getRegistryName().getPath()), tier4);
        //createGenModels(ModBlocks.COBBLE_GEN_T5.get(),mcLoc(blockLoc + Blocks.COBBLESTONE.getRegistryName().getPath()), tier5);
        createGenModels(ModBlocks.DIRT_GEN_T1.get(),mcLoc(blockLoc + Blocks.DIRT.getRegistryName().getPath()), stillWater, tier1);
        createGenModels(ModBlocks.DIRT_GEN_T2.get(),mcLoc(blockLoc + Blocks.DIRT.getRegistryName().getPath()), stillWater, tier2);
        createGenModels(ModBlocks.DIRT_GEN_T3.get(),mcLoc(blockLoc + Blocks.DIRT.getRegistryName().getPath()), stillWater, tier3);
        createGenModels(ModBlocks.DIRT_GEN_T4.get(),mcLoc(blockLoc + Blocks.DIRT.getRegistryName().getPath()), stillWater, tier4);
        createGenModels(ModBlocks.DIRT_GEN_T5.get(),mcLoc(blockLoc + Blocks.DIRT.getRegistryName().getPath()), stillWater, tier5);
        createGenModels(ModBlocks.DYE_GEN_T1.get(),mcLoc(blockLoc + Blocks.WHITE_WOOL.getRegistryName().getPath()), stillWater, tier1);
        createGenModels(ModBlocks.DYE_GEN_T2.get(),mcLoc(blockLoc + Blocks.WHITE_WOOL.getRegistryName().getPath()), stillWater, tier2);
        createGenModels(ModBlocks.DYE_GEN_T3.get(),mcLoc(blockLoc + Blocks.WHITE_WOOL.getRegistryName().getPath()), stillWater, tier3);
        createGenModels(ModBlocks.DYE_GEN_T4.get(),mcLoc(blockLoc + Blocks.WHITE_WOOL.getRegistryName().getPath()), stillWater, tier4);
        createGenModels(ModBlocks.DYE_GEN_T5.get(),mcLoc(blockLoc + Blocks.WHITE_WOOL.getRegistryName().getPath()), stillWater, tier5);
        createGenModels(ModBlocks.END_GEN_T1.get(),mcLoc(blockLoc + Blocks.END_STONE.getRegistryName().getPath()), stillLava, tier1);
        createGenModels(ModBlocks.END_GEN_T2.get(),mcLoc(blockLoc + Blocks.END_STONE.getRegistryName().getPath()), stillLava, tier2);
        createGenModels(ModBlocks.END_GEN_T3.get(),mcLoc(blockLoc + Blocks.END_STONE.getRegistryName().getPath()), stillLava, tier3);
        createGenModels(ModBlocks.END_GEN_T4.get(),mcLoc(blockLoc + Blocks.END_STONE.getRegistryName().getPath()), stillLava, tier4);
        createGenModels(ModBlocks.END_GEN_T5.get(),mcLoc(blockLoc + Blocks.END_STONE.getRegistryName().getPath()), stillLava, tier5);
        createGenModels(ModBlocks.GLOWSTONE_GEN_T1.get(),mcLoc(blockLoc + Blocks.GLOWSTONE.getRegistryName().getPath()), stillLava, tier1);
        createGenModels(ModBlocks.GLOWSTONE_GEN_T2.get(),mcLoc(blockLoc + Blocks.GLOWSTONE.getRegistryName().getPath()), stillLava, tier2);
        createGenModels(ModBlocks.GLOWSTONE_GEN_T3.get(),mcLoc(blockLoc + Blocks.GLOWSTONE.getRegistryName().getPath()), stillLava, tier3);
        createGenModels(ModBlocks.GLOWSTONE_GEN_T4.get(),mcLoc(blockLoc + Blocks.GLOWSTONE.getRegistryName().getPath()), stillLava, tier4);
        createGenModels(ModBlocks.GLOWSTONE_GEN_T5.get(),mcLoc(blockLoc + Blocks.GLOWSTONE.getRegistryName().getPath()), stillLava, tier5);
        createGenModels(ModBlocks.GRAVEL_GEN_T1.get(),mcLoc(blockLoc + Blocks.GRAVEL.getRegistryName().getPath()), tier1);
        createGenModels(ModBlocks.GRAVEL_GEN_T2.get(),mcLoc(blockLoc + Blocks.GRAVEL.getRegistryName().getPath()), tier2);
        createGenModels(ModBlocks.GRAVEL_GEN_T3.get(),mcLoc(blockLoc + Blocks.GRAVEL.getRegistryName().getPath()), tier3);
        createGenModels(ModBlocks.GRAVEL_GEN_T4.get(),mcLoc(blockLoc + Blocks.GRAVEL.getRegistryName().getPath()), tier4);
        createGenModels(ModBlocks.GRAVEL_GEN_T5.get(),mcLoc(blockLoc + Blocks.GRAVEL.getRegistryName().getPath()), tier5);
        createGenModels(ModBlocks.ICE_GEN_T1.get(),mcLoc(blockLoc + Blocks.ICE.getRegistryName().getPath()), stillWater, tier1);
        createGenModels(ModBlocks.ICE_GEN_T2.get(),mcLoc(blockLoc + Blocks.ICE.getRegistryName().getPath()), stillWater, tier2);
        createGenModels(ModBlocks.ICE_GEN_T3.get(),mcLoc(blockLoc + Blocks.ICE.getRegistryName().getPath()), stillWater, tier3);
        createGenModels(ModBlocks.ICE_GEN_T4.get(),mcLoc(blockLoc + Blocks.ICE.getRegistryName().getPath()), stillWater, tier4);
        createGenModels(ModBlocks.ICE_GEN_T5.get(),mcLoc(blockLoc + Blocks.ICE.getRegistryName().getPath()), stillWater, tier5);
        createGenModels(ModBlocks.NETHERRACK_GEN_T1.get(),mcLoc(blockLoc + Blocks.NETHERRACK.getRegistryName().getPath()), stillLava, tier1);
        createGenModels(ModBlocks.NETHERRACK_GEN_T2.get(),mcLoc(blockLoc + Blocks.NETHERRACK.getRegistryName().getPath()), stillLava, tier2);
        createGenModels(ModBlocks.NETHERRACK_GEN_T3.get(),mcLoc(blockLoc + Blocks.NETHERRACK.getRegistryName().getPath()), stillLava, tier3);
        createGenModels(ModBlocks.NETHERRACK_GEN_T4.get(),mcLoc(blockLoc + Blocks.NETHERRACK.getRegistryName().getPath()), stillLava, tier4);
        createGenModels(ModBlocks.NETHERRACK_GEN_T5.get(),mcLoc(blockLoc + Blocks.NETHERRACK.getRegistryName().getPath()), stillLava, tier5);
        createGenModels(ModBlocks.OBSIDIAN_GEN_T1.get(),mcLoc(blockLoc + Blocks.OBSIDIAN.getRegistryName().getPath()), tier1);
        createGenModels(ModBlocks.OBSIDIAN_GEN_T2.get(),mcLoc(blockLoc + Blocks.OBSIDIAN.getRegistryName().getPath()), tier2);
        createGenModels(ModBlocks.OBSIDIAN_GEN_T3.get(),mcLoc(blockLoc + Blocks.OBSIDIAN.getRegistryName().getPath()), tier3);
        createGenModels(ModBlocks.OBSIDIAN_GEN_T4.get(),mcLoc(blockLoc + Blocks.OBSIDIAN.getRegistryName().getPath()), tier4);
        createGenModels(ModBlocks.OBSIDIAN_GEN_T5.get(),mcLoc(blockLoc + Blocks.OBSIDIAN.getRegistryName().getPath()), tier5);
        createGenModels(ModBlocks.ORE_GEN_T1.get(),mcLoc(blockLoc + Blocks.DIAMOND_ORE.getRegistryName().getPath()), tier1);
        createGenModels(ModBlocks.ORE_GEN_T2.get(),mcLoc(blockLoc + Blocks.DIAMOND_ORE.getRegistryName().getPath()), tier2);
        createGenModels(ModBlocks.ORE_GEN_T3.get(),mcLoc(blockLoc + Blocks.DIAMOND_ORE.getRegistryName().getPath()), tier3);
        createGenModels(ModBlocks.ORE_GEN_T4.get(),mcLoc(blockLoc + Blocks.DIAMOND_ORE.getRegistryName().getPath()), tier4);
        createGenModels(ModBlocks.ORE_GEN_T5.get(),mcLoc(blockLoc + Blocks.DIAMOND_ORE.getRegistryName().getPath()), tier5);
        createGenModels(ModBlocks.QUARTZ_GEN_T1.get(),mcLoc(blockLoc + Blocks.QUARTZ_BLOCK.getRegistryName().getPath() + "_top"), stillLava, tier1);
        createGenModels(ModBlocks.QUARTZ_GEN_T2.get(),mcLoc(blockLoc + Blocks.QUARTZ_BLOCK.getRegistryName().getPath() + "_top"), stillLava, tier2);
        createGenModels(ModBlocks.QUARTZ_GEN_T3.get(),mcLoc(blockLoc + Blocks.QUARTZ_BLOCK.getRegistryName().getPath() + "_top"), stillLava, tier3);
        createGenModels(ModBlocks.QUARTZ_GEN_T4.get(),mcLoc(blockLoc + Blocks.QUARTZ_BLOCK.getRegistryName().getPath() + "_top"), stillLava, tier4);
        createGenModels(ModBlocks.QUARTZ_GEN_T5.get(),mcLoc(blockLoc + Blocks.QUARTZ_BLOCK.getRegistryName().getPath() + "_top"), stillLava, tier5);
        createGenModels(ModBlocks.REDSTONE_GEN_T1.get(),mcLoc(blockLoc + Blocks.REDSTONE_BLOCK.getRegistryName().getPath()), tier1);
        createGenModels(ModBlocks.REDSTONE_GEN_T2.get(),mcLoc(blockLoc + Blocks.REDSTONE_BLOCK.getRegistryName().getPath()), tier2);
        createGenModels(ModBlocks.REDSTONE_GEN_T3.get(),mcLoc(blockLoc + Blocks.REDSTONE_BLOCK.getRegistryName().getPath()), tier3);
        createGenModels(ModBlocks.REDSTONE_GEN_T4.get(),mcLoc(blockLoc + Blocks.REDSTONE_BLOCK.getRegistryName().getPath()), tier4);
        createGenModels(ModBlocks.REDSTONE_GEN_T5.get(),mcLoc(blockLoc + Blocks.REDSTONE_BLOCK.getRegistryName().getPath()), tier5);
        createGenModels(ModBlocks.SAND_GEN_T1.get(),mcLoc(blockLoc + Blocks.SAND.getRegistryName().getPath()), tier1);
        createGenModels(ModBlocks.SAND_GEN_T2.get(),mcLoc(blockLoc + Blocks.SAND.getRegistryName().getPath()), tier2);
        createGenModels(ModBlocks.SAND_GEN_T3.get(),mcLoc(blockLoc + Blocks.SAND.getRegistryName().getPath()), tier3);
        createGenModels(ModBlocks.SAND_GEN_T4.get(),mcLoc(blockLoc + Blocks.SAND.getRegistryName().getPath()), tier4);
        createGenModels(ModBlocks.SAND_GEN_T5.get(),mcLoc(blockLoc + Blocks.SAND.getRegistryName().getPath()), tier5);
        createGenModels(ModBlocks.SNOW_GEN_T1.get(),mcLoc(blockLoc + Blocks.SNOW.getRegistryName().getPath()), stillWater, tier1);
        createGenModels(ModBlocks.SNOW_GEN_T2.get(),mcLoc(blockLoc + Blocks.SNOW.getRegistryName().getPath()), stillWater, tier2);
        createGenModels(ModBlocks.SNOW_GEN_T3.get(),mcLoc(blockLoc + Blocks.SNOW.getRegistryName().getPath()), stillWater, tier3);
        createGenModels(ModBlocks.SNOW_GEN_T4.get(),mcLoc(blockLoc + Blocks.SNOW.getRegistryName().getPath()), stillWater, tier4);
        createGenModels(ModBlocks.SNOW_GEN_T5.get(),mcLoc(blockLoc + Blocks.SNOW.getRegistryName().getPath()), stillWater, tier5);
        createGenModels(ModBlocks.SOULSAND_GEN_T1.get(),mcLoc(blockLoc + Blocks.SOUL_SAND.getRegistryName().getPath()), stillLava, tier1);
        createGenModels(ModBlocks.SOULSAND_GEN_T2.get(),mcLoc(blockLoc + Blocks.SOUL_SAND.getRegistryName().getPath()), stillLava, tier2);
        createGenModels(ModBlocks.SOULSAND_GEN_T3.get(),mcLoc(blockLoc + Blocks.SOUL_SAND.getRegistryName().getPath()), stillLava, tier3);
        createGenModels(ModBlocks.SOULSAND_GEN_T4.get(),mcLoc(blockLoc + Blocks.SOUL_SAND.getRegistryName().getPath()), stillLava, tier4);
        createGenModels(ModBlocks.SOULSAND_GEN_T5.get(),mcLoc(blockLoc + Blocks.SOUL_SAND.getRegistryName().getPath()), stillLava, tier5);

        String exnihilo = "exnihilosequentia";
        if (ModList.get().isLoaded(exnihilo)) {
            ResourceLocation blockLoc = new ResourceLocation(exnihilo, "block/crushed_end_stone");
            createGenModels(ModBlocks.CRUSHED_ENDSTONE_GEN_T1.get(), blockLoc, tier1);
            createGenModels(ModBlocks.CRUSHED_ENDSTONE_GEN_T2.get(), blockLoc, tier2);
            createGenModels(ModBlocks.CRUSHED_ENDSTONE_GEN_T3.get(), blockLoc, tier3);
            createGenModels(ModBlocks.CRUSHED_ENDSTONE_GEN_T4.get(), blockLoc, tier4);
            createGenModels(ModBlocks.CRUSHED_ENDSTONE_GEN_T5.get(), blockLoc, tier5);
            blockLoc = (new ResourceLocation(exnihilo, "block/crushed_netherrack"));
            createGenModels(ModBlocks.CRUSHED_NETHERRACK_GEN_T1.get(), blockLoc, stillLava, tier1);
            createGenModels(ModBlocks.CRUSHED_NETHERRACK_GEN_T2.get(), blockLoc, stillLava, tier2);
            createGenModels(ModBlocks.CRUSHED_NETHERRACK_GEN_T3.get(), blockLoc, stillLava, tier3);
            createGenModels(ModBlocks.CRUSHED_NETHERRACK_GEN_T4.get(), blockLoc, stillLava, tier4);
            createGenModels(ModBlocks.CRUSHED_NETHERRACK_GEN_T5.get(), blockLoc, stillLava, tier5);
            blockLoc = (new ResourceLocation(exnihilo, "block/dust"));
            createGenModels(ModBlocks.DUST_GEN_T1.get(), blockLoc, tier1);
            createGenModels(ModBlocks.DUST_GEN_T2.get(), blockLoc, tier2);
            createGenModels(ModBlocks.DUST_GEN_T3.get(), blockLoc, tier3);
            createGenModels(ModBlocks.DUST_GEN_T4.get(), blockLoc, tier4);
            createGenModels(ModBlocks.DUST_GEN_T5.get(), blockLoc, tier5);
        }

        ResourceLocation textureBottom = mcLoc(blockLoc + Blocks.DIRT.getRegistryName().getPath());
        String grass = blockLoc + Blocks.GRASS_BLOCK.getRegistryName().getPath();
        String fungus = blockLoc + Blocks.MYCELIUM.getRegistryName().getPath();
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
        createTiers(block, texture, null, tier);
    }

    private void createGenModels(Block block, ResourceLocation texture, ResourceLocation fluid, String tier) {
        createTiers(block, texture, fluid, tier);
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

    private void createTiers(Block block, ResourceLocation texture, ResourceLocation fluid, String tier) {
        ResourceLocation stillLava = modLoc(blockLoc + "lava_still");
        ResourceLocation stillWater = modLoc(blockLoc + "water_still");
        if (fluid != null) {
            if (fluid.equals(stillLava)) {
                stillWater = stillLava;
            } else {
                stillLava = stillWater;
            }
        }
        ConfiguredModel model = createTierModels(block, texture, stillLava, stillWater, tier);
        simpleItem(block, model.model);
    }

    private ConfiguredModel createTierModels(Block block, ResourceLocation texture, ResourceLocation fluida, ResourceLocation fluidb, String tier) {
        return new ConfiguredModel(
                models().withExistingParent(getRegistryName(block), modLoc(blockLoc + tier))
                        .texture("texture_side", texture)
                        .texture("texture_up", texture)
                        .texture("water", fluida)
                        .texture("lava", fluidb)
        );
    }

    private ConfiguredModel createTierModels(Block block, ResourceLocation textureTop, ResourceLocation textureSide, ResourceLocation fluida, ResourceLocation fluidb, String tier) {
        return new ConfiguredModel(
                models().withExistingParent(getRegistryName(block), modLoc(blockLoc + tier))
                        .texture("texture_side", textureSide)
                        .texture("texture_up", textureTop)
                        .texture("water", fluida)
                        .texture("lava", fluidb)
        );
    }

    private void simpleItem(Block block, ModelFile modelFile) {
        simpleBlockItem(block, modelFile);
        simpleBlock(block, modelFile);
    }

    private String getRegistryName(Block b) {
        ResourceLocation resourceLocation = b.getRegistryName();
        if (resourceLocation != null) {
            return b.getRegistryName().toString();
        }
        return null;
    }
}
