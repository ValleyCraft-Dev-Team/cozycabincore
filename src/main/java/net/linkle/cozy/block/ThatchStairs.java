package net.linkle.cozy.block;

import net.linkle.cozy.init.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.StairsBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ThatchStairs extends StairsBlock {
    public ThatchStairs() {
        super(ModBlocks.THATCH_BLOCK.getDefaultState(), 
                Settings.of(Material.WOOD)
                .sounds(BlockSoundGroup.GRASS)
                .strength(0.5f));
    }
    
    @Override
    public void onLandedUpon(World world, BlockState state, BlockPos pos, Entity entity, float fallDistance) {
        entity.handleFallDamage(fallDistance, 0.2f, DamageSource.FALL);
    }
}