package com.rempler.rfd.api;

import com.rempler.rfd.ResourcesForDays;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;

@SuppressWarnings("unused")
public class DefaultMaterials {
    private static final String MODID = ResourcesForDays.MODID;
    public static final MaterialRegistry<GeneratorMaterial> T1_GENERATORS = new MaterialRegistry<>("generator", "t1");
    public static final MaterialRegistry<GeneratorMaterial> T2_GENERATORS = new MaterialRegistry<>("generator", "t2");
    public static final MaterialRegistry<GeneratorMaterial> T3_GENERATORS = new MaterialRegistry<>("generator", "t3");
    public static final MaterialRegistry<GeneratorMaterial> T4_GENERATORS = new MaterialRegistry<>("generator", "t4");
    public static final MaterialRegistry<GeneratorMaterial> T5_GENERATORS = new MaterialRegistry<>("generator", "t5");
    public static final MaterialRegistry<DyeGeneratorMaterial> T1_DYE_GENERATORS = new MaterialRegistry<>("dye_generator", "t1");
    public static final MaterialRegistry<DyeGeneratorMaterial> T2_DYE_GENERATORS = new MaterialRegistry<>("dye_generator", "t2");
    public static final MaterialRegistry<DyeGeneratorMaterial> T3_DYE_GENERATORS = new MaterialRegistry<>("dye_generator", "t3");
    public static final MaterialRegistry<DyeGeneratorMaterial> T4_DYE_GENERATORS = new MaterialRegistry<>("dye_generator", "t4");
    public static final MaterialRegistry<DyeGeneratorMaterial> T5_DYE_GENERATORS = new MaterialRegistry<>("dye_generator", "t5");
    public static final MaterialRegistry<OreGeneratorMaterial> T1_ORE_GENERATORS = new MaterialRegistry<>("ore_generator", "t1");
    public static final MaterialRegistry<OreGeneratorMaterial> T2_ORE_GENERATORS = new MaterialRegistry<>("ore_generator", "t2");
    public static final MaterialRegistry<OreGeneratorMaterial> T3_ORE_GENERATORS = new MaterialRegistry<>("ore_generator", "t3");
    public static final MaterialRegistry<OreGeneratorMaterial> T4_ORE_GENERATORS = new MaterialRegistry<>("ore_generator", "t4");
    public static final MaterialRegistry<OreGeneratorMaterial> T5_ORE_GENERATORS = new MaterialRegistry<>("ore_generator", "t5");

