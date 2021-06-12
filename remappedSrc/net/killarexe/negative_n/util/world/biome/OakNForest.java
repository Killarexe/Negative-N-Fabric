package net.killarexe.negative_n.util.world.biome;

import net.killarexe.negative_n.register.NegativeNBlocks;
import net.killarexe.negative_n.util.world.feature.OreFeatures;
import net.killarexe.negative_n.util.world.feature.TreeFeatures;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.carver.ConfiguredCarvers;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.surfacebuilder.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.TernarySurfaceConfig;

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
        generationSettings.carver(GenerationStep.Carver.AIR, ConfiguredCarvers.CAVE);
        generationSettings.carver(GenerationStep.Carver.AIR, ConfiguredCarvers.CANYON);
        generationSettings.structureFeature(ConfiguredStructureFeatures.MINESHAFT_MESA);
        generationSettings.structureFeature(ConfiguredStructureFeatures.MINESHAFT);
        generationSettings.carver(GenerationStep.Carver.AIR, ConfiguredCarvers.OCEAN_CAVE);
        generationSettings.carver(GenerationStep.Carver.AIR, ConfiguredCarvers.CANYON);
        generationSettings.carver(GenerationStep.Carver.LIQUID, ConfiguredCarvers.UNDERWATER_CANYON);
        generationSettings.carver(GenerationStep.Carver.LIQUID, ConfiguredCarvers.UNDERWATER_CAVE);
        generationSettings.feature(GenerationStep.Feature.UNDERGROUND_ORES, OreFeatures.DIAMOND_N_ORE_FEATURE_UNDERWORLD);
        generationSettings.feature(GenerationStep.Feature.UNDERGROUND_ORES, OreFeatures.IRON_N_ORE_FEATURE_UNDERWORLD);
        generationSettings.feature(GenerationStep.Feature.UNDERGROUND_ORES, OreFeatures.COAL_N_ORE_FEATURE_UNDERWORLD);
        generationSettings.feature(GenerationStep.Feature.VEGETAL_DECORATION, TreeFeatures.OAK_N_TREE);

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
