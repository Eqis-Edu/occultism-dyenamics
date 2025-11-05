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

package com.eqisedu.occultism_dyenamics.datagen;

import com.eqisedu.occultism_dyenamics.datagen.lang.ENUSProvider;
import com.eqisedu.occultism_dyenamics.datagen.loot.OccultismDyenamicsBlockLoot;
import com.eqisedu.occultism_dyenamics.datagen.loot.OccultismDyenamicsLootTableProvider;
import com.eqisedu.occultism_dyenamics.datagen.recipe.OccultismDyenamicsRecipeProvider;
import com.eqisedu.occultism_dyenamics.datagen.tags.OccultismDyenamicsBlockTagProvider;
import com.eqisedu.occultism_dyenamics.datagen.tags.OccultismDyenamicsItemTagProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.List;
import java.util.Set;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();

        generator.addProvider(event.includeServer(),
                new OccultismDyenamicsLootTableProvider(generator.getPackOutput(), Set.of(), List.of(
                        new LootTableProvider.SubProviderEntry(OccultismDyenamicsBlockLoot::new, LootContextParamSets.BLOCK)
                ), event.getLookupProvider()));
        generator.addProvider(event.includeServer(), new OccultismDyenamicsRecipeProvider(generator.getPackOutput(), event.getLookupProvider()));

        OccultismDyenamicsBlockTagProvider forgeBlockProvider = new OccultismDyenamicsBlockTagProvider(generator.getPackOutput(), event.getLookupProvider(), event.getExistingFileHelper());
        generator.addProvider(event.includeServer(), forgeBlockProvider);
        generator.addProvider(event.includeServer(), new OccultismDyenamicsItemTagProvider(generator.getPackOutput(), event.getLookupProvider(), forgeBlockProvider.contentsGetter(), event.getExistingFileHelper()));
        generator.addProvider(event.includeClient(), new ItemModelsGenerator(generator.getPackOutput(), event.getExistingFileHelper()));
        generator.addProvider(event.includeClient(), new StandardBlockStateProvider(generator.getPackOutput(), event.getExistingFileHelper()));

        var enUSProvider = new ENUSProvider(generator.getPackOutput());

        //Important: Lang provider (in this case enus) needs to be added after the book provider to process the texts added by the book provider
        generator.addProvider(event.includeClient(), enUSProvider);
    }
}