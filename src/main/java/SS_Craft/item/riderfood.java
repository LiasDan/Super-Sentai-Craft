package SS_Craft.item;



import SS_Craft.TokuCraft_core;
import SS_Craft.util.IHasModel;
import net.minecraft.item.ItemFood;



public class riderfood extends ItemFood implements IHasModel
{

	public riderfood(int par2, boolean par3,String name) {
		super(par2, par3);
		setTranslationKey(name);
		setRegistryName(name);
		TokuCraft_core.ITEMS.add(this);
	}
	

	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}

}
