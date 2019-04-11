package SS_Craft.world.gen;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import SS_Craft.world.gen.generators.WorldGenStructure;
import com.google.common.collect.Lists;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeForest;
import net.minecraft.world.biome.BiomeHills;
import net.minecraft.world.biome.BiomePlains;
import net.minecraft.world.biome.BiomeSavanna;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;
import scala.actors.threadpool.Arrays;
import scala.collection.mutable.ArrayStack;

public class WorldGenCustomStructures implements IWorldGenerator
{
	//public static final WorldGenStructure ROGUE_BASE = new WorldGenStructure("rogue_base");

	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.getDimension()) {
			case 1:
				break;
			case 0:
				//generateStructure(ROGUE_BASE, world, random, chunkX, chunkZ,11, 1000, Blocks.DIRT, BiomePlains.class,BiomeSavanna.class,BiomeForest.class,BiomeHills.class);
				break;
			case -1:
		}
	}
	
	
	
	private void generateStructure(WorldGenerator generator, World world, Random random, int chunkX, int chunkZ, int PosY, int chance, Block topBlock,Class<? extends Biome>... classes) {
		List<Class<? extends Biome>> classesList = Lists.newArrayList(classes);
		int x = (chunkX * 16+ random.nextInt(15));
		int z = (chunkZ * 16+ random.nextInt(15));
		int y = calculateGenerationHeight(world, x, z, topBlock);
		BlockPos pos = new BlockPos (x,y - PosY ,z);
		
		Class<? extends Biome> biome = world.provider.getBiomeForCoords(pos).getClass();
		
		if(world.getWorldType() != WorldType.FLAT) {
			if(classesList.contains(biome)) {
				if(random.nextInt(chance) == 0) {
					generator.generate(world, random, pos);
				}
			}
		}
	}
		
	private static int calculateGenerationHeight(World world, int x, int z, Block topBlock) {
		int y = world.getHeight();
		boolean foundGround = false;
			
		while(!foundGround && y-- >= 0) {
			Block block = world.getBlockState(new BlockPos(x,y,z)).getBlock();
			
			foundGround = block == Blocks.DIRT;
		}

		return y;
	}
}

