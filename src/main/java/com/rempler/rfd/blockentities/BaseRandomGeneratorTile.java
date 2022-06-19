package com.rempler.rfd.blockentities;

import com.rempler.rfd.setup.Config;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

import java.util.HashMap;

public abstract class BaseRandomGeneratorTile extends BaseGeneratorTile {

    protected HashMap<Integer, Item> rndItems = new HashMap<Integer, Item>();
    protected HashMap<Integer, Integer> rndProbs = new HashMap<Integer, Integer>();

    protected BaseRandomGeneratorTile(Config.Tiers tiers, BlockEntityType<?> tileEntityTypeIn, BlockPos pos, BlockState state) {
        super(tiers, tileEntityTypeIn, pos, state);
    }

    protected static int findCeil(int arr[], int r, int l, int h) {
        int mid;

        while (l < h) {
            mid = l + ((h - l) >> 1);
            if(r > arr[mid])
                l = mid + 1;
            else
                h = mid;
        }

        return (arr[l] >= r) ? l : -1;
    }

    protected static int myRand(int arr[]) {
        int n = arr.length;
        int prefix[] = new int[n + 1];

        for (int i = 0; i < n; ++i) {
            prefix[i + 1] = prefix[i] + arr[i];
        }

        int r = ((int)(Math.random() * (323567)) % prefix[n]) + 1;

        return findCeil(prefix, r, 0, n);
    }

    public Item getRandomItem() {
        int[] arr = new int[rndProbs.size()];
        int index = 0;

        for (int key = 1; key <= rndProbs.size(); key++) {
            if (rndProbs.containsKey(key)) {
                arr[index] = rndProbs.get(key);
            }
            index++;
        }

        int key = myRand(arr);
        return rndItems.get(key);
    }

}
