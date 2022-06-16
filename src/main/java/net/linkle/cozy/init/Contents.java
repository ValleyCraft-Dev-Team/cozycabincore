package net.linkle.cozy.init;

import static net.linkle.cozy.init.ModBlocks.*;
import static net.linkle.cozy.tag.ModItemTags.*;

import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.tag.TagKey;

public class Contents {
    public static void initialize() {
        compost();
        flammable();
        fuels();
        strips();
    }
    
    private static void strips() {
        putStrip(REDWOOD_LOG, STRIPPED_REDWOOD_LOG);
        putStrip(REDWOOD_WOOD, STRIPPED_REDWOOD_WOOD);
    }

    @SuppressWarnings("unused")
    private static void compost() {
        Float levelLow = 0.3f; // leaves, seeds, saplings, grass.
        Float levelMed = 0.5f; // double plant, vines.
        Float levelHigh = 0.65f; // foods, flowers.
        Float levelVery = 0.85f; // blocks.
        Float levelUltra = 1.0f; // specials.
        
        putCompost(REDWOOD_LEAVES, levelLow);
        putCompost(REDWOOD_SAPLING, levelLow);
        
        putCompost(FLOWERING_VINES, levelMed);
        putCompost(THATCH_SLAB, levelMed);
        putCompost(SHORT_ROSE_BUSH, levelMed);
        putCompost(SHORT_LILAC_BUSH, levelMed);
        putCompost(SHORT_PEONY_BUSH, levelMed);
        
        putCompost(THATCH_BLOCK, levelHigh);
        putCompost(THATCH_STAIRS, levelHigh);
        putCompost(REDWOOD_SORREL, levelHigh);
        putCompost(PUFF_FLOWER, levelHigh);
        putCompost(WILDFLOWERS, levelHigh);
        //putCompost(LEATHERY_POLYPODY, levelHigh);
    }
    
    private static void flammable() {     
        putFlammable(REDWOOD_LOG, 5, 5);
        putFlammable(REDWOOD_WOOD, 5, 5);
        putFlammable(STRIPPED_REDWOOD_LOG, 5, 5);
        putFlammable(STRIPPED_REDWOOD_WOOD, 5, 5);
        putFlammable(REDWOOD_PLANKS, 5, 20);
        putFlammable(REDWOOD_SLAB, 5, 20);
        putFlammable(REDWOOD_STAIRS, 5, 20);
        putFlammable(REDWOOD_FENCE, 5, 20);
        putFlammable(REDWOOD_FENCE_GATE, 5, 20);
        putFlammable(ACACIA_CABIN_LOGS, 5, 5);
        putFlammable(BIRCH_CABIN_LOGS, 5, 5);
        putFlammable(DARK_OAK_CABIN_LOGS, 5, 5);
        putFlammable(JUNGLE_CABIN_LOGS, 5, 5);
        putFlammable(OAK_CABIN_LOGS, 5, 5);
        putFlammable(SPRUCE_CABIN_LOGS, 5, 5);
        putFlammable(REDWOOD_CABIN_LOGS, 5, 5);
        putFlammable(ACACIA_BARK_PLANKS, 5, 10);
        putFlammable(BIRCH_BARK_PLANKS, 5, 10);
        putFlammable(DARK_OAK_BARK_PLANKS, 5, 10);
        putFlammable(JUNGLE_BARK_PLANKS, 5, 10);
        putFlammable(OAK_BARK_PLANKS, 5, 10);
        putFlammable(SPRUCE_BARK_PLANKS, 5, 10);
        putFlammable(REDWOOD_BARK_PLANKS, 5, 10);
        
        putFlammable(REDWOOD_LEAVES, 30, 60);
        
        putFlammable(THATCH_BLOCK, 60, 20);
        putFlammable(THATCH_STAIRS, 60, 20);
        putFlammable(THATCH_SLAB, 60, 20);
        
        putFlammable(GLOW_BERRY_LANTERN, 5, 10);
        putFlammable(FLOWER_LANTERN, 5, 10);
        //putFlammable(AMETHYST_LANTERN, 5, 10);
        
        putFlammable(SHORT_ROSE_BUSH, 60, 100);
        putFlammable(SHORT_LILAC_BUSH, 60, 100);
        putFlammable(SHORT_PEONY_BUSH, 60, 100);
        
        putFlammable(CHARCOAL_BLOCK, 5, 5);
        putFlammable(FLOWERING_VINES, 15, 100);
    }
    
    private static void fuels() {
        putFuels(CHARCOAL_BLOCK, 16000);
    }
    
    private static void putStrip(Block input, Block stripped) {
        StrippableBlockRegistry.register(input, stripped);
    }
    
    private static void putCompost(ItemConvertible item, Float chance) {
        CompostingChanceRegistry.INSTANCE.add(item, chance);
    }
    
    private static void putFlammable(Block block, int burn, int spread) {
        FlammableBlockRegistry.getDefaultInstance().add(block, burn, spread);;
    }
    
    private static void putFuels(ItemConvertible item, Integer tick) {
        FuelRegistry.INSTANCE.add(item, tick);
    }
    
    private static void putFuels(TagKey<Item> tag, Integer tick) {
        FuelRegistry.INSTANCE.add(tag, tick);
    }
}
