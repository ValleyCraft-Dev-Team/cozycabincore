package net.linkle.cozy.init;

import net.linkle.cozy.util.Reg;
import net.minecraft.block.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

import static net.linkle.cozy.init.C_Groups.CABIN_GROUP;

public class C_Blocks {
    public static final Block CHARCOAL_BLOCK = new Block(Block.Settings.copy(Blocks.COAL_BLOCK));

    public static final Block AZALEA_ACACIA_LOG = new PillarBlock(Block.Settings.copy(Blocks.ACACIA_LOG));
    public static final Block AZALEA_BIRCH_LOG = new PillarBlock(Block.Settings.copy(Blocks.BIRCH_LOG));
    public static final Block AZALEA_DARK_OAK_LOG = new PillarBlock(Block.Settings.copy(Blocks.DARK_OAK_LOG));
    public static final Block AZALEA_JUNGLE_LOG = new PillarBlock(Block.Settings.copy(Blocks.JUNGLE_LOG));
    public static final Block AZALEA_OAK_LOG = new PillarBlock(Block.Settings.copy(Blocks.OAK_LOG));
    public static final Block AZALEA_SPRUCE_LOG = new PillarBlock(Block.Settings.copy(Blocks.SPRUCE_LOG));

    public static final Block GLOW_BERRY_LANTERN = new LanternBlock(Block.Settings.copy(Blocks.LANTERN));
    public static final Block FLOWER_LANTERN = new LanternBlock(Block.Settings.copy(Blocks.LANTERN));
    public static final Block AMETHYST_LANTERN = new LanternBlock(Block.Settings.copy(Blocks.LANTERN));

    public static final Block SHORT_ROSE_BUSH = new PlantBlock(Block.Settings.copy(Blocks.CORNFLOWER));
    public static final Block SHORT_LILAC_BUSH = new PlantBlock(Block.Settings.copy(Blocks.CORNFLOWER));
    public static final Block SHORT_PEONY_BUSH = new PlantBlock(Block.Settings.copy(Blocks.CORNFLOWER));

    public static final Block AZALEA_ACACIA_CABIN_LOGS = new PillarBlock(Block.Settings.copy(Blocks.ACACIA_LOG));
    public static final Block AZALEA_BIRCH_CABIN_LOGS = new PillarBlock(Block.Settings.copy(Blocks.BIRCH_LOG));
    public static final Block AZALEA_DARK_OAK_CABIN_LOGS = new PillarBlock(Block.Settings.copy(Blocks.DARK_OAK_LOG));
    public static final Block AZALEA_JUNGLE_CABIN_LOGS = new PillarBlock(Block.Settings.copy(Blocks.JUNGLE_LOG));
    public static final Block AZALEA_OAK_CABIN_LOGS = new PillarBlock(Block.Settings.copy(Blocks.OAK_LOG));
    public static final Block AZALEA_SPRUCE_CABIN_LOGS = new PillarBlock(Block.Settings.copy(Blocks.SPRUCE_LOG));

    public static final Block ACACIA_CABIN_LOGS = new PillarBlock(Block.Settings.copy(Blocks.ACACIA_LOG));
    public static final Block BIRCH_CABIN_LOGS = new PillarBlock(Block.Settings.copy(Blocks.BIRCH_LOG));
    public static final Block DARK_OAK_CABIN_LOGS = new PillarBlock(Block.Settings.copy(Blocks.DARK_OAK_LOG));
    public static final Block JUNGLE_CABIN_LOGS = new PillarBlock(Block.Settings.copy(Blocks.JUNGLE_LOG));
    public static final Block OAK_CABIN_LOGS = new PillarBlock(Block.Settings.copy(Blocks.OAK_LOG));
    public static final Block SPRUCE_CABIN_LOGS = new PillarBlock(Block.Settings.copy(Blocks.SPRUCE_LOG));

    public static final Block AZALEA_ACACIA_DOOR = new DoorBlock(Block.Settings.copy(Blocks.OAK_DOOR));
    public static final Block AZALEA_BIRCH_DOOR = new DoorBlock(Block.Settings.copy(Blocks.BIRCH_DOOR));
    public static final Block AZALEA_DARK_OAK_DOOR = new DoorBlock(Block.Settings.copy(Blocks.DARK_OAK_DOOR));
    public static final Block AZALEA_JUNGLE_DOOR = new DoorBlock(Block.Settings.copy(Blocks.JUNGLE_DOOR));
    public static final Block AZALEA_OAK_DOOR = new DoorBlock(Block.Settings.copy(Blocks.OAK_DOOR));
    public static final Block AZALEA_SPRUCE_DOOR = new DoorBlock(Block.Settings.copy(Blocks.SPRUCE_DOOR));

    public static final Block AZALEA_ACACIA_PLANKS = new Block(Block.Settings.copy(Blocks.ACACIA_PLANKS));
    public static final Block AZALEA_BIRCH_PLANKS = new Block(Block.Settings.copy(Blocks.BIRCH_PLANKS));
    public static final Block AZALEA_DARK_OAK_PLANKS = new Block(Block.Settings.copy(Blocks.DARK_OAK_PLANKS));
    public static final Block AZALEA_JUNGLE_PLANKS = new Block(Block.Settings.copy(Blocks.JUNGLE_PLANKS));
    public static final Block AZALEA_OAK_PLANKS = new Block(Block.Settings.copy(Blocks.OAK_PLANKS));
    public static final Block AZALEA_SPRUCE_PLANKS = new Block(Block.Settings.copy(Blocks.SPRUCE_PLANKS));

