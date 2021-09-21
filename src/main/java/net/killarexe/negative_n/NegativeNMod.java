package net.killarexe.negative_n;

import net.fabricmc.api.ModInitializer;
import net.killarexe.negative_n.register.*;
import org.apache.logging.log4j.*;

import java.util.ArrayList;
import java.util.List;

public class NegativeNMod implements ModInitializer {

	public static String VER = "0.4a";
	public static final String MODID = "negative_n";
	private Logger LOGGER = LogManager.getLogger();

	@Override
	public void onInitialize() {
		LOGGER.info("Negative-N " + VER + " Initializing...");
		NegativeNItems.register();
		NegativeNBlocks.register();
		NegativeNFluids.register();
		NegativeNFeatures.register();
		NegativeNBiomes.register();
		NegativeNStats.register();
		NegativeNTileEnitys.register();
		NegativeNVillagerTrades.register();
		NegativeNEnchentements.register();
		NegativeNPotions.register();
		LOGGER.info("Negative-N " + VER + " Initialized...");
	}
}
