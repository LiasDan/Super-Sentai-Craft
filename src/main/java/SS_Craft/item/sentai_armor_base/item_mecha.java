package SS_Craft.item.sentai_armor_base;

import java.util.List;

import javax.annotation.Nullable;

import org.lwjgl.opengl.GL11;

import SS_Craft.SentaiItems20;
import SS_Craft.TokuCraft_core;
import SS_Craft.model.model_belt;
import SS_Craft.model.model_belt_plus;
import SS_Craft.model.tokuArmorModel;
import SS_Craft.util.IHasModel;
import SS_Craft.util.Refercence;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

public class item_mecha extends ItemArmor implements IHasModel
{

	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;
	private item_mecha_changer Base_Form_Item;
	public String Rider;
	public Item TORSO;
	public Item LEGS;
	public Item FEET;
	private final Item base;  

	private boolean belt=false;

	public item_mecha (String name,ArmorMaterial par2EnumArmorMaterial, int par3, String rider,item_mecha_changer baseFormItem,Item torso,Item legs,Item feet, Item item)
	{
		super(par2EnumArmorMaterial, par3, EntityEquipmentSlot.HEAD);
		this.material = par2EnumArmorMaterial;
		par2EnumArmorMaterial.getDamageReductionAmount(EntityEquipmentSlot.HEAD);
		this.setMaxDamage(par2EnumArmorMaterial.getDurability(EntityEquipmentSlot.HEAD));
		this.maxStackSize = 1;
		Rider=rider;
		setTranslationKey(name);
		setRegistryName(name);
		TokuCraft_core.ITEMS.add(this);
		Base_Form_Item=baseFormItem;
		TORSO=torso;
		LEGS=legs;
		FEET=feet;
		base = item;

	}