    public static void intialize() {
        Reg.registerWithItem("acacia_cabin_logs", ACACIA_CABIN_LOGS, new Item.Settings().group(CABIN_GROUP));
        Reg.registerWithItem("birch_cabin_logs", BIRCH_CABIN_LOGS, new Item.Settings().group(CABIN_GROUP));
        Reg.registerWithItem("dark_oak_cabin_logs", DARK_OAK_CABIN_LOGS, new Item.Settings().group(CABIN_GROUP));
        Reg.registerWithItem("jungle_cabin_logs", JUNGLE_CABIN_LOGS, new Item.Settings().group(CABIN_GROUP));
        Reg.registerWithItem("oak_cabin_logs", OAK_CABIN_LOGS, new Item.Settings().group(CABIN_GROUP));
        Reg.registerWithItem("spruce_cabin_logs", SPRUCE_CABIN_LOGS, new Item.Settings().group(CABIN_GROUP));

        Reg.registerWithItem("azalea_acacia_log", AZALEA_ACACIA_LOG, new Item.Settings().group(CABIN_GROUP));
        Reg.registerWithItem("azalea_birch_log", AZALEA_BIRCH_LOG, new Item.Settings().group(CABIN_GROUP));
        Reg.registerWithItem("azalea_dark_oak_log", AZALEA_DARK_OAK_LOG, new Item.Settings().group(CABIN_GROUP));
        Reg.registerWithItem("azalea_jungle_log", AZALEA_JUNGLE_LOG, new Item.Settings().group(CABIN_GROUP));
        Reg.registerWithItem("azalea_oak_log", AZALEA_OAK_LOG, new Item.Settings().group(CABIN_GROUP));
        Reg.registerWithItem("azalea_spruce_log", AZALEA_SPRUCE_LOG, new Item.Settings().group(CABIN_GROUP));

        Reg.registerWithItem("azalea_acacia_planks", AZALEA_ACACIA_PLANKS, new Item.Settings().group(CABIN_GROUP));
        Reg.registerWithItem("azalea_birch_planks", AZALEA_BIRCH_PLANKS, new Item.Settings().group(CABIN_GROUP));
        Reg.registerWithItem("azalea_dark_oak_planks", AZALEA_DARK_OAK_PLANKS, new Item.Settings().group(CABIN_GROUP));
        Reg.registerWithItem("azalea_jungle_planks", AZALEA_JUNGLE_PLANKS, new Item.Settings().group(CABIN_GROUP));
        Reg.registerWithItem("azalea_oak_planks", AZALEA_OAK_PLANKS, new Item.Settings().group(CABIN_GROUP));
        Reg.registerWithItem("azalea_spruce_planks", AZALEA_SPRUCE_PLANKS, new Item.Settings().group(CABIN_GROUP));

        Reg.registerWithItem("azalea_acacia_cabin_logs", AZALEA_ACACIA_CABIN_LOGS, new Item.Settings().group(CABIN_GROUP));
        Reg.registerWithItem("azalea_birch_cabin_logs", AZALEA_BIRCH_CABIN_LOGS, new Item.Settings().group(CABIN_GROUP));
        Reg.registerWithItem("azalea_dark_oak_cabin_logs", AZALEA_DARK_OAK_CABIN_LOGS, new Item.Settings().group(CABIN_GROUP));
        Reg.registerWithItem("azalea_jungle_cabin_logs", AZALEA_JUNGLE_CABIN_LOGS, new Item.Settings().group(CABIN_GROUP));
        Reg.registerWithItem("azalea_oak_cabin_logs", AZALEA_OAK_CABIN_LOGS, new Item.Settings().group(CABIN_GROUP));
        Reg.registerWithItem("azalea_spruce_cabin_logs", AZALEA_SPRUCE_CABIN_LOGS, new Item.Settings().group(CABIN_GROUP));

        Reg.registerWithItem("azalea_acacia_door", AZALEA_ACACIA_DOOR, new Item.Settings().group(CABIN_GROUP));
        Reg.registerWithItem("azalea_birch_door", AZALEA_BIRCH_DOOR, new Item.Settings().group(CABIN_GROUP));
        Reg.registerWithItem("azalea_dark_oak_door", AZALEA_DARK_OAK_DOOR, new Item.Settings().group(CABIN_GROUP));
        Reg.registerWithItem("azalea_jungle_door", AZALEA_JUNGLE_DOOR, new Item.Settings().group(CABIN_GROUP));
        Reg.registerWithItem("azalea_oak_door", AZALEA_OAK_DOOR, new Item.Settings().group(CABIN_GROUP));
        Reg.registerWithItem("azalea_spruce_door", AZALEA_SPRUCE_DOOR, new Item.Settings().group(CABIN_GROUP));

        Reg.registerWithItem("glow_berry_lantern", GLOW_BERRY_LANTERN, new Item.Settings().group(CABIN_GROUP));
        Reg.registerWithItem("flower_lantern", FLOWER_LANTERN, new Item.Settings().group(CABIN_GROUP));
        Reg.registerWithItem("amethyst_lantern", AMETHYST_LANTERN, new Item.Settings().group(CABIN_GROUP));

        Reg.registerWithItem("charcoal_block", CHARCOAL_BLOCK, new Item.Settings().group(CABIN_GROUP));

        Reg.registerWithItem("short_rose_bush", SHORT_ROSE_BUSH, new Item.Settings().group(CABIN_GROUP));
        Reg.registerWithItem("short_lilac_bush", SHORT_LILAC_BUSH, new Item.Settings().group(CABIN_GROUP));
        Reg.registerWithItem("short_peony_bush", SHORT_PEONY_BUSH, new Item.Settings().group(CABIN_GROUP));
    }
}
