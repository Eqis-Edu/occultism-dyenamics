package com.eqisedu.occultism_dyenamics.common.blockentity;

import com.eqisedu.occultism_dyenamics.registry.OccultismDyenamicsBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.Connection;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;

public class ChosenGlyphBlockEntity extends BlockEntity {

    public int color = 0xFFFFFF;

    public ChosenGlyphBlockEntity(BlockPos pos, BlockState blockState) {
        super(OccultismDyenamicsBlockEntities.CHOSEN_GLYPH.get(), pos, blockState);
    }

    public void setColor(int i) {
        this.color = i;
        this.setChanged();
        if (level != null)
            level.sendBlockUpdated(worldPosition, getBlockState(), getBlockState(), Block.UPDATE_ALL);
    }

    public int getColor() {
        return this.color;
    }

    @Override
    public void loadAdditional(@NotNull CompoundTag compound, @NotNull  HolderLookup.Provider provider) {
        super.loadAdditional(compound, provider);
        this.color = compound.getInt("color");
    }

    @Override
    public void saveAdditional(@NotNull CompoundTag compound, @NotNull  HolderLookup.Provider provider) {
        super.saveAdditional(compound, provider);
        compound.putInt("color", this.color);
    }

    @Override
    public void onLoad() {
        super.onLoad();
        if (level != null && level.isClientSide) {
            level.sendBlockUpdated(worldPosition, getBlockState(), getBlockState(), Block.UPDATE_ALL);
        }
    }

    @Override
    public @NotNull CompoundTag getUpdateTag(HolderLookup.Provider provider) {
        CompoundTag tag = super.getUpdateTag(provider);
        tag.putInt("color", this.color);
        return tag;
    }

    @Override
    public void handleUpdateTag(CompoundTag tag, HolderLookup.Provider provider) {
        this.color = tag.getInt("color");
    }

    @Nullable
    @Override
    public Packet<ClientGamePacketListener> getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this, (be, provider) -> {
            CompoundTag tag = new CompoundTag();
            tag.putInt("color", this.color);
            return tag;
        });
    }

    @Override
    public void onDataPacket(Connection net, ClientboundBlockEntityDataPacket pkt, HolderLookup.Provider provider) {
        CompoundTag tag = pkt.getTag();
        if (tag != null) {
            this.color = tag.getInt("color");
        }
    }
}
