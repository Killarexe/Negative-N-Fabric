package net.killarexe.negative_n.register;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.killarexe.negative_n.block.*;
import net.killarexe.negative_n.util.world.feature.OreFeatures;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NegativeNBlocks {

    static String MODID = "negative_n";
    static Logger LOGGER = LogManager.getLogger();

    public static final DiamondNBlock DIAMOND_N_BLOCK = new DiamondNBlock();
    public static final DiamondNOre DIAMOND_N_ORE = new DiamondNOre();
    public static final IronNBlock IRON_N_BLOCK = new IronNBlock();
    public static final IronNOre IRON_N_ORE = new IronNOre();
    public static final CoalNBlock COAL_N_BLOCK = new CoalNBlock();
    public static final CoalNOre COAL_N_ORE = new CoalNOre();
    public static final OakNLog OAK_LOG_N = new OakNLog();
    public static final OakPlanksN OAK_PLANKS_N = new OakPlanksN();
    public static final OakNLeaves OAK_LEAVES_N = new OakNLeaves();
    public static final GrassBlockN GRASS_BLOCK_N = new GrassBlockN();
    public static final DirtN DIRT_N = new DirtN();
    public static final StoneN STONE_N = new StoneN();
    public static final CobblestoneN COBBLESTONE_N = new CobblestoneN();
    public static final SandN SAND_N = new SandN();
    public static final SandStoneN SAND_STONE_N = new SandStoneN();
    public static Block WATER_N;

    public static void register(){
        LOGGER.info("Registering blocks...");
        registerBlocks();
        registerOres();
        LOGGER.info("Blocks Registering Complete!");
    }

    private static void registerBlocks(){
        registryBlocks(DIAMOND_N_BLOCK, "diamond_n_block", NegativeNItemGroups.BLOCKS, true);
        registryBlocks(DIAMOND_N_ORE, "diamond_n_ore", NegativeNItemGroups.BLOCKS, true);
        registryBlocks(IRON_N_BLOCK , "iron_n_block", NegativeNItemGroups.BLOCKS, true);
        registryBlocks(IRON_N_ORE , "iron_n_ore", NegativeNItemGroups.BLOCKS, true);
        registryBlocks(COAL_N_BLOCK, "coal_n_block", NegativeNItemGroups.BLOCKS, true);
        registryBlocks(COAL_N_ORE, "coal_n_ore", NegativeNItemGroups.BLOCKS, true);
        registryBlocks(OAK_LOG_N, "oak_log_n", NegativeNItemGroups.BLOCKS, true);
        registryBlocks(OAK_PLANKS_N, "oak_planks_n", NegativeNItemGroups.BLOCKS, true);
        registryBlocks(OAK_LEAVES_N, "oak_leaves_n", NegativeNItemGroups.DECO, true);
        registryBlocks(GRASS_BLOCK_N, "grass_block_n", NegativeNItemGroups.BLOCKS, true);
        registryBlocks(DIRT_N, "dirt_n", NegativeNItemGroups.BLOCKS, true);
        registryBlocks(STONE_N, "stone_n", NegativeNItemGroups.BLOCKS, true);
        registryBlocks(COBBLESTONE_N, "cobblestone_n", NegativeNItemGroups.BLOCKS, true);
        registryBlocks(SAND_N, "sand_n", NegativeNItemGroups.BLOCKS, true);
        registryBlocks(SAND_STONE_N, "sandstone_n", NegativeNItemGroups.BLOCKS, true);

        //WATER_N = Registry.register(Registry.BLOCK, new Identifier(MODID, "water_n"), new FluidBlock(NegativeNFluids.STILL_WATER_N, FabricBlockSettings.copyOf(Blocks.WATER)){});
    }

    private static void registerOres(){
        registryOres(addOreFeature("diamond_n_ore_feature_overworld"), OreFeatures.DIAMOND_N_ORE_FEATURE_OVERWORLD);
        registryOres(addOreFeature("diamond_n_ore_feature_underworld"), OreFeatures.DIAMOND_N_ORE_FEATURE_UNDERWORLD);
        registryOres(addOreFeature("iron_n_ore_feature_overworld"), OreFeatures.IRON_N_ORE_FEATURE_OVERWORLD);
        registryOres(addOreFeature("iron_n_ore_feature_underworld"), OreFeatures.IRON_N_ORE_FEATURE_UNDERWORLD);
        registryOres(addOreFeature("coal_n_ore_feature_overworld"), OreFeatures.COAL_N_ORE_FEATURE_OVERWORLD);
        registryOres(addOreFeature("coal_n_ore_feature_underworld"), OreFeatures.COAL_N_ORE_FEATURE_UNDERWORLD);
    }

    private static void registryOres(RegistryKey<ConfiguredFeature<?, ?>> featureRegistryKey, ConfiguredFeature<?, ?> feature){
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, featureRegistryKey.getValue(), feature);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, featureRegistryKey);
    }

    private static RegistryKey<ConfiguredFeature<?, ?>> addOreFeature(String id){
        return RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier(MODID, id));
    }

    private static void registryBlocks(Block block, String id, ItemGroup group, boolean isItem){
        Registry.register(Registry.BLOCK, new Identifier(MODID, id), block);
        if(isItem) {
            Registry.register(Registry.ITEM, new Identifier(MODID, id), new BlockItem(block, new FabricItemSettings().group(group)));
        }
    }
}
