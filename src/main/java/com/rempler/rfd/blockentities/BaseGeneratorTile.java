package com.rempler.rfd.blockentities;

import com.rempler.rfd.setup.Config;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.items.ItemStackHandler;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public abstract class BaseGeneratorTile extends BlockEntity {
    private int tickCount;
    private final ConfigCache configCache;
    protected ItemStackHandler handler;
    private int ticksPerGenCycle;
    private LazyOptional<IItemHandler> cache = null;

    protected BaseGeneratorTile(Config.Tiers tiers, BlockEntityType<?> tileEntityTypeIn, BlockPos pos, BlockState state) {
        super(tileEntityTypeIn, pos, state);
        this.configCache = new ConfigCache(tiers);
        this.ticksPerGenCycle = configCache.getInterval();
    }

    public void tickServer(Block block) {
        tickServer(block.asItem(), block);
    }

    public void tickServer(Item item, Block block) {
        tickServer(new ItemStack(item), new ItemStack(block));
    }

    public void tickServer(Item item) {
        tickServer(new ItemStack(item), new ItemStack(item));
    }

    private void updateCache() {
        BlockEntity tileEntity = this.level != null && this.level.isLoaded(this.worldPosition.above()) ? this.level.getBlockEntity(this.worldPosition.above()) : null;
        if (tileEntity != null) {
            LazyOptional<IItemHandler> lazyOptional = tileEntity.getCapability(ForgeCapabilities.ITEM_HANDLER, Direction.DOWN);
            if (lazyOptional.isPresent()) {
                if (this.cache != lazyOptional) {
                    this.cache = lazyOptional;
                    this.cache.addListener((l) -> this.updateCache());
                }
            } else {
                this.cache = LazyOptional.empty();
            }
        } else {
            this.cache = LazyOptional.empty();
        }
    }

    private LazyOptional<IItemHandler> getCache() {
        this.updateCache();

        return this.cache;
    }

    private void push(ItemStack stack) {
        ItemStack result = this.getCache().map((iItemHandler) -> ItemHandlerHelper.insertItemStacked(iItemHandler, stack, false)).orElse(stack);
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

            if (this.getCache().isPresent()) {
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

    @SuppressWarnings("unchecked")
    @Nonnull
    @Override
    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @Nullable Direction side) {
        if (cap == ForgeCapabilities.ITEM_HANDLER){
            return LazyOptional.of(() -> (T) getHandler());
        }
        return super.getCapability(cap, side);
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
