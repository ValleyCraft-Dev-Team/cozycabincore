package net.linkle.cozy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.api.ModInitializer;
import net.linkle.cozy.gen.feature.TreeConfigFeatures;
import net.linkle.cozy.init.C_Blocks;
import net.linkle.cozy.init.C_Groups;
import net.linkle.cozy.init.C_Items;
import net.linkle.cozy.init.Contents;
import net.linkle.cozy.init.features.OverworldFeatures;
import net.linkle.cozy.util.ModSignType;

public class CozyCabinCore implements ModInitializer {
    public static final String MOD_ID = "cozycabincore";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
	    ModSignType.intialize();
		C_Items.intialize();
		C_Blocks.intialize();

		TreeConfigFeatures.intialize();
		OverworldFeatures.intialize();
		
		C_Groups.initialize();
		Contents.initialize();
		
		LOGGER.info("Cozy Cabincore has initialized properly!");
	}
}
