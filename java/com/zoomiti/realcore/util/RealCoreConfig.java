package com.zoomiti.realcore.util;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Config.Comment;
import net.minecraftforge.common.config.Config.Name;
import net.minecraftforge.common.config.Config.RangeInt;

@Config(modid = Reference.MODID, name = Reference.NAME)
public class RealCoreConfig {

	@Name("WorldGen Config")
	@Comment("Config options for world generation")
	public static WorldGenConfig worldGenConfig = new WorldGenConfig();
	public static class WorldGenConfig {
		private WorldGenConfig() {}
		
		@Name("Is any RealCore generation enabled?")
		@Comment("Master Control for world gen")
		public boolean isWorldGenEnabled = true;

		@Name("Ore Config")
		@Comment("Config options for ore world gen")
		public OreConfig oreConfig = new OreConfig();
		public static class OreConfig {
			
			@Name("Aluminum Ore Config")
			@Comment("Config options for aluminum ore")
			public AluminumOreConfig aluminumOreConfig = new AluminumOreConfig();
			public static class AluminumOreConfig {

				@Name("Aluminum Ore Gen")
				@Comment("Controls aluminum ore generation")
				public boolean aluminumOreGen = true;

				@Name("Max Y Aluminum")
				@Comment({ "Max Y Level where aluminum ore spawns", "Must be greater than min" })
				@RangeInt(min = 2, max = 255)
				public int maxHeightAluminum = 50;

				@Name("Min Y Aluminum")
				@Comment({ "Min Y Level where aluminum ore spawns", "Must be less than max" })
				@RangeInt(min = 1, max = 254)
				public int minHeightAluminum = 1;
				
				@Name("Aluminum o/c")
				@Comment("Aluminum ores per chunk")
				@RangeInt(min = 1)
				public int aluminumOresPerChunk = 20;

			}
		
			@Name("Copper Ore Config")
			@Comment("Config options for copper ore")
			public CopperOreConfig copperOreConfig = new CopperOreConfig();
			public static class CopperOreConfig {

				@Name("Copper Ore Gen")
				@Comment("Controls copper ore generation")
				public boolean copperOreGen = true;

				@Name("Max Y Copper")
				@Comment({ "Max Y Level where copper ore spawns", "Must be greater than min" })
				@RangeInt(min = 2, max = 255)
				public int maxHeightCopper = 50;

				@Name("Min Y Copper")
				@Comment({ "Min Y Level where copper ore spawns", "Must be less than max" })
				@RangeInt(min = 1, max = 254)
				public int minHeightCopper = 1;

				@Name("Copper o/c")
				@Comment("Copper ores per chunk")
				@RangeInt(min = 1)
				public int copperOresPerChunk = 20;

			}
		
			@Name("Gadolinium Ore Config")
			@Comment("Config options for gadolinium ore")
			public GadoliniumOreConfig gadoliniumOreConfig = new GadoliniumOreConfig();
			public static class GadoliniumOreConfig {

				@Name("Gadolinium Ore Gen")
				@Comment("Controls gadolinium ore generation")
				public boolean gadoliniumOreGen = true;

				@Name("Max Y Gadolinium")
				@Comment({ "Max Y Level where gadolinium ore spawns", "Must be greater than min" })
				@RangeInt(min = 2, max = 255)
				public int maxHeightGadolinium = 30;

				@Name("Min Y Gadolinium")
				@Comment({ "Min Y Level where gadolinium ore spawns", "Must be less than max" })
				@RangeInt(min = 1, max = 254)
				public int minHeightGadolinium = 1;
				
				@Name("Gadolinium o/c")
				@Comment("Gadolinium ores per chunk")
				@RangeInt(min = 1)
				public int gadoliniumOresPerChunk = 10;

			}
		
			@Name("Lead Ore Config")
			@Comment("Config options for lead ore")
			public LeadOreConfig leadOreConfig = new LeadOreConfig();
			public static class LeadOreConfig {

				@Name("Lead Ore Gen")
				@Comment("Controls lead ore generation")
				public boolean leadOreGen = true;

				@Name("Max Y Lead")
				@Comment({ "Max Y Level where lead ore spawns", "Must be greater than min" })
				@RangeInt(min = 2, max = 255)
				public int maxHeightLead = 40;

				@Name("Min Y Lead")
				@Comment({ "Min Y Level where lead ore spawns", "Must be less than max" })
				@RangeInt(min = 1, max = 254)
				public int minHeightLead = 1;

				@Name("Lead o/c")
				@Comment("Lead ores per chunk")
				@RangeInt(min = 1)
				public int leadOresPerChunk = 15;

			}
		
