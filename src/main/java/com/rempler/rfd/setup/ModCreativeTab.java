package com.rempler.rfd.setup;

import com.rempler.rfd.ResourcesForDays;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModCreativeTab {
    public static DeferredRegister<CreativeModeTab> CREATIVE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ResourcesForDays.MODID);
    public static DeferredHolder<CreativeModeTab, CreativeModeTab> TAB = CREATIVE_TAB.register(ResourcesForDays.MODID, () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.DIAMOND))
            .displayItems((enabledFlags, populator) -> {
                for (var generator : Utils.getAvailableGenerators(true)) {
                    populator.accept(generator);
                }
            })
            .title(Component.translatable("item_group."+ResourcesForDays.MODID))
            .build());

    public static void init(IEventBus eventBus) {
        CREATIVE_TAB.register(eventBus);
    }
}
