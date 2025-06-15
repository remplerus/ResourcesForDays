package com.rempler.rfd.api;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import org.jetbrains.annotations.NotNull;

public abstract class AbstractMaterial implements ItemLike {
    // The sound this block makes (a string corresponding to a field in SoundType or a JSON object with the five sound events used to create a sound type)
    public final SoundType soundType;
    // The hardness of the barrel when harvesting
    public final float strength;
    // Whether this barrel needs a special tool to be harvested (ex. stone barrel only drops if mined with pickaxe)
    public final boolean needsCorrectTool;
    // ID of mod that should be present
    public final String requiredModId;

    DeferredBlock<Block> block;
    DeferredItem<BlockItem> item;

    protected AbstractMaterial(SoundType soundType, float strength, boolean needsCorrectTool, String requiredModId) {
        this.soundType = soundType;
        this.strength = strength;
        this.needsCorrectTool = needsCorrectTool;
        this.requiredModId = requiredModId;
    }

    protected abstract Block createBlock();

    protected BlockBehaviour.Properties props() {
        var properties = BlockBehaviour.Properties.of().strength(this.strength).sound(this.soundType);
        if (this.needsCorrectTool) properties.requiresCorrectToolForDrops();
        return properties;
    }

    public Item getItem() {
        return this.item.get();
    }

    public Block getBlock() {
        return this.block.get();
    }

    @Override
    @NotNull
    public Item asItem() {
        return this.item.get();
    }
}
