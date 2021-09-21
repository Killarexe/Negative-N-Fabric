package net.killarexe.negative_n.register;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.killarexe.negative_n.NegativeNMod;
import net.killarexe.negative_n.block.*;
import net.minecraft.block.*;
import net.minecraft.item.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.*;

public class NegativeNBlocks {

    private static String MODID = NegativeNMod.MODID;
    private static Logger LOGGER = LogManager.getLogger();

    public static final Block DIAMOND_N_BLOCK = createBlock(Material.METAL, 5, 19, false, BlockSoundGroup.NETHERITE, FabricToolTags.PICKAXES, 6, 0);
    public static final Block DIAMOND_N_ORE = createOreBlock(Material.STONE, 5, 17, false, BlockSoundGroup.STONE, FabricToolTags.PICKAXES, 3, 0);
    public static final Block IRON_N_BLOCK = createBlock(Material.METAL, 5, 10, false, BlockSoundGroup.METAL, FabricToolTags.PICKAXES, 3, 0);
    public static final Block IRON_N_ORE = createOreBlock(Material.STONE, 3, 5, false, BlockSoundGroup.STONE, FabricToolTags.PICKAXES, 3, 0);
    public static final Block COAL_N_BLOCK = createBlock(Material.STONE, 3, 5, false, BlockSoundGroup.STONE, FabricToolTags.PICKAXES, 2, 0);
    public static final Block COAL_N_ORE = createOreBlock(Material.STONE, 2, 5, false, BlockSoundGroup.STONE, FabricToolTags.PICKAXES, 2, 0);
    public static final Block OAK_LOG_N = createPillarBlock(Material.WOOD, 1.5f,5, true, BlockSoundGroup.WOOD, FabricToolTags.AXES, 0, 0);
    public static final Block OAK_PLANKS_N = createBlock(Material.WOOD, 1.5f,5, true, BlockSoundGroup.WOOD, FabricToolTags.AXES, 0, 0);
    public static final Block OAK_LEAVES_N = copy(Blocks.OAK_LEAVES);
    public static final Block GRASS_BLOCK_N = createBlock(Material.LEAVES, 2, 10, true, BlockSoundGroup.GRASS, FabricToolTags.SHOVELS, 0, 0);
    public static final Block DIRT_N = createBlock(Material.LEAVES, 1.9f, 9, true, BlockSoundGroup.ROOTED_DIRT, FabricToolTags.SHOVELS, 0, 0);;
    public static final Block STONE_N = createBlock(Material.STONE, 2, 20, false, BlockSoundGroup.STONE, FabricToolTags.PICKAXES, 2, 0);
    public static final Block COBBLESTONE_N = copy(STONE_N);
    public static final Block SAND_N = createFallingBlock(Material.SNOW_BLOCK, 2, 10, true, BlockSoundGroup.SAND, FabricToolTags.SHOVELS, 0, 0);
    public static final Block SAND_STONE_N = copy(STONE_N);
    public static final Block GOLD_N_BLOCK = copy(IRON_N_BLOCK);
    public static final Block GOLD_N_ORE = copy(IRON_N_ORE);
    public static final Block NETHERRACK_N = createBlock(Material.STONE, 1.5f, 10, false, BlockSoundGroup.NETHERRACK, FabricToolTags.PICKAXES, 1, 1);
    public static final Block ANCIENT_DEBRIS_N = createPillarBlock(Material.METAL, 5, 50, false, BlockSoundGroup.ANCIENT_DEBRIS, FabricToolTags.PICKAXES, 6, 6);
    public static final Block NETHERITE_N_BLOCK = createBlock(Material.METAL, 5, 50, false, BlockSoundGroup.NETHERITE, FabricToolTags.PICKAXES, 6, 6);;
    public static final Block NETHER_N_GOLD_N_ORE = copy(NETHERRACK_N);
    public static final Block QUARTZ_N_ORE = copy(NETHERRACK_N);
    public static final Block QUARTZ_N_BLOCK = copy(COAL_N_BLOCK);
    public static final Block TARDIS = createBlock(Material.STONE, 1, 10, BlockSoundGroup.STONE, 14);
    public static final Block COPPER_N_BLOCK = copy(COAL_N_BLOCK);
    public static final Block COPPER_N_ORE = copy(COAL_N_ORE);
    public static final RawFilter RAW_FILTER = new RawFilter();
    public static Block WATER_N;

