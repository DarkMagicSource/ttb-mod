package com.darkmagicsauce.ttb.blocks;

import com.darkmagicsauce.ttb.TTB;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegisterBlocks {
	public static final Block ACRONITE_CAGE = new AcroniteCage(FabricBlockSettings.of(Material.STONE)
			.breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(2.5f, 30.0f).sounds(BlockSoundGroup.STONE));
	public static final Block ALCHEMY_CHAMBER = new AlchemyChamber(FabricBlockSettings.of(Material.STONE)
			.breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(2.5f, 30.0f).sounds(BlockSoundGroup.STONE));
	public static final Block AMETHYST_BLOCK = new Block(FabricBlockSettings.of(Material.METAL)
			.breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(2.5f, 30.0f).sounds(BlockSoundGroup.METAL));
	public static final Block AMETHYST_ORE = new Block(FabricBlockSettings.of(Material.STONE)
			.breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(2.5f, 30.0f).sounds(BlockSoundGroup.STONE));
	public static final Block AMETHYST_SUNPAD = new AmethystSunpad(FabricBlockSettings.of(Material.STONE)
			.breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(2.5f, 30.0f).sounds(BlockSoundGroup.STONE));
	public static final Block BREAKER = new Breaker(FabricBlockSettings.of(Material.STONE)
			.breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(2.5f, 30.0f).sounds(BlockSoundGroup.STONE));
	public static final Block ECKSPEI_LOCKER = new EckspeiLocker(FabricBlockSettings.of(Material.STONE)
			.breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(2.5f, 30.0f).sounds(BlockSoundGroup.STONE));
	public static final Block GROWTH_AURA = new GrowthAura(FabricBlockSettings.of(Material.STONE)
			.breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(2.5f, 30.0f).sounds(BlockSoundGroup.STONE));
	public static final Block RATCH_PUTTY = new RatchPutty(
			FabricBlockSettings.of(Material.ORGANIC_PRODUCT).breakByHand(true).sounds(BlockSoundGroup.SLIME));
	public static final Block TEMPEST_CRAFTER = new TempestCrafter(FabricBlockSettings.of(Material.METAL)
			.breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(2.5f, 30.0f).sounds(BlockSoundGroup.METAL));
	public static final Block TEMPITE_INSULATOR = new TempiteInsulator(FabricBlockSettings.of(Material.STONE)
			.breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(2.5f, 30.0f).sounds(BlockSoundGroup.STONE));
	public static final Block TEMPITE_STONE = new TempiteStone(FabricBlockSettings.of(Material.STONE)
			.breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(2.5f, 30.0f).sounds(BlockSoundGroup.STONE));
	public static final Block TEMPITE_WIRE = new TempiteWire(
			FabricBlockSettings.of(Material.GLASS).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool()
					.strength(2.5f, 30.0f).sounds(BlockSoundGroup.GLASS).nonOpaque());
	public static final Block VULCAANIUM_BLOCK = new Block(FabricBlockSettings.of(Material.METAL)
			.breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(2.5f, 30.0f).sounds(BlockSoundGroup.METAL));
	public static final Block VULCAANIUM_ORE = new Block(FabricBlockSettings.of(Material.STONE)
			.breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(2.5f, 30.0f).sounds(BlockSoundGroup.STONE));

	public static void registerBlocks() {
		Registry.register(Registry.BLOCK, new Identifier(TTB.MOD_ID, "acronite_cage"), ACRONITE_CAGE);
		Registry.register(Registry.BLOCK, new Identifier(TTB.MOD_ID, "alchemy_chamber"), ALCHEMY_CHAMBER);
		Registry.register(Registry.BLOCK, new Identifier(TTB.MOD_ID, "amethyst_block"), AMETHYST_BLOCK);
		Registry.register(Registry.BLOCK, new Identifier(TTB.MOD_ID, "amethyst_ore"), AMETHYST_ORE);
		Registry.register(Registry.BLOCK, new Identifier(TTB.MOD_ID, "amethyst_sunpad"), AMETHYST_SUNPAD);
		Registry.register(Registry.BLOCK, new Identifier(TTB.MOD_ID, "breaker"), BREAKER);
		Registry.register(Registry.BLOCK, new Identifier(TTB.MOD_ID, "eckspei_locker"), ECKSPEI_LOCKER);
		Registry.register(Registry.BLOCK, new Identifier(TTB.MOD_ID, "growth_aura"), GROWTH_AURA);
		Registry.register(Registry.BLOCK, new Identifier(TTB.MOD_ID, "ratch_putty"), RATCH_PUTTY);
		Registry.register(Registry.BLOCK, new Identifier(TTB.MOD_ID, "tempest_crafter"), TEMPEST_CRAFTER);
		Registry.register(Registry.BLOCK, new Identifier(TTB.MOD_ID, "tempite_insulator"), TEMPITE_INSULATOR);
		Registry.register(Registry.BLOCK, new Identifier(TTB.MOD_ID, "tempite_stone"), TEMPITE_STONE);
		Registry.register(Registry.BLOCK, new Identifier(TTB.MOD_ID, "tempite_wire"), TEMPITE_WIRE);
		Registry.register(Registry.BLOCK, new Identifier(TTB.MOD_ID, "vulcaanium_block"), VULCAANIUM_BLOCK);
		Registry.register(Registry.BLOCK, new Identifier(TTB.MOD_ID, "vulcaanium_ore"), VULCAANIUM_ORE);
	}
}
