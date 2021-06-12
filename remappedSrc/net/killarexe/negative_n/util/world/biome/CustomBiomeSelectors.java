package net.killarexe.negative_n.util.world.biome;

import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.minecraft.world.biome.Biome;

import java.util.function.Predicate;

public class CustomBiomeSelectors {

    public static Predicate<BiomeSelectionContext> typeForestN(){
        return context -> context.getBiome().getCategory() == Biome.Category.byName("forest_n");
    }
}
