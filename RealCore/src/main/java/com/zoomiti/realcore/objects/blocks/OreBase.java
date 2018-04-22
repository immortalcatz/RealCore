package com.zoomiti.realcore.objects.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class OreBase extends BlockBase {

	public OreBase(String name) {
		super("ore_"+name, Material.ROCK);
	}
	
	@Override
	protected void init() {
		super.init();
		setSoundType(SoundType.STONE);
	}

}
