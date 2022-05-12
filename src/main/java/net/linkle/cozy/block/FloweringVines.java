package net.linkle.cozy.block;

import java.util.Random;

import net.minecraft.block.BlockState;
import net.minecraft.block.GlowLichenBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class FloweringVines extends GlowLichenBlock {

    public FloweringVines() {
        super(Settings.of(Material.PLANT, MapColor.DARK_GREEN).noCollision().strength(0.2f).sounds(BlockSoundGroup.GLOW_LICHEN));
    }

    @Override
    public boolean canReplace(BlockState state, ItemPlacementContext context) {
        return !context.getStack().isOf(this.asItem()) || super.canReplace(state, context);
    }
}
