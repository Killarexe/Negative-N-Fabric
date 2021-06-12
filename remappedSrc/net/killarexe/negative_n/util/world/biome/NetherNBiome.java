package net.killarexe.negative_n.util.world.biome;

import net.killarexe.negative_n.register.NegativeNBlocks;
import net.killarexe.negative_n.util.world.feature.OreFeatures;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.surfacebuilder.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.TernarySurfaceConfig;

public class NetherNBiome {

    public static final ConfiguredSurfaceBuilder<TernarySurfaceConfig> NETHERRACK_N_SURFACE_BUILDER = SurfaceBuilder.NETHER
            .withConfig(new TernarySurfaceConfig(
                    NegativeNBlocks.NETHERRACK_N.getDefaultState(),
                    NegativeNBlocks.NETHERRACK_N.getDefaultState(),
                    NegativeNBlocks.NETHERRACK_N.getDefaultState()));

    public static final Biome NETHER_N = create();

    private static Biome create(){


        SpawnSettings.Builder spawnSettings = new SpawnSettings.Builder();
        GenerationSettings.Builder generationSettings = new GenerationSettings.Builder();
        generationSettings.surfaceBuilder(NETHERRACK_N_SURFACE_BUILDER);
        /*generationSettings.feature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.TREE.configure((new TreeFeatureConfig.Builder(
                new SimpleBlockStateProvider(NegativeNBlocks.OAK_LOG_N.getDefaultState()),
                new SimpleBlockStateProvider(NegativeNBlocks.OAK_LEAVES_N.getDefaultState()),
                new BlobFoliagePlacer(UniformIntDistribution.of(2), UniformIntDistribution.of(0), 3),
                new StraightTrunkPlacer(5, 2, 0),
                new TwoLayersFeatureSize(1, 0, 1))
                .ignoreVines().build())).decorate(ConfiguredFeatures.Decorators.SQUARE_HEIGHTMAP)
                .decorate(Decorator.COUNT_EXTRA.configure(new CountExtraDecoratorConfig(5, 0.1f, 1))));*/
        generationSettings.feature(GenerationStep.Feature.UNDERGROUND_ORES, OreFeatures.ANCIENT_DEBRIS_N_FEATURE_NETHER_N);
        generationSettings.feature(GenerationStep.Feature.UNDERGROUND_ORES, OreFeatures.QUARTZ_N_ORE_FEATURE_NETHER_N);
        generationSettings.feature(GenerationStep.Feature.UNDERGROUND_ORES, OreFeatures.GOLD_N_ORE_FEATURE_NETHER_N);

        return (new Biome.Builder())
                .precipitation(Biome.Precipitation.NONE)
                .category(Biome.Category.NETHER)
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
