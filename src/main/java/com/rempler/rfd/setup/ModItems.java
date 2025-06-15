package com.rempler.rfd.setup;

import com.rempler.rfd.ResourcesForDays;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    private ModItems(){}
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ResourcesForDays.MODID);

    public static void init(IEventBus modBusEvent) {
        ITEMS.register(modBusEvent);
    }

    public static Item.Properties props() {
        return new Item.Properties();
    }

    public static DeferredItem<BlockItem> registerItemBlock(DeferredBlock<? extends Block> block) {
        return ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), props()));
    }
}
