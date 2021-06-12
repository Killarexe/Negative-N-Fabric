package net.killarexe.negative_n.util.world.feature;

import net.killarexe.negative_n.register.NegativeNBlocks;
import net.minecraft.block.Block;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.world.gen.HeightContext;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.heightprovider.HeightProvider;
import net.minecraft.world.gen.heightprovider.HeightProviderType;
import net.minecraft.world.gen.heightprovider.UniformHeightProvider;

import java.util.Random;

public class OreFeatures{

    private static RuleTest BASE_STONE_N_UNDERWORLD = new BlockMatchRuleTest(NegativeNBlocks.STONE_N);
    private static RuleTest BASE_NETHERRACK_N_NETHER = new BlockMatchRuleTest(NegativeNBlocks.NETHERRACK_N);

    public static ConfiguredFeature<?, ?> DIAMOND_N_ORE_FEATURE_OVERWORLD = createOreFreature(
            OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
            NegativeNBlocks.DIAMOND_N_ORE,
            0,
            16,
            8,
            1
    );

    public static ConfiguredFeature<?, ?> DIAMOND_N_ORE_FEATURE_UNDERWORLD = createOreFreature(
            BASE_STONE_N_UNDERWORLD,
            NegativeNBlocks.DIAMOND_N_ORE,
            0,
            16,
            8,
            1
    );

    public static ConfiguredFeature<?, ?> IRON_N_ORE_FEATURE_OVERWORLD = createOreFreature(
            OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
            NegativeNBlocks.IRON_N_ORE,
            0,
            64,
            12,
            12
    );

    public static ConfiguredFeature<?, ?> IRON_N_ORE_FEATURE_UNDERWORLD = createOreFreature(
            BASE_STONE_N_UNDERWORLD,
            NegativeNBlocks.IRON_N_ORE,
            00,
            64,
            12,
            12
    );

    public static ConfiguredFeature<?, ?> COAL_N_ORE_FEATURE_OVERWORLD = createOreFreature(
            OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
            NegativeNBlocks.COAL_N_ORE,
            0,
            128,
            32,
            16
    );

    public static ConfiguredFeature<?, ?> COAL_N_ORE_FEATURE_UNDERWORLD = createOreFreature(
            BASE_STONE_N_UNDERWORLD,
            NegativeNBlocks.ANCIENT_DEBRIS_N,
            0,
            128,
            32,
            16
    );

    public static ConfiguredFeature<?, ?> GOLD_N_ORE_FEATURE_OVERWORLD = createOreFreature(
            OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
            NegativeNBlocks.GOLD_N_ORE,
            0,
            24,
            8,
            4
    );

    public static ConfiguredFeature<?, ?> GOLD_N_ORE_FEATURE_UNDERWORLD = createOreFreature(
            BASE_STONE_N_UNDERWORLD,
            NegativeNBlocks.GOLD_N_ORE,
            0,
            24,
            8,
            4
    );

    public static ConfiguredFeature<?, ?> GOLD_N_ORE_FEATURE_NETHER_N = createOreFreature(
            BASE_NETHERRACK_N_NETHER,
            NegativeNBlocks.GOLD_N_ORE,
            0,
            24,
            8,
            4
    );

    public static ConfiguredFeature<?, ?> ANCIENT_DEBRIS_N_FEATURE_NETHER_N = createOreFreature(
            OreFeatureConfig.Rules.BASE_STONE_NETHER,
            NegativeNBlocks.ANCIENT_DEBRIS_N,
            0,
            16,
            4,
            1
    );

    public static ConfiguredFeature<?, ?> ANCIENT_DEBRIS_N_FEATURE_NETHER = createOreFreature(
            OreFeatureConfig.Rules.BASE_STONE_NETHER,
            NegativeNBlocks.ANCIENT_DEBRIS_N,
            0,
            16,
            4,
            1
    );

    public static ConfiguredFeature<?, ?> QUARTZ_N_ORE_FEATURE_NETHER_N = createOreFreature(
            BASE_NETHERRACK_N_NETHER,
            NegativeNBlocks.QUARTZ_N_ORE,
            0,
            128,
            16,
            14);

    public static ConfiguredFeature<?, ?> COPPER_N_ORE_FEATURE_OVERWORLD = createOreFreature(
            OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
            NegativeNBlocks.COPPER_N_ORE,
            0,
            64,
            16,
            14);

    public static ConfiguredFeature<?, ?> COPPER_N_ORE_FEATURE_UNDERWORLD = createOreFreature(
            BASE_STONE_N_UNDERWORLD,
            NegativeNBlocks.COPPER_N_ORE,
            0,
            64,
            16,
            14);


    public static ConfiguredFeature<?, ?> createOreFreature(RuleTest ruleTest, Block block, int minY, int maxY, int veinSize,int perChunck){
        ConfiguredFeature<?, ?> FEATURE = Feature.ORE.configure(
                new OreFeatureConfig(BASE_NETHERRACK_N_NETHER, NegativeNBlocks.QUARTZ_N_ORE.getDefaultState(), veinSize))
                .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(UniformHeightProvider.create(YOffset.fixed(minY), YOffset.fixed(maxY))))
                .spreadHorizontally()
                .repeat(perChunck));
        return FEATURE;
    }
}
