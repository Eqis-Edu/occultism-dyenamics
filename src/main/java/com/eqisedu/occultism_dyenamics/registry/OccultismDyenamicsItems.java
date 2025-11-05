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
import com.eqisedu.occultism_dyenamics.common.item.tool.ChosenChalkItem;
import com.eqisedu.occultism_dyenamics.common.item.tool.PrismaticChalkItem;
import com.klikli_dev.occultism.common.item.DummyTooltipItem;
import com.klikli_dev.occultism.common.item.tool.ChalkItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class OccultismDyenamicsItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(OccultismDyenamics.MODID);
    //Chalks and Impure Chalks
    public static final DeferredItem<Item> CHALK_HONEY = ITEMS.register("chalk_honey",
            () -> new ChalkItem(defaultProperties().setNoRepair().durability(256),
                    OccultismDyenamicsBlocks.CHALK_GLYPH_HONEY.get()));
    public static final DeferredItem<Item> CHALK_MINT = ITEMS.register("chalk_mint",
            () -> new ChalkItem(defaultProperties().setNoRepair().durability(256),
                    OccultismDyenamicsBlocks.CHALK_GLYPH_MINT.get()));
    public static final DeferredItem<Item> CHALK_LAVENDER = ITEMS.register("chalk_lavender",
            () -> new ChalkItem(defaultProperties().setNoRepair().durability(256).rarity(Rarity.RARE),
                    OccultismDyenamicsBlocks.CHALK_GLYPH_LAVENDER.get()));
    public static final DeferredItem<Item> CHALK_NAVY = ITEMS.register("chalk_navy",
            () -> new ChalkItem(defaultProperties().setNoRepair().durability(256).rarity(Rarity.RARE),
                    OccultismDyenamicsBlocks.CHALK_GLYPH_NAVY.get()));
    public static final DeferredItem<Item> CHALK_BUBBLEGUM = ITEMS.register("chalk_bubblegum",
            () -> new ChalkItem(defaultProperties().setNoRepair().durability(256).rarity(Rarity.UNCOMMON),
                    OccultismDyenamicsBlocks.CHALK_GLYPH_BUBBLEGUM.get()));
    public static final DeferredItem<Item> CHALK_AMBER = ITEMS.register("chalk_amber",
            () -> new ChalkItem(defaultProperties().setNoRepair().durability(256),
                    OccultismDyenamicsBlocks.CHALK_GLYPH_AMBER.get()));
    public static final DeferredItem<Item> CHALK_CONIFER = ITEMS.register("chalk_conifer",
            () -> new ChalkItem(defaultProperties().setNoRepair().durability(256),
                    OccultismDyenamicsBlocks.CHALK_GLYPH_CONIFER.get()));
    public static final DeferredItem<Item> CHALK_ICY_BLUE = ITEMS.register("chalk_icy_blue",
            () -> new ChalkItem(defaultProperties().setNoRepair().durability(256),
                    OccultismDyenamicsBlocks.CHALK_GLYPH_ICY_BLUE.get()));
    public static final DeferredItem<Item> CHALK_ULTRAMARINE = ITEMS.register("chalk_ultramarine",
            () -> new ChalkItem(defaultProperties().setNoRepair().durability(256).rarity(Rarity.RARE),
                    OccultismDyenamicsBlocks.CHALK_GLYPH_ULTRAMARINE.get()));
    public static final DeferredItem<Item> CHALK_MAROON = ITEMS.register("chalk_maroon",
            () -> new ChalkItem(defaultProperties().setNoRepair().durability(256).rarity(Rarity.UNCOMMON),
                    OccultismDyenamicsBlocks.CHALK_GLYPH_MAROON.get()));
    public static final DeferredItem<Item> CHALK_WINE = ITEMS.register("chalk_wine",
            () -> new ChalkItem(defaultProperties().setNoRepair().durability(256),
                    OccultismDyenamicsBlocks.CHALK_GLYPH_WINE.get()));
    public static final DeferredItem<Item> CHALK_ROSE = ITEMS.register("chalk_rose",
            () -> new ChalkItem(defaultProperties().setNoRepair().durability(256).rarity(Rarity.RARE),
                    OccultismDyenamicsBlocks.CHALK_GLYPH_ROSE.get()));
    public static final DeferredItem<Item> CHALK_FLUORESCENT = ITEMS.register("chalk_fluorescent",
            () -> new ChalkItem(defaultProperties().setNoRepair().durability(256),
                    OccultismDyenamicsBlocks.CHALK_GLYPH_FLUORESCENT.get()));
    public static final DeferredItem<Item> CHALK_SPRING_GREEN = ITEMS.register("chalk_spring_green",
            () -> new ChalkItem(defaultProperties().setNoRepair().durability(256),
                    OccultismDyenamicsBlocks.CHALK_GLYPH_SPRING_GREEN.get()));
    public static final DeferredItem<Item> CHALK_PEACH = ITEMS.register("chalk_peach",
            () -> new ChalkItem(defaultProperties().setNoRepair().durability(256).rarity(Rarity.RARE),
                    OccultismDyenamicsBlocks.CHALK_GLYPH_PEACH.get()));
    public static final DeferredItem<Item> CHALK_CHERENKOV = ITEMS.register("chalk_cherenkov",
            () -> new ChalkItem(defaultProperties().setNoRepair().durability(256).rarity(Rarity.RARE),
                    OccultismDyenamicsBlocks.CHALK_GLYPH_CHERENKOV.get()));
    public static final DeferredItem<Item> CHALK_AQUAMARINE = ITEMS.register("chalk_aquamarine",
            () -> new ChalkItem(defaultProperties().setNoRepair().durability(256).rarity(Rarity.RARE),
                    OccultismDyenamicsBlocks.CHALK_GLYPH_AQUAMARINE.get()));
    public static final DeferredItem<Item> CHALK_PERSIMMON = ITEMS.register("chalk_persimmon",
            () -> new ChalkItem(defaultProperties().setNoRepair().durability(256).rarity(Rarity.RARE),
                    OccultismDyenamicsBlocks.CHALK_GLYPH_PERSIMMON.get()));

    public static final DeferredItem<Item> CHALK_PRISMATIC = ITEMS.register("chalk_prismatic",
            () -> new PrismaticChalkItem(defaultProperties().stacksTo(1).rarity(Rarity.EPIC),
                    OccultismDyenamicsBlocks.CHALK_GLYPH_PRISMATIC.get()));
    public static final DeferredItem<Item> CHALK_MULTICOLORED = ITEMS.register("chalk_multicolored",
            () -> new PrismaticChalkItem(defaultProperties().stacksTo(1).rarity(Rarity.EPIC),
                    OccultismDyenamicsBlocks.CHALK_GLYPH_MULTICOLORED.get()));

    public static final DeferredItem<Item> CHALK_CHOSEN = ITEMS.register("chalk_chosen",
            () -> new ChosenChalkItem(defaultProperties().stacksTo(1).rarity(Rarity.EPIC),
                    OccultismDyenamicsBlocks.CHALK_GLYPH_CHOSEN.get()));

    public static final DeferredItem<Item> CHALK_HONEY_IMPURE = ITEMS.register("chalk_honey_impure",
            () -> new Item(defaultProperties()));
    public static final DeferredItem<Item> CHALK_MINT_IMPURE = ITEMS.register("chalk_mint_impure",
            () -> new Item(defaultProperties()));
    public static final DeferredItem<Item> CHALK_LAVENDER_IMPURE = ITEMS.register("chalk_lavender_impure",
            () -> new Item(defaultProperties().rarity(Rarity.RARE)));
    public static final DeferredItem<Item> CHALK_NAVY_IMPURE = ITEMS.register("chalk_navy_impure",
            () -> new Item(defaultProperties().rarity(Rarity.RARE)));
    public static final DeferredItem<Item> CHALK_BUBBLEGUM_IMPURE = ITEMS.register("chalk_bubblegum_impure",
            () -> new Item(defaultProperties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> CHALK_AMBER_IMPURE = ITEMS.register("chalk_amber_impure",
            () -> new Item(defaultProperties()));
    public static final DeferredItem<Item> CHALK_CONIFER_IMPURE = ITEMS.register("chalk_conifer_impure",
            () -> new Item(defaultProperties()));
    public static final DeferredItem<Item> CHALK_ICY_BLUE_IMPURE = ITEMS.register("chalk_icy_blue_impure",
            () -> new Item(defaultProperties()));
    public static final DeferredItem<Item> CHALK_ULTRAMARINE_IMPURE = ITEMS.register("chalk_ultramarine_impure",
            () -> new Item(defaultProperties().rarity(Rarity.RARE)));
    public static final DeferredItem<Item> CHALK_MAROON_IMPURE = ITEMS.register("chalk_maroon_impure",
            () -> new Item(defaultProperties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> CHALK_WINE_IMPURE = ITEMS.register("chalk_wine_impure",
            () -> new Item(defaultProperties()));
    public static final DeferredItem<Item> CHALK_ROSE_IMPURE = ITEMS.register("chalk_rose_impure",
            () -> new Item(defaultProperties().rarity(Rarity.RARE)));
    public static final DeferredItem<Item> CHALK_FLUORESCENT_IMPURE = ITEMS.register("chalk_fluorescent_impure",
            () -> new Item(defaultProperties()));
    public static final DeferredItem<Item> CHALK_SPRING_GREEN_IMPURE = ITEMS.register("chalk_spring_green_impure",
            () -> new Item(defaultProperties()));
    public static final DeferredItem<Item> CHALK_PEACH_IMPURE = ITEMS.register("chalk_peach_impure",
            () -> new Item(defaultProperties().rarity(Rarity.RARE)));
    public static final DeferredItem<Item> CHALK_CHERENKOV_IMPURE = ITEMS.register("chalk_cherenkov_impure",
            () -> new Item(defaultProperties().rarity(Rarity.RARE)));
    public static final DeferredItem<Item> CHALK_AQUAMARINE_IMPURE = ITEMS.register("chalk_aquamarine_impure",
            () -> new Item(defaultProperties().rarity(Rarity.RARE)));
    public static final DeferredItem<Item> CHALK_PERSIMMON_IMPURE = ITEMS.register("chalk_persimmon_impure",
            () -> new Item(defaultProperties().rarity(Rarity.RARE)));

    public static final DeferredItem<Item> RITUAL_DUMMY_FORGE_CHALK_PRISMATIC = ITEMS.register("ritual_dummy/misc_chalk_prismatic", () -> new DummyTooltipItem(defaultProperties()));
    public static final DeferredItem<Item> RITUAL_DUMMY_FORGE_CHALK_MULTICOLORED = ITEMS.register("ritual_dummy/misc_chalk_multicolored", () -> new DummyTooltipItem(defaultProperties()));
    public static final DeferredItem<Item> RITUAL_DUMMY_FORGE_CHALK_CHOSEN = ITEMS.register("ritual_dummy/misc_chalk_chosen", () -> new DummyTooltipItem(defaultProperties()));

    public static Item.Properties defaultProperties() {
        return new Item.Properties();
    }

    public static boolean laterCreativeModTab(Item item) {
        return item.toString().contains("ritual_dummy");
    }
}
