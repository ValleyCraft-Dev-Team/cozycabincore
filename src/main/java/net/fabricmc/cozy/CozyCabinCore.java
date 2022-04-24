package net.fabricmc.cozy;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.cozy.Init.C_Blocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CozyCabinCore implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");
	public static final String MOD_ID = "cozycabincore";

	@Override
	public void onInitialize() {

		C_Blocks.intialize();

		LOGGER.info("Cozy Cabincore has initialized properly!");
	}
}
