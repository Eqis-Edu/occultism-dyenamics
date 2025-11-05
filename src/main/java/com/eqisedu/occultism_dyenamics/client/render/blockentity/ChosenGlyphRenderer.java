package com.eqisedu.occultism_dyenamics.client.render.blockentity;

import com.eqisedu.occultism_dyenamics.common.blockentity.ChosenGlyphBlockEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.block.BlockRenderDispatcher;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.client.model.data.ModelData;

public class ChosenGlyphRenderer implements BlockEntityRenderer<ChosenGlyphBlockEntity> {

    public ChosenGlyphRenderer(BlockEntityRendererProvider.Context context) {}

    @Override
    public void render(ChosenGlyphBlockEntity be, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight, int packedOverlay) {

        poseStack.pushPose();

        be.onLoad();

        int color = be.getColor();

        float r = ((color >> 16) & 0xFF) / 255f;
        float g = ((color >> 8) & 0xFF) / 255f;
        float b = (color & 0xFF) / 255f;

        BlockState state = be.getBlockState();
        BlockRenderDispatcher dispatcher = Minecraft.getInstance().getBlockRenderer();

        renderBlockWithColor(state, poseStack, bufferSource, dispatcher, packedLight, packedOverlay, r, g, b);

        poseStack.popPose();
    }

    private void renderBlockWithColor(BlockState state, PoseStack poseStack, MultiBufferSource buffer,
                                      BlockRenderDispatcher dispatcher, int light, int overlay,
                                      float r, float g, float b) {

        BakedModel model = dispatcher.getBlockModel(state);

        VertexConsumer vertexConsumer = buffer.getBuffer(RenderType.cutout());

        dispatcher.getModelRenderer().renderModel(
                poseStack.last(),
                vertexConsumer,
                state,
                model,
                r, g, b,
                light,
                overlay,
                ModelData.EMPTY,
                RenderType.cutout()
        );
    }
}
