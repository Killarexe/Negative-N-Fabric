package net.killarexe.negative_n.util.world.biome;

import net.killarexe.negative_n.register.NegativeNBlocks;
import net.killarexe.negative_n.util.world.feature.OreFeatures;
import net.minecraft.sound.BiomeMoodSound;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.UniformIntDistribution;
import net.minecraft.world.gen.decorator.CountExtraDecoratorConfig;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.feature.ConfiguredFeatures;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.surfacebuilder.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.TernarySurfaceConfig;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

public class OakNForest {

    public static final ConfiguredSurfaceBuilder<TernarySurfaceConfig> GRASS_BLOCK_N_SURFACE_BUILDER = SurfaceBuilder.DEFAULT
            .withConfig(new TernarySurfaceConfig(
                    NegativeNBlocks.GRASS_BLOCK_N.getDefaultState(),
                    NegativeNBlocks.DIRT_N.getDefaultState(),
                    NegativeNBlocks.STONE_N.getDefaultState()));

    public static final Biome OAK_N_FOREST = create();

    private static Biome create(){


        SpawnSettings.Builder spawnSettings = new SpawnSettings.Builder();
        GenerationSettings.Builder generationSettings = new GenerationSettings.Builder();
        generationSettings.surfaceBuilder(GRASS_BLOCK_N_SURFACE_BUILDER);
        generationSettings.feature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.TREE.configure((new TreeFeatureConfig.Builder(
                new SimpleBlockStateProvider(NegativeNBlocks.OAK_LOG_N.getDefaultState()),
                new SimpleBlockStateProvider(NegativeNBlocks.OAK_LEAVES_N.getDefaultState()),
                new BlobFoliagePlacer(UniformIntDistribution.of(2), UniformIntDistribution.of(0), 3),
                new StraightTrunkPlacer(5, 2, 0),
                new TwoLayersFeatureSize(1, 0, 1))
                .ignoreVines().build())).decorate(ConfiguredFeatures.Decorators.SQUARE_HEIGHTMAP)
                .decorate(Decorator.COUNT_EXTRA.configure(new CountExtraDecoratorConfig(5, 0.1f, 1))));
        generationSettings.feature(GenerationStep.Feature.UNDERGROUND_ORES, OreFeatures.DIAMOND_N_ORE_FEATURE_UNDERWORLD);
        generationSettings.feature(GenerationStep.Feature.UNDERGROUND_ORES, OreFeatures.IRON_N_ORE_FEATURE_UNDERWORLD);
        generationSettings.feature(GenerationStep.Feature.UNDERGROUND_ORES, OreFeatures.COAL_N_ORE_FEATURE_UNDERWORLD);
        DefaultBiomeFeatures.addDefaultUndergroundStructures(generationSettings);
        DefaultBiomeFeatures.addLandCarvers(generationSettings);
        DefaultBiomeFeatures.addDefaultLakes(generationSettings);
        DefaultBiomeFeatures.addDungeons(generationSettings);
        DefaultBiomeFeatures.addMineables(generationSettings);
        //DefaultBiomeFeatures.addDefaultOres(generationSettings);
        DefaultBiomeFeatures.addDefaultDisks(generationSettings);
        DefaultBiomeFeatures.addSprings(generationSettings);
        DefaultBiomeFeatures.addFrozenTopLayer(generationSettings);

        return (new Biome.Builder())
                .precipitation(Biome.Precipitation.NONE)
                .category(Biome.Category.FOREST)
                .depth(0.125F)
                .scale(0.05F)
                .temperature(0.5F)
                .downfall(0.4F)
                .effects((new BiomeEffects.Builder())
                        .waterColor(0x3f76e4)
                        .waterFogColor(0x050533)
                        .fogColor(0xc0d8ff)
                        .skyColor(0x77adff)
                        .build())
                .spawnSettings(spawnSettings.build())
                .generationSettings(generationSettings.build())
                .build();
    }
}
