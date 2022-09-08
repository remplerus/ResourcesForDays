package com.rempler.rfd.datagen;

import com.rempler.rfd.ResourcesForDays;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@SuppressWarnings("unused")
@Mod.EventBusSubscriber(modid = ResourcesForDays.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class RfDDataGen {
    private RfDDataGen(){}
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        if (event.includeServer()){
            generator.addProvider(true, new RfDLootTableGen(generator));
            generator.addProvider(true, new RfDRecipesGen(generator));
            generator.addProvider(true, new RfDBlockTagGen(generator, event.getExistingFileHelper()));
            generator.addProvider(true, new RfDItemTagGen(generator, event.getExistingFileHelper()));
        }
        if (event.includeClient()){
            generator.addProvider(true, new RfDBlockStateGen(generator, event.getExistingFileHelper()));
            generator.addProvider(true, new RfDLangGen(generator));
        }
    }
}
