package com.rempler.rfd.setup;

import com.rempler.rfd.ResourcesForDays;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTab {
    public static DeferredRegister<CreativeModeTab> CREATIVE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ResourcesForDays.MODID);
    public static RegistryObject<CreativeModeTab> TAB = CREATIVE_TAB.register(ResourcesForDays.MODID, () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CLAY_ITEM_T1.get()))
            .displayItems((enabledFlags, populator) -> {
                for (int i = 0; i < ModItems.ITEMS.getEntries().size(); i++) {
                    populator.accept(ModItems.ITEMS.getEntries().stream().toList().get(i).get().getDefaultInstance());
                }
            })
            .title(Component.translatable("item_group."+ResourcesForDays.MODID))
            .build());

    public static void init(IEventBus eventBus) {
        CREATIVE_TAB.register(eventBus);
    }
}
