package net.killarexe.negative_n;

import net.fabricmc.api.ModInitializer;
import net.killarexe.negative_n.register.*;
import org.apache.logging.log4j.*;

public class NegativeNMod implements ModInitializer {

	public static String VER = "0.4a";
	public static final String MODID = "negative_n";
	private Logger LOGGER = LogManager.getLogger();

	@Override
	public void onInitialize() {
		LOGGER.info("Negative-N " + VER + " Initializing...");
		NegativeNBlocks.register();
		NegativeNItems.register();
		NegativeNFluids.register();
		NegativeNEnchentements.register();
		NegativeNBiomes.register();
		NegativeNFeatures.register();
		LOGGER.info("Negative-N " + VER + " Initialized...");
	}
}
