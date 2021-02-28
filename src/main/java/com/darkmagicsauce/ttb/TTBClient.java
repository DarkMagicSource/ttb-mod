package com.darkmagicsauce.ttb;

import com.darkmagicsauce.ttb.blocks.RegisterBlocks;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class TTBClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlock(RegisterBlocks.TEMPITE_WIRE, RenderLayer.getCutout());
		TTB.LOGGER.info("[TTB] Client Loaded");
	}
}