			@Name("Nickel Ore Config")
			@Comment("Config options for nickel ore")
			public NickelOreConfig nickelOreConfig = new NickelOreConfig();
			public static class NickelOreConfig {

				@Name("Nickel Ore Gen")
				@Comment("Controls nickel ore generation")
				public boolean nickelOreGen = true;

				@Name("Max Y Nickel")
				@Comment({ "Max Y Level where nickel ore spawns", "Must be greater than min" })
				@RangeInt(min = 2, max = 255)
				public int maxHeightNickel = 50;

				@Name("Min Y Nickel")
				@Comment({ "Min Y Level where nickel ore spawns", "Must be less than max" })
				@RangeInt(min = 1, max = 254)
				public int minHeightNickel = 1;

				@Name("Nickel o/c")
				@Comment(" nickel ores per chunk")
				@RangeInt(min = 1)
				public int nickelOresPerChunk = 20;

			}
		
			@Name("Platinum Ore Config")
			@Comment("Config options for platinum ore")
			public PlatinumOreConfig platinumOreConfig = new PlatinumOreConfig();
			public static class PlatinumOreConfig {

				@Name("Platinum Ore Gen")
				@Comment("Controls platinum ore generation")
				public boolean platinumOreGen = true;

				@Name("Max Y Platinum")
				@Comment({ "Max Y Level where platinum ore spawns", "Must be greater than min" })
				@RangeInt(min = 2, max = 255)
				public int maxHeightPlatinum = 30;

				@Name("Min Y Platinum")
				@Comment({ "Min Y Level where platinum ore spawns", "Must be less than max" })
				@RangeInt(min = 1, max = 254)
				public int minHeightPlatinum = 1;

				@Name("Platinum o/c")
				@Comment("Platinum ores per chunk")
				@RangeInt(min = 1)
				public int platinumOresPerChunk = 10;
				
			}
		
			@Name("Silver Ore Config")
			@Comment("Config options for silver ore")
			public SilverOreConfig silverOreConfig = new SilverOreConfig();
			public static class SilverOreConfig {

				@Name("Silver Ore Gen")
				@Comment("Controls silver ore generation")
				public boolean silverOreGen = true;

				@Name("Max Y Silver")
				@Comment({ "Max Y Level where silver ore spawns", "Must be greater than min" })
				@RangeInt(min = 2, max = 255)
				public int maxHeightSilver = 30;

				@Name("Min Y Silver")
				@Comment({ "Min Y Level where silver ore spawns", "Must be less than max" })
				@RangeInt(min = 1, max = 254)
				public int minHeightSilver = 1;
				
				@Name("Silver o/c")
				@Comment("Silver ores per chunk")
				@RangeInt(min = 1)
				public int silverOresPerChunk = 10;
				
			}

			@Name("Tin Ore Config")
			@Comment("Config options for tin ore")
			public TinOreConfig tinOreConfig = new TinOreConfig();
			public static class TinOreConfig {

				@Name("Tin Ore Gen")
				@Comment("Controls tin ore generation")
				public boolean tinOreGen = true;

				@Name("Max Y Tin")
				@Comment({ "Max Y Level where tin ore spawns", "Must be greater than min" })
				@RangeInt(min = 2, max = 255)
				public int maxHeightTin = 50;

				@Name("Min Y Tin")
				@Comment({ "Min Y Level where tin ore spawns", "Must be less than max" })
				@RangeInt(min = 1, max = 254)
				public int minHeightTin = 1;
				
				@Name("Tin o/c")
				@Comment("Tin ores per chunk")
				@RangeInt(min = 1)
				public int tinOresPerChunk = 20;
				
			}

			@Name("Zinc Ore Config")
			@Comment("Config options for zinc ore")
			public ZincOreConfig zincOreConfig = new ZincOreConfig();
			public static class ZincOreConfig {

				@Name("Zinc Ore Gen")
				@Comment("Controls zinc ore generation")
				public boolean zincOreGen = true;

				@Name("Max Y Zinc")
				@Comment({ "Max Y Level where zinc ore spawns", "Must be greater than min" })
				@RangeInt(min = 2, max = 255)
				public int maxHeightZinc = 70;

				@Name("Min Y Zinc")
				@Comment({ "Min Y Level where zinc ore spawns", "Must be less than max" })
				@RangeInt(min = 1, max = 254)
				public int minHeightZinc = 1;

				@Name("Zinc o/c")
				@Comment("Zinc ores per chunk")
				@RangeInt(min = 1)
				public int zincOresPerChunk = 30;
				
			}
		
		}
	
	}

}