    public static final GeneratorMaterial COBBLE_GEN_T1 = addDefaultT1Generator("cobble", MODID, 15, Items.COBBLESTONE, Blocks.COBBLESTONE);
    public static final GeneratorMaterial COBBLE_GEN_T2 = addDefaultT2Generator("cobble", MODID, 15, Items.COBBLESTONE, Blocks.COBBLESTONE);
    public static final GeneratorMaterial COBBLE_GEN_T3 = addDefaultT3Generator("cobble", MODID, 15, Items.COBBLESTONE, Blocks.COBBLESTONE);
    public static final GeneratorMaterial COBBLE_GEN_T4 = addDefaultT4Generator("cobble", MODID, 15, Items.COBBLESTONE, Blocks.COBBLESTONE);
    public static final GeneratorMaterial COBBLE_GEN_T5 = addDefaultT5Generator("cobble", MODID, 15, Items.COBBLESTONE, Blocks.COBBLESTONE);
    public static final GeneratorMaterial CLAY_GEN_T1 = addDefaultT1Generator("clay", MODID, 8, Items.CLAY_BALL, Blocks.CLAY);
    public static final GeneratorMaterial CLAY_GEN_T2 = addDefaultT2Generator("clay", MODID, 8, Items.CLAY_BALL, Blocks.CLAY);
    public static final GeneratorMaterial CLAY_GEN_T3 = addDefaultT3Generator("clay", MODID, 8, Items.CLAY_BALL, Blocks.CLAY);
    public static final GeneratorMaterial CLAY_GEN_T4 = addDefaultT4Generator("clay", MODID, 8, Items.CLAY_BALL, Blocks.CLAY);
    public static final GeneratorMaterial CLAY_GEN_T5 = addDefaultT5Generator("clay", MODID, 8, Items.CLAY_BALL, Blocks.CLAY);
    public static final GeneratorMaterial CLEAN_GEN_T1 = addDefaultT1Generator("clean", MODID, 15, Items.STONE, Blocks.STONE);
    public static final GeneratorMaterial CLEAN_GEN_T2 = addDefaultT2Generator("clean", MODID, 15, Items.STONE, Blocks.STONE);
    public static final GeneratorMaterial CLEAN_GEN_T3 = addDefaultT3Generator("clean", MODID, 15, Items.STONE, Blocks.STONE);
    public static final GeneratorMaterial CLEAN_GEN_T4 = addDefaultT4Generator("clean", MODID, 15, Items.STONE, Blocks.STONE);
    public static final GeneratorMaterial CLEAN_GEN_T5 = addDefaultT5Generator("clean", MODID, 15, Items.STONE, Blocks.STONE);
    public static final GeneratorMaterial DIRT_GEN_T1 = addDefaultT1Generator("dirt", MODID, 8, Items.DIRT, Blocks.DIRT);
    public static final GeneratorMaterial DIRT_GEN_T2 = addDefaultT2Generator("dirt", MODID, 8, Items.DIRT, Blocks.DIRT);
    public static final GeneratorMaterial DIRT_GEN_T3 = addDefaultT3Generator("dirt", MODID, 8, Items.DIRT, Blocks.DIRT);
    public static final GeneratorMaterial DIRT_GEN_T4 = addDefaultT4Generator("dirt", MODID, 8, Items.DIRT, Blocks.DIRT);
    public static final GeneratorMaterial DIRT_GEN_T5 = addDefaultT5Generator("dirt", MODID, 8, Items.DIRT, Blocks.DIRT);
    public static final GeneratorMaterial END_GEN_T1 = addDefaultT1Generator("end_stone", MODID, 15, Items.END_STONE, Blocks.END_STONE);
    public static final GeneratorMaterial END_GEN_T2 = addDefaultT2Generator("end_stone", MODID, 15, Items.END_STONE, Blocks.END_STONE);
    public static final GeneratorMaterial END_GEN_T3 = addDefaultT3Generator("end_stone", MODID, 15, Items.END_STONE, Blocks.END_STONE);
    public static final GeneratorMaterial END_GEN_T4 = addDefaultT4Generator("end_stone", MODID, 15, Items.END_STONE, Blocks.END_STONE);
    public static final GeneratorMaterial END_GEN_T5 = addDefaultT5Generator("end_stone", MODID, 15, Items.END_STONE, Blocks.END_STONE);
    public static final GeneratorMaterial MYCELIUM_GEN_T1 = addDefaultT1Generator("mycelium", MODID, 8, Items.MYCELIUM, Blocks.MYCELIUM);
    public static final GeneratorMaterial MYCELIUM_GEN_T2 = addDefaultT2Generator("mycelium", MODID, 8, Items.MYCELIUM, Blocks.MYCELIUM);
    public static final GeneratorMaterial MYCELIUM_GEN_T3 = addDefaultT3Generator("mycelium", MODID, 8, Items.MYCELIUM, Blocks.MYCELIUM);
    public static final GeneratorMaterial MYCELIUM_GEN_T4 = addDefaultT4Generator("mycelium", MODID, 8, Items.MYCELIUM, Blocks.MYCELIUM);
    public static final GeneratorMaterial MYCELIUM_GEN_T5 = addDefaultT5Generator("mycelium", MODID, 8, Items.MYCELIUM, Blocks.MYCELIUM);
    public static final GeneratorMaterial GLOWSTONE_GEN_T1 = addDefaultT1Generator("glowstone", MODID, 15, Items.GLOWSTONE_DUST, Blocks.GLOWSTONE);
    public static final GeneratorMaterial GLOWSTONE_GEN_T2 = addDefaultT2Generator("glowstone", MODID, 15, Items.GLOWSTONE_DUST, Blocks.GLOWSTONE);
    public static final GeneratorMaterial GLOWSTONE_GEN_T3 = addDefaultT3Generator("glowstone", MODID, 15, Items.GLOWSTONE_DUST, Blocks.GLOWSTONE);
    public static final GeneratorMaterial GLOWSTONE_GEN_T4 = addDefaultT4Generator("glowstone", MODID, 15, Items.GLOWSTONE_DUST, Blocks.GLOWSTONE);
    public static final GeneratorMaterial GLOWSTONE_GEN_T5 = addDefaultT5Generator("glowstone", MODID, 15, Items.GLOWSTONE_DUST, Blocks.GLOWSTONE);
    public static final GeneratorMaterial GRASS_GEN_T1 = addDefaultT1Generator("grass", MODID, 8, Items.GRASS_BLOCK, Blocks.GRASS_BLOCK);
    public static final GeneratorMaterial GRASS_GEN_T2 = addDefaultT2Generator("grass", MODID, 8, Items.GRASS_BLOCK, Blocks.GRASS_BLOCK);
    public static final GeneratorMaterial GRASS_GEN_T3 = addDefaultT3Generator("grass", MODID, 8, Items.GRASS_BLOCK, Blocks.GRASS_BLOCK);
    public static final GeneratorMaterial GRASS_GEN_T4 = addDefaultT4Generator("grass", MODID, 8, Items.GRASS_BLOCK, Blocks.GRASS_BLOCK);
    public static final GeneratorMaterial GRASS_GEN_T5 = addDefaultT5Generator("grass", MODID, 8, Items.GRASS_BLOCK, Blocks.GRASS_BLOCK);
    public static final GeneratorMaterial GRAVEL_GEN_T1 = addDefaultT1Generator("gravel", MODID, 15, Items.GRAVEL, Blocks.GRAVEL);
    public static final GeneratorMaterial GRAVEL_GEN_T2 = addDefaultT2Generator("gravel", MODID, 15, Items.GRAVEL, Blocks.GRAVEL);
    public static final GeneratorMaterial GRAVEL_GEN_T3 = addDefaultT3Generator("gravel", MODID, 15, Items.GRAVEL, Blocks.GRAVEL);
    public static final GeneratorMaterial GRAVEL_GEN_T4 = addDefaultT4Generator("gravel", MODID, 15, Items.GRAVEL, Blocks.GRAVEL);
    public static final GeneratorMaterial GRAVEL_GEN_T5 = addDefaultT5Generator("gravel", MODID, 15, Items.GRAVEL, Blocks.GRAVEL);
    public static final GeneratorMaterial ICE_GEN_T1 = addDefaultT1Generator("ice", MODID, 8, Items.ICE, Blocks.ICE);
    public static final GeneratorMaterial ICE_GEN_T2 = addDefaultT2Generator("ice", MODID, 8, Items.ICE, Blocks.ICE);
    public static final GeneratorMaterial ICE_GEN_T3 = addDefaultT3Generator("ice", MODID, 8, Items.ICE, Blocks.ICE);
    public static final GeneratorMaterial ICE_GEN_T4 = addDefaultT4Generator("ice", MODID, 8, Items.ICE, Blocks.ICE);
    public static final GeneratorMaterial ICE_GEN_T5 = addDefaultT5Generator("ice", MODID, 8, Items.ICE, Blocks.ICE);
    public static final GeneratorMaterial NETHERRACK_GEN_T1 = addDefaultT1Generator("netherrack", MODID, 15, Items.NETHERRACK, Blocks.NETHERRACK);
    public static final GeneratorMaterial NETHERRACK_GEN_T2 = addDefaultT2Generator("netherrack", MODID, 15, Items.NETHERRACK, Blocks.NETHERRACK);
    public static final GeneratorMaterial NETHERRACK_GEN_T3 = addDefaultT3Generator("netherrack", MODID, 15, Items.NETHERRACK, Blocks.NETHERRACK);
    public static final GeneratorMaterial NETHERRACK_GEN_T4 = addDefaultT4Generator("netherrack", MODID, 15, Items.NETHERRACK, Blocks.NETHERRACK);
    public static final GeneratorMaterial NETHERRACK_GEN_T5 = addDefaultT5Generator("netherrack", MODID, 15, Items.NETHERRACK, Blocks.NETHERRACK);
    public static final GeneratorMaterial OBSIDIAN_GEN_T1 = addDefaultT1Generator("obsidian", MODID, 15, Items.OBSIDIAN, Blocks.OBSIDIAN);
    public static final GeneratorMaterial OBSIDIAN_GEN_T2 = addDefaultT2Generator("obsidian", MODID, 15, Items.OBSIDIAN, Blocks.OBSIDIAN);
    public static final GeneratorMaterial OBSIDIAN_GEN_T3 = addDefaultT3Generator("obsidian", MODID, 15, Items.OBSIDIAN, Blocks.OBSIDIAN);
    public static final GeneratorMaterial OBSIDIAN_GEN_T4 = addDefaultT4Generator("obsidian", MODID, 15, Items.OBSIDIAN, Blocks.OBSIDIAN);
    public static final GeneratorMaterial OBSIDIAN_GEN_T5 = addDefaultT5Generator("obsidian", MODID, 15, Items.OBSIDIAN, Blocks.OBSIDIAN);
    public static final GeneratorMaterial QUARTZ_GEN_T1 = addDefaultT1Generator("quartz", MODID, 15, Items.QUARTZ, Blocks.QUARTZ_BLOCK);
    public static final GeneratorMaterial QUARTZ_GEN_T2 = addDefaultT2Generator("quartz", MODID, 15, Items.QUARTZ, Blocks.QUARTZ_BLOCK);
    public static final GeneratorMaterial QUARTZ_GEN_T3 = addDefaultT3Generator("quartz", MODID, 15, Items.QUARTZ, Blocks.QUARTZ_BLOCK);
    public static final GeneratorMaterial QUARTZ_GEN_T4 = addDefaultT4Generator("quartz", MODID, 15, Items.QUARTZ, Blocks.QUARTZ_BLOCK);
    public static final GeneratorMaterial QUARTZ_GEN_T5 = addDefaultT5Generator("quartz", MODID, 15, Items.QUARTZ, Blocks.QUARTZ_BLOCK);
    public static final GeneratorMaterial REDSTONE_GEN_T1 = addDefaultT1Generator("redstone", MODID, 15, Items.REDSTONE, Blocks.REDSTONE_BLOCK);
    public static final GeneratorMaterial REDSTONE_GEN_T2 = addDefaultT2Generator("redstone", MODID, 15, Items.REDSTONE, Blocks.REDSTONE_BLOCK);
    public static final GeneratorMaterial REDSTONE_GEN_T3 = addDefaultT3Generator("redstone", MODID, 15, Items.REDSTONE, Blocks.REDSTONE_BLOCK);
    public static final GeneratorMaterial REDSTONE_GEN_T4 = addDefaultT4Generator("redstone", MODID, 15, Items.REDSTONE, Blocks.REDSTONE_BLOCK);
    public static final GeneratorMaterial REDSTONE_GEN_T5 = addDefaultT5Generator("redstone", MODID, 15, Items.REDSTONE, Blocks.REDSTONE_BLOCK);
    public static final GeneratorMaterial SAND_GEN_T1 = addDefaultT1Generator("sand", MODID, 15, Items.SAND, Blocks.SAND);
    public static final GeneratorMaterial SAND_GEN_T2 = addDefaultT2Generator("sand", MODID, 15, Items.SAND, Blocks.SAND);
    public static final GeneratorMaterial SAND_GEN_T3 = addDefaultT3Generator("sand", MODID, 15, Items.SAND, Blocks.SAND);
    public static final GeneratorMaterial SAND_GEN_T4 = addDefaultT4Generator("sand", MODID, 15, Items.SAND, Blocks.SAND);
    public static final GeneratorMaterial SAND_GEN_T5 = addDefaultT5Generator("sand", MODID, 15, Items.SAND, Blocks.SAND);
    public static final GeneratorMaterial SNOW_GEN_T1 = addDefaultT1Generator("snow", MODID, 8, Items.SNOWBALL, Blocks.SNOW_BLOCK);
    public static final GeneratorMaterial SNOW_GEN_T2 = addDefaultT2Generator("snow", MODID, 8, Items.SNOWBALL, Blocks.SNOW_BLOCK);
    public static final GeneratorMaterial SNOW_GEN_T3 = addDefaultT3Generator("snow", MODID, 8, Items.SNOWBALL, Blocks.SNOW_BLOCK);
    public static final GeneratorMaterial SNOW_GEN_T4 = addDefaultT4Generator("snow", MODID, 8, Items.SNOWBALL, Blocks.SNOW_BLOCK);
    public static final GeneratorMaterial SNOW_GEN_T5 = addDefaultT5Generator("snow", MODID, 8, Items.SNOWBALL, Blocks.SNOW_BLOCK);
    public static final GeneratorMaterial SOUL_SAND_GEN_T1 = addDefaultT1Generator("soul_sand", MODID, 15, Items.SOUL_SAND, Blocks.SOUL_SAND);
    public static final GeneratorMaterial SOUL_SAND_GEN_T2 = addDefaultT2Generator("soul_sand", MODID, 15, Items.SOUL_SAND, Blocks.SOUL_SAND);
    public static final GeneratorMaterial SOUL_SAND_GEN_T3 = addDefaultT3Generator("soul_sand", MODID, 15, Items.SOUL_SAND, Blocks.SOUL_SAND);
    public static final GeneratorMaterial SOUL_SAND_GEN_T4 = addDefaultT4Generator("soul_sand", MODID, 15, Items.SOUL_SAND, Blocks.SOUL_SAND);
    public static final GeneratorMaterial SOUL_SAND_GEN_T5 = addDefaultT5Generator("soul_sand", MODID, 15, Items.SOUL_SAND, Blocks.SOUL_SAND);

