package com.rempler.rfd;

import com.rempler.rfd.setup.ClientSetup;
import com.rempler.rfd.setup.Config;
import com.rempler.rfd.setup.ModBE;
import com.rempler.rfd.setup.ModBlocks;
import com.rempler.rfd.setup.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

@Mod("rfd")
public class ResourcesForDays
{
    public static final String MODID = "rfd";
    public static CreativeModeTab itemGroup = new CreativeModeTab(ResourcesForDays.MODID) {

        @Override
        public @NotNull ItemStack makeIcon(){
            return new ItemStack(ModItems.CLAY_ITEM_T1.get());
        }

    };

    public static final Logger LOGGER = LogManager.getLogger();
    private static final IEventBus EVENT_BUS = FMLJavaModLoadingContext.get().getModEventBus();

    public ResourcesForDays() {
        LOGGER.info("Starting RfD");
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, Config.CLIENT_CONFIG);
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.COMMON_CONFIG);

        ModItems.init(EVENT_BUS);
        ModBlocks.init(EVENT_BUS);
        ModBE.init(EVENT_BUS);

        EVENT_BUS.addListener(ClientSetup::setupClient);

        Config.loadConfig(Config.COMMON_CONFIG, FMLPaths.CONFIGDIR.get().resolve("rfd-common.toml"));
    }

}
