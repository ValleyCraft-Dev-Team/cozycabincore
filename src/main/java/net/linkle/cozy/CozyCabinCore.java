package net.linkle.cozy;

import net.fabricmc.api.ModInitializer;
import net.linkle.cozy.init.C_Blocks;
import net.linkle.cozy.init.C_Groups;
import net.linkle.cozy.init.Contents;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CozyCabinCore implements ModInitializer {
    public static final String MOD_ID = "cozycabincore";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		C_Blocks.intialize();
		
		C_Groups.initialize();
		Contents.initialize();
		
		LOGGER.info("Cozy Cabincore has initialized properly!");
	}
}