    public static final OreGeneratorMaterial ORE_GEN_T1 = addDefaultOreGenerator(SoundType.WOOD, 1.5f, 1);
    public static final OreGeneratorMaterial ORE_GEN_T2 = addDefaultOreGenerator(SoundType.STONE, 2f, 2);
    public static final OreGeneratorMaterial ORE_GEN_T3 = addDefaultOreGenerator(SoundType.METAL, 3f, 3);
    public static final OreGeneratorMaterial ORE_GEN_T4 = addDefaultOreGenerator(SoundType.METAL, 3f, 4);
    public static final OreGeneratorMaterial ORE_GEN_T5 = addDefaultOreGenerator(SoundType.METAL, 3f, 5);
    public static final DyeGeneratorMaterial DYE_GEN_T1 = addDefaultDyeGenerator(SoundType.WOOD, 1.5f, 1);
    public static final DyeGeneratorMaterial DYE_GEN_T2 = addDefaultDyeGenerator(SoundType.STONE, 2f, 2);
    public static final DyeGeneratorMaterial DYE_GEN_T3 = addDefaultDyeGenerator(SoundType.METAL, 3f, 3);
    public static final DyeGeneratorMaterial DYE_GEN_T4 = addDefaultDyeGenerator(SoundType.METAL, 3f, 4);
    public static final DyeGeneratorMaterial DYE_GEN_T5 = addDefaultDyeGenerator(SoundType.METAL, 3f, 5);

