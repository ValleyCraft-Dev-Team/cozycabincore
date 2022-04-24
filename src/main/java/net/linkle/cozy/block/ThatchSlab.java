package net.linkle.cozy.block;

import net.minecraft.block.Material;
import net.minecraft.block.SlabBlock;
import net.minecraft.sound.BlockSoundGroup;

public class ThatchSlab extends SlabBlock {
    public ThatchSlab() {
        super(Settings.of(Material.PLANT)
                .sounds(BlockSoundGroup.GRASS)
                .strength(0.5f, 2));
    }
}
