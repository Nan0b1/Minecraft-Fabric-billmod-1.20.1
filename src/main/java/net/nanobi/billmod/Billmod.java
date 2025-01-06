package net.nanobi.billmod;

import net.fabricmc.api.ModInitializer;

import net.nanobi.billmod.block.ModBlocks;
import net.nanobi.billmod.item.ModItemGroups;
import net.nanobi.billmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Billmod implements ModInitializer {
	public static final String MOD_ID = "billmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world it's Billmod!!!");
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();
		ModItems.registerModItems();

	}
}