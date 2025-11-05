package com.eqisedu.occultism_dyenamics.datagen.recipe;

import com.eqisedu.occultism_dyenamics.OccultismDyenamics;
import com.eqisedu.occultism_dyenamics.registry.OccultismDyenamicsItems;
import com.klikli_dev.occultism.Occultism;
import com.klikli_dev.occultism.datagen.recipe.builders.RitualRecipeBuilder;
import com.klikli_dev.occultism.registry.OccultismItems;
import com.klikli_dev.occultism.registry.OccultismRituals;
import com.klikli_dev.occultism.registry.OccultismTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.Tags;

import java.util.concurrent.CompletableFuture;

public abstract class RitualRecipes extends RecipeProvider {

    private static final ResourceLocation RITUAL_CRAFT = OccultismRituals.CRAFT.getId();
    private static final ResourceLocation PENTACLE_CONTACT_ELDRITCH_SPIRIT = ResourceLocation.fromNamespaceAndPath(Occultism.MODID, "contact_eldritch_spirit");

    public RitualRecipes(PackOutput p_248933_, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(p_248933_, lookupProvider);
    }

    public static void ritualRecipes(RecipeOutput recipeOutput, HolderLookup.Provider registries) {
        RitualRecipeBuilder.ritualRecipeBuilder(Ingredient.of(OccultismItems.BRUSH),
                        new ItemStack(OccultismDyenamicsItems.CHALK_PRISMATIC.get()),
                        new ItemStack(OccultismDyenamicsItems.RITUAL_DUMMY_FORGE_CHALK_PRISMATIC.get()),
                        780,
                        RITUAL_CRAFT,
                        PENTACLE_CONTACT_ELDRITCH_SPIRIT,
                        Ingredient.of(OccultismDyenamicsItems.CHALK_LAVENDER),
                        Ingredient.of(OccultismDyenamicsItems.CHALK_NAVY),
                        Ingredient.of(OccultismDyenamicsItems.CHALK_BUBBLEGUM),
                        Ingredient.of(OccultismDyenamicsItems.CHALK_AMBER),
                        Ingredient.of(OccultismDyenamicsItems.CHALK_CONIFER),
                        Ingredient.of(OccultismDyenamicsItems.CHALK_ICY_BLUE),
                        Ingredient.of(OccultismDyenamicsItems.CHALK_MAROON),
                        Ingredient.of(OccultismDyenamicsItems.CHALK_WINE),
                        Ingredient.of(OccultismDyenamicsItems.CHALK_FLUORESCENT),
                        Ingredient.of(OccultismDyenamicsItems.CHALK_SPRING_GREEN),
                        Ingredient.of(OccultismDyenamicsItems.CHALK_PEACH),
                        Ingredient.of(OccultismDyenamicsItems.CHALK_AQUAMARINE))
                .unlockedBy("has_bound_marid", has(OccultismItems.BOOK_OF_BINDING_BOUND_MARID.get()))
                .entityToSacrificeDisplayName("ritual.occultism.sacrifice.sheep")
                .entityToSacrifice(OccultismTags.Entities.SHEEP)
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(OccultismDyenamics.MODID, "ritual/misc_chalk_prismatic"));
        RitualRecipeBuilder.ritualRecipeBuilder(Ingredient.of(OccultismItems.BRUSH),
                        new ItemStack(OccultismDyenamicsItems.CHALK_MULTICOLORED.get()),
                        new ItemStack(OccultismDyenamicsItems.RITUAL_DUMMY_FORGE_CHALK_MULTICOLORED.get()),
                        780,
                        RITUAL_CRAFT,
                        PENTACLE_CONTACT_ELDRITCH_SPIRIT,
                        Ingredient.of(OccultismDyenamicsItems.CHALK_HONEY),
                        Ingredient.of(OccultismDyenamicsItems.CHALK_MINT),
                        Ingredient.of(OccultismDyenamicsItems.CHALK_ULTRAMARINE),
                        Ingredient.of(OccultismDyenamicsItems.CHALK_ROSE),
                        Ingredient.of(OccultismDyenamicsItems.CHALK_CHERENKOV),
                        Ingredient.of(OccultismDyenamicsItems.CHALK_PERSIMMON)
                        )
                .unlockedBy("has_bound_marid", has(OccultismItems.BOOK_OF_BINDING_BOUND_MARID.get()))
                .entityToSacrificeDisplayName("ritual.occultism.sacrifice.sheep")
                .entityToSacrifice(OccultismTags.Entities.SHEEP)
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(OccultismDyenamics.MODID, "ritual/misc_chalk_multicolored"));
        RitualRecipeBuilder.ritualRecipeBuilder(Ingredient.of(OccultismTags.makeItemTag("occultism_dyenamics:final_chalk")),
                        new ItemStack(OccultismDyenamicsItems.CHALK_CHOSEN.get()),
                        new ItemStack(OccultismDyenamicsItems.RITUAL_DUMMY_FORGE_CHALK_CHOSEN.get()),
                        780,
                        RITUAL_CRAFT,
                        PENTACLE_CONTACT_ELDRITCH_SPIRIT,
                        Ingredient.of(Tags.Items.DYES),
                        Ingredient.of(Tags.Items.DYES),
                        Ingredient.of(Tags.Items.DYES),
                        Ingredient.of(Tags.Items.DYES)
                )
                .unlockedBy("has_bound_marid", has(OccultismItems.BOOK_OF_BINDING_BOUND_MARID.get()))
                .entityToSacrificeDisplayName("ritual.occultism.sacrifice.sheep")
                .entityToSacrifice(OccultismTags.Entities.SHEEP)
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(OccultismDyenamics.MODID, "ritual/misc_chalk_chosen"));
    }
}
