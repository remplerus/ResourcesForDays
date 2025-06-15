package com.rempler.rfd.datagen;

import com.rempler.rfd.api.DefaultMaterials;
import com.rempler.rfd.setup.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public class RfDLootTableGen extends BlockLootSubProvider {
    public RfDLootTableGen(HolderLookup.Provider lookupProvider) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), lookupProvider);
    }

    @Override
    protected void generate() {
        this.dropSelf(DefaultMaterials.CLAY_GEN_T1.getBlock());
        this.dropSelf(DefaultMaterials.CLAY_GEN_T2.getBlock());
        this.dropSelf(DefaultMaterials.CLAY_GEN_T3.getBlock());
        this.dropSelf(DefaultMaterials.CLAY_GEN_T4.getBlock());
        this.dropSelf(DefaultMaterials.CLAY_GEN_T5.getBlock());
        this.dropSelf(DefaultMaterials.CLEAN_GEN_T1.getBlock());
        this.dropSelf(DefaultMaterials.CLEAN_GEN_T2.getBlock());
        this.dropSelf(DefaultMaterials.CLEAN_GEN_T3.getBlock());
        this.dropSelf(DefaultMaterials.CLEAN_GEN_T4.getBlock());
        this.dropSelf(DefaultMaterials.CLEAN_GEN_T5.getBlock());
        this.dropSelf(DefaultMaterials.COBBLE_GEN_T1.getBlock());
        this.dropSelf(DefaultMaterials.COBBLE_GEN_T2.getBlock());
        this.dropSelf(DefaultMaterials.COBBLE_GEN_T3.getBlock());
        this.dropSelf(DefaultMaterials.COBBLE_GEN_T4.getBlock());
        this.dropSelf(DefaultMaterials.COBBLE_GEN_T5.getBlock());
        this.dropSelf(DefaultMaterials.DIRT_GEN_T1.getBlock());
        this.dropSelf(DefaultMaterials.DIRT_GEN_T2.getBlock());
        this.dropSelf(DefaultMaterials.DIRT_GEN_T3.getBlock());
        this.dropSelf(DefaultMaterials.DIRT_GEN_T4.getBlock());
        this.dropSelf(DefaultMaterials.DIRT_GEN_T5.getBlock());
        this.dropSelf(DefaultMaterials.DYE_GEN_T1.getBlock());
        this.dropSelf(DefaultMaterials.DYE_GEN_T2.getBlock());
        this.dropSelf(DefaultMaterials.DYE_GEN_T3.getBlock());
        this.dropSelf(DefaultMaterials.DYE_GEN_T4.getBlock());
        this.dropSelf(DefaultMaterials.DYE_GEN_T5.getBlock());
        this.dropSelf(DefaultMaterials.END_GEN_T1.getBlock());
        this.dropSelf(DefaultMaterials.END_GEN_T2.getBlock());
        this.dropSelf(DefaultMaterials.END_GEN_T3.getBlock());
        this.dropSelf(DefaultMaterials.END_GEN_T4.getBlock());
        this.dropSelf(DefaultMaterials.END_GEN_T5.getBlock());
        this.dropSelf(DefaultMaterials.MYCELIUM_GEN_T1.getBlock());
        this.dropSelf(DefaultMaterials.MYCELIUM_GEN_T2.getBlock());
        this.dropSelf(DefaultMaterials.MYCELIUM_GEN_T3.getBlock());
        this.dropSelf(DefaultMaterials.MYCELIUM_GEN_T4.getBlock());
        this.dropSelf(DefaultMaterials.MYCELIUM_GEN_T5.getBlock());
        this.dropSelf(DefaultMaterials.GLOWSTONE_GEN_T1.getBlock());
        this.dropSelf(DefaultMaterials.GLOWSTONE_GEN_T2.getBlock());
        this.dropSelf(DefaultMaterials.GLOWSTONE_GEN_T3.getBlock());
        this.dropSelf(DefaultMaterials.GLOWSTONE_GEN_T4.getBlock());
        this.dropSelf(DefaultMaterials.GLOWSTONE_GEN_T5.getBlock());
        this.dropSelf(DefaultMaterials.GRASS_GEN_T1.getBlock());
        this.dropSelf(DefaultMaterials.GRASS_GEN_T2.getBlock());
        this.dropSelf(DefaultMaterials.GRASS_GEN_T3.getBlock());
        this.dropSelf(DefaultMaterials.GRASS_GEN_T4.getBlock());
        this.dropSelf(DefaultMaterials.GRASS_GEN_T5.getBlock());
        this.dropSelf(DefaultMaterials.GRAVEL_GEN_T1.getBlock());
        this.dropSelf(DefaultMaterials.GRAVEL_GEN_T2.getBlock());
        this.dropSelf(DefaultMaterials.GRAVEL_GEN_T3.getBlock());
        this.dropSelf(DefaultMaterials.GRAVEL_GEN_T4.getBlock());
        this.dropSelf(DefaultMaterials.GRAVEL_GEN_T5.getBlock());
        this.dropSelf(DefaultMaterials.ICE_GEN_T1.getBlock());
        this.dropSelf(DefaultMaterials.ICE_GEN_T2.getBlock());
        this.dropSelf(DefaultMaterials.ICE_GEN_T3.getBlock());
        this.dropSelf(DefaultMaterials.ICE_GEN_T4.getBlock());
        this.dropSelf(DefaultMaterials.ICE_GEN_T5.getBlock());
        this.dropSelf(DefaultMaterials.NETHERRACK_GEN_T1.getBlock());
        this.dropSelf(DefaultMaterials.NETHERRACK_GEN_T2.getBlock());
        this.dropSelf(DefaultMaterials.NETHERRACK_GEN_T3.getBlock());
        this.dropSelf(DefaultMaterials.NETHERRACK_GEN_T4.getBlock());
        this.dropSelf(DefaultMaterials.NETHERRACK_GEN_T5.getBlock());
        this.dropSelf(DefaultMaterials.OBSIDIAN_GEN_T1.getBlock());
        this.dropSelf(DefaultMaterials.OBSIDIAN_GEN_T2.getBlock());
        this.dropSelf(DefaultMaterials.OBSIDIAN_GEN_T3.getBlock());
        this.dropSelf(DefaultMaterials.OBSIDIAN_GEN_T4.getBlock());
        this.dropSelf(DefaultMaterials.OBSIDIAN_GEN_T5.getBlock());
        this.dropSelf(DefaultMaterials.ORE_GEN_T1.getBlock());
        this.dropSelf(DefaultMaterials.ORE_GEN_T2.getBlock());
        this.dropSelf(DefaultMaterials.ORE_GEN_T3.getBlock());
        this.dropSelf(DefaultMaterials.ORE_GEN_T4.getBlock());
        this.dropSelf(DefaultMaterials.ORE_GEN_T5.getBlock());
        this.dropSelf(DefaultMaterials.QUARTZ_GEN_T1.getBlock());
        this.dropSelf(DefaultMaterials.QUARTZ_GEN_T2.getBlock());
        this.dropSelf(DefaultMaterials.QUARTZ_GEN_T3.getBlock());
        this.dropSelf(DefaultMaterials.QUARTZ_GEN_T4.getBlock());
        this.dropSelf(DefaultMaterials.QUARTZ_GEN_T5.getBlock());
        this.dropSelf(DefaultMaterials.REDSTONE_GEN_T1.getBlock());
        this.dropSelf(DefaultMaterials.REDSTONE_GEN_T2.getBlock());
        this.dropSelf(DefaultMaterials.REDSTONE_GEN_T3.getBlock());
        this.dropSelf(DefaultMaterials.REDSTONE_GEN_T4.getBlock());
        this.dropSelf(DefaultMaterials.REDSTONE_GEN_T5.getBlock());
        this.dropSelf(DefaultMaterials.SAND_GEN_T1.getBlock());
        this.dropSelf(DefaultMaterials.SAND_GEN_T2.getBlock());
        this.dropSelf(DefaultMaterials.SAND_GEN_T3.getBlock());
        this.dropSelf(DefaultMaterials.SAND_GEN_T4.getBlock());
        this.dropSelf(DefaultMaterials.SAND_GEN_T5.getBlock());
        this.dropSelf(DefaultMaterials.SNOW_GEN_T1.getBlock());
        this.dropSelf(DefaultMaterials.SNOW_GEN_T2.getBlock());
        this.dropSelf(DefaultMaterials.SNOW_GEN_T3.getBlock());
        this.dropSelf(DefaultMaterials.SNOW_GEN_T4.getBlock());
        this.dropSelf(DefaultMaterials.SNOW_GEN_T5.getBlock());
        this.dropSelf(DefaultMaterials.SOUL_SAND_GEN_T1.getBlock());
        this.dropSelf(DefaultMaterials.SOUL_SAND_GEN_T2.getBlock());
        this.dropSelf(DefaultMaterials.SOUL_SAND_GEN_T3.getBlock());
        this.dropSelf(DefaultMaterials.SOUL_SAND_GEN_T4.getBlock());
        this.dropSelf(DefaultMaterials.SOUL_SAND_GEN_T5.getBlock());
        this.dropSelf(DefaultMaterials.DUST_GEN_T1.getBlock());
        this.dropSelf(DefaultMaterials.DUST_GEN_T2.getBlock());
        this.dropSelf(DefaultMaterials.DUST_GEN_T3.getBlock());
        this.dropSelf(DefaultMaterials.DUST_GEN_T4.getBlock());
        this.dropSelf(DefaultMaterials.DUST_GEN_T5.getBlock());
        this.dropSelf(DefaultMaterials.CRUSHED_END_STONE_GEN_T1.getBlock());
        this.dropSelf(DefaultMaterials.CRUSHED_END_STONE_GEN_T2.getBlock());
        this.dropSelf(DefaultMaterials.CRUSHED_END_STONE_GEN_T3.getBlock());
        this.dropSelf(DefaultMaterials.CRUSHED_END_STONE_GEN_T4.getBlock());
        this.dropSelf(DefaultMaterials.CRUSHED_END_STONE_GEN_T5.getBlock());
        this.dropSelf(DefaultMaterials.CRUSHED_NETHERRACK_GEN_T1.getBlock());
        this.dropSelf(DefaultMaterials.CRUSHED_NETHERRACK_GEN_T2.getBlock());
        this.dropSelf(DefaultMaterials.CRUSHED_NETHERRACK_GEN_T3.getBlock());
        this.dropSelf(DefaultMaterials.CRUSHED_NETHERRACK_GEN_T4.getBlock());
        this.dropSelf(DefaultMaterials.CRUSHED_NETHERRACK_GEN_T5.getBlock());
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return ModBlocks::iterator;
    }
}
