package net.linkle.cozy.block;

import net.linkle.cozy.init.C_Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.StairsBlock;
import net.minecraft.sound.BlockSoundGroup;

public class ThatchStairs extends StairsBlock {
    public ThatchStairs() {
        super(C_Blocks.THATCH_BLOCK.getDefaultState(), Settings.of(Material.PLANT)
                .sounds(BlockSoundGroup.GRASS)
                .strength(0.5f, 2));
    }
}