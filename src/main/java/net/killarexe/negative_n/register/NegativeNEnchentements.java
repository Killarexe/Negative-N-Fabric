package net.killarexe.negative_n.register;

import net.killarexe.negative_n.enchentement.Poisonus;
import net.killarexe.negative_n.enchentement.Smelting;
import net.killarexe.negative_n.enchentement.Withered;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NegativeNEnchentements extends NegativeNRegisterType{

    public static final Smelting SMELTING = new Smelting();
    public static final Poisonus POISONUS = new Poisonus();
    public static final Withered WITHERED = new Withered();

    public static void register(){
        LOGGER.info("Register Enchantements...");
        registerEnchentements(SMELTING, "smelting");
        registerEnchentements(POISONUS, "poisonus");
        registerEnchentements(WITHERED, "withered");
        LOGGER.info("Enchantements Register Complete!");
    }

    private static void registerEnchentements(Enchantment enchantment, String id){
        Registry.register(Registry.ENCHANTMENT, new Identifier(MODID, id), enchantment);
    }
}