    // EXNIHILO
    private static final String EXNIHILO_MODID = "exnihilosequentia";
    private static final Block dust = BuiltInRegistries.BLOCK.get(ResourceLocation.parse(EXNIHILO_MODID+":dust"));
    public static final GeneratorMaterial DUST_GEN_T1 = addDefaultT1Generator("dust", EXNIHILO_MODID, 15, dust.asItem(), dust);
    public static final GeneratorMaterial DUST_GEN_T2 = addDefaultT2Generator("dust", EXNIHILO_MODID, 15, dust.asItem(), dust);
    public static final GeneratorMaterial DUST_GEN_T3 = addDefaultT3Generator("dust", EXNIHILO_MODID, 15, dust.asItem(), dust);
    public static final GeneratorMaterial DUST_GEN_T4 = addDefaultT4Generator("dust", EXNIHILO_MODID, 15, dust.asItem(), dust);
    public static final GeneratorMaterial DUST_GEN_T5 = addDefaultT5Generator("dust", EXNIHILO_MODID, 15, dust.asItem(), dust);
    private static final Block netherrack = BuiltInRegistries.BLOCK.get(ResourceLocation.parse(EXNIHILO_MODID+":crushed_netherrack"));
    public static final GeneratorMaterial CRUSHED_NETHERRACK_GEN_T1 = addDefaultT1Generator("crushed_netherrack", EXNIHILO_MODID, 15, netherrack.asItem(), netherrack);
    public static final GeneratorMaterial CRUSHED_NETHERRACK_GEN_T2 = addDefaultT2Generator("crushed_netherrack", EXNIHILO_MODID, 15, netherrack.asItem(), netherrack);
    public static final GeneratorMaterial CRUSHED_NETHERRACK_GEN_T3 = addDefaultT3Generator("crushed_netherrack", EXNIHILO_MODID, 15, netherrack.asItem(), netherrack);
    public static final GeneratorMaterial CRUSHED_NETHERRACK_GEN_T4 = addDefaultT4Generator("crushed_netherrack", EXNIHILO_MODID, 15, netherrack.asItem(), netherrack);
    public static final GeneratorMaterial CRUSHED_NETHERRACK_GEN_T5 = addDefaultT5Generator("crushed_netherrack", EXNIHILO_MODID, 15, netherrack.asItem(), netherrack);
    private static final Block endstone = BuiltInRegistries.BLOCK.get(ResourceLocation.parse(EXNIHILO_MODID+":crushed_end_stone"));
    public static final GeneratorMaterial CRUSHED_END_STONE_GEN_T1 = addDefaultT1Generator("crushed_end_stone", EXNIHILO_MODID, 15, endstone.asItem(), endstone);
    public static final GeneratorMaterial CRUSHED_END_STONE_GEN_T2 = addDefaultT2Generator("crushed_end_stone", EXNIHILO_MODID, 15, endstone.asItem(), endstone);
    public static final GeneratorMaterial CRUSHED_END_STONE_GEN_T3 = addDefaultT3Generator("crushed_end_stone", EXNIHILO_MODID, 15, endstone.asItem(), endstone);
    public static final GeneratorMaterial CRUSHED_END_STONE_GEN_T4 = addDefaultT4Generator("crushed_end_stone", EXNIHILO_MODID, 15, endstone.asItem(), endstone);
    public static final GeneratorMaterial CRUSHED_END_STONE_GEN_T5 = addDefaultT5Generator("crushed_end_stone", EXNIHILO_MODID, 15, endstone.asItem(), endstone);