	public item_mecha belt(boolean num)
	{
		belt=num;
		return this;
	}

	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack par1ItemStack)
	{
		return !true;
	}
	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type)
	{
		return Refercence.MODID+":textures/armor/blank.png";

	}


	public void extraPotionEffects(World world,EntityPlayer player,ItemStack armor,item_mecha_changer item_mecha_changer) {

	}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {

		if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == FEET){
			if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == TORSO){
				if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == LEGS){
					if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == this){

						List<PotionEffect> potionEffectList = get_Form_Item(player.getItemStackFromSlot(EntityEquipmentSlot.HEAD),4).getPotionEffectList();
						for (int i = 0; i < potionEffectList.size(); i++)
						{
							player.addPotionEffect(new PotionEffect(potionEffectList.get(i).getPotion(),potionEffectList.get(i).getDuration(),potionEffectList.get(i).getAmplifier(),true,false));
						}
						extraPotionEffects(world,player,armor,get_Form_Item(player.getItemStackFromSlot(EntityEquipmentSlot.HEAD),4));
					}
				}
			}
		}
	}

	public  boolean rendModle(Entity entity, int num)
	{
		if (num==2||num==5||num==7||num==1||num==3||num==6||num==8){
			return true;
		}else if (entity instanceof EntityLivingBase){
			EntityLivingBase player = ((EntityLivingBase)entity);
			if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD)!= null){
				if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem()instanceof item_mecha){
					item_mecha belt =((item_mecha)player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem());
					String rider = ((item_mecha)player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem()).Rider;

					 if (num==4||num==9||num==10||num==11||num==12||num==13||num==14){

						return item_mecha.get_Form_Item_tex(player.getItemStackFromSlot(EntityEquipmentSlot.HEAD),4).get2ndLyer()!="blank"? true:false;
					} else{
						return false;

					}
				
				}else{
					return false;
				}
			}else{
				return false;
			}

		}
		return false;

	}

	
	public  String getTexture(Entity entity, int num,String ext)
	{
		if (entity instanceof EntityLivingBase){
			EntityLivingBase player = ((EntityLivingBase)entity);
			if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD)!= null){
				if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem()instanceof item_mecha){
					item_mecha belt =((item_mecha)player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem());
					String rider = ((item_mecha)player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem()).Rider;

					if (num==1){
								return Refercence.MODID+":textures/armor/mecha/"+rider+item_mecha.get_Form_Item_tex(player.getItemStackFromSlot(EntityEquipmentSlot.HEAD),4).getFormName()+ext;
				

					}else if (num==2||num==5||num==7){
					
							return Refercence.MODID+":textures/armor/mecha/"+rider+item_mecha.get_Form_Item_tex(player.getItemStackFromSlot(EntityEquipmentSlot.HEAD),4).getFormName()+ext;
					
					}else if (num==3||num==6||num==8){
						
							return Refercence.MODID+":textures/armor/mecha/"+rider+item_mecha.get_Form_Item_tex(player.getItemStackFromSlot(EntityEquipmentSlot.HEAD),4).getFormName()+ext;
			
					}else if (num==4||num==9||num==10||num==11||num==12||num==13||num==14){

						return Refercence.MODID+":textures/armor/mecha/"+item_mecha.get_Form_Item_tex(player.getItemStackFromSlot(EntityEquipmentSlot.HEAD),4).get2ndLyer()+ext;

					} else{
						return Refercence.MODID+":textures/armor/blank"+ext;

					}
				}else{
					return Refercence.MODID+":textures/armor/blank"+ext;
				}
			}else{
				return Refercence.MODID+":textures/armor/blank"+ext;
			}

		}
		return Refercence.MODID+":textures/armor/blank"+ext;

	}


	@Override
	@SideOnly(Side.CLIENT)
	@Nullable
	public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel)
	{
		if(!stack.isEmpty())
		{
			if(stack.getItem() instanceof ItemArmor)
			{
				model_belt_plus armorModel = new model_belt_plus();

				if(belt == true){
					armorModel.belt=new ItemStack(SentaiItems20.blanknoitem);
				}else if (get_Form_Item(stack,4).getBelt()==SentaiItems20.blanknoitem ){
					armorModel.belt=stack;
				}else 
				{
					armorModel.belt=new ItemStack(get_Form_Item(stack,4).getBelt());
				}


				armorModel.wings=new ItemStack(get_Form_Item(stack,4).getWing());


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

	public static int get_eftTime(ItemStack itemstack)
	{
		return itemstack.hasTagCompound() ? itemstack.getTagCompound().getInteger("eftTime") : 100;
	}

	public static void set_eftTime(ItemStack itemstack, int flag)
	{
		if (!itemstack.hasTagCompound())
		{
			itemstack.setTagCompound(new NBTTagCompound());
		}
		itemstack.getTagCompound().setInteger("eftTime", flag);
	}

	public item_mecha_changer get_Form_Item(ItemStack itemstack,int SLOT)
	{
		if (!itemstack.hasTagCompound())
		{
			return Base_Form_Item;
		}else if (Item.getItemById(itemstack.getTagCompound().getInteger("slot"+SLOT))instanceof item_mecha_changer){
			return (item_mecha_changer) Item.getItemById(itemstack.getTagCompound().getInteger("slot"+SLOT));
		}else{
			return Base_Form_Item;
		}
	}

	public static item_mecha_changer get_Form_Item_tex(ItemStack itemstack,int SLOT)
	{
		if (!itemstack.hasTagCompound())
		{
			return  ((item_mecha)itemstack.getItem()).Base_Form_Item;
		}else if (Item.getItemById(itemstack.getTagCompound().getInteger("slot"+SLOT))instanceof item_mecha_changer){
			return (item_mecha_changer) Item.getItemById(itemstack.getTagCompound().getInteger("slot"+SLOT));
		}else{
			return  ((item_mecha)itemstack.getItem()).Base_Form_Item;
		}
	}
	public static void set_Form_Item(ItemStack itemstack, Item ITEM,int SLOT)
	{
		if (!itemstack.hasTagCompound())
		{
			itemstack.setTagCompound(new NBTTagCompound());
		}
		itemstack.getTagCompound().setInteger("slot"+SLOT, Item.getIdFromItem(ITEM));

	}

	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) 
	{
		return base == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
	}
}