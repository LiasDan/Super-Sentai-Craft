package SS_Craft.item;

import javax.annotation.Nullable;
import SS_Craft.TokuCraft_core;
import SS_Craft.util.IHasModel;
import SS_Craft.util.Refercence;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.EnumAction;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class item_dual_sword extends ItemSword implements IHasModel
{

	public item_dual_sword(String name,ToolMaterial par2EnumToolMaterial)
	{

		super(par2EnumToolMaterial);
		this.maxStackSize = 1;
		this.setMaxDamage(par2EnumToolMaterial.getMaxUses());

		// Imcharge=charge; 
		setTranslationKey(name);
		setRegistryName(name);
		TokuCraft_core.ITEMS.add(this);


		this.addPropertyOverride(new ResourceLocation("pull"), new IItemPropertyGetter()
		{
			@SideOnly(Side.CLIENT)
			public float apply(ItemStack stack, @Nullable World worldIn, @Nullable EntityLivingBase entityIn)
			{
				return get_core(stack);	
			}
		});
	}

	
     /**
      * Current implementations of this method in child classes do not use the entry argument beside ev. They just raise
      * the damage on the stack.
      */
	@Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
    {
		stack.damageItem(1, attacker);
		return true;
    }

    public static int  get_core(ItemStack itemstack)
	{
		return itemstack.hasTagCompound() ? itemstack.getTagCompound().getInteger("sword_hit") :0;
	}

	public static void set_core(ItemStack itemstack, int flag)
	{
		if (!itemstack.hasTagCompound())
		{
			itemstack.setTagCompound(new NBTTagCompound());
		}
		itemstack.getTagCompound().setInteger("sword_hit", flag);
	}
	
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	{
		if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null)
		{
			if (!worldIn.isRemote)
			{
				if (playerIn.isSneaking())
				{
					if (get_core(playerIn.getHeldItem(handIn))==1)
					{
						set_core(playerIn.getHeldItem(handIn),0);
					}
					else
					{
						set_core(playerIn.getHeldItem(handIn),1);
					}
					
					playerIn.setActiveHand(handIn);
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
				}
			}
		}
		playerIn.setActiveHand(handIn);
		return new ActionResult<ItemStack>(EnumActionResult.PASS, playerIn.getHeldItem(handIn));
	}
	
	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}

}