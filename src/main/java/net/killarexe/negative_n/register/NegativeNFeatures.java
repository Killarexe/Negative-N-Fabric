package net.killarexe.negative_n.register;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.killarexe.negative_n.util.world.feature.OreFeatures;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import java.util.function.Predicate;

public class NegativeNFeatures extends NegativeNRegisterType{

    public static void register(){
        LOGGER.info("Registering Features");
        registerOres();
        registerTrees();
        LOGGER.info("Registering Compete!");
    }

    private static void registerTrees(){
        LOGGER.info("Registering Trees");
        //registryTrees(addFeature("oak_n_tree"), TreeFeatures.OAK_N_TREE, NegativeNBiomes.OAK_N_FOREST_KEY);
    }

    private static void registerOres(){
        LOGGER.info("Registering Ore Features");
        registryOres(addFeature("diamond_n_ore_feature_overworld"), OreFeatures.DIAMOND_N_ORE_FEATURE_OVERWORLD);
        registryOres(addFeature("diamond_n_ore_feature_underworld"), OreFeatures.DIAMOND_N_ORE_FEATURE_UNDERWORLD);
        registryOres(addFeature("iron_n_ore_feature_overworld"), OreFeatures.IRON_N_ORE_FEATURE_OVERWORLD);
        registryOres(addFeature("iron_n_ore_feature_underworld"), OreFeatures.IRON_N_ORE_FEATURE_UNDERWORLD);
        registryOres(addFeature("coal_n_ore_feature_overworld"), OreFeatures.COAL_N_ORE_FEATURE_OVERWORLD);
        registryOres(addFeature("coal_n_ore_feature_underworld"), OreFeatures.COAL_N_ORE_FEATURE_UNDERWORLD);
        registryOres(addFeature("gold_n_ore_feature_overworld"), OreFeatures.GOLD_N_ORE_FEATURE_OVERWORLD);
        registryOres(addFeature("gold_n_ore_feature_underworld"), OreFeatures.GOLD_N_ORE_FEATURE_UNDERWORLD);
        registryOres(addFeature("ancient_debris_n_feature_nether_n"), OreFeatures.ANCIENT_DEBRIS_N_FEATURE_NETHER_N);
        registryOres(addFeature("ancient_debris_n_feature_nether"), OreFeatures.ANCIENT_DEBRIS_N_FEATURE_NETHER);
        registryOres(addFeature("quartz_n_ore_feature_nether_n"), OreFeatures.QUARTZ_N_ORE_FEATURE_NETHER_N);
        registryOres(addFeature("gold_n_ore_feature_nether_n"), OreFeatures.GOLD_N_ORE_FEATURE_NETHER_N);
        registryOres(addFeature("copper_n_ore_feature_overworld"), OreFeatures.COPPER_N_ORE_FEATURE_OVERWORLD);
        registryOres(addFeature("copper_n_ore_feature_underworld"), OreFeatures.COPPER_N_ORE_FEATURE_UNDERWORLD);
    }

    private static void registryOres(RegistryKey<ConfiguredFeature<?, ?>> featureRegistryKey, ConfiguredFeature<?, ?> feature){
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, featureRegistryKey.getValue(), feature);
        BiomeModifications.addFeature(BiomeSelectors.all(), GenerationStep.Feature.UNDERGROUND_ORES, featureRegistryKey);
    }

    private static void registryTrees(RegistryKey<ConfiguredFeature<?, ?>> featureRegistryKey, ConfiguredFeature<?, ?> feature, RegistryKey<Biome> biome){
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, featureRegistryKey.getValue(), feature);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(biome), GenerationStep.Feature.VEGETAL_DECORATION, featureRegistryKey);
    }

    private static void registryCustom(RegistryKey<ConfiguredFeature<?, ?>> featureRegistryKey, ConfiguredFeature<?, ?> feature, Predicate<BiomeSelectionContext> biomeSelectionContextPredicate, GenerationStep.Feature stepFeature){
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, featureRegistryKey.getValue(), feature);
        BiomeModifications.addFeature(biomeSelectionContextPredicate, stepFeature, featureRegistryKey);
    }

    private static RegistryKey<ConfiguredFeature<?, ?>> addFeature(String id){
        return RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MODID, id));
    }
}
