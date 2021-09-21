package net.killarexe.negative_n.register;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.advancement.criterion.VillagerTradeCriterion;
import net.minecraft.datafixer.fix.VillagerTradeFix;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradeOffers;
import net.minecraft.village.VillagerProfession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NegativeNVillagerTrades {


    private static final Logger LOGGER = LogManager.getLogger();

    public void register(){
        LOGGER.info("Registering Villager Trades!");
        registerTrades();
        LOGGER.info("Registering Complete!");
    }

    public void registerTrades(){

    }

    public void addTrade(){

    }
}
