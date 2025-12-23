package com.eqisedu.occultism_dyenamics.datagen;

import com.eqisedu.occultism_dyenamics.OccultismDyenamics;
import com.eqisedu.occultism_dyenamics.registry.OccultismDyenamicsBlocks;
import com.eqisedu.occultism_dyenamics.registry.OccultismDyenamicsItems;
import com.klikli_dev.occultism.common.block.LargeCandleBlock;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredHolder;

public class ItemModelsGenerator extends ItemModelProvider {
    public ItemModelsGenerator(PackOutput packOutput, ExistingFileHelper existingFileHelper) {
        super(packOutput, OccultismDyenamics.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        BuiltInRegistries.ITEM.forEach(item -> {
            var key = BuiltInRegistries.ITEM.getKey(item);
            if (key.getNamespace().contains("dyenamics") &&
                    key.getPath().startsWith("ritual_dummy/")) {
                this.registerRitualDummy("item/" + key.getPath());
            }
        });
        this.registerItemChalks();
        this.registerItemCandles();
    }

    protected String name(Item item) {
        return BuiltInRegistries.ITEM.getKey(item).getPath();
    }

    private void registerRitualDummy(String name) {
        if (name.contains("misc") || name.contains("contact") || name.contains("wild") || name.contains("resurrect")) {
            this.getBuilder(name).parent(new ModelFile.UncheckedModelFile("occultism:item/pentacle_misc"));
        } else if (name.contains("craft") || name.contains("repair")) {
            this.getBuilder(name).parent(new ModelFile.UncheckedModelFile("occultism:item/pentacle_craft"));
        } else if (name.contains("invoke") || name.contains("possess") || name.contains("familiar")) {
            this.getBuilder(name).parent(new ModelFile.UncheckedModelFile("occultism:item/pentacle_possess"));
        } else if (name.contains("summon")) {
            this.getBuilder(name).parent(new ModelFile.UncheckedModelFile("occultism:item/pentacle_summon"));
        }
    }

    private void registerItemChalks() {
        OccultismDyenamicsItems.ITEMS.getEntries().stream()
                .map(DeferredHolder::get)
                .filter(item -> item.toString().contains("chalk") && !item.toString().contains("misc"))
                .forEach(this::generateChalkItem);
    }

    private void registerItemCandles() {
        OccultismDyenamicsBlocks.BLOCKS.getEntries().stream()
            .map(DeferredHolder::get)
            .filter(block -> block instanceof LargeCandleBlock)
            .forEach(this::generateLargeCandleItem);
    }

    private void generateChalkItem(Item item) {
        String name = this.name(item);
        if (name.contains("prismatic")) {
            this.getBuilder(name)
                    .parent(new ModelFile.UncheckedModelFile("item/generated"))
                    .texture("layer0", this.modLoc("item/chalk_prismatic"));
        } else if (name.contains("multicolored")) {
            this.getBuilder(name)
                    .parent(new ModelFile.UncheckedModelFile("item/generated"))
                    .texture("layer0", this.modLoc("item/chalk_multicolored"));
        }else if (name.contains("impure")) {
            this.getBuilder(name)
                .parent(new ModelFile.UncheckedModelFile("item/generated"))
                .texture("layer0", this.modLoc("item/chalk_base"))
                .texture("layer1", this.modLoc("item/chalk_base_impure"));
        } else {
            this.getBuilder(name)
                .parent(new ModelFile.UncheckedModelFile("item/generated"))
                .texture("layer0", this.modLoc("item/chalk_base"));
        }
    }

    private void generateLargeCandleItem(Block block) {
        String item = this.name(block.asItem());
        this.getBuilder(item)
            .parent(new ModelFile.UncheckedModelFile(this.modLoc("block/" + "large_candle_white")));
    }
}
