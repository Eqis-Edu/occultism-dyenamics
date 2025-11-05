/*
 * MIT License
 *
 * Copyright 2021 vemerion, klikli-dev
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

package com.eqisedu.occultism_dyenamics.datagen.lang;

import com.eqisedu.occultism_dyenamics.OccultismDyenamics;
import com.eqisedu.occultism_dyenamics.registry.OccultismDyenamicsBlocks;
import com.eqisedu.occultism_dyenamics.registry.OccultismDyenamicsItems;
import com.klikli_dev.modonomicon.api.datagen.AbstractModonomiconLanguageProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.contents.TranslatableContents;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.registries.DeferredItem;

public class ENUSProvider extends AbstractModonomiconLanguageProvider {

    public ENUSProvider(PackOutput gen) {
        super(gen, OccultismDyenamics.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        this.addAdvancements();
        this.addItems();
        this.addBlocks();
        this.addRitualDummies();
        this.addConfigurationTranslations();

        this.add("itemGroup.occultism_dyenamics", "Occultism: Dyenamics Chalks");
        this.add("tag.item.occultism_dyenamics.final_chalk", "Final Chalks");
    }

    private void addItems() {
        this.addItem(OccultismDyenamicsItems.CHALK_ICY_BLUE, "Icy Blue Chalk");
        this.addAutoTooltip(OccultismDyenamicsItems.CHALK_ICY_BLUE, "Can replace: Light Blue");
        this.addItem(OccultismDyenamicsItems.CHALK_SPRING_GREEN, "Spring Green Chalk");
        this.addAutoTooltip(OccultismDyenamicsItems.CHALK_SPRING_GREEN, "Can replace: Lime");
        this.addItem(OccultismDyenamicsItems.CHALK_AMBER, "Amber Chalk");
        this.addAutoTooltip(OccultismDyenamicsItems.CHALK_AMBER, "Can replace: Orange");
        this.addItem(OccultismDyenamicsItems.CHALK_HONEY, "Honey Chalk");
        this.addAutoTooltip(OccultismDyenamicsItems.CHALK_HONEY, "Can replace: Yellow and Orange");
        this.addItem(OccultismDyenamicsItems.CHALK_MINT, "Mint Chalk");
        this.addAutoTooltip(OccultismDyenamicsItems.CHALK_MINT, "Can replace: Lime and Green");
        this.addItem(OccultismDyenamicsItems.CHALK_LAVENDER, "Lavender Chalk");
        this.addAutoTooltip(OccultismDyenamicsItems.CHALK_LAVENDER, "Can replace: Magenta");
        this.addItem(OccultismDyenamicsItems.CHALK_NAVY, "Navy Chalk");
        this.addAutoTooltip(OccultismDyenamicsItems.CHALK_NAVY, "Can replace: Blue");
        this.addItem(OccultismDyenamicsItems.CHALK_BUBBLEGUM, "Bubblegum Chalk");
        this.addAutoTooltip(OccultismDyenamicsItems.CHALK_BUBBLEGUM, "Can replace: Pink");
        this.addItem(OccultismDyenamicsItems.CHALK_CONIFER, "Conifer Chalk");
        this.addAutoTooltip(OccultismDyenamicsItems.CHALK_CONIFER, "Can replace: Green");
        this.addItem(OccultismDyenamicsItems.CHALK_ULTRAMARINE, "Ultramarine Chalk");
        this.addAutoTooltip(OccultismDyenamicsItems.CHALK_ULTRAMARINE, "Can replace: Purple and Blue");
        this.addItem(OccultismDyenamicsItems.CHALK_MAROON, "Maroon Chalk");
        this.addAutoTooltip(OccultismDyenamicsItems.CHALK_MAROON, "Can replace: Red");
        this.addItem(OccultismDyenamicsItems.CHALK_WINE, "Wine Chalk");
        this.addAutoTooltip(OccultismDyenamicsItems.CHALK_WINE, "Can replace: Purple");
        this.addItem(OccultismDyenamicsItems.CHALK_ROSE, "Rose Chalk");
        this.addAutoTooltip(OccultismDyenamicsItems.CHALK_ROSE, "Can replace: Pink and Magenta");
        this.addItem(OccultismDyenamicsItems.CHALK_FLUORESCENT, "Fluorescent Chalk");
        this.addAutoTooltip(OccultismDyenamicsItems.CHALK_FLUORESCENT, "Can replace: Yellow");
        this.addItem(OccultismDyenamicsItems.CHALK_PEACH, "Peach Chalk");
        this.addAutoTooltip(OccultismDyenamicsItems.CHALK_PEACH, "Can replace: Brown");
        this.addItem(OccultismDyenamicsItems.CHALK_CHERENKOV, "Cherenkov Chalk");
        this.addAutoTooltip(OccultismDyenamicsItems.CHALK_CHERENKOV, "Can replace: Light Blue and Cyan");
        this.addItem(OccultismDyenamicsItems.CHALK_AQUAMARINE, "Aquamarine Chalk");
        this.addAutoTooltip(OccultismDyenamicsItems.CHALK_AQUAMARINE, "Can replace: Cyan");
        this.addItem(OccultismDyenamicsItems.CHALK_PERSIMMON, "Persimmon Chalk");
        this.addAutoTooltip(OccultismDyenamicsItems.CHALK_PERSIMMON, "Can replace: Red and Brown");
        this.addItem(OccultismDyenamicsItems.CHALK_PRISMATIC, "Prismatic Chalk");
        this.addAutoTooltip(OccultismDyenamicsItems.CHALK_PRISMATIC, "Shift + Right Click in a glyph to erase");
        this.addItem(OccultismDyenamicsItems.CHALK_MULTICOLORED, "Multicolored Chalk");
        this.addAutoTooltip(OccultismDyenamicsItems.CHALK_MULTICOLORED, "Shift + Right Click in a glyph to erase");
        this.addItem(OccultismDyenamicsItems.CHALK_CHOSEN, "The Chosen Chalk");
        this.addAutoTooltip(OccultismDyenamicsItems.CHALK_CHOSEN, "Shift + Right Click in a glyph to erase");
        this.addItem(OccultismDyenamicsItems.CHALK_ICY_BLUE_IMPURE, "Impure Icy Blue Chalk");
        this.addItem(OccultismDyenamicsItems.CHALK_SPRING_GREEN_IMPURE, "Impure Spring Green Chalk");
        this.addItem(OccultismDyenamicsItems.CHALK_AMBER_IMPURE, "Impure Amber Chalk");
        this.addItem(OccultismDyenamicsItems.CHALK_HONEY_IMPURE, "Impure Honey Chalk");
        this.addItem(OccultismDyenamicsItems.CHALK_MINT_IMPURE, "Impure Mint Chalk");
        this.addItem(OccultismDyenamicsItems.CHALK_LAVENDER_IMPURE, "Impure Lavender Chalk");
        this.addItem(OccultismDyenamicsItems.CHALK_NAVY_IMPURE, "Impure Navy Chalk");
        this.addItem(OccultismDyenamicsItems.CHALK_BUBBLEGUM_IMPURE, "Impure Bubblegum Chalk");
        this.addItem(OccultismDyenamicsItems.CHALK_CONIFER_IMPURE, "Impure Conifer Chalk");
        this.addItem(OccultismDyenamicsItems.CHALK_ULTRAMARINE_IMPURE, "Impure Ultramarine Chalk");
        this.addItem(OccultismDyenamicsItems.CHALK_MAROON_IMPURE, "Impure Maroon Chalk");
        this.addItem(OccultismDyenamicsItems.CHALK_WINE_IMPURE, "Impure Wine Chalk");
        this.addItem(OccultismDyenamicsItems.CHALK_ROSE_IMPURE, "Impure Rose Chalk");
        this.addItem(OccultismDyenamicsItems.CHALK_FLUORESCENT_IMPURE, "Impure Fluorescent Chalk");
        this.addItem(OccultismDyenamicsItems.CHALK_PEACH_IMPURE, "Impure Peach Chalk");
        this.addItem(OccultismDyenamicsItems.CHALK_CHERENKOV_IMPURE, "Impure Cherenkov Chalk");
        this.addItem(OccultismDyenamicsItems.CHALK_AQUAMARINE_IMPURE, "Impure Aquamarine Chalk");
        this.addItem(OccultismDyenamicsItems.CHALK_PERSIMMON_IMPURE, "Impure Persimmon Chalk");
    }

    private void addBlocks() {
        this.addBlock(OccultismDyenamicsBlocks.CHALK_GLYPH_HONEY, "Honey Chalk Glyph");
        this.addBlock(OccultismDyenamicsBlocks.CHALK_GLYPH_ICY_BLUE, "Icy Blue Chalk Glyph");
        this.addBlock(OccultismDyenamicsBlocks.CHALK_GLYPH_SPRING_GREEN, "Spring Green Chalk Glyph");
        this.addBlock(OccultismDyenamicsBlocks.CHALK_GLYPH_AMBER, "Amber Chalk Glyph");
        this.addBlock(OccultismDyenamicsBlocks.CHALK_GLYPH_MINT, "Mint Chalk Glyph");
        this.addBlock(OccultismDyenamicsBlocks.CHALK_GLYPH_LAVENDER, "Lavender Chalk Glyph");
        this.addBlock(OccultismDyenamicsBlocks.CHALK_GLYPH_NAVY, "Navy Chalk Glyph");
        this.addBlock(OccultismDyenamicsBlocks.CHALK_GLYPH_BUBBLEGUM, "Bubblegum Chalk Glyph");
        this.addBlock(OccultismDyenamicsBlocks.CHALK_GLYPH_CONIFER, "Conifer Chalk Glyph");
        this.addBlock(OccultismDyenamicsBlocks.CHALK_GLYPH_ULTRAMARINE, "Ultramarine Chalk Glyph");
        this.addBlock(OccultismDyenamicsBlocks.CHALK_GLYPH_MAROON, "Maroon Chalk Glyph");
        this.addBlock(OccultismDyenamicsBlocks.CHALK_GLYPH_WINE, "Wine Chalk Glyph");
        this.addBlock(OccultismDyenamicsBlocks.CHALK_GLYPH_ROSE, "Rose Chalk Glyph");
        this.addBlock(OccultismDyenamicsBlocks.CHALK_GLYPH_FLUORESCENT, "Fluorescent Chalk Glyph");
        this.addBlock(OccultismDyenamicsBlocks.CHALK_GLYPH_PEACH, "Peach Chalk Glyph");
        this.addBlock(OccultismDyenamicsBlocks.CHALK_GLYPH_CHERENKOV, "Cherenkov Chalk Glyph");
        this.addBlock(OccultismDyenamicsBlocks.CHALK_GLYPH_AQUAMARINE, "Aquamarine Chalk Glyph");
        this.addBlock(OccultismDyenamicsBlocks.CHALK_GLYPH_PERSIMMON, "Persimmon Chalk Glyph");
        this.addBlock(OccultismDyenamicsBlocks.CHALK_GLYPH_PRISMATIC, "Prismatic Chalk Glyph");
        this.addBlock(OccultismDyenamicsBlocks.CHALK_GLYPH_MULTICOLORED, "Multicolored Chalk Glyph");

        this.addBlock(OccultismDyenamicsBlocks.LARGE_CANDLE_HONEY, "Large Honey Candle");
        this.addBlock(OccultismDyenamicsBlocks.LARGE_CANDLE_MINT, "Large Mint Candle");
        this.addBlock(OccultismDyenamicsBlocks.LARGE_CANDLE_LAVENDER, "Large Lavender Candle");
        this.addBlock(OccultismDyenamicsBlocks.LARGE_CANDLE_NAVY, "Large Navy Candle");
        this.addBlock(OccultismDyenamicsBlocks.LARGE_CANDLE_BUBBLEGUM, "Large Bubblegum Candle");
        this.addBlock(OccultismDyenamicsBlocks.LARGE_CANDLE_AMBER, "Large Amber Candle");
        this.addBlock(OccultismDyenamicsBlocks.LARGE_CANDLE_CONIFER, "Large Conifer Candle");
        this.addBlock(OccultismDyenamicsBlocks.LARGE_CANDLE_ICY_BLUE, "Large Icy Blue Candle");
        this.addBlock(OccultismDyenamicsBlocks.LARGE_CANDLE_ULTRAMARINE, "Large Ultramarine Candle");
        this.addBlock(OccultismDyenamicsBlocks.LARGE_CANDLE_MAROON, "Large Maroon Candle");
        this.addBlock(OccultismDyenamicsBlocks.LARGE_CANDLE_WINE, "Large Wine Candle");
        this.addBlock(OccultismDyenamicsBlocks.LARGE_CANDLE_FLUORESCENT, "Large Fluorescent Candle");
        this.addBlock(OccultismDyenamicsBlocks.LARGE_CANDLE_SPRING_GREEN, "Large Spring Green Candle");
        this.addBlock(OccultismDyenamicsBlocks.LARGE_CANDLE_ROSE, "Large Rose Candle");
        this.addBlock(OccultismDyenamicsBlocks.LARGE_CANDLE_CHERENKOV, "Large Cherenkov Candle");
        this.addBlock(OccultismDyenamicsBlocks.LARGE_CANDLE_AQUAMARINE, "Large Aquamarine Candle");
        this.addBlock(OccultismDyenamicsBlocks.LARGE_CANDLE_PERSIMMON, "Large Persimmon Candle");
        this.addBlock(OccultismDyenamicsBlocks.LARGE_CANDLE_PEACH, "Large Peach Candle");
    }

    public void addRitualMessage(DeferredItem<Item> ritualDummy, String key, String message) {
        var ritualName = ritualDummy.getId().getPath().replace("ritual_dummy/", "");
        this.add("ritual.%s.%s".formatted(ritualDummy.getId().getNamespace(), ritualName) + "." + key, message);
    }

    private void addAdvancements() {
        this.advancementTitle("chalks.root", "Occultism: Dyenamics Chalks");
        this.advancementDescr("chalks.root", "Extra colorful");
        this.advancementTitle("chalks.honey", "Use the Honey Chalk");
        this.advancementDescr("chalks.honey", "Alternative for yellow and orange");
        this.advancementTitle("chalks.mint", "Use the Mint Chalk");
        this.advancementDescr("chalks.mint", "Alternative for lime and green");
        this.advancementTitle("chalks.lavender", "Use the Lavender Chalk");
        this.advancementDescr("chalks.lavender", "Alternative for magenta");
        this.advancementTitle("chalks.navy", "Use the Navy Chalk");
        this.advancementDescr("chalks.navy", "Alternative for blue");
        this.advancementTitle("chalks.bubblegum", "Use the Bubblegum Chalk");
        this.advancementDescr("chalks.bubblegum", "Alternative for pink");
        this.advancementTitle("chalks.amber", "Use the Amber Chalk");
        this.advancementDescr("chalks.amber", "Alternative for orange");
        this.advancementTitle("chalks.conifer", "Use the Conifer Chalk");
        this.advancementDescr("chalks.conifer", "Alternative for green");
        this.advancementTitle("chalks.icy_blue", "Use the Icy Blue Chalk");
        this.advancementDescr("chalks.icy_blue", "Alternative for light blue");
        this.advancementTitle("chalks.ultramarine", "Use the Ultramarine Chalk");
        this.advancementDescr("chalks.ultramarine", "Alternative for purple and blue");
        this.advancementTitle("chalks.maroon", "Use the Maroon Chalk");
        this.advancementDescr("chalks.maroon", "Alternative for red");
        this.advancementTitle("chalks.wine", "Use the Wine Chalk");
        this.advancementDescr("chalks.wine", "Alternative for purple");
        this.advancementTitle("chalks.rose", "Use the Rose Chalk");
        this.advancementDescr("chalks.rose", "Alternative for magenta and pink");
        this.advancementTitle("chalks.fluorescent", "Use the Fluorescent Chalk");
        this.advancementDescr("chalks.fluorescent", "Alternative for yellow");
        this.advancementTitle("chalks.spring_green", "Use the Spring Green Chalk");
        this.advancementDescr("chalks.spring_green", "Alternative for lime");
        this.advancementTitle("chalks.peach", "Use the Peach Chalk");
        this.advancementDescr("chalks.peach", "Alternative for brown");
        this.advancementTitle("chalks.cherenkov", "Use the Cherenkov Chalk");
        this.advancementDescr("chalks.cherenkov", "Alternative for cyan and light blue");
        this.advancementTitle("chalks.aquamarine", "Use the Aquamarine Chalk");
        this.advancementDescr("chalks.aquamarine", "Alternative for cyan");
        this.advancementTitle("chalks.persimmon", "Use the Persimmon Chalk");
        this.advancementDescr("chalks.persimmon", "Alternative for brown and red");
        this.advancementTitle("chalks.prismatic", "Use the Prismatic Chalk");
        this.advancementDescr("chalks.prismatic", "Why a Lot of Chalks?");
        this.advancementTitle("chalks.multicolored", "Use the Multicolored Chalk");
        this.advancementDescr("chalks.multicolored", "Color loving");
        this.advancementTitle("chalks.chosen", "Use The Chosen Chalk");
        this.advancementDescr("chalks.chosen", "Reality can be whatever i want");
    }

    private void addRitualDummies() {
        this.autoDummyFactory(OccultismDyenamicsItems.RITUAL_DUMMY_FORGE_CHALK_PRISMATIC, "Forge Prismatic Chalk", "Eldritch", "Eldritch Spirits will forge a prismatic chalk, substitute any chalk.");
        this.autoDummyFactory(OccultismDyenamicsItems.RITUAL_DUMMY_FORGE_CHALK_MULTICOLORED, "Forge Multicolored Chalk", "Eldritch", "Eldritch Spirits will forge a multicolored chalk, substitute any chalk.");
        this.autoDummyFactory(OccultismDyenamicsItems.RITUAL_DUMMY_FORGE_CHALK_CHOSEN, "Forge The Chosen Chalk", "Eldritch", "Eldritch Spirits will forge a chosen chalk, substitute any chalk with any rgb color.");
    }

    public void autoDummyFactory(DeferredItem<Item> dummy, String name, String tier, String description) {
        this.add(dummy.get(), "Ritual: " + name);
        //this.addTooltip(dummy.get(), description);
        this.add(dummy.get().getDescriptionId() + ".tooltip", description);
        this.addAutoTooltip(dummy.get(), "Tier: " + tier);
        this.addRitualMessage(dummy, "conditions", "Not all requirements for this ritual are met.");
        this.addRitualMessage(dummy, "started", "Starting the ritual: " + name +".");
        this.addRitualMessage(dummy, "finished", "Ritual completed successfully: " + name +".");
        this.addRitualMessage(dummy, "interrupted", "Interruption in the ritual: " + name +".");
    }

    private void addConfigurationTranslations() {
        this.addConfig("visual", "Visual Settings");
        this.addConfig("honeyChalkGlyphColor", "Honey Chalk Glyph Color");
        this.addConfig("mintChalkGlyphColor", "Mint Chalk Glyph Color");
        this.addConfig("icyBlueChalkGlyphColor", "Icy Blue Chalk Glyph Color");
        this.addConfig("amberChalkGlyphColor", "Amber Chalk Glyph Color");
        this.addConfig("lavenderChalkGlyphColor", "Lavender Chalk Glyph Color");
        this.addConfig("navyChalkGlyphColor", "Navy Chalk Glyph Color");
        this.addConfig("bubblegumChalkGlyphColor", "Bubblegum Chalk Glyph Color");
        this.addConfig("coniferChalkGlyphColor", "Conifer Chalk Glyph Color");
        this.addConfig("ultramarineChalkGlyphColor", "Ultramarine Chalk Glyph Color");
        this.addConfig("maroonChalkGlyphColor", "Maroon Chalk Glyph Color");
        this.addConfig("wineChalkGlyphColor", "Wine Chalk Glyph Color");
        this.addConfig("roseChalkGlyphColor", "Rose Chalk Glyph Color");
        this.addConfig("fluorescentChalkGlyphColor", "Fluorescent Chalk Glyph Color");
        this.addConfig("springGreenChalkGlyphColor", "Spring Green Chalk Glyph Color");
        this.addConfig("peachChalkGlyphColor", "Peach Chalk Glyph Color");
        this.addConfig("cherenkovChalkGlyphColor", "Cherenkov Chalk Glyph Color");
        this.addConfig("aquamarineChalkGlyphColor", "Aquamarine Chalk Glyph Color");
        this.addConfig("persimmonChalkGlyphColor", "Persimmon Chalk Glyph Color");
    }

    public void addAutoTooltip(ItemLike key, String value) {
        this.add(key.asItem().getDescriptionId() + ".auto_tooltip", value);
    }

    private static MutableComponent text(String name, String type) {
        return Component.translatable("advancements." + OccultismDyenamics.MODID + "." + name + "." + type);
    }
    private void advancementTitle(String name, String s) {
        this.add(((TranslatableContents) text(name, "title").getContents()).getKey(), s);
    }
    private void advancementDescr(String name, String s) {
        this.add(((TranslatableContents) text(name, "description").getContents()).getKey(), s);
    }

    private void addConfig(String key, String name) {
        this.add(OccultismDyenamics.MODID + ".configuration." + key, name);
    }
}
