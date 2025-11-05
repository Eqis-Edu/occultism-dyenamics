package com.eqisedu.occultism_dyenamics.registry;

import com.eqisedu.occultism_dyenamics.OccultismDyenamics;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class OccultismCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, OccultismDyenamics.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> OCCULTISM_DYENAMICS =
            CREATIVE_MODE_TABS.register("occultism_dyenamics",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.occultism_dyenamics"))
                    .withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
                    .icon(() -> OccultismDyenamicsItems.CHALK_HONEY.get().getDefaultInstance())
                    .displayItems((parameters, output) -> {
                        //General items and blocks
                        OccultismDyenamicsItems.ITEMS.getEntries().forEach(i -> {
                            if (OccultismDyenamicsItems.laterCreativeModTab(i.get()))
                                return;
                            var stack = new ItemStack(i.get());
                            output.accept(stack);
                        });

                        // Spawn eggs, ritual dummy and debug items
                        OccultismDyenamicsItems.ITEMS.getEntries().forEach(i -> {
                            if (OccultismDyenamicsItems.laterCreativeModTab(i.get())) {
                                var stack = new ItemStack(i.get());
                                output.accept(stack);
                            }
                        });

                    }).build());

}