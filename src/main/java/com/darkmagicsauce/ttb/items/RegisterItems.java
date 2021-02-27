package com.darkmagicsauce.ttb.items;

import com.darkmagicsauce.ttb.TTB;
import com.darkmagicsauce.ttb.blocks.RegisterBlocks;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegisterItems {
	public static final Item ACRONITE_CAGE = new BlockItem(RegisterBlocks.ACRONITE_CAGE,
			new Item.Settings().group(TTB.ITEM_GROUP));
	public static final Item ALCHEMY_CHAMBER = new BlockItem(RegisterBlocks.ALCHEMY_CHAMBER,
			new Item.Settings().group(TTB.ITEM_GROUP));
	public static final Item AMETHYST_BLOCK = new BlockItem(RegisterBlocks.AMETHYST_BLOCK,
			new Item.Settings().group(TTB.ITEM_GROUP));
	public static final Item AMETHYST_ORE = new BlockItem(RegisterBlocks.AMETHYST_ORE,
			new Item.Settings().group(TTB.ITEM_GROUP));
	public static final Item AMETHYST_SUNPAD = new BlockItem(RegisterBlocks.AMETHYST_SUNPAD,
			new Item.Settings().group(TTB.ITEM_GROUP));
	public static final Item BREAKER = new BlockItem(RegisterBlocks.BREAKER, new Item.Settings().group(TTB.ITEM_GROUP));
	public static final Item ECKSPEI_LOCKER = new BlockItem(RegisterBlocks.ECKSPEI_LOCKER,
			new Item.Settings().group(TTB.ITEM_GROUP));
	public static final Item GROWTH_AURA = new BlockItem(RegisterBlocks.GROWTH_AURA,
			new Item.Settings().group(TTB.ITEM_GROUP));
	public static final Item RATCH_PUTTY = new BlockItem(RegisterBlocks.RATCH_PUTTY,
			new Item.Settings().group(TTB.ITEM_GROUP));
	public static final Item TEMPEST_CRAFTER = new BlockItem(RegisterBlocks.TEMPEST_CRAFTER,
			new Item.Settings().group(TTB.ITEM_GROUP));
	public static final Item TEMPITE_INSULATOR = new BlockItem(RegisterBlocks.TEMPITE_INSULATOR,
			new Item.Settings().group(TTB.ITEM_GROUP));
	public static final Item TEMPITE_STONE = new BlockItem(RegisterBlocks.TEMPITE_STONE,
			new Item.Settings().group(TTB.ITEM_GROUP));
	public static final Item TEMPITE_WIRE = new BlockItem(RegisterBlocks.TEMPITE_WIRE,
			new Item.Settings().group(TTB.ITEM_GROUP));
	public static final Item VULCAANIUM_BLOCK = new BlockItem(RegisterBlocks.VULCAANIUM_BLOCK,
			new Item.Settings().group(TTB.ITEM_GROUP));
	public static final Item VULCAANIUM_ORE = new BlockItem(RegisterBlocks.VULCAANIUM_ORE,
			new Item.Settings().group(TTB.ITEM_GROUP));

	public static void registerItems() {
		Registry.register(Registry.ITEM, new Identifier(TTB.MOD_ID, "acronite_cage"), ACRONITE_CAGE);
		Registry.register(Registry.ITEM, new Identifier(TTB.MOD_ID, "alchemy_chamber"), ALCHEMY_CHAMBER);
		Registry.register(Registry.ITEM, new Identifier(TTB.MOD_ID, "amethyst_block"), AMETHYST_BLOCK);
		Registry.register(Registry.ITEM, new Identifier(TTB.MOD_ID, "amethyst_ore"), AMETHYST_ORE);
		Registry.register(Registry.ITEM, new Identifier(TTB.MOD_ID, "amethyst_sunpad"), AMETHYST_SUNPAD);
		Registry.register(Registry.ITEM, new Identifier(TTB.MOD_ID, "breaker"), BREAKER);
		Registry.register(Registry.ITEM, new Identifier(TTB.MOD_ID, "eckspei_locker"), ECKSPEI_LOCKER);
		Registry.register(Registry.ITEM, new Identifier(TTB.MOD_ID, "growth_aura"), GROWTH_AURA);
		Registry.register(Registry.ITEM, new Identifier(TTB.MOD_ID, "ratch_putty"), RATCH_PUTTY);
		Registry.register(Registry.ITEM, new Identifier(TTB.MOD_ID, "tempest_crafter"), TEMPEST_CRAFTER);
		Registry.register(Registry.ITEM, new Identifier(TTB.MOD_ID, "tempite_insulator"), TEMPITE_INSULATOR);
		Registry.register(Registry.ITEM, new Identifier(TTB.MOD_ID, "tempite_stone"), TEMPITE_STONE);
		Registry.register(Registry.ITEM, new Identifier(TTB.MOD_ID, "tempite_wire"), TEMPITE_WIRE);
		Registry.register(Registry.ITEM, new Identifier(TTB.MOD_ID, "vulcaanium_block"), VULCAANIUM_BLOCK);
		Registry.register(Registry.ITEM, new Identifier(TTB.MOD_ID, "vulcaanium_ore"), VULCAANIUM_ORE);
	}
}