    private static GeneratorMaterial addDefaultT1Generator(String name, String requiredModId, int lightLevel, ItemLike item, Block block) {
        return addDefaultGenerator(name, 1.5f, false, requiredModId, 1, lightLevel, item, block, SoundType.WOOD);
    }
    private static GeneratorMaterial addDefaultT2Generator(String name, String requiredModId, int lightLevel, ItemLike item, Block block) {
        return addDefaultGenerator(name, 2.0f, true, requiredModId, 2, lightLevel, item, block, SoundType.STONE);
    }
    private static GeneratorMaterial addDefaultT3Generator(String name, String requiredModId, int lightLevel, ItemLike item, Block block) {
        return addDefaultGenerator(name, 3.0f, true, requiredModId, 3, lightLevel, item, block, SoundType.METAL);
    }
    private static GeneratorMaterial addDefaultT4Generator(String name, String requiredModId, int lightLevel, ItemLike item, Block block) {
        return addDefaultGenerator(name, 3.0f, true, requiredModId, 4, lightLevel, item, block, SoundType.METAL);
    }
    private static GeneratorMaterial addDefaultT5Generator(String name, String requiredModId, int lightLevel, ItemLike item, Block block) {
        return addDefaultGenerator(name, 3.0f, true, requiredModId, 5, lightLevel, item, block, SoundType.METAL);
    }

