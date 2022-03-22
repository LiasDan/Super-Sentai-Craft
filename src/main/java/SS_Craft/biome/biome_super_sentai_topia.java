package SS_Craft.biome;

import SS_Craft.world.gen.modDimensionWorldGen;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockDoublePlant;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.state.IBlockState;
import SS_Craft.mobs.Henchmen.*;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenBirchTree;
import net.minecraft.world.gen.feature.WorldGenBush;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;

public class biome_super_sentai_topia extends Biome
{
	protected boolean sunflowers;

	biome_super_sentai_topia() 
	{
		super(new BiomeProperties(modDimensionWorldGen.SUPER_SENTAI_TOPIA_NAME).setBaseHeight(0.125F).setHeightVariation(0.05F).setTemperature(0.8F).setRainfall(0.4F));
	
		this.decorator.treesPerChunk = 0;
		this.decorator.extraTreeChance = 0.05F;
	    this.decorator.flowersPerChunk = 4;
	    this.decorator.grassPerChunk = 10;

		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		
        this.spawnableMonsterList.add(new Biome.SpawnListEntry(entity_zolders.class,  15, 1, 4));
        this.spawnableMonsterList.add(new Biome.SpawnListEntry(entity_crimers.class,  15, 1, 4));
        this.spawnableMonsterList.add(new Biome.SpawnListEntry(entity_cutmen.class,  15, 1, 4));
        this.spawnableMonsterList.add(new Biome.SpawnListEntry(entity_dustlers.class,  15, 1, 4));
        this.spawnableMonsterList.add(new Biome.SpawnListEntry(entity_machinemen.class,  15, 1, 4));
        this.spawnableMonsterList.add(new Biome.SpawnListEntry(entity_spotmen.class,  15, 1, 4));
        this.spawnableMonsterList.add(new Biome.SpawnListEntry(entity_mechaclones.class,  15, 1, 4));
        this.spawnableMonsterList.add(new Biome.SpawnListEntry(entity_zolohs.class,  15, 1, 4));
        
        this.spawnableMonsterList.add(new Biome.SpawnListEntry(entity_unglers.class,  15, 1, 4));
        this.spawnableMonsterList.add(new Biome.SpawnListEntry(entity_ulars.class,  15, 1, 4));
        this.spawnableMonsterList.add(new Biome.SpawnListEntry(entity_grinams.class,  15, 1, 4));
        this.spawnableMonsterList.add(new Biome.SpawnListEntry(entity_golems1.class,  15, 1, 3));
        this.spawnableMonsterList.add(new Biome.SpawnListEntry(entity_golems2.class,  15, 1, 3));
        this.spawnableMonsterList.add(new Biome.SpawnListEntry(entity_cotpotros.class,  15, 1, 4));
        this.spawnableMonsterList.add(new Biome.SpawnListEntry(entity_dorodoros.class,  15, 1, 4));
        this.spawnableMonsterList.add(new Biome.SpawnListEntry(entity_wumpers_blue.class,  15, 1, 2));
        this.spawnableMonsterList.add(new Biome.SpawnListEntry(entity_wumpers_green.class,  15, 1, 2));
        this.spawnableMonsterList.add(new Biome.SpawnListEntry(entity_wumpers_pink.class,  15, 1, 2));
        this.spawnableMonsterList.add(new Biome.SpawnListEntry(entity_wumpers_white.class,  15, 1, 2));
        
        this.spawnableMonsterList.add(new Biome.SpawnListEntry(entity_kunekunes.class,  15, 1, 4));
        this.spawnableMonsterList.add(new Biome.SpawnListEntry(entity_yartots.class,  15, 1, 4));
        this.spawnableMonsterList.add(new Biome.SpawnListEntry(entity_imps.class,  15, 1, 4));
        this.spawnableMonsterList.add(new Biome.SpawnListEntry(entity_orgettes.class,  15, 1, 4));
        this.spawnableMonsterList.add(new Biome.SpawnListEntry(entity_barmias_black.class,  15, 1, 3));
        this.spawnableMonsterList.add(new Biome.SpawnListEntry(entity_barmias_white.class,  15, 1, 3));
        this.spawnableMonsterList.add(new Biome.SpawnListEntry(entity_anaroids.class,  15, 1, 4));
        this.spawnableMonsterList.add(new Biome.SpawnListEntry(entity_karths.class,  15, 1, 4));
       
        this.spawnableMonsterList.add(new Biome.SpawnListEntry(entity_rinshis.class,  15, 1, 4));
        this.spawnableMonsterList.add(new Biome.SpawnListEntry(entity_ugatz.class,  15, 1, 4));
        this.spawnableMonsterList.add(new Biome.SpawnListEntry(entity_nanashis.class,  15, 1, 4));
        this.spawnableMonsterList.add(new Biome.SpawnListEntry(entity_buglars.class,  15, 1, 4));
        this.spawnableMonsterList.add(new Biome.SpawnListEntry(entity_zorimas.class,  15, 1, 4));
        this.spawnableMonsterList.add(new Biome.SpawnListEntry(entity_kuros.class,  15, 1, 4));
        this.spawnableMonsterList.add(new Biome.SpawnListEntry(entity_moebas.class,  15, 1, 4));
        
        this.spawnableMonsterList.add(new Biome.SpawnListEntry(entity_indavers_blue.class,  15, 1, 3));
        this.spawnableMonsterList.add(new Biome.SpawnListEntry(entity_indavers_green.class,  15, 1, 3));
        this.spawnableMonsterList.add(new Biome.SpawnListEntry(entity_indavers_white.class,  15, 1, 3));
        this.spawnableMonsterList.add(new Biome.SpawnListEntry(entity_pordermen.class,  15, 1, 4));
        this.spawnableMonsterList.add(new Biome.SpawnListEntry(entity_drunns.class,  15, 1, 4));
        this.spawnableMonsterList.add(new Biome.SpawnListEntry(entity_bechats.class,  15, 1, 4));
        this.spawnableMonsterList.add(new Biome.SpawnListEntry(entity_kudakks.class,  15, 1, 4));
	}

