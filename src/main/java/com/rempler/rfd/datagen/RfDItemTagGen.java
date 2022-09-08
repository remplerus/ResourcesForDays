package com.rempler.rfd.datagen;

import com.rempler.rfd.ResourcesForDays;
import com.rempler.rfd.setup.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

public class RfDItemTagGen extends ItemTagsProvider {
    public RfDItemTagGen(DataGenerator generator, @Nullable ExistingFileHelper existingFileHelper) {
        super(generator, new RfDBlockTagGen(generator, existingFileHelper), ResourcesForDays.MODID, existingFileHelper);
    }

    protected void addTags() {
        for (int i = 0; i < ModItems.ITEMS.getEntries().size(); i++) {
            Item item = ModItems.ITEMS.getEntries().stream().toList().get(i).get();
            if (item.toString().contains("tier_1")) {
                tag(ResourcesForDays.GEN_BLOCKS_ITEM_WOODEN).add(item);
            } else {
                tag(ResourcesForDays.GEN_BLOCKS_ITEM).add(item);
            }
        }
    }
}
