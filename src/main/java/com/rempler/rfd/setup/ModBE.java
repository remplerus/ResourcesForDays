package com.rempler.rfd.setup;

import com.rempler.rfd.ResourcesForDays;
import com.rempler.rfd.api.DefaultMaterials;
import com.rempler.rfd.blockentities.DyeGeneratorEntity;
import com.rempler.rfd.blockentities.OreGeneratorEntity;
import com.rempler.rfd.blockentities.TieredGeneratorEntity;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBE {
    public static DeferredRegister<BlockEntityType<?>> BE = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, ResourcesForDays.MODID);

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<TieredGeneratorEntity>> TIERED_BE_T1 = BE.register("tiered_be_t1", () -> DefaultMaterials.T1_GENERATORS.createBlockEntityType(TieredGeneratorEntity.makeSupplier(1)));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<TieredGeneratorEntity>> TIERED_BE_T2 = BE.register("tiered_be_t2", () -> DefaultMaterials.T2_GENERATORS.createBlockEntityType(TieredGeneratorEntity.makeSupplier(2)));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<TieredGeneratorEntity>> TIERED_BE_T3 = BE.register("tiered_be_t3", () -> DefaultMaterials.T3_GENERATORS.createBlockEntityType(TieredGeneratorEntity.makeSupplier(3)));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<TieredGeneratorEntity>> TIERED_BE_T4 = BE.register("tiered_be_t4", () -> DefaultMaterials.T4_GENERATORS.createBlockEntityType(TieredGeneratorEntity.makeSupplier(4)));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<TieredGeneratorEntity>> TIERED_BE_T5 = BE.register("tiered_be_t5", () -> DefaultMaterials.T5_GENERATORS.createBlockEntityType(TieredGeneratorEntity.makeSupplier(5)));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DyeGeneratorEntity>> DYE_T1_BE = BE.register("dye_be_t1", () -> DefaultMaterials.T1_DYE_GENERATORS.createBlockEntityType(DyeGeneratorEntity.makeSupplier(1)));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DyeGeneratorEntity>> DYE_T2_BE = BE.register("dye_be_t2", () -> DefaultMaterials.T2_DYE_GENERATORS.createBlockEntityType(DyeGeneratorEntity.makeSupplier(1)));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DyeGeneratorEntity>> DYE_T3_BE = BE.register("dye_be_t3", () -> DefaultMaterials.T3_DYE_GENERATORS.createBlockEntityType(DyeGeneratorEntity.makeSupplier(1)));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DyeGeneratorEntity>> DYE_T4_BE = BE.register("dye_be_t4", () -> DefaultMaterials.T4_DYE_GENERATORS.createBlockEntityType(DyeGeneratorEntity.makeSupplier(1)));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DyeGeneratorEntity>> DYE_T5_BE = BE.register("dye_be_t5", () -> DefaultMaterials.T5_DYE_GENERATORS.createBlockEntityType(DyeGeneratorEntity.makeSupplier(1)));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<OreGeneratorEntity>> ORE_T1_BE = BE.register("ore_be_t1", () -> DefaultMaterials.T1_ORE_GENERATORS.createBlockEntityType(OreGeneratorEntity.makeSupplier(1)));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<OreGeneratorEntity>> ORE_T2_BE = BE.register("ore_be_t2", () -> DefaultMaterials.T2_ORE_GENERATORS.createBlockEntityType(OreGeneratorEntity.makeSupplier(1)));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<OreGeneratorEntity>> ORE_T3_BE = BE.register("ore_be_t3", () -> DefaultMaterials.T3_ORE_GENERATORS.createBlockEntityType(OreGeneratorEntity.makeSupplier(1)));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<OreGeneratorEntity>> ORE_T4_BE = BE.register("ore_be_t4", () -> DefaultMaterials.T4_ORE_GENERATORS.createBlockEntityType(OreGeneratorEntity.makeSupplier(1)));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<OreGeneratorEntity>> ORE_T5_BE = BE.register("ore_be_t5", () -> DefaultMaterials.T5_ORE_GENERATORS.createBlockEntityType(OreGeneratorEntity.makeSupplier(1)));

    public static void init(IEventBus modBusEvent) {
        BE.register(modBusEvent);
    }
}
