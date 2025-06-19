package com.rempler.rfd.api;

import com.rempler.rfd.blocks.BaseGenerator;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import org.jetbrains.annotations.Nullable;

public class GeneratorMaterial extends AbstractMaterial {
    private final int tier;
    private final int lightLevel;
    private final ItemLike item;
    private final Block block;
    private final SoundType soundType;
    protected GeneratorMaterial(float strength, boolean needsCorrectTool, String requiredModId, int tier, int lightLevel, ItemLike item, Block block, SoundType soundType) {
        super(soundType, strength, needsCorrectTool, requiredModId);
        this.tier = tier;
        this.lightLevel = lightLevel;
        this.item = item;
        this.block = block;
        this.soundType = soundType;
    }

    @Override
    protected Block createBlock() {
        return new BaseGenerator(this.props().lightLevel((state) -> this.lightLevel), this.tier, this.item.asItem(), this.block);
    }

    public SoundType getSoundType() {
        return this.soundType;
    }

    @Nullable
    public static GeneratorMaterial readFromJson(MaterialParser parser, int tier, SoundType soundType) {
        float strength = parser.getStrength();
        boolean needsCorrectTool = parser.getOptionalBoolean("needs_correct_tool");
        String requiredModId = parser.getRequiredModId();
        int lightLevel = parser.getLightLevel();
        ItemLike item = parser.getItem();
        Block block = parser.getBlock();

        if (parser.error) {
            return null;
        } else {
            return new GeneratorMaterial(strength, needsCorrectTool, requiredModId, tier, lightLevel, item, block, soundType);
        }
    }
}