    private static GeneratorMaterial addDefaultGenerator(String name, float strength, boolean needsCorrectTool, String requiredModId, int tier, int lightLevel, ItemLike item, Block block, SoundType soundType) {
        var material = new GeneratorMaterial(strength, needsCorrectTool, requiredModId, tier, lightLevel, item, block, soundType);
        switch (tier) {
            case 1 -> T1_GENERATORS.register(name, material);
            case 2 -> T2_GENERATORS.register(name, material);
            case 3 -> T3_GENERATORS.register(name, material);
            case 4 -> T4_GENERATORS.register(name, material);
            case 5 -> T5_GENERATORS.register(name, material);
            default -> throw new IllegalArgumentException("Unknown Tier: " + tier);
        }
        return material;
    }

    private static DyeGeneratorMaterial addDefaultDyeGenerator(SoundType soundType, float strength, int tier) {
        var material = new DyeGeneratorMaterial(soundType, strength, true, DefaultMaterials.MODID, tier, 8);
        switch (tier) {
            case 1 -> T1_DYE_GENERATORS.register("dye", material);
            case 2 -> T2_DYE_GENERATORS.register("dye", material);
            case 3 -> T3_DYE_GENERATORS.register("dye", material);
            case 4 -> T4_DYE_GENERATORS.register("dye", material);
            case 5 -> T5_DYE_GENERATORS.register("dye", material);
            default -> throw new IllegalArgumentException("Unknown Tier: " + tier);
        }
        return material;
    }

