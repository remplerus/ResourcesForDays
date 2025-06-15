package com.rempler.rfd.setup;

import com.rempler.rfd.api.DefaultMaterials;
import com.rempler.rfd.api.MaterialRegistry;
import net.minecraft.world.level.ItemLike;
import net.neoforged.fml.ModList;

import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static List<ItemLike> getAvailableGenerators(boolean registered) {
        List<ItemLike> availableGenerators = new ArrayList<>();
        availableGenerators.addAll(getAvailableMaterials(DefaultMaterials.T1_GENERATORS, registered));
        availableGenerators.addAll(getAvailableMaterials(DefaultMaterials.T2_GENERATORS, registered));
        availableGenerators.addAll(getAvailableMaterials(DefaultMaterials.T3_GENERATORS, registered));
        availableGenerators.addAll(getAvailableMaterials(DefaultMaterials.T4_GENERATORS, registered));
        availableGenerators.addAll(getAvailableMaterials(DefaultMaterials.T5_GENERATORS, registered));
        return availableGenerators;
    }

    private static List<ItemLike> getAvailableMaterials(MaterialRegistry<?> generators, boolean registered) {
        List<ItemLike> generatorsList = new ArrayList<>();

        for (var generator : generators) {
            if (registered == ModList.get().isLoaded(generator.requiredModId)) {
                generatorsList.add(generator);
            }
        }
        return generatorsList;
    }
}