	public BlockFlower.EnumFlowerType pickRandomFlower(Random rand, BlockPos pos)
    {
        double d0 = GRASS_COLOR_NOISE.getValue((double)pos.getX() / 200.0D, (double)pos.getZ() / 200.0D);

        if (d0 < -0.8D)
        {
            int j = rand.nextInt(4);

            switch (j)
            {
                case 0:
                    return BlockFlower.EnumFlowerType.ORANGE_TULIP;
                case 1:
                    return BlockFlower.EnumFlowerType.RED_TULIP;
                case 2:
                    return BlockFlower.EnumFlowerType.PINK_TULIP;
                case 3:
                default:
                    return BlockFlower.EnumFlowerType.WHITE_TULIP;
            }
        }
        else if (rand.nextInt(3) > 0)
        {
            int i = rand.nextInt(3);

            if (i == 0)
            {
                return BlockFlower.EnumFlowerType.POPPY;
            }
            else
            {
                return i == 1 ? BlockFlower.EnumFlowerType.HOUSTONIA : BlockFlower.EnumFlowerType.OXEYE_DAISY;
            }
        }
        else
        {
            return BlockFlower.EnumFlowerType.DANDELION;
        }
    }

    public void decorate(World worldIn, Random rand, BlockPos pos)
    {
        double d0 = GRASS_COLOR_NOISE.getValue((double)(pos.getX() + 8) / 200.0D, (double)(pos.getZ() + 8) / 200.0D);

        if (d0 < -0.8D)
        {
            this.decorator.flowersPerChunk = 15;
            this.decorator.grassPerChunk = 5;
        }
        else
        {
            this.decorator.flowersPerChunk = 4;
            this.decorator.grassPerChunk = 10;
            DOUBLE_PLANT_GENERATOR.setPlantType(BlockDoublePlant.EnumPlantType.GRASS);

            if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS))
            for (int i = 0; i < 7; ++i)
            {
                int j = rand.nextInt(16) + 8;
                int k = rand.nextInt(16) + 8;
                int l = rand.nextInt(worldIn.getHeight(pos.add(j, 0, k)).getY() + 32);
                DOUBLE_PLANT_GENERATOR.generate(worldIn, rand, pos.add(j, l, k));
            }
        }

        if (this.sunflowers && net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.FLOWERS))
        {
            DOUBLE_PLANT_GENERATOR.setPlantType(BlockDoublePlant.EnumPlantType.SUNFLOWER);

            for (int i1 = 0; i1 < 10; ++i1)
            {
                int j1 = rand.nextInt(16) + 8;
                int k1 = rand.nextInt(16) + 8;
                int l1 = rand.nextInt(worldIn.getHeight(pos.add(j1, 0, k1)).getY() + 32);
                DOUBLE_PLANT_GENERATOR.generate(worldIn, rand, pos.add(j1, l1, k1));
            }
        }

        super.decorate(worldIn, rand, pos);
    }
    
    @Override
    public void addDefaultFlowers()
    {
        BlockFlower red = net.minecraft.init.Blocks.RED_FLOWER;
        BlockFlower yel = net.minecraft.init.Blocks.YELLOW_FLOWER;
        addFlower(red.getDefaultState().withProperty(red.getTypeProperty(), BlockFlower.EnumFlowerType.ORANGE_TULIP), 3);
        addFlower(red.getDefaultState().withProperty(red.getTypeProperty(), BlockFlower.EnumFlowerType.RED_TULIP), 3);
        addFlower(red.getDefaultState().withProperty(red.getTypeProperty(), BlockFlower.EnumFlowerType.PINK_TULIP), 3);
        addFlower(red.getDefaultState().withProperty(red.getTypeProperty(), BlockFlower.EnumFlowerType.WHITE_TULIP), 3);
        addFlower(red.getDefaultState().withProperty(red.getTypeProperty(), BlockFlower.EnumFlowerType.POPPY), 20);
        addFlower(red.getDefaultState().withProperty(red.getTypeProperty(), BlockFlower.EnumFlowerType.HOUSTONIA), 20);
        addFlower(red.getDefaultState().withProperty(red.getTypeProperty(), BlockFlower.EnumFlowerType.OXEYE_DAISY), 20);
        addFlower(yel.getDefaultState().withProperty(yel.getTypeProperty(), BlockFlower.EnumFlowerType.DANDELION), 30);
    }

    public WorldGenAbstractTree getRandomTreeFeature(Random rand)
    {
        return (WorldGenAbstractTree)(rand.nextInt(3) == 0 ? BIG_TREE_FEATURE : TREE_FEATURE);
    }

	public Class <? extends Biome > getBiomeClass() {
		return biome_super_sentai_topia.class;
	}
}