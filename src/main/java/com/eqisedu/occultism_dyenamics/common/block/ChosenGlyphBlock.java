package com.eqisedu.occultism_dyenamics.common.block;

import com.eqisedu.occultism_dyenamics.OccultismDyenamics;
import com.eqisedu.occultism_dyenamics.common.blockentity.ChosenGlyphBlockEntity;
import com.eqisedu.occultism_dyenamics.registry.OccultismDyenamicsBlockEntities;
import com.eqisedu.occultism_dyenamics.registry.OccultismDyenamicsItems;
import com.klikli_dev.occultism.common.block.ChalkGlyphBlock;
import com.klikli_dev.occultism.registry.OccultismItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.component.DataComponents;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.component.DyedItemColor;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public class ChosenGlyphBlock extends ChalkGlyphBlock implements EntityBlock {
    public static final BooleanProperty CYCLE = BooleanProperty.create("cycle");

    public ChosenGlyphBlock(Properties properties, Supplier<Item> chalk) {
        super(properties, OccultismDyenamics.CLIENT_CONFIG.visuals.honeyChalkGlyphColor, chalk);
        this.registerDefaultState(
                this.stateDefinition
                        .any()
                        .setValue(CYCLE, true)
        );
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        BlockPos pos = context.getClickedPos();
        int sign = context.getLevel().getRandom().nextInt(MAX_SIGN + 1);
        boolean cc = true;
        BlockState current = context.getLevel().getBlockState(pos);
        if (current.getBlock() == this) {
            sign = (current.getValue(SIGN) + 1) % (MAX_SIGN + 1);
            cc = current.getValue(CYCLE);
        }
        Player player = context.getPlayer();
        if (player != null) {
            if (context.getItemInHand().get(DataComponents.DYED_COLOR) != null)
                cc = false;
            ItemStack stack = context.getHand().equals(InteractionHand.MAIN_HAND) ?
                    player.getItemInHand(InteractionHand.OFF_HAND) :
                    player.getItemInHand(InteractionHand.MAIN_HAND) ;
            if (stack.is(OccultismItems.SPIRIT_ATTUNED_GEM))
                cc = !cc;
        }
        return this.defaultBlockState().setValue(CYCLE, cc).setValue(SIGN, sign)
                .setValue(BlockStateProperties.HORIZONTAL_FACING,
                        context.getHorizontalDirection().getOpposite());
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(CYCLE);
        super.createBlockStateDefinition(builder);
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
        if (pPlayer.getAbilities().mayBuild) {
            if (pStack.getItem().equals(OccultismItems.SPIRIT_ATTUNED_GEM.get())) {
                if (pState.getValue(CYCLE)) {
                    pLevel.setBlockAndUpdate(pPos, pState.setValue(CYCLE, false));
                } else {
                    pLevel.setBlockAndUpdate(pPos, pState.setValue(CYCLE, true));
                }
                return ItemInteractionResult.sidedSuccess(pLevel.isClientSide);
            }
            if (blockEntity instanceof ChosenGlyphBlockEntity glyph && pStack.is(OccultismDyenamicsItems.CHALK_CHOSEN)) {
                glyph.setColor(DyedItemColor.getOrDefault(pStack, RandomSource.create().nextInt()));
                return ItemInteractionResult.sidedSuccess(pLevel.isClientSide);
            }
        }
        return super.useItemOn(pStack, pState, pLevel, pPos, pPlayer, pHand, pHitResult);
    }

    public void animateTick(BlockState state, @NotNull Level level, @NotNull BlockPos pos, @NotNull RandomSource rand) {
        if (state.getValue(CYCLE) && level.getBlockEntity(pos) instanceof ChosenGlyphBlockEntity glyphBlockEntity) {
            glyphBlockEntity.setColor(RandomSource.create().nextInt());
        }
    }
}