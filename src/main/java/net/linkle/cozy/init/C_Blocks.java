package net.linkle.cozy.init;

import net.linkle.cozy.util.Reg;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.PillarBlock;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class C_Blocks {
    public static final Block CHARCOAL_BLOCK = new Block(Block.Settings.copy(Blocks.COAL_BLOCK));

    public static final Block AZALEA_ACACIA_LOG = new PillarBlock(Block.Settings.copy(Blocks.OAK_LOG));
    public static final Block AZALEA_BIRCH_LOG = new PillarBlock(Block.Settings.copy(Blocks.OAK_LOG));
    public static final Block AZALEA_DARK_OAK_LOG = new PillarBlock(Block.Settings.copy(Blocks.OAK_LOG));
    public static final Block AZALEA_JUNGLE_LOG = new PillarBlock(Block.Settings.copy(Blocks.OAK_LOG));
    public static final Block AZALEA_OAK_LOG = new PillarBlock(Block.Settings.copy(Blocks.OAK_LOG));
    public static final Block AZALEA_SPRUCE_LOG = new PillarBlock(Block.Settings.copy(Blocks.OAK_LOG));

    public static void intialize() {
        Reg.registerWithItem("charcoal_block", CHARCOAL_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

        Reg.registerWithItem("acacia_cabin_logs", AZALEA_ACACIA_LOG, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
        Reg.registerWithItem("birch_cabin_logs", AZALEA_BIRCH_LOG, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
        Reg.registerWithItem("dark_oak_cabin_logs", AZALEA_DARK_OAK_LOG, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
        Reg.registerWithItem("jungle_cabin_logs", AZALEA_JUNGLE_LOG, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
        Reg.registerWithItem("oak_cabin_logs", AZALEA_OAK_LOG, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
        Reg.registerWithItem("spruce_cabin_logs", AZALEA_SPRUCE_LOG, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

        Reg.registerWithItem("azalea_acacia_log", AZALEA_ACACIA_LOG, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
        Reg.registerWithItem("azalea_birch_log", AZALEA_BIRCH_LOG, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
        Reg.registerWithItem("azalea_dark_oak_log", AZALEA_DARK_OAK_LOG, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
        Reg.registerWithItem("azalea_jungle_log", AZALEA_JUNGLE_LOG, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
        Reg.registerWithItem("azalea_oak_log", AZALEA_OAK_LOG, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
        Reg.registerWithItem("azalea_spruce_log", AZALEA_SPRUCE_LOG, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

        Reg.registerWithItem("azalea_acacia_planks", AZALEA_ACACIA_LOG, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
        Reg.registerWithItem("azalea_birch_planks", AZALEA_BIRCH_LOG, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
        Reg.registerWithItem("azalea_dark_oak_planks", AZALEA_DARK_OAK_LOG, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
        Reg.registerWithItem("azalea_jungle_planks", AZALEA_JUNGLE_LOG, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
        Reg.registerWithItem("azalea_oak_planks", AZALEA_OAK_LOG, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
        Reg.registerWithItem("azalea_spruce_planks", AZALEA_SPRUCE_LOG, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

        Reg.registerWithItem("azalea_acacia_cabin_logs", AZALEA_ACACIA_LOG, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
        Reg.registerWithItem("azalea_birch_cabin_logs", AZALEA_BIRCH_LOG, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
        Reg.registerWithItem("azalea_dark_oak_cabin_logs", AZALEA_DARK_OAK_LOG, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
        Reg.registerWithItem("azalea_jungle_cabin_logs", AZALEA_JUNGLE_LOG, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
        Reg.registerWithItem("azalea_oak_cabin_logs", AZALEA_OAK_LOG, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
        Reg.registerWithItem("azalea_spruce_cabin_logs", AZALEA_SPRUCE_LOG, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

        Reg.registerWithItem("azalea_acacia_door", AZALEA_ACACIA_LOG, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
        Reg.registerWithItem("azalea_birch_door", AZALEA_BIRCH_LOG, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
        Reg.registerWithItem("azalea_dark_oak_door", AZALEA_DARK_OAK_LOG, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
        Reg.registerWithItem("azalea_jungle_door", AZALEA_JUNGLE_LOG, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
        Reg.registerWithItem("azalea_oak_door", AZALEA_OAK_LOG, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
        Reg.registerWithItem("azalea_spruce_door", AZALEA_SPRUCE_LOG, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    }
}
