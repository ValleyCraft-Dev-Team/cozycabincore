package net.linkle.cozy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.api.ModInitializer;
import net.linkle.cozy.gen.feature.TreeConfigFeatures;
import net.linkle.cozy.init.ModBlocks;
import net.linkle.cozy.init.ModGroups;
import net.linkle.cozy.init.ModItems;
import net.linkle.cozy.init.ModLootTable;
import net.linkle.cozy.init.Contents;
import net.linkle.cozy.init.features.OverworldFeatures;
import net.linkle.cozy.tag.ModItemTags;
import net.linkle.cozy.util.ModSignType;

public class CozyCabinCore implements ModInitializer {
    public static final String MOD_ID = "cozycabincore";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
	    ModItemTags.initialize();
	    ModSignType.initialize();
		ModItems.initialize();
		ModBlocks.initialize();

		TreeConfigFeatures.initialize();
		OverworldFeatures.initialize();
		
		ModGroups.initialize();
		Contents.initialize();
		ModLootTable.initialize();
		
		LOGGER.info("Cozy Cabincore has initialized properly!");
	}
}
