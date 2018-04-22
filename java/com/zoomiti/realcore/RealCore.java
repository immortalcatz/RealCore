package com.zoomiti.realcore;

import com.zoomiti.realcore.proxy.CommonProxy;
import com.zoomiti.realcore.util.Reference;
import com.zoomiti.realcore.util.handlers.PluginHandler;
import com.zoomiti.realcore.util.handlers.RegistryHandler;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent.OnConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(name=Reference.NAME, modid=Reference.MODID, acceptedMinecraftVersions=Reference.MCVERSION, version=Reference.VERSION)
public class RealCore {

	@Instance
	public static RealCore INSTANCE;
	
	@SidedProxy(clientSide=Reference.CLIENT_PROXY, serverSide=Reference.COMMON_PROXY)
	public static CommonProxy PROXY;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		RegistryHandler.preInit(event);
		PluginHandler.preInit(event);
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		RegistryHandler.init(event);
		PluginHandler.init(event);
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
		RegistryHandler.postInit(event);
		PluginHandler.postInit(event);
	}
	
	@SubscribeEvent
	public static void onConfigChanged(OnConfigChangedEvent event) {
		if (event.getModID().equals(Reference.MODID)) {
			ConfigManager.sync(Reference.MODID, Config.Type.INSTANCE);
		}
	}
}
