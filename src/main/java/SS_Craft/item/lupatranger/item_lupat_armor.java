package SS_Craft.item.lupatranger;

import javax.annotation.Nullable;

import SS_Craft.RiderItems;
import SS_Craft.TokuCraft_core;
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

public class item_lupat_armor extends ItemArmor  implements IHasModel
{
	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public item_lupat_armor (String name,ArmorMaterial par2EnumArmorMaterial, int par3, EntityEquipmentSlot par4)
	{
		super(par2EnumArmorMaterial, par3, par4);
		this.material = par2EnumArmorMaterial;
		par2EnumArmorMaterial.getDamageReductionAmount(par4);
		this.setMaxDamage(par2EnumArmorMaterial.getDurability(par4));
		this.maxStackSize = 1;
		
        setUnlocalizedName(name);
        setRegistryName(name);
        TokuCraft_core.ITEMS.add(this);
	}


	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type)
	{
		if (entity instanceof EntityLivingBase)
		{
			EntityLivingBase player = ((EntityLivingBase)entity);

			if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null)
			{
				if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_vs_changer)
				{
					String rider = ((item_vs_changer)player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()).Rider;
					
					if (item_vs_changer.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="victory")
					{
						return Refercence.MODID+":textures/armor/"+rider+"_"+item_vs_changer.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))+"_1.png";
					}
					else if (item_vs_changer.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="pat_siren")
					{
						return Refercence.MODID+":textures/armor/"+item_vs_changer.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))+"_1.png";
					}
					else if (item_vs_changer.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="lupin_tricolor" || item_vs_changer.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="patran_ugou" || item_vs_changer.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="lupin_scissor")
					{
						return Refercence.MODID+":textures/armor/blank.png";
					}
					else if (item_vs_changer.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))!="blank")
					{
						return Refercence.MODID+":textures/armor/"+item_vs_changer.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))+".png";
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
			if(stack.getItem() instanceof item_lupat_armor)
			{
				BipedLockseed armorModel = new BipedLockseed();
				armorModel.bipedBody2.showModel = slot == EntityEquipmentSlot.HEAD;
				armorModel.bipedRightArm2.showModel = slot == EntityEquipmentSlot.HEAD;
				armorModel.bipedLeftArm2.showModel = slot == EntityEquipmentSlot.HEAD;

				armorModel.bipedLeftLeg2.showModel = slot == EntityEquipmentSlot.HEAD;
				armorModel.bipedRightLeg2.showModel = slot == EntityEquipmentSlot.HEAD;

				armorModel.bipedBody3.showModel = slot == EntityEquipmentSlot.HEAD;

				armorModel.bipedHead2.showModel = slot == EntityEquipmentSlot.HEAD;
				armorModel.bipedHeadwear2.showModel = slot == EntityEquipmentSlot.HEAD;

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
}