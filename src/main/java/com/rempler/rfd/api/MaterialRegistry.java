package com.rempler.rfd.api;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.rempler.rfd.ResourcesForDays;
import com.rempler.rfd.setup.Config;
import com.rempler.rfd.setup.ModBlocks;
import com.rempler.rfd.setup.ModItems;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.data.loading.DatagenModLoader;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class MaterialRegistry<M extends AbstractMaterial> implements Iterable<M> {
    private final List<M> values = new ArrayList<>();
    private final String configSubfolder;
    private final String suffix;

    // Suffix should NOT start with an underscore
    public MaterialRegistry(String configSubfolder, String suffix) {
        this.configSubfolder = configSubfolder;
        this.suffix = suffix;

        Preconditions.checkArgument(!suffix.startsWith("_"));
    }

    public void search(Function<MaterialParser, @Nullable M> materialRegistrar) {
        if (this.configSubfolder.contains("ore") || this.configSubfolder.contains("dye")) {
            return;
        }
        var configPath = Paths.get("config/rfd/" + this.configSubfolder + "s");
        if (!DatagenModLoader.isRunningDataGen()) {
            if (Config.createConfigFolder(configPath)) {
                var materialsFolder = configPath.toFile();
                var children = materialsFolder.list();

                if (children != null) {
                    for (var child : children) {
                        if (child.endsWith(".json")) {
                            Path jsonPath = configPath.resolve(child);

                            try {
                                var json = (JsonObject) JsonParser.parseString(Files.readString(jsonPath));
                                var material = materialRegistrar.apply(new MaterialParser(json, jsonPath));

                                if (material != null) {
                                    register(child.substring(0, child.length() - 5), material);
                                }
                            } catch (IOException e) {
                                ResourcesForDays.LOGGER.error("Failed to read JSON custom material at {}", jsonPath);
                            }
                        }
                    }
                } else {
                    ResourcesForDays.LOGGER.error("Failed to read JSON custom materials at {}: not a directory", configPath);
                }
            }
        }
    }

    public void register(String name, M material) {
        var id = name;
        if (!suffix.equals(configSubfolder)) {
            id = name + "_" + this.suffix;
        }
        ResourcesForDays.LOGGER.info("Registered \"{}\" for {} material {}.json", id, this.configSubfolder, name);

        if (material.block != null) {
            throw new IllegalStateException(this.configSubfolder + " material with name " + name + " already registered: duplicate material?");
        }

        material.block = ModBlocks.BLOCKS.register(id, material::createBlock);
        material.item = ModItems.registerItemBlock(material.block);
        this.values.add(material);
    }

    public <B extends BlockEntity> BlockEntityType<B> createBlockEntityType(BlockEntityType.BlockEntitySupplier<? extends B> factory) {
        ImmutableSet.Builder<Block> validBlocks = ImmutableSet.builder();

        for (var material : this.values) {
            validBlocks.add(material.block.get());
        }

        return new BlockEntityType<>(factory, validBlocks.build(), null);
    }

    @Override
    public Iterator<M> iterator() {
        return this.values.iterator();
    }

    public Stream<M> stream() {
        return this.values.stream();
    }
}
