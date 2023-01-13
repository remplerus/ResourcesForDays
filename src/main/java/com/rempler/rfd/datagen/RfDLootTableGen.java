package com.rempler.rfd.datagen;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import com.rempler.rfd.setup.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.LootTables;
import net.minecraft.world.level.storage.loot.ValidationContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSet;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class RfDLootTableGen extends LootTableProvider {
    public RfDLootTableGen(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected @NotNull List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootContextParamSet>> getTables() {
        return ImmutableList.of(Pair.of(Blocks::new, LootContextParamSets.BLOCK));
    }

    @Override
    protected void validate(Map<ResourceLocation, LootTable> map, @NotNull ValidationContext validationtracker) {
        map.forEach((name, table) -> LootTables.validate(validationtracker, name, table));
    }

    private static class Blocks extends BlockLoot {
        @Override
        protected void addTables() {
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
            if (ModList.get().isLoaded("exnihilosequentia")) {
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
        }

        @Override
        protected @NotNull Iterable<Block> getKnownBlocks() {
            return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
        }
    }
}
