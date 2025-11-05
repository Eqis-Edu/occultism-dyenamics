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

package com.eqisedu.occultism_dyenamics;

import com.eqisedu.occultism_dyenamics.config.OccultismDyenamicsClientConfig;
import com.eqisedu.occultism_dyenamics.handlers.ClientSetupEventHandler;
import com.eqisedu.occultism_dyenamics.registry.OccultismDyenamicsCreativeModeTabs;
import com.eqisedu.occultism_dyenamics.registry.OccultismDyenamicsBlockEntities;
import com.eqisedu.occultism_dyenamics.registry.OccultismDyenamicsBlocks;
import com.eqisedu.occultism_dyenamics.registry.OccultismDyenamicsItems;
import com.mojang.logging.LogUtils;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.loading.FMLEnvironment;
import org.slf4j.Logger;

@Mod(OccultismDyenamics.MODID)
public class OccultismDyenamics {
    public static final String MODID = "occultism_dyenamics";
    public static final String NAME = "Occultism: Dyenamics Chalks";
    public static final Logger LOGGER = LogUtils.getLogger();
    public static final OccultismDyenamicsClientConfig CLIENT_CONFIG = new OccultismDyenamicsClientConfig();
    public static OccultismDyenamics INSTANCE;

    public OccultismDyenamics(IEventBus modEventBus, ModContainer modContainer) {
        INSTANCE = this;
        modContainer.registerConfig(ModConfig.Type.CLIENT, CLIENT_CONFIG.spec);

        OccultismDyenamicsBlocks.BLOCKS.register(modEventBus);
        OccultismDyenamicsItems.ITEMS.register(modEventBus);
        OccultismDyenamicsBlockEntities.BLOCK_ENTITIES.register(modEventBus);
        OccultismDyenamicsCreativeModeTabs.CREATIVE_MODE_TABS.register(modEventBus);

        if (FMLEnvironment.dist == Dist.CLIENT) {
            ClientSetupEventHandler.registerConfigScreen(modContainer);
        }

    }
}
