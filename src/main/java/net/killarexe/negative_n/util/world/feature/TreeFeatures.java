package net.killarexe.negative_n.util.world.feature;

import net.killarexe.negative_n.register.NegativeNBlocks;
import net.minecraft.util.math.intprovider.BiasedToBottomIntProvider;
import net.minecraft.util.math.intprovider.IntProvider;

import net.minecraft.util.math.intprovider.IntProviderType;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.CountExtraDecoratorConfig;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.ConfiguredFeatures;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.heightprovider.UniformHeightProvider;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.Random;

public class TreeFeatures {

    public static ConfiguredFeature<?, ?> OAK_N_TREE = null; /*Feature.TREE.configure((new TreeFeatureConfig.Builder(
            new SimpleBlockStateProvider(NegativeNBlocks.OAK_LOG_N.getDefaultState()),
            new SimpleBlockStateProvider(NegativeNBlocks.OAK_LEAVES_N.getDefaultState()),
            new BlobFoliagePlacer(null, null, 3),
            new StraightTrunkPlacer(5, 2, 0),
            new TwoLayersFeatureSize(1, 0, 1))
            .ignoreVines().build())).decorate(Decorator.SQUARE)
            .decorate(Decorator.COUNT_EXTRA.configure(new CountExtraDecoratorConfig(5, 0.1f, 1)));*/
}
