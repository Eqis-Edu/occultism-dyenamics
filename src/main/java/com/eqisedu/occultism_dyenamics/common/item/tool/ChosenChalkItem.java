package com.eqisedu.occultism_dyenamics.common.item.tool;

import com.eqisedu.occultism_dyenamics.common.block.ChosenGlyphBlock;
import com.eqisedu.occultism_dyenamics.common.blockentity.ChosenGlyphBlockEntity;
import com.klikli_dev.occultism.common.block.ChalkGlyphBlock;
import com.klikli_dev.occultism.common.item.tool.ChalkItem;
import com.klikli_dev.occultism.registry.OccultismSounds;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.component.DataComponents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.component.DyedItemColor;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class ChosenChalkItem extends ChalkItem {
    ChosenGlyphBlock glyphBlock;

    public ChosenChalkItem(Properties properties, ChosenGlyphBlock glyphBlock) {
        super(properties , glyphBlock);
        this.glyphBlock = glyphBlock;
    }

    @Override
    public @NotNull InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        BlockPos pos = context.getClickedPos();
        Player player = context.getPlayer();
        boolean isReplacing = level.getBlockState(pos).canBeReplaced(new BlockPlaceContext(context));

        if (!level.isClientSide && player != null) {
            if (player.isCrouching()){ //brush job
                if (level.getBlockState(pos).getBlock() instanceof ChalkGlyphBlock) {
                    level.removeBlock(pos, false);
                    level.playSound(null, pos, OccultismSounds.BRUSH.get(), SoundSource.PLAYERS, 0.5f,
                            1 + 0.5f * Objects.requireNonNull(context.getPlayer()).getRandom().nextFloat());
                    return InteractionResult.SUCCESS;
                }
            }
            //only place if player clicked at a top face
            //only if the block can be placed or is replacing an existing block
            if ((context.getClickedFace() == Direction.UP
                    && this.glyphBlock.canSurvive(level.getBlockState(pos.above()), level, pos.above())) || isReplacing) {
                ItemStack heldChalk = context.getItemInHand();
                BlockPos placeAt = isReplacing ? pos : pos.above();

                boolean isSameChalkType = level.getBlockState(placeAt).getBlock() == this.glyphBlock;


                level.setBlockAndUpdate(placeAt,
                        Objects.requireNonNull(this.glyphBlock.getStateForPlacement(new BlockPlaceContext(context))));

                if (level.getBlockEntity(placeAt) instanceof ChosenGlyphBlockEntity glyph) {
                    glyph.setColor(DyedItemColor.getOrDefault(heldChalk, RandomSource.create().nextInt()));
                }

                level.playSound(null, pos, OccultismSounds.CHALK.get(), SoundSource.PLAYERS, 0.5f,
                        1 + 0.5f * player.getRandom().nextFloat());

                // do not consume durability if creative, or if same kind of chalk (= cycle through sings)
                if (!player.isCreative() && !isSameChalkType)
                    heldChalk.hurtAndBreak(1, player, player.getEquipmentSlotForItem(heldChalk));
            }
        }
        return InteractionResult.SUCCESS;
    }

    @Override
    public @NotNull String getDescriptionId(ItemStack stack) {
        return stack.has(DataComponents.DYED_COLOR) ?
                super.getDescriptionId(stack) : "item.occultism_dyenamics.chalk_chosen_glitch";
    }
}
