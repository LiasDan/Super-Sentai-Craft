package SS_Craft.item.gaoranger.mecha;

import javax.annotation.Nullable;

import SS_Craft.SentaiItems20;
import SS_Craft.TokuCraft_core;
import SS_Craft.item.go_onger.item_go_phone;
import SS_Craft.item.zyuranger.item_dino_buckler;
import SS_Craft.model.BipedLockseed;
import SS_Craft.model.tokuArmorModel;
import SS_Craft.util.IHasModel;
import SS_Craft.util.Refercence;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class item_gaoranger_mecha_armor extends ItemArmor  implements IHasModel
{
	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public item_gaoranger_mecha_armor (String name,ArmorMaterial par2EnumArmorMaterial, int par3, EntityEquipmentSlot par4)
	{
		super(par2EnumArmorMaterial, par3, par4);
		this.material = par2EnumArmorMaterial;
		par2EnumArmorMaterial.getDamageReductionAmount(par4);
		this.setMaxDamage(par2EnumArmorMaterial.getDurability(par4));
		this.maxStackSize = 1;
		
        setTranslationKey(name);
        setRegistryName(name);
        TokuCraft_core.ITEMS.add(this);
	}


	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type)
	{
		if (entity instanceof EntityLivingBase)
		{
			EntityLivingBase player = ((EntityLivingBase)entity);

			if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD)!= null)
			{
				if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() instanceof item_gaoranger_mecha)
				{
					String rider = ((item_gaoranger_mecha)player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem()).Rider;
					
					if (item_gaoranger_mecha.get_right(player.getItemStackFromSlot(EntityEquipmentSlot.HEAD)) != "blank")
					{
						return Refercence.MODID+":textures/armor/mecha/"+item_gaoranger_mecha.get_right(player.getItemStackFromSlot(EntityEquipmentSlot.HEAD))+".png";
					}
					else
					{
						return Refercence.MODID+":textures/armor/blank.png";
					}
				}
				
				return Refercence.MODID+":textures/armor/blank.png";
			}
		}
		else
		{
			return Refercence.MODID+":textures/armor/blank.png";
		}
		
		return Refercence.MODID+":textures/armor/blank.png";
	}


	/**
	 * Returns the 'max damage' factor array for the armor, each piece of armor have a durability factor (that gets
	 * multiplied by armor material factor)
	 */
	static int[] getMaxDamageArray()
	{
		return maxDamageArray;
	}
	
	@Override
	public void registerModels() 
	{
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}

	@Override
	@SideOnly(Side.CLIENT)
	@Nullable
	public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel)
	{
		if(!stack.isEmpty())
		{
			if(stack.getItem() instanceof item_gaoranger_mecha_armor)
			{
				BipedLockseed armorModel = new BipedLockseed();
				armorModel.bipedBody2.showModel = slot == EntityEquipmentSlot.FEET;
				armorModel.bipedRightArm2.showModel = slot == EntityEquipmentSlot.FEET;
				armorModel.bipedLeftArm2.showModel = slot == EntityEquipmentSlot.FEET;
				
				armorModel.bipedLeftLeg2.showModel = slot == EntityEquipmentSlot.FEET;
				armorModel.bipedRightLeg2.showModel = slot == EntityEquipmentSlot.FEET;
				
				armorModel.bipedBody3.showModel = slot == EntityEquipmentSlot.FEET;
				
				armorModel.bipedHead2.showModel = slot == EntityEquipmentSlot.FEET;
				armorModel.bipedHeadwear2.showModel = slot == EntityEquipmentSlot.FEET;

				armorModel.isSneak = defaultModel.isSneak;
				armorModel.isRiding = defaultModel.isRiding;
				armorModel.isChild = defaultModel.isChild;
				armorModel.rightArmPose = defaultModel.rightArmPose;
				armorModel.leftArmPose = defaultModel.leftArmPose;

				return armorModel;
			}
		}

		return null;
	}
	
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
	{
		return SentaiItems20.mecha_gear == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
	}
}