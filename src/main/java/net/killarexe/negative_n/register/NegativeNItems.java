package net.killarexe.negative_n.register;

import net.killarexe.negative_n.item.*;
import net.killarexe.negative_n.util.material.armor.BaseArmor;
import net.killarexe.negative_n.util.material.armor.CustomArmorMaterial;
import net.killarexe.negative_n.util.material.tool.BaseTool;
import net.killarexe.negative_n.util.material.tool.CustomToolMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NegativeNItems {

    static String MODID = "negative_n";
    static Logger LOGGER = LogManager.getLogger();

    //Items
    public static final DiamondN DIAMOND_N = new DiamondN();
    public static final IronNIngot IRON_N_INGOT = new IronNIngot();
    public static final RawIronN RAW_IRON_N = new RawIronN();
    public static final CoalN COAL_N = new CoalN();
    public static final StickN STICK_N = new StickN();
    public static final LeatherN LEATHER_N = new LeatherN();
    public static final PowderN POWDER_N = new PowderN();
    public static final UnderworldArtefact UNDERWORLD_ARTEFACT = new UnderworldArtefact();
    public static final GoldNIngot GOLD_N_INGOT = new GoldNIngot();
    public static final RawGoldN RAW_GOLD_N = new RawGoldN();
    public static final NetheriteNScrap NETHERITE_N_SCRAP = new NetheriteNScrap();
    public static final NetheriteNIngot NETHERITE_N_INGOT = new NetheriteNIngot();

    //Tools
    public static final ToolItem DIAMOND_N_SWORD = new BaseTool().SWORD(CustomToolMaterial.DIAMOND_N);
    public static final ToolItem DIAMOND_N_PICKAXE = new BaseTool().PICKAXE(CustomToolMaterial.DIAMOND_N);
    public static final ToolItem DIAMOND_N_AXE = new BaseTool().AXE(CustomToolMaterial.DIAMOND_N);
    public static final ToolItem DIAMOND_N_SHOVEL = new BaseTool().SHOVEL(CustomToolMaterial.DIAMOND_N);
    public static final ToolItem DIAMOND_N_HOE = new BaseTool().HOE(CustomToolMaterial.DIAMOND_N);
    public static final ToolItem IRON_N_SWORD = new BaseTool().SWORD(CustomToolMaterial.IRON_N);
    public static final ToolItem IRON_N_PICKAXE = new BaseTool().PICKAXE(CustomToolMaterial.IRON_N);
    public static final ToolItem IRON_N_AXE = new BaseTool().AXE(CustomToolMaterial.IRON_N);
    public static final ToolItem IRON_N_SHOVEL = new BaseTool().SHOVEL(CustomToolMaterial.IRON_N);
    public static final ToolItem IRON_N_HOE = new BaseTool().HOE(CustomToolMaterial.IRON_N);
    public static final ToolItem GOLD_N_SWORD = new BaseTool().SWORD(CustomToolMaterial.GOLD_N);
    public static final ToolItem GOLD_N_PICKAXE = new BaseTool().PICKAXE(CustomToolMaterial.GOLD_N);
    public static final ToolItem GOLD_N_AXE = new BaseTool().AXE(CustomToolMaterial.GOLD_N);
    public static final ToolItem GOLD_N_SHOVEL = new BaseTool().SHOVEL(CustomToolMaterial.GOLD_N);
    public static final ToolItem GOLD_N_HOE = new BaseTool().HOE(CustomToolMaterial.GOLD_N);
    public static final ToolItem WOODEN_N_SWORD = new BaseTool().SWORD(CustomToolMaterial.WOODEN_N);
    public static final ToolItem WOODEN_N_PICKAXE = new BaseTool().PICKAXE(CustomToolMaterial.WOODEN_N);
    public static final ToolItem WOODEN_N_AXE = new BaseTool().AXE(CustomToolMaterial.WOODEN_N);
    public static final ToolItem WOODEN_N_SHOVEL = new BaseTool().SHOVEL(CustomToolMaterial.WOODEN_N);
    public static final ToolItem WOODEN_N_HOE = new BaseTool().HOE(CustomToolMaterial.WOODEN_N);
    public static final ToolItem COBBLESTONE_N_SWORD = new BaseTool().SWORD(CustomToolMaterial.COBBLESTONE_N);
    public static final ToolItem COBBLESTONE_N_PICKAXE = new BaseTool().PICKAXE(CustomToolMaterial.COBBLESTONE_N);
    public static final ToolItem COBBLESTONE_N_AXE = new BaseTool().AXE(CustomToolMaterial.COBBLESTONE_N);
    public static final ToolItem COBBLESTONE_N_SHOVEL = new BaseTool().SHOVEL(CustomToolMaterial.COBBLESTONE_N);
    public static final ToolItem COBBLESTONE_N_HOE = new BaseTool().HOE(CustomToolMaterial.COBBLESTONE_N);
    public static final ToolItem NETHERITE_N_SWORD = new BaseTool().SWORD(CustomToolMaterial.NETHERITE_N);
    public static final ToolItem NETHERITE_N_PICKAXE = new BaseTool().PICKAXE(CustomToolMaterial.NETHERITE_N);
    public static final ToolItem NETHERITE_N_AXE = new BaseTool().AXE(CustomToolMaterial.NETHERITE_N);
    public static final ToolItem NETHERITE_N_SHOVEL = new BaseTool().SHOVEL(CustomToolMaterial.NETHERITE_N);
    public static final ToolItem NETHERITE_N_HOE = new BaseTool().HOE(CustomToolMaterial.NETHERITE_N);

    //Armor
    public static final Item DIAMOND_N_HELMET = new BaseArmor(CustomArmorMaterial.DIAMOND_N, EquipmentSlot.HEAD);
    public static final Item DIAMOND_N_CHESTPLATE = new BaseArmor(CustomArmorMaterial.DIAMOND_N, EquipmentSlot.CHEST);
    public static final Item DIAMOND_N_LEGGINGS = new BaseArmor(CustomArmorMaterial.DIAMOND_N, EquipmentSlot.LEGS);
    public static final Item DIAMOND_N_BOOTS = new BaseArmor(CustomArmorMaterial.DIAMOND_N, EquipmentSlot.FEET);
    public static final Item IRON_N_HELMET = new BaseArmor(CustomArmorMaterial.IRON_N, EquipmentSlot.HEAD);
    public static final Item IRON_N_CHESTPLATE = new BaseArmor(CustomArmorMaterial.IRON_N, EquipmentSlot.CHEST);
    public static final Item IRON_N_LEGGINGS = new BaseArmor(CustomArmorMaterial.IRON_N, EquipmentSlot.LEGS);
    public static final Item IRON_N_BOOTS = new BaseArmor(CustomArmorMaterial.IRON_N, EquipmentSlot.FEET);
    public static final Item GOLD_N_HELMET = new BaseArmor(CustomArmorMaterial.GOLD_N, EquipmentSlot.HEAD);
    public static final Item GOLD_N_CHESTPLATE = new BaseArmor(CustomArmorMaterial.GOLD_N, EquipmentSlot.CHEST);
    public static final Item GOLD_N_LEGGINGS = new BaseArmor(CustomArmorMaterial.GOLD_N, EquipmentSlot.LEGS);
    public static final Item GOLD_N_BOOTS = new BaseArmor(CustomArmorMaterial.GOLD_N, EquipmentSlot.FEET);
    public static final Item LEATHER_N_HELMET = new BaseArmor(CustomArmorMaterial.LEATHER_N, EquipmentSlot.HEAD);
    public static final Item LEATHER_N_CHESTPLATE = new BaseArmor(CustomArmorMaterial.LEATHER_N, EquipmentSlot.CHEST);
    public static final Item LEATHER_N_LEGGINGS = new BaseArmor(CustomArmorMaterial.LEATHER_N, EquipmentSlot.LEGS);
    public static final Item LEATHER_N_BOOTS = new BaseArmor(CustomArmorMaterial.LEATHER_N, EquipmentSlot.FEET);
    public static final Item NETHERITE_N_HELMET = new BaseArmor(CustomArmorMaterial.NETHERITE_N, EquipmentSlot.HEAD);
    public static final Item NETHERITE_N_CHESTPLATE = new BaseArmor(CustomArmorMaterial.NETHERITE_N, EquipmentSlot.CHEST);
    public static final Item NETHERITE_N_LEGGINGS = new BaseArmor(CustomArmorMaterial.NETHERITE_N, EquipmentSlot.LEGS);
    public static final Item NETHERITE_N_BOOTS = new BaseArmor(CustomArmorMaterial.NETHERITE_N, EquipmentSlot.FEET);


    public static void register(){
        LOGGER.info("Registering Items...");
        registerItem(DIAMOND_N, "diamond_n");
        registerItem(DIAMOND_N_HELMET, "diamond_n_helmet");
        registerItem(DIAMOND_N_CHESTPLATE, "diamond_n_chestplate");
        registerItem(DIAMOND_N_LEGGINGS, "diamond_n_leggings");
        registerItem(DIAMOND_N_BOOTS, "diamond_n_boots");
        registerItem(DIAMOND_N_SWORD, "diamond_n_sword");
        registerItem(DIAMOND_N_PICKAXE, "diamond_n_pickaxe");
        registerItem(DIAMOND_N_AXE, "diamond_n_axe");
        registerItem(DIAMOND_N_SHOVEL, "diamond_n_shovel");
        registerItem(DIAMOND_N_HOE, "diamond_n_hoe");
        registerItem(IRON_N_INGOT, "iron_n_ingot");
        registerItem(RAW_IRON_N, "raw_iron_n");
        registerItem(IRON_N_HELMET, "iron_n_helmet");
        registerItem(IRON_N_CHESTPLATE, "iron_n_chestplate");
        registerItem(IRON_N_LEGGINGS, "iron_n_leggings");
        registerItem(IRON_N_BOOTS, "iron_n_boots");
        registerItem(IRON_N_SWORD, "iron_n_sword");
        registerItem(IRON_N_PICKAXE, "iron_n_pickaxe");
        registerItem(IRON_N_AXE, "iron_n_axe");
        registerItem(IRON_N_SHOVEL, "iron_n_shovel");
        registerItem(IRON_N_HOE, "iron_n_hoe");
        registerItem(COAL_N, "coal_n");
        registerItem(STICK_N, "stick_n");
        registerItem(LEATHER_N, "leather_n");
        registerItem(POWDER_N, "negative_dust");
        registerItem(UNDERWORLD_ARTEFACT, "underworld_artefact");
        registerItem(GOLD_N_INGOT, "gold_n_ingot");
        registerItem(RAW_GOLD_N, "raw_gold_n");
        registerItem(GOLD_N_HELMET, "gold_n_helmet");
        registerItem(GOLD_N_CHESTPLATE, "gold_n_chestplate");
        registerItem(GOLD_N_LEGGINGS, "gold_n_leggings");
        registerItem(GOLD_N_BOOTS, "gold_n_boots");
        registerItem(GOLD_N_SWORD, "gold_n_sword");
        registerItem(GOLD_N_PICKAXE, "gold_n_pickaxe");
        registerItem(GOLD_N_AXE, "gold_n_axe");
        registerItem(GOLD_N_SHOVEL, "gold_n_shovel");
        registerItem(GOLD_N_HOE, "gold_n_hoe");
        registerItem(WOODEN_N_SWORD, "wooden_n_sword");
        registerItem(WOODEN_N_PICKAXE, "wooden_n_pickaxe");
        registerItem(WOODEN_N_AXE, "wooden_n_axe");
        registerItem(WOODEN_N_SHOVEL, "wooden_n_shovel");
        registerItem(WOODEN_N_HOE, "wooden_n_hoe");
        registerItem(COBBLESTONE_N_SWORD, "cobblestone_n_sword");
        registerItem(COBBLESTONE_N_PICKAXE, "cobblestone_n_pickaxe");
        registerItem(COBBLESTONE_N_AXE, "cobblestone_n_axe");
        registerItem(COBBLESTONE_N_SHOVEL, "cobblestone_n_shovel");
        registerItem(COBBLESTONE_N_HOE, "cobblestone_n_hoe");
        registerItem(LEATHER_N_HELMET, "leather_n_helmet");
        registerItem(LEATHER_N_CHESTPLATE, "leather_n_chestplate");
        registerItem(LEATHER_N_LEGGINGS, "leather_n_leggings");
        registerItem(LEATHER_N_BOOTS, "leather_n_boots");
        registerItem(NETHERITE_N_SWORD, "netherite_n_sword");
        registerItem(NETHERITE_N_PICKAXE, "netherite_n_pickaxe");
        registerItem(NETHERITE_N_AXE, "netherite_n_axe");
        registerItem(NETHERITE_N_SHOVEL, "netherite_n_shovel");
        registerItem(NETHERITE_N_HOE, "netherite_n_hoe");
        registerItem(NETHERITE_N_HELMET, "netherite_n_helmet");
        registerItem(NETHERITE_N_CHESTPLATE, "netherite_n_chestplate");
        registerItem(NETHERITE_N_LEGGINGS, "netherite_n_leggings");
        registerItem(NETHERITE_N_BOOTS, "netherite_n_boots");
        registerItem(NETHERITE_N_SCRAP, "netherite_n_scrap");
        registerItem(NETHERITE_N_INGOT, "netherite_n_ingot");

        LOGGER.info("Items Registering Complete!");
    }

    private static void registerItem(Item item, String id){
        Registry.register(Registry.ITEM, new Identifier(MODID, id), item);
    }
}
