package net.linkle.cozy.init;

import static net.linkle.cozy.init.C_Groups.CABIN_GROUP;

import net.linkle.cozy.block.FloweringVines;
import net.linkle.cozy.block.ThatchSlab;
import net.linkle.cozy.block.ThatchStairs;
import net.linkle.cozy.item.ThatchItem;
import net.linkle.cozy.util.Reg;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.DoorBlock;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.HayBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.block.PillarBlock;
import net.minecraft.block.PlantBlock;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.block.PressurePlateBlock.ActivationRule;
import net.minecraft.block.SignBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.TrapdoorBlock;
import net.minecraft.block.WoodenButtonBlock;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.Direction;

public class C_Blocks {
    public static final Block THATCH_BLOCK = new HayBlock(Block.Settings.copy(Blocks.HAY_BLOCK));
    public static final Block THATCH_STAIRS = new ThatchStairs();
    public static final Block THATCH_SLAB = new ThatchSlab();

    public static final Item CABIN_GROUP_ICON = new ThatchItem(new Item.Settings());

    public static final Block CHARCOAL_BLOCK = new Block(Block.Settings.copy(Blocks.COAL_BLOCK));
    
    public static final Block FLOWERING_VINES = new FloweringVines();

    //private static final Block.Settings LANTERN = Block.Settings.of(new Material.Builder(MapColor.OAK_TAN).build()).sounds(BlockSoundGroup.WOOD).strength(2.5f).luminance(state -> 15).nonOpaque();
    //public static final Block GLOW_BERRY_LANTERN = new LanternBlock(LANTERN);
    //public static final Block FLOWER_LANTERN = new LanternBlock(LANTERN);
    //public static final Block AMETHYST_LANTERN = new LanternBlock(LANTERN);
    
