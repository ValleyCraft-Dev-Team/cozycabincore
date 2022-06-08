package net.linkle.cozy.gen.feature;

import com.google.common.collect.ImmutableList;

import net.linkle.cozy.init.ModBlocks;
import net.linkle.cozy.util.Reg;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.MegaPineFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.treedecorator.AlterGroundTreeDecorator;
import net.minecraft.world.gen.trunk.GiantTrunkPlacer;

public class TreeConfigFeatures {
    public static final RegistryEntry<ConfiguredFeature<?, ?>> MEGA_REDWOOD = Reg.register("mega_redwood", Feature.TREE,
            new TreeFeatureConfig.Builder(BlockStateProvider.of(ModBlocks.REDWOOD_LOG), new GiantTrunkPlacer(13, 2, 14),
                    BlockStateProvider.of(ModBlocks.REDWOOD_LEAVES),
                    new MegaPineFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0),
                            UniformIntProvider.create(13, 17)),
                    new TwoLayersFeatureSize(1, 1, 2))
                    // Remove the line below if you don't want a podzol block decorator.
                    .decorators(ImmutableList.of(new AlterGroundTreeDecorator(BlockStateProvider.of(Blocks.PODZOL))))
                    .build());

    public static void intialize() {

    }
}
