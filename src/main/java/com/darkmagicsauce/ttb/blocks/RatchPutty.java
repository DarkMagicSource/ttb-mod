package com.darkmagicsauce.ttb.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class RatchPutty extends Block {
	private static VoxelShape shape = Block.createCuboidShape(1.0D, 0.0D, 1.0D, 15.0D, 3.0D, 15.0D);

	public RatchPutty(Settings settings) {
		super(settings);
	}

	@Override
	public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
		return shape;
	}
}
