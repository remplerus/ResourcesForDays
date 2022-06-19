package com.rempler.rfd.setup;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.registries.ForgeRegistries;

public class ClientSetup {
    public static void setupClient(final FMLClientSetupEvent ignored) {
        // the following is required to help with the glass transparency
        //ItemBlockRenderTypes.setRenderLayer(ModBlocks.COBBLE_GEN_T1.get(), RenderType.cutout());
        //ItemBlockRenderTypes.setRenderLayer(ModBlocks.COBBLE_GEN_T2.get(), RenderType.cutout());
        //ItemBlockRenderTypes.setRenderLayer(ModBlocks.COBBLE_GEN_T3.get(), RenderType.cutout());
        //ItemBlockRenderTypes.setRenderLayer(ModBlocks.COBBLE_GEN_T4.get(), RenderType.cutout());
        //ItemBlockRenderTypes.setRenderLayer(ModBlocks.COBBLE_GEN_T5.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CLEAN_GEN_T1.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CLEAN_GEN_T2.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CLEAN_GEN_T3.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CLEAN_GEN_T4.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CLEAN_GEN_T5.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CLAY_GEN_T1.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CLAY_GEN_T2.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CLAY_GEN_T3.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CLAY_GEN_T4.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CLAY_GEN_T5.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DIRT_GEN_T1.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DIRT_GEN_T2.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DIRT_GEN_T3.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DIRT_GEN_T4.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DIRT_GEN_T5.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.END_GEN_T1.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.END_GEN_T2.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.END_GEN_T3.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.END_GEN_T4.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.END_GEN_T5.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.FUNGUS_GEN_T1.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.FUNGUS_GEN_T2.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.FUNGUS_GEN_T3.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.FUNGUS_GEN_T4.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.FUNGUS_GEN_T5.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GLOWSTONE_GEN_T1.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GLOWSTONE_GEN_T2.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GLOWSTONE_GEN_T3.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GLOWSTONE_GEN_T4.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GLOWSTONE_GEN_T5.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRASS_GEN_T1.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRASS_GEN_T2.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRASS_GEN_T3.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRASS_GEN_T4.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRASS_GEN_T5.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRAVEL_GEN_T1.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRAVEL_GEN_T2.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRAVEL_GEN_T3.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRAVEL_GEN_T4.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRAVEL_GEN_T5.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ICE_GEN_T1.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ICE_GEN_T2.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ICE_GEN_T3.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ICE_GEN_T4.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ICE_GEN_T5.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.NETHERRACK_GEN_T1.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.NETHERRACK_GEN_T2.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.NETHERRACK_GEN_T3.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.NETHERRACK_GEN_T4.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.NETHERRACK_GEN_T5.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.OBSIDIAN_GEN_T1.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.OBSIDIAN_GEN_T2.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.OBSIDIAN_GEN_T3.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.OBSIDIAN_GEN_T4.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.OBSIDIAN_GEN_T5.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.QUARTZ_GEN_T1.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.QUARTZ_GEN_T2.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.QUARTZ_GEN_T3.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.QUARTZ_GEN_T4.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.QUARTZ_GEN_T5.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.REDSTONE_GEN_T1.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.REDSTONE_GEN_T2.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.REDSTONE_GEN_T3.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.REDSTONE_GEN_T4.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.REDSTONE_GEN_T5.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SAND_GEN_T1.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SAND_GEN_T2.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SAND_GEN_T3.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SAND_GEN_T4.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SAND_GEN_T5.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SNOW_GEN_T1.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SNOW_GEN_T2.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SNOW_GEN_T3.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SNOW_GEN_T4.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SNOW_GEN_T5.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SOULSAND_GEN_T1.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SOULSAND_GEN_T2.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SOULSAND_GEN_T3.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SOULSAND_GEN_T4.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SOULSAND_GEN_T5.get(), RenderType.cutout());

        if (Config.ENABLE_ORE_GENERATOR.get()) {
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.ORE_GEN_T1.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.ORE_GEN_T2.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.ORE_GEN_T3.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.ORE_GEN_T4.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.ORE_GEN_T5.get(), RenderType.cutout());
        }

        if (Config.ENABLE_DYE_GENERATOR.get()) {
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.DYE_GEN_T1.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.DYE_GEN_T2.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.DYE_GEN_T3.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.DYE_GEN_T4.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.DYE_GEN_T5.get(), RenderType.cutout());
        }

        if (ModList.get().isLoaded("exnihilosequentia")) {
            ResourceLocation key = new ResourceLocation("exnihilosequentia:dust");
            if (ForgeRegistries.BLOCKS.containsKey(key)) {
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.DUST_GEN_T1.get(), RenderType.cutout());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.DUST_GEN_T2.get(), RenderType.cutout());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.DUST_GEN_T3.get(), RenderType.cutout());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.DUST_GEN_T4.get(), RenderType.cutout());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.DUST_GEN_T5.get(), RenderType.cutout());
            }

            key = new ResourceLocation("exnihilosequentia:crushed_end_stone");
            if (ForgeRegistries.BLOCKS.containsKey(key)) {
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.CRUSHED_ENDSTONE_GEN_T1.get(), RenderType.cutout());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.CRUSHED_ENDSTONE_GEN_T2.get(), RenderType.cutout());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.CRUSHED_ENDSTONE_GEN_T3.get(), RenderType.cutout());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.CRUSHED_ENDSTONE_GEN_T4.get(), RenderType.cutout());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.CRUSHED_ENDSTONE_GEN_T5.get(), RenderType.cutout());
            }

            key = new ResourceLocation("exnihilosequentia:crushed_netherrack");
            if (ForgeRegistries.BLOCKS.containsKey(key)) {
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.CRUSHED_NETHERRACK_GEN_T1.get(), RenderType.cutout());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.CRUSHED_NETHERRACK_GEN_T2.get(), RenderType.cutout());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.CRUSHED_NETHERRACK_GEN_T3.get(), RenderType.cutout());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.CRUSHED_NETHERRACK_GEN_T4.get(), RenderType.cutout());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.CRUSHED_NETHERRACK_GEN_T5.get(), RenderType.cutout());
            }
        }
    }

}
