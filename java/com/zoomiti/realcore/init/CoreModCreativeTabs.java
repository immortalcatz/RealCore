package com.zoomiti.realcore.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CoreModCreativeTabs {

	public static final CreativeTabs RealCoreMaterialsTab = new MainCoreCreativeTab("realcorematerialstab");
	
	private static class MainCoreCreativeTab extends CreativeTabs {

		public MainCoreCreativeTab(String name) {
			super(name);
		}

		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(CoreModItems.INGOT_COPPER);
		}
		
	}

}
