package SS_Craft.item.ryusoulger;

import javax.annotation.Nullable;

import SS_Craft.RiderItems;
import SS_Craft.TokuCraft_core;
import SS_Craft.item.abaranger.item_dino_brace;
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

public class item_ryusoul_calibur extends ItemSword implements IHasModel
{
	private float weaponDamage;

    public float ENT;
    private final ToolMaterial toolMaterial;

    public item_ryusoul_calibur(String name,ToolMaterial par2EnumToolMaterial)
    {
        super(par2EnumToolMaterial);
        this.toolMaterial = par2EnumToolMaterial;
        this.maxStackSize = 1;
        this.setMaxDamage(par2EnumToolMaterial.getMaxUses());
        setTranslationKey(name);
        setRegistryName(name);
        TokuCraft_core.ITEMS.add(this);
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
    		if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_ryusoul_changer)
			{
    			item_ryusoul_changer belt = (item_ryusoul_changer) playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem();

    			if (belt != RiderItems.gaisorg_changer | belt != RiderItems.brown_changer)
    			{
    				if (this==RiderItems.ryusoul_calibur)
    				{
    					if (playerIn.isSneaking()&&item_ryusoul_changer.get_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))!=9)
    					{
    						item_ryusoul_changer.set_soul(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), 9);
    					}
    					else if (playerIn.isSneaking()&&item_ryusoul_changer.get_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))==9)
    					{
    						item_ryusoul_changer.set_soul(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0);
    					}
    				}
    			}
				
			}
		}
			
        playerIn.setActiveHand(handIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }

	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
	{
		return RiderItems.blank_ryusoul == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
	}
}