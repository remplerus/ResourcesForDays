package com.rempler.rfd.api;

import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.rempler.rfd.ResourcesForDays;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.neoforged.neoforge.common.util.DeferredSoundType;
import net.neoforged.neoforge.registries.DeferredHolder;

import java.nio.file.Path;

public class MaterialParser {
    private final JsonObject json;
    private final Path jsonPath;
    boolean error;

    public MaterialParser(JsonObject json, Path jsonPath) {
        this.json = json;
        this.jsonPath = jsonPath;
    }

    public SoundType getSoundType() {
        if (this.json.has("sound_type")) {
            var soundTypeJson = this.json.get("sound_type");

            if (soundTypeJson.isJsonPrimitive()) {
                String soundTypeString = soundTypeJson.getAsString();
                var soundType = SoundTypeResolver.resolve(soundTypeString);

                if (soundType == null) {
                    ResourcesForDays.LOGGER.error("Unknown sound type \"{}\" for material {}", soundTypeString, this.jsonPath);
                    this.error = true;
                } else {
                    return soundType;
                }
            } else if (soundTypeJson instanceof JsonObject soundTypeObj) {
                if (soundTypeObj.has("break_sound") && soundTypeObj.has("step_sound") && soundTypeObj.has("place_sound") && soundTypeObj.has("hit_sound") && soundTypeObj.has("fall_sound")) {
                    return new DeferredSoundType(1.0f, 1.0f,
                            DeferredHolder.create(Registries.SOUND_EVENT, ResourceLocation.parse(soundTypeObj.get("break_sound").getAsString())),
                            DeferredHolder.create(Registries.SOUND_EVENT, ResourceLocation.parse(soundTypeObj.get("step_sound").getAsString())),
                            DeferredHolder.create(Registries.SOUND_EVENT, ResourceLocation.parse(soundTypeObj.get("place_sound").getAsString())),
                            DeferredHolder.create(Registries.SOUND_EVENT, ResourceLocation.parse(soundTypeObj.get("hit_sound").getAsString())),
                            DeferredHolder.create(Registries.SOUND_EVENT, ResourceLocation.parse(soundTypeObj.get("fall_sound").getAsString()))
                    );
                }
            } else {
                ResourcesForDays.LOGGER.error("Unable to parse sound type for material {}", this.jsonPath);
                this.error = true;
            }
        } else {
            ResourcesForDays.LOGGER.error("Missing sound_type property for material {}", this.jsonPath);
            this.error = true;
        }

        return SoundType.WOOD;
    }

    public float getStrength() {
        if (this.json.has("strength")) {
            var strengthJson = this.json.get("strength");

            if (strengthJson.isJsonPrimitive()) {
                try {
                    return strengthJson.getAsFloat();
                } catch (NumberFormatException e) {
                    ResourcesForDays.LOGGER.error("Failed to parse strength property for material {} with value {}", this.jsonPath, strengthJson.getAsString());
                    this.error = true;
                }
            } else {
                ResourcesForDays.LOGGER.error("Failed to parse strength property for material {}: not a number", this.jsonPath);
                this.error = true;
            }
        }

        return 0f;
    }

    public boolean getOptionalBoolean(String key) {
        return this.json.get(key) instanceof JsonPrimitive prim && prim.isBoolean() && prim.getAsBoolean();
    }

    public String getRequiredModId() {
        if (this.json.get("required_mod_id") instanceof JsonPrimitive prim && prim.isString()) {
            return prim.getAsString();
        } else {
            return ResourcesForDays.MODID;
        }
    }

    public int getTier() {
        if (this.json.has("tier")) {
            var tierJson = this.json.get("tier");

            if (tierJson.isJsonPrimitive()) {
                try {
                    return tierJson.getAsInt();
                } catch (NumberFormatException e) {
                    ResourcesForDays.LOGGER.error("Failed to parse tier property for material {} with value {}", this.jsonPath, tierJson.getAsString());
                    this.error = true;
                }
            } else {
                ResourcesForDays.LOGGER.error("Failed to parse tier property for material {}: not a number", this.jsonPath);
                this.error = true;
            }
        }

        return 1; // Default tier is 1 if not specified
    }

    public int getLightLevel() {
        if (this.json.has("light_level")) {
            var lightLevelJson = this.json.get("light_level");

            if (lightLevelJson.isJsonPrimitive()) {
                try {
                    return lightLevelJson.getAsInt();
                } catch (NumberFormatException e) {
                    ResourcesForDays.LOGGER.error("Failed to parse light_level property for material {} with value {}", this.jsonPath, lightLevelJson.getAsString());
                    this.error = true;
                }
            } else {
                ResourcesForDays.LOGGER.error("Failed to parse light_level property for material {}: not a number", this.jsonPath);
                this.error = true;
            }
        }

        return 15; // Default light level is 15 if not specified
    }

    public ItemLike getItem() {
        if (this.json.has("item")) {
            var itemJson = this.json.get("item");

            if (itemJson.isJsonPrimitive()) {
                String itemId = itemJson.getAsString();

                return BuiltInRegistries.ITEM.get(ResourceLocation.parse(itemId));
            } else {
                ResourcesForDays.LOGGER.error("Failed to parse item property for material {}: not a string", this.jsonPath);
                this.error = true;
            }
        }

        return Items.AIR; // Default to null if no item is specified
    }

    public Block getBlock() {
        if (this.json.has("block")) {
            var blockJson = this.json.get("block");

            if (blockJson.isJsonPrimitive()) {
                String blockId = blockJson.getAsString();

                return BuiltInRegistries.BLOCK.get(ResourceLocation.parse(blockId));
            } else {
                ResourcesForDays.LOGGER.error("Failed to parse block property for material {}: not a string", this.jsonPath);
                this.error = true;
            }
        }

        return Blocks.AIR; // Default to null if no block is specified
    }
}
