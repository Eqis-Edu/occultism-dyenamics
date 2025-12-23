package com.eqisedu.occultism_dyenamics.common.block;

import com.eqisedu.occultism_dyenamics.OccultismDyenamics;
import com.klikli_dev.occultism.Occultism;
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
import net.neoforged.neoforge.common.Tags;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public class MulticoloredGlyphBlock extends ChalkGlyphBlock {
    public static final IntegerProperty COLOR = IntegerProperty.create("color", 0, 16+17);
    public static final BooleanProperty CYCLE = BooleanProperty.create("cycle");

    protected Supplier<Item> chalk;
    protected Supplier<Integer> color;
    protected Boolean cycle;

    public MulticoloredGlyphBlock(Properties properties, Boolean cycle, Supplier<Item> chalk) {
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
            case 1 -> Occultism.CLIENT_CONFIG.visuals.lightGrayChalkGlyphColor.get();
            case 2 -> Occultism.CLIENT_CONFIG.visuals.grayChalkGlyphColor.get();
            case 3 -> Occultism.CLIENT_CONFIG.visuals.blackChalkGlyphColor.get();
            case 4 -> Occultism.CLIENT_CONFIG.visuals.brownChalkGlyphColor.get();
            case 5 -> Occultism.CLIENT_CONFIG.visuals.redChalkGlyphColor.get();
            case 6 -> Occultism.CLIENT_CONFIG.visuals.orangeChalkGlyphColor.get();
            case 7 -> Occultism.CLIENT_CONFIG.visuals.yellowChalkGlyphColor.get();
            case 8 -> Occultism.CLIENT_CONFIG.visuals.limeChalkGlyphColor.get();
            case 9 -> Occultism.CLIENT_CONFIG.visuals.greenChalkGlyphColor.get();
            case 10 -> Occultism.CLIENT_CONFIG.visuals.cyanChalkGlyphColor.get();
            case 11 -> Occultism.CLIENT_CONFIG.visuals.lightBlueChalkGlyphColor.get();
            case 12 -> Occultism.CLIENT_CONFIG.visuals.blueChalkGlyphColor.get();
            case 13 -> Occultism.CLIENT_CONFIG.visuals.purpleChalkGlyphColor.get();
            case 14 -> Occultism.CLIENT_CONFIG.visuals.magentaChalkGlyphColor.get();
            case 15 -> Occultism.CLIENT_CONFIG.visuals.pinkChalkGlyphColor.get();
            case 16 -> OccultismDyenamics.CLIENT_CONFIG.visuals.honeyChalkGlyphColor.get();
            case 16+1 -> OccultismDyenamics.CLIENT_CONFIG.visuals.mintChalkGlyphColor.get();
            case 16+2 -> OccultismDyenamics.CLIENT_CONFIG.visuals.lavenderChalkGlyphColor.get();
            case 16+3 -> OccultismDyenamics.CLIENT_CONFIG.visuals.navyChalkGlyphColor.get();
            case 16+4 -> OccultismDyenamics.CLIENT_CONFIG.visuals.amberChalkGlyphColor.get();
            case 16+5 -> OccultismDyenamics.CLIENT_CONFIG.visuals.bubblegumChalkGlyphColor.get();
            case 16+6 -> OccultismDyenamics.CLIENT_CONFIG.visuals.coniferChalkGlyphColor.get();
            case 16+7 -> OccultismDyenamics.CLIENT_CONFIG.visuals.icyBlueChalkGlyphColor.get();
            case 16+8 -> OccultismDyenamics.CLIENT_CONFIG.visuals.ultramarineChalkGlyphColor.get();
            case 16+9 -> OccultismDyenamics.CLIENT_CONFIG.visuals.maroonChalkGlyphColor.get();
            case 16+10 -> OccultismDyenamics.CLIENT_CONFIG.visuals.wineChalkGlyphColor.get();
            case 16+11 -> OccultismDyenamics.CLIENT_CONFIG.visuals.fluorescentChalkGlyphColor.get();
            case 16+12 -> OccultismDyenamics.CLIENT_CONFIG.visuals.roseChalkGlyphColor.get();
            case 16+13 -> OccultismDyenamics.CLIENT_CONFIG.visuals.cherenkovChalkGlyphColor.get();
            case 16+14 -> OccultismDyenamics.CLIENT_CONFIG.visuals.peachChalkGlyphColor.get();
            case 16+15 -> OccultismDyenamics.CLIENT_CONFIG.visuals.springGreenChalkGlyphColor.get();
            case 16+16 -> OccultismDyenamics.CLIENT_CONFIG.visuals.aquamarineChalkGlyphColor.get();
            case 16+17 -> OccultismDyenamics.CLIENT_CONFIG.visuals.persimmonChalkGlyphColor.get();
            default -> Occultism.CLIENT_CONFIG.visuals.whiteChalkGlyphColor.get();
        };
    }

    public Item getChalk() {
        return this.chalk.get();
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        BlockPos pos = context.getClickedPos();
        int sign = context.getLevel().getRandom().nextInt(MAX_SIGN + 1);
        int cor = RandomSource.create().nextIntBetweenInclusive(0, 16+17);
        boolean cc = this.cycle;
        BlockState current = context.getLevel().getBlockState(pos);
        if (current.getBlock() == this) {
            sign = (current.getValue(SIGN) + 1) % (MAX_SIGN + 1);
            cor = current.getValue(COLOR);
            cc = current.getValue(CYCLE);
        }
        Player player = context.getPlayer();
        if (player != null) {
            ItemStack stack = context.getHand().equals(InteractionHand.MAIN_HAND) ?
                    player.getItemInHand(InteractionHand.OFF_HAND) :
                    player.getItemInHand(InteractionHand.MAIN_HAND) ;
            if (stack.is(Tags.Items.DYES_WHITE)) {cor = 0; cc = false;}
            else if (stack.is(Tags.Items.DYES_LIGHT_GRAY)) {cor = 1; cc = false;}
            else if (stack.is(Tags.Items.DYES_GRAY)) {cor = 2; cc = false;}
            else if (stack.is(Tags.Items.DYES_BLACK)) {cor = 3; cc = false;}
            else if (stack.is(Tags.Items.DYES_BROWN)) {cor = 4; cc = false;}
            else if (stack.is(Tags.Items.DYES_RED)) {cor = 5; cc = false;}
            else if (stack.is(Tags.Items.DYES_ORANGE)) {cor = 6; cc = false;}
            else if (stack.is(Tags.Items.DYES_YELLOW)) {cor = 7; cc = false;}
            else if (stack.is(Tags.Items.DYES_LIME)) {cor = 8; cc = false;}
            else if (stack.is(Tags.Items.DYES_GREEN)) {cor = 9; cc = false;}
            else if (stack.is(Tags.Items.DYES_CYAN)) {cor = 10; cc = false;}
            else if (stack.is(Tags.Items.DYES_LIGHT_BLUE)) {cor = 11; cc = false;}
            else if (stack.is(Tags.Items.DYES_BLUE)) {cor = 12; cc = false;}
            else if (stack.is(Tags.Items.DYES_PURPLE)) {cor = 13; cc = false;}
            else if (stack.is(Tags.Items.DYES_MAGENTA)) {cor = 14; cc = false;}
            else if (stack.is(Tags.Items.DYES_PINK)) {cor = 15; cc = false;}
            else if (stack.is(OccultismTags.makeItemTag("c:dyes/honey"))) { cor = 16; cc = false;}
            else if (stack.is(OccultismTags.makeItemTag("c:dyes/mint"))) { cor = 16+1; cc = false;}
            else if (stack.is(OccultismTags.makeItemTag("c:dyes/lavender"))) { cor = 16+2; cc = false;}
            else if (stack.is(OccultismTags.makeItemTag("c:dyes/navy"))) { cor = 16+3; cc = false;}
            else if (stack.is(OccultismTags.makeItemTag("c:dyes/amber"))) { cor = 16+4; cc = false;}
            else if (stack.is(OccultismTags.makeItemTag("c:dyes/bubblegum"))) { cor = 16+5; cc = false;}
            else if (stack.is(OccultismTags.makeItemTag("c:dyes/conifer"))) { cor = 16+6; cc = false;}
            else if (stack.is(OccultismTags.makeItemTag("c:dyes/icy_blue"))) { cor = 16+7; cc = false;}
            else if (stack.is(OccultismTags.makeItemTag("c:dyes/ultramarine"))) { cor = 16+8; cc = false;}
            else if (stack.is(OccultismTags.makeItemTag("c:dyes/maroon"))) { cor = 16+9; cc = false;}
            else if (stack.is(OccultismTags.makeItemTag("c:dyes/wine"))) { cor = 16+10; cc = false;}
            else if (stack.is(OccultismTags.makeItemTag("c:dyes/fluorescent"))) { cor = 16+11; cc = false;}
            else if (stack.is(OccultismTags.makeItemTag("c:dyes/rose"))) { cor = 16+12; cc = false;}
            else if (stack.is(OccultismTags.makeItemTag("c:dyes/cherenkov"))) { cor = 16+13; cc = false;}
            else if (stack.is(OccultismTags.makeItemTag("c:dyes/peach"))) { cor = 16+14; cc = false;}
            else if (stack.is(OccultismTags.makeItemTag("c:dyes/spring_green"))) { cor = 16+15; cc = false;}
            else if (stack.is(OccultismTags.makeItemTag("c:dyes/aquamarine"))) { cor = 16+16; cc = false;}
            else if (stack.is(OccultismTags.makeItemTag("c:dyes/persimmon"))) { cor = 16+17; cc = false;}
            else if (stack.is(OccultismItems.SPIRIT_ATTUNED_GEM)) {cc = false;}
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
            } else if (stack.getTags().toList().contains(Tags.Items.DYES_WHITE)) {
                level.setBlockAndUpdate(pos, state.setValue(COLOR, 0));
                return ItemInteractionResult.sidedSuccess(level.isClientSide);
            } else if (stack.getTags().toList().contains(Tags.Items.DYES_LIGHT_GRAY)) {
                level.setBlockAndUpdate(pos, state.setValue(COLOR, 1));
                return ItemInteractionResult.sidedSuccess(level.isClientSide);
            } else if (stack.getTags().toList().contains(Tags.Items.DYES_GRAY)) {
                level.setBlockAndUpdate(pos, state.setValue(COLOR, 2));
                return ItemInteractionResult.sidedSuccess(level.isClientSide);
            } else if (stack.getTags().toList().contains(Tags.Items.DYES_BLACK)) {
                level.setBlockAndUpdate(pos, state.setValue(COLOR, 3));
                return ItemInteractionResult.sidedSuccess(level.isClientSide);
            } else if (stack.getTags().toList().contains(Tags.Items.DYES_BROWN)) {
                level.setBlockAndUpdate(pos, state.setValue(COLOR, 4));
                return ItemInteractionResult.sidedSuccess(level.isClientSide);
            } else if (stack.getTags().toList().contains(Tags.Items.DYES_RED)) {
                level.setBlockAndUpdate(pos, state.setValue(COLOR, 5));
                return ItemInteractionResult.sidedSuccess(level.isClientSide);
            } else if (stack.getTags().toList().contains(Tags.Items.DYES_ORANGE)) {
                level.setBlockAndUpdate(pos, state.setValue(COLOR, 6));
                return ItemInteractionResult.sidedSuccess(level.isClientSide);
            } else if (stack.getTags().toList().contains(Tags.Items.DYES_YELLOW)) {
                level.setBlockAndUpdate(pos, state.setValue(COLOR, 7));
                return ItemInteractionResult.sidedSuccess(level.isClientSide);
            } else if (stack.getTags().toList().contains(Tags.Items.DYES_LIME)) {
                level.setBlockAndUpdate(pos, state.setValue(COLOR, 8));
                return ItemInteractionResult.sidedSuccess(level.isClientSide);
            } else if (stack.getTags().toList().contains(Tags.Items.DYES_GREEN)) {
                level.setBlockAndUpdate(pos, state.setValue(COLOR, 9));
                return ItemInteractionResult.sidedSuccess(level.isClientSide);
            } else if (stack.getTags().toList().contains(Tags.Items.DYES_CYAN)) {
                level.setBlockAndUpdate(pos, state.setValue(COLOR, 10));
                return ItemInteractionResult.sidedSuccess(level.isClientSide);
            } else if (stack.getTags().toList().contains(Tags.Items.DYES_LIGHT_BLUE)) {
                level.setBlockAndUpdate(pos, state.setValue(COLOR, 11));
                return ItemInteractionResult.sidedSuccess(level.isClientSide);
            } else if (stack.getTags().toList().contains(Tags.Items.DYES_BLUE)) {
                level.setBlockAndUpdate(pos, state.setValue(COLOR, 12));
                return ItemInteractionResult.sidedSuccess(level.isClientSide);
            } else if (stack.getTags().toList().contains(Tags.Items.DYES_PURPLE)) {
                level.setBlockAndUpdate(pos, state.setValue(COLOR, 13));
                return ItemInteractionResult.sidedSuccess(level.isClientSide);
            } else if (stack.getTags().toList().contains(Tags.Items.DYES_MAGENTA)) {
                level.setBlockAndUpdate(pos, state.setValue(COLOR, 14));
                return ItemInteractionResult.sidedSuccess(level.isClientSide);
            } else if (stack.getTags().toList().contains(Tags.Items.DYES_PINK)) {
                level.setBlockAndUpdate(pos, state.setValue(COLOR, 15));
                return ItemInteractionResult.sidedSuccess(level.isClientSide);
            } else if (stack.is(OccultismTags.makeItemTag("c:dyes/honey"))) {
                level.setBlockAndUpdate(pos, state.setValue(COLOR, 16));
                return ItemInteractionResult.sidedSuccess(level.isClientSide);
            } else if (stack.is(OccultismTags.makeItemTag("c:dyes/mint"))) {
                level.setBlockAndUpdate(pos, state.setValue(COLOR, 16+1));
                return ItemInteractionResult.sidedSuccess(level.isClientSide);
            } else if (stack.is(OccultismTags.makeItemTag("c:dyes/lavender"))) {
                level.setBlockAndUpdate(pos, state.setValue(COLOR, 16+2));
                return ItemInteractionResult.sidedSuccess(level.isClientSide);
            } else if (stack.is(OccultismTags.makeItemTag("c:dyes/navy"))) {
                level.setBlockAndUpdate(pos, state.setValue(COLOR, 16+3));
                return ItemInteractionResult.sidedSuccess(level.isClientSide);
            }else if (stack.is(OccultismTags.makeItemTag("c:dyes/amber"))) {
                level.setBlockAndUpdate(pos, state.setValue(COLOR, 16+4));
                return ItemInteractionResult.sidedSuccess(level.isClientSide);
            } else if (stack.is(OccultismTags.makeItemTag("c:dyes/bubblegum"))) {
                level.setBlockAndUpdate(pos, state.setValue(COLOR, 16+5));
                return ItemInteractionResult.sidedSuccess(level.isClientSide);
            } else if (stack.is(OccultismTags.makeItemTag("c:dyes/conifer"))) {
                level.setBlockAndUpdate(pos, state.setValue(COLOR, 16+6));
                return ItemInteractionResult.sidedSuccess(level.isClientSide);
            } else if (stack.is(OccultismTags.makeItemTag("c:dyes/icy_blue"))) {
                level.setBlockAndUpdate(pos, state.setValue(COLOR, 16+7));
                return ItemInteractionResult.sidedSuccess(level.isClientSide);
            } else if (stack.is(OccultismTags.makeItemTag("c:dyes/ultramarine"))) {
                level.setBlockAndUpdate(pos, state.setValue(COLOR, 16+8));
                return ItemInteractionResult.sidedSuccess(level.isClientSide);
            } else if (stack.is(OccultismTags.makeItemTag("c:dyes/maroon"))) {
                level.setBlockAndUpdate(pos, state.setValue(COLOR, 16+9));
                return ItemInteractionResult.sidedSuccess(level.isClientSide);
            } else if (stack.is(OccultismTags.makeItemTag("c:dyes/wine"))) {
                level.setBlockAndUpdate(pos, state.setValue(COLOR, 16+10));
                return ItemInteractionResult.sidedSuccess(level.isClientSide);
            } else if (stack.is(OccultismTags.makeItemTag("c:dyes/fluorescent"))) {
                level.setBlockAndUpdate(pos, state.setValue(COLOR, 16+11));
                return ItemInteractionResult.sidedSuccess(level.isClientSide);
            } else if (stack.is(OccultismTags.makeItemTag("c:dyes/rose"))) {
                level.setBlockAndUpdate(pos, state.setValue(COLOR, 16+12));
                return ItemInteractionResult.sidedSuccess(level.isClientSide);
            } else if (stack.is(OccultismTags.makeItemTag("c:dyes/cherenkov"))) {
                level.setBlockAndUpdate(pos, state.setValue(COLOR, 16+13));
                return ItemInteractionResult.sidedSuccess(level.isClientSide);
            } else if (stack.is(OccultismTags.makeItemTag("c:dyes/peach"))) {
                level.setBlockAndUpdate(pos, state.setValue(COLOR, 16+14));
                return ItemInteractionResult.sidedSuccess(level.isClientSide);
            } else if (stack.is(OccultismTags.makeItemTag("c:dyes/spring_green"))) {
                level.setBlockAndUpdate(pos, state.setValue(COLOR, 16+15));
                return ItemInteractionResult.sidedSuccess(level.isClientSide);
            } else if (stack.is(OccultismTags.makeItemTag("c:dyes/aquamarine"))) {
                level.setBlockAndUpdate(pos, state.setValue(COLOR, 16+16));
                return ItemInteractionResult.sidedSuccess(level.isClientSide);
            } else if (stack.is(OccultismTags.makeItemTag("c:dyes/persimmon"))) {
                level.setBlockAndUpdate(pos, state.setValue(COLOR, 16+17));
                return ItemInteractionResult.sidedSuccess(level.isClientSide);
            }
        }
        return super.useItemOn(stack, state, level, pos, player, hand, hitResult);
    }

    public void animateTick(BlockState state, @NotNull Level level, @NotNull BlockPos pos, @NotNull RandomSource rand) {
        if (state.getValue(CYCLE)) {
            Integer nextColor = state.getValue(COLOR) == 16+17 ? 0 : state.getValue(COLOR) + 1;
            level.setBlockAndUpdate(pos, state.setValue(COLOR, nextColor));
        }
    }

}