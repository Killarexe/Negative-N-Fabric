package net.killarexe.negative_n.util.world.feature;

import net.killarexe.negative_n.register.NegativeNBlocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class OreFeatures{

    private static RuleTest BASE_STONE_N_UNDERWORLD = new BlockMatchRuleTest(NegativeNBlocks.STONE_N);
    private static RuleTest BASE_NETHERRACK_N_NETHER = new BlockMatchRuleTest(NegativeNBlocks.NETHERRACK_N);

    public static ConfiguredFeature<?, ?> DIAMOND_N_ORE_FEATURE_OVERWORLD = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    NegativeNBlocks.DIAMOND_N_ORE.getDefaultState(),
                    8)) // vein size
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0,
                    0,
                    12)))
            .spreadHorizontally()
            .repeat(1); // number of veins per chunk

    public static ConfiguredFeature<?, ?> DIAMOND_N_ORE_FEATURE_UNDERWORLD = Feature.ORE
            .configure(new OreFeatureConfig(
                    BASE_STONE_N_UNDERWORLD,
                    NegativeNBlocks.DIAMOND_N_ORE.getDefaultState(),
                    8)) // vein size
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0,
                    0,
                    12)))
            .spreadHorizontally()
            .repeat(1); // number of veins per chunk

    public static ConfiguredFeature<?, ?> IRON_N_ORE_FEATURE_OVERWORLD = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    NegativeNBlocks.IRON_N_ORE.getDefaultState(),
                    8)) // vein size
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0,
                    0,
                    50)))
            .spreadHorizontally()
            .repeat(7); // number of veins per chunk

    public static ConfiguredFeature<?, ?> IRON_N_ORE_FEATURE_UNDERWORLD = Feature.ORE
            .configure(new OreFeatureConfig(
                    BASE_STONE_N_UNDERWORLD,
                    NegativeNBlocks.IRON_N_ORE.getDefaultState(),
                    8)) // vein size
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0,
                    0,
                    50)))
            .spreadHorizontally()
            .repeat(7); // number of veins per chunk

    public static ConfiguredFeature<?, ?> COAL_N_ORE_FEATURE_OVERWORLD = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    NegativeNBlocks.COAL_N_ORE.getDefaultState(),
                    16)) // vein size
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0,
                    0,
                    74)))
            .spreadHorizontally()
            .repeat(12); // number of veins per chunk

    public static ConfiguredFeature<?, ?> COAL_N_ORE_FEATURE_UNDERWORLD = Feature.ORE
            .configure(new OreFeatureConfig(
                    BASE_STONE_N_UNDERWORLD,
                    NegativeNBlocks.COAL_N_ORE.getDefaultState(),
                    16)) // vein size
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0,
                    0,
                    74)))
            .spreadHorizontally()
            .repeat(12); // number of veins per chunk

    public static ConfiguredFeature<?, ?> GOLD_N_ORE_FEATURE_OVERWORLD = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    NegativeNBlocks.GOLD_N_ORE.getDefaultState(),
                    8)) // vein size
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0,
                    0,
                    24)))
            .spreadHorizontally()
            .repeat(4); // number of veins per chunk

    public static ConfiguredFeature<?, ?> GOLD_N_ORE_FEATURE_UNDERWORLD = Feature.ORE
            .configure(new OreFeatureConfig(
                    BASE_STONE_N_UNDERWORLD,
                    NegativeNBlocks.GOLD_N_ORE.getDefaultState(),
                    8)) // vein size
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0,
                    0,
                    24)))
            .spreadHorizontally()
            .repeat(4); // number of veins per chunk

    public static ConfiguredFeature<?, ?> GOLD_N_ORE_FEATURE_NETHER_N = Feature.ORE
            .configure(new OreFeatureConfig(
                    BASE_STONE_N_UNDERWORLD,
                    NegativeNBlocks.GOLD_N_ORE.getDefaultState(),
                    14)) // vein size
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0,
                    0,
                    128)))
            .spreadHorizontally()
            .repeat(14); // number of veins per chunk

    public static ConfiguredFeature<?, ?> ANCIENT_DEBRIS_N_FEATURE_NETHER_N = Feature.ORE
            .configure(new OreFeatureConfig(
                    BASE_NETHERRACK_N_NETHER,
                    NegativeNBlocks.ANCIENT_DEBRIS_N.getDefaultState(),
                    4)) // vein size
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0,
                    0,
                    16)))
            .spreadHorizontally()
            .repeat(4); // number of veins per chunk

    public static ConfiguredFeature<?, ?> QUARTZ_N_ORE_FEATURE_NETHER_N = Feature.ORE
            .configure(new OreFeatureConfig(
                    BASE_NETHERRACK_N_NETHER,
                    NegativeNBlocks.QUARTZ_N_ORE.getDefaultState(),
                    16)) // vein size
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0,
                    0,
                    128)))
            .spreadHorizontally()
            .repeat(14); // number of veins per chunk
}
