package SS_Craft.item.sentai_armor_base;


import javax.annotation.Nullable;

import SS_Craft.SentaiItems20;
import SS_Craft.TokuCraft_core;
import SS_Craft.model.model_mecha;
import SS_Craft.model.tokuArmorModel2;
import SS_Craft.util.IHasModel;
import SS_Craft.util.Refercence;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class item_mecha_armor extends ItemArmor  implements IHasModel
{
	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;
	public Class<? extends item_mecha> BELTCLASS;
	private final Item base;   

	public item_mecha_armor (String name,Class<? extends item_mecha> beltClass,ArmorMaterial par2EnumArmorMaterial, int par3, EntityEquipmentSlot par4, Item item)
	{
		super(par2EnumArmorMaterial, par3, par4);
		this.material = par2EnumArmorMaterial;
		par2EnumArmorMaterial.getDamageReductionAmount(par4);
		this.setMaxDamage(par2EnumArmorMaterial.getDurability(par4));
		this.maxStackSize = 1;
		setTranslationKey(name);
		setRegistryName(name);
		TokuCraft_core.ITEMS.add(this);
		BELTCLASS=beltClass;
		base = item;
	}


	@Override
	@SideOnly(Side.CLIENT)
	@Nullable
	public ModelBiped getArmorModel(EntityLivingBase player, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel)
	{
		if(!stack.isEmpty())
		{
			if(stack.getItem() instanceof item_mecha_armor)
			{
				model_mecha armorModel = new model_mecha();
			
					if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem()instanceof item_mecha){
						item_mecha belt =((item_mecha)player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem());

						if (stack.getItem()==belt.FEET){
							armorModel.bipedHead2.showModel = slot == EntityEquipmentSlot.FEET;
							armorModel.bipedHeadwear2.showModel = slot == EntityEquipmentSlot.FEET;
							armorModel.bigBipedHead2.showModel = slot == EntityEquipmentSlot.FEET;
							armorModel.bigBipedHeadwear2.showModel = slot == EntityEquipmentSlot.FEET;
							
							armorModel.big2BipedHead2.showModel = slot == EntityEquipmentSlot.FEET;
							armorModel.big2BipedHeadwear2.showModel = slot == EntityEquipmentSlot.FEET;


						}else{
							armorModel.bipedHead2.showModel = slot == EntityEquipmentSlot.HEAD;
							armorModel.bipedHeadwear2.showModel = slot == EntityEquipmentSlot.HEAD;
							armorModel.bigBipedHead2.showModel = slot == EntityEquipmentSlot.HEAD;
							armorModel.bigBipedHeadwear2.showModel = slot == EntityEquipmentSlot.HEAD;

							armorModel.big2BipedHead2.showModel = slot == EntityEquipmentSlot.HEAD;
							armorModel.big2BipedHeadwear2.showModel = slot == EntityEquipmentSlot.HEAD;

						}

						if (stack.getItem()==belt.TORSO){
							armorModel.bipedRightArm2.showModel = slot == EntityEquipmentSlot.CHEST;
							armorModel.bipedLeftArm2.showModel = slot == EntityEquipmentSlot.CHEST;

							armorModel.bigBipedLeftArm2.showModel = slot == EntityEquipmentSlot.CHEST;
							armorModel.bigBipedRightArm2.showModel = slot == EntityEquipmentSlot.CHEST;

							armorModel.bipedBody3.showModel = slot == EntityEquipmentSlot.CHEST;
							armorModel.bigBipedBody3.showModel = slot == EntityEquipmentSlot.CHEST;
							armorModel.big2BipedBody3.showModel = slot == EntityEquipmentSlot.CHEST;


						}else{
							armorModel.bipedRightArm2.showModel = slot == EntityEquipmentSlot.HEAD;
							armorModel.bipedLeftArm2.showModel = slot == EntityEquipmentSlot.HEAD;

							armorModel.bigBipedLeftArm2.showModel = slot == EntityEquipmentSlot.HEAD;
							armorModel.bigBipedRightArm2.showModel = slot == EntityEquipmentSlot.HEAD;

							armorModel.bipedBody3.showModel = slot == EntityEquipmentSlot.HEAD;
							armorModel.bigBipedBody3.showModel = slot == EntityEquipmentSlot.HEAD;
							armorModel.big2BipedBody3.showModel = slot == EntityEquipmentSlot.HEAD;
						}

						if (stack.getItem()==belt.LEGS){
							armorModel.bipedBody2.showModel = slot == EntityEquipmentSlot.LEGS;
							armorModel.bigBipedBody2.showModel = slot == EntityEquipmentSlot.LEGS;
							armorModel.bigBipedLeftLeg2.showModel = slot == EntityEquipmentSlot.LEGS;
							armorModel.bigBipedRightLeg2.showModel = slot == EntityEquipmentSlot.LEGS;

							armorModel.bipedLeftLeg2.showModel = slot == EntityEquipmentSlot.LEGS;
							armorModel.bipedRightLeg2.showModel = slot == EntityEquipmentSlot.LEGS;

							armorModel.big2BipedBody2.showModel = slot == EntityEquipmentSlot.LEGS;
							
						}else{
							armorModel.bipedBody2.showModel = slot == EntityEquipmentSlot.HEAD;
							armorModel.bigBipedBody2.showModel = slot == EntityEquipmentSlot.HEAD;
							armorModel.bigBipedLeftLeg2.showModel = slot == EntityEquipmentSlot.HEAD;
							armorModel.bigBipedRightLeg2.showModel = slot == EntityEquipmentSlot.HEAD;

							armorModel.bipedLeftLeg2.showModel = slot == EntityEquipmentSlot.HEAD;
							armorModel.bipedRightLeg2.showModel = slot == EntityEquipmentSlot.HEAD;

							armorModel.big2BipedBody2.showModel = slot == EntityEquipmentSlot.HEAD;
						}
					}else{
						armorModel.bipedRightArm2.showModel = slot == EntityEquipmentSlot.HEAD;
						armorModel.bipedLeftArm2.showModel = slot == EntityEquipmentSlot.HEAD;

						armorModel.bigBipedLeftArm2.showModel = slot == EntityEquipmentSlot.HEAD;
						armorModel.bigBipedRightArm2.showModel = slot == EntityEquipmentSlot.HEAD;

						armorModel.bipedBody3.showModel = slot == EntityEquipmentSlot.HEAD;
						armorModel.bigBipedBody3.showModel = slot == EntityEquipmentSlot.HEAD;
							armorModel.bipedBody2.showModel = slot == EntityEquipmentSlot.HEAD;
							armorModel.bigBipedBody2.showModel = slot == EntityEquipmentSlot.HEAD;
							armorModel.bigBipedLeftLeg2.showModel = slot == EntityEquipmentSlot.HEAD;
							armorModel.bigBipedRightLeg2.showModel = slot == EntityEquipmentSlot.HEAD;

							armorModel.bipedLeftLeg2.showModel = slot == EntityEquipmentSlot.HEAD;
							armorModel.bipedRightLeg2.showModel = slot == EntityEquipmentSlot.HEAD;
							
							armorModel.big2BipedBody3.showModel = slot == EntityEquipmentSlot.HEAD;
							armorModel.big2BipedBody2.showModel = slot == EntityEquipmentSlot.HEAD;
						
						
					}
				
						armorModel.base = BELTCLASS;
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
				return SentaiItems20.blanknoitem == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
			}

			@Override
			public void registerModels() {
				TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
			}
		}