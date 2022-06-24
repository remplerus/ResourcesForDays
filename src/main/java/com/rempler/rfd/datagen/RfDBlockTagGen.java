package com.rempler.rfd.datagen;

import com.rempler.rfd.ResourcesForDays;
import com.rempler.rfd.setup.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

public class RfDBlockTagGen extends BlockTagsProvider {
    public RfDBlockTagGen(DataGenerator p_126511_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_126511_, ResourcesForDays.MODID, existingFileHelper);
    }

    protected void addTags() {
        for (int i = 0; i < ModBlocks.BLOCKS.getEntries().size(); i++) {
            Block block = ModBlocks.BLOCKS.getEntries().stream().toList().get(i).get();
            if (block.getRegistryName().getPath().contains("tier_1")) {
                tag(ResourcesForDays.GEN_BLOCKS_BLOCK_WOODEN).add(block);
            } else {
                tag(ResourcesForDays.GEN_BLOCKS_BLOCK).add(block);
            }
        }
        tag(BlockTags.MINEABLE_WITH_PICKAXE).addTag(ResourcesForDays.GEN_BLOCKS_BLOCK);
        tag(BlockTags.MINEABLE_WITH_AXE).addTag(ResourcesForDays.GEN_BLOCKS_BLOCK_WOODEN);
    }
}
