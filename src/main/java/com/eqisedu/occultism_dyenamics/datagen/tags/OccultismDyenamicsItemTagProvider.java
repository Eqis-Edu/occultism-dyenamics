package com.eqisedu.occultism_dyenamics.datagen.tags;

import com.eqisedu.occultism_dyenamics.OccultismDyenamics;
import com.eqisedu.occultism_dyenamics.registry.OccultismDyenamicsBlocks;
import com.eqisedu.occultism_dyenamics.registry.OccultismDyenamicsItems;
import com.klikli_dev.occultism.registry.OccultismItems;
import com.klikli_dev.occultism.registry.OccultismTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class OccultismDyenamicsItemTagProvider extends ItemTagsProvider {
    public OccultismDyenamicsItemTagProvider(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_, CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, OccultismDyenamics.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(@NotNull HolderLookup.Provider provider) {
        this.tag(ItemTags.DYEABLE).add(OccultismDyenamicsItems.CHALK_CHOSEN.get());

        this.tag(OccultismTags.makeItemTag("occultism_dyenamics:final_chalk"))
                .add(OccultismItems.CHALK_RAINBOW.get())
                .add(OccultismItems.CHALK_VOID.get())
                .add(OccultismDyenamicsItems.CHALK_PRISMATIC.get())
                .add(OccultismDyenamicsItems.CHALK_MULTICOLORED.get())
                .add(OccultismDyenamicsItems.CHALK_CHOSEN.get());

        this.tag(OccultismTags.Items.TOOLS_CHALK)
                .add(OccultismDyenamicsItems.CHALK_HONEY.get())
                .add(OccultismDyenamicsItems.CHALK_MINT.get())
                .add(OccultismDyenamicsItems.CHALK_LAVENDER.get())
                .add(OccultismDyenamicsItems.CHALK_NAVY.get())
                .add(OccultismDyenamicsItems.CHALK_BUBBLEGUM.get())
                .add(OccultismDyenamicsItems.CHALK_AMBER.get())
                .add(OccultismDyenamicsItems.CHALK_CONIFER.get())
                .add(OccultismDyenamicsItems.CHALK_ICY_BLUE.get())
                .add(OccultismDyenamicsItems.CHALK_ULTRAMARINE.get())
                .add(OccultismDyenamicsItems.CHALK_MAROON.get())
                .add(OccultismDyenamicsItems.CHALK_WINE.get())
                .add(OccultismDyenamicsItems.CHALK_ROSE.get())
                .add(OccultismDyenamicsItems.CHALK_FLUORESCENT.get())
                .add(OccultismDyenamicsItems.CHALK_SPRING_GREEN.get())
                .add(OccultismDyenamicsItems.CHALK_PEACH.get())
                .add(OccultismDyenamicsItems.CHALK_CHERENKOV.get())
                .add(OccultismDyenamicsItems.CHALK_AQUAMARINE.get())
                .add(OccultismDyenamicsItems.CHALK_PERSIMMON.get())
                .add(OccultismDyenamicsItems.CHALK_PRISMATIC.get())
                .add(OccultismDyenamicsItems.CHALK_MULTICOLORED.get())
                .add(OccultismDyenamicsItems.CHALK_CHOSEN.get())
                .replace(false);

        this.tag(OccultismTags.Items.OCCULTISM_CANDLES).add(
                OccultismDyenamicsBlocks.LARGE_CANDLE_HONEY.asItem(),
                OccultismDyenamicsBlocks.LARGE_CANDLE_MINT.asItem(),
                OccultismDyenamicsBlocks.LARGE_CANDLE_LAVENDER.asItem(),
                OccultismDyenamicsBlocks.LARGE_CANDLE_NAVY.asItem(),
                OccultismDyenamicsBlocks.LARGE_CANDLE_BUBBLEGUM.asItem(),
                OccultismDyenamicsBlocks.LARGE_CANDLE_AMBER.asItem(),
                OccultismDyenamicsBlocks.LARGE_CANDLE_CONIFER.asItem(),
                OccultismDyenamicsBlocks.LARGE_CANDLE_ICY_BLUE.asItem(),
                OccultismDyenamicsBlocks.LARGE_CANDLE_ULTRAMARINE.asItem(),
                OccultismDyenamicsBlocks.LARGE_CANDLE_MAROON.asItem(),
                OccultismDyenamicsBlocks.LARGE_CANDLE_WINE.asItem(),
                OccultismDyenamicsBlocks.LARGE_CANDLE_ROSE.asItem(),
                OccultismDyenamicsBlocks.LARGE_CANDLE_FLUORESCENT.asItem(),
                OccultismDyenamicsBlocks.LARGE_CANDLE_SPRING_GREEN.asItem(),
                OccultismDyenamicsBlocks.LARGE_CANDLE_PEACH.asItem(),
                OccultismDyenamicsBlocks.LARGE_CANDLE_CHERENKOV.asItem(),
                OccultismDyenamicsBlocks.LARGE_CANDLE_AQUAMARINE.asItem(),
                OccultismDyenamicsBlocks.LARGE_CANDLE_PERSIMMON.asItem()
        ).replace(false);
    }
}
