package net.killarexe.negative_n.util.world.feature;

import net.killarexe.negative_n.register.NegativeNBlocks;
import net.minecraft.util.math.intprovider.*;

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

    //Code in here "https://fabricmc.net/wiki/tutorial:trees"
    public static final ConfiguredFeature<?, ?> OAK_N_TREE = null; /*Feature.TREE
            .configure(new TreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(NegativeNBlocks.OAK_LOG_N.getDefaultState()),
                    new StraightTrunkPlacer(8, 3, 0),
                    new SimpleBlockStateProvider(NegativeNBlocks.OAK_LEAVES_N.getDefaultState()),
                    new SimpleBlockStateProvider(NegativeNBlocks.OAK_N_SAPLING.getDefaultState()),
                    new BlobFoliagePlacer(ConstantIntProvider.create(5), ConstantIntProvider.create(0), 3),
                    new TwoLayersFeatureSize(1, 0, 1)
            ).build())
            .spreadHorizontally()
            .applyChance(3);*/
}
