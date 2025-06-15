package com.rempler.rfd.api;

import net.minecraft.world.level.block.SoundType;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Locale;

class SoundTypeResolver {
    private static final HashMap<String, SoundType> VANILLA_SOUND_TYPES = new HashMap<>();

    @Nullable
    static SoundType resolve(String name) {
        return VANILLA_SOUND_TYPES.computeIfAbsent(name.toUpperCase(Locale.ROOT), (fieldName) -> {
            try {
                var field = SoundType.class.getDeclaredField(fieldName);
                return (SoundType) field.get(null);
            } catch (NoSuchFieldException | IllegalAccessException ignored) {
                return null;
            }
        });
    }
}
