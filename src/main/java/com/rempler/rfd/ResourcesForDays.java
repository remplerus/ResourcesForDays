package com.rempler.rfd;

import com.mojang.brigadier.CommandDispatcher;
import com.rempler.rfd.api.DefaultMaterials;
import com.rempler.rfd.api.compat.ModCompatData;
import com.rempler.rfd.datagen.RfDDataGen;
import com.rempler.rfd.setup.Config;
import com.rempler.rfd.setup.ModBE;
import com.rempler.rfd.setup.ModBlocks;
import com.rempler.rfd.setup.ModCreativeTab;
import com.rempler.rfd.setup.ModItems;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.loading.FMLPaths;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.data.loading.DatagenModLoader;
import net.neoforged.neoforge.event.RegisterCommandsEvent;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Path;

@Mod(ResourcesForDays.MODID)
public class ResourcesForDays
{
    public static final String MODID = "rfd";
    public static TagKey<Block> GEN_BLOCKS_BLOCK = BlockTags.create(ResourceLocation.fromNamespaceAndPath(MODID, "generators"));
    public static TagKey<Block> GEN_BLOCKS_BLOCK_WOODEN = BlockTags.create(ResourceLocation.fromNamespaceAndPath(MODID, "wooden_generators"));
    public static TagKey<Item> GEN_BLOCKS_ITEM = ItemTags.create(ResourceLocation.fromNamespaceAndPath(MODID, "generators"));
    public static TagKey<Item> GEN_BLOCKS_ITEM_WOODEN = ItemTags.create(ResourceLocation.fromNamespaceAndPath(MODID, "wooden_generators"));

    public static final Logger LOGGER = LogManager.getLogger();

    public ResourcesForDays(IEventBus eventBus, ModContainer modContainer) {
        LOGGER.info("Starting RfD");
        DefaultMaterials.registerMaterials();
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.COMMON_CONFIG);

        if (DatagenModLoader.isRunningDataGen()) {
            ModCompatData.registerModData(eventBus);
            eventBus.addListener(RfDDataGen::generateData);
        }

        ModItems.init(eventBus);
        ModBlocks.init(eventBus);
        ModBE.init(eventBus);
        ModCreativeTab.init(eventBus);
        NeoForge.EVENT_BUS.addListener(this::registerCommands);
    }

    public void registerCommands(RegisterCommandsEvent event) {
        CommandDispatcher<CommandSourceStack> dispatcher = event.getDispatcher();
        registerCopy(dispatcher);
    }

    public static void registerCopy(CommandDispatcher<CommandSourceStack> dispatcher) {
        dispatcher.register(Commands.literal("rfd")
                .then(Commands.literal("example")
                        .requires(cs -> cs.hasPermission(2))
                        .executes(context -> {
                            try {
                                if (runCopy()) {
                                    context.getSource().sendFailure(Component.literal("Couldn't copy example file to " + FMLPaths.CONFIGDIR.get().resolve("rfd/generators") + ", it already exists."));
                                } else {
                                    context.getSource().sendSuccess(() -> Component.literal("Copied example file to " + FMLPaths.CONFIGDIR.get().resolve("rfd/generators")), true);
                                }
                            } catch (IOException e) {
                                context.getSource().sendFailure(Component.literal("An error occurred while copying the example file: " + e.getMessage()));
                                LOGGER.error("Error copying example file", e);
                            }
                            return 1;
                        })));
    }

    private static boolean runCopy() throws IOException {
        boolean success = false;
        URL inputURL = ResourcesForDays.class.getResource("/config/rfd/generators/test_generator.json");
        URL inputURL2 = ResourcesForDays.class.getResource("/config/rfd/generators/test_generator.zip");
        Path configDir = FMLPaths.CONFIGDIR.get().resolve("rfd/generators");
        assert inputURL != null;
        assert inputURL2 != null;
        if (configDir.resolve("test_generator.json").toFile().exists()) {
            LOGGER.info("Example config already exists at {}", configDir.resolve("test_generator.json").toFile());
            success = true; // File already exists, no need to copy
        } else {
            FileUtils.copyURLToFile(inputURL, configDir.resolve("test_generator.json").toFile());
        }
        if (FMLPaths.GAMEDIR.get().resolve("resourcepacks/test_generator.zip").toFile().exists()) {
            LOGGER.info("Example config already exists at {}", FMLPaths.GAMEDIR.get().resolve("resourcepacks/test_generator.zip").toFile());
            success = true; // File already exists, no need to copy
        } else {
            FileUtils.copyURLToFile(inputURL2, FMLPaths.GAMEDIR.get().resolve("resourcepacks/test_generator.zip").toFile());
        }
        return success;
    }
}
