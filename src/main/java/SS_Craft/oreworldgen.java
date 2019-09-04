package SS_Craft;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;


public class oreworldgen implements IWorldGenerator
{
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,IChunkProvider chunkProvider) {

		switch (world.provider.getDimension())
		{
		case -1:
			generateNether(world, random, chunkX * 16, chunkZ * 16);
			break;

		case 0:
			generateSurface(world, random, chunkX * 16, chunkZ * 16);
			break;

		case 1:
			generateEnd();
			break;
		}
		
	}
	

	public void generateNether(World world, Random rand, int chunkX, int chunkZ)
	{
		for (int i = 0; i < 2; i++)
		{
			//16x16 area up to y = 64
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(128);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			//(new WorldGenMinable(RiderItems.hellrock_lockseedblock.getDefaultState(), 1)).generate(world, rand,position);
			new WorldGenMinable(RiderItems.doubutsu_go_busters_ore.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.NETHERRACK)).generate(world, rand,position);
		}
	}	

	public void generateSurface(World world, Random rand, int chunkX, int chunkZ)
	{
		//01 Goranger
		for (int i = 0; i < 4; i++)
		{
			//16x16 area up to y = 64
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(60);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			(new WorldGenMinable(RiderItems.goranger_ore.getDefaultState(), 10)).generate(world, rand,position);
		}
		//02 J.A.K.Q.
		for (int i = 0; i < 4; i++)
		{
			//16x16 area up to y = 64
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(60);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			(new WorldGenMinable(RiderItems.jakq_ore.getDefaultState(), 10)).generate(world, rand,position);
		}
		//03 Battle Fever
		for (int i = 0; i < 4; i++)
		{
			//16x16 area up to y = 64
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(60);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			(new WorldGenMinable(RiderItems.battle_fever_ore.getDefaultState(), 10)).generate(world, rand,position);
		}
		//04 Denziman
		for (int i = 0; i < 4; i++)
		{
			//16x16 area up to y = 64
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(60);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			(new WorldGenMinable(RiderItems.denziman_ore.getDefaultState(), 10)).generate(world, rand,position);
		}
		//05 Sun Vulcan
		for (int i = 0; i < 4; i++)
		{
			//16x16 area up to y = 64
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(60);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			(new WorldGenMinable(RiderItems.sun_vulcan_ore.getDefaultState(), 10)).generate(world, rand,position);
		}
		//11 Maskman
		for (int i = 0; i < 4; i++)
		{
			//16x16 area up to y = 64
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(60);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			(new WorldGenMinable(RiderItems.maskman_ore.getDefaultState(), 10)).generate(world, rand,position);
		}
		//13 Turboranger
		for (int i = 0; i < 4; i++)
		{
			//16x16 area up to y = 64
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(60);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			(new WorldGenMinable(RiderItems.turboranger_ore.getDefaultState(), 10)).generate(world, rand,position);
		}
		//15 Jetman
		for (int i = 0; i < 4; i++)
		{
			//16x16 area up to y = 64
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(60);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			(new WorldGenMinable(RiderItems.jetman_ore.getDefaultState(), 10)).generate(world, rand,position);
		}
		//20 Carranger
		for (int i = 0; i < 4; i++)
		{
			//16x16 area up to y = 64
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(60);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			(new WorldGenMinable(RiderItems.carranger_ore.getDefaultState(), 10)).generate(world, rand,position);
		}
		//21 Megaranger
		for (int i = 0; i < 4; i++)
		{
			//16x16 area up to y = 64
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(60);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			(new WorldGenMinable(RiderItems.megaranger_ore.getDefaultState(), 10)).generate(world, rand,position);
		}
		//22 Gingaman
		for (int i = 0; i < 4; i++)
		{
			//16x16 area up to y = 64
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(60);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			(new WorldGenMinable(RiderItems.gingaman_ore.getDefaultState(), 10)).generate(world, rand,position);
		}
		//23 GoGo-V
		for (int i = 0; i < 4; i++)
		{
			//16x16 area up to y = 64
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(60);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			(new WorldGenMinable(RiderItems.gogo_v_ore.getDefaultState(), 10)).generate(world, rand,position);
		}
		//25 Gaoranger
		for (int i = 0; i < 4; i++)
		{
			//16x16 area up to y = 64
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(60);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			(new WorldGenMinable(RiderItems.gaoranger_ore.getDefaultState(), 10)).generate(world, rand,position);
		}
		//30 Boukenger
		for (int i = 0; i < 4; i++)
		{
			//16x16 area up to y = 64
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(60);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			(new WorldGenMinable(RiderItems.boukenger_ore.getDefaultState(), 10)).generate(world, rand,position);
		}
		//31 Gekiranger
		for (int i = 0; i < 4; i++)
		{
			//16x16 area up to y = 64
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(60);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			(new WorldGenMinable(RiderItems.gekiranger_ore.getDefaultState(), 10)).generate(world, rand,position);
		}
		//32 Go-Onger
		for (int i = 0; i < 4; i++)
		{
			//16x16 area up to y = 64
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(60);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			(new WorldGenMinable(RiderItems.go_onger_ore.getDefaultState(), 10)).generate(world, rand,position);
		}
		//33 Shinkenger
		for (int i = 0; i < 4; i++)
		{
			//16x16 area up to y = 64
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(60);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			(new WorldGenMinable(RiderItems.shinkenger_ore.getDefaultState(), 10)).generate(world, rand,position);
		}
		//36 Go-Busters
		for (int i = 0; i < 4; i++)
		{
			//16x16 area up to y = 64
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(60);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			(new WorldGenMinable(RiderItems.go_busters_ore.getDefaultState(), 10)).generate(world, rand,position);
		}
		//40 Zyuohger
		for (int i = 0; i < 4; i++)
		{
			//16x16 area up to y = 64
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(60);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			(new WorldGenMinable(RiderItems.zyuohger_ore.getDefaultState(), 10)).generate(world, rand,position);
		}
		//42-43 Lupinranger VS Patranger
		for (int i = 0; i < 4; i++)
		{
			//16x16 area up to y = 64
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(60);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			(new WorldGenMinable(RiderItems.vs_vehicle_ore.getDefaultState(), 10)).generate(world, rand,position);
		}
		//44 Ryusoulger
		for (int i = 0; i < 4; i++)
		{
			//16x16 area up to y = 64
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(60);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			(new WorldGenMinable(RiderItems.ryusoulger_ore.getDefaultState(), 10)).generate(world, rand,position);
		}
	}

	public void generateEnd()
	{
	}

	
}
