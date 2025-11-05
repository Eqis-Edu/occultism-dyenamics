package com.eqisedu.occultism_dyenamics.datagen.tags;

import com.eqisedu.occultism_dyenamics.OccultismDyenamics;
import com.eqisedu.occultism_dyenamics.registry.OccultismDyenamicsBlocks;
import com.klikli_dev.occultism.registry.OccultismTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class OccultismDyenamicsBlockTagProvider extends BlockTagsProvider {
    public OccultismDyenamicsBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, OccultismDyenamics.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(@NotNull HolderLookup.Provider provider) {
        this.tag(OccultismTags.Blocks.CHALK_GLYPHS)
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_HONEY.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_MINT.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_LAVENDER.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_NAVY.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_BUBBLEGUM.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_AMBER.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_CONIFER.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_ICY_BLUE.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_ULTRAMARINE.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_MAROON.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_WINE.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_ROSE.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_FLUORESCENT.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_SPRING_GREEN.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_PEACH.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_CHERENKOV.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_AQUAMARINE.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_PERSIMMON.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_CHOSEN.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_PRISMATIC.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_MULTICOLORED.get());

        this.tag(OccultismTags.Blocks.GLYPHS_BLACK)
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_CHOSEN.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_PRISMATIC.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_MULTICOLORED.get());
        this.tag(OccultismTags.Blocks.FOUNDATION_GLYPHS_DARK)
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_CHOSEN.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_PRISMATIC.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_MULTICOLORED.get());
        this.tag(OccultismTags.Blocks.FOUNDATION_GLYPHS_NO_WHITE)
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_CHOSEN.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_PRISMATIC.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_MULTICOLORED.get());
        this.tag(OccultismTags.Blocks.FOUNDATION_GLYPHS_ANY)
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_CHOSEN.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_PRISMATIC.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_MULTICOLORED.get());
        this.tag(OccultismTags.Blocks.GLYPHS_RED)
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_CHOSEN.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_PRISMATIC.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_MULTICOLORED.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_MAROON.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_PERSIMMON.get());
        this.tag(OccultismTags.Blocks.GLYPHS_BROWN)
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_CHOSEN.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_PRISMATIC.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_MULTICOLORED.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_PEACH.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_PERSIMMON.get());
        this.tag(OccultismTags.Blocks.GLYPHS_ORANGE)
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_CHOSEN.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_PRISMATIC.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_MULTICOLORED.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_AMBER.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_HONEY.get());
        this.tag(OccultismTags.Blocks.GLYPHS_YELLOW)
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_CHOSEN.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_PRISMATIC.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_MULTICOLORED.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_HONEY.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_FLUORESCENT.get());
        this.tag(OccultismTags.Blocks.GLYPHS_LIME)
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_CHOSEN.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_PRISMATIC.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_MULTICOLORED.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_MINT.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_SPRING_GREEN.get());
        this.tag(OccultismTags.Blocks.GLYPHS_GREEN)
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_CHOSEN.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_PRISMATIC.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_MULTICOLORED.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_CONIFER.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_MINT.get());
        this.tag(OccultismTags.Blocks.GLYPHS_CYAN)
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_CHOSEN.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_PRISMATIC.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_MULTICOLORED.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_CHERENKOV.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_AQUAMARINE.get());
        this.tag(OccultismTags.Blocks.GLYPHS_BLUE)
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_CHOSEN.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_PRISMATIC.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_MULTICOLORED.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_NAVY.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_ULTRAMARINE.get());
        this.tag(OccultismTags.Blocks.GLYPHS_LIGHT_BLUE)
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_CHOSEN.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_PRISMATIC.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_MULTICOLORED.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_ICY_BLUE.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_CHERENKOV.get());
        this.tag(OccultismTags.Blocks.GLYPHS_PINK)
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_CHOSEN.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_PRISMATIC.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_MULTICOLORED.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_BUBBLEGUM.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_ROSE.get());
        this.tag(OccultismTags.Blocks.GLYPHS_MAGENTA)
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_CHOSEN.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_PRISMATIC.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_MULTICOLORED.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_LAVENDER.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_ROSE.get());
        this.tag(OccultismTags.Blocks.GLYPHS_PURPLE)
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_CHOSEN.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_PRISMATIC.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_MULTICOLORED.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_ULTRAMARINE.get())
                .add(OccultismDyenamicsBlocks.CHALK_GLYPH_WINE.get());

        this.tag(OccultismTags.Blocks.OCCULTISM_CANDLES).add(
                OccultismDyenamicsBlocks.LARGE_CANDLE_HONEY.get(),
                OccultismDyenamicsBlocks.LARGE_CANDLE_MINT.get(),
                OccultismDyenamicsBlocks.LARGE_CANDLE_LAVENDER.get(),
                OccultismDyenamicsBlocks.LARGE_CANDLE_NAVY.get(),
                OccultismDyenamicsBlocks.LARGE_CANDLE_BUBBLEGUM.get(),
                OccultismDyenamicsBlocks.LARGE_CANDLE_AMBER.get(),
                OccultismDyenamicsBlocks.LARGE_CANDLE_CONIFER.get(),
                OccultismDyenamicsBlocks.LARGE_CANDLE_ICY_BLUE.get(),
                OccultismDyenamicsBlocks.LARGE_CANDLE_ULTRAMARINE.get(),
                OccultismDyenamicsBlocks.LARGE_CANDLE_MAROON.get(),
                OccultismDyenamicsBlocks.LARGE_CANDLE_WINE.get(),
                OccultismDyenamicsBlocks.LARGE_CANDLE_ROSE.get(),
                OccultismDyenamicsBlocks.LARGE_CANDLE_FLUORESCENT.get(),
                OccultismDyenamicsBlocks.LARGE_CANDLE_SPRING_GREEN.get(),
                OccultismDyenamicsBlocks.LARGE_CANDLE_PEACH.get(),
                OccultismDyenamicsBlocks.LARGE_CANDLE_CHERENKOV.get(),
                OccultismDyenamicsBlocks.LARGE_CANDLE_AQUAMARINE.get(),
                OccultismDyenamicsBlocks.LARGE_CANDLE_PERSIMMON.get()
        ).replace(false);
    }
}
