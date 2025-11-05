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

package com.eqisedu.occultism_dyenamics.handlers;

import com.eqisedu.occultism_dyenamics.OccultismDyenamics;
import com.eqisedu.occultism_dyenamics.registry.OccultismDyenamicsBlocks;
import com.eqisedu.occultism_dyenamics.registry.OccultismDyenamicsItems;
import net.minecraft.world.item.component.DyedItemColor;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;

@EventBusSubscriber(modid = OccultismDyenamics.MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ColorEventHandler {

    //region Static Methods
    @SubscribeEvent
    public static void onRegisterBlockColorHandlers(RegisterColorHandlersEvent.Block event) {
        event.getBlockColors()
                .register((state, light, pos, tintIndex) -> OccultismDyenamicsBlocks.CHALK_GLYPH_HONEY.get().getColor(),
                        OccultismDyenamicsBlocks.CHALK_GLYPH_HONEY.get(), OccultismDyenamicsBlocks.LARGE_CANDLE_HONEY.get());
        event.getBlockColors()
                .register((state, light, pos, tintIndex) -> OccultismDyenamicsBlocks.CHALK_GLYPH_ICY_BLUE.get().getColor(),
                        OccultismDyenamicsBlocks.CHALK_GLYPH_ICY_BLUE.get(), OccultismDyenamicsBlocks.LARGE_CANDLE_ICY_BLUE.get());
        event.getBlockColors()
                .register((state, light, pos, tintIndex) -> OccultismDyenamicsBlocks.CHALK_GLYPH_SPRING_GREEN.get().getColor(),
                        OccultismDyenamicsBlocks.CHALK_GLYPH_SPRING_GREEN.get(), OccultismDyenamicsBlocks.LARGE_CANDLE_SPRING_GREEN.get());
        event.getBlockColors()
                .register((state, light, pos, tintIndex) -> OccultismDyenamicsBlocks.CHALK_GLYPH_AMBER.get().getColor(),
                        OccultismDyenamicsBlocks.CHALK_GLYPH_AMBER.get(), OccultismDyenamicsBlocks.LARGE_CANDLE_AMBER.get());
        event.getBlockColors()
                .register((state, light, pos, tintIndex) -> OccultismDyenamicsBlocks.CHALK_GLYPH_MINT.get().getColor(),
                        OccultismDyenamicsBlocks.CHALK_GLYPH_MINT.get(), OccultismDyenamicsBlocks.LARGE_CANDLE_MINT.get());
        event.getBlockColors()
                .register((state, light, pos, tintIndex) -> OccultismDyenamicsBlocks.CHALK_GLYPH_LAVENDER.get().getColor(),
                        OccultismDyenamicsBlocks.CHALK_GLYPH_LAVENDER.get(), OccultismDyenamicsBlocks.LARGE_CANDLE_LAVENDER.get());
        event.getBlockColors()
                .register((state, light, pos, tintIndex) -> OccultismDyenamicsBlocks.CHALK_GLYPH_NAVY.get().getColor(),
                        OccultismDyenamicsBlocks.CHALK_GLYPH_NAVY.get(), OccultismDyenamicsBlocks.LARGE_CANDLE_NAVY.get());
        event.getBlockColors()
                .register((state, light, pos, tintIndex) -> OccultismDyenamicsBlocks.CHALK_GLYPH_BUBBLEGUM.get().getColor(),
                        OccultismDyenamicsBlocks.CHALK_GLYPH_BUBBLEGUM.get(), OccultismDyenamicsBlocks.LARGE_CANDLE_BUBBLEGUM.get());
        event.getBlockColors()
                .register((state, light, pos, tintIndex) -> OccultismDyenamicsBlocks.CHALK_GLYPH_CONIFER.get().getColor(),
                        OccultismDyenamicsBlocks.CHALK_GLYPH_CONIFER.get(), OccultismDyenamicsBlocks.LARGE_CANDLE_CONIFER.get());
        event.getBlockColors()
                .register((state, light, pos, tintIndex) -> OccultismDyenamicsBlocks.CHALK_GLYPH_ULTRAMARINE.get().getColor(),
                        OccultismDyenamicsBlocks.CHALK_GLYPH_ULTRAMARINE.get(), OccultismDyenamicsBlocks.LARGE_CANDLE_ULTRAMARINE.get());
        event.getBlockColors()
                .register((state, light, pos, tintIndex) -> OccultismDyenamicsBlocks.CHALK_GLYPH_MAROON.get().getColor(),
                        OccultismDyenamicsBlocks.CHALK_GLYPH_MAROON.get(), OccultismDyenamicsBlocks.LARGE_CANDLE_MAROON.get());
        event.getBlockColors()
                .register((state, light, pos, tintIndex) -> OccultismDyenamicsBlocks.CHALK_GLYPH_WINE.get().getColor(),
                        OccultismDyenamicsBlocks.CHALK_GLYPH_WINE.get(), OccultismDyenamicsBlocks.LARGE_CANDLE_WINE.get());
        event.getBlockColors()
                .register((state, light, pos, tintIndex) -> OccultismDyenamicsBlocks.CHALK_GLYPH_ROSE.get().getColor(),
                        OccultismDyenamicsBlocks.CHALK_GLYPH_ROSE.get(), OccultismDyenamicsBlocks.LARGE_CANDLE_ROSE.get());
        event.getBlockColors()
                .register((state, light, pos, tintIndex) -> OccultismDyenamicsBlocks.CHALK_GLYPH_FLUORESCENT.get().getColor(),
                        OccultismDyenamicsBlocks.CHALK_GLYPH_FLUORESCENT.get(), OccultismDyenamicsBlocks.LARGE_CANDLE_FLUORESCENT.get());
        event.getBlockColors()
                .register((state, light, pos, tintIndex) -> OccultismDyenamicsBlocks.CHALK_GLYPH_PEACH.get().getColor(),
                        OccultismDyenamicsBlocks.CHALK_GLYPH_PEACH.get(), OccultismDyenamicsBlocks.LARGE_CANDLE_PEACH.get());
        event.getBlockColors()
                .register((state, light, pos, tintIndex) -> OccultismDyenamicsBlocks.CHALK_GLYPH_CHERENKOV.get().getColor(),
                        OccultismDyenamicsBlocks.CHALK_GLYPH_CHERENKOV.get(), OccultismDyenamicsBlocks.LARGE_CANDLE_CHERENKOV.get());
        event.getBlockColors()
                .register((state, light, pos, tintIndex) -> OccultismDyenamicsBlocks.CHALK_GLYPH_AQUAMARINE.get().getColor(),
                        OccultismDyenamicsBlocks.CHALK_GLYPH_AQUAMARINE.get(), OccultismDyenamicsBlocks.LARGE_CANDLE_AQUAMARINE.get());
        event.getBlockColors()
                .register((state, light, pos, tintIndex) -> OccultismDyenamicsBlocks.CHALK_GLYPH_PERSIMMON.get().getColor(),
                        OccultismDyenamicsBlocks.CHALK_GLYPH_PERSIMMON.get(), OccultismDyenamicsBlocks.LARGE_CANDLE_PERSIMMON.get());

        event.getBlockColors()
                .register((state, light, pos, tintIndex) -> OccultismDyenamicsBlocks.CHALK_GLYPH_PRISMATIC.get().getColor(state),
                        OccultismDyenamicsBlocks.CHALK_GLYPH_PRISMATIC.get());
        event.getBlockColors()
                .register((state, light, pos, tintIndex) -> OccultismDyenamicsBlocks.CHALK_GLYPH_MULTICOLORED.get().getColor(state),
                        OccultismDyenamicsBlocks.CHALK_GLYPH_MULTICOLORED.get());

        OccultismDyenamics.LOGGER.info("Block color registration complete.");
    }

    @SubscribeEvent
    public static void onRegisterItemColorHandlers(RegisterColorHandlersEvent.Item event) {
        event.getItemColors()
                .register((stack, tintIndex) ->
                                0xFF000000 + OccultismDyenamics.CLIENT_CONFIG.visuals.navyChalkGlyphColor.get(),
                        OccultismDyenamicsItems.CHALK_NAVY.get(), OccultismDyenamicsItems.CHALK_NAVY_IMPURE.get(), OccultismDyenamicsBlocks.LARGE_CANDLE_NAVY.asItem());
        event.getItemColors()
                .register((stack, tintIndex) ->
                                0xFF000000 + OccultismDyenamics.CLIENT_CONFIG.visuals.fluorescentChalkGlyphColor.get(),
                        OccultismDyenamicsItems.CHALK_FLUORESCENT.get(), OccultismDyenamicsItems.CHALK_FLUORESCENT_IMPURE.get(), OccultismDyenamicsBlocks.LARGE_CANDLE_FLUORESCENT.asItem());
        event.getItemColors()
                .register((stack, tintIndex) ->
                                0xFF000000 + OccultismDyenamics.CLIENT_CONFIG.visuals.bubblegumChalkGlyphColor.get(),
                        OccultismDyenamicsItems.CHALK_BUBBLEGUM.get(), OccultismDyenamicsItems.CHALK_BUBBLEGUM_IMPURE.get(), OccultismDyenamicsBlocks.LARGE_CANDLE_BUBBLEGUM.asItem());
        event.getItemColors()
                .register((stack, tintIndex) ->
                                0xFF000000 + OccultismDyenamics.CLIENT_CONFIG.visuals.wineChalkGlyphColor.get(),
                        OccultismDyenamicsItems.CHALK_WINE.get(), OccultismDyenamicsItems.CHALK_WINE_IMPURE.get(), OccultismDyenamicsBlocks.LARGE_CANDLE_WINE.asItem());
        event.getItemColors()
                .register((stack, tintIndex) ->
                                0xFF000000 + OccultismDyenamics.CLIENT_CONFIG.visuals.icyBlueChalkGlyphColor.get(),
                        OccultismDyenamicsItems.CHALK_ICY_BLUE.get(), OccultismDyenamicsItems.CHALK_ICY_BLUE_IMPURE.get(), OccultismDyenamicsBlocks.LARGE_CANDLE_ICY_BLUE.asItem());
        event.getItemColors()
                .register((stack, tintIndex) ->
                                0xFF000000 + OccultismDyenamics.CLIENT_CONFIG.visuals.lavenderChalkGlyphColor.get(),
                        OccultismDyenamicsItems.CHALK_LAVENDER.get(), OccultismDyenamicsItems.CHALK_LAVENDER_IMPURE.get(), OccultismDyenamicsBlocks.LARGE_CANDLE_LAVENDER.asItem());
        event.getItemColors()
                .register((stack, tintIndex) ->
                                0xFF000000 + OccultismDyenamics.CLIENT_CONFIG.visuals.maroonChalkGlyphColor.get(),
                        OccultismDyenamicsItems.CHALK_MAROON.get(), OccultismDyenamicsItems.CHALK_MAROON_IMPURE.get(), OccultismDyenamicsBlocks.LARGE_CANDLE_MAROON.asItem());
        event.getItemColors()
                .register((stack, tintIndex) ->
                                0xFF000000 + OccultismDyenamics.CLIENT_CONFIG.visuals.roseChalkGlyphColor.get(),
                        OccultismDyenamicsItems.CHALK_ROSE.get(), OccultismDyenamicsItems.CHALK_ROSE_IMPURE.get(), OccultismDyenamicsBlocks.LARGE_CANDLE_ROSE.asItem());
        event.getItemColors()
                .register((stack, tintIndex) ->
                                0xFF000000 + OccultismDyenamics.CLIENT_CONFIG.visuals.mintChalkGlyphColor.get(),
                        OccultismDyenamicsItems.CHALK_MINT.get(), OccultismDyenamicsItems.CHALK_MINT_IMPURE.get(), OccultismDyenamicsBlocks.LARGE_CANDLE_MINT.asItem());
        event.getItemColors()
                .register((stack, tintIndex) ->
                                0xFF000000 + OccultismDyenamics.CLIENT_CONFIG.visuals.ultramarineChalkGlyphColor.get(),
                        OccultismDyenamicsItems.CHALK_ULTRAMARINE.get(), OccultismDyenamicsItems.CHALK_ULTRAMARINE_IMPURE.get(), OccultismDyenamicsBlocks.LARGE_CANDLE_ULTRAMARINE.asItem());
        event.getItemColors()
                .register((stack, tintIndex) ->
                                0xFF000000 + OccultismDyenamics.CLIENT_CONFIG.visuals.peachChalkGlyphColor.get(),
                        OccultismDyenamicsItems.CHALK_PEACH.get(), OccultismDyenamicsItems.CHALK_PEACH_IMPURE.get(), OccultismDyenamicsBlocks.LARGE_CANDLE_PEACH.asItem());
        event.getItemColors()
                .register((stack, tintIndex) ->
                                0xFF000000 + OccultismDyenamics.CLIENT_CONFIG.visuals.coniferChalkGlyphColor.get(),
                        OccultismDyenamicsItems.CHALK_CONIFER.get(), OccultismDyenamicsItems.CHALK_CONIFER_IMPURE.get(), OccultismDyenamicsBlocks.LARGE_CANDLE_CONIFER.asItem());
        event.getItemColors()
                .register((stack, tintIndex) ->
                                0xFF000000 + OccultismDyenamics.CLIENT_CONFIG.visuals.cherenkovChalkGlyphColor.get(),
                        OccultismDyenamicsItems.CHALK_CHERENKOV.get(), OccultismDyenamicsItems.CHALK_CHERENKOV_IMPURE.get(), OccultismDyenamicsBlocks.LARGE_CANDLE_CHERENKOV.asItem());
        event.getItemColors()
                .register((stack, tintIndex) ->
                                0xFF000000 + OccultismDyenamics.CLIENT_CONFIG.visuals.aquamarineChalkGlyphColor.get(),
                        OccultismDyenamicsItems.CHALK_AQUAMARINE.get(), OccultismDyenamicsItems.CHALK_AQUAMARINE_IMPURE.get(), OccultismDyenamicsBlocks.LARGE_CANDLE_AQUAMARINE.asItem());
        event.getItemColors()
                .register((stack, tintIndex) ->
                                0xFF000000 + OccultismDyenamics.CLIENT_CONFIG.visuals.persimmonChalkGlyphColor.get(),
                        OccultismDyenamicsItems.CHALK_PERSIMMON.get(), OccultismDyenamicsItems.CHALK_PERSIMMON_IMPURE.get(), OccultismDyenamicsBlocks.LARGE_CANDLE_PERSIMMON.asItem());
        event.getItemColors()
                .register((stack, tintIndex) ->
                                0xFF000000 + OccultismDyenamics.CLIENT_CONFIG.visuals.springGreenChalkGlyphColor.get(),
                        OccultismDyenamicsItems.CHALK_SPRING_GREEN.get(), OccultismDyenamicsItems.CHALK_SPRING_GREEN_IMPURE.get(), OccultismDyenamicsBlocks.LARGE_CANDLE_SPRING_GREEN.asItem());
        event.getItemColors()
                .register((stack, tintIndex) ->
                                0xFF000000 + OccultismDyenamics.CLIENT_CONFIG.visuals.amberChalkGlyphColor.get(),
                        OccultismDyenamicsItems.CHALK_AMBER.get(), OccultismDyenamicsItems.CHALK_AMBER_IMPURE.get(), OccultismDyenamicsBlocks.LARGE_CANDLE_AMBER.asItem());
        event.getItemColors()
                .register((stack, tintIndex) ->
                                0xFF000000 + OccultismDyenamics.CLIENT_CONFIG.visuals.honeyChalkGlyphColor.get(),
                        OccultismDyenamicsItems.CHALK_HONEY.get(), OccultismDyenamicsItems.CHALK_HONEY_IMPURE.get(), OccultismDyenamicsBlocks.LARGE_CANDLE_HONEY.asItem());
        event.getItemColors()
                .register((stack, tintIndex) ->
                                DyedItemColor.getOrDefault(stack, 0xFFFFFFFF),
                        OccultismDyenamicsItems.CHALK_CHOSEN.get());

        OccultismDyenamics.LOGGER.info("Item color registration complete.");
    }
    //endregion Static Methods
}
