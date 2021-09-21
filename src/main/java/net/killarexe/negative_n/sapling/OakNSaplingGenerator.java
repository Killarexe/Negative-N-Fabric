package net.killarexe.negative_n.sapling;

import net.killarexe.negative_n.util.world.feature.TreeFeatures;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class OakNSaplingGenerator extends SaplingGenerator {

    private final ConfiguredFeature<TreeFeatureConfig, ?> feature;

    public OakNSaplingGenerator() {
        this.feature = (ConfiguredFeature<TreeFeatureConfig, ?>) TreeFeatures.OAK_N_TREE;
    }

    @Nullable
    @Override
    protected ConfiguredFeature<TreeFeatureConfig, ?> getTreeFeature(Random random, boolean bees) {
        return feature;
    }
}
