package com.rempler.rfd.setup;

import com.rempler.rfd.ResourcesForDays;
import com.rempler.rfd.blockentities.DyeGeneratorTile;
import com.rempler.rfd.blockentities.OreGeneratorTile;
import com.rempler.rfd.blockentities.TieredGeneratorTile;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBE {
    public static DeferredRegister<BlockEntityType<?>> BE = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, ResourcesForDays.MODID);

    public static RegistryObject<BlockEntityType<TieredGeneratorTile>> TIERED_BE_T1 = BE.register("tiered_be_t1", () -> BlockEntityType.Builder.of(TieredGeneratorTile.makeSupplier(1), ModBlocks.COBBLE_GEN_T1.get(), ModBlocks.DUST_GEN_T1.get(), ModBlocks.CRUSHED_ENDSTONE_GEN_T1.get(), ModBlocks.SOULSAND_GEN_T1.get(), ModBlocks.SNOW_GEN_T1.get(), ModBlocks.SAND_GEN_T1.get(), ModBlocks.REDSTONE_GEN_T1.get(), ModBlocks.QUARTZ_GEN_T1.get(), ModBlocks.OBSIDIAN_GEN_T1.get(), ModBlocks.NETHERRACK_GEN_T1.get(), ModBlocks.ICE_GEN_T1.get(), ModBlocks.GRAVEL_GEN_T1.get(), ModBlocks.GRASS_GEN_T1.get(), ModBlocks.GLOWSTONE_GEN_T1.get(), ModBlocks.FUNGUS_GEN_T1.get(), ModBlocks.END_GEN_T1.get(), ModBlocks.DIRT_GEN_T1.get(), ModBlocks.CLEAN_GEN_T1.get(), ModBlocks.CLAY_GEN_T1.get(), ModBlocks.CRUSHED_NETHERRACK_GEN_T1.get()).build(null));
    public static RegistryObject<BlockEntityType<TieredGeneratorTile>> TIERED_BE_T2 = BE.register("tiered_be_t2", () -> BlockEntityType.Builder.of(TieredGeneratorTile.makeSupplier(2), ModBlocks.COBBLE_GEN_T2.get(), ModBlocks.DUST_GEN_T2.get(), ModBlocks.CRUSHED_ENDSTONE_GEN_T2.get(), ModBlocks.SOULSAND_GEN_T2.get(), ModBlocks.SNOW_GEN_T2.get(), ModBlocks.SAND_GEN_T2.get(), ModBlocks.REDSTONE_GEN_T2.get(), ModBlocks.QUARTZ_GEN_T2.get(), ModBlocks.OBSIDIAN_GEN_T2.get(), ModBlocks.NETHERRACK_GEN_T2.get(), ModBlocks.ICE_GEN_T2.get(), ModBlocks.GRAVEL_GEN_T2.get(), ModBlocks.GRASS_GEN_T2.get(), ModBlocks.GLOWSTONE_GEN_T2.get(), ModBlocks.FUNGUS_GEN_T2.get(), ModBlocks.END_GEN_T2.get(), ModBlocks.DIRT_GEN_T2.get(), ModBlocks.CLEAN_GEN_T2.get(), ModBlocks.CLAY_GEN_T2.get(), ModBlocks.CRUSHED_NETHERRACK_GEN_T2.get()).build(null));
    public static RegistryObject<BlockEntityType<TieredGeneratorTile>> TIERED_BE_T3 = BE.register("tiered_be_t3", () -> BlockEntityType.Builder.of(TieredGeneratorTile.makeSupplier(3), ModBlocks.COBBLE_GEN_T3.get(), ModBlocks.DUST_GEN_T3.get(), ModBlocks.CRUSHED_ENDSTONE_GEN_T3.get(), ModBlocks.SOULSAND_GEN_T3.get(), ModBlocks.SNOW_GEN_T3.get(), ModBlocks.SAND_GEN_T3.get(), ModBlocks.REDSTONE_GEN_T3.get(), ModBlocks.QUARTZ_GEN_T3.get(), ModBlocks.OBSIDIAN_GEN_T3.get(), ModBlocks.NETHERRACK_GEN_T3.get(), ModBlocks.ICE_GEN_T3.get(), ModBlocks.GRAVEL_GEN_T3.get(), ModBlocks.GRASS_GEN_T3.get(), ModBlocks.GLOWSTONE_GEN_T3.get(), ModBlocks.FUNGUS_GEN_T3.get(), ModBlocks.END_GEN_T3.get(), ModBlocks.DIRT_GEN_T3.get(), ModBlocks.CLEAN_GEN_T3.get(), ModBlocks.CLAY_GEN_T3.get(), ModBlocks.CRUSHED_NETHERRACK_GEN_T3.get()).build(null));
    public static RegistryObject<BlockEntityType<TieredGeneratorTile>> TIERED_BE_T4 = BE.register("tiered_be_t4", () -> BlockEntityType.Builder.of(TieredGeneratorTile.makeSupplier(4), ModBlocks.COBBLE_GEN_T4.get(), ModBlocks.DUST_GEN_T4.get(), ModBlocks.CRUSHED_ENDSTONE_GEN_T4.get(), ModBlocks.SOULSAND_GEN_T4.get(), ModBlocks.SNOW_GEN_T4.get(), ModBlocks.SAND_GEN_T4.get(), ModBlocks.REDSTONE_GEN_T4.get(), ModBlocks.QUARTZ_GEN_T4.get(), ModBlocks.OBSIDIAN_GEN_T4.get(), ModBlocks.NETHERRACK_GEN_T4.get(), ModBlocks.ICE_GEN_T4.get(), ModBlocks.GRAVEL_GEN_T4.get(), ModBlocks.GRASS_GEN_T4.get(), ModBlocks.GLOWSTONE_GEN_T4.get(), ModBlocks.FUNGUS_GEN_T4.get(), ModBlocks.END_GEN_T4.get(), ModBlocks.DIRT_GEN_T4.get(), ModBlocks.CLEAN_GEN_T4.get(), ModBlocks.CLAY_GEN_T4.get(), ModBlocks.CRUSHED_NETHERRACK_GEN_T4.get()).build(null));
    public static RegistryObject<BlockEntityType<TieredGeneratorTile>> TIERED_BE_T5 = BE.register("tiered_be_t5", () -> BlockEntityType.Builder.of(TieredGeneratorTile.makeSupplier(5), ModBlocks.COBBLE_GEN_T5.get(), ModBlocks.DUST_GEN_T5.get(), ModBlocks.CRUSHED_ENDSTONE_GEN_T5.get(), ModBlocks.SOULSAND_GEN_T5.get(), ModBlocks.SNOW_GEN_T5.get(), ModBlocks.SAND_GEN_T5.get(), ModBlocks.REDSTONE_GEN_T5.get(), ModBlocks.QUARTZ_GEN_T5.get(), ModBlocks.OBSIDIAN_GEN_T5.get(), ModBlocks.NETHERRACK_GEN_T5.get(), ModBlocks.ICE_GEN_T5.get(), ModBlocks.GRAVEL_GEN_T5.get(), ModBlocks.GRASS_GEN_T5.get(), ModBlocks.GLOWSTONE_GEN_T5.get(), ModBlocks.FUNGUS_GEN_T5.get(), ModBlocks.END_GEN_T5.get(), ModBlocks.DIRT_GEN_T5.get(), ModBlocks.CLEAN_GEN_T5.get(), ModBlocks.CLAY_GEN_T5.get(), ModBlocks.CRUSHED_NETHERRACK_GEN_T5.get()).build(null));

    public static RegistryObject<BlockEntityType<DyeGeneratorTile>> DYE_T1_BE = BE.register("dye_be_t1", () -> BlockEntityType.Builder.of(DyeGeneratorTile.makeSupplier(1), ModBlocks.DYE_GEN_T1.get()).build(null));
    public static RegistryObject<BlockEntityType<DyeGeneratorTile>> DYE_T2_BE = BE.register("dye_be_t2", () -> BlockEntityType.Builder.of(DyeGeneratorTile.makeSupplier(2), ModBlocks.DYE_GEN_T2.get()).build(null));
    public static RegistryObject<BlockEntityType<DyeGeneratorTile>> DYE_T3_BE = BE.register("dye_be_t3", () -> BlockEntityType.Builder.of(DyeGeneratorTile.makeSupplier(3), ModBlocks.DYE_GEN_T3.get()).build(null));
    public static RegistryObject<BlockEntityType<DyeGeneratorTile>> DYE_T4_BE = BE.register("dye_be_t4", () -> BlockEntityType.Builder.of(DyeGeneratorTile.makeSupplier(4), ModBlocks.DYE_GEN_T4.get()).build(null));
    public static RegistryObject<BlockEntityType<DyeGeneratorTile>> DYE_T5_BE = BE.register("dye_be_t5", () -> BlockEntityType.Builder.of(DyeGeneratorTile.makeSupplier(5), ModBlocks.DYE_GEN_T5.get()).build(null));
    public static RegistryObject<BlockEntityType<OreGeneratorTile>> ORE_T1_BE = BE.register("ore_be_t1", () -> BlockEntityType.Builder.of(OreGeneratorTile.makeSupplier(1), ModBlocks.ORE_GEN_T1.get()).build(null));
    public static RegistryObject<BlockEntityType<OreGeneratorTile>> ORE_T2_BE = BE.register("ore_be_t2", () -> BlockEntityType.Builder.of(OreGeneratorTile.makeSupplier(2), ModBlocks.ORE_GEN_T2.get()).build(null));
    public static RegistryObject<BlockEntityType<OreGeneratorTile>> ORE_T3_BE = BE.register("ore_be_t3", () -> BlockEntityType.Builder.of(OreGeneratorTile.makeSupplier(3), ModBlocks.ORE_GEN_T3.get()).build(null));
    public static RegistryObject<BlockEntityType<OreGeneratorTile>> ORE_T4_BE = BE.register("ore_be_t4", () -> BlockEntityType.Builder.of(OreGeneratorTile.makeSupplier(4), ModBlocks.ORE_GEN_T4.get()).build(null));
    public static RegistryObject<BlockEntityType<OreGeneratorTile>> ORE_T5_BE = BE.register("ore_be_t5", () -> BlockEntityType.Builder.of(OreGeneratorTile.makeSupplier(5), ModBlocks.ORE_GEN_T5.get()).build(null));


    public static void init(IEventBus modBusEvent) {
        BE.register(modBusEvent);
    }
}
