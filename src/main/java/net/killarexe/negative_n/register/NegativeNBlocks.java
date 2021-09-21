package net.killarexe.negative_n.register;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.killarexe.negative_n.block.*;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.*;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.item.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class NegativeNBlocks extends NegativeNRegisterType{

    public static final Block DIAMOND_N_BLOCK = createBlock(Material.METAL, 5, 19, false, BlockSoundGroup.NETHERITE, FabricToolTags.PICKAXES, 6, 0);
    public static final Block DIAMOND_N_ORE = createOreBlock(Material.STONE, 5, 17, false, BlockSoundGroup.STONE, FabricToolTags.PICKAXES, 3, 0);
    public static final Block DEEPSLATE_N_DIAMOND_N_ORE = copy(DIAMOND_N_ORE);
    public static final Block EMERALD_N_BLOCK = createBlock(Material.STONE, 4, 10, false, BlockSoundGroup.STONE, FabricToolTags.PICKAXES, 4, 0);
    public static final Block EMERALD_N_ORE = createOreBlock(Material.STONE, 3, 10, false, BlockSoundGroup.STONE, FabricToolTags.PICKAXES, 4, 0);
    public static final Block DEEPSLATE_N_EMERALD_N_ORE = copy(EMERALD_N_ORE);
    public static final Block REDSTONE_N_BLOCK = createBlock(Material.METAL, 4, 10, false, BlockSoundGroup.METAL, FabricToolTags.PICKAXES, 3, 0);
    public static final Block REDSTONE_N_ORE = createOreBlock(Material.STONE, 4, 10, false, BlockSoundGroup.STONE, FabricToolTags.PICKAXES, 2, 0);
    public static final Block DEEPSLATE_N_REDSTONE_N_ORE = copy(REDSTONE_N_ORE);
    public static final Block LAPIS_N_BLOCK = createBlock(Material.METAL, 5, 10, false, BlockSoundGroup.METAL, FabricToolTags.PICKAXES, 3, 0);
    public static final Block LAPIS_N_ORE = createOreBlock(Material.STONE, 3, 5, false, BlockSoundGroup.STONE, FabricToolTags.PICKAXES, 3, 0);
    public static final Block DEEPSLATE_N_LAPIS_N_ORE = copy(LAPIS_N_ORE);
    public static final Block IRON_N_BLOCK = createBlock(Material.METAL, 5, 10, false, BlockSoundGroup.METAL, FabricToolTags.PICKAXES, 3, 0);
    public static final Block IRON_N_ORE = createOreBlock(Material.STONE, 3, 5, false, BlockSoundGroup.STONE, FabricToolTags.PICKAXES, 3, 0);
    public static final Block DEEPSLATE_N_IRON_N_ORE = copy(IRON_N_ORE);
    public static final Block GOLD_N_BLOCK = copy(IRON_N_BLOCK);
    public static final Block GOLD_N_ORE = copy(IRON_N_ORE);
    public static final Block DEEPSLATE_N_GOLD_N_ORE = copy(GOLD_N_ORE);
    public static final Block COAL_N_BLOCK = createBlock(Material.STONE, 3, 5, false, BlockSoundGroup.STONE, FabricToolTags.PICKAXES, 2, 0);
    public static final Block COAL_N_ORE = createOreBlock(Material.STONE, 2, 5, false, BlockSoundGroup.STONE, FabricToolTags.PICKAXES, 2, 0);
    public static final Block DEEPSLATE_N_COAL_N_ORE = copy(COAL_N_ORE);
    public static final Block COPPER_N_BLOCK = copy(COAL_N_BLOCK);
    public static final Block COPPER_N_ORE = copy(COAL_N_ORE);
    public static final Block DEEPSLATE_N_COPPER_N_ORE = copy(COPPER_N_ORE);
    public static final Block OAK_LOG_N = createPillarBlock(Material.WOOD, 1.5f,5, true, BlockSoundGroup.WOOD, FabricToolTags.AXES, 0, 0);
    public static final Block OAK_PLANKS_N = createBlock(Material.WOOD, 1.5f,5, true, BlockSoundGroup.WOOD, FabricToolTags.AXES, 0, 0);
    public static final Block OAK_SLAB_N = createSlabBlock(Material.WOOD, 1.5f,5, true, BlockSoundGroup.WOOD, FabricToolTags.AXES, 0, 0);
    public static final Block OAK_LEAVES_N = copy(Blocks.OAK_LEAVES);
    public static final Block ACACIA_LOG_N = copy(OAK_LOG_N);
    public static final Block ACACIA_PLANKS_N = copy(OAK_PLANKS_N);
    public static final Block ACACIA_SLAB_N = copy(OAK_SLAB_N);
    public static final Block ACACIA_LEAVES_N = copy(OAK_LEAVES_N);
    public static final Block BIRCH_LOG_N = copy(OAK_LOG_N);
    public static final Block BIRCH_PLANKS_N = copy(OAK_PLANKS_N);
    public static final Block BIRCH_SLAB_N = copy(OAK_SLAB_N);
    public static final Block BIRCH_LEAVES_N = copy(OAK_LEAVES_N);
    public static final Block DARK_OAK_LOG_N = copy(OAK_LOG_N);
    public static final Block DARK_OAK_PLANKS_N = copy(OAK_PLANKS_N);
    public static final Block DARK_OAK_SLAB_N = copy(OAK_SLAB_N);
    public static final Block DARK_OAK_LEAVES_N = copy(OAK_LEAVES_N);
    public static final Block JUNGLE_LOG_N = copy(OAK_LOG_N);
    public static final Block JUNGLE_PLANKS_N = copy(OAK_PLANKS_N);
    public static final Block JUNGLE_SLAB_N = copy(OAK_SLAB_N);
    public static final Block JUNGLE_LEAVES_N = copy(OAK_LEAVES_N);
    public static final Block SPRUCE_LOG_N = copy(OAK_LOG_N);
    public static final Block SPRUCE_PLANKS_N = copy(OAK_PLANKS_N);
    public static final Block SPRUCE_SLAB_N = copy(OAK_SLAB_N);
    public static final Block SPRUCE_LEAVES_N = copy(OAK_LEAVES_N);
    public static final Block CRIMSON_LOG_N = copy(OAK_LOG_N);
    public static final Block CRIMSON_PLANKS_N = copy(OAK_PLANKS_N);
    public static final Block CRIMSON_SLAB_N = copy(OAK_SLAB_N);
    public static final Block CRIMSON_LEAVES_N = copy(OAK_LEAVES_N);
    public static final Block WARPED_LOG_N = copy(OAK_LOG_N);
    public static final Block WARPED_PLANKS_N = copy(OAK_PLANKS_N);
    public static final Block WARPED_SLAB_N = copy(OAK_SLAB_N);
    public static final Block WARPED_LEAVES_N = copy(OAK_LEAVES_N);
    //public static final Block OAK_N_SAPLING = new OakNSapling();
    public static final Block GRASS_BLOCK_N = createBlock(Material.LEAVES, 2, 10, true, BlockSoundGroup.GRASS, FabricToolTags.SHOVELS, 0, 0);
    public static final Block DIRT_N = createBlock(Material.LEAVES, 1.9f, 9, true, BlockSoundGroup.ROOTED_DIRT, FabricToolTags.SHOVELS, 0, 0);;
    public static final Block STONE_N = createBlock(Material.STONE, 2, 20, false, BlockSoundGroup.STONE, FabricToolTags.PICKAXES, 2, 0);
    public static final Block DEEPSLATE_N = copy(STONE_N);
    public static final Block COBBLED_DEEPSLATE_N = copy(STONE_N);
    public static final Block COBBLESTONE_N = copy(STONE_N);
    public static final Block SAND_N = createFallingBlock(Material.SNOW_BLOCK, 2, 10, true, BlockSoundGroup.SAND, FabricToolTags.SHOVELS, 0, 0);
    public static final Block SAND_STONE_N = copy(STONE_N);
    public static final Block NETHERRACK_N = createBlock(Material.STONE, 1.5f, 10, false, BlockSoundGroup.NETHERRACK, FabricToolTags.PICKAXES, 1, 1);
    public static final Block ANCIENT_DEBRIS_N = createPillarBlock(Material.METAL, 5, 50, false, BlockSoundGroup.ANCIENT_DEBRIS, FabricToolTags.PICKAXES, 6, 6);
    public static final Block NETHERITE_N_BLOCK = createBlock(Material.METAL, 5, 50, false, BlockSoundGroup.NETHERITE, FabricToolTags.PICKAXES, 6, 6);;
    public static final Block NETHER_N_GOLD_N_ORE = copy(NETHERRACK_N);
    public static final Block QUARTZ_N_ORE = copy(NETHERRACK_N);
    public static final Block QUARTZ_N_BLOCK = copy(COAL_N_BLOCK);
    public static final Block TARDIS = createBlock(Material.STONE, 1, 10, BlockSoundGroup.STONE, 14);
    public static final RawFilter RAW_FILTER = new RawFilter();
    public static final WheatNCrop WHEAT_N = new WheatNCrop();
    public static Block WATER_N;

    public static void register(){
        LOGGER.info("Registering blocks...");
        registerBlocks();
        LOGGER.info("Blocks Registering Complete!");
    }

    private static void registerBlocks(){
        registryBlocks(DIAMOND_N_BLOCK, "diamond_n_block", NegativeNItemGroups.BLOCKS);
        registryBlocks(DIAMOND_N_ORE, "diamond_n_ore", NegativeNItemGroups.BLOCKS);
        registryBlocks(DEEPSLATE_N_DIAMOND_N_ORE, "deepslate_n_diamond_n_ore", NegativeNItemGroups.BLOCKS);
        registryBlocks(EMERALD_N_BLOCK, "emerald_n_block", NegativeNItemGroups.BLOCKS);
        registryBlocks(EMERALD_N_ORE, "emerald_n_ore", NegativeNItemGroups.BLOCKS);
        registryBlocks(DEEPSLATE_N_EMERALD_N_ORE, "deepslate_n_emerald_n_ore", NegativeNItemGroups.BLOCKS);
        registryBlocks(REDSTONE_N_BLOCK, "redstone_n_block", NegativeNItemGroups.BLOCKS);
        registryBlocks(REDSTONE_N_ORE, "redstone_n_ore", NegativeNItemGroups.BLOCKS);
        registryBlocks(DEEPSLATE_N_REDSTONE_N_ORE, "deepslate_n_redstone_n_ore", NegativeNItemGroups.BLOCKS);
        registryBlocks(LAPIS_N_BLOCK, "lapis_n_block", NegativeNItemGroups.BLOCKS);
        registryBlocks(LAPIS_N_ORE, "lapis_n_ore", NegativeNItemGroups.BLOCKS);
        registryBlocks(DEEPSLATE_N_LAPIS_N_ORE, "deepslate_n_lapis_n_ore", NegativeNItemGroups.BLOCKS);
        registryBlocks(IRON_N_BLOCK , "iron_n_block", NegativeNItemGroups.BLOCKS);
        registryBlocks(IRON_N_ORE , "iron_n_ore", NegativeNItemGroups.BLOCKS);
        registryBlocks(DEEPSLATE_N_IRON_N_ORE, "deepslate_n_iron_n_ore", NegativeNItemGroups.BLOCKS);
        registryBlocks(GOLD_N_BLOCK, "gold_n_block", NegativeNItemGroups.BLOCKS);
        registryBlocks(GOLD_N_ORE, "gold_n_ore", NegativeNItemGroups.BLOCKS);
        registryBlocks(DEEPSLATE_N_GOLD_N_ORE, "deepslate_n_gold_n_ore", NegativeNItemGroups.BLOCKS);
        registryBlocks(COAL_N_BLOCK, "coal_n_block", NegativeNItemGroups.BLOCKS);
        registryBlocks(COAL_N_ORE, "coal_n_ore", NegativeNItemGroups.BLOCKS);
        registryBlocks(DEEPSLATE_N_COAL_N_ORE, "deepslate_n_coal_n_ore", NegativeNItemGroups.BLOCKS);
        registryBlocks(COPPER_N_BLOCK, "copper_n_block", NegativeNItemGroups.BLOCKS);
        registryBlocks(COPPER_N_ORE, "copper_n_ore", NegativeNItemGroups.BLOCKS);
        registryBlocks(DEEPSLATE_N_COPPER_N_ORE, "deepslate_n_copper_n_ore", NegativeNItemGroups.BLOCKS);
        registryBlocks(OAK_LOG_N, "oak_log_n", NegativeNItemGroups.BLOCKS);
        registryBlocks(OAK_PLANKS_N, "oak_planks_n", NegativeNItemGroups.BLOCKS);
        registryBlocks(OAK_SLAB_N, "oak_slab_n", NegativeNItemGroups.BLOCKS);
        registryBlocks(OAK_LEAVES_N, "oak_leaves_n", NegativeNItemGroups.DECO);
        registryBlocks(ACACIA_LOG_N, "acacia_log_n", NegativeNItemGroups.BLOCKS);
        registryBlocks(ACACIA_PLANKS_N, "acacia_planks_n", NegativeNItemGroups.BLOCKS);
        registryBlocks(ACACIA_SLAB_N, "acacia_slab_n", NegativeNItemGroups.BLOCKS);
        registryBlocks(ACACIA_LEAVES_N, "acacia_leaves_n", NegativeNItemGroups.DECO);
        registryBlocks(BIRCH_LOG_N, "birch_log_n", NegativeNItemGroups.BLOCKS);
        registryBlocks(BIRCH_PLANKS_N, "birch_planks_n", NegativeNItemGroups.BLOCKS);
        registryBlocks(BIRCH_SLAB_N, "birch_slab_n", NegativeNItemGroups.BLOCKS);
        registryBlocks(BIRCH_LEAVES_N, "birch_leaves_n", NegativeNItemGroups.DECO);
        registryBlocks(DARK_OAK_LOG_N, "dark_oak_log_n", NegativeNItemGroups.BLOCKS);
        registryBlocks(DARK_OAK_PLANKS_N, "dark_oak_planks_n", NegativeNItemGroups.BLOCKS);
        registryBlocks(DARK_OAK_SLAB_N, "dark_oak_slab_n", NegativeNItemGroups.BLOCKS);
        registryBlocks(DARK_OAK_LEAVES_N, "dark_oak_leaves_n", NegativeNItemGroups.DECO);
        registryBlocks(JUNGLE_LOG_N, "jungle_log_n", NegativeNItemGroups.BLOCKS);
        registryBlocks(JUNGLE_PLANKS_N, "jungle_planks_n", NegativeNItemGroups.BLOCKS);
        registryBlocks(JUNGLE_SLAB_N, "jungle_slab_n", NegativeNItemGroups.BLOCKS);
        registryBlocks(JUNGLE_LEAVES_N, "jungle_leaves_n", NegativeNItemGroups.DECO);
        registryBlocks(SPRUCE_LOG_N, "spruce_log_n", NegativeNItemGroups.BLOCKS);
        registryBlocks(SPRUCE_PLANKS_N, "spruce_planks_n", NegativeNItemGroups.BLOCKS);
        registryBlocks(SPRUCE_SLAB_N, "spruce_slab_n", NegativeNItemGroups.BLOCKS);
        registryBlocks(SPRUCE_LEAVES_N, "spruce_leaves_n", NegativeNItemGroups.DECO);
        registryBlocks(CRIMSON_LOG_N, "crimson_log_n", NegativeNItemGroups.BLOCKS);
        registryBlocks(CRIMSON_PLANKS_N, "crimson_planks_n", NegativeNItemGroups.BLOCKS);
        registryBlocks(CRIMSON_SLAB_N, "crimson_slab_n", NegativeNItemGroups.BLOCKS);
        registryBlocks(CRIMSON_LEAVES_N, "crimson_leaves_n", NegativeNItemGroups.DECO);
        registryBlocks(WARPED_LOG_N, "warped_log_n", NegativeNItemGroups.BLOCKS);
        registryBlocks(WARPED_PLANKS_N, "warped_planks_n", NegativeNItemGroups.BLOCKS);
        registryBlocks(WARPED_SLAB_N, "warped_slab_n", NegativeNItemGroups.BLOCKS);
        registryBlocks(WARPED_LEAVES_N, "warped_leaves_n", NegativeNItemGroups.DECO);
        //registryBlocks(OAK_N_SAPLING, "oak_n_sapling", NegativeNItemGroups.DECO);
        registryBlocks(GRASS_BLOCK_N, "grass_block_n", NegativeNItemGroups.BLOCKS);
        registryBlocks(DIRT_N, "dirt_n", NegativeNItemGroups.BLOCKS);
        registryBlocks(STONE_N, "stone_n", NegativeNItemGroups.BLOCKS);
        registryBlocks(COBBLESTONE_N, "cobblestone_n", NegativeNItemGroups.BLOCKS);
        registryBlocks(DEEPSLATE_N, "deepslate_n", NegativeNItemGroups.BLOCKS);
        registryBlocks(COBBLED_DEEPSLATE_N, "cobbled_deepslate_n", NegativeNItemGroups.BLOCKS);
        registryBlocks(SAND_N, "sand_n", NegativeNItemGroups.BLOCKS);
        registryBlocks(SAND_STONE_N, "sandstone_n", NegativeNItemGroups.BLOCKS);
        registryBlocks(ANCIENT_DEBRIS_N, "ancient_debris_n", NegativeNItemGroups.BLOCKS);
        registryBlocks(NETHERITE_N_BLOCK, "netherite_n_block", NegativeNItemGroups.BLOCKS);
        registryBlocks(NETHERRACK_N, "netherrack_n", NegativeNItemGroups.BLOCKS);
        registryBlocks(NETHER_N_GOLD_N_ORE, "nether_n_gold_n_ore", NegativeNItemGroups.BLOCKS);
        registryBlocks(QUARTZ_N_ORE, "quartz_n_ore", NegativeNItemGroups.BLOCKS);
        registryBlocks(QUARTZ_N_BLOCK, "quartz_n_block", NegativeNItemGroups.BLOCKS);
        registryBlocks(TARDIS, "tardis");
        registryBlocks(RAW_FILTER, "raw_filter", NegativeNItemGroups.DECO);
        registryBlocks(WHEAT_N, "wheat_n");

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

    private static SlabBlock createSlabBlock(Material material, float hardness, float resistance, boolean breakByHand, BlockSoundGroup soundGroup, Tag<Item> tags, int harvestLevel, int luminance){
        SlabBlock block;

        if(!breakByHand){
            block = new SlabBlock(FabricBlockSettings
                    .of(material)
                    .strength(hardness, resistance)
                    .breakByHand(breakByHand)
                    .requiresTool()
                    .sounds(soundGroup)
                    .breakByTool(tags, harvestLevel)
                    .luminance(luminance)
            );
        }else{
            block = new SlabBlock(FabricBlockSettings
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
