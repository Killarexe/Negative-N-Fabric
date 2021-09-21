package net.killarexe.negative_n.register;

import net.fabricmc.fabric.api.biome.v1.OverworldBiomes;
import net.fabricmc.fabric.api.biome.v1.OverworldClimate;
import net.killarexe.negative_n.util.world.biome.NetherNBiome;
import net.killarexe.negative_n.util.world.biome.OakNForest;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.surfacebuilder.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.TernarySurfaceConfig;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NegativeNBiomes extends NegativeNRegisterType{

    public static final RegistryKey<Biome> OAK_N_FOREST_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier(MODID, "oak_n_forest"));
    public static final RegistryKey<Biome> NETHER_N_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier(MODID, "nether_n_biome"));

    public static void register(){
        LOGGER.info("Register Biomes");
        /*registerBiome(OAK_N_FOREST_KEY, OakNForest.GRASS_BLOCK_N_SURFACE_BUILDER, OakNForest.OAK_N_FOREST, "oak_n_forest");
        registerBiome(NETHER_N_KEY, NetherNBiome.NETHERRACK_N_SURFACE_BUILDER, NetherNBiome.NETHER_N, "nether_n_biome");
        OverworldBiomes.addContinentalBiome(OAK_N_FOREST_KEY, OverworldClimate.TEMPERATE, 2D);
        OverworldBiomes.addContinentalBiome(OAK_N_FOREST_KEY, OverworldClimate.COOL, 2D);*/
        LOGGER.info("Biomes Register Complete!");
    }

    private void registerBiome(RegistryKey<Biome> key, ConfiguredSurfaceBuilder<TernarySurfaceConfig> surfaceBuilder, Biome biome, String id){
        Registry.register(BuiltinRegistries.CONFIGURED_SURFACE_BUILDER, new Identifier(MODID, id), surfaceBuilder);
        Registry.register(BuiltinRegistries.BIOME, key.getValue(), biome);
    }
}
