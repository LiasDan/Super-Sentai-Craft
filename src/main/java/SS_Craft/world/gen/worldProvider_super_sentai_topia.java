package SS_Craft.world.gen;


import SS_Craft.world.BiomeProvider_super_sentai_topia;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.chunk.Chunk;


public class worldProvider_super_sentai_topia extends WorldProvider {
    @Override
    public DimensionType getDimensionType()
    {
        return modDimensionWorldGen.SUPER_SENTAI_TOPIA_DIM_TYPE;
    }

    @Override
    protected void init() {
        super.init();
        biomeProvider = new BiomeProvider_super_sentai_topia();
    }

    @Override
    public BiomeProvider getBiomeProvider()     {
        return biomeProvider;
    }

    /**
     * Returns 'true' if in the "main surface world", but 'false' if in the Nether or End dimensions.
     *
     * @return true, if is surface world
     */
    @Override
    public boolean isSurfaceWorld()
    {
        return false;
    }

    @Override
    public boolean canDoLightning(net.minecraft.world.chunk.Chunk chunk)
    {
        return true;
    }

    @Override
    public boolean canDoRainSnowIce(Chunk chunk)
    {
        return true;
    }
    public boolean doesWaterVaporize()
    {
        return true;
    }
    @Override
    public boolean canSnowAt(BlockPos pos, boolean checkLight)
    {
        return false; 
    }
}