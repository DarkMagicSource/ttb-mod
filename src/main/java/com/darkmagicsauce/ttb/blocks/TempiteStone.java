package com.darkmagicsauce.ttb.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;

public class TempiteStone extends Block {
	public static final IntProperty POWER = IntProperty.of("power", 0, 2);

	public TempiteStone(Settings settings) {
		super(settings);
		setDefaultState(this.stateManager.getDefaultState().with(POWER, 0));
	}

	@Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> stateManager) {
		stateManager.add(POWER);
	}
}
