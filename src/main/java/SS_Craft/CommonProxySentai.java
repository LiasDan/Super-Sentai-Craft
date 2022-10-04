package SS_Craft;

import com.jcraft.jorbis.Block;

import SS_Craft.util.handlers.giantHandler;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class CommonProxySentai
{
	
    public void registerRenderThings() { }

	public void registerItemRender(Item item, int i, String string) { }

	public void registerblockRender(Block ore_block, int i, String string) { }

	public void preInit() {
		MinecraftForge.EVENT_BUS.register(new giantHandler());
	}
}