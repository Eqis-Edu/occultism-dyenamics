package com.eqisedu.occultism_dyenamics.handlers;

import com.eqisedu.occultism_dyenamics.OccultismDyenamics;
import com.eqisedu.occultism_dyenamics.client.render.blockentity.ChosenGlyphRenderer;
import com.eqisedu.occultism_dyenamics.registry.OccultismDyenamicsBlockEntities;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;

@EventBusSubscriber(modid = OccultismDyenamics.MODID, value = Dist.CLIENT)
public class ClientSetupEventHandler {

    public static void registerConfigScreen(ModContainer modContainer) {
        modContainer.registerExtensionPoint(IConfigScreenFactory.class, ConfigurationScreen::new);
    }

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        TooltipHandler.registerNamespaceToListenTo(OccultismDyenamics.MODID);
        BlockEntityRenderers.register(OccultismDyenamicsBlockEntities.CHOSEN_GLYPH.get(), ChosenGlyphRenderer::new);
    }

}