    public static void register(){
        LOGGER.info("Registering blocks...");
        registerBlocks();
        LOGGER.info("Blocks Registering Complete!");
    }

    private static void registerBlocks(){
        registryBlocks(DIAMOND_N_BLOCK, "diamond_n_block", NegativeNItemGroups.BLOCKS);
        registryBlocks(DIAMOND_N_ORE, "diamond_n_ore", NegativeNItemGroups.BLOCKS);
        registryBlocks(IRON_N_BLOCK , "iron_n_block", NegativeNItemGroups.BLOCKS);
        registryBlocks(IRON_N_ORE , "iron_n_ore", NegativeNItemGroups.BLOCKS);
        registryBlocks(COAL_N_BLOCK, "coal_n_block", NegativeNItemGroups.BLOCKS);
        registryBlocks(COAL_N_ORE, "coal_n_ore", NegativeNItemGroups.BLOCKS);
        registryBlocks(OAK_LOG_N, "oak_log_n", NegativeNItemGroups.BLOCKS);
        registryBlocks(OAK_PLANKS_N, "oak_planks_n", NegativeNItemGroups.BLOCKS);
        registryBlocks(OAK_LEAVES_N, "oak_leaves_n", NegativeNItemGroups.DECO);
        registryBlocks(GRASS_BLOCK_N, "grass_block_n", NegativeNItemGroups.BLOCKS);
        registryBlocks(DIRT_N, "dirt_n", NegativeNItemGroups.BLOCKS);
        registryBlocks(STONE_N, "stone_n", NegativeNItemGroups.BLOCKS);
        registryBlocks(COBBLESTONE_N, "cobblestone_n", NegativeNItemGroups.BLOCKS);
        registryBlocks(SAND_N, "sand_n", NegativeNItemGroups.BLOCKS);
        registryBlocks(SAND_STONE_N, "sandstone_n", NegativeNItemGroups.BLOCKS);
        registryBlocks(GOLD_N_BLOCK, "gold_n_block", NegativeNItemGroups.BLOCKS);
        registryBlocks(GOLD_N_ORE, "gold_n_ore", NegativeNItemGroups.BLOCKS);
        registryBlocks(ANCIENT_DEBRIS_N, "ancient_debris_n", NegativeNItemGroups.BLOCKS);
        registryBlocks(NETHERITE_N_BLOCK, "netherite_n_block", NegativeNItemGroups.BLOCKS);
        registryBlocks(NETHERRACK_N, "netherrack_n", NegativeNItemGroups.BLOCKS);
        registryBlocks(NETHER_N_GOLD_N_ORE, "nether_n_gold_n_ore", NegativeNItemGroups.BLOCKS);
        registryBlocks(QUARTZ_N_ORE, "quartz_n_ore", NegativeNItemGroups.BLOCKS);
        registryBlocks(QUARTZ_N_BLOCK, "quartz_n_block", NegativeNItemGroups.BLOCKS);
        registryBlocks(TARDIS, "tardis");
        registryBlocks(COPPER_N_BLOCK, "copper_n_block", NegativeNItemGroups.BLOCKS);
        registryBlocks(COPPER_N_ORE, "copper_n_ore", NegativeNItemGroups.BLOCKS);
        registryBlocks(RAW_FILTER, "raw_filter", NegativeNItemGroups.DECO);

        //WATER_N = Registry.register(Registry.BLOCK, new Identifier(MODID, "water_n"), new FluidBlock(NegativeNFluids.STILL_WATER_N, FabricBlockSettings.copyOf(Blocks.WATER)){});
    }

    private static void registryBlocks(Block block, String id, ItemGroup group){
        Registry.register(Registry.BLOCK, new Identifier(MODID, id), block);
        Registry.register(Registry.ITEM, new Identifier(MODID, id), new BlockItem(block, new FabricItemSettings().group(group)));
    }

    private static void registryBlocks(Block block, String id){
        Registry.register(Registry.BLOCK, new Identifier(MODID, id), block);
    }

