package SS_Craft.item.don_brothers;

import javax.annotation.Nullable;

import SS_Craft.SentaiItems40;
import SS_Craft.SentaiItems60;
import SS_Craft.TokuCraft_core;
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
import net.minecraft.item.ItemShield;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class item_sono_shield extends ItemShield implements IHasModel
{
    public item_sono_shield(String name)
    {
        super();
        this.maxStackSize = 1;
        setTranslationKey(name);
        setRegistryName(name);
        TokuCraft_core.ITEMS.add(this);
    }
    
    public String getItemStackDisplayName(ItemStack stack)
    {
            return I18n.translateToLocal(getTranslationKey() + ".name");
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
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.sonoi_nouto_brace)
			{	
				if (this==SentaiItems60.sono_shield)
				{
					if (playerIn.isSneaking()&&item_don_blaster.get_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))!="_kyokatai")
					{
						item_don_blaster.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), 3);
					}
					else if (playerIn.isSneaking()&&item_don_blaster.get_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="_kyokatai")
					{
						item_don_blaster.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0);
					}
				}
			}
		}
			
        playerIn.setActiveHand(handIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
    
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
	{
		return SentaiItems60.blank_avatarou_gear == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
	}
}