package com.rempler.rfd.datagen;

import com.rempler.rfd.ResourcesForDays;
import com.rempler.rfd.setup.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class RfDBlockTagGen extends BlockTagsProvider {
    public RfDBlockTagGen(PackOutput po, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(po, lookupProvider, ResourcesForDays.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        for (int i = 0; i < ModBlocks.BLOCKS.getEntries().size(); i++) {
            Block block = ModBlocks.BLOCKS.getEntries().stream().toList().get(i).get();
            if (block.getName().getString().contains("tier_1")) {
                tag(ResourcesForDays.GEN_BLOCKS_BLOCK_WOODEN).add(block);
            } else {
                tag(ResourcesForDays.GEN_BLOCKS_BLOCK).add(block);
            }
        }
        tag(BlockTags.MINEABLE_WITH_PICKAXE).addTag(ResourcesForDays.GEN_BLOCKS_BLOCK);
        tag(BlockTags.MINEABLE_WITH_AXE).addTag(ResourcesForDays.GEN_BLOCKS_BLOCK_WOODEN);
    }
}
