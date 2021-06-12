package net.killarexe.negative_n.register;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.killarexe.negative_n.block.*;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NegativeNBlocks {

    private static String MODID = "negative_n";
    private static Logger LOGGER = LogManager.getLogger();

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
    public static final GoldNBlock GOLD_N_BLOCK = new GoldNBlock();
    public static final GoldNOre GOLD_N_ORE = new GoldNOre();
    public static final NetherrackN NETHERRACK_N = new NetherrackN();
    public static final AncientDebrisN ANCIENT_DEBRIS_N = new AncientDebrisN();
    public static final NetheriteNBlock NETHERITE_N_BLOCK = new NetheriteNBlock();
    public static final NetherNGoldNOre NETHER_N_GOLD_N_ORE = new NetherNGoldNOre();
    public static final QuartzNOre QUARTZ_N_ORE = new QuartzNOre();
    public static final QuartzNBlock QUARTZ_N_BLOCK = new QuartzNBlock();
    public static final Block TARDIS = new Block(FabricBlockSettings.of(Material.STONE).luminance(14));
    public static final CopperNBlock COPPER_N_BLOCK = new CopperNBlock();
    public static final CopperNOre COPPER_N_ORE = new CopperNOre();
    public static Block WATER_N;

    public static void register(){
        LOGGER.info("Registering blocks...");
        registerBlocks();
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
        registryBlocks(GOLD_N_BLOCK, "gold_n_block", NegativeNItemGroups.BLOCKS, true);
        registryBlocks(GOLD_N_ORE, "gold_n_ore", NegativeNItemGroups.BLOCKS, true);
        registryBlocks(ANCIENT_DEBRIS_N, "ancient_debris_n", NegativeNItemGroups.BLOCKS, true);
        registryBlocks(NETHERITE_N_BLOCK, "netherite_n_block", NegativeNItemGroups.BLOCKS, true);
        registryBlocks(NETHERRACK_N, "netherrack_n", NegativeNItemGroups.BLOCKS, true);
        registryBlocks(NETHER_N_GOLD_N_ORE, "nether_n_gold_n_ore", NegativeNItemGroups.BLOCKS, true);
        registryBlocks(QUARTZ_N_ORE, "quartz_n_ore", NegativeNItemGroups.BLOCKS, true);
        registryBlocks(QUARTZ_N_BLOCK, "quartz_n_block", NegativeNItemGroups.BLOCKS, true);
        registryBlocks(TARDIS, "tardis", null, true);
        registryBlocks(COPPER_N_BLOCK, "copper_n_block", NegativeNItemGroups.BLOCKS, true);
        registryBlocks(COPPER_N_ORE, "copper_n_ore", NegativeNItemGroups.BLOCKS, true);

        //WATER_N = Registry.register(Registry.BLOCK, new Identifier(MODID, "water_n"), new FluidBlock(NegativeNFluids.STILL_WATER_N, FabricBlockSettings.copyOf(Blocks.WATER)){});
    }

    private static void registryBlocks(Block block, String id, ItemGroup group, boolean asItem){
        Registry.register(Registry.BLOCK, new Identifier(MODID, id), block);
        if(asItem) {
            Registry.register(Registry.ITEM, new Identifier(MODID, id), new BlockItem(block, new FabricItemSettings().group(group)));
        }
    }
}
