package SS_Craft.item;



import javax.annotation.Nullable;

import SS_Craft.RiderItems;
import SS_Craft.TokuCraft_core;
import SS_Craft.item.gingaman.item_ginga_brace;
import SS_Craft.item.kyuranger.item_seiza_blaster;
import SS_Craft.item.lupatranger.item_vs_changer;
import SS_Craft.item.ninninger.item_ninja_ichibantou;
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
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemBaseShield extends ItemShield implements IHasModel
{
	private final Item base;   
	
    public ItemBaseShield(String name, Item item)
    {
        super();
        this.maxStackSize = 1;
        setTranslationKey(name);
        setRegistryName(name);
        TokuCraft_core.ITEMS.add(this);
        base = item;
        
        this.addPropertyOverride(new ResourceLocation("pull"), new IItemPropertyGetter()
	    {
        	@SideOnly(Side.CLIENT)
	        public float apply(ItemStack stack, @Nullable World worldIn, @Nullable EntityLivingBase entityIn)
	        {
        		if (stack.getItem() == RiderItems.houou_shield)
        		{
        			if (entityIn == null)
	                {
	                    return 0.0F;
	                }
        			else if (entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null)
					{
						if (entityIn.getHeldItem(EnumHand.MAIN_HAND).getItem()== RiderItems.houou_blade)
						{
							return 1;
						}
						else
						{
							return 0;
						}
					}
					
					return 0;
	            }
        		return 0;
	        }
		});
    }
    
    public String getItemStackDisplayName(ItemStack stack)
    {
            return I18n.translateToLocal(getTranslationKey() + ".name");
    }
    
	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}
	
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
    	return base == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
    }
}