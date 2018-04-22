package com.zoomiti.realcore.objects.items;

import com.zoomiti.realcore.RealCore;
import com.zoomiti.realcore.init.CoreModCreativeTabs;
import com.zoomiti.realcore.init.CoreModItems;
import com.zoomiti.realcore.util.interfaces.IHasModel;

import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		init();
		
		CoreModItems.ITEMS.add(this);
	}

	protected void init() {
		setCreativeTab(CoreModCreativeTabs.RealCoreMaterialsTab);
	}

	@Override
	public void registerModels() {
		RealCore.PROXY.registerItemRenderer(this, 0, "inventory");
	}
}
