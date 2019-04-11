package SS_Craft.blocks;

import java.util.Random;

import SS_Craft.RiderItems;
import SS_Craft.TokuCraft_core;
import SS_Craft.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.BlockFence;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class decor_block extends Block implements IHasModel
{

	public decor_block(String string, Material par3Material,int lv)
	{
		
		super(par3Material);
		// TODO Auto-generated constructor stub
		this.setHarvestLevel("pickaxe", lv);
		setHardness(9.9F);
		setLightLevel(0.1f);
		setUnlocalizedName(string);
		setRegistryName(string);

        TokuCraft_core.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        TokuCraft_core.BLOCKS.add(this);
	}

	public int getExpDrop(IBlockAccess world, int metadata, int fortune)
	{
		return 5;
	}

	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(Item.getItemFromBlock(this),0,"inventory");
	}

}