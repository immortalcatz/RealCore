package com.zoomiti.realcore.util.handlers;

import com.zoomiti.realcore.init.CoreModBlocks;
import com.zoomiti.realcore.init.CoreModItems;
import com.zoomiti.realcore.util.Log.LoggedTimer;
import com.zoomiti.realcore.util.interfaces.IHasModel;
import com.zoomiti.realcore.world.gen.WorldGenModOres;

import akka.actor.FSM.Timer;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@EventBusSubscriber
public class RegistryHandler {

	private static LoggedTimer timer = new LoggedTimer();
	
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(CoreModItems.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(CoreModBlocks.BLOCKS.toArray(new Block[0]));
	}

	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event) {
		for (Block block : CoreModBlocks.BLOCKS)
			if (block instanceof IHasModel)
				((IHasModel) block).registerModels();

		for (Item item : CoreModItems.ITEMS) 
			if (item instanceof IHasModel)
				((IHasModel) item).registerModels();
	}

	public static void preInit(FMLPreInitializationEvent event) {
		
		timer.start("Registering World Generators");
		GameRegistry.registerWorldGenerator(new WorldGenModOres(), 0);
		timer.stop();
	}

	public static void init(FMLInitializationEvent event) {
		
		timer.start("Registering Furnace Recipies");
		GameRegistry.addSmelting(CoreModBlocks.ORE_ALUMINUM, new ItemStack(CoreModItems.INGOT_ALUMINUM), .7F);
		GameRegistry.addSmelting(CoreModBlocks.ORE_COPPER, new ItemStack(CoreModItems.INGOT_COPPER), .7F);
		GameRegistry.addSmelting(CoreModBlocks.ORE_GADOLINIUM, new ItemStack(CoreModItems.INGOT_GADOLINIUM), 1F);
		GameRegistry.addSmelting(CoreModBlocks.ORE_LEAD, new ItemStack(CoreModItems.INGOT_LEAD), .7F);
		GameRegistry.addSmelting(CoreModBlocks.ORE_NICKEL, new ItemStack(CoreModItems.INGOT_NICKEL), .7F);
		GameRegistry.addSmelting(CoreModBlocks.ORE_PLATINUM, new ItemStack(CoreModItems.INGOT_PLATINUM), 1F);
		GameRegistry.addSmelting(CoreModBlocks.ORE_SILVER, new ItemStack(CoreModItems.INGOT_SILVER), 1F);
		GameRegistry.addSmelting(CoreModBlocks.ORE_TIN, new ItemStack(CoreModItems.INGOT_TIN), .7F);
		GameRegistry.addSmelting(CoreModBlocks.ORE_ZINC, new ItemStack(CoreModItems.INGOT_ZINC), .7F);
		timer.stop();
		
	}

	public static void postInit(FMLPostInitializationEvent event) {

	}
}
