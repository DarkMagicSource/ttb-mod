package com.darkmagicsauce.ttb.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;

public class AmethystSunpad extends Block {
	public static final BooleanProperty POWERED = BooleanProperty.of("powered");

	public AmethystSunpad(Settings settings) {
		super(settings);
		setDefaultState(this.stateManager.getDefaultState().with(POWERED, false));
	}

	@Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> stateManager) {
		stateManager.add(POWERED);
	}
}