    private static Block createBlock(Material material, float hardness, float resistance, boolean breakByHand, BlockSoundGroup soundGroup, Tag<Item> tags, int harvestLevel, int luminance){
        Block block;

        if(!breakByHand){
            block = new Block(FabricBlockSettings
                    .of(material)
                    .strength(hardness, resistance)
                    .breakByHand(breakByHand)
                    .requiresTool()
                    .sounds(soundGroup)
                    .breakByTool(tags, harvestLevel)
                    .luminance(luminance)
            );
        }else{
            block = new Block(FabricBlockSettings
                    .of(material)
                    .strength(hardness, resistance)
                    .breakByHand(breakByHand)
                    .sounds(soundGroup)
                    .breakByTool(tags, harvestLevel)
                    .luminance(luminance)
            );
        }

        return block;
    }

    private static Block createBlock(Material material, float hardness, float resistance, BlockSoundGroup soundGroup, int luminance){
        Block block;

        block = new Block(FabricBlockSettings
                .of(material)
                .strength(hardness, resistance)
                .sounds(soundGroup)
                .luminance(luminance)
        );

        return block;
    }

    private static OreBlock createOreBlock(Material material, float hardness, float resistance, boolean breakByHand, BlockSoundGroup soundGroup, Tag<Item> tags, int harvestLevel, int luminance){
        OreBlock block;

        if(!breakByHand){
            block = new OreBlock(FabricBlockSettings
                    .of(material)
                    .strength(hardness, resistance)
                    .breakByHand(breakByHand)
                    .requiresTool()
                    .sounds(soundGroup)
                    .breakByTool(tags, harvestLevel)
                    .luminance(luminance)
            );
        }else{
            block = new OreBlock(FabricBlockSettings
                    .of(material)
                    .strength(hardness, resistance)
                    .breakByHand(breakByHand)
                    .sounds(soundGroup)
                    .breakByTool(tags, harvestLevel)
                    .luminance(luminance)
            );
        }

        return block;
    }

    private static FallingBlock createFallingBlock(Material material, float hardness, float resistance, boolean breakByHand, BlockSoundGroup soundGroup, Tag<Item> tags, int harvestLevel, int luminance){
        FallingBlock block;

        if(!breakByHand){
            block = new FallingBlock(FabricBlockSettings
                    .of(material)
                    .strength(hardness, resistance)
                    .breakByHand(breakByHand)
                    .requiresTool()
                    .sounds(soundGroup)
                    .breakByTool(tags, harvestLevel)
                    .luminance(luminance)
            );
        }else{
            block = new FallingBlock(FabricBlockSettings
                    .of(material)
                    .strength(hardness, resistance)
                    .breakByHand(breakByHand)
                    .sounds(soundGroup)
                    .breakByTool(tags, harvestLevel)
                    .luminance(luminance)
            );
        }

        return block;
    }

    private static FallingBlock createFallingBlock(Material material, float hardness, float resistance, BlockSoundGroup soundGroup, int luminance){
        FallingBlock block;

        block = new FallingBlock(FabricBlockSettings
                .of(material)
                .strength(hardness, resistance)
                .sounds(soundGroup)
                .luminance(luminance)
        );

        return block;
    }

    private static PillarBlock createPillarBlock(Material material, float hardness, float resistance, boolean breakByHand, BlockSoundGroup soundGroup, Tag<Item> tags, int harvestLevel, int luminance){
        PillarBlock block;

        if(!breakByHand){
            block = new PillarBlock(FabricBlockSettings
                    .of(material)
                    .strength(hardness, resistance)
                    .breakByHand(breakByHand)
                    .requiresTool()
                    .sounds(soundGroup)
                    .breakByTool(tags, harvestLevel)
                    .luminance(luminance)
            );
        }else{
            block = new PillarBlock(FabricBlockSettings
                    .of(material)
                    .strength(hardness, resistance)
                    .breakByHand(breakByHand)
                    .sounds(soundGroup)
                    .breakByTool(tags, harvestLevel)
                    .luminance(luminance)
            );
        }

        return block;
    }

    private static Block copy(AbstractBlock copyBlock){
        Block block = new Block(FabricBlockSettings.copyOf(copyBlock));
        return block;
    }
}
