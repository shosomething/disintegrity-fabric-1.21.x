package net.shosomething.disintegrity;

import net.fabricmc.api.ModInitializer;

import net.shosomething.disintegrity.block.ModBlocks;
import net.shosomething.disintegrity.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Disintegrity implements ModInitializer {
	public static final String MOD_ID = "disintegrity";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}