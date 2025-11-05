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

package com.eqisedu.occultism_dyenamics.common.block;

import com.eqisedu.occultism_dyenamics.OccultismDyenamics;
import com.klikli_dev.occultism.common.block.ChalkGlyphBlock;
import com.klikli_dev.occultism.registry.OccultismItems;
import com.klikli_dev.occultism.registry.OccultismTags;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public class PrismaticGlyphBlock extends ChalkGlyphBlock {
    public static final IntegerProperty COLOR = IntegerProperty.create("color", 0, 17);
    public static final BooleanProperty CYCLE = BooleanProperty.create("cycle");

    protected Supplier<Item> chalk;
    protected Supplier<Integer> color;
    protected Boolean cycle;

    public PrismaticGlyphBlock(Properties properties, Boolean cycle, Supplier<Item> chalk) {
        super(properties, OccultismDyenamics.CLIENT_CONFIG.visuals.honeyChalkGlyphColor, chalk);
        this.chalk = chalk;
        this.cycle = cycle;
        this.registerDefaultState(
                this.stateDefinition
                        .any()
                        .setValue(CYCLE, cycle)
        );
    }

    public int getColor(BlockState state) {
        return switch (state.getValue(COLOR)) {
            case 1 -> OccultismDyenamics.CLIENT_CONFIG.visuals.mintChalkGlyphColor.get();
            case 2 -> OccultismDyenamics.CLIENT_CONFIG.visuals.lavenderChalkGlyphColor.get();
            case 3 -> OccultismDyenamics.CLIENT_CONFIG.visuals.navyChalkGlyphColor.get();
            case 4 -> OccultismDyenamics.CLIENT_CONFIG.visuals.amberChalkGlyphColor.get();
            case 5 -> OccultismDyenamics.CLIENT_CONFIG.visuals.bubblegumChalkGlyphColor.get();
            case 6 -> OccultismDyenamics.CLIENT_CONFIG.visuals.coniferChalkGlyphColor.get();
            case 7 -> OccultismDyenamics.CLIENT_CONFIG.visuals.icyBlueChalkGlyphColor.get();
            case 8 -> OccultismDyenamics.CLIENT_CONFIG.visuals.ultramarineChalkGlyphColor.get();
            case 9 -> OccultismDyenamics.CLIENT_CONFIG.visuals.maroonChalkGlyphColor.get();
            case 10 -> OccultismDyenamics.CLIENT_CONFIG.visuals.wineChalkGlyphColor.get();
            case 11 -> OccultismDyenamics.CLIENT_CONFIG.visuals.fluorescentChalkGlyphColor.get();
            case 12 -> OccultismDyenamics.CLIENT_CONFIG.visuals.roseChalkGlyphColor.get();
            case 13 -> OccultismDyenamics.CLIENT_CONFIG.visuals.cherenkovChalkGlyphColor.get();
            case 14 -> OccultismDyenamics.CLIENT_CONFIG.visuals.peachChalkGlyphColor.get();
            case 15 -> OccultismDyenamics.CLIENT_CONFIG.visuals.springGreenChalkGlyphColor.get();
            case 16 -> OccultismDyenamics.CLIENT_CONFIG.visuals.aquamarineChalkGlyphColor.get();
            case 17 -> OccultismDyenamics.CLIENT_CONFIG.visuals.persimmonChalkGlyphColor.get();
            default -> OccultismDyenamics.CLIENT_CONFIG.visuals.honeyChalkGlyphColor.get();
        };
    }

    public Item getChalk() {
        return this.chalk.get();
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        BlockPos pos = context.getClickedPos();
        int sign = context.getLevel().getRandom().nextInt(MAX_SIGN + 1);
        int cor = 0;
        boolean cc = this.cycle;
        BlockState current = context.getLevel().getBlockState(pos);
        if (current.getBlock() == this) {
            sign = (current.getValue(SIGN) + 1) % (MAX_SIGN + 1);
            cor = current.getValue(COLOR);
            cc = current.getValue(CYCLE);
        }
        return this.defaultBlockState().setValue(COLOR, cor).setValue(CYCLE, cc).setValue(SIGN, sign)
                .setValue(BlockStateProperties.HORIZONTAL_FACING,
                        context.getHorizontalDirection().getOpposite());
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(COLOR, CYCLE);
        super.createBlockStateDefinition(builder);
    }

    @Override
    protected @NotNull ItemInteractionResult useItemOn(
            @NotNull ItemStack stack, @NotNull BlockState state, @NotNull Level level,
            @NotNull BlockPos pos, Player player, @NotNull InteractionHand hand, @NotNull BlockHitResult hitResult
    ) {
        if (player.getAbilities().mayBuild) {
            if (stack.getItem().equals(OccultismItems.SPIRIT_ATTUNED_GEM.get())) {
                if (state.getValue(CYCLE)) {
                    level.setBlockAndUpdate(pos, state.setValue(CYCLE, false));
                } else {
                    level.setBlockAndUpdate(pos, state.setValue(CYCLE, true));
                }
                return ItemInteractionResult.sidedSuccess(level.isClientSide);
            } else if (stack.is(OccultismTags.makeItemTag("c:dyes/honey"))) {
                level.setBlockAndUpdate(pos, state.setValue(COLOR, 0));
                return ItemInteractionResult.sidedSuccess(level.isClientSide);
            } else if (stack.is(OccultismTags.makeItemTag("c:dyes/mint"))) {
                level.setBlockAndUpdate(pos, state.setValue(COLOR, 1));
                return ItemInteractionResult.sidedSuccess(level.isClientSide);
            } else if (stack.is(OccultismTags.makeItemTag("c:dyes/lavender"))) {
                level.setBlockAndUpdate(pos, state.setValue(COLOR, 2));
                return ItemInteractionResult.sidedSuccess(level.isClientSide);
            } else if (stack.is(OccultismTags.makeItemTag("c:dyes/navy"))) {
                level.setBlockAndUpdate(pos, state.setValue(COLOR, 3));
                return ItemInteractionResult.sidedSuccess(level.isClientSide);
            }else if (stack.is(OccultismTags.makeItemTag("c:dyes/amber"))) {
                level.setBlockAndUpdate(pos, state.setValue(COLOR, 4));
                return ItemInteractionResult.sidedSuccess(level.isClientSide);
            } else if (stack.is(OccultismTags.makeItemTag("c:dyes/bubblegum"))) {
                level.setBlockAndUpdate(pos, state.setValue(COLOR, 5));
                return ItemInteractionResult.sidedSuccess(level.isClientSide);
            } else if (stack.is(OccultismTags.makeItemTag("c:dyes/conifer"))) {
                level.setBlockAndUpdate(pos, state.setValue(COLOR, 6));
                return ItemInteractionResult.sidedSuccess(level.isClientSide);
            } else if (stack.is(OccultismTags.makeItemTag("c:dyes/icy_blue"))) {
                level.setBlockAndUpdate(pos, state.setValue(COLOR, 7));
                return ItemInteractionResult.sidedSuccess(level.isClientSide);
            } else if (stack.is(OccultismTags.makeItemTag("c:dyes/ultramarine"))) {
                level.setBlockAndUpdate(pos, state.setValue(COLOR, 8));
                return ItemInteractionResult.sidedSuccess(level.isClientSide);
            } else if (stack.is(OccultismTags.makeItemTag("c:dyes/maroon"))) {
                level.setBlockAndUpdate(pos, state.setValue(COLOR, 9));
                return ItemInteractionResult.sidedSuccess(level.isClientSide);
            } else if (stack.is(OccultismTags.makeItemTag("c:dyes/wine"))) {
                level.setBlockAndUpdate(pos, state.setValue(COLOR, 10));
                return ItemInteractionResult.sidedSuccess(level.isClientSide);
            } else if (stack.is(OccultismTags.makeItemTag("c:dyes/fluorescent"))) {
                level.setBlockAndUpdate(pos, state.setValue(COLOR, 11));
                return ItemInteractionResult.sidedSuccess(level.isClientSide);
            } else if (stack.is(OccultismTags.makeItemTag("c:dyes/rose"))) {
                level.setBlockAndUpdate(pos, state.setValue(COLOR, 12));
                return ItemInteractionResult.sidedSuccess(level.isClientSide);
            } else if (stack.is(OccultismTags.makeItemTag("c:dyes/cherenkov"))) {
                level.setBlockAndUpdate(pos, state.setValue(COLOR, 13));
                return ItemInteractionResult.sidedSuccess(level.isClientSide);
            } else if (stack.is(OccultismTags.makeItemTag("c:dyes/peach"))) {
                level.setBlockAndUpdate(pos, state.setValue(COLOR, 14));
                return ItemInteractionResult.sidedSuccess(level.isClientSide);
            } else if (stack.is(OccultismTags.makeItemTag("c:dyes/spring_green"))) {
                level.setBlockAndUpdate(pos, state.setValue(COLOR, 15));
                return ItemInteractionResult.sidedSuccess(level.isClientSide);
            } else if (stack.is(OccultismTags.makeItemTag("c:dyes/aquamarine"))) {
                level.setBlockAndUpdate(pos, state.setValue(COLOR, 16));
                return ItemInteractionResult.sidedSuccess(level.isClientSide);
            } else if (stack.is(OccultismTags.makeItemTag("c:dyes/persimmon"))) {
                level.setBlockAndUpdate(pos, state.setValue(COLOR, 17));
                return ItemInteractionResult.sidedSuccess(level.isClientSide);
            }
        }
        return super.useItemOn(stack, state, level, pos, player, hand, hitResult);
    }

    public void animateTick(BlockState state, @NotNull Level level, @NotNull BlockPos pos, @NotNull RandomSource rand) {
        if (state.getValue(CYCLE)) {
            Integer nextColor = state.getValue(COLOR) == 17 ? 0 : state.getValue(COLOR) + 1;
            level.setBlockAndUpdate(pos, state.setValue(COLOR, nextColor));
        }
    }

}
