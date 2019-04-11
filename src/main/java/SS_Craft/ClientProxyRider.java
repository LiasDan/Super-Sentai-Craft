package SS_Craft;


import com.jcraft.jorbis.Block;
import SS_Craft.model.MobWithBeltModel;
import SS_Craft.model.tokuMobModel;
import SS_Craft.util.Refercence;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientProxyRider extends CommonProxyRider
{


	@Override
	public void registerRenderThings()
	{
		
	}

	public void registerItemRender(Item item, int i, String string) {

		ModelLoader.setCustomModelResourceLocation(item, i,  new ModelResourceLocation(item.getRegistryName(),string));
	}

}
