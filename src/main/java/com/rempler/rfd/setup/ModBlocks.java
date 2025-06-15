package com.rempler.rfd.setup;

import com.rempler.rfd.ResourcesForDays;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ModBlocks {
    private ModBlocks(){}
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(ResourcesForDays.MODID);

    public static Iterator<Block> iterator() {
        List<Block> blockList = new ArrayList<>();
        for (DeferredHolder<Block, ? extends Block> block : BLOCKS.getEntries().stream().toList()) {
            Block block1 = block.get();
            blockList.add(block1);
        }
        return blockList.iterator();
    }

    public static void init(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
