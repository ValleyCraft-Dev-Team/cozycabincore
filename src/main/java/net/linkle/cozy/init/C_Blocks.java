package net.linkle.cozy.init;

import net.linkle.cozy.util.Reg;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.PillarBlock;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class C_Blocks {
    
    public static final Block AZALEA_OAK_LOG = new PillarBlock(Block.Settings.copy(Blocks.OAK_LOG));
    
    public static void intialize() {
        Reg.registerWithItem("azalea_oak_log", AZALEA_OAK_LOG, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    }
}
