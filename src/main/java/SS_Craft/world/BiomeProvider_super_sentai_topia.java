package SS_Craft.world;


import SS_Craft.biome.sentaiBiomes;
import net.minecraft.world.biome.BiomeProviderSingle;

public class BiomeProvider_super_sentai_topia extends BiomeProviderSingle
{
    
    /**
     * Instantiates a new biome provider cloud.
     */
    public BiomeProvider_super_sentai_topia()
    {
        super(sentaiBiomes.SUPER_SENTAI_TOPIA);
        
        // DEBUG
        System.out.println("Constructing BiomeProviderSuperSentaiTopia");
    }
}