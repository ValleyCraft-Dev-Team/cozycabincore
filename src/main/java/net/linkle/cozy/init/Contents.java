package net.linkle.cozy.init;

import static net.linkle.cozy.init.C_Blocks.*;

import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.ItemConvertible;

public class Contents {
    public static void initialize() {
        compost();
        flammable();
        fuels();
    }
    
    @SuppressWarnings("unused")
    private static void compost() {
        Float levelLow = 0.3f; // leaves, seeds, saplings, grass.
        Float levelMed = 0.5f; // double plant, vines.
        Float levelHigh = 0.65f; // foods, flowers.
        Float levelVery = 0.85f; // blocks.
        Float levelUltra = 1.0f; // specialties.
        
        putCompost(SHORT_ROSE_BUSH, levelLow);
        putCompost(SHORT_LILAC_BUSH, levelLow);
        putCompost(SHORT_PEONY_BUSH, levelLow);
        putCompost(THATCH_SLAB, levelMed);
        putCompost(THATCH_BLOCK, levelHigh);
        putCompost(THATCH_STAIRS, levelHigh);
    }
    
    private static void flammable() {
        putFlammable(AZALEA_ACACIA_PLANKS, 5, 20);
        putFlammable(AZALEA_BIRCH_PLANKS, 5, 20);
        putFlammable(AZALEA_DARK_OAK_PLANKS, 5, 20);
        putFlammable(AZALEA_JUNGLE_PLANKS, 5, 20);
        putFlammable(AZALEA_OAK_PLANKS, 5, 20);
        putFlammable(AZALEA_SPRUCE_PLANKS, 5, 20);
        
        putFlammable(AZALEA_ACACIA_LOG, 5, 5);
        putFlammable(AZALEA_BIRCH_LOG, 5, 5);
        putFlammable(AZALEA_DARK_OAK_LOG, 5, 5);
        putFlammable(AZALEA_JUNGLE_LOG, 5, 5);
        putFlammable(AZALEA_OAK_LOG, 5, 5);
        putFlammable(AZALEA_SPRUCE_LOG, 5, 5);
        
        putFlammable(AZALEA_ACACIA_CABIN_LOGS, 5, 5);
        putFlammable(AZALEA_BIRCH_CABIN_LOGS, 5, 5);
        putFlammable(AZALEA_DARK_OAK_CABIN_LOGS, 5, 5);
        putFlammable(AZALEA_JUNGLE_CABIN_LOGS, 5, 5);
        putFlammable(AZALEA_OAK_CABIN_LOGS, 5, 5);
        putFlammable(AZALEA_SPRUCE_CABIN_LOGS, 5, 5);
        
        putFlammable(ACACIA_CABIN_LOGS, 5, 5);
        putFlammable(BIRCH_CABIN_LOGS, 5, 5);
        putFlammable(DARK_OAK_CABIN_LOGS, 5, 5);
        putFlammable(JUNGLE_CABIN_LOGS, 5, 5);
        putFlammable(OAK_CABIN_LOGS, 5, 5);
        putFlammable(SPRUCE_CABIN_LOGS, 5, 5);
        
        putFlammable(THATCH_BLOCK, 60, 20);
        putFlammable(THATCH_STAIRS, 60, 20);
        putFlammable(THATCH_SLAB, 60, 20);
        
        putFlammable(GLOW_BERRY_LANTERN, 5, 10);
        putFlammable(FLOWER_LANTERN, 5, 10);
        putFlammable(AMETHYST_LANTERN, 5, 10);
        
        putFlammable(SHORT_ROSE_BUSH, 60, 100);
        putFlammable(SHORT_LILAC_BUSH, 60, 100);
        putFlammable(SHORT_PEONY_BUSH, 60, 100);
        
        putFlammable(CHARCOAL_BLOCK, 5, 5);
    }
    
    private static void fuels() {
        putFuels(CHARCOAL_BLOCK, 16000);
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
}
