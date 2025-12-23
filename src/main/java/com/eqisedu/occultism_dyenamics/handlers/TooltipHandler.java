package com.eqisedu.occultism_dyenamics.handlers;

import com.eqisedu.occultism_dyenamics.OccultismDyenamics;
import net.minecraft.ChatFormatting;
import net.minecraft.client.resources.language.I18n;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.world.item.ItemStack;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.ItemTooltipEvent;

import java.util.ArrayList;
import java.util.List;

@EventBusSubscriber(modid = OccultismDyenamics.MODID, value = Dist.CLIENT)
public class TooltipHandler {

    private static final List<String> namespacesToListenFor = new ArrayList<>();

    /**
     * Register a namespace (= mod id) of items to listen for during tooltip handling.
     * Should be called in @{@link net.neoforged.fml.event.lifecycle.FMLClientSetupEvent}
     */
    public static void registerNamespaceToListenTo(String namespace) {
        namespacesToListenFor.add(namespace);
    }

    @SubscribeEvent
    public static void onAddInformation(ItemTooltipEvent event) {
        ItemStack stack = event.getItemStack();
        var namespace = BuiltInRegistries.ITEM.getKey(stack.getItem()).getNamespace();
        if (namespacesToListenFor.contains(namespace)) {
            String tooltipKey = stack.getDescriptionId() + ".auto_tooltip";
            boolean tooltipExists = I18n.exists(tooltipKey);
            if (tooltipExists) {
                event.getToolTip().add(Component.translatable(tooltipKey).withStyle(Style.EMPTY.withColor(ChatFormatting.GRAY)));
            }
        }
    }
}
