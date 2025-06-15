package com.rempler.rfd.datagen;

import com.rempler.rfd.ResourcesForDays;
import com.rempler.rfd.api.DefaultMaterials;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.SmithingTransformRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.Tags;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class RfDRecipesGen extends RecipeProvider {
    public RfDRecipesGen(PackOutput generator, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(generator, lookupProvider);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput consumer) {
        Item water = Items.WATER_BUCKET;
        Item lava = Items.LAVA_BUCKET;
        createGenerator(consumer, Items.CLAY_BALL, DefaultMaterials.CLAY_GEN_T1.getBlock(), DefaultMaterials.CLAY_GEN_T2.getBlock(),
                DefaultMaterials.CLAY_GEN_T3.getBlock(), DefaultMaterials.CLAY_GEN_T4.getBlock(), DefaultMaterials.CLAY_GEN_T5.getBlock(), water, water);
        createGenerator(consumer, Tags.Items.STONES, DefaultMaterials.CLEAN_GEN_T1.getBlock(), DefaultMaterials.CLEAN_GEN_T2.getBlock(),
                DefaultMaterials.CLEAN_GEN_T3.getBlock(), DefaultMaterials.CLEAN_GEN_T4.getBlock(), DefaultMaterials.CLEAN_GEN_T5.getBlock(), lava, water);
        createGenerator(consumer, Tags.Items.COBBLESTONES, DefaultMaterials.COBBLE_GEN_T1.getBlock(), DefaultMaterials.COBBLE_GEN_T2.getBlock(),
                DefaultMaterials.COBBLE_GEN_T3.getBlock(), DefaultMaterials.COBBLE_GEN_T4.getBlock(), DefaultMaterials.COBBLE_GEN_T5.getBlock(), lava, water);
        createGenerator(consumer, Items.DIRT, DefaultMaterials.DIRT_GEN_T1.getBlock(), DefaultMaterials.DIRT_GEN_T2.getBlock(),
                DefaultMaterials.DIRT_GEN_T3.getBlock(), DefaultMaterials.DIRT_GEN_T4.getBlock(), DefaultMaterials.DIRT_GEN_T5.getBlock(), water, water);
        createGenerator(consumer, Tags.Items.DYES, DefaultMaterials.DYE_GEN_T1.getBlock(), DefaultMaterials.DYE_GEN_T2.getBlock(),
                DefaultMaterials.DYE_GEN_T3.getBlock(), DefaultMaterials.DYE_GEN_T4.getBlock(), DefaultMaterials.DYE_GEN_T5.getBlock(), water, water);
        createGenerator(consumer, Items.END_STONE, DefaultMaterials.END_GEN_T1.getBlock(), DefaultMaterials.END_GEN_T2.getBlock(),
                DefaultMaterials.END_GEN_T3.getBlock(), DefaultMaterials.END_GEN_T4.getBlock(), DefaultMaterials.END_GEN_T5.getBlock(), lava, lava);
        createGenerator(consumer, Items.MYCELIUM, DefaultMaterials.MYCELIUM_GEN_T1.getBlock(), DefaultMaterials.MYCELIUM_GEN_T2.getBlock(),
                DefaultMaterials.MYCELIUM_GEN_T3.getBlock(), DefaultMaterials.MYCELIUM_GEN_T4.getBlock(), DefaultMaterials.MYCELIUM_GEN_T5.getBlock(), water, water);
        createGenerator(consumer, Items.GLOWSTONE, DefaultMaterials.GLOWSTONE_GEN_T1.getBlock(), DefaultMaterials.GLOWSTONE_GEN_T2.getBlock(),
                DefaultMaterials.GLOWSTONE_GEN_T3.getBlock(), DefaultMaterials.GLOWSTONE_GEN_T4.getBlock(), DefaultMaterials.GLOWSTONE_GEN_T5.getBlock(), lava, lava);
        createGenerator(consumer, Items.GRASS_BLOCK, DefaultMaterials.GRASS_GEN_T1.getBlock(), DefaultMaterials.GRASS_GEN_T2.getBlock(),
                DefaultMaterials.GRASS_GEN_T3.getBlock(), DefaultMaterials.GRASS_GEN_T4.getBlock(), DefaultMaterials.GRASS_GEN_T5.getBlock(), water, water);
        createGenerator(consumer, Tags.Items.GRAVELS, DefaultMaterials.GRAVEL_GEN_T1.getBlock(), DefaultMaterials.GRAVEL_GEN_T2.getBlock(),
                DefaultMaterials.GRAVEL_GEN_T3.getBlock(), DefaultMaterials.GRAVEL_GEN_T4.getBlock(), DefaultMaterials.GRAVEL_GEN_T5.getBlock(), lava, water);
        createGenerator(consumer, Items.ICE, DefaultMaterials.ICE_GEN_T1.getBlock(), DefaultMaterials.ICE_GEN_T2.getBlock(),
                DefaultMaterials.ICE_GEN_T3.getBlock(), DefaultMaterials.ICE_GEN_T4.getBlock(), DefaultMaterials.ICE_GEN_T5.getBlock(), water, water);
        createGenerator(consumer, Tags.Items.NETHERRACKS, DefaultMaterials.NETHERRACK_GEN_T1.getBlock(), DefaultMaterials.NETHERRACK_GEN_T2.getBlock(),
                DefaultMaterials.NETHERRACK_GEN_T3.getBlock(), DefaultMaterials.NETHERRACK_GEN_T4.getBlock(), DefaultMaterials.NETHERRACK_GEN_T5.getBlock(), lava, lava);
        createGenerator(consumer, Tags.Items.OBSIDIANS, DefaultMaterials.OBSIDIAN_GEN_T1.getBlock(), DefaultMaterials.OBSIDIAN_GEN_T2.getBlock(),
                DefaultMaterials.OBSIDIAN_GEN_T3.getBlock(), DefaultMaterials.OBSIDIAN_GEN_T4.getBlock(), DefaultMaterials.OBSIDIAN_GEN_T5.getBlock(), water, water);
        createGenerator(consumer, Tags.Items.ORES, DefaultMaterials.ORE_GEN_T1.getBlock(), DefaultMaterials.ORE_GEN_T2.getBlock(),
                DefaultMaterials.ORE_GEN_T3.getBlock(), DefaultMaterials.ORE_GEN_T4.getBlock(), DefaultMaterials.ORE_GEN_T5.getBlock(), water, lava);
        createGenerator(consumer, Items.QUARTZ, DefaultMaterials.QUARTZ_GEN_T1.getBlock(), DefaultMaterials.QUARTZ_GEN_T2.getBlock(),
                DefaultMaterials.QUARTZ_GEN_T3.getBlock(), DefaultMaterials.QUARTZ_GEN_T4.getBlock(), DefaultMaterials.QUARTZ_GEN_T5.getBlock(), lava, lava);
        createGenerator(consumer, Items.REDSTONE, DefaultMaterials.REDSTONE_GEN_T1.getBlock(), DefaultMaterials.REDSTONE_GEN_T2.getBlock(),
                DefaultMaterials.REDSTONE_GEN_T3.getBlock(), DefaultMaterials.REDSTONE_GEN_T4.getBlock(), DefaultMaterials.REDSTONE_GEN_T5.getBlock(), water, water);
        createGenerator(consumer, Tags.Items.SANDS, DefaultMaterials.SAND_GEN_T1.getBlock(), DefaultMaterials.SAND_GEN_T2.getBlock(),
                DefaultMaterials.SAND_GEN_T3.getBlock(), DefaultMaterials.SAND_GEN_T4.getBlock(), DefaultMaterials.SAND_GEN_T5.getBlock(), lava, water);
        createGenerator(consumer, Items.SNOW_BLOCK, DefaultMaterials.SNOW_GEN_T1.getBlock(), DefaultMaterials.SNOW_GEN_T2.getBlock(),
                DefaultMaterials.SNOW_GEN_T3.getBlock(), DefaultMaterials.SNOW_GEN_T4.getBlock(), DefaultMaterials.SNOW_GEN_T5.getBlock(), water, water);
        createGenerator(consumer, Items.SOUL_SAND, DefaultMaterials.SOUL_SAND_GEN_T1.getBlock(), DefaultMaterials.SOUL_SAND_GEN_T2.getBlock(),
                DefaultMaterials.SOUL_SAND_GEN_T3.getBlock(), DefaultMaterials.SOUL_SAND_GEN_T4.getBlock(), DefaultMaterials.SOUL_SAND_GEN_T5.getBlock(), lava, lava);
    }

    private void createGenerator(RecipeOutput consumer, ItemLike inputItem, ItemLike tier1, ItemLike tier2, ItemLike tier3, ItemLike tier4, ItemLike tier5, ItemLike bucketLeft, ItemLike bucketRight) {
        createTieredGenerator(consumer, ItemTags.LOGS, inputItem, tier1, bucketRight, bucketLeft); //Tier1
        createTieredGenerator(consumer, Tags.Items.STONES, tier1, tier2, bucketRight, bucketLeft); //Tier2
        createTieredGenerator(consumer, Tags.Items.STORAGE_BLOCKS_IRON, tier2, tier3, bucketRight, bucketLeft); //Tier3
        createTieredGenerator(consumer, Tags.Items.STORAGE_BLOCKS_DIAMOND, tier3, tier4, bucketRight, bucketLeft); //Tier4
        createSmithingGenerator(consumer, tier4, tier5);
    }

    private void createGenerator(RecipeOutput consumer, TagKey<Item> inputItem, ItemLike tier1, ItemLike tier2, ItemLike tier3, ItemLike tier4, ItemLike tier5, ItemLike bucketLeft, ItemLike bucketRight) {
        createTieredGenerator(consumer, inputItem, tier1, bucketRight, bucketLeft); //Tier1
        createTieredGenerator(consumer, Tags.Items.STONES, tier1, tier2, bucketRight, bucketLeft); //Tier2
        createTieredGenerator(consumer, Tags.Items.STORAGE_BLOCKS_IRON, tier2, tier3, bucketRight, bucketLeft); //Tier3
        createTieredGenerator(consumer, Tags.Items.STORAGE_BLOCKS_DIAMOND, tier3, tier4, bucketRight, bucketLeft); //Tier4
        createSmithingGenerator(consumer, tier4, tier5);
    }

    private void createTieredGenerator(RecipeOutput consumer, TagKey<Item> tieredItem, ItemLike input, ItemLike output, ItemLike bucketRight, ItemLike bucketLeft) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, output)
                .pattern("sws")
                .pattern("bgl")
                .pattern("sxs")
                .define('s', Blocks.STONE_BRICKS)
                .define('g', Blocks.GLASS)
                .define('b', bucketRight)
                .define('l', bucketLeft)
                .define('w', tieredItem)
                .define('x', input)
                .unlockedBy("has_" + input.toString().split(":")[1], InventoryChangeTrigger.TriggerInstance.hasItems(input))
                .save(consumer, modLoc(BuiltInRegistries.ITEM.getKey(output.asItem()).getPath()));
    }

    private void createTieredGenerator(RecipeOutput consumer, TagKey<Item> input, ItemLike output, ItemLike bucketRight, ItemLike bucketLeft) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, output)
                .pattern("sws")
                .pattern("bgl")
                .pattern("sxs")
                .define('s', Blocks.STONE_BRICKS)
                .define('g', Blocks.GLASS)
                .define('b', bucketRight)
                .define('l', bucketLeft)
                .define('w', ItemTags.LOGS)
                .define('x', input)
                .unlockedBy("has_" + input.location().getPath(), InventoryChangeTrigger.TriggerInstance.hasItems(Items.AIR))
                .save(consumer, modLoc(BuiltInRegistries.ITEM.getKey(output.asItem()).getPath()));
    }

    private void createSmithingGenerator(RecipeOutput consumer, ItemLike input, ItemLike output) {
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), Ingredient.of(input), Ingredient.of(Items.NETHERITE_BLOCK), RecipeCategory.MISC, output.asItem())
                .unlocks("has_" + input.asItem().getName(input.asItem().getDefaultInstance()).getString(), InventoryChangeTrigger.TriggerInstance.hasItems(input))
                .save(consumer, modLoc(BuiltInRegistries.ITEM.getKey(output.asItem()).getPath()));
    }

    private ResourceLocation modLoc(String input) {
        return ResourceLocation.fromNamespaceAndPath(ResourcesForDays.MODID, input);
    }
}
