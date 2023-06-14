package com.rempler.rfd.datagen;

import com.rempler.rfd.ResourcesForDays;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@SuppressWarnings("unused")
@Mod.EventBusSubscriber(modid = ResourcesForDays.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class RfDDataGen {
    private RfDDataGen(){}
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput po = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        if (event.includeClient()){
            generator.addProvider(true, new RfDBlockStateGen(po, event.getExistingFileHelper()));
            generator.addProvider(true, new RfDLangGen(po));
        }
        if (event.includeServer()){
            generator.addProvider(true, new LootTableProvider(po, Collections.emptySet(), List.of(new LootTableProvider.SubProviderEntry(RfDLootTableGen::new, LootContextParamSets.BLOCK))));
            generator.addProvider(true, new RfDRecipesGen(po));
            generator.addProvider(true, new RfDBlockTagGen(po, lookupProvider, event.getExistingFileHelper()));
            generator.addProvider(true, new RfDItemTagGen(po, lookupProvider, event.getExistingFileHelper()));
        }
    }
}
