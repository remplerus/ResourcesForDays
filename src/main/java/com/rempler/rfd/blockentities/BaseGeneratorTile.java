package com.rempler.rfd.blockentities;

import com.rempler.rfd.setup.Config;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.capabilities.BlockCapabilityCache;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.items.ItemHandlerHelper;
import net.neoforged.neoforge.items.ItemStackHandler;

import javax.annotation.Nonnull;

public abstract class BaseGeneratorTile extends BlockEntity {
    private int tickCount;
    private final ConfigCache configCache;
    protected ItemStackHandler handler;
    private int ticksPerGenCycle;
    private BlockCapabilityCache<IItemHandler, Direction> cache;

    protected BaseGeneratorTile(Config.Tiers tiers, BlockEntityType<?> tileEntityTypeIn, BlockPos pos, BlockState state) {
        super(tileEntityTypeIn, pos, state);
        this.configCache = new ConfigCache(tiers);
        this.ticksPerGenCycle = configCache.getInterval();
    }

    public void tickServer(Item item, Block block) {
        tickServer(new ItemStack(item), new ItemStack(block));
    }

    public void tickServer(Item item) {
        tickServer(new ItemStack(item), new ItemStack(item));
    }

    private void updateCache() {
        BlockEntity tileEntity = this.level != null && this.level.isLoaded(this.worldPosition.above()) ? level.getBlockEntity(this.worldPosition.above()) : null;
        if (level instanceof ServerLevel serverLevel) {
            if (tileEntity != null) {
                this.cache = BlockCapabilityCache.create(Capabilities.ItemHandler.BLOCK, serverLevel, this.worldPosition.above(), Direction.DOWN);
            } else {
                this.cache = BlockCapabilityCache.create(Capabilities.ItemHandler.BLOCK, serverLevel, this.worldPosition, Direction.DOWN);
            }
        }
    }

    private BlockCapabilityCache<IItemHandler, Direction> getCache() {
        this.updateCache();

        return this.cache;
    }

    private void push(ItemStack stack) {
        ItemStack result = ItemHandlerHelper.insertItemStacked(this.getCache().getCapability(), stack, false);
        if (result.isEmpty()) {
            this.setChanged();
        }
    }

    public void tickServer(ItemStack item, ItemStack block) {
        if(tickCount % ticksPerGenCycle == 0) {
            ticksPerGenCycle = configCache.getInterval();
            ItemStack stack;

            if (Boolean.TRUE.equals(Config.GENERATE_DUST.get())) {
                stack = item;
            } else {
                stack = block;
            }

            if (this.getCache().getCapability() != null) {
                push(stack);
            } else {
                ItemHandlerHelper.insertItemStacked(getHandler(), stack, false);
            }
            tickCount = 1;
        }
        tickCount += 1;
    }

    @Override
    protected void saveAdditional(@Nonnull CompoundTag tag) {
        CompoundTag compound = getHandler().serializeNBT();
        tag.put("inv", compound);
    }

    protected ItemStackHandler getHandler(){
        if (handler == null) {
            handler = new ItemStackHandler(1);
        }
        return handler;
    }

    static class ConfigCache {
        private final Config.Tiers tiers;
        private int interval;

        ConfigCache(Config.Tiers tiers) {
            this.tiers = tiers;
            update();
        }

        private void update() {
            this.interval = this.tiers.interval.get();
        }

        public int getInterval() {
            return interval;
        }
    }
}
