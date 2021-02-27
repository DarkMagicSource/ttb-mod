package com.darkmagicsauce.ttb.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;

public class EckspeiLocker extends Machine {
	public static final IntProperty XPLEVEL = IntProperty.of("xp_level", 0, 5);

	public EckspeiLocker(Settings settings) {
		super(settings);
		setDefaultState(this.stateManager.getDefaultState().with(XPLEVEL, 0));
	}

	@Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> stateManager) {
		super.appendProperties(stateManager);
		stateManager.add(XPLEVEL);
	}
}
