package com.rempler.rfd.datagen;

import com.rempler.rfd.ResourcesForDays;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@SuppressWarnings("unused")
@Mod.EventBusSubscriber(modid = ResourcesForDays.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class RfDDataGen {
    private RfDDataGen(){}
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        if (event.includeServer()){
            generator.addProvider(new RfDLootTableGen(generator));
            generator.addProvider(new RfDRecipesGen(generator));
        }
        if (event.includeClient()){
            generator.addProvider(new RfDBlockStateGen(generator, event.getExistingFileHelper()));
            generator.addProvider(new RfDLangGen(generator));
        }
    }
}
