package com.rempler.rfd.setup;

import com.rempler.rfd.ResourcesForDays;
import com.rempler.rfd.blocks.BaseGenerator;
import com.rempler.rfd.blocks.DyeGenerator;
import com.rempler.rfd.blocks.OreGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import novamachina.exnihilosequentia.world.level.block.EXNBlocks;
import novamachina.novacore.world.level.block.BlockDefinition;

import javax.annotation.Nonnull;

public class ModBlocks {
    private ModBlocks(){}
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ResourcesForDays.MODID);

    public static final RegistryObject<BaseGenerator> COBBLE_GEN_T1 = BLOCKS.register("cobble_gen_tier_1", () -> make15Generator(1, Blocks.COBBLESTONE));
    public static final RegistryObject<BaseGenerator> COBBLE_GEN_T2 = BLOCKS.register("cobble_gen_tier_2", () -> make15Generator(2, Blocks.COBBLESTONE));
    public static final RegistryObject<BaseGenerator> COBBLE_GEN_T3 = BLOCKS.register("cobble_gen_tier_3", () -> make15Generator(3, Blocks.COBBLESTONE));
    public static final RegistryObject<BaseGenerator> COBBLE_GEN_T4 = BLOCKS.register("cobble_gen_tier_4", () -> make15Generator(4, Blocks.COBBLESTONE));
    public static final RegistryObject<BaseGenerator> COBBLE_GEN_T5 = BLOCKS.register("cobble_gen_tier_5", () -> make15Generator(5, Blocks.COBBLESTONE));
    public static final RegistryObject<BaseGenerator> CLAY_GEN_T1 = BLOCKS.register("clay_gen_tier_1", () -> makeGenerator(8, 1, Items.CLAY_BALL, Blocks.CLAY));
    public static final RegistryObject<BaseGenerator> CLAY_GEN_T2 = BLOCKS.register("clay_gen_tier_2", () -> makeGenerator(8, 2, Items.CLAY_BALL, Blocks.CLAY));
    public static final RegistryObject<BaseGenerator> CLAY_GEN_T3 = BLOCKS.register("clay_gen_tier_3", () -> makeGenerator(8, 3, Items.CLAY_BALL, Blocks.CLAY));
    public static final RegistryObject<BaseGenerator> CLAY_GEN_T4 = BLOCKS.register("clay_gen_tier_4", () -> makeGenerator(8, 4, Items.CLAY_BALL, Blocks.CLAY));
    public static final RegistryObject<BaseGenerator> CLAY_GEN_T5 = BLOCKS.register("clay_gen_tier_5", () -> makeGenerator(8, 5, Items.CLAY_BALL, Blocks.CLAY));
    public static final RegistryObject<BaseGenerator> CLEAN_GEN_T1 = BLOCKS.register("clean_gen_tier_1", () -> make15Generator(1, Blocks.STONE));
    public static final RegistryObject<BaseGenerator> CLEAN_GEN_T2 = BLOCKS.register("clean_gen_tier_2", () -> make15Generator(2, Blocks.STONE));
    public static final RegistryObject<BaseGenerator> CLEAN_GEN_T3 = BLOCKS.register("clean_gen_tier_3", () -> make15Generator(3, Blocks.STONE));
    public static final RegistryObject<BaseGenerator> CLEAN_GEN_T4 = BLOCKS.register("clean_gen_tier_4", () -> make15Generator(4, Blocks.STONE));
    public static final RegistryObject<BaseGenerator> CLEAN_GEN_T5 = BLOCKS.register("clean_gen_tier_5", () -> make15Generator(5, Blocks.STONE));
    public static final RegistryObject<BaseGenerator> DIRT_GEN_T1 = BLOCKS.register("dirt_gen_tier_1", () -> make8Generator(1, Blocks.DIRT));
    public static final RegistryObject<BaseGenerator> DIRT_GEN_T2 = BLOCKS.register("dirt_gen_tier_2", () -> make8Generator(2, Blocks.DIRT));
    public static final RegistryObject<BaseGenerator> DIRT_GEN_T3 = BLOCKS.register("dirt_gen_tier_3", () -> make8Generator(3, Blocks.DIRT));
    public static final RegistryObject<BaseGenerator> DIRT_GEN_T4 = BLOCKS.register("dirt_gen_tier_4", () -> make8Generator(4, Blocks.DIRT));
    public static final RegistryObject<BaseGenerator> DIRT_GEN_T5 = BLOCKS.register("dirt_gen_tier_5", () -> make8Generator(5, Blocks.DIRT));
    public static final RegistryObject<BaseGenerator> END_GEN_T1 = BLOCKS.register("end_gen_tier_1", () -> make15Generator(1, Blocks.END_STONE));
    public static final RegistryObject<BaseGenerator> END_GEN_T2 = BLOCKS.register("end_gen_tier_2", () -> make15Generator(2, Blocks.END_STONE));
    public static final RegistryObject<BaseGenerator> END_GEN_T3 = BLOCKS.register("end_gen_tier_3", () -> make15Generator(3, Blocks.END_STONE));
    public static final RegistryObject<BaseGenerator> END_GEN_T4 = BLOCKS.register("end_gen_tier_4", () -> make15Generator(4, Blocks.END_STONE));
    public static final RegistryObject<BaseGenerator> END_GEN_T5 = BLOCKS.register("end_gen_tier_5", () -> make15Generator(5, Blocks.END_STONE));
    public static final RegistryObject<BaseGenerator> FUNGUS_GEN_T1 = BLOCKS.register("fungus_gen_tier_1", () -> make8Generator(1, Blocks.MYCELIUM));
    public static final RegistryObject<BaseGenerator> FUNGUS_GEN_T2 = BLOCKS.register("fungus_gen_tier_2", () -> make8Generator(2, Blocks.MYCELIUM));
    public static final RegistryObject<BaseGenerator> FUNGUS_GEN_T3 = BLOCKS.register("fungus_gen_tier_3", () -> make8Generator(3, Blocks.MYCELIUM));
    public static final RegistryObject<BaseGenerator> FUNGUS_GEN_T4 = BLOCKS.register("fungus_gen_tier_4", () -> make8Generator(4, Blocks.MYCELIUM));
    public static final RegistryObject<BaseGenerator> FUNGUS_GEN_T5 = BLOCKS.register("fungus_gen_tier_5", () -> make8Generator(5, Blocks.MYCELIUM));
    public static final RegistryObject<BaseGenerator> GLOWSTONE_GEN_T1 = BLOCKS.register("glowstone_gen_tier_1", () -> makeGenerator(15, 1, Items.GLOWSTONE_DUST, Blocks.GLOWSTONE));
    public static final RegistryObject<BaseGenerator> GLOWSTONE_GEN_T2 = BLOCKS.register("glowstone_gen_tier_2", () -> makeGenerator(15, 2, Items.GLOWSTONE_DUST, Blocks.GLOWSTONE));
    public static final RegistryObject<BaseGenerator> GLOWSTONE_GEN_T3 = BLOCKS.register("glowstone_gen_tier_3", () -> makeGenerator(15, 3, Items.GLOWSTONE_DUST, Blocks.GLOWSTONE));
    public static final RegistryObject<BaseGenerator> GLOWSTONE_GEN_T4 = BLOCKS.register("glowstone_gen_tier_4", () -> makeGenerator(15, 4, Items.GLOWSTONE_DUST, Blocks.GLOWSTONE));
    public static final RegistryObject<BaseGenerator> GLOWSTONE_GEN_T5 = BLOCKS.register("glowstone_gen_tier_5", () -> makeGenerator(15, 5, Items.GLOWSTONE_DUST, Blocks.GLOWSTONE));
    public static final RegistryObject<BaseGenerator> GRASS_GEN_T1 = BLOCKS.register("grass_gen_tier_1", () -> make8Generator(1, Blocks.GRASS_BLOCK));
    public static final RegistryObject<BaseGenerator> GRASS_GEN_T2 = BLOCKS.register("grass_gen_tier_2", () -> make8Generator(2, Blocks.GRASS_BLOCK));
    public static final RegistryObject<BaseGenerator> GRASS_GEN_T3 = BLOCKS.register("grass_gen_tier_3", () -> make8Generator(3, Blocks.GRASS_BLOCK));
    public static final RegistryObject<BaseGenerator> GRASS_GEN_T4 = BLOCKS.register("grass_gen_tier_4", () -> make8Generator(4, Blocks.GRASS_BLOCK));
    public static final RegistryObject<BaseGenerator> GRASS_GEN_T5 = BLOCKS.register("grass_gen_tier_5", () -> make8Generator(5, Blocks.GRASS_BLOCK));
    public static final RegistryObject<BaseGenerator> GRAVEL_GEN_T1 = BLOCKS.register("gravel_gen_tier_1", () -> make15Generator(1, Blocks.GRAVEL));
    public static final RegistryObject<BaseGenerator> GRAVEL_GEN_T2 = BLOCKS.register("gravel_gen_tier_2", () -> make15Generator(2, Blocks.GRAVEL));
    public static final RegistryObject<BaseGenerator> GRAVEL_GEN_T3 = BLOCKS.register("gravel_gen_tier_3", () -> make15Generator(3, Blocks.GRAVEL));
    public static final RegistryObject<BaseGenerator> GRAVEL_GEN_T4 = BLOCKS.register("gravel_gen_tier_4", () -> make15Generator(4, Blocks.GRAVEL));
    public static final RegistryObject<BaseGenerator> GRAVEL_GEN_T5 = BLOCKS.register("gravel_gen_tier_5", () -> make15Generator(5, Blocks.GRAVEL));
    public static final RegistryObject<BaseGenerator> ICE_GEN_T1 = BLOCKS.register("ice_gen_tier_1", () -> make8Generator(1, Blocks.ICE));
    public static final RegistryObject<BaseGenerator> ICE_GEN_T2 = BLOCKS.register("ice_gen_tier_2", () -> make8Generator(2, Blocks.ICE));
    public static final RegistryObject<BaseGenerator> ICE_GEN_T3 = BLOCKS.register("ice_gen_tier_3", () -> make8Generator(3, Blocks.ICE));
    public static final RegistryObject<BaseGenerator> ICE_GEN_T4 = BLOCKS.register("ice_gen_tier_4", () -> make8Generator(4, Blocks.ICE));
    public static final RegistryObject<BaseGenerator> ICE_GEN_T5 = BLOCKS.register("ice_gen_tier_5", () -> make8Generator(5, Blocks.ICE));
    public static final RegistryObject<BaseGenerator> NETHERRACK_GEN_T1 = BLOCKS.register("netherrack_gen_tier_1", () -> make15Generator(1, Blocks.NETHERRACK));
    public static final RegistryObject<BaseGenerator> NETHERRACK_GEN_T2 = BLOCKS.register("netherrack_gen_tier_2", () -> make15Generator(2, Blocks.NETHERRACK));
    public static final RegistryObject<BaseGenerator> NETHERRACK_GEN_T3 = BLOCKS.register("netherrack_gen_tier_3", () -> make15Generator(3, Blocks.NETHERRACK));
    public static final RegistryObject<BaseGenerator> NETHERRACK_GEN_T4 = BLOCKS.register("netherrack_gen_tier_4", () -> make15Generator(4, Blocks.NETHERRACK));
    public static final RegistryObject<BaseGenerator> NETHERRACK_GEN_T5 = BLOCKS.register("netherrack_gen_tier_5", () -> make15Generator(5, Blocks.NETHERRACK));
    public static final RegistryObject<BaseGenerator> OBSIDIAN_GEN_T1 = BLOCKS.register("obsidian_gen_tier_1", () -> make15Generator(1, Blocks.OBSIDIAN));
    public static final RegistryObject<BaseGenerator> OBSIDIAN_GEN_T2 = BLOCKS.register("obsidian_gen_tier_2", () -> make15Generator(2, Blocks.OBSIDIAN));
    public static final RegistryObject<BaseGenerator> OBSIDIAN_GEN_T3 = BLOCKS.register("obsidian_gen_tier_3", () -> make15Generator(3, Blocks.OBSIDIAN));
    public static final RegistryObject<BaseGenerator> OBSIDIAN_GEN_T4 = BLOCKS.register("obsidian_gen_tier_4", () -> make15Generator(4, Blocks.OBSIDIAN));
    public static final RegistryObject<BaseGenerator> OBSIDIAN_GEN_T5 = BLOCKS.register("obsidian_gen_tier_5", () -> make15Generator(5, Blocks.OBSIDIAN));
    public static final RegistryObject<BaseGenerator> QUARTZ_GEN_T1 = BLOCKS.register("quartz_gen_tier_1", () -> makeGenerator(15, 1, Items.QUARTZ, Blocks.QUARTZ_BLOCK));
    public static final RegistryObject<BaseGenerator> QUARTZ_GEN_T2 = BLOCKS.register("quartz_gen_tier_2", () -> makeGenerator(15, 2, Items.QUARTZ, Blocks.QUARTZ_BLOCK));
    public static final RegistryObject<BaseGenerator> QUARTZ_GEN_T3 = BLOCKS.register("quartz_gen_tier_3", () -> makeGenerator(15, 3, Items.QUARTZ, Blocks.QUARTZ_BLOCK));
    public static final RegistryObject<BaseGenerator> QUARTZ_GEN_T4 = BLOCKS.register("quartz_gen_tier_4", () -> makeGenerator(15, 4, Items.QUARTZ, Blocks.QUARTZ_BLOCK));
    public static final RegistryObject<BaseGenerator> QUARTZ_GEN_T5 = BLOCKS.register("quartz_gen_tier_5", () -> makeGenerator(15, 5, Items.QUARTZ, Blocks.QUARTZ_BLOCK));
    public static final RegistryObject<BaseGenerator> REDSTONE_GEN_T1 = BLOCKS.register("redstone_gen_tier_1", () -> makeGenerator(15, 1, Items.REDSTONE, Blocks.REDSTONE_BLOCK));
    public static final RegistryObject<BaseGenerator> REDSTONE_GEN_T2 = BLOCKS.register("redstone_gen_tier_2", () -> makeGenerator(15, 2, Items.REDSTONE, Blocks.REDSTONE_BLOCK));
    public static final RegistryObject<BaseGenerator> REDSTONE_GEN_T3 = BLOCKS.register("redstone_gen_tier_3", () -> makeGenerator(15, 3, Items.REDSTONE, Blocks.REDSTONE_BLOCK));
    public static final RegistryObject<BaseGenerator> REDSTONE_GEN_T4 = BLOCKS.register("redstone_gen_tier_4", () -> makeGenerator(15, 4, Items.REDSTONE, Blocks.REDSTONE_BLOCK));
    public static final RegistryObject<BaseGenerator> REDSTONE_GEN_T5 = BLOCKS.register("redstone_gen_tier_5", () -> makeGenerator(15, 5, Items.REDSTONE, Blocks.REDSTONE_BLOCK));
    public static final RegistryObject<BaseGenerator> SAND_GEN_T1 = BLOCKS.register("sand_gen_tier_1", () -> make15Generator(1, Blocks.SAND));
    public static final RegistryObject<BaseGenerator> SAND_GEN_T2 = BLOCKS.register("sand_gen_tier_2", () -> make15Generator(2, Blocks.SAND));
    public static final RegistryObject<BaseGenerator> SAND_GEN_T3 = BLOCKS.register("sand_gen_tier_3", () -> make15Generator(3, Blocks.SAND));
    public static final RegistryObject<BaseGenerator> SAND_GEN_T4 = BLOCKS.register("sand_gen_tier_4", () -> make15Generator(4, Blocks.SAND));
    public static final RegistryObject<BaseGenerator> SAND_GEN_T5 = BLOCKS.register("sand_gen_tier_5", () -> make15Generator(5, Blocks.SAND));
    public static final RegistryObject<BaseGenerator> SNOW_GEN_T1 = BLOCKS.register("snow_gen_tier_1", () -> makeGenerator(8, 1, Items.SNOWBALL, Blocks.SNOW));
    public static final RegistryObject<BaseGenerator> SNOW_GEN_T2 = BLOCKS.register("snow_gen_tier_2", () -> makeGenerator(8, 2, Items.SNOWBALL, Blocks.SNOW));
    public static final RegistryObject<BaseGenerator> SNOW_GEN_T3 = BLOCKS.register("snow_gen_tier_3", () -> makeGenerator(8, 3, Items.SNOWBALL, Blocks.SNOW));
    public static final RegistryObject<BaseGenerator> SNOW_GEN_T4 = BLOCKS.register("snow_gen_tier_4", () -> makeGenerator(8, 4, Items.SNOWBALL, Blocks.SNOW));
    public static final RegistryObject<BaseGenerator> SNOW_GEN_T5 = BLOCKS.register("snow_gen_tier_5", () -> makeGenerator(8, 5, Items.SNOWBALL, Blocks.SNOW));
    public static final RegistryObject<BaseGenerator> SOULSAND_GEN_T1 = BLOCKS.register("soulsand_gen_tier_1", () -> make15Generator(1, Blocks.SOUL_SAND));
    public static final RegistryObject<BaseGenerator> SOULSAND_GEN_T2 = BLOCKS.register("soulsand_gen_tier_2", () -> make15Generator(2, Blocks.SOUL_SAND));
    public static final RegistryObject<BaseGenerator> SOULSAND_GEN_T3 = BLOCKS.register("soulsand_gen_tier_3", () -> make15Generator(3, Blocks.SOUL_SAND));
    public static final RegistryObject<BaseGenerator> SOULSAND_GEN_T4 = BLOCKS.register("soulsand_gen_tier_4", () -> make15Generator(4, Blocks.SOUL_SAND));
    public static final RegistryObject<BaseGenerator> SOULSAND_GEN_T5 = BLOCKS.register("soulsand_gen_tier_5", () -> make15Generator(5, Blocks.SOUL_SAND));
    public static final RegistryObject<DyeGenerator> DYE_GEN_T1 = BLOCKS.register("dye_gen_tier_1", () -> new DyeGenerator(8));
    public static final RegistryObject<DyeGenerator> DYE_GEN_T2 = BLOCKS.register("dye_gen_tier_2", () -> new DyeGenerator(8));
    public static final RegistryObject<DyeGenerator> DYE_GEN_T3 = BLOCKS.register("dye_gen_tier_3", () -> new DyeGenerator(8));
    public static final RegistryObject<DyeGenerator> DYE_GEN_T4 = BLOCKS.register("dye_gen_tier_4", () -> new DyeGenerator(8));
    public static final RegistryObject<DyeGenerator> DYE_GEN_T5 = BLOCKS.register("dye_gen_tier_5", () -> new DyeGenerator(8));
    public static final RegistryObject<OreGenerator> ORE_GEN_T1 = BLOCKS.register("ore_gen_tier_1", () -> new OreGenerator(15));
    public static final RegistryObject<OreGenerator> ORE_GEN_T2 = BLOCKS.register("ore_gen_tier_2", () -> new OreGenerator(15));
    public static final RegistryObject<OreGenerator> ORE_GEN_T3 = BLOCKS.register("ore_gen_tier_3", () -> new OreGenerator(15));
    public static final RegistryObject<OreGenerator> ORE_GEN_T4 = BLOCKS.register("ore_gen_tier_4", () -> new OreGenerator(15));
    public static final RegistryObject<OreGenerator> ORE_GEN_T5 = BLOCKS.register("ore_gen_tier_5", () -> new OreGenerator(15));

    public static final RegistryObject<BaseGenerator> DUST_GEN_T1 = BLOCKS.register("dust_gen_tier_1", () -> makeEXNGenerator(1, EXNBlocks.DUST, Blocks.SAND));
    public static final RegistryObject<BaseGenerator> DUST_GEN_T2 = BLOCKS.register("dust_gen_tier_2", () -> makeEXNGenerator(2, EXNBlocks.DUST, Blocks.SAND));
    public static final RegistryObject<BaseGenerator> DUST_GEN_T3 = BLOCKS.register("dust_gen_tier_3", () -> makeEXNGenerator(3, EXNBlocks.DUST, Blocks.SAND));
    public static final RegistryObject<BaseGenerator> DUST_GEN_T4 = BLOCKS.register("dust_gen_tier_4", () -> makeEXNGenerator(4, EXNBlocks.DUST, Blocks.SAND));
    public static final RegistryObject<BaseGenerator> DUST_GEN_T5 = BLOCKS.register("dust_gen_tier_5", () -> makeEXNGenerator(5, EXNBlocks.DUST, Blocks.SAND));
    public static final RegistryObject<BaseGenerator> CRUSHED_ENDSTONE_GEN_T1 = BLOCKS.register("crushed_endstone_gen_tier_1", () -> makeEXNGenerator(1, EXNBlocks.CRUSHED_END_STONE, Blocks.END_STONE));
    public static final RegistryObject<BaseGenerator> CRUSHED_ENDSTONE_GEN_T2 = BLOCKS.register("crushed_endstone_gen_tier_2", () -> makeEXNGenerator(2, EXNBlocks.CRUSHED_END_STONE, Blocks.END_STONE));
    public static final RegistryObject<BaseGenerator> CRUSHED_ENDSTONE_GEN_T3 = BLOCKS.register("crushed_endstone_gen_tier_3", () -> makeEXNGenerator(3, EXNBlocks.CRUSHED_END_STONE, Blocks.END_STONE));
    public static final RegistryObject<BaseGenerator> CRUSHED_ENDSTONE_GEN_T4 = BLOCKS.register("crushed_endstone_gen_tier_4", () -> makeEXNGenerator(4, EXNBlocks.CRUSHED_END_STONE, Blocks.END_STONE));
    public static final RegistryObject<BaseGenerator> CRUSHED_ENDSTONE_GEN_T5 = BLOCKS.register("crushed_endstone_gen_tier_5", () -> makeEXNGenerator(5, EXNBlocks.CRUSHED_END_STONE, Blocks.END_STONE));
    public static final RegistryObject<BaseGenerator> CRUSHED_NETHERRACK_GEN_T1 = BLOCKS.register("crushed_netherrack_gen_tier_1", () -> makeEXNGenerator(1, EXNBlocks.CRUSHED_NETHERRACK, Blocks.NETHERRACK));
    public static final RegistryObject<BaseGenerator> CRUSHED_NETHERRACK_GEN_T2 = BLOCKS.register("crushed_netherrack_gen_tier_2", () -> makeEXNGenerator(2, EXNBlocks.CRUSHED_NETHERRACK, Blocks.NETHERRACK));
    public static final RegistryObject<BaseGenerator> CRUSHED_NETHERRACK_GEN_T3 = BLOCKS.register("crushed_netherrack_gen_tier_3", () -> makeEXNGenerator(3, EXNBlocks.CRUSHED_NETHERRACK, Blocks.NETHERRACK));
    public static final RegistryObject<BaseGenerator> CRUSHED_NETHERRACK_GEN_T4 = BLOCKS.register("crushed_netherrack_gen_tier_4", () -> makeEXNGenerator(4, EXNBlocks.CRUSHED_NETHERRACK, Blocks.NETHERRACK));
    public static final RegistryObject<BaseGenerator> CRUSHED_NETHERRACK_GEN_T5 = BLOCKS.register("crushed_netherrack_gen_tier_5", () -> makeEXNGenerator(5, EXNBlocks.CRUSHED_NETHERRACK, Blocks.NETHERRACK));

    public static void init(IEventBus modBusEvent) {
        BLOCKS.register(modBusEvent);
    }

    private static BaseGenerator makeEXNGenerator(int tier, BlockDefinition<Block> blockKey, @Nonnull Block alternativeBlock) {
        Block block;
        Item item;
        if (ForgeRegistries.BLOCKS.containsValue(blockKey.block())) {
             block = blockKey.block();
        } else {
            block = alternativeBlock;
        }
        if (ForgeRegistries.ITEMS.containsKey(blockKey.getId())) {
            item = ForgeRegistries.ITEMS.getValue(blockKey.getId());
        } else {
            item = alternativeBlock.asItem();
        }
        return makeGenerator(15, tier, item, block);
    }

    private static BaseGenerator make15Generator(int tier, Block block) {
        return makeGenerator(15, tier, block.asItem(), block);
    }

    private static BaseGenerator make8Generator(int tier, Block block) {
        return makeGenerator(8, tier, block.asItem(), block);
    }

    private static BaseGenerator makeGenerator(int lightLevel, int tier, Item item, Block block) {
        return new BaseGenerator(lightLevel, tier, item, block);
    }

}
