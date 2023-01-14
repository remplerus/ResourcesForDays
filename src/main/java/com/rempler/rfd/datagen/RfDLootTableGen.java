package com.rempler.rfd.datagen;

import com.rempler.rfd.setup.ModBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public class RfDLootTableGen extends BlockLootSubProvider {
    public RfDLootTableGen() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.CLAY_GEN_T1.get());
        this.dropSelf(ModBlocks.CLAY_GEN_T2.get());
        this.dropSelf(ModBlocks.CLAY_GEN_T3.get());
        this.dropSelf(ModBlocks.CLAY_GEN_T4.get());
        this.dropSelf(ModBlocks.CLAY_GEN_T5.get());
        this.dropSelf(ModBlocks.CLEAN_GEN_T1.get());
        this.dropSelf(ModBlocks.CLEAN_GEN_T2.get());
        this.dropSelf(ModBlocks.CLEAN_GEN_T3.get());
        this.dropSelf(ModBlocks.CLEAN_GEN_T4.get());
        this.dropSelf(ModBlocks.CLEAN_GEN_T5.get());
        //this.dropSelf(ModBlocks.COBBLE_GEN_T1.get());
        //this.dropSelf(ModBlocks.COBBLE_GEN_T2.get());
        //this.dropSelf(ModBlocks.COBBLE_GEN_T3.get());
        //this.dropSelf(ModBlocks.COBBLE_GEN_T4.get());
        //this.dropSelf(ModBlocks.COBBLE_GEN_T5.get());
        this.dropSelf(ModBlocks.DIRT_GEN_T1.get());
        this.dropSelf(ModBlocks.DIRT_GEN_T2.get());
        this.dropSelf(ModBlocks.DIRT_GEN_T3.get());
        this.dropSelf(ModBlocks.DIRT_GEN_T4.get());
        this.dropSelf(ModBlocks.DIRT_GEN_T5.get());
        this.dropSelf(ModBlocks.DYE_GEN_T1.get());
        this.dropSelf(ModBlocks.DYE_GEN_T2.get());
        this.dropSelf(ModBlocks.DYE_GEN_T3.get());
        this.dropSelf(ModBlocks.DYE_GEN_T4.get());
        this.dropSelf(ModBlocks.DYE_GEN_T5.get());
        this.dropSelf(ModBlocks.END_GEN_T1.get());
        this.dropSelf(ModBlocks.END_GEN_T2.get());
        this.dropSelf(ModBlocks.END_GEN_T3.get());
        this.dropSelf(ModBlocks.END_GEN_T4.get());
        this.dropSelf(ModBlocks.END_GEN_T5.get());
        this.dropSelf(ModBlocks.FUNGUS_GEN_T1.get());
        this.dropSelf(ModBlocks.FUNGUS_GEN_T2.get());
        this.dropSelf(ModBlocks.FUNGUS_GEN_T3.get());
        this.dropSelf(ModBlocks.FUNGUS_GEN_T4.get());
        this.dropSelf(ModBlocks.FUNGUS_GEN_T5.get());
        this.dropSelf(ModBlocks.GLOWSTONE_GEN_T1.get());
        this.dropSelf(ModBlocks.GLOWSTONE_GEN_T2.get());
        this.dropSelf(ModBlocks.GLOWSTONE_GEN_T3.get());
        this.dropSelf(ModBlocks.GLOWSTONE_GEN_T4.get());
        this.dropSelf(ModBlocks.GLOWSTONE_GEN_T5.get());
        this.dropSelf(ModBlocks.GRASS_GEN_T1.get());
        this.dropSelf(ModBlocks.GRASS_GEN_T2.get());
        this.dropSelf(ModBlocks.GRASS_GEN_T3.get());
        this.dropSelf(ModBlocks.GRASS_GEN_T4.get());
        this.dropSelf(ModBlocks.GRASS_GEN_T5.get());
        this.dropSelf(ModBlocks.GRAVEL_GEN_T1.get());
        this.dropSelf(ModBlocks.GRAVEL_GEN_T2.get());
        this.dropSelf(ModBlocks.GRAVEL_GEN_T3.get());
        this.dropSelf(ModBlocks.GRAVEL_GEN_T4.get());
        this.dropSelf(ModBlocks.GRAVEL_GEN_T5.get());
        this.dropSelf(ModBlocks.ICE_GEN_T1.get());
        this.dropSelf(ModBlocks.ICE_GEN_T2.get());
        this.dropSelf(ModBlocks.ICE_GEN_T3.get());
        this.dropSelf(ModBlocks.ICE_GEN_T4.get());
        this.dropSelf(ModBlocks.ICE_GEN_T5.get());
        this.dropSelf(ModBlocks.NETHERRACK_GEN_T1.get());
        this.dropSelf(ModBlocks.NETHERRACK_GEN_T2.get());
        this.dropSelf(ModBlocks.NETHERRACK_GEN_T3.get());
        this.dropSelf(ModBlocks.NETHERRACK_GEN_T4.get());
        this.dropSelf(ModBlocks.NETHERRACK_GEN_T5.get());
        this.dropSelf(ModBlocks.OBSIDIAN_GEN_T1.get());
        this.dropSelf(ModBlocks.OBSIDIAN_GEN_T2.get());
        this.dropSelf(ModBlocks.OBSIDIAN_GEN_T3.get());
        this.dropSelf(ModBlocks.OBSIDIAN_GEN_T4.get());
        this.dropSelf(ModBlocks.OBSIDIAN_GEN_T5.get());
        this.dropSelf(ModBlocks.ORE_GEN_T1.get());
        this.dropSelf(ModBlocks.ORE_GEN_T2.get());
        this.dropSelf(ModBlocks.ORE_GEN_T3.get());
        this.dropSelf(ModBlocks.ORE_GEN_T4.get());
        this.dropSelf(ModBlocks.ORE_GEN_T5.get());
        this.dropSelf(ModBlocks.QUARTZ_GEN_T1.get());
        this.dropSelf(ModBlocks.QUARTZ_GEN_T2.get());
        this.dropSelf(ModBlocks.QUARTZ_GEN_T3.get());
        this.dropSelf(ModBlocks.QUARTZ_GEN_T4.get());
        this.dropSelf(ModBlocks.QUARTZ_GEN_T5.get());
        this.dropSelf(ModBlocks.REDSTONE_GEN_T1.get());
        this.dropSelf(ModBlocks.REDSTONE_GEN_T2.get());
        this.dropSelf(ModBlocks.REDSTONE_GEN_T3.get());
        this.dropSelf(ModBlocks.REDSTONE_GEN_T4.get());
        this.dropSelf(ModBlocks.REDSTONE_GEN_T5.get());
        this.dropSelf(ModBlocks.SAND_GEN_T1.get());
        this.dropSelf(ModBlocks.SAND_GEN_T2.get());
        this.dropSelf(ModBlocks.SAND_GEN_T3.get());
        this.dropSelf(ModBlocks.SAND_GEN_T4.get());
        this.dropSelf(ModBlocks.SAND_GEN_T5.get());
        this.dropSelf(ModBlocks.SNOW_GEN_T1.get());
        this.dropSelf(ModBlocks.SNOW_GEN_T2.get());
        this.dropSelf(ModBlocks.SNOW_GEN_T3.get());
        this.dropSelf(ModBlocks.SNOW_GEN_T4.get());
        this.dropSelf(ModBlocks.SNOW_GEN_T5.get());
        this.dropSelf(ModBlocks.SOULSAND_GEN_T1.get());
        this.dropSelf(ModBlocks.SOULSAND_GEN_T2.get());
        this.dropSelf(ModBlocks.SOULSAND_GEN_T3.get());
        this.dropSelf(ModBlocks.SOULSAND_GEN_T4.get());
        this.dropSelf(ModBlocks.SOULSAND_GEN_T5.get());
        this.dropSelf(ModBlocks.DUST_GEN_T1.get());
        this.dropSelf(ModBlocks.DUST_GEN_T2.get());
        this.dropSelf(ModBlocks.DUST_GEN_T3.get());
        this.dropSelf(ModBlocks.DUST_GEN_T4.get());
        this.dropSelf(ModBlocks.DUST_GEN_T5.get());
        this.dropSelf(ModBlocks.CRUSHED_ENDSTONE_GEN_T1.get());
        this.dropSelf(ModBlocks.CRUSHED_ENDSTONE_GEN_T2.get());
        this.dropSelf(ModBlocks.CRUSHED_ENDSTONE_GEN_T3.get());
        this.dropSelf(ModBlocks.CRUSHED_ENDSTONE_GEN_T4.get());
        this.dropSelf(ModBlocks.CRUSHED_ENDSTONE_GEN_T5.get());
        this.dropSelf(ModBlocks.CRUSHED_NETHERRACK_GEN_T1.get());
        this.dropSelf(ModBlocks.CRUSHED_NETHERRACK_GEN_T2.get());
        this.dropSelf(ModBlocks.CRUSHED_NETHERRACK_GEN_T3.get());
        this.dropSelf(ModBlocks.CRUSHED_NETHERRACK_GEN_T4.get());
        this.dropSelf(ModBlocks.CRUSHED_NETHERRACK_GEN_T5.get());
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
