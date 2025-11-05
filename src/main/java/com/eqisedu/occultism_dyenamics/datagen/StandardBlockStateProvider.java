/*
 * MIT License
 *
 * Copyright 2020 klikli-dev, McJty
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

import com.eqisedu.occultism_dyenamics.OccultismDyenamics;
import com.eqisedu.occultism_dyenamics.common.block.PrismaticGlyphBlock;
import com.eqisedu.occultism_dyenamics.registry.OccultismDyenamicsBlocks;
import com.klikli_dev.occultism.common.block.ChalkGlyphBlock;
import com.klikli_dev.occultism.common.block.LargeCandleBlock;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredHolder;

public class StandardBlockStateProvider extends BlockStateProvider {

    public StandardBlockStateProvider(PackOutput gen,
                                      ExistingFileHelper exFileHelper) {
        super(gen, OccultismDyenamics.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        //Generate blockstates for the glyphs
        OccultismDyenamicsBlocks.BLOCKS.getEntries().stream()
                .map(DeferredHolder::get)
                .filter(block -> block instanceof ChalkGlyphBlock && !(block instanceof PrismaticGlyphBlock))
                .forEach(this::generateGlyphBlockState);
        OccultismDyenamicsBlocks.BLOCKS.getEntries().stream()
                .map(DeferredHolder::get)
                .filter(block -> block instanceof PrismaticGlyphBlock)
                .forEach(this::generateRainbowGlyphBlockState);
        OccultismDyenamicsBlocks.BLOCKS.getEntries().stream()
                .map(DeferredHolder::get)
                .filter(block -> block instanceof LargeCandleBlock)
                .forEach(this::generateLargeCandleBlockState);
    }

    protected void generateLargeCandleBlockState(Block block) {
        this.simpleBlock(block,
                this.models().getExistingFile(this.modLoc("block/large_candle_white")));
    }

    protected void generateGlyphBlockState(Block block) {
        ModelFile.ExistingModelFile parent = this.models()
                .getExistingFile(this.modLoc("block/chalk_glyph/chalk_glyph"));
        this.getVariantBuilder(block)
                .forAllStates(state -> {
                    //this is called for every state combination
                    //create a child model for each glyph texture option
                    int sign = state.getValue(ChalkGlyphBlock.SIGN);
                    ModelFile subModel = this.models().getBuilder("block/chalk_glyph/" + sign).parent(parent)
                            .texture("texture", this.modLoc("block/chalk_glyph/" + sign));

                    return ConfiguredModel.builder()
                            //load the child model
                            .modelFile(subModel)
                            //
                            .rotationY((int) state.getValue(BlockStateProperties.HORIZONTAL_FACING)
                                    .toYRot())
                            .build();
                });
    }
    protected void generateRainbowGlyphBlockState(Block block) {
        ModelFile.ExistingModelFile parent = this.models()
                .getExistingFile(this.modLoc("block/chalk_glyph/chalk_glyph"));
        this.getVariantBuilder(block)
                .forAllStatesExcept(state -> {
                    //this is called for every state combination
                    //create a child model for each glyph texture option
                    int sign = state.getValue(PrismaticGlyphBlock.SIGN);
                    ModelFile subModel = this.models().getBuilder("block/chalk_glyph/" + sign).parent(parent)
                            .texture("texture", this.modLoc("block/chalk_glyph/" + sign));

                    return ConfiguredModel.builder()
                            //load the child model
                            .modelFile(subModel)
                            //
                            .rotationY((int) state.getValue(BlockStateProperties.HORIZONTAL_FACING)
                                    .toYRot())
                            .build();
                }, PrismaticGlyphBlock.COLOR);
    }
}
