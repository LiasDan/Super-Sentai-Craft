package SS_Craft.item.zenkaiger;

import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import SS_Craft.SentaiItems20;
import SS_Craft.SentaiItems40;
import SS_Craft.SentaiItems60;
import SS_Craft.TokuCraft_core;
import SS_Craft.item.don_brothers.item_don_blaster;
import SS_Craft.item.gingaman.item_ginga_brace;
import SS_Craft.item.kyuranger.item_seiza_blaster;
import SS_Craft.item.ninninger.item_ninja_ichibantou;
import SS_Craft.item.ryusoulger.item_ryusoul_changer;
import SS_Craft.mobs.Henchmen.Entity_base_henchmen;
import SS_Craft.mobs.allies.entity_don_momotarou;
import SS_Craft.mobs.allies.entity_ex_aid;
import SS_Craft.mobs.allies.entity_kyoryuger;
import SS_Craft.mobs.allies.entity_kyuranger;
import SS_Craft.mobs.bikes.EntityBikeBase;
import SS_Craft.mobs.bikes.entity_garu_bike;
import SS_Craft.mobs.mini_boss.entity_ular_captain;
import SS_Craft.potion.PotionCore;
import SS_Craft.util.IHasModel;
import SS_Craft.world.gen.SuperSentaiTopiaTeleporter;
import SS_Craft.world.gen.modDimensionWorldGen;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.item.EntityEnderPearl;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityParrot;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntityFireball;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.PotionEffect;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class item_sentai_gear extends Item implements IHasModel
{
	public int num;
	public boolean avatarou = false;
	
	public item_sentai_gear(int effect,String name)
	{
		super();
        setTranslationKey(name);
        setRegistryName(name);
        TokuCraft_core.ITEMS.add(this);
		this.setMaxDamage(0);

		num=effect;
	}
	
	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}
	
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack par1ItemStack)
	{
		if (this.get_ammo(par1ItemStack)==100){
			return true;
		}else{
			return !true;
		}
	}
	
	public item_sentai_gear avatarou()
	{
		avatarou=true;
		return this;
	}
	
	public Item avatarou_gear()
	{
		Item[] AvatarouGear = new Item[] {SentaiItems20.blanknoitem,
				SentaiItems60.goranger_avatarou_gear,SentaiItems60.jakq_avatarou_gear,SentaiItems60.battle_fever_avatarou_gear,SentaiItems60.denziman_avatarou_gear,SentaiItems60.sun_vulcan_avatarou_gear,
				SentaiItems60.goggle_v_avatarou_gear,SentaiItems60.dynaman_avatarou_gear,SentaiItems60.bioman_avatarou_gear,SentaiItems60.changeman_avatarou_gear,SentaiItems60.flashman_avatarou_gear,
				SentaiItems60.maskman_avatarou_gear,SentaiItems60.liveman_avatarou_gear,SentaiItems60.turboranger_avatarou_gear,SentaiItems60.fiveman_avatarou_gear,SentaiItems60.jetman_avatarou_gear,
				SentaiItems60.zyuranger_avatarou_gear,SentaiItems60.dairanger_avatarou_gear,SentaiItems60.kakuranger_avatarou_gear,SentaiItems60.ohranger_avatarou_gear,SentaiItems60.carranger_avatarou_gear,
				SentaiItems60.megaranger_avatarou_gear,SentaiItems60.gingaman_avatarou_gear,SentaiItems60.gogo_v_avatarou_gear,SentaiItems60.timeranger_avatarou_gear,SentaiItems60.gaoranger_avatarou_gear,
				SentaiItems60.hurricaneger_avatarou_gear,SentaiItems60.abaranger_avatarou_gear,SentaiItems60.dekaranger_avatarou_gear,SentaiItems60.magiranger_avatarou_gear,SentaiItems60.boukenger_avatarou_gear,
				SentaiItems60.gekiranger_avatarou_gear,SentaiItems60.go_onger_avatarou_gear,SentaiItems60.shinkenger_avatarou_gear,SentaiItems60.goseiger_avatarou_gear,SentaiItems60.gokaiger_avatarou_gear,
				SentaiItems60.go_busters_avatarou_gear,SentaiItems60.kyoryuger_avatarou_gear,SentaiItems60.toqger_avatarou_gear,SentaiItems60.ninninger_avatarou_gear,SentaiItems60.zyuohger_avatarou_gear,
				SentaiItems60.kyuranger_avatarou_gear,SentaiItems60.lupinranger_avatarou_gear,SentaiItems60.ryusoulger_avatarou_gear,SentaiItems60.kirameiger_avatarou_gear,SentaiItems20.blanknoitem,SentaiItems20.blanknoitem,SentaiItems20.blanknoitem};
		return AvatarouGear[num];
	}

	/**
	 * Called when the equipped item is right clicked.
	 */
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
    {
		if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null)
		{
			ItemStack par1ItemStack= playerIn.getHeldItem(handIn);
			
			if (!worldIn.isRemote){
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_geartlinger && playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() != SentaiItems60.stacaeser_geartozinger && playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() != SentaiItems60.hakaizer_belt)
			{
				if ((this.get_ammo(par1ItemStack)==100))
				{
					if (num == 0)
					{
						if (this == SentaiItems60.saber_gear)
						{
							playerIn.dropItem(Item.getByNameOrId("kamenridercraft4th:kaenken_rekka"), 1);
							playerIn.addPotionEffect(new PotionEffect(PotionCore.SS_FIRE_SLASH, 1000, 2,true,false));
						}
						if (this == SentaiItems60.zero_one_gear)
						{
							playerIn.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 1000, 4,true,false));
						}
						if (this == SentaiItems60.zi_o_gear)
						{
							playerIn.addPotionEffect(new PotionEffect(MobEffects.SPEED, 1000, 4,true,false));
							playerIn.addPotionEffect(new PotionEffect(PotionCore.SS_SLASH_BOOST, 1000, 2,true,false));
						}
						if (this == SentaiItems60.akibaranger_gear)
						{
							playerIn.addPotionEffect(new PotionEffect(PotionCore.SS_SLASH_BOOST,100, 4,true,false));
							playerIn.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 100, 4,true,false));
							playerIn.addPotionEffect(new PotionEffect(PotionCore.SS_SHOT_BOOST,100, 4,true,false));
						}
						if (this == SentaiItems60.metallic_twokaizer_gear)
						{
							if (playerIn.dimension==modDimensionWorldGen.SUPER_SENTAI_TOPIA_DIM_ID)
							{
								playerIn.changeDimension(0, new SuperSentaiTopiaTeleporter());
							}
							else
							{
								playerIn.changeDimension(modDimensionWorldGen.SUPER_SENTAI_TOPIA_DIM_ID, new SuperSentaiTopiaTeleporter());
							}
						}
					}
					if (num == 1) //Goranger
					{
						playerIn.dropItem(Items.SNOWBALL, 16);
					}
					if (num == 2) //J.A.K.Q.
					{
						if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.twokaizer_geardalinger)
						{
							playerIn.dropItem(SentaiItems20.big_baton, 1);
						}
					}
					if (num == 3)//Battle Fever
					{
						playerIn.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 1000, 2,true,false));
					}
					if (num == 4)//Denziman
					{
						item_geartlinger.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
					}
					if (num == 5)//Sun Vulcan
					{
						playerIn.dropItem(Items.SNOWBALL, 16);
					}
					if (num == 6)//GoGo-V
					{
						if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.zenkaizer_geartlinger)
						{
							playerIn.dropItem(SentaiItems60.white_ribbon, 1);
						}
						else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.juran_geartlinger)
						{
							playerIn.dropItem(SentaiItems20.red_ribbon, 1);
						}
						else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.gaon_geartlinger)
						{
							playerIn.dropItem(SentaiItems20.yellow_ribbon, 1);
						}
						else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.magine_geartlinger)
						{
							playerIn.dropItem(SentaiItems20.pink_ribbon, 1);
						}
						else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.vroon_geartlinger)
						{
							playerIn.dropItem(SentaiItems20.blue_ribbon, 1);
						}
					}
					if (num == 7)//Dynaman
					{
						Vec3d look =  playerIn.getLookVec();
						EntityFireball fireball =  new EntitySmallFireball(worldIn, playerIn, 5, 1 ,1);

						fireball.setPosition(playerIn.posX + look.x * 1.6,playerIn.posY + 1,playerIn.posZ + look.z * 1.6);
						fireball.motionX = look.x*3;
						fireball.motionY = look.y*3;
						fireball.motionZ = look.z*3;

						worldIn.spawnEntity(fireball);
					}
					if (num == 8)//Bioman
					{
						playerIn.addPotionEffect(new PotionEffect(PotionCore.SS_SHOT_BOOST, 1000, 2,true,false));
					}
					if (num == 9)//Changeman
					{
						Vec3d look =  playerIn.getLookVec();
						EntityFireball fireball =  new EntitySmallFireball(worldIn, playerIn, 5, 1 ,1);

						fireball.setPosition(playerIn.posX + look.x * 1.6,playerIn.posY + 1,playerIn.posZ + look.z * 1.6);
						fireball.motionX = look.x*3;
						fireball.motionY = look.y*3;
						fireball.motionZ = look.z*3;

						worldIn.spawnEntity(fireball);
					}
					if (num == 10)//Flashman
					{
						//nothing
					}
					if (num == 11)//Maskman
					{
						playerIn.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 1000, 2,true,false));
						playerIn.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 1000, 2,true,false));
					}
					if (num == 12)//Liveman
					{
						playerIn.dropItem(SentaiItems20.falcon_saber, 1);
					}
					if (num == 13)//Turboranger
					{
						playerIn.addPotionEffect(new PotionEffect(MobEffects.SPEED, 1000, 2,true,false));
					}
					if (num == 14)//Fiveman
					{
						//nothing
					}
					if (num == 15)//Jetman
					{
						if (item_geartlinger.get_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))==0 && playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.twokaizer_geardalinger)
						{
							item_geartlinger.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),1);
							item_geartlinger.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						}
						else if (item_geartlinger.get_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))==0 && playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() != SentaiItems60.twokaizer_geardalinger && playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() != SentaiItems60.red_geartlinger && playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() != SentaiItems60.stacaeser_geartozinger) 
						{
							item_geartlinger.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),2);
							item_geartlinger.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						}
						else
						{
							item_geartlinger.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0);
						}
					}
					if (num == 16)//Zyuranger
					{
						Vec3d look =  playerIn.getLookVec();
						EntityFireball fireball =  new EntityLargeFireball(worldIn, playerIn, 5, 1 ,1);

						fireball.setPosition(playerIn.posX + look.x * 1.6,playerIn.posY + 1,playerIn.posZ + look.z * 1.6);
						fireball.motionX = look.x*3;
						fireball.motionY = look.y*3;
						fireball.motionZ = look.z*3;

						worldIn.spawnEntity(fireball);
					}
					if (num == 17)//Dairanger
					{
						if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.zenkaizer_geartlinger)
						{
							playerIn.dropItem(SentaiItems20.dairen_rod_ryuu, 1);
						}
						else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.juran_geartlinger)
						{
							playerIn.dropItem(SentaiItems20.dairen_rod_shishi, 1);
						}
						else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.gaon_geartlinger)
						{
							playerIn.dropItem(SentaiItems20.dairen_rod_kirin, 1);
						}
						else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.magine_geartlinger)
						{
							playerIn.dropItem(SentaiItems20.dairen_rod_houou, 1);
						}
						else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.vroon_geartlinger)
						{
							playerIn.dropItem(SentaiItems20.dairen_rod_tenma, 1);
						}
						else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.twokaizer_geardalinger)
						{
							playerIn.dropItem(SentaiItems20.byakkoshinken, 1);
						}
					}
					if (num == 18)//Kakuranger
					{
						EntityEnderPearl entityenderpearl = new EntityEnderPearl(worldIn, playerIn);
						entityenderpearl.shoot(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 1.5F, 1.0F);
			            worldIn.spawnEntity(entityenderpearl);
					}
					if (num == 19)//Ohranger
					{
						playerIn.addPotionEffect(new PotionEffect(MobEffects.SPEED,1000, 4,true,false));
						playerIn.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,1000, 4,true,false));
						playerIn.addPotionEffect(new PotionEffect(MobEffects.HASTE,1000, 4,true,false));
					}
					if (num == 20)//Carranger
					{
						playerIn.addPotionEffect(new PotionEffect(MobEffects.SPEED, 1000, 6,true,false));
						playerIn.addPotionEffect(new PotionEffect(MobEffects.HASTE,1000, 6,true,false));
					}
					if (num == 21)//Megaranger
					{
						item_geartlinger.set_effect(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),1);
					}
					if (num == 22)//Gingaman
					{
						if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.twokaizer_geardalinger)
						{
							playerIn.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY,1000, 2,true,false));
						}
					}
					if (num == 23)//GoGo-V
					{
						playerIn.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 1000, 4,true,false));
						playerIn.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 1000, 4,true,false));
						playerIn.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 1000, 4,true,false));
					}
					if (num == 24)//Timeranger
					{
						Random generator = new Random();
						int rand = generator.nextInt(5);

						if (rand<4)
						{
							playerIn.addPotionEffect(new PotionEffect(MobEffects.SPEED, 1000, 6,true,false));
						}
						else
						{
							playerIn.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 1000, 6,true,false));
						}
						
					}
					if (num == 25)//Gaoranger
					{
						playerIn.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 1000, 3,true,false));
						playerIn.addPotionEffect(new PotionEffect(MobEffects.HASTE,1000, 3,true,false));
						playerIn.addPotionEffect(new PotionEffect(MobEffects.SPEED,1000, 3,true,false));
						playerIn.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,1000, 3,true,false));
					}
					if (num == 26)//Hurricaneger
					{
						if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.twokaizer_geardalinger)
						{
							playerIn.dropItem(SentaiItems40.shurikens_bat, 1);
						}
						else
						{
							item_geartlinger.set_effect(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),2);
						}
					}
					if (num == 27)//Abaranger
					{
						if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.twokaizer_geardalinger)
						{
							playerIn.dropItem(SentaiItems40.wing_pentact, 1);
						}
					}
					if (num == 28)//Dekaranger
					{	
						Vec3d look = playerIn.getLookVec();

						int par4 = (int) (playerIn.posX + look.x* 3);
						int par5 = (int) (playerIn.posY);
						int par6 = (int) (playerIn.posZ + look.z* 3);
						int Xice;
						int Yice;
						int Zice;
						net.minecraft.block.Block type = Blocks.WEB;

						if (!worldIn.isRemote)
						{
							if (worldIn.isAirBlock(new BlockPos(par4, par5, par6)))
							{
								worldIn.setBlockState(new BlockPos(par4, par5, par6), type.getDefaultState());
							}
							if (worldIn.isAirBlock(new BlockPos(par4, par5+1, par6)))
							{
								worldIn.setBlockState(new BlockPos(par4, par5+1, par6), type.getDefaultState());
							}
						}
					}
					if (num == 29)//Magiranger
					{
						if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.zenkaizer_geartlinger)
						{
							playerIn.dropItem(SentaiItems40.magi_stick_red, 1);
						}
						else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.juran_geartlinger)
						{
							playerIn.dropItem(SentaiItems40.magi_stick_green, 1);
						}
						else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.gaon_geartlinger)
						{
							playerIn.dropItem(SentaiItems40.magi_stick_yellow, 1);
						}
						else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.magine_geartlinger)
						{
							playerIn.dropItem(SentaiItems40.magi_stick_pink, 1);
						}
						else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.vroon_geartlinger)
						{
							playerIn.dropItem(SentaiItems40.magi_stick_blue, 1);
						}
					}
					if (num == 30)//Boukenger
					{
						Vec3d look = playerIn.getLookVec();

						int par4 = (int) (playerIn.posX + look.x* 3);
						int par5 = (int) (playerIn.posY);
						int par6 = (int) (playerIn.posZ + look.z* 3);
						int Xice;
						int Yice;
						int Zice;
						net.minecraft.block.Block type = Blocks.STONE;

						if (!worldIn.isRemote)
						{
							if (worldIn.isAirBlock(new BlockPos(par4, par5, par6)))
							{
								worldIn.setBlockState(new BlockPos(par4, par5, par6), type.getDefaultState());
							}
							if (worldIn.isAirBlock(new BlockPos(par4, par5+1, par6)))
							{
								worldIn.setBlockState(new BlockPos(par4, par5+1, par6), type.getDefaultState());
							}
						}
					}
					if (num == 31)//Gekiranger
					{
						if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.twokaizer_geardalinger)
						{
							playerIn.dropItem(SentaiItems40.sai_blade_cutter, 1);
						}
					}
					if (num == 32)//Go-Onger
					{
						if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.twokaizer_geardalinger)
						{
							playerIn.dropItem(SentaiItems40.rocket_dagger, 1);
						}
					}
					if (num == 33)//Shinkenger
					{
						playerIn.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE,1000, 1,true,false));
						playerIn.addPotionEffect(new PotionEffect(PotionCore.SS_SLASH_BOOST,1000, 4,true,false));
						playerIn.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 1000, 4,true,false));
					}
					if (num == 34)//Goseiger
					{
						if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.twokaizer_geardalinger)
						{
							item_geartlinger.set_effect(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),3);
						}
						else
						{
							playerIn.addPotionEffect(new PotionEffect(PotionCore.SS_SHOT_BOOST, 1000, 6,true,false));
						}
					}
					if (num == 35)//Gokaiger
					{
						if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.juran_geartlinger)
						{
							playerIn.dropItem(SentaiItems60.gaon_claw, 1);
						}
						else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.gaon_geartlinger)
						{
							playerIn.dropItem(SentaiItems60.juran_sword, 1);
						}
						else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.magine_geartlinger)
						{
							playerIn.dropItem(SentaiItems60.vroon_picker, 1);
						}
						else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.vroon_geartlinger)
						{
							playerIn.dropItem(SentaiItems60.magine_stick, 1);
						}
					}
					if (num == 36)//Go-Busters
					{
						if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.gaon_geartlinger)
						{
							playerIn.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,1000, 4,true,false));
						}
						else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.vroon_geartlinger)
						{
							playerIn.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,1000, 4,true,false));
							playerIn.addPotionEffect(new PotionEffect(PotionCore.SS_PUNCH_BOOST,1000, 4,true,false));
						}
						else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() != SentaiItems60.twokaizer_geardalinger)
						{
							playerIn.addPotionEffect(new PotionEffect(MobEffects.SPEED,1000, 4,true,false));
						}
					}
					if (num == 37)//Kyoryuger
					{
						playerIn.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 1000, 4,true,false));
						playerIn.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 1000, 4,true,false));
						playerIn.addPotionEffect(new PotionEffect(PotionCore.SS_SHOT_BOOST,1000, 4,true,false));
					}
					if (num == 38)//Toqger
					{
						item_geartlinger.set_effect(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),2);
					}
					if (num == 39)//Ninninger
					{
						playerIn.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,1000, 4,true,false));
						playerIn.addPotionEffect(new PotionEffect(PotionCore.SS_SLASH_BOOST,1000, 4,true,false));
					}
					if (num == 40)//Zyuohger
					{
						if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.twokaizer_geardalinger)
						{
							playerIn.dropItem(SentaiItems40.zyuoh_the_rod, 1);
						}
						else
						{
							playerIn.addPotionEffect(new PotionEffect(PotionCore.SS_FLY_POTION,1000, 4,true,false));
							item_geartlinger.set_effect(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),3);
						}
					}
					if (num == 41)//Kyuranger
					{
						if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.twokaizer_geardalinger)
						{
							playerIn.addPotionEffect(new PotionEffect(PotionCore.SS_BIG,1000, 4,true,false));
						}
						else
						{
							playerIn.addPotionEffect(new PotionEffect(MobEffects.LUCK,1000, 4,true,false));
						}
					}
					if (num == 42)//Lupinranger & Patranger
					{
						playerIn.addPotionEffect(new PotionEffect(PotionCore.SS_SHOT_BOOST,1000, 4,true,false));
					}
					if (num == 43)//Ryusoulger
					{
						playerIn.dropItem(SentaiItems60.ryusoul_ken, 1);
					}
					if (num == 44)//Kirameiger
					{
						playerIn.addPotionEffect(new PotionEffect(PotionCore.SS_SHOT_BOOST,1000, 4,true,false));
					}
					if (num == 45)//Zenkaiger
					{
						if (item_geartlinger.get_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))==0 || (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() != SentaiItems60.twokaizer_geardalinger && playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() != SentaiItems60.zenkaizer_geartlinger))
						{
							item_geartlinger.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), 1);
						}
						else
						{
							item_geartlinger.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0);
						}
					}
					if (num == 46)
					{
						entity_don_momotarou don_momotarou = new entity_don_momotarou(worldIn);
						
						don_momotarou.setLocationAndAngles(playerIn.posX, playerIn.posY, playerIn.posZ, 0, 0.0F);
						worldIn.spawnEntity(don_momotarou);
						
						playerIn.getHeldItem(handIn).shrink(1);
					}
				}
				this.set_ammo(playerIn.getHeldItem(handIn),0);
			}
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_don_blaster)
			{
				if (avatarou==true)
				{
					if (this == SentaiItems60.patranger_gear)
					{
						playerIn.dropItem(SentaiItems60.patranger_avatarou_gear, 1);
					}
					else
					{
						playerIn.dropItem(avatarou_gear(), 1);
					}

					if (!playerIn.capabilities.isCreativeMode)
					{
						if(handIn==EnumHand.MAIN_HAND)
						{
							playerIn.getHeldItemMainhand().shrink(1);			
						}
						else
						{
							playerIn.getHeldItemOffhand().shrink(1);	
						}
					}
				}
			}
			this.set_ammo(playerIn.getHeldItem(handIn),0);
		}
		}
		
        playerIn.setActiveHand(handIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
    
    public static int get_ammo(ItemStack itemstack)
	{
		return itemstack.hasTagCompound() ? itemstack.getTagCompound().getInteger("Ammo") : 0;
	}

	public static void set_ammo(ItemStack itemstack, int flag)
	{
		if (!itemstack.hasTagCompound())
		{
			itemstack.setTagCompound(new NBTTagCompound());
		}
		itemstack.getTagCompound().setInteger("Ammo", flag);
	}
	
	public void onUpdate(ItemStack par1ItemStack, World worldIn, Entity par3Entity, int par4, boolean par5) {

		if (this.get_ammo(par1ItemStack)<100){
			this.set_ammo(par1ItemStack, this.get_ammo(par1ItemStack)+1);
		}
	}
	
	/**
     * allows items to add custom lines of information to the mouseover description
     */
	@Override
    @SideOnly(Side.CLIENT)
	 public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
		tooltip.add(TextFormatting.BLUE + "Zenkai Power: "+ get_ammo(stack) +"%");
		//tooltip.add(TextFormatting.RED + "");
		
	}
}