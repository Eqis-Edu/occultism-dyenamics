package com.eqisedu.occultism_dyenamics.datagen;

import com.eqisedu.occultism_dyenamics.OccultismDyenamics;
import com.eqisedu.occultism_dyenamics.common.block.ChosenGlyphBlock;
import com.eqisedu.occultism_dyenamics.common.block.MulticoloredGlyphBlock;
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
        OccultismDyenamicsBlocks.BLOCKS.getEntries().stream()
                .map(DeferredHolder::get)
                .filter(block -> block instanceof ChalkGlyphBlock &&
                        !(block instanceof PrismaticGlyphBlock || block instanceof MulticoloredGlyphBlock || block instanceof ChosenGlyphBlock))
                .forEach(this::generateGlyphBlockState);
        OccultismDyenamicsBlocks.BLOCKS.getEntries().stream()
                .map(DeferredHolder::get)
                .filter(block -> block instanceof PrismaticGlyphBlock)
                .forEach(this::generateRainbowGlyphBlockState);
        OccultismDyenamicsBlocks.BLOCKS.getEntries().stream()
                .map(DeferredHolder::get)
                .filter(block -> block instanceof MulticoloredGlyphBlock)
                .forEach(this::generateMulticoloredGlyphBlockState);
        OccultismDyenamicsBlocks.BLOCKS.getEntries().stream()
                .map(DeferredHolder::get)
                .filter(block -> block instanceof ChosenGlyphBlock)
                .forEach(this::generateChosenGlyphBlockState);
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
                    int sign = state.getValue(ChalkGlyphBlock.SIGN);
                    ModelFile subModel = this.models().getBuilder("block/chalk_glyph/" + sign).parent(parent)
                            .texture("texture", this.modLoc("block/chalk_glyph/" + sign));
                    return ConfiguredModel.builder()
                            .modelFile(subModel)
                            .rotationY((int) state.getValue(BlockStateProperties.HORIZONTAL_FACING).toYRot())
                            .build();
                });
    }
    protected void generateRainbowGlyphBlockState(Block block) {
        ModelFile.ExistingModelFile parent = this.models()
                .getExistingFile(this.modLoc("block/chalk_glyph/chalk_glyph"));
        this.getVariantBuilder(block)
                .forAllStatesExcept(state -> {
                    int sign = state.getValue(PrismaticGlyphBlock.SIGN);
                    ModelFile subModel = this.models().getBuilder("block/chalk_glyph/" + sign).parent(parent)
                            .texture("texture", this.modLoc("block/chalk_glyph/" + sign));
                    return ConfiguredModel.builder()
                            .modelFile(subModel)
                            .rotationY((int) state.getValue(BlockStateProperties.HORIZONTAL_FACING).toYRot())
                            .build();
                }, PrismaticGlyphBlock.COLOR);
    }
    protected void generateMulticoloredGlyphBlockState(Block block) {
        ModelFile.ExistingModelFile parent = this.models()
                .getExistingFile(this.modLoc("block/chalk_glyph/chalk_glyph"));
        this.getVariantBuilder(block)
                .forAllStatesExcept(state -> {
                    int sign = state.getValue(MulticoloredGlyphBlock.SIGN);
                    ModelFile subModel = this.models().getBuilder("block/chalk_glyph/" + sign).parent(parent)
                            .texture("texture", this.modLoc("block/chalk_glyph/" + sign));
                    return ConfiguredModel.builder().modelFile(subModel)
                            .rotationY((int) state.getValue(BlockStateProperties.HORIZONTAL_FACING).toYRot())
                            .build();
                }, MulticoloredGlyphBlock.COLOR);
    }
    protected void generateChosenGlyphBlockState(Block block) {
        ModelFile.ExistingModelFile parent = this.models()
                .getExistingFile(this.modLoc("block/chalk_glyph/chalk_glyph"));
        this.getVariantBuilder(block)
                .forAllStatesExcept(state -> {
                    int sign = state.getValue(MulticoloredGlyphBlock.SIGN);
                    ModelFile subModel = this.models().getBuilder("block/chalk_glyph/" + sign).parent(parent)
                            .texture("texture", this.modLoc("block/chalk_glyph/" + sign));
                    return ConfiguredModel.builder().modelFile(subModel)
                            .rotationY((int) state.getValue(BlockStateProperties.HORIZONTAL_FACING).toYRot())
                            .build();
                }, ChosenGlyphBlock.CYCLE);
    }
}
