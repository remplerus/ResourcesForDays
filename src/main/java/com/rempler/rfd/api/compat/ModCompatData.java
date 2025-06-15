package com.rempler.rfd.api.compat;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.data.loading.DatagenModLoader;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.HashMap;
import java.util.Map;

public class ModCompatData {
    private static final Map<String, DeferredRegister.Items> itemRegistries = new HashMap<>();
    private static final Map<String, DeferredRegister.Blocks> blockRegistries = new HashMap<>();

    private static DeferredItem<Item> item(String modid, String name) {
        if (DatagenModLoader.isRunningDataGen()) {
            DeferredRegister.Items registry = itemRegistries.computeIfAbsent(modid, DeferredRegister::createItems);
            return registry.register(name, () -> new Item(new Item.Properties()));
        } else {
            return null;
        }
    }

    private static DeferredBlock<Block> block(String modid, String name) {
        if (DatagenModLoader.isRunningDataGen()) {
            DeferredRegister.Blocks registry = blockRegistries.computeIfAbsent(modid, DeferredRegister::createBlocks);
            return registry.register(name, () -> new Block(BlockBehaviour.Properties.of()));
        } else {
            return null;
        }
    }

    // Biomes O' Plenty
    public static final DeferredBlock<Block>
            DUST = block("exnihilosequentia", "dust"),
            CRUSHED_NETHERRACK = block("exnihilosequentia", "crushed_netherrack"),
            CRUSHED_END_STONE = block("exnihilosequentia", "crushed_end_stone");

    public static void registerModData(IEventBus modBus) {
        for (var registry : itemRegistries.values()) {
            registry.register(modBus);
        }
        for (var registry : blockRegistries.values()) {
            registry.register(modBus);
        }
    }
}