    private static OreGeneratorMaterial addDefaultOreGenerator(SoundType soundType, float strength, int tier) {
        var material = new OreGeneratorMaterial(soundType, strength, true, DefaultMaterials.MODID, tier, 15);
        switch (tier) {
            case 1 -> T1_ORE_GENERATORS.register("ore", material);
            case 2 -> T2_ORE_GENERATORS.register("ore", material);
            case 3 -> T3_ORE_GENERATORS.register("ore", material);
            case 4 -> T4_ORE_GENERATORS.register("ore", material);
            case 5 -> T5_ORE_GENERATORS.register("ore", material);
            default -> throw new IllegalArgumentException("Unknown Tier: " + tier);
        }
        return material;
    }

    // This call initializes the DefaultMaterials fields as well as searching for user-defined ones in the appropriate places
    public static void registerMaterials() {
        T1_GENERATORS.search((parser) -> GeneratorMaterial.readFromJson(parser, 1, SoundType.WOOD));
        T2_GENERATORS.search((parser) -> GeneratorMaterial.readFromJson(parser, 2, SoundType.STONE));
        T3_GENERATORS.search((parser) -> GeneratorMaterial.readFromJson(parser, 3, SoundType.METAL));
        T4_GENERATORS.search((parser) -> GeneratorMaterial.readFromJson(parser, 4, SoundType.METAL));
        T5_GENERATORS.search((parser) -> GeneratorMaterial.readFromJson(parser, 5, SoundType.METAL));;
        T1_DYE_GENERATORS.search(DyeGeneratorMaterial::readFromJson);
        T2_DYE_GENERATORS.search(DyeGeneratorMaterial::readFromJson);
        T3_DYE_GENERATORS.search(DyeGeneratorMaterial::readFromJson);
        T4_DYE_GENERATORS.search(DyeGeneratorMaterial::readFromJson);
        T5_DYE_GENERATORS.search(DyeGeneratorMaterial::readFromJson);
        T1_ORE_GENERATORS.search(OreGeneratorMaterial::readFromJson);
        T2_ORE_GENERATORS.search(OreGeneratorMaterial::readFromJson);
        T3_ORE_GENERATORS.search(OreGeneratorMaterial::readFromJson);
        T4_ORE_GENERATORS.search(OreGeneratorMaterial::readFromJson);
        T5_ORE_GENERATORS.search(OreGeneratorMaterial::readFromJson);
    }
}
