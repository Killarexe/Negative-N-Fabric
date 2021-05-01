package net.killarexe.negative_n.util.world.feature;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.killarexe.negative_n.register.NegativeNBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.RuleTestType;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.Random;
import java.util.function.Predicate;

public class OreFeatures{

    static RuleTest BASE_STONE_N_UNDERWORLD = new BlockMatchRuleTest(NegativeNBlocks.STONE_N);

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

}
