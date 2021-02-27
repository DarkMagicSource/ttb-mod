package com.darkmagicsauce.ttb;

import com.darkmagicsauce.ttb.blocks.RegisterBlocks;
import com.darkmagicsauce.ttb.items.RegisterItems;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class TTB implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MOD_ID = "ttb";
	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "general"),
			() -> new ItemStack(RegisterItems.TEMPEST_CRAFTER));

	@Override
	public void onInitialize() {
		// Register Mod contents
		RegisterBlocks.registerBlocks();
		RegisterItems.registerItems();
		LOGGER.info("[TTB] Loaded...");
	}
}
