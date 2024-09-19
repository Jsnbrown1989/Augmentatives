package net.jephon.augmentatives;

import net.fabricmc.api.ModInitializer;
import net.jephon.augmentatives.block.ModBlocks;
import net.jephon.augmentatives.item.*;
import net.jephon.augmentatives.util.ModSit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Augmentatives implements ModInitializer {
	public static final String MOD_ID = "augmentatives";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		TrafficItemGroups.registerItemGroups();
		UtilityItemGroups.registerItemGroups();
		BuildingItemGroups.registerItemGroups();
		CobbledItemGroups.registerItemGroups();
		OrganicItemGroups.registerItemGroups();

		// Prep for Future Versions
		// furnitureItemGroups.registerItemGroups();

        // Always Last
		ModItemGroup.registerItemGroups();



		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModSit.registerSitUtil();
		}
}