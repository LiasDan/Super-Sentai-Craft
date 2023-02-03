package SS_Craft.item.don_brothers;

import javax.annotation.Nullable;

import org.lwjgl.opengl.GL11;

import SS_Craft.SentaiItems20;
import SS_Craft.SentaiItems40;
import SS_Craft.SentaiItems60;
import SS_Craft.TokuCraft_core;
import SS_Craft.item.dekaranger.item_sp_license;
import SS_Craft.item.ryusoulger.item_ryusoul_changer;
import SS_Craft.item.sentai_armor_base.item_form_changer;
import SS_Craft.item.sentai_armor_base.item_sentai_changer;
import SS_Craft.item.zenkaiger.item_zenkai_gear;
import SS_Craft.item.zyuranger.item_dino_buckler;
import SS_Craft.item.zyuranger.item_dino_medal;
import SS_Craft.model.model_belt;
import SS_Craft.model.model_belt_plus;
import SS_Craft.model.model_don_brothers;
import SS_Craft.potion.PotionCore;
import SS_Craft.util.IHasModel;
import SS_Craft.util.Refercence;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.Tuple;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

public class item_don_blaster extends item_sentai_changer
{
	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public String Rider;

	public static final String[] Momotarou= new String[] {"","_goldon"};
	public static final String[] Oni= new String[] {"","_manga"};
	public static final String[] ToraDora= new String[] {"don_doragoku","don_torabolt","dragon_ranger","kiba_ranger","gokai_silver","beet_buster","kyoryu_gold","toq_6gou","star_ninger","zyuoh_the_world","houou_soldier","lupin_x","patran_x","ryusoul_gold","kiramei_silver","twokaizer"};
	public static final String[] Sentaiger= new String[] {"","_goranger","_jakq","_battle_fever","_denziman","_sun_vulcan","_goggle_v","_dynaman","_bioman","_changeman","_flashman","_maskman","_liveman","_turboranger","_fiveman","_jetman","_zyuranger","_dairanger","_kakuranger","_ohranger","_carranger","_megaranger","_gingaman","_gogo_v","_timeranger","_gaoranger","_hurricaneger","_abaranger","_dekaranger","_magiranger","_boukenger","_gekiranger","_go_onger","_shinkenger","_goseiger","_gokaiger","_go_busters","_kyoryuger","_toqger","_ninninger","_zyuohger","_kyuranger","_lupinranger","_patranger","_ryusoulger","_kirameiger","_zenkaiger"};
	public static final String[] Alter= new String[] {"","","_gokai","","_kyoryu","_toq","_ninnin","_zyuoh","","","","_ryusoul","_kiramei"};
	
