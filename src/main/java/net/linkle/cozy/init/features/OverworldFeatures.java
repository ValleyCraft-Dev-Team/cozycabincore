package net.linkle.cozy.init.features;

import java.util.List;
import java.util.stream.Stream;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.linkle.cozy.gen.feature.TreeConfigFeatures;
import net.linkle.cozy.init.ModBlocks;
import net.linkle.cozy.util.Reg;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.collection.DataPool;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.biome.Biome.Category;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.blockpredicate.BlockPredicate;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.ConfiguredFeatures;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.SimpleBlockFeatureConfig;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;
import net.minecraft.world.gen.placementmodifier.BiomePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import net.minecraft.world.gen.placementmodifier.RarityFilterPlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider;

public class OverworldFeatures {
    
    public static void initialize() {
        RegistryEntry<PlacedFeature> placed;
        RegistryEntry<ConfiguredFeature<?, ?>> config;
        List<PlacementModifier> list;
        var vegetal = GenerationStep.Feature.VEGETAL_DECORATION;
        var oldGrowthTaiga = BiomeSelectors.includeByKey(BiomeKeys.OLD_GROWTH_PINE_TAIGA, BiomeKeys.OLD_GROWTH_SPRUCE_TAIGA);
        var birchForest = BiomeSelectors.includeByKey(BiomeKeys.OLD_GROWTH_BIRCH_FOREST, BiomeKeys.BIRCH_FOREST);
        
        // Redwood tree
        list = VegetationPlacedFeatures.modifiersWithWouldSurvive(RarityFilterPlacementModifier.of(1), ModBlocks.REDWOOD_SAPLING);
        placed = Reg.register("redwood_placed", TreeConfigFeatures.MEGA_REDWOOD, list);
        BiomeModifications.addFeature(oldGrowthTaiga, vegetal, placed.getKey().get());
        
        placed = registerPlant(createConfig("patch_redwood_sorrel", 70, ModBlocks.REDWOOD_SORREL), 16);
        BiomeModifications.addFeature(oldGrowthTaiga, vegetal, placed.getKey().get());
        
        placed = registerPlant(createConfig("patch_puff_flower", 80, ModBlocks.PUFF_FLOWER), 20);
        BiomeModifications.addFeature(birchForest, vegetal, placed.getKey().get());
        
        placed = registerPlant(createConfig("patch_wildflowers", 70, ModBlocks.WILDFLOWERS), 20);
        BiomeModifications.addFeature(birchForest.and(oldGrowthTaiga), vegetal, placed.getKey().get());
        
        placed = registerPlant(createConfig("patch_rose_and_lilac", 70, ModBlocks.SHORT_ROSE_BUSH, ModBlocks.SHORT_LILAC_BUSH), 40);
        BiomeModifications.addFeature(BiomeSelectors.categories(Category.FOREST), vegetal, placed.getKey().get());
    }
    
    /** Create a random patch feature config. */
    public static RegistryEntry<ConfiguredFeature<?, ?>> createConfig(String id, int tries, Block... blocks) {
        return createConfig(id, tries, Stream.of(blocks).map(Block::getDefaultState).toArray(BlockState[]::new));
    }
    
    /** Create a random patch feature config. */
    public static RegistryEntry<ConfiguredFeature<?, ?>> createConfig(String id, int tries, BlockState... blocks) {
        SimpleBlockFeatureConfig config;
        if (blocks.length > 1) {
            var data = new DataPool.Builder<BlockState>();
            for (var block : blocks) {
                data.add(block, 1);
            }
            config = new SimpleBlockFeatureConfig(new WeightedBlockStateProvider(data));
        } else {
            config = new SimpleBlockFeatureConfig(BlockStateProvider.of(blocks[0]));
        }
        var entry = PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, config, BlockPredicate.IS_AIR);
        var configured = ConfiguredFeatures.createRandomPatchFeatureConfig(tries, entry);
        return Reg.register(id, Feature.RANDOM_PATCH, configured);
    }
    
    public static RegistryEntry<PlacedFeature> registerPlant(RegistryEntry<ConfiguredFeature<?, ?>> config, int rarity) {
        return registerPlant(config.getKey().get().getValue().getPath(), config, rarity);
    }
    
    public static RegistryEntry<PlacedFeature> registerPlant(String id, RegistryEntry<ConfiguredFeature<?, ?>> config, int rarity) {
        return Reg.register(id, config, RarityFilterPlacementModifier.of(rarity), BiomePlacementModifier.of(), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP);
    }
}
