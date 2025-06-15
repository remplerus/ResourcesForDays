package com.rempler.rfd.api;

import com.rempler.rfd.blocks.OreGenerator;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import org.jetbrains.annotations.Nullable;

public class OreGeneratorMaterial extends AbstractMaterial {
    private final int tier;
    private final int lightLevel;
    protected OreGeneratorMaterial(SoundType soundType, float strength, boolean needsCorrectTool, String requiredModId, int tier, int lightLevel) {
        super(soundType, strength, needsCorrectTool, requiredModId);
        this.tier = tier;
        this.lightLevel = lightLevel;
    }

    @Override
    protected Block createBlock() {
        return new OreGenerator(this.props().lightLevel((state) -> this.lightLevel), this.tier);
    }

    @Nullable
    public static OreGeneratorMaterial readFromJson(MaterialParser parser) {
        SoundType soundType = parser.getSoundType();
        float strength = parser.getStrength();
        boolean needsCorrectTool = parser.getOptionalBoolean("needs_correct_tool");
        String requiredModId = parser.getRequiredModId();
        int tier = parser.getTier();
        int lightLevel = parser.getLightLevel();

        if (parser.error) {
            return null;
        } else {
            return new OreGeneratorMaterial(soundType, strength, needsCorrectTool, requiredModId, tier, lightLevel);
        }
    }
}