	public item_don_blaster (String name,ArmorMaterial par2EnumArmorMaterial, int par3, String rider)
	{
		super(name, par2EnumArmorMaterial,4,rider,(item_form_changer)SentaiItems20.blanknoform,SentaiItems60.don_brothers_head, SentaiItems60.don_brothers_torso, SentaiItems60.don_brothers_legs, SentaiItems60.blank_avatarou_gear);
		this.material = par2EnumArmorMaterial;
		par2EnumArmorMaterial.getDamageReductionAmount(EntityEquipmentSlot.FEET);
		this.setMaxDamage(par2EnumArmorMaterial.getDurability(EntityEquipmentSlot.FEET));
		this.maxStackSize = 1;
		Rider=rider;
	}

	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack par1ItemStack)
	{
			return !true;
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
				model_belt_plus armorModel = new model_don_brothers();
				
				Item[] doragoku= new Item[] {SentaiItems20.blanknoitem,SentaiItems20.blanknoitem,SentaiItems20.dragon_dino_buckler,SentaiItems20.dairanger_belt,SentaiItems20.gokaiger_belt,SentaiItems40.go_busters_belt,SentaiItems40.gold_mo_buckle,SentaiItems40.toq_buckle,SentaiItems20.blanknoitem,SentaiItems40.zyuoh_the_world_belt,SentaiItems60.kyu_buckle,SentaiItems60.lupat_belt,SentaiItems60.lupat_belt,SentaiItems60.ryusoul_gold_buckle,SentaiItems60.kiramei_silver_belt,SentaiItems60.twokaizer_belt};
				Item[] alter= new Item[] {SentaiItems20.blanknoitem,SentaiItems20.blanknoitem,SentaiItems60.gokaiger_avatarou_gear_alter,SentaiItems60.go_busters_avatarou_gear_alter,SentaiItems60.kyoryuger_avatarou_gear_alter,SentaiItems60.toqger_avatarou_gear_alter,SentaiItems60.don_ninnin_alter,SentaiItems60.don_zyuoh_alter,SentaiItems60.kyuranger_avatarou_gear_alter,SentaiItems60.lupinranger_avatarou_gear_alter,SentaiItems60.patranger_avatarou_gear_alter,SentaiItems60.ryusoulger_avatarou_gear_alter,SentaiItems60.kirameiger_avatarou_gear_alter};
				
				if (this.get_alter(stack)>0)
				{
					armorModel.belt=new ItemStack(SentaiItems20.blanknoitem);
				}
				else if (this == SentaiItems60.toradora_ryuko_no_geki)
				{
					armorModel.belt=new ItemStack(doragoku[this.get_core(stack)]);
				}
				else if (this == SentaiItems60.murasame_ninjark_sword || this == SentaiItems60.future_ninjark_sword)
				{
					armorModel.belt=new ItemStack(SentaiItems60.don_murasame_belt);
				}
				else if (this == SentaiItems60.black_geartlinger)
				{
					armorModel.belt=new ItemStack(SentaiItems60.zenkaizer_belt);
				}
				else if (this == SentaiItems60.sonoi_nouto_brace || this == SentaiItems60.sononi_nouto_brace || this == SentaiItems60.sonoza_nouto_brace)
				{
					armorModel.belt=new ItemStack(SentaiItems20.blanknoitem);
				}
				else
				{
					armorModel.belt=new ItemStack(SentaiItems60.donbro_buckle);
				}
				
				if (this == SentaiItems60.kiji_don_blaster && this.get_avatar(stack)==0)
				{
					if ((living instanceof EntityPlayer && (((EntityPlayer) living).capabilities.isFlying)))
					{
						armorModel.wings=new ItemStack(SentaiItems60.kiji_brother_wings);
					}
					else
					{
						armorModel.wings=new ItemStack(SentaiItems60.kiji_brother_wings_close);
					}
				}
				else if (this == SentaiItems60.murasame_ninjark_sword)
				{
					if (living.getHeldItem(EnumHand.OFF_HAND).getItem()==SentaiItems60.ninjark_sword || living.getHeldItem(EnumHand.MAIN_HAND).getItem()==SentaiItems60.ninjark_sword || this.get_avatar(stack)!=0)
					{
						armorModel.wings=new ItemStack(SentaiItems20.blanknoitem);
					}
					else
					{
						armorModel.wings=new ItemStack(SentaiItems60.ninjark_sword_back);
					}
				}
				else if (this.get_alter(stack)!=0)
				{
					armorModel.wings=new ItemStack(alter[this.get_alter(stack)]);
				}
				else
				{
					armorModel.wings=new ItemStack(SentaiItems20.blanknoitem);
				}
				
				//armorModel.bipedRightLeg.showModel = slot == EntityEquipmentSlot.FEET;
				//armorModel.bipedLeftLeg.showModel = slot == EntityEquipmentSlot.FEET;
				
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

	public static int get_core(ItemStack itemstack)
	{
		return itemstack.hasTagCompound() ? itemstack.getTagCompound().getInteger("core") :0;
	}

	public static void set_core(ItemStack itemstack, int flag)
	{
		if (!itemstack.hasTagCompound())
		{
			itemstack.setTagCompound(new NBTTagCompound());
		}
		itemstack.getTagCompound().setInteger("core", flag);
	}

	public static int get_avatar(ItemStack itemstack)
	{
		return itemstack.hasTagCompound() ? itemstack.getTagCompound().getInteger("avatar") :0;
	}

	public static void set_avatar(ItemStack itemstack, int flag)
	{
		if (!itemstack.hasTagCompound())
		{
			itemstack.setTagCompound(new NBTTagCompound());
		}
		itemstack.getTagCompound().setInteger("avatar", flag);
	}

	public static int get_alter(ItemStack itemstack)
	{
		return itemstack.hasTagCompound() ? itemstack.getTagCompound().getInteger("alter") :0;
	}

	public static void set_alter(ItemStack itemstack, int flag)
	{
		if (!itemstack.hasTagCompound())
		{
			itemstack.setTagCompound(new NBTTagCompound());
		}
		itemstack.getTagCompound().setInteger("alter", flag);
	}
	
	public static String get_lock(ItemStack itemstack)
	{	
		item_don_blaster belt = (item_don_blaster)itemstack.getItem();
		
		return itemstack.hasTagCompound() ? item_don_gear.ARMOR[itemstack.getTagCompound().getInteger("armor")] : "blank";
	}
	
	public static void set_lock(ItemStack itemstack,int flag)
	{
		if (!itemstack.hasTagCompound())
		{
			itemstack.setTagCompound(new NBTTagCompound());
		}
		itemstack.getTagCompound().setInteger("armor", flag);
	}

	public static int  get_effect(ItemStack itemstack)
	{
		return itemstack.hasTagCompound() ? itemstack.getTagCompound().getInteger("effect") :0;
	}

	public static void set_effect(ItemStack itemstack, int flag)
	{
		if (!itemstack.hasTagCompound())
		{
			itemstack.setTagCompound(new NBTTagCompound());
		}
		itemstack.getTagCompound().setInteger("effect", flag);
	}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack armor) 
	{
		if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD)!= null)
		{
			if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST)!= null)
			{
				if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS)!= null)
				{
					if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null)
					{
						if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == SentaiItems60.don_brothers_legs)
						{
							if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == SentaiItems60.don_brothers_torso)
							{
								if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == SentaiItems60.don_brothers_head)
								{
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.momotarou_don_blaster)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));

										if (this.get_avatar(armor)==0)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 2,true,false));
											player.addPotionEffect(new PotionEffect(PotionCore.SS_SLASH_BOOST,20, 2,true,false));
										}
										if (this.get_avatar(armor)==1)
										{
											player.addPotionEffect(new PotionEffect(PotionCore.SS_BOOST,20, 2,true,false));
										}
										if (this.get_avatar(armor)==2)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 20, 2, true, false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20, 2,true,false));
										}
										if (this.get_avatar(armor)==3)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false));
										}
										if (this.get_avatar(armor)==4)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 20, 2,true,false));
										}
										if (this.get_avatar(armor)==5)
										{
											player.addPotionEffect(new PotionEffect(PotionCore.SS_FLY_POTION,20, 2,true,false));
											player.addPotionEffect(new PotionEffect(PotionCore.SS_SLASH_BOOST,20, 2,true,false));
										}
										if (this.get_avatar(armor)==6)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 20, 2,true,false));
										}
										if (this.get_avatar(armor)==7)
										{
											//Dynaman
										}
										if (this.get_avatar(armor)==8)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 20, 2,true,false));
											player.addPotionEffect(new PotionEffect(PotionCore.SS_SLASH_BOOST,20, 2,true,false));
										}
										if (this.get_avatar(armor)==9)
										{
											//Changeman
										}
										if (this.get_avatar(armor)==10)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 3,true,false));
										}
										if (this.get_avatar(armor)==11)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 20, 2,true,false));
										}
										if (this.get_avatar(armor)==12)
										{
											//Liveman
										}
										if (this.get_avatar(armor)==13)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,250, 3,true,false));
										}
										if (this.get_avatar(armor)==14)
										{
											//Fiveman
										}
										if (this.get_avatar(armor)==15)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 2,true,false));
											player.addPotionEffect(new PotionEffect(PotionCore.SS_FLY_POTION,20, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,250, 2,true,false));
										}
										if (this.get_avatar(armor)==1)
										{
										}
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.saru_don_blaster)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
										
										if (this.get_avatar(armor)==0)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 3,true,false));
										}
										if (this.get_avatar(armor)==1)
										{
											player.addPotionEffect(new PotionEffect(PotionCore.SS_BOOST,20, 2,true,false));
										}
										if (this.get_avatar(armor)==2)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 20, 2, true, false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20, 2,true,false));
										}
										if (this.get_avatar(armor)==3)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false));
										}
										if (this.get_avatar(armor)==4)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 20, 2,true,false));
										}
										if (this.get_avatar(armor)==5)
										{
											player.addPotionEffect(new PotionEffect(PotionCore.SS_PUNCH_BOOST,20, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false));
										}
										if (this.get_avatar(armor)==6)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 20, 2,true,false));
										}
										if (this.get_avatar(armor)==7)
										{
											//Dynaman
										}
										if (this.get_avatar(armor)==8)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 20, 2,true,false));
											player.addPotionEffect(new PotionEffect(PotionCore.SS_BOOST, 20, 2,true,false));
										}
										if (this.get_avatar(armor)==9)
										{
											//Changeman
										}
										if (this.get_avatar(armor)==10)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 4,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 2,true,false));
										}
										if (this.get_avatar(armor)==11)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 20, 2,true,false));
										}
										if (this.get_avatar(armor)==12)
										{
											//Liveman
										}
										if (this.get_avatar(armor)==13)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,250, 3,true,false));
										}
										if (this.get_avatar(armor)==14)
										{
											//Fiveman
										}
										if (this.get_avatar(armor)==15)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 2,true,false));
											player.addPotionEffect(new PotionEffect(PotionCore.SS_FLY_POTION,20, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,250, 2,true,false));
										}
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.oni_don_blaster)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
										
										if (this.get_avatar(armor)==0)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false));
										}
										if (this.get_avatar(armor)==1)
										{
											player.addPotionEffect(new PotionEffect(PotionCore.SS_BOOST,20, 2,true,false));
										}
										if (this.get_avatar(armor)==4)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 20, 2,true,false));
										}
										if (this.get_avatar(armor)==5)
										{
											player.addPotionEffect(new PotionEffect(PotionCore.SS_PUNCH_BOOST,20, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false));
										}
										if (this.get_avatar(armor)==6)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 20, 2,true,false));
										}
										if (this.get_avatar(armor)==7)
										{
											//Dynaman
										}
										if (this.get_avatar(armor)==8)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 20, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false));
											player.addPotionEffect(new PotionEffect(PotionCore.SS_SHOT_BOOST,20, 2,true,false));
										}
										if (this.get_avatar(armor)==10)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 2,true,false));
										}
										if (this.get_avatar(armor)==11)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 20, 2,true,false));
										}
										if (this.get_avatar(armor)==12)
										{
											//Liveman
										}
										if (this.get_avatar(armor)==13)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,250, 3,true,false));
										}
										if (this.get_avatar(armor)==14)
										{
											//Fiveman
										}
										if (this.get_avatar(armor)==15)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 2,true,false));
											player.addPotionEffect(new PotionEffect(PotionCore.SS_FLY_POTION,20, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,250, 2,true,false));
										}
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.inu_don_blaster)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
										
										if (this.get_avatar(armor)==0)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY,20, 2,true,false));
											player.addPotionEffect(new PotionEffect(PotionCore.SS_INUBROTHER,20, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 2,true,false));
										}
										if (this.get_avatar(armor)==3)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false));
										}
										if (this.get_avatar(armor)==6)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 20, 2,true,false));
										}
										if (this.get_avatar(armor)==7)
										{
											//Dynaman
										}
										if (this.get_avatar(armor)==9)
										{
											//Changeman
										}
										if (this.get_avatar(armor)==11)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 20, 2,true,false));
										}
										if (this.get_avatar(armor)==12)
										{
											//Liveman
										}
										if (this.get_avatar(armor)==13)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,250, 3,true,false));
										}
										if (this.get_avatar(armor)==14)
										{
											//Fiveman
										}
										if (this.get_avatar(armor)==15)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 2,true,false));
											player.addPotionEffect(new PotionEffect(PotionCore.SS_FLY_POTION,20, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,250, 2,true,false));
										}
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.kiji_don_blaster)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
										
										if (this.get_avatar(armor)==0)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY,20, 2,true,false));
											player.addPotionEffect(new PotionEffect(PotionCore.SS_KIJIBROTHER,20, 2,true,false));
											player.addPotionEffect(new PotionEffect(PotionCore.SS_FLY_POTION,20, 2,true,false));
										}
										if (this.get_avatar(armor)==1)
										{
											player.addPotionEffect(new PotionEffect(PotionCore.SS_BOOST,20, 2,true,false));
										}
										if (this.get_avatar(armor)==2)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 20, 2, true, false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20, 2,true,false));
										}
										if (this.get_avatar(armor)==3)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false));
										}
										if (this.get_avatar(armor)==4)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 20, 2,true,false));
										}
										if (this.get_avatar(armor)==6)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 20, 2,true,false));
										}
										if (this.get_avatar(armor)==7)
										{
											//Dynaman
										}
										if (this.get_avatar(armor)==8)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 20, 2,true,false));
											player.addPotionEffect(new PotionEffect(PotionCore.SS_PUNCH_BOOST,20, 2,true,false));
										}
										if (this.get_avatar(armor)==9)
										{
											//Changeman
										}
										if (this.get_avatar(armor)==10)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 20, 2,true,false));
										}
										if (this.get_avatar(armor)==11)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 20, 2,true,false));
										}
										if (this.get_avatar(armor)==13)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,250, 3,true,false));
										}
										if (this.get_avatar(armor)==14)
										{
											//Fiveman
										}
									}
								}
							}
						}
					}
				}
			}
		}		
	}
	
	@Override
	public void registerModels() 
	{
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type)
	{
		return Refercence.MODID+":textures/armor/blank.png";
	}
	
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
	{
		return SentaiItems60.blank_sentai_gear == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
	}
	
	public String getTexture(Entity entity, int num,String ext)
	{
		if (entity instanceof EntityLivingBase)
		{
			EntityLivingBase player = ((EntityLivingBase)entity);
			if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()instanceof item_sentai_changer)
			{
				String rider = ((item_don_blaster)player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()).Rider;
				
				if (num==1||num==2||num==5||num==7||num==3||num==6||num==8)
				{
					if ((rider=="inu_brother" || rider == "kiji_brother") & this.get_avatar(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))==0)
					{
						return "blank";
					}
					else if (rider=="don_doragoku" & this.get_avatar(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))==0 & this.get_alter(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))==0)
					{
						return Refercence.MODID+":textures/armor/"+ToraDora[item_don_blaster.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))]+ext;
					}
					else if (rider=="don_momotarou" & this.get_avatar(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))==0 & this.get_alter(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))==0)
					{
						return Refercence.MODID+":textures/armor/"+rider+Momotarou[item_don_blaster.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))]+ext;
					}
					else if (rider=="oni_sister")
					{
						return Refercence.MODID+":textures/armor/"+rider+Oni[item_don_blaster.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))]+ext;
					}
					else if (this.get_avatar(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))!=0)
					{
						return Refercence.MODID+":textures/armor/don_brothers/"+rider+Sentaiger[item_don_blaster.get_avatar(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))]+ext;
					}
					else if (this.get_alter(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))!=0)
					{
						if (this.get_alter(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))==5 || this.get_alter(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))==11)
						{
							return "blank";
						}
						else
						{
							return Refercence.MODID+":textures/armor/"+rider+"_alter"+Alter[item_don_blaster.get_alter(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))]+ext;
						}
					}
					else
					{
						return Refercence.MODID+":textures/armor/"+rider+ext;
					}
				}
				else if (num==4||num==9||num==10||num==11||num==12||num==13||num==14)
				{
					if (rider == "saru_brother" & this.get_avatar(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))==0)
					{
						return Refercence.MODID+":textures/armor/saru_brother_base.png";
					}
					else if (rider == "don_doragoku" & this.get_avatar(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))==0 & this.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))==0 & this.get_alter(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))==0)
					{
						return Refercence.MODID+":textures/armor/don_doragoku_base.png";
					}
					else if (rider == "don_doragoku" & this.get_avatar(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))==0 & this.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))==1 & this.get_alter(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))==0)
					{
						return Refercence.MODID+":textures/armor/don_torabolt_base.png";
					}
					else if (rider == "don_doragoku" & this.get_avatar(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))==0 & this.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))==2 & this.get_alter(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))==0)
					{
						return Refercence.MODID+":textures/armor/zyu_full_dragon_shield"+ext;
					}
					else if (rider == "don_doragoku" & this.get_avatar(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))==0 & this.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))==3 & this.get_alter(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))==0)
					{
						return Refercence.MODID+":textures/armor/kiba_ranger_base"+ext;
					}
					else if (rider == "don_doragoku" & this.get_avatar(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))==0 & this.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))==8 & this.get_alter(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))==0)
					{
						return Refercence.MODID+":textures/armor/star_ninger_base"+ext;
					}
					else if (rider == "don_doragoku" & this.get_avatar(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))==0 & this.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))==15 & this.get_alter(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))==0)
					{
						return Refercence.MODID+":textures/armor/twokaizer_base"+ext;
					}
					else if (rider == "don_momotarou" & this.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="_goldon_armor")
					{
						return Refercence.MODID+":textures/armor/don_momotarou_goldon_armor"+ext;
					}
					else if (rider == "oni_sister" & this.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="_manga_base")
					{
						return Refercence.MODID+":textures/armor/oni_sister_manga_base"+ext;
					}
					else if (rider == "sonoi" & this.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="_kyokatai")
					{
						if (player.getHeldItem(EnumHand.OFF_HAND).getItem()==SentaiItems60.sono_shield || player.getHeldItem(EnumHand.MAIN_HAND).getItem()==SentaiItems60.sono_shield)
						{
							return Refercence.MODID+":textures/armor/blank.png";
						}
						else
						{
							return Refercence.MODID+":textures/armor/sonoi_kyokatai.png";
						}
					}
					else if (rider == "sonoi" & this.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))!="_kyokatai")
					{
						return Refercence.MODID+":textures/armor/sonoi_base.png";
					}
					else if (rider == "sononi")
					{
						return Refercence.MODID+":textures/armor/sononi_base.png";
					}
					else if (rider == "sonoza")
					{
						return Refercence.MODID+":textures/armor/sonoza_base.png";
					}
					else if (rider == "future_oni_sister")
					{
						return Refercence.MODID+":textures/armor/future_oni_sister_base"+ext;
					}
					else
					{
						return "blank";
					}
				}
				else
				{
					return "blank";
				}
			}
			else
			{
				return "blank";
			}
		}
		else
		{
			return "blank";
		}
	}
}