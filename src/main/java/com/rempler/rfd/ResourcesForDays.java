package com.rempler.rfd;

import com.rempler.rfd.setup.Config;
import com.rempler.rfd.setup.ModBE;
import com.rempler.rfd.setup.ModBlocks;
import com.rempler.rfd.setup.ModCreativeTab;
import com.rempler.rfd.setup.ModItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import net.minecraftforge.registries.RegistryObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("rfd")
public class ResourcesForDays
{
    public static final String MODID = "rfd";
    public static TagKey<Block> GEN_BLOCKS_BLOCK = BlockTags.create(new ResourceLocation(MODID, "generators"));
    public static TagKey<Block> GEN_BLOCKS_BLOCK_WOODEN = BlockTags.create(new ResourceLocation(MODID, "wooden_generators"));
    public static TagKey<Item> GEN_BLOCKS_ITEM = ItemTags.create(new ResourceLocation(MODID, "generators"));
    public static TagKey<Item> GEN_BLOCKS_ITEM_WOODEN = ItemTags.create(new ResourceLocation(MODID, "wooden_generators"));

    public static final Logger LOGGER = LogManager.getLogger();
    private static final IEventBus EVENT_BUS = FMLJavaModLoadingContext.get().getModEventBus();

    public ResourcesForDays() {
        LOGGER.info("Starting RfD");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.COMMON_CONFIG);

        ModItems.init(EVENT_BUS);
        ModBlocks.init(EVENT_BUS);
        ModBE.init(EVENT_BUS);
        ModCreativeTab.init(EVENT_BUS);

        Config.loadConfig(Config.COMMON_CONFIG, FMLPaths.CONFIGDIR.get().resolve("rfd-common.toml"));
    }

    @SuppressWarnings("unused")
    @Mod.EventBusSubscriber(modid = ResourcesForDays.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class EventHandler {
        @SubscribeEvent
        public static void registerTabs(BuildCreativeModeTabContentsEvent event) {
            if (event.getTabKey() == ModCreativeTab.TAB.getKey()) {
                for (RegistryObject<Item> item : ModItems.ITEMS.getEntries()) {
                    event.accept(item.get());
                }
            }
        }
    }

}
