package SS_Craft.item.gekiranger;

import javax.annotation.Nullable;

import SS_Craft.RiderItems;
import SS_Craft.TokuCraft_core;
import SS_Craft.item.akibaranger.item_moe_moe_z_cune;
import SS_Craft.item.gingaman.item_ginga_brace;
import SS_Craft.item.lupatranger.item_vs_changer;
import SS_Craft.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.EnumAction;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class item_super_geki_claw extends ItemSword implements IHasModel
{
	private float weaponDamage;

    public float ENT;
    private final ToolMaterial toolMaterial;

    public item_super_geki_claw(String name,ToolMaterial par2EnumToolMaterial)
    {
        super(par2EnumToolMaterial);
        this.toolMaterial = par2EnumToolMaterial;
        this.maxStackSize = 1;
        this.setMaxDamage(par2EnumToolMaterial.getMaxUses());
        setTranslationKey(name);
        setRegistryName(name);
        TokuCraft_core.ITEMS.add(this);
        
        this.addPropertyOverride(new ResourceLocation("pull"), new IItemPropertyGetter()
	    {
			@SideOnly(Side.CLIENT)
	           public float apply(ItemStack stack, @Nullable World worldIn, @Nullable EntityLivingBase entityIn)
	           {
					if (stack.getItem() == RiderItems.red_super_geki_claw|stack.getItem() == RiderItems.yellow_super_geki_claw|stack.getItem() == RiderItems.blue_super_geki_claw)
					{
						if (entityIn == null)
		                {
		                    return 0.0F;
		                }
	        			else if (entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null)
						{
							if (entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_geki_changer)
							{
								if (item_geki_changer.get_core(entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)) == 1)
									return 1;
							}
							else
							{
								return 0;
							}
							
							return 0;
						}
						return 0;
					}
					return 0;
	           }
	    });
    }
    
    @Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}

	   /**
     * Called when the equipped item is right clicked.
     */
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
    {
    	if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null)
		{
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.red_geki_changer)
			{	
				if (this==RiderItems.red_super_geki_claw)
				{
					if (playerIn.isSneaking()&&item_geki_changer.get_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))!=1)
					{
						item_geki_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), 1);
					}
					else if (playerIn.isSneaking()&&item_geki_changer.get_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))==1)
					{
						item_geki_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0);
					}
				}
			}
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.yellow_geki_changer)
			{	
				if (this==RiderItems.yellow_super_geki_claw)
				{
					if (playerIn.isSneaking()&&item_geki_changer.get_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))!=1)
					{
						item_geki_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), 1);
					}
					else if (playerIn.isSneaking()&&item_geki_changer.get_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))==1)
					{
						item_geki_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0);
					}
				}
			}
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.blue_geki_changer)
			{	
				if (this==RiderItems.blue_super_geki_claw)
				{
					if (playerIn.isSneaking()&&item_geki_changer.get_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))!=1)
					{
						item_geki_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), 1);
					}
					else if (playerIn.isSneaking()&&item_geki_changer.get_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))==1)
					{
						item_geki_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0);
					}
				}
			}
		}
			
        playerIn.setActiveHand(handIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
    
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
	{
		return RiderItems.gekiranger_logo == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
	}
}