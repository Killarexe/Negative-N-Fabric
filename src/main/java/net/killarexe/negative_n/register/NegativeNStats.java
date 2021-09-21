package net.killarexe.negative_n.register;

import net.minecraft.stat.StatFormatter;
import net.minecraft.stat.Stats;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class NegativeNStats extends NegativeNRegisterType{

    public static final Identifier INTERACT_WITH_POWDER_N = createStats("interact_with_powder_n");

    public static void register(){
        LOGGER.info("Registering stats...");
        registerStats();
        LOGGER.info("Stats Registering Complete!");
    }

    private static void registerStats(){
        registryCustomStats(INTERACT_WITH_POWDER_N, StatFormatter.DEFAULT);
    }

    private static Identifier createStats(String id){
        Identifier identifier = new Identifier(MODID, id);
        return identifier;
    };

    private static void registryCustomStats(Identifier stat, StatFormatter formatter){
        Registry.register(Registry.CUSTOM_STAT, stat.getNamespace(), stat);
        Stats.CUSTOM.getOrCreateStat(stat, formatter);
    }
}
