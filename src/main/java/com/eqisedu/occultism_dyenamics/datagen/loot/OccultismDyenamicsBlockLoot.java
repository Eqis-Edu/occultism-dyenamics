package com.eqisedu.occultism_dyenamics.datagen.loot;

import com.eqisedu.occultism_dyenamics.OccultismDyenamics;
import com.eqisedu.occultism_dyenamics.registry.OccultismDyenamicsBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.neoforged.neoforge.registries.DeferredHolder;
import org.jetbrains.annotations.NotNull;

import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class OccultismDyenamicsBlockLoot extends BlockLootSubProvider {

    public OccultismDyenamicsBlockLoot(HolderLookup.Provider pRegistries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), pRegistries);
    }

    @Override
    public void generate(BiConsumer<ResourceKey<LootTable>, LootTable.Builder> pGenerator) {
        this.generate();
        this.map.forEach(pGenerator::accept);
    }

    @Override
    public @NotNull Iterable<Block> getKnownBlocks() {
        return BuiltInRegistries.BLOCK.stream()
                .filter(block -> Optional.of(BuiltInRegistries.BLOCK.getKey(block))
                        .filter(key -> key.getNamespace().equals(OccultismDyenamics.MODID))
                        .isPresent())
                .collect(Collectors.toSet());
    }
    @Override
    protected void generate() {
        OccultismDyenamicsBlocks.BLOCKS.getEntries().stream()
                .map(DeferredHolder::get)
                .forEach(block -> {
                    OccultismDyenamicsBlocks.BlockDataGenSettings settings = OccultismDyenamicsBlocks.BLOCK_DATA_GEN_SETTINGS
                            .get(BuiltInRegistries.BLOCK.getKey(block));
                    if (settings.lootTableType == OccultismDyenamicsBlocks.LootTableType.DROP_SELF)
                        this.dropSelf(block);
                });
    }
}
