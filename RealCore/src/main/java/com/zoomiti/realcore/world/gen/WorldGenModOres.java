package com.zoomiti.realcore.world.gen;

import java.util.Random;

import com.zoomiti.realcore.init.CoreModBlocks;
import com.zoomiti.realcore.util.RealCoreConfig;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenModOres implements IWorldGenerator {

	private final WorldGenerator ore_aluminum, ore_copper, ore_gadolinium, ore_lead, ore_nickel, ore_platinum,
			ore_silver, ore_tin, ore_zinc;

	public WorldGenModOres() {
		ore_aluminum = new WorldGenMinable(CoreModBlocks.ORE_ALUMINUM.getDefaultState(), 6);
		ore_copper = new WorldGenMinable(CoreModBlocks.ORE_COPPER.getDefaultState(), 6);
		ore_gadolinium = new WorldGenMinable(CoreModBlocks.ORE_GADOLINIUM.getDefaultState(), 2);
		ore_lead = new WorldGenMinable(CoreModBlocks.ORE_LEAD.getDefaultState(), 6);
		ore_nickel = new WorldGenMinable(CoreModBlocks.ORE_NICKEL.getDefaultState(), 6);
		ore_platinum = new WorldGenMinable(CoreModBlocks.ORE_PLATINUM.getDefaultState(), 2);
		ore_silver = new WorldGenMinable(CoreModBlocks.ORE_SILVER.getDefaultState(), 2);
		ore_tin = new WorldGenMinable(CoreModBlocks.ORE_TIN.getDefaultState(), 6);
		ore_zinc = new WorldGenMinable(CoreModBlocks.ORE_ZINC.getDefaultState(), 6);
	}

	@Override
	public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		if (RealCoreConfig.worldGenConfig.isWorldGenEnabled) {
			switch (world.provider.getDimension()) {
			case 0:
				if (RealCoreConfig.worldGenConfig.oreConfig.aluminumOreConfig.aluminumOreGen)
					runGenerator(ore_aluminum, world, rand, chunkX, chunkZ,
							RealCoreConfig.worldGenConfig.oreConfig.aluminumOreConfig.aluminumOresPerChunk,
							RealCoreConfig.worldGenConfig.oreConfig.aluminumOreConfig.minHeightAluminum,
							RealCoreConfig.worldGenConfig.oreConfig.aluminumOreConfig.maxHeightAluminum);
				if (RealCoreConfig.worldGenConfig.oreConfig.copperOreConfig.copperOreGen)
					runGenerator(ore_copper, world, rand, chunkX, chunkZ,
							RealCoreConfig.worldGenConfig.oreConfig.copperOreConfig.copperOresPerChunk,
							RealCoreConfig.worldGenConfig.oreConfig.copperOreConfig.minHeightCopper,
							RealCoreConfig.worldGenConfig.oreConfig.copperOreConfig.maxHeightCopper);
				if (RealCoreConfig.worldGenConfig.oreConfig.gadoliniumOreConfig.gadoliniumOreGen)
					runGenerator(ore_gadolinium, world, rand, chunkX, chunkZ,
							RealCoreConfig.worldGenConfig.oreConfig.gadoliniumOreConfig.gadoliniumOresPerChunk,
							RealCoreConfig.worldGenConfig.oreConfig.gadoliniumOreConfig.minHeightGadolinium,
							RealCoreConfig.worldGenConfig.oreConfig.gadoliniumOreConfig.maxHeightGadolinium);
				if (RealCoreConfig.worldGenConfig.oreConfig.leadOreConfig.leadOreGen)
					runGenerator(ore_lead, world, rand, chunkX, chunkZ,
							RealCoreConfig.worldGenConfig.oreConfig.leadOreConfig.leadOresPerChunk,
							RealCoreConfig.worldGenConfig.oreConfig.leadOreConfig.minHeightLead,
							RealCoreConfig.worldGenConfig.oreConfig.leadOreConfig.maxHeightLead);
				if (RealCoreConfig.worldGenConfig.oreConfig.nickelOreConfig.nickelOreGen)
					runGenerator(ore_nickel, world, rand, chunkX, chunkZ,
							RealCoreConfig.worldGenConfig.oreConfig.nickelOreConfig.nickelOresPerChunk,
							RealCoreConfig.worldGenConfig.oreConfig.nickelOreConfig.minHeightNickel,
							RealCoreConfig.worldGenConfig.oreConfig.nickelOreConfig.maxHeightNickel);
				if (RealCoreConfig.worldGenConfig.oreConfig.platinumOreConfig.platinumOreGen)
					runGenerator(ore_platinum, world, rand, chunkX, chunkZ,
							RealCoreConfig.worldGenConfig.oreConfig.platinumOreConfig.platinumOresPerChunk,
							RealCoreConfig.worldGenConfig.oreConfig.platinumOreConfig.minHeightPlatinum,
							RealCoreConfig.worldGenConfig.oreConfig.platinumOreConfig.maxHeightPlatinum);
				if (RealCoreConfig.worldGenConfig.oreConfig.silverOreConfig.silverOreGen)
					runGenerator(ore_silver, world, rand, chunkX, chunkZ,
							RealCoreConfig.worldGenConfig.oreConfig.silverOreConfig.silverOresPerChunk,
							RealCoreConfig.worldGenConfig.oreConfig.silverOreConfig.minHeightSilver,
							RealCoreConfig.worldGenConfig.oreConfig.silverOreConfig.maxHeightSilver);
				if (RealCoreConfig.worldGenConfig.oreConfig.tinOreConfig.tinOreGen)
					runGenerator(ore_tin, world, rand, chunkX, chunkZ,
							RealCoreConfig.worldGenConfig.oreConfig.tinOreConfig.tinOresPerChunk,
							RealCoreConfig.worldGenConfig.oreConfig.tinOreConfig.minHeightTin,
							RealCoreConfig.worldGenConfig.oreConfig.tinOreConfig.maxHeightTin);
				if (RealCoreConfig.worldGenConfig.oreConfig.zincOreConfig.zincOreGen)
					runGenerator(ore_zinc, world, rand, chunkX, chunkZ,
							RealCoreConfig.worldGenConfig.oreConfig.zincOreConfig.zincOresPerChunk,
							RealCoreConfig.worldGenConfig.oreConfig.zincOreConfig.minHeightZinc,
							RealCoreConfig.worldGenConfig.oreConfig.zincOreConfig.maxHeightZinc);
				break;
			}
		}
	}

	private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance,
			int minHeight, int maxHeight) {
		if (minHeight > maxHeight || minHeight < 0 || maxHeight > 255)
			throw new IllegalArgumentException("Ore generated out of bounds");

		final int heightDiff = maxHeight - minHeight + 1;
		for (int i = 0; i < chance; i++) {
			final int x = chunkX * 16 + rand.nextInt(16);
			final int y = minHeight + rand.nextInt(heightDiff);
			final int z = chunkZ * 16 + rand.nextInt(16);

			gen.generate(world, rand, new BlockPos(x, y, z));
		}

	}

}
