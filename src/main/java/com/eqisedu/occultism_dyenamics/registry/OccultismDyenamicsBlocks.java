/*
 * MIT License
 *
 * Copyright 2020 klikli-dev
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following
 * conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial
 * portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR
 * PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT
 * OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 */

package com.eqisedu.occultism_dyenamics.registry;

import com.eqisedu.occultism_dyenamics.OccultismDyenamics;
import com.eqisedu.occultism_dyenamics.common.block.ChosenGlyphBlock;
import com.eqisedu.occultism_dyenamics.common.block.PrismaticGlyphBlock;
import com.klikli_dev.occultism.common.block.ChalkGlyphBlock;
import com.klikli_dev.occultism.common.block.LargeCandleBlock;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class OccultismDyenamicsBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(OccultismDyenamics.MODID);
    public static final Map<ResourceLocation, BlockDataGenSettings> BLOCK_DATA_GEN_SETTINGS = new HashMap<>();

    public static final Block.Properties GLYPH_PROPERTIES = Block.Properties.of()
            .sound(SoundType.WOOL)
            .pushReaction(PushReaction.DESTROY)
            .replaceable()
            .noCollission()
            .noLootTable()
            .strength(5f, 30);
    public static final DeferredBlock<ChalkGlyphBlock> CHALK_GLYPH_HONEY = register("chalk_glyph_honey",
            () -> new ChalkGlyphBlock(GLYPH_PROPERTIES, OccultismDyenamics.CLIENT_CONFIG.visuals.honeyChalkGlyphColor, OccultismDyenamicsItems.CHALK_HONEY), false);
    public static final DeferredBlock<ChalkGlyphBlock> CHALK_GLYPH_ICY_BLUE = register("chalk_glyph_icy_blue",
            () -> new ChalkGlyphBlock(GLYPH_PROPERTIES, OccultismDyenamics.CLIENT_CONFIG.visuals.icyBlueChalkGlyphColor, OccultismDyenamicsItems.CHALK_ICY_BLUE), false);
    public static final DeferredBlock<ChalkGlyphBlock> CHALK_GLYPH_AMBER = register("chalk_glyph_amber",
            () -> new ChalkGlyphBlock(GLYPH_PROPERTIES, OccultismDyenamics.CLIENT_CONFIG.visuals.amberChalkGlyphColor, OccultismDyenamicsItems.CHALK_AMBER), false);
    public static final DeferredBlock<ChalkGlyphBlock> CHALK_GLYPH_MINT = register("chalk_glyph_mint",
            () -> new ChalkGlyphBlock(GLYPH_PROPERTIES, OccultismDyenamics.CLIENT_CONFIG.visuals.mintChalkGlyphColor, OccultismDyenamicsItems.CHALK_MINT), false);
    public static final DeferredBlock<ChalkGlyphBlock> CHALK_GLYPH_LAVENDER = register("chalk_glyph_lavender",
            () -> new ChalkGlyphBlock(GLYPH_PROPERTIES, OccultismDyenamics.CLIENT_CONFIG.visuals.lavenderChalkGlyphColor, OccultismDyenamicsItems.CHALK_LAVENDER), false);
    public static final DeferredBlock<ChalkGlyphBlock> CHALK_GLYPH_NAVY = register("chalk_glyph_navy",
            () -> new ChalkGlyphBlock(GLYPH_PROPERTIES, OccultismDyenamics.CLIENT_CONFIG.visuals.navyChalkGlyphColor, OccultismDyenamicsItems.CHALK_NAVY), false);
    public static final DeferredBlock<ChalkGlyphBlock> CHALK_GLYPH_BUBBLEGUM = register("chalk_glyph_bubblegum",
            () -> new ChalkGlyphBlock(GLYPH_PROPERTIES, OccultismDyenamics.CLIENT_CONFIG.visuals.bubblegumChalkGlyphColor, OccultismDyenamicsItems.CHALK_BUBBLEGUM), false);
    public static final DeferredBlock<ChalkGlyphBlock> CHALK_GLYPH_CONIFER = register("chalk_glyph_conifer",
            () -> new ChalkGlyphBlock(GLYPH_PROPERTIES, OccultismDyenamics.CLIENT_CONFIG.visuals.coniferChalkGlyphColor, OccultismDyenamicsItems.CHALK_CONIFER), false);
    public static final DeferredBlock<ChalkGlyphBlock> CHALK_GLYPH_ULTRAMARINE = register("chalk_glyph_ultramarine",
            () -> new ChalkGlyphBlock(GLYPH_PROPERTIES, OccultismDyenamics.CLIENT_CONFIG.visuals.ultramarineChalkGlyphColor, OccultismDyenamicsItems.CHALK_ULTRAMARINE), false);
    public static final DeferredBlock<ChalkGlyphBlock> CHALK_GLYPH_MAROON = register("chalk_glyph_maroon",
            () -> new ChalkGlyphBlock(GLYPH_PROPERTIES, OccultismDyenamics.CLIENT_CONFIG.visuals.maroonChalkGlyphColor, OccultismDyenamicsItems.CHALK_MAROON), false);
    public static final DeferredBlock<ChalkGlyphBlock> CHALK_GLYPH_WINE = register("chalk_glyph_wine",
            () -> new ChalkGlyphBlock(GLYPH_PROPERTIES, OccultismDyenamics.CLIENT_CONFIG.visuals.wineChalkGlyphColor, OccultismDyenamicsItems.CHALK_WINE), false);
    public static final DeferredBlock<ChalkGlyphBlock> CHALK_GLYPH_ROSE = register("chalk_glyph_rose",
            () -> new ChalkGlyphBlock(GLYPH_PROPERTIES, OccultismDyenamics.CLIENT_CONFIG.visuals.roseChalkGlyphColor, OccultismDyenamicsItems.CHALK_ROSE), false);
    public static final DeferredBlock<ChalkGlyphBlock> CHALK_GLYPH_FLUORESCENT = register("chalk_glyph_fluorescent",
            () -> new ChalkGlyphBlock(GLYPH_PROPERTIES, OccultismDyenamics.CLIENT_CONFIG.visuals.fluorescentChalkGlyphColor, OccultismDyenamicsItems.CHALK_FLUORESCENT), false);
    public static final DeferredBlock<ChalkGlyphBlock> CHALK_GLYPH_SPRING_GREEN = register("chalk_glyph_spring_green",
            () -> new ChalkGlyphBlock(GLYPH_PROPERTIES, OccultismDyenamics.CLIENT_CONFIG.visuals.springGreenChalkGlyphColor, OccultismDyenamicsItems.CHALK_SPRING_GREEN), false);
    public static final DeferredBlock<ChalkGlyphBlock> CHALK_GLYPH_PEACH = register("chalk_glyph_peach",
            () -> new ChalkGlyphBlock(GLYPH_PROPERTIES, OccultismDyenamics.CLIENT_CONFIG.visuals.peachChalkGlyphColor, OccultismDyenamicsItems.CHALK_PEACH), false);
    public static final DeferredBlock<ChalkGlyphBlock> CHALK_GLYPH_CHERENKOV = register("chalk_glyph_cherenkov",
            () -> new ChalkGlyphBlock(GLYPH_PROPERTIES, OccultismDyenamics.CLIENT_CONFIG.visuals.cherenkovChalkGlyphColor, OccultismDyenamicsItems.CHALK_CHERENKOV), false);
    public static final DeferredBlock<ChalkGlyphBlock> CHALK_GLYPH_AQUAMARINE = register("chalk_glyph_aquamarine",
            () -> new ChalkGlyphBlock(GLYPH_PROPERTIES, OccultismDyenamics.CLIENT_CONFIG.visuals.aquamarineChalkGlyphColor, OccultismDyenamicsItems.CHALK_AQUAMARINE), false);
    public static final DeferredBlock<ChalkGlyphBlock> CHALK_GLYPH_PERSIMMON = register("chalk_glyph_persimmon",
            () -> new ChalkGlyphBlock(GLYPH_PROPERTIES, OccultismDyenamics.CLIENT_CONFIG.visuals.persimmonChalkGlyphColor, OccultismDyenamicsItems.CHALK_PERSIMMON), false);

    public static final DeferredBlock<PrismaticGlyphBlock> CHALK_GLYPH_PRISMATIC = register("chalk_glyph_prismatic",
            () -> new PrismaticGlyphBlock(GLYPH_PROPERTIES, true, OccultismDyenamicsItems.CHALK_PRISMATIC), false);
    public static final DeferredBlock<PrismaticGlyphBlock> CHALK_GLYPH_MULTICOLORED = register("chalk_glyph_multicolored",
            () -> new PrismaticGlyphBlock(GLYPH_PROPERTIES, false, OccultismDyenamicsItems.CHALK_MULTICOLORED), false);
    public static final DeferredBlock<ChosenGlyphBlock> CHALK_GLYPH_CHOSEN = register("chalk_glyph_chosen",
            () -> new ChosenGlyphBlock(GLYPH_PROPERTIES, OccultismDyenamicsItems.CHALK_CHOSEN), false);

    public static final DeferredBlock<LargeCandleBlock> LARGE_CANDLE_HONEY = register("large_candle_honey",
            () -> new LargeCandleBlock(Block.Properties.of()
                    .mapColor(MapColor.COLOR_YELLOW).sound(SoundType.CANDLE).noCollission().strength(0.1f, 0)
                    .lightLevel(LargeCandleBlock.LIGHT_EMISSION)), true);
    public static final DeferredBlock<LargeCandleBlock> LARGE_CANDLE_MINT = register("large_candle_mint",
            () -> new LargeCandleBlock(Block.Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_GREEN).sound(SoundType.CANDLE).noCollission().strength(0.1f, 0)
                    .lightLevel(LargeCandleBlock.LIGHT_EMISSION)), true);
    public static final DeferredBlock<LargeCandleBlock> LARGE_CANDLE_LAVENDER = register("large_candle_lavender",
            () -> new LargeCandleBlock(Block.Properties.of()
                    .mapColor(MapColor.COLOR_MAGENTA).sound(SoundType.CANDLE).noCollission().strength(0.1f, 0)
                    .lightLevel(LargeCandleBlock.LIGHT_EMISSION)), true);
    public static final DeferredBlock<LargeCandleBlock> LARGE_CANDLE_NAVY = register("large_candle_navy",
            () -> new LargeCandleBlock(Block.Properties.of()
                    .mapColor(MapColor.COLOR_BLUE).sound(SoundType.CANDLE).noCollission().strength(0.1f, 0)
                    .lightLevel(LargeCandleBlock.LIGHT_EMISSION)), true);
    public static final DeferredBlock<LargeCandleBlock> LARGE_CANDLE_BUBBLEGUM = register("large_candle_bubblegum",
            () -> new LargeCandleBlock(Block.Properties.of()
                    .mapColor(MapColor.COLOR_PINK).sound(SoundType.CANDLE).noCollission().strength(0.1f, 0)
                    .lightLevel(LargeCandleBlock.LIGHT_EMISSION)), true);
    public static final DeferredBlock<LargeCandleBlock> LARGE_CANDLE_AMBER = register("large_candle_amber",
            () -> new LargeCandleBlock(Block.Properties.of()
                    .mapColor(MapColor.COLOR_ORANGE).sound(SoundType.CANDLE).noCollission().strength(0.1f, 0)
                    .lightLevel(LargeCandleBlock.LIGHT_EMISSION)), true);
    public static final DeferredBlock<LargeCandleBlock> LARGE_CANDLE_CONIFER = register("large_candle_conifer",
            () -> new LargeCandleBlock(Block.Properties.of()
                    .mapColor(MapColor.COLOR_GREEN).sound(SoundType.CANDLE).noCollission().strength(0.1f, 0)
                    .lightLevel(LargeCandleBlock.LIGHT_EMISSION)), true);
    public static final DeferredBlock<LargeCandleBlock> LARGE_CANDLE_ICY_BLUE = register("large_candle_icy_blue",
            () -> new LargeCandleBlock(Block.Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_BLUE).sound(SoundType.CANDLE).noCollission().strength(0.1f, 0)
                    .lightLevel(LargeCandleBlock.LIGHT_EMISSION)), true);
    public static final DeferredBlock<LargeCandleBlock> LARGE_CANDLE_ULTRAMARINE = register("large_candle_ultramarine",
            () -> new LargeCandleBlock(Block.Properties.of()
                    .mapColor(MapColor.COLOR_BLUE).sound(SoundType.CANDLE).noCollission().strength(0.1f, 0)
                    .lightLevel(LargeCandleBlock.LIGHT_EMISSION)), true);
    public static final DeferredBlock<LargeCandleBlock> LARGE_CANDLE_MAROON = register("large_candle_maroon",
            () -> new LargeCandleBlock(Block.Properties.of()
                    .mapColor(MapColor.COLOR_RED).sound(SoundType.CANDLE).noCollission().strength(0.1f, 0)
                    .lightLevel(LargeCandleBlock.LIGHT_EMISSION)), true);
    public static final DeferredBlock<LargeCandleBlock> LARGE_CANDLE_WINE = register("large_candle_wine",
            () -> new LargeCandleBlock(Block.Properties.of()
                    .mapColor(MapColor.COLOR_PURPLE).sound(SoundType.CANDLE).noCollission().strength(0.1f, 0)
                    .lightLevel(LargeCandleBlock.LIGHT_EMISSION)), true);
    public static final DeferredBlock<LargeCandleBlock> LARGE_CANDLE_ROSE = register("large_candle_rose",
            () -> new LargeCandleBlock(Block.Properties.of()
                    .mapColor(MapColor.COLOR_PINK).sound(SoundType.CANDLE).noCollission().strength(0.1f, 0)
                    .lightLevel(LargeCandleBlock.LIGHT_EMISSION)), true);
    public static final DeferredBlock<LargeCandleBlock> LARGE_CANDLE_FLUORESCENT = register("large_candle_fluorescent",
            () -> new LargeCandleBlock(Block.Properties.of()
                    .mapColor(MapColor.COLOR_YELLOW).sound(SoundType.CANDLE).noCollission().strength(0.1f, 0)
                    .lightLevel(LargeCandleBlock.LIGHT_EMISSION)), true);
    public static final DeferredBlock<LargeCandleBlock> LARGE_CANDLE_SPRING_GREEN = register("large_candle_spring_green",
            () -> new LargeCandleBlock(Block.Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_GREEN).sound(SoundType.CANDLE).noCollission().strength(0.1f, 0)
                    .lightLevel(LargeCandleBlock.LIGHT_EMISSION)), true);
    public static final DeferredBlock<LargeCandleBlock> LARGE_CANDLE_PEACH = register("large_candle_peach",
            () -> new LargeCandleBlock(Block.Properties.of()
                    .mapColor(MapColor.COLOR_BROWN).sound(SoundType.CANDLE).noCollission().strength(0.1f, 0)
                    .lightLevel(LargeCandleBlock.LIGHT_EMISSION)), true);
    public static final DeferredBlock<LargeCandleBlock> LARGE_CANDLE_CHERENKOV = register("large_candle_cherenkov",
            () -> new LargeCandleBlock(Block.Properties.of()
                    .mapColor(MapColor.COLOR_CYAN).sound(SoundType.CANDLE).noCollission().strength(0.1f, 0)
                    .lightLevel(LargeCandleBlock.LIGHT_EMISSION)), true);
    public static final DeferredBlock<LargeCandleBlock> LARGE_CANDLE_AQUAMARINE = register("large_candle_aquamarine",
            () -> new LargeCandleBlock(Block.Properties.of()
                    .mapColor(MapColor.COLOR_CYAN).sound(SoundType.CANDLE).noCollission().strength(0.1f, 0)
                    .lightLevel(LargeCandleBlock.LIGHT_EMISSION)), true);
    public static final DeferredBlock<LargeCandleBlock> LARGE_CANDLE_PERSIMMON = register("large_candle_persimmon",
            () -> new LargeCandleBlock(Block.Properties.of()
                    .mapColor(MapColor.COLOR_BROWN).sound(SoundType.CANDLE).noCollission().strength(0.1f, 0)
                    .lightLevel(LargeCandleBlock.LIGHT_EMISSION)), true);

    public static <I extends Block> DeferredBlock<I> register(final String name, final Supplier<? extends I> sup, boolean bol) {
        DeferredBlock<I> object = BLOCKS.register(name, sup);
        BLOCK_DATA_GEN_SETTINGS.put(object.getId(), new BlockDataGenSettings(bol, bol ? LootTableType.DROP_SELF : LootTableType.EMPTY));

        if (bol) {
            OccultismDyenamicsItems.ITEMS.register(name, () -> new BlockItem(object.get(), new Item.Properties()));
        }

        return object;
    }

    public enum LootTableType {
        EMPTY,
        DROP_SELF
    }

    public static class BlockDataGenSettings {
        public boolean generateDefaultBlockItem;
        public LootTableType lootTableType;

        public BlockDataGenSettings(boolean generateDefaultBlockItem, LootTableType lootTableType) {
            this.generateDefaultBlockItem = generateDefaultBlockItem;
            this.lootTableType = lootTableType;
        }
    }
}
