package com.eqisedu.occultism_dyenamics.common.block;

import com.eqisedu.occultism_dyenamics.OccultismDyenamics;
import com.eqisedu.occultism_dyenamics.common.blockentity.ChosenGlyphBlockEntity;
import com.eqisedu.occultism_dyenamics.registry.OccultismDyenamicsBlockEntities;
import com.eqisedu.occultism_dyenamics.registry.OccultismDyenamicsItems;
import com.klikli_dev.occultism.common.block.ChalkGlyphBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.component.DyedItemColor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public class ChosenGlyphBlock extends ChalkGlyphBlock implements EntityBlock {
    public ChosenGlyphBlock(Properties properties, Supplier<Item> chalk) {
        super(properties, OccultismDyenamics.CLIENT_CONFIG.visuals.honeyChalkGlyphColor, chalk);
    }

    @Override public BlockEntity newBlockEntity(@NotNull BlockPos blockPos, @NotNull BlockState blockState) {
        return OccultismDyenamicsBlockEntities.CHOSEN_GLYPH.get().create(blockPos, blockState);
    }
    @Override
    public @NotNull RenderShape getRenderShape(@NotNull BlockState state) {
        return RenderShape.INVISIBLE;
    }
    @Override
    public @NotNull ItemInteractionResult useItemOn(@NotNull ItemStack pStack, @NotNull BlockState pState,
                                                    Level pLevel, @NotNull BlockPos pPos, @NotNull Player pPlayer,
                                                    @NotNull InteractionHand pHand, @NotNull BlockHitResult pHitResult) {
        BlockEntity blockEntity = pLevel.getBlockEntity(pPos);
        if (blockEntity instanceof ChosenGlyphBlockEntity glyph && pStack.is(OccultismDyenamicsItems.CHALK_CHOSEN)) {
            glyph.setColor(DyedItemColor.getOrDefault(pStack, 0xFFFFFF));
            return ItemInteractionResult.SUCCESS;
        }
        return super.useItemOn(pStack, pState, pLevel, pPos, pPlayer, pHand, pHitResult);
    }
}