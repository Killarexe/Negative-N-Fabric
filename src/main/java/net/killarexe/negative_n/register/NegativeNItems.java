package net.killarexe.negative_n.register;

import net.killarexe.negative_n.item.*;
import net.killarexe.negative_n.util.material.armor.BaseArmor;
import net.killarexe.negative_n.util.material.armor.CustomArmorMaterial;
import net.killarexe.negative_n.util.material.tool.BaseTool;
import net.killarexe.negative_n.util.material.tool.CustomToolMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NegativeNItems {

    static String MODID = "negative_n";
    static Logger LOGGER = LogManager.getLogger();

    public static final DiamondN DIAMOND_N = new DiamondN();
    public static final Item DIAMOND_N_HELMET = new BaseArmor(CustomArmorMaterial.DIAMOND_N, EquipmentSlot.HEAD);
    public static final Item DIAMOND_N_CHESTPLATE = new BaseArmor(CustomArmorMaterial.DIAMOND_N, EquipmentSlot.CHEST);
    public static final Item DIAMOND_N_LEGGINGS = new BaseArmor(CustomArmorMaterial.DIAMOND_N, EquipmentSlot.LEGS);
    public static final Item DIAMOND_N_BOOTS = new BaseArmor(CustomArmorMaterial.DIAMOND_N, EquipmentSlot.FEET);
    public static final ToolItem DIAMOND_N_SWORD = new BaseTool().SWORD(CustomToolMaterial.DIAMOND_N);
    public static final ToolItem DIAMOND_N_PICKAXE = new BaseTool().PICKAXE(CustomToolMaterial.DIAMOND_N);
    public static final ToolItem DIAMOND_N_AXE = new BaseTool().AXE(CustomToolMaterial.DIAMOND_N);
    public static final ToolItem DIAMOND_N_SHOVEL = new BaseTool().SHOVEL(CustomToolMaterial.DIAMOND_N);
    public static final ToolItem DIAMOND_N_HOE = new BaseTool().HOE(CustomToolMaterial.DIAMOND_N);
    public static final IronNIngot IRON_N_INGOT = new IronNIngot();
    public static final RawIronN RAW_IRON_N = new RawIronN();
    public static final Item IRON_N_HELMET = new BaseArmor(CustomArmorMaterial.IRON_N, EquipmentSlot.HEAD);
    public static final Item IRON_N_CHESTPLATE = new BaseArmor(CustomArmorMaterial.IRON_N, EquipmentSlot.CHEST);
    public static final Item IRON_N_LEGGINGS = new BaseArmor(CustomArmorMaterial.IRON_N, EquipmentSlot.LEGS);
    public static final Item IRON_N_BOOTS = new BaseArmor(CustomArmorMaterial.IRON_N, EquipmentSlot.FEET);
    public static final ToolItem IRON_N_SWORD = new BaseTool().SWORD(CustomToolMaterial.IRON_N);
    public static final ToolItem IRON_N_PICKAXE = new BaseTool().PICKAXE(CustomToolMaterial.IRON_N);
    public static final ToolItem IRON_N_AXE = new BaseTool().AXE(CustomToolMaterial.IRON_N);
    public static final ToolItem IRON_N_SHOVEL = new BaseTool().SHOVEL(CustomToolMaterial.IRON_N);
    public static final ToolItem IRON_N_HOE = new BaseTool().HOE(CustomToolMaterial.IRON_N);
    public static final CoalN COAL_N = new CoalN();
    public static final StickN STICK_N = new StickN();
    public static final PowderN POWDER_N = new PowderN();
    public static final UnderworldArtefact UNDERWORLD_ARTEFACT = new UnderworldArtefact();

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
        registerItem(POWDER_N, "negative_dust");
        registerItem(UNDERWORLD_ARTEFACT, "underworld_artefact");
        LOGGER.info("Items Registering Complete!");
    }

    private static void registerItem(Item item, String id){
        Registry.register(Registry.ITEM, new Identifier(MODID, id), item);
    }
}
