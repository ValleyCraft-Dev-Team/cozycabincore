package net.linkle.cozy.init;

import static net.linkle.cozy.init.C_Groups.CABIN_GROUP;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.linkle.cozy.block.FloweringVines;
import net.linkle.cozy.block.ModSignBlock;
import net.linkle.cozy.block.ThatchSlab;
import net.linkle.cozy.block.ThatchStairs;
import net.linkle.cozy.block.sapling.RedwoodSaplingGenerator;
import net.linkle.cozy.item.ThatchItem;
import net.linkle.cozy.util.ModSignType;
import net.linkle.cozy.util.Reg;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.DoorBlock;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.HayBlock;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.block.PillarBlock;
import net.minecraft.block.PlantBlock;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.block.PressurePlateBlock.ActivationRule;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.TrapdoorBlock;
import net.minecraft.block.WallSignBlock;
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
    
    public static final Block REDWOOD_WOOD = createLogBlock(MapColor.TERRACOTTA_BLACK, MapColor.TERRACOTTA_BLACK);
    public static final Block REDWOOD_LOG = createLogBlock(MapColor.TERRACOTTA_BROWN, MapColor.TERRACOTTA_BLACK);
    public static final Block STRIPPED_REDWOOD_WOOD = createLogBlock(MapColor.TERRACOTTA_BLACK, MapColor.TERRACOTTA_BLACK);
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
    public static final Block REDWOOD_SIGN = new ModSignBlock(FabricBlockSettings.copy(Blocks.OAK_SIGN).dropsLike(CHARCOAL_BLOCK), ModSignType.REDWOOD);
    public static final Block REDWOOD_WALL_SIGN = new WallSignBlock(Block.Settings.copy(Blocks.OAK_WALL_SIGN).dropsLike(REDWOOD_SIGN), ModSignType.REDWOOD);
    
    public static final Block REDWOOD_LEAVES = new LeavesBlock(Block.Settings.copy(Blocks.OAK_LEAVES));
    public static final Block REDWOOD_SAPLING = new SaplingBlock(new RedwoodSaplingGenerator(), Block.Settings.copy(Blocks.OAK_SAPLING));
    public static final Block SHORT_ROSE_BUSH = new PlantBlock(Block.Settings.copy(Blocks.GRASS));
    public static final Block SHORT_LILAC_BUSH = new PlantBlock(Block.Settings.copy(Blocks.GRASS));
    public static final Block SHORT_PEONY_BUSH = new PlantBlock(Block.Settings.copy(Blocks.GRASS));
    public static final Block REDWOOD_SORREL = new PlantBlock(Block.Settings.copy(Blocks.GRASS));
    public static final Block PUFF_FLOWER = new PlantBlock(Block.Settings.copy(Blocks.GRASS));
    public static final Block WILDFLOWERS = new PlantBlock(Block.Settings.copy(Blocks.GRASS));

    public static final Block ACACIA_CABIN_LOGS = new PillarBlock(Block.Settings.copy(Blocks.ACACIA_LOG));
    public static final Block BIRCH_CABIN_LOGS = new PillarBlock(Block.Settings.copy(Blocks.BIRCH_LOG));
    public static final Block DARK_OAK_CABIN_LOGS = new PillarBlock(Block.Settings.copy(Blocks.DARK_OAK_LOG));
    public static final Block JUNGLE_CABIN_LOGS = new PillarBlock(Block.Settings.copy(Blocks.JUNGLE_LOG));
    public static final Block OAK_CABIN_LOGS = new PillarBlock(Block.Settings.copy(Blocks.OAK_LOG));
    public static final Block SPRUCE_CABIN_LOGS = new PillarBlock(Block.Settings.copy(Blocks.SPRUCE_LOG));
    public static final Block REDWOOD_CABIN_LOGS = new PillarBlock(Block.Settings.copy(REDWOOD_LOG));

    public static final Block ACACIA_BARK_PLANKS = new Block(Block.Settings.copy(Blocks.ACACIA_PLANKS));
    public static final Block BIRCH_BARK_PLANKS = new Block(Block.Settings.copy(Blocks.BIRCH_PLANKS));
    public static final Block DARK_OAK_BARK_PLANKS = new Block(Block.Settings.copy(Blocks.DARK_OAK_PLANKS));
    public static final Block JUNGLE_BARK_PLANKS = new Block(Block.Settings.copy(Blocks.JUNGLE_PLANKS));
    public static final Block OAK_BARK_PLANKS = new Block(Block.Settings.copy(Blocks.OAK_PLANKS));
    public static final Block SPRUCE_BARK_PLANKS = new Block(Block.Settings.copy(Blocks.SPRUCE_PLANKS));
    public static final Block REDWOOD_BARK_PLANKS = new Block(Block.Settings.copy(REDWOOD_PLANKS));

    public static void intialize() {
        Reg.registerWithItem("redwood_wood", REDWOOD_WOOD, itemSettings());
        Reg.registerWithItem("redwood_log", REDWOOD_LOG, itemSettings());
        Reg.registerWithItem("stripped_redwood_wood", STRIPPED_REDWOOD_WOOD, itemSettings());
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
        Reg.register("redwood_sign", REDWOOD_SIGN);
        Reg.register("redwood_wall_sign", REDWOOD_WALL_SIGN);

        Reg.registerWithItem("redwood_leaves", REDWOOD_LEAVES, itemSettings());
        Reg.registerWithItem("redwood_sapling", REDWOOD_SAPLING, itemSettings());
        
        Reg.registerWithItem("acacia_cabin_logs", ACACIA_CABIN_LOGS, itemSettings());
        Reg.registerWithItem("birch_cabin_logs", BIRCH_CABIN_LOGS, itemSettings());
        Reg.registerWithItem("dark_oak_cabin_logs", DARK_OAK_CABIN_LOGS, itemSettings());
        Reg.registerWithItem("jungle_cabin_logs", JUNGLE_CABIN_LOGS, itemSettings());
        Reg.registerWithItem("oak_cabin_logs", OAK_CABIN_LOGS, itemSettings());
        Reg.registerWithItem("spruce_cabin_logs", SPRUCE_CABIN_LOGS, itemSettings());
        Reg.registerWithItem("redwood_cabin_logs", REDWOOD_CABIN_LOGS, itemSettings());

        Reg.registerWithItem("acacia_log_planks", ACACIA_BARK_PLANKS, itemSettings());
        Reg.registerWithItem("birch_log_planks", BIRCH_BARK_PLANKS, itemSettings());
        Reg.registerWithItem("dark_oak_log_planks", DARK_OAK_BARK_PLANKS, itemSettings());
        Reg.registerWithItem("jungle_log_planks", JUNGLE_BARK_PLANKS, itemSettings());
        Reg.registerWithItem("oak_log_planks", OAK_BARK_PLANKS, itemSettings());
        Reg.registerWithItem("spruce_log_planks", SPRUCE_BARK_PLANKS, itemSettings());
        Reg.registerWithItem("redwood_log_planks", REDWOOD_BARK_PLANKS, itemSettings());

        Reg.registerWithItem("charcoal_block", CHARCOAL_BLOCK, itemSettings());

        Reg.registerWithItem("thatch_block", THATCH_BLOCK, itemSettings());
        Reg.registerWithItem("thatch_stairs", THATCH_STAIRS, itemSettings());
        Reg.registerWithItem("thatch_slab", THATCH_SLAB, itemSettings());

        Reg.registerWithItem("redwood_sorrel", REDWOOD_SORREL, itemSettings());
        Reg.registerWithItem("wildflowers", WILDFLOWERS, itemSettings());
        Reg.registerWithItem("puff_flower", PUFF_FLOWER, itemSettings());

        Reg.registerWithItem("short_rose_bush", SHORT_ROSE_BUSH, itemSettings());
        Reg.registerWithItem("short_lilac_bush", SHORT_LILAC_BUSH, itemSettings());
        Reg.registerWithItem("short_peony_bush", SHORT_PEONY_BUSH, itemSettings());

        Reg.registerWithItem("flowering_vines", FLOWERING_VINES, itemSettings());

        Reg.register("cabin_item_group_icon", CABIN_GROUP_ICON);
    }
    
    private static Item.Settings itemSettings() {
    	return new Item.Settings().group(CABIN_GROUP);
    }
    
    private static PillarBlock createLogBlock(MapColor topMapColor, MapColor sideMapColor) {
        return new PillarBlock(AbstractBlock.Settings.of(Material.WOOD, state -> state.get(PillarBlock.AXIS) == Direction.Axis.Y ? topMapColor : sideMapColor).strength(2.0f).sounds(BlockSoundGroup.WOOD));
    }
}
