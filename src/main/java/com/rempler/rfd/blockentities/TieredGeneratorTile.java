package com.rempler.rfd.blockentities;

import com.rempler.rfd.setup.Config;
import com.rempler.rfd.setup.ModBE;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class TieredGeneratorTile extends BaseGeneratorTile {
    protected TieredGeneratorTile(Config.Tiers tiers, BlockEntityType<?> tileEntityTypeIn, BlockPos pos, BlockState state) {
        super(tiers, tileEntityTypeIn, pos, state);
    }

    public static TieredGeneratorTile create(int Tier, BlockPos pos, BlockState state) {
        return switch(Tier) {
            case 1 -> new TieredGeneratorTile(Config.tier1, ModBE.TIERED_BE_T1.get(), pos, state);
            case 2 -> new TieredGeneratorTile(Config.tier2, ModBE.TIERED_BE_T2.get(), pos, state);
            case 3 -> new TieredGeneratorTile(Config.tier3, ModBE.TIERED_BE_T3.get(), pos, state);
            case 4 -> new TieredGeneratorTile(Config.tier4, ModBE.TIERED_BE_T4.get(), pos, state);
            case 5 -> new TieredGeneratorTile(Config.tier5, ModBE.TIERED_BE_T5.get(), pos, state);
            default -> throw new IllegalArgumentException("Unknown Tier: " + Tier);
        };
    }

    public static BlockEntityType.BlockEntitySupplier<TieredGeneratorTile> makeSupplier(int Tier) {
        return switch(Tier) {
            case 1 -> (pos, state) -> TieredGeneratorTile.create(1, pos, state);
            case 2 -> (pos, state) -> TieredGeneratorTile.create(2, pos, state);
            case 3 -> (pos, state) -> TieredGeneratorTile.create(3, pos, state);
            case 4 -> (pos, state) -> TieredGeneratorTile.create(4, pos, state);
            case 5 -> (pos, state) -> TieredGeneratorTile.create(5, pos, state);
            default -> throw new IllegalArgumentException("Unknown Tier: " + Tier);
        };
    }
}