    //public static final Block REDWOOD_WOOD = createLogBlock(MapColor.TERRACOTTA_BLACK, MapColor.TERRACOTTA_BLACK);
    public static final Block REDWOOD_LOG = createLogBlock(MapColor.TERRACOTTA_BROWN, MapColor.TERRACOTTA_BLACK);
    //public static final Block STRIPPED_REDWOOD_WOOD = createLogBlock(MapColor.TERRACOTTA_BLACK, MapColor.TERRACOTTA_BLACK);
    public static final Block STRIPPED_REDWOOD_LOG = createLogBlock(MapColor.TERRACOTTA_BROWN, MapColor.TERRACOTTA_BROWN);
    public static final Block REDWOOD_PLANKS = new Block(Block.Settings.of(Material.WOOD, MapColor.TERRACOTTA_BROWN).strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD));
    public static final Block REDWOOD_DOOR = new DoorBlock(Block.Settings.copy(Blocks.OAK_DOOR).mapColor(MapColor.TERRACOTTA_BROWN));
    public static final Block REDWOOD_TRAPDOOR = new TrapdoorBlock(Block.Settings.copy(Blocks.OAK_TRAPDOOR).mapColor(MapColor.TERRACOTTA_BROWN));
    public static final Block REDWOOD_SLAB = new SlabBlock(Block.Settings.copy(Blocks.OAK_SLAB).mapColor(MapColor.TERRACOTTA_BROWN));
    public static final Block REDWOOD_STAIRS = new StairsBlock(REDWOOD_PLANKS.getDefaultState(), Block.Settings.copy(Blocks.OAK_STAIRS).mapColor(MapColor.TERRACOTTA_BROWN));
    public static final Block REDWOOD_BUTTON = new WoodenButtonBlock(Block.Settings.copy(Blocks.OAK_BUTTON));
    public static final Block REDWOOD_FENCE = new FenceBlock(Block.Settings.copy(Blocks.OAK_FENCE).mapColor(MapColor.TERRACOTTA_BROWN));
    public static final Block REDWOOD_FENCE_GATE = new FenceGateBlock(Block.Settings.copy(Blocks.OAK_FENCE_GATE).mapColor(MapColor.TERRACOTTA_BROWN));
    public static final Block REDWOOD_PRESSURE_PLATE = new PressurePlateBlock(ActivationRule.EVERYTHING, Block.Settings.copy(Blocks.OAK_PRESSURE_PLATE).mapColor(MapColor.TERRACOTTA_BROWN));
    
    public static final Block SHORT_ROSE_BUSH = new PlantBlock(Block.Settings.copy(Blocks.CORNFLOWER));
    public static final Block SHORT_LILAC_BUSH = new PlantBlock(Block.Settings.copy(Blocks.CORNFLOWER));
    public static final Block SHORT_PEONY_BUSH = new PlantBlock(Block.Settings.copy(Blocks.CORNFLOWER));

    public static final Block ACACIA_CABIN_LOGS = new PillarBlock(Block.Settings.copy(Blocks.ACACIA_LOG));
    public static final Block BIRCH_CABIN_LOGS = new PillarBlock(Block.Settings.copy(Blocks.BIRCH_LOG));
    public static final Block DARK_OAK_CABIN_LOGS = new PillarBlock(Block.Settings.copy(Blocks.DARK_OAK_LOG));
    public static final Block JUNGLE_CABIN_LOGS = new PillarBlock(Block.Settings.copy(Blocks.JUNGLE_LOG));
    public static final Block OAK_CABIN_LOGS = new PillarBlock(Block.Settings.copy(Blocks.OAK_LOG));
    public static final Block SPRUCE_CABIN_LOGS = new PillarBlock(Block.Settings.copy(Blocks.SPRUCE_LOG));
    public static final Block REDWOOD_CABIN_LOGS = new PillarBlock(Block.Settings.copy(Blocks.OAK_LOG));

    public static final Block AZALEA_ACACIA_DOOR = new DoorBlock(Block.Settings.copy(Blocks.ACACIA_DOOR));
    public static final Block AZALEA_BIRCH_DOOR = new DoorBlock(Block.Settings.copy(Blocks.BIRCH_DOOR));
    public static final Block AZALEA_DARK_OAK_DOOR = new DoorBlock(Block.Settings.copy(Blocks.DARK_OAK_DOOR));
    public static final Block AZALEA_JUNGLE_DOOR = new DoorBlock(Block.Settings.copy(Blocks.JUNGLE_DOOR));
    public static final Block AZALEA_OAK_DOOR = new DoorBlock(Block.Settings.copy(Blocks.OAK_DOOR));
    public static final Block AZALEA_SPRUCE_DOOR = new DoorBlock(Block.Settings.copy(Blocks.SPRUCE_DOOR));

    public static void intialize() {
        Reg.registerWithItem("thatch_block", THATCH_BLOCK, itemSettings());
        Reg.registerWithItem("thatch_stairs", THATCH_STAIRS, itemSettings());
        Reg.registerWithItem("thatch_slab", THATCH_SLAB, itemSettings());
        
        //Reg.registerWithItem("redwood_wood", REDWOOD_WOOD, itemSettings());
        Reg.registerWithItem("redwood_log", REDWOOD_LOG, itemSettings());
        //Reg.registerWithItem("stripped_redwood_wood", STRIPPED_REDWOOD_WOOD, itemSettings());
        Reg.registerWithItem("stripped_redwood_log", STRIPPED_REDWOOD_LOG, itemSettings());
        Reg.registerWithItem("redwood_planks", REDWOOD_PLANKS, itemSettings());
        Reg.registerWithItem("redwood_door", REDWOOD_DOOR, itemSettings());
        Reg.registerWithItem("redwood_trapdoor", REDWOOD_TRAPDOOR, itemSettings());
        Reg.registerWithItem("redwood_slab", REDWOOD_SLAB, itemSettings());
        Reg.registerWithItem("redwood_stairs", REDWOOD_STAIRS, itemSettings());
        Reg.registerWithItem("redwood_button", REDWOOD_BUTTON, itemSettings());
        Reg.registerWithItem("redwood_fence", REDWOOD_FENCE, itemSettings());
        Reg.registerWithItem("redwood_fence_gate", REDWOOD_FENCE_GATE, itemSettings());
        Reg.registerWithItem("redwood_pressure_plate", REDWOOD_PRESSURE_PLATE, itemSettings());

        Reg.registerWithItem("acacia_cabin_logs", ACACIA_CABIN_LOGS, itemSettings());
        Reg.registerWithItem("birch_cabin_logs", BIRCH_CABIN_LOGS, itemSettings());
        Reg.registerWithItem("dark_oak_cabin_logs", DARK_OAK_CABIN_LOGS, itemSettings());
        Reg.registerWithItem("jungle_cabin_logs", JUNGLE_CABIN_LOGS, itemSettings());
        Reg.registerWithItem("oak_cabin_logs", OAK_CABIN_LOGS, itemSettings());
        Reg.registerWithItem("spruce_cabin_logs", SPRUCE_CABIN_LOGS, itemSettings());
        Reg.registerWithItem("redwood_cabin_logs", REDWOOD_CABIN_LOGS, itemSettings());

        Reg.registerWithItem("azalea_acacia_door", AZALEA_ACACIA_DOOR, itemSettings());
        Reg.registerWithItem("azalea_birch_door", AZALEA_BIRCH_DOOR, itemSettings());
        Reg.registerWithItem("azalea_dark_oak_door", AZALEA_DARK_OAK_DOOR, itemSettings());
        Reg.registerWithItem("azalea_jungle_door", AZALEA_JUNGLE_DOOR, itemSettings());
        Reg.registerWithItem("azalea_oak_door", AZALEA_OAK_DOOR, itemSettings());
        Reg.registerWithItem("azalea_spruce_door", AZALEA_SPRUCE_DOOR, itemSettings());

        //Reg.registerWithItem("glow_berry_lantern", GLOW_BERRY_LANTERN, new Item.Settings().group(CABIN_GROUP));
        //Reg.registerWithItem("flower_lantern", FLOWER_LANTERN, new Item.Settings().group(CABIN_GROUP));
        //Reg.registerWithItem("amethyst_lantern", AMETHYST_LANTERN, new Item.Settings().group(CABIN_GROUP));
        
        Reg.registerWithItem("flowering_vines", FLOWERING_VINES, itemSettings());

        Reg.registerWithItem("charcoal_block", CHARCOAL_BLOCK, itemSettings());

        Reg.registerWithItem("short_rose_bush", SHORT_ROSE_BUSH, itemSettings());
        Reg.registerWithItem("short_lilac_bush", SHORT_LILAC_BUSH, itemSettings());
        Reg.registerWithItem("short_peony_bush", SHORT_PEONY_BUSH, itemSettings());

        Reg.register("cabin_item_group_icon", CABIN_GROUP_ICON);
    }
    
    private static Item.Settings itemSettings() {
    	return new Item.Settings().group(CABIN_GROUP);
    }
    
    private static PillarBlock createLogBlock(MapColor topMapColor, MapColor sideMapColor) {
        return new PillarBlock(AbstractBlock.Settings.of(Material.WOOD, state -> state.get(PillarBlock.AXIS) == Direction.Axis.Y ? topMapColor : sideMapColor).strength(2.0f).sounds(BlockSoundGroup.WOOD));
    }
}
