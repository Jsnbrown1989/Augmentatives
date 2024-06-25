package net.jephon.augmentatives;

import net.fabricmc.api.ModInitializer;
import net.jephon.augmentatives.block.ModBlocks;
import net.jephon.augmentatives.item.BuildingItemGroups;
import net.jephon.augmentatives.item.CobbledItemGroups;
import net.jephon.augmentatives.item.OrganicItemGroups;
import net.jephon.augmentatives.item.TrafficItemGroups;
import net.jephon.augmentatives.item.ModItemGroup;
import net.jephon.augmentatives.item.ModItems;
import net.jephon.augmentatives.sound.ModSounds;
import net.jephon.augmentatives.util.ModSit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Augmentatives implements ModInitializer {
	public static final String MOD_ID = "augmentatives";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		TrafficItemGroups.registerItemGroups();
		BuildingItemGroups.registerItemGroups();
		CobbledItemGroups.registerItemGroups();
		OrganicItemGroups.registerItemGroups();

		// Prep for Future Versions
		// furnitureItemGroups.registerItemGroups();

        // Always Last
		ModItemGroup.registerItemGroups();



		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModSounds.registerSounds();

		ModSit.registerSitUtil();
		}
}