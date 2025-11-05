package com.eqisedu.occultism_dyenamics.registry;

import com.eqisedu.occultism_dyenamics.OccultismDyenamics;
import com.eqisedu.occultism_dyenamics.common.blockentity.ChosenGlyphBlockEntity;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class OccultismDyenamicsBlockEntities {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, OccultismDyenamics.MODID);

    public static final Supplier<BlockEntityType<ChosenGlyphBlockEntity>> CHOSEN_GLYPH = BLOCK_ENTITIES.register(
            "chosen_glyph", () -> BlockEntityType.Builder.of(ChosenGlyphBlockEntity::new,
                    OccultismDyenamicsBlocks.CHALK_GLYPH_CHOSEN.get()).build(null));
}
