package com.rempler.rfd.blockentities;

import com.rempler.rfd.setup.Config;
import com.rempler.rfd.setup.ModBE;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class TieredGeneratorEntity extends BaseGeneratorEntity {
    protected TieredGeneratorEntity(Config.Tiers tiers, BlockEntityType<?> tileEntityTypeIn, BlockPos pos, BlockState state) {
        super(tiers, tileEntityTypeIn, pos, state);
    }

    public static TieredGeneratorEntity create(int Tier, BlockPos pos, BlockState state) {
        return switch(Tier) {
            case 1 -> new TieredGeneratorEntity(Config.tier1, ModBE.TIERED_BE_T1.get(), pos, state);
            case 2 -> new TieredGeneratorEntity(Config.tier2, ModBE.TIERED_BE_T2.get(), pos, state);
            case 3 -> new TieredGeneratorEntity(Config.tier3, ModBE.TIERED_BE_T3.get(), pos, state);
            case 4 -> new TieredGeneratorEntity(Config.tier4, ModBE.TIERED_BE_T4.get(), pos, state);
            case 5 -> new TieredGeneratorEntity(Config.tier5, ModBE.TIERED_BE_T5.get(), pos, state);
            default -> throw new IllegalArgumentException("Unknown Tier: " + Tier);
        };
    }

    public static BlockEntityType.BlockEntitySupplier<TieredGeneratorEntity> makeSupplier(int Tier) {
        return switch(Tier) {
            case 1 -> (pos, state) -> TieredGeneratorEntity.create(1, pos, state);
            case 2 -> (pos, state) -> TieredGeneratorEntity.create(2, pos, state);
            case 3 -> (pos, state) -> TieredGeneratorEntity.create(3, pos, state);
            case 4 -> (pos, state) -> TieredGeneratorEntity.create(4, pos, state);
            case 5 -> (pos, state) -> TieredGeneratorEntity.create(5, pos, state);
            default -> throw new IllegalArgumentException("Unknown Tier: " + Tier);
        };
    }
}
