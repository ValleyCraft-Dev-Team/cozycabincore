package net.linkle.cozy.init.features;

import java.util.List;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.linkle.cozy.gen.feature.TreeConfigFeatures;
import net.linkle.cozy.init.C_Blocks;
import net.linkle.cozy.util.Reg;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import net.minecraft.world.gen.placementmodifier.RarityFilterPlacementModifier;

public class OverworldFeatures {
    
    
    
    public static void intialize() {
        RegistryEntry<PlacedFeature> placed;
        List<PlacementModifier> list;
        var vegetal = GenerationStep.Feature.VEGETAL_DECORATION;
        
        list = VegetationPlacedFeatures.modifiersWithWouldSurvive(RarityFilterPlacementModifier.of(2), C_Blocks.REDWOOD_SAPLING);
        placed = Reg.register("redwood_placed", TreeConfigFeatures.MEGA_REDWOOD, list);
        
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.OLD_GROWTH_PINE_TAIGA, BiomeKeys.OLD_GROWTH_SPRUCE_TAIGA), vegetal, placed.getKey().get());
    }
}
