package SS_Craft.blocks;

import SS_Craft.SentaiItems20;
import SS_Craft.SentaiItems40;
import SS_Craft.TokuCraft_core;
import SS_Craft.util.IHasModel;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class zyudenchi_charger extends machine_block {

    private static final PropertyDirection FACING = BlockHorizontal.FACING;

    public zyudenchi_charger(String string, Material material, int lv) 
    {
    	super(string, material, lv);
		TokuCraft_core.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		TokuCraft_core.BLOCKS.add(this);
    }
    
	public static final List<Item> kyoryuger = new ArrayList<Item>();
	public static final List<Item> deboth = new ArrayList<Item>();
	public static final List<Item> brave = new ArrayList<Item>();

    @Override
	public void registerModels() 
    {
		TokuCraft_core.proxy.registerItemRender(Item.getItemFromBlock(this),0,"inventory");
	}
    
    private Item getZyudenchiDrop(int num) 
    {
		Random generator = new Random();
		if (num==0)
		{
			int rand = generator.nextInt(kyoryuger.size());
			return kyoryuger.get(rand);
		}
		else if (num==1)
		{
			int rand = generator.nextInt(deboth.size());
			return deboth.get(rand);
		}
		else
		{
			int rand = generator.nextInt(brave.size());
			return brave.get(rand);
		} 
	}
    
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) 
    {
		if (!worldIn.isRemote) 
		{
			if (player.getHeldItem(hand).getItem() == SentaiItems40.blank_zyudenchi) process(player, worldIn, pos, hand, getZyudenchiDrop(0));
			else if (player.getHeldItem(hand).getItem() == SentaiItems40.blank_deboth_zyudenchi) process(player, worldIn, pos, hand, getZyudenchiDrop(1));
			else if (player.getHeldItem(hand).getItem() == SentaiItems40.blank_brave_zyudenchi) process(player, worldIn, pos, hand, getZyudenchiDrop(2));
			return true;
		}

		return false;
	}
}
