package net.jephon.augmentatives;

import net.fabricmc.api.ModInitializer;

import net.jephon.augmentatives.block.ModBlocks;
import net.jephon.augmentatives.entity.ModBoats;
import net.jephon.augmentatives.item.ModItemGroups;
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
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModSounds.registerSounds();

		ModBoats.registerBoats();
		ModSit.registerSitUtil();
		}
}