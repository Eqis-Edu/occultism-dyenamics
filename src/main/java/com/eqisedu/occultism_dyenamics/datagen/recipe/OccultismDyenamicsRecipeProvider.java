package com.eqisedu.occultism_dyenamics.datagen.recipe;

import com.eqisedu.occultism_dyenamics.OccultismDyenamics;
import com.eqisedu.occultism_dyenamics.registry.OccultismDyenamicsBlocks;
import com.eqisedu.occultism_dyenamics.registry.OccultismDyenamicsItems;
import com.klikli_dev.occultism.datagen.recipe.builders.SpiritFireRecipeBuilder;
import com.klikli_dev.occultism.registry.OccultismBlocks;
import com.klikli_dev.occultism.registry.OccultismItems;
import com.klikli_dev.occultism.registry.OccultismTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class OccultismDyenamicsRecipeProvider extends RecipeProvider {
    public OccultismDyenamicsRecipeProvider(PackOutput p_248933_, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(p_248933_, lookupProvider);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput pRecipeOutput, @NotNull HolderLookup.Provider holderLookup) {
        this.craftingRecipes(pRecipeOutput);
        spiritFireRecipes(pRecipeOutput);
        RitualRecipes.ritualRecipes(pRecipeOutput);
    }

    private void craftingRecipes(RecipeOutput pRecipeOutput) {
        // Chalks
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, OccultismDyenamicsItems.CHALK_HONEY_IMPURE.get())
                .requires(OccultismItems.CHALK_ORANGE_IMPURE.get())
                .requires(OccultismItems.CHALK_YELLOW_IMPURE.get())
                .requires(OccultismTags.makeItemTag("c:dyes/honey"))
                .unlockedBy("has_chalk_white_impure", has(OccultismItems.CHALK_WHITE_IMPURE.get()))
                .save(pRecipeOutput, ResourceLocation.fromNamespaceAndPath(OccultismDyenamics.MODID, "crafting/chalk_honey_impure"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, OccultismDyenamicsItems.CHALK_MINT_IMPURE.get())
                .requires(OccultismItems.CHALK_LIME_IMPURE.get())
                .requires(OccultismItems.CHALK_GREEN_IMPURE.get())
                .requires(OccultismTags.makeItemTag("c:dyes/mint"))
                .unlockedBy("has_chalk_white_impure", has(OccultismItems.CHALK_WHITE_IMPURE.get()))
                .save(pRecipeOutput, ResourceLocation.fromNamespaceAndPath(OccultismDyenamics.MODID, "crafting/chalk_mint_impure"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, OccultismDyenamicsItems.CHALK_LAVENDER_IMPURE.get())
                .requires(OccultismItems.CHALK_MAGENTA_IMPURE.get())
                .requires(OccultismTags.makeItemTag("c:dyes/lavender"))
                .unlockedBy("has_chalk_white_impure", has(OccultismItems.CHALK_WHITE_IMPURE.get()))
                .save(pRecipeOutput, ResourceLocation.fromNamespaceAndPath(OccultismDyenamics.MODID, "crafting/chalk_lavender_impure"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, OccultismDyenamicsItems.CHALK_NAVY_IMPURE.get())
                .requires(OccultismItems.CHALK_BLUE_IMPURE.get())
                .requires(OccultismTags.makeItemTag("c:dyes/navy"))
                .unlockedBy("has_chalk_white_impure", has(OccultismItems.CHALK_WHITE_IMPURE.get()))
                .save(pRecipeOutput, ResourceLocation.fromNamespaceAndPath(OccultismDyenamics.MODID, "crafting/chalk_navy_impure"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, OccultismDyenamicsItems.CHALK_BUBBLEGUM_IMPURE.get())
                .requires(OccultismItems.CHALK_PINK_IMPURE.get())
                .requires(OccultismTags.makeItemTag("c:dyes/bubblegum"))
                .unlockedBy("has_chalk_white_impure", has(OccultismItems.CHALK_WHITE_IMPURE.get()))
                .save(pRecipeOutput, ResourceLocation.fromNamespaceAndPath(OccultismDyenamics.MODID, "crafting/chalk_bubblegum_impure"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, OccultismDyenamicsItems.CHALK_AMBER_IMPURE.get())
                .requires(OccultismItems.CHALK_ORANGE_IMPURE.get())
                .requires(OccultismTags.makeItemTag("c:dyes/amber"))
                .unlockedBy("has_chalk_white_impure", has(OccultismItems.CHALK_WHITE_IMPURE.get()))
                .save(pRecipeOutput, ResourceLocation.fromNamespaceAndPath(OccultismDyenamics.MODID, "crafting/chalk_amber_impure"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, OccultismDyenamicsItems.CHALK_CONIFER_IMPURE.get())
                .requires(OccultismItems.CHALK_GREEN_IMPURE.get())
                .requires(OccultismTags.makeItemTag("c:dyes/conifer"))
                .unlockedBy("has_chalk_white_impure", has(OccultismItems.CHALK_WHITE_IMPURE.get()))
                .save(pRecipeOutput, ResourceLocation.fromNamespaceAndPath(OccultismDyenamics.MODID, "crafting/chalk_conifer_impure"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, OccultismDyenamicsItems.CHALK_ICY_BLUE_IMPURE.get())
                .requires(OccultismItems.CHALK_LIGHT_BLUE_IMPURE.get())
                .requires(OccultismTags.makeItemTag("c:dyes/icy_blue"))
                .unlockedBy("has_chalk_white_impure", has(OccultismItems.CHALK_WHITE_IMPURE.get()))
                .save(pRecipeOutput, ResourceLocation.fromNamespaceAndPath(OccultismDyenamics.MODID, "crafting/chalk_icy_blue_impure"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, OccultismDyenamicsItems.CHALK_ULTRAMARINE_IMPURE.get())
                .requires(OccultismItems.CHALK_BLUE_IMPURE.get())
                .requires(OccultismItems.CHALK_PURPLE_IMPURE.get())
                .requires(OccultismTags.makeItemTag("c:dyes/ultramarine"))
                .unlockedBy("has_chalk_white_impure", has(OccultismItems.CHALK_WHITE_IMPURE.get()))
                .save(pRecipeOutput, ResourceLocation.fromNamespaceAndPath(OccultismDyenamics.MODID, "crafting/chalk_ultramarine_impure"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, OccultismDyenamicsItems.CHALK_MAROON_IMPURE.get())
                .requires(OccultismItems.CHALK_RED_IMPURE.get())
                .requires(OccultismTags.makeItemTag("c:dyes/maroon"))
                .unlockedBy("has_chalk_white_impure", has(OccultismItems.CHALK_WHITE_IMPURE.get()))
                .save(pRecipeOutput, ResourceLocation.fromNamespaceAndPath(OccultismDyenamics.MODID, "crafting/chalk_maroon_impure"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, OccultismDyenamicsItems.CHALK_WINE_IMPURE.get())
                .requires(OccultismItems.CHALK_PURPLE_IMPURE.get())
                .requires(OccultismTags.makeItemTag("c:dyes/wine"))
                .unlockedBy("has_chalk_white_impure", has(OccultismItems.CHALK_WHITE_IMPURE.get()))
                .save(pRecipeOutput, ResourceLocation.fromNamespaceAndPath(OccultismDyenamics.MODID, "crafting/chalk_wine_impure"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, OccultismDyenamicsItems.CHALK_ROSE_IMPURE.get())
                .requires(OccultismItems.CHALK_PINK_IMPURE.get())
                .requires(OccultismItems.CHALK_MAGENTA_IMPURE.get())
                .requires(OccultismTags.makeItemTag("c:dyes/rose"))
                .unlockedBy("has_chalk_white_impure", has(OccultismItems.CHALK_WHITE_IMPURE.get()))
                .save(pRecipeOutput, ResourceLocation.fromNamespaceAndPath(OccultismDyenamics.MODID, "crafting/chalk_rose_impure"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, OccultismDyenamicsItems.CHALK_FLUORESCENT_IMPURE.get())
                .requires(OccultismItems.CHALK_YELLOW_IMPURE.get())
                .requires(OccultismTags.makeItemTag("c:dyes/fluorescent"))
                .unlockedBy("has_chalk_white_impure", has(OccultismItems.CHALK_WHITE_IMPURE.get()))
                .save(pRecipeOutput, ResourceLocation.fromNamespaceAndPath(OccultismDyenamics.MODID, "crafting/chalk_fluorescent_impure"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, OccultismDyenamicsItems.CHALK_SPRING_GREEN_IMPURE.get())
                .requires(OccultismItems.CHALK_LIME_IMPURE.get())
                .requires(OccultismTags.makeItemTag("c:dyes/spring_green"))
                .unlockedBy("has_chalk_white_impure", has(OccultismItems.CHALK_WHITE_IMPURE.get()))
                .save(pRecipeOutput, ResourceLocation.fromNamespaceAndPath(OccultismDyenamics.MODID, "crafting/chalk_spring_green_impure"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, OccultismDyenamicsItems.CHALK_PEACH_IMPURE.get())
                .requires(OccultismItems.CHALK_BROWN_IMPURE.get())
                .requires(OccultismTags.makeItemTag("c:dyes/peach"))
                .unlockedBy("has_chalk_white_impure", has(OccultismItems.CHALK_WHITE_IMPURE.get()))
                .save(pRecipeOutput, ResourceLocation.fromNamespaceAndPath(OccultismDyenamics.MODID, "crafting/chalk_peach_impure"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, OccultismDyenamicsItems.CHALK_CHERENKOV_IMPURE.get())
                .requires(OccultismItems.CHALK_CYAN_IMPURE.get())
                .requires(OccultismItems.CHALK_LIGHT_BLUE_IMPURE.get())
                .requires(OccultismTags.makeItemTag("c:dyes/cherenkov"))
                .unlockedBy("has_chalk_white_impure", has(OccultismItems.CHALK_WHITE_IMPURE.get()))
                .save(pRecipeOutput, ResourceLocation.fromNamespaceAndPath(OccultismDyenamics.MODID, "crafting/chalk_cherenkov_impure"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, OccultismDyenamicsItems.CHALK_AQUAMARINE_IMPURE.get())
                .requires(OccultismItems.CHALK_CYAN_IMPURE.get())
                .requires(OccultismTags.makeItemTag("c:dyes/aquamarine"))
                .unlockedBy("has_chalk_white_impure", has(OccultismItems.CHALK_WHITE_IMPURE.get()))
                .save(pRecipeOutput, ResourceLocation.fromNamespaceAndPath(OccultismDyenamics.MODID, "crafting/chalk_aquamarine_impure"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, OccultismDyenamicsItems.CHALK_PERSIMMON_IMPURE.get())
                .requires(OccultismItems.CHALK_BROWN_IMPURE.get())
                .requires(OccultismItems.CHALK_RED_IMPURE.get())
                .requires(OccultismTags.makeItemTag("c:dyes/persimmon"))
                .unlockedBy("has_chalk_white_impure", has(OccultismItems.CHALK_WHITE_IMPURE.get()))
                .save(pRecipeOutput, ResourceLocation.fromNamespaceAndPath(OccultismDyenamics.MODID, "crafting/chalk_persimmon_impure"));

        //Candles
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, OccultismDyenamicsBlocks.LARGE_CANDLE_HONEY.get())
                .requires(OccultismBlocks.LARGE_CANDLE.get())
                .requires(OccultismTags.makeItemTag("c:dyes/honey"))
                .unlockedBy("has_large_candle", has(OccultismBlocks.LARGE_CANDLE.get()))
                .save(pRecipeOutput, ResourceLocation.fromNamespaceAndPath(OccultismDyenamics.MODID, "crafting/large_candle_honey"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, OccultismDyenamicsBlocks.LARGE_CANDLE_MINT.get())
                .requires(OccultismBlocks.LARGE_CANDLE.get())
                .requires(OccultismTags.makeItemTag("c:dyes/mint"))
                .unlockedBy("has_large_candle", has(OccultismBlocks.LARGE_CANDLE.get()))
                .save(pRecipeOutput, ResourceLocation.fromNamespaceAndPath(OccultismDyenamics.MODID, "crafting/large_candle_mint"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, OccultismDyenamicsBlocks.LARGE_CANDLE_LAVENDER.get())
                .requires(OccultismBlocks.LARGE_CANDLE.get())
                .requires(OccultismTags.makeItemTag("c:dyes/lavender"))
                .unlockedBy("has_large_candle", has(OccultismBlocks.LARGE_CANDLE.get()))
                .save(pRecipeOutput, ResourceLocation.fromNamespaceAndPath(OccultismDyenamics.MODID, "crafting/large_candle_lavender"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, OccultismDyenamicsBlocks.LARGE_CANDLE_NAVY.get())
                .requires(OccultismBlocks.LARGE_CANDLE.get())
                .requires(OccultismTags.makeItemTag("c:dyes/navy"))
                .unlockedBy("has_large_candle", has(OccultismBlocks.LARGE_CANDLE.get()))
                .save(pRecipeOutput, ResourceLocation.fromNamespaceAndPath(OccultismDyenamics.MODID, "crafting/large_candle_navy"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, OccultismDyenamicsBlocks.LARGE_CANDLE_BUBBLEGUM.get())
                .requires(OccultismBlocks.LARGE_CANDLE.get())
                .requires(OccultismTags.makeItemTag("c:dyes/bubblegum"))
                .unlockedBy("has_large_candle", has(OccultismBlocks.LARGE_CANDLE.get()))
                .save(pRecipeOutput, ResourceLocation.fromNamespaceAndPath(OccultismDyenamics.MODID, "crafting/large_candle_bubblegum"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, OccultismDyenamicsBlocks.LARGE_CANDLE_AMBER.get())
                .requires(OccultismBlocks.LARGE_CANDLE.get())
                .requires(OccultismTags.makeItemTag("c:dyes/amber"))
                .unlockedBy("has_large_candle", has(OccultismBlocks.LARGE_CANDLE.get()))
                .save(pRecipeOutput, ResourceLocation.fromNamespaceAndPath(OccultismDyenamics.MODID, "crafting/large_candle_amber"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, OccultismDyenamicsBlocks.LARGE_CANDLE_CONIFER.get())
                .requires(OccultismBlocks.LARGE_CANDLE.get())
                .requires(OccultismTags.makeItemTag("c:dyes/conifer"))
                .unlockedBy("has_large_candle", has(OccultismBlocks.LARGE_CANDLE.get()))
                .save(pRecipeOutput, ResourceLocation.fromNamespaceAndPath(OccultismDyenamics.MODID, "crafting/large_candle_conifer"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, OccultismDyenamicsBlocks.LARGE_CANDLE_ICY_BLUE.get())
                .requires(OccultismBlocks.LARGE_CANDLE.get())
                .requires(OccultismTags.makeItemTag("c:dyes/icy_blue"))
                .unlockedBy("has_large_candle", has(OccultismBlocks.LARGE_CANDLE.get()))
                .save(pRecipeOutput, ResourceLocation.fromNamespaceAndPath(OccultismDyenamics.MODID, "crafting/large_candle_icy_blue"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, OccultismDyenamicsBlocks.LARGE_CANDLE_ULTRAMARINE.get())
                .requires(OccultismBlocks.LARGE_CANDLE.get())
                .requires(OccultismTags.makeItemTag("c:dyes/ultramarine"))
                .unlockedBy("has_large_candle", has(OccultismBlocks.LARGE_CANDLE.get()))
                .save(pRecipeOutput, ResourceLocation.fromNamespaceAndPath(OccultismDyenamics.MODID, "crafting/large_candle_ultramarine"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, OccultismDyenamicsBlocks.LARGE_CANDLE_MAROON.get())
                .requires(OccultismBlocks.LARGE_CANDLE.get())
                .requires(OccultismTags.makeItemTag("c:dyes/maroon"))
                .unlockedBy("has_large_candle", has(OccultismBlocks.LARGE_CANDLE.get()))
                .save(pRecipeOutput, ResourceLocation.fromNamespaceAndPath(OccultismDyenamics.MODID, "crafting/large_candle_maroon"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, OccultismDyenamicsBlocks.LARGE_CANDLE_WINE.get())
                .requires(OccultismBlocks.LARGE_CANDLE.get())
                .requires(OccultismTags.makeItemTag("c:dyes/wine"))
                .unlockedBy("has_large_candle", has(OccultismBlocks.LARGE_CANDLE.get()))
                .save(pRecipeOutput, ResourceLocation.fromNamespaceAndPath(OccultismDyenamics.MODID, "crafting/large_candle_wine"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, OccultismDyenamicsBlocks.LARGE_CANDLE_FLUORESCENT.get())
                .requires(OccultismBlocks.LARGE_CANDLE.get())
                .requires(OccultismTags.makeItemTag("c:dyes/fluorescent"))
                .unlockedBy("has_large_candle", has(OccultismBlocks.LARGE_CANDLE.get()))
                .save(pRecipeOutput, ResourceLocation.fromNamespaceAndPath(OccultismDyenamics.MODID, "crafting/large_candle_fluorescent"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, OccultismDyenamicsBlocks.LARGE_CANDLE_ROSE.get())
                .requires(OccultismBlocks.LARGE_CANDLE.get())
                .requires(OccultismTags.makeItemTag("c:dyes/rose"))
                .unlockedBy("has_large_candle", has(OccultismBlocks.LARGE_CANDLE.get()))
                .save(pRecipeOutput, ResourceLocation.fromNamespaceAndPath(OccultismDyenamics.MODID, "crafting/large_candle_rose"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, OccultismDyenamicsBlocks.LARGE_CANDLE_CHERENKOV.get())
                .requires(OccultismBlocks.LARGE_CANDLE.get())
                .requires(OccultismTags.makeItemTag("c:dyes/cherenkov"))
                .unlockedBy("has_large_candle", has(OccultismBlocks.LARGE_CANDLE.get()))
                .save(pRecipeOutput, ResourceLocation.fromNamespaceAndPath(OccultismDyenamics.MODID, "crafting/large_candle_cherenkov"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, OccultismDyenamicsBlocks.LARGE_CANDLE_AQUAMARINE.get())
                .requires(OccultismBlocks.LARGE_CANDLE.get())
                .requires(OccultismTags.makeItemTag("c:dyes/aquamarine"))
                .unlockedBy("has_large_candle", has(OccultismBlocks.LARGE_CANDLE.get()))
                .save(pRecipeOutput, ResourceLocation.fromNamespaceAndPath(OccultismDyenamics.MODID, "crafting/large_candle_aquamarine"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, OccultismDyenamicsBlocks.LARGE_CANDLE_PERSIMMON.get())
                .requires(OccultismBlocks.LARGE_CANDLE.get())
                .requires(OccultismTags.makeItemTag("c:dyes/persimmon"))
                .unlockedBy("has_large_candle", has(OccultismBlocks.LARGE_CANDLE.get()))
                .save(pRecipeOutput, ResourceLocation.fromNamespaceAndPath(OccultismDyenamics.MODID, "crafting/large_candle_persimmon"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, OccultismDyenamicsBlocks.LARGE_CANDLE_PEACH.get())
                .requires(OccultismBlocks.LARGE_CANDLE.get())
                .requires(OccultismTags.makeItemTag("c:dyes/peach"))
                .unlockedBy("has_large_candle", has(OccultismBlocks.LARGE_CANDLE.get()))
                .save(pRecipeOutput, ResourceLocation.fromNamespaceAndPath(OccultismDyenamics.MODID, "crafting/large_candle_peach"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, OccultismDyenamicsBlocks.LARGE_CANDLE_SPRING_GREEN.get())
                .requires(OccultismBlocks.LARGE_CANDLE.get())
                .requires(OccultismTags.makeItemTag("c:dyes/spring_green"))
                .unlockedBy("has_large_candle", has(OccultismBlocks.LARGE_CANDLE.get()))
                .save(pRecipeOutput, ResourceLocation.fromNamespaceAndPath(OccultismDyenamics.MODID, "crafting/large_candle_spring_green"));

    }

    private static void spiritFireRecipes(RecipeOutput pRecipeOutput) {
        spiritfireTransmute(OccultismDyenamicsItems.CHALK_HONEY_IMPURE.asItem(), OccultismDyenamicsItems.CHALK_HONEY.asItem(), pRecipeOutput);
        spiritfireTransmute(OccultismDyenamicsItems.CHALK_MINT_IMPURE.asItem(), OccultismDyenamicsItems.CHALK_MINT.asItem(), pRecipeOutput);
        spiritfireTransmute(OccultismDyenamicsItems.CHALK_LAVENDER_IMPURE.asItem(), OccultismDyenamicsItems.CHALK_LAVENDER.asItem(), pRecipeOutput);
        spiritfireTransmute(OccultismDyenamicsItems.CHALK_NAVY_IMPURE.asItem(), OccultismDyenamicsItems.CHALK_NAVY.asItem(), pRecipeOutput);
        spiritfireTransmute(OccultismDyenamicsItems.CHALK_ICY_BLUE_IMPURE.asItem(), OccultismDyenamicsItems.CHALK_ICY_BLUE.asItem(), pRecipeOutput);
        spiritfireTransmute(OccultismDyenamicsItems.CHALK_SPRING_GREEN_IMPURE.asItem(), OccultismDyenamicsItems.CHALK_SPRING_GREEN.asItem(), pRecipeOutput);
        spiritfireTransmute(OccultismDyenamicsItems.CHALK_ULTRAMARINE_IMPURE.asItem(), OccultismDyenamicsItems.CHALK_ULTRAMARINE.asItem(), pRecipeOutput);
        spiritfireTransmute(OccultismDyenamicsItems.CHALK_CONIFER_IMPURE.asItem(), OccultismDyenamicsItems.CHALK_CONIFER.asItem(), pRecipeOutput);
        spiritfireTransmute(OccultismDyenamicsItems.CHALK_AMBER_IMPURE.asItem(), OccultismDyenamicsItems.CHALK_AMBER.asItem(), pRecipeOutput);
        spiritfireTransmute(OccultismDyenamicsItems.CHALK_FLUORESCENT_IMPURE.asItem(), OccultismDyenamicsItems.CHALK_FLUORESCENT.asItem(), pRecipeOutput);
        spiritfireTransmute(OccultismDyenamicsItems.CHALK_MAROON_IMPURE.asItem(), OccultismDyenamicsItems.CHALK_MAROON.asItem(), pRecipeOutput);
        spiritfireTransmute(OccultismDyenamicsItems.CHALK_ROSE_IMPURE.asItem(), OccultismDyenamicsItems.CHALK_ROSE.asItem(), pRecipeOutput);
        spiritfireTransmute(OccultismDyenamicsItems.CHALK_CHERENKOV_IMPURE.asItem(), OccultismDyenamicsItems.CHALK_CHERENKOV.asItem(), pRecipeOutput);
        spiritfireTransmute(OccultismDyenamicsItems.CHALK_WINE_IMPURE.asItem(), OccultismDyenamicsItems.CHALK_WINE.asItem(), pRecipeOutput);
        spiritfireTransmute(OccultismDyenamicsItems.CHALK_BUBBLEGUM_IMPURE.asItem(), OccultismDyenamicsItems.CHALK_BUBBLEGUM.asItem(), pRecipeOutput);
        spiritfireTransmute(OccultismDyenamicsItems.CHALK_PEACH_IMPURE.asItem(), OccultismDyenamicsItems.CHALK_PEACH.asItem(), pRecipeOutput);
        spiritfireTransmute(OccultismDyenamicsItems.CHALK_AQUAMARINE_IMPURE.asItem(), OccultismDyenamicsItems.CHALK_AQUAMARINE.asItem(), pRecipeOutput);
        spiritfireTransmute(OccultismDyenamicsItems.CHALK_PERSIMMON_IMPURE.asItem(), OccultismDyenamicsItems.CHALK_PERSIMMON.asItem(), pRecipeOutput);
    }

    protected static void spiritfireTransmute(Item input, Item output, RecipeOutput pRecipeOutput){
        SpiritFireRecipeBuilder.spiritFireRecipe(Ingredient.of(input), new ItemStack(output))
                .unlockedBy("has_" + input.toString().replace("minecraft:","").replace("occultism:",""), has(input))
                .save(pRecipeOutput, ResourceLocation.fromNamespaceAndPath(OccultismDyenamics.MODID, "spirit_fire/" + output.toString().replace("occultism_dyenamics:","")));
    }
}
