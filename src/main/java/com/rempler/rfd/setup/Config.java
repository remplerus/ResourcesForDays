package com.rempler.rfd.setup;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import com.google.common.base.Predicates;
import com.google.common.collect.Lists;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.common.Mod;

import java.nio.file.Path;
import java.util.List;

@Mod.EventBusSubscriber
public class Config {

    public static final String CATEGORY_GENERAL = "general";
    public static final String CATEGORY_OREGEN = "oregenerator";

    private static final ForgeConfigSpec.Builder COMMON_BUILDER = new ForgeConfigSpec.Builder();
    public static ForgeConfigSpec COMMON_CONFIG;

    public static ForgeConfigSpec.BooleanValue GENERATE_DUST;
    public static ForgeConfigSpec.BooleanValue ENABLE_ORE_GENERATOR;
    public static ForgeConfigSpec.BooleanValue ENABLE_DYE_GENERATOR;
    public static ForgeConfigSpec.ConfigValue<List<? extends String>> ORE_GENERATOR_ITEMS;

    public static Tiers tier1;
    public static Tiers tier2;
    public static Tiers tier3;
    public static Tiers tier4;
    public static Tiers tier5;

    static {
        COMMON_BUILDER.comment("General Settings").push(CATEGORY_GENERAL);
        GENERATE_DUST = COMMON_BUILDER.comment("Clay, Glowstone, Quartz, Redstone and Snow Generators will generate dust items, not blocks.").define("generate_dust", false);
        ENABLE_ORE_GENERATOR = COMMON_BUILDER.comment("Enable the Ore Generator.").define("oreGeneratorEnable", true);
        ENABLE_DYE_GENERATOR = COMMON_BUILDER.comment("Enable the Dye Generator.").define("dyeGeneratorEnable", true);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("OreGenerator Probabilities").push(CATEGORY_OREGEN);
        ORE_GENERATOR_ITEMS = COMMON_BUILDER
                .comment("Comma separated list of the items and probabilities (probability value between 0.00 and 1.00) to be used in the Ore Generator, format to use: \"modid:itemname*probability\" e.g. \"minecraft:iron_ore*0.45\"")
                .defineList("oreGeneratorItems", 
            		Lists.newArrayList("minecraft:coal_ore*0.50", "minecraft:iron_ore*0.45", "minecraft:gold_ore*0.25", "minecraft:lapis_ore*0.10", "minecraft:redstone_ore*0.10", "minecraft:diamond_ore*0.05", "minecraft:emerald_ore*0.02", "minecraft:nether_quartz_ore*0.00", "minecraft:ancient_debris*0.01", "minecraft:copper_ore*0.40", "minecraft:deepslate_coal_ore*0.49", "minecraft:deepslate_iron_ore*0.44", "minecraft:deepslate_copper_ore*0.39", "minecraft:deepslate_gold_ore*0.24", "minecraft:deepslate_lapis_ore*0.09", "minecraft:deepslate_redstone_ore*0.09", "minecraft:deepslate_diamond_ore*0.04", "minecraft:deepslate_emerald_ore*0.01"), Predicates.alwaysTrue());
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("Generator Settings").push("gensettings");
        tier1 = new Tiers(COMMON_BUILDER, "1", 100);
        tier2 = new Tiers(COMMON_BUILDER, "2", 80);
        tier3 = new Tiers(COMMON_BUILDER, "3", 60);
        tier4 = new Tiers(COMMON_BUILDER, "4", 40);
        tier5 = new Tiers(COMMON_BUILDER, "5", 20);
        COMMON_BUILDER.pop();

        COMMON_CONFIG = COMMON_BUILDER.build();
    }

    public static class Tiers {
        public final ForgeConfigSpec.IntValue interval;
        Tiers(ForgeConfigSpec.Builder builder, String tier, int interval) {
            builder.comment("Tier: " + tier)
                    .push(tier);
            this.interval = builder.comment("Ticks between every generation update.")
                    .worldRestart()
                    .defineInRange("interval", interval, 1, Integer.MAX_VALUE);
            builder.pop();
        }
    }

    public static void loadConfig(ForgeConfigSpec spec, Path path) {
        final CommentedFileConfig configData = CommentedFileConfig.builder(path)
                .sync()
                .autosave()
                .writingMode(WritingMode.REPLACE)
                .build();
        configData.load();
        spec.setConfig(configData);
    }
}
