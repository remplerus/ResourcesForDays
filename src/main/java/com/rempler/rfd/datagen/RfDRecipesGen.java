package com.rempler.rfd.datagen;

import com.rempler.rfd.ResourcesForDays;
import com.rempler.rfd.setup.ModBlocks;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
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
import net.minecraftforge.common.Tags;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class RfDRecipesGen extends RecipeProvider {
    public RfDRecipesGen(PackOutput generator) {
        super(generator);
    }

    @Override
    protected void buildRecipes(@NotNull Consumer<FinishedRecipe> consumer) {
        Item water = Items.WATER_BUCKET;
        Item lava = Items.LAVA_BUCKET;
        createGenerator(consumer, Items.CLAY_BALL, ModBlocks.CLAY_GEN_T1.get(), ModBlocks.CLAY_GEN_T2.get(),
                ModBlocks.CLAY_GEN_T3.get(), ModBlocks.CLAY_GEN_T4.get(), ModBlocks.CLAY_GEN_T5.get(), water, water);
        createGenerator(consumer, Tags.Items.STONE, ModBlocks.CLEAN_GEN_T1.get(), ModBlocks.CLEAN_GEN_T2.get(),
                ModBlocks.CLEAN_GEN_T3.get(), ModBlocks.CLEAN_GEN_T4.get(), ModBlocks.CLEAN_GEN_T5.get(), lava, water);
        //createGenerator(consumer, Tags.Items.COBBLESTONE, ModBlocks.COBBLE_GEN_T1.get(), ModBlocks.COBBLE_GEN_T2.get(),
        //        ModBlocks.COBBLE_GEN_T3.get(), ModBlocks.COBBLE_GEN_T4.get(), ModBlocks.COBBLE_GEN_T5.get(), lava, water);
        createGenerator(consumer, Items.DIRT, ModBlocks.DIRT_GEN_T1.get(), ModBlocks.DIRT_GEN_T2.get(),
                ModBlocks.DIRT_GEN_T3.get(), ModBlocks.DIRT_GEN_T4.get(), ModBlocks.DIRT_GEN_T5.get(), water, water);
        createGenerator(consumer, Tags.Items.DYES, ModBlocks.DYE_GEN_T1.get(), ModBlocks.DYE_GEN_T2.get(),
                ModBlocks.DYE_GEN_T3.get(), ModBlocks.DYE_GEN_T4.get(), ModBlocks.DYE_GEN_T5.get(), water, water);
        createGenerator(consumer, Items.END_STONE, ModBlocks.END_GEN_T1.get(), ModBlocks.END_GEN_T2.get(),
                ModBlocks.END_GEN_T3.get(), ModBlocks.END_GEN_T4.get(), ModBlocks.END_GEN_T5.get(), lava, lava);
        createGenerator(consumer, Items.MYCELIUM, ModBlocks.FUNGUS_GEN_T1.get(), ModBlocks.FUNGUS_GEN_T2.get(),
                ModBlocks.FUNGUS_GEN_T3.get(), ModBlocks.FUNGUS_GEN_T4.get(), ModBlocks.FUNGUS_GEN_T5.get(), water, water);
        createGenerator(consumer, Items.GLOWSTONE, ModBlocks.GLOWSTONE_GEN_T1.get(), ModBlocks.GLOWSTONE_GEN_T2.get(),
                ModBlocks.GLOWSTONE_GEN_T3.get(), ModBlocks.GLOWSTONE_GEN_T4.get(), ModBlocks.GLOWSTONE_GEN_T5.get(), lava, lava);
        createGenerator(consumer, Items.GRASS_BLOCK, ModBlocks.GRASS_GEN_T1.get(), ModBlocks.GRASS_GEN_T2.get(),
                ModBlocks.GRASS_GEN_T3.get(), ModBlocks.GRASS_GEN_T4.get(), ModBlocks.GRASS_GEN_T5.get(), water, water);
        createGenerator(consumer, Tags.Items.GRAVEL, ModBlocks.GRAVEL_GEN_T1.get(), ModBlocks.GRAVEL_GEN_T2.get(),
                ModBlocks.GRAVEL_GEN_T3.get(), ModBlocks.GRAVEL_GEN_T4.get(), ModBlocks.GRAVEL_GEN_T5.get(), lava, water);
        createGenerator(consumer, Items.ICE, ModBlocks.ICE_GEN_T1.get(), ModBlocks.ICE_GEN_T2.get(),
                ModBlocks.ICE_GEN_T3.get(), ModBlocks.ICE_GEN_T4.get(), ModBlocks.ICE_GEN_T5.get(), water, water);
        createGenerator(consumer, Tags.Items.NETHERRACK, ModBlocks.NETHERRACK_GEN_T1.get(), ModBlocks.NETHERRACK_GEN_T2.get(),
                ModBlocks.NETHERRACK_GEN_T3.get(), ModBlocks.NETHERRACK_GEN_T4.get(), ModBlocks.NETHERRACK_GEN_T5.get(), lava, lava);
        createGenerator(consumer, Tags.Items.OBSIDIAN, ModBlocks.OBSIDIAN_GEN_T1.get(), ModBlocks.OBSIDIAN_GEN_T2.get(),
                ModBlocks.OBSIDIAN_GEN_T3.get(), ModBlocks.OBSIDIAN_GEN_T4.get(), ModBlocks.OBSIDIAN_GEN_T5.get(), water, water);
        createGenerator(consumer, Tags.Items.ORES, ModBlocks.ORE_GEN_T1.get(), ModBlocks.ORE_GEN_T2.get(),
                ModBlocks.ORE_GEN_T3.get(), ModBlocks.ORE_GEN_T4.get(), ModBlocks.ORE_GEN_T5.get(), water, lava);
        createGenerator(consumer, Items.QUARTZ, ModBlocks.QUARTZ_GEN_T1.get(), ModBlocks.QUARTZ_GEN_T2.get(),
                ModBlocks.QUARTZ_GEN_T3.get(), ModBlocks.QUARTZ_GEN_T4.get(), ModBlocks.QUARTZ_GEN_T5.get(), lava, lava);
        createGenerator(consumer, Items.REDSTONE, ModBlocks.REDSTONE_GEN_T1.get(), ModBlocks.REDSTONE_GEN_T2.get(),
                ModBlocks.REDSTONE_GEN_T3.get(), ModBlocks.REDSTONE_GEN_T4.get(), ModBlocks.REDSTONE_GEN_T5.get(), water, water);
        createGenerator(consumer, Tags.Items.SAND, ModBlocks.SAND_GEN_T1.get(), ModBlocks.SAND_GEN_T2.get(),
                ModBlocks.SAND_GEN_T3.get(), ModBlocks.SAND_GEN_T4.get(), ModBlocks.SAND_GEN_T5.get(), lava, water);
        createGenerator(consumer, Items.SNOW_BLOCK, ModBlocks.SNOW_GEN_T1.get(), ModBlocks.SNOW_GEN_T2.get(),
                ModBlocks.SNOW_GEN_T3.get(), ModBlocks.SNOW_GEN_T4.get(), ModBlocks.SNOW_GEN_T5.get(), water, water);
        createGenerator(consumer, Items.SOUL_SAND, ModBlocks.SOULSAND_GEN_T1.get(), ModBlocks.SOULSAND_GEN_T2.get(),
                ModBlocks.SOULSAND_GEN_T3.get(), ModBlocks.SOULSAND_GEN_T4.get(), ModBlocks.SOULSAND_GEN_T5.get(), lava, lava);
    }

    private void createGenerator(Consumer<FinishedRecipe> consumer, ItemLike inputItem, ItemLike tier1, ItemLike tier2, ItemLike tier3, ItemLike tier4, ItemLike tier5, ItemLike bucketLeft, ItemLike bucketRight) {
        createTieredGenerator(consumer, ItemTags.LOGS, inputItem, tier1, bucketRight, bucketLeft); //Tier1
        createTieredGenerator(consumer, Tags.Items.STONE, tier1, tier2, bucketRight, bucketLeft); //Tier2
        createTieredGenerator(consumer, Tags.Items.STORAGE_BLOCKS_IRON, tier2, tier3, bucketRight, bucketLeft); //Tier3
        createTieredGenerator(consumer, Tags.Items.STORAGE_BLOCKS_DIAMOND, tier3, tier4, bucketRight, bucketLeft); //Tier4
        createSmithingGenerator(consumer, tier4, tier5);
    }

    private void createGenerator(Consumer<FinishedRecipe> consumer, TagKey<Item> inputItem, ItemLike tier1, ItemLike tier2, ItemLike tier3, ItemLike tier4, ItemLike tier5, ItemLike bucketLeft, ItemLike bucketRight) {
        createTieredGenerator(consumer, inputItem, tier1, bucketRight, bucketLeft); //Tier1
        createTieredGenerator(consumer, Tags.Items.STONE, tier1, tier2, bucketRight, bucketLeft); //Tier2
        createTieredGenerator(consumer, Tags.Items.STORAGE_BLOCKS_IRON, tier2, tier3, bucketRight, bucketLeft); //Tier3
        createTieredGenerator(consumer, Tags.Items.STORAGE_BLOCKS_DIAMOND, tier3, tier4, bucketRight, bucketLeft); //Tier4
        createSmithingGenerator(consumer, tier4, tier5);
    }

    private void createTieredGenerator(Consumer<FinishedRecipe> consumer, TagKey<Item> tieredItem, ItemLike input, ItemLike output, ItemLike bucketRight, ItemLike bucketLeft) {
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
                .unlockedBy("has_" + input.asItem().getName(input.asItem().getDefaultInstance()).getString(), InventoryChangeTrigger.TriggerInstance.hasItems(input))
                .save(consumer, modLoc(ForgeRegistries.ITEMS.getKey(output.asItem()).getPath()));
    }

    private void createTieredGenerator(Consumer<FinishedRecipe> consumer, TagKey<Item> input, ItemLike output, ItemLike bucketRight, ItemLike bucketLeft) {
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
                .save(consumer, modLoc(ForgeRegistries.ITEMS.getKey(output.asItem()).getPath()));
    }

    private void createSmithingGenerator(Consumer<FinishedRecipe> consumer, ItemLike input, ItemLike output) {
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), Ingredient.of(input), Ingredient.of(Items.NETHERITE_BLOCK), RecipeCategory.MISC, output.asItem())
                .unlocks("has_" + input.asItem().getName(input.asItem().getDefaultInstance()).getString(), InventoryChangeTrigger.TriggerInstance.hasItems(input))
                .save(consumer, modLoc(ForgeRegistries.ITEMS.getKey(output.asItem()).getPath()));
    }

    private ResourceLocation modLoc(String input) {
        return new ResourceLocation(ResourcesForDays.MODID, input);
    }
}
