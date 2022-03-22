package SS_Craft.item.akibaranger;

import SS_Craft.SentaiItems40;
import SS_Craft.TokuCraft_core;
import SS_Craft.item.abaranger.item_dino_brace;
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

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class item_munyu_munyu_zubaan extends ItemSword implements IHasModel
{
	private float weaponDamage;

    public float ENT;
    private final ToolMaterial toolMaterial;

    public item_munyu_munyu_zubaan(String name,ToolMaterial par2EnumToolMaterial)
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
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.red_moe_moe_z_cune)
			{	
				if (this==SentaiItems40.munyu_munyu_zubaan)
				{
					if (playerIn.isSneaking()&&item_moe_moe_z_cune.get_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))!=1)
					{
						item_moe_moe_z_cune.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), 1);
					}
					else if (playerIn.isSneaking()&&item_moe_moe_z_cune.get_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))==1)
					{
						item_moe_moe_z_cune.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0);
					}
				}
			}
		}
			
        playerIn.setActiveHand(handIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
}