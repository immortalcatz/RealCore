package com.zoomiti.realcore.util.handlers;

import java.util.ArrayList;
import java.util.List;

import com.zoomiti.realcore.util.compat.JerPlugin;
import com.zoomiti.realcore.util.compat.OreDictPlugin;
import com.zoomiti.realcore.util.interfaces.IPlugin;

import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class PluginHandler {

	public static final List<IPlugin> plugins = new ArrayList<>();

	static {
		plugins.add(new OreDictPlugin());
		if (Loader.isModLoaded("jeresources")) {
			plugins.add(new JerPlugin());
		}
	}

	public static void preInit(FMLPreInitializationEvent event) {
		for (IPlugin plugin : plugins)
			plugin.preInit(event);
	}

	public static void init(FMLInitializationEvent event) {
		for (IPlugin plugin : plugins)
			plugin.init(event);
	}

	public static void postInit(FMLPostInitializationEvent event) {
		for (IPlugin plugin : plugins)
			plugin.postInit(event);
	}

}