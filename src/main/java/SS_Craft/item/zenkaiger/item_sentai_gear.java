package SS_Craft.item.zenkaiger;

import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import SS_Craft.RiderItems;
import SS_Craft.TokuCraft_core;
import SS_Craft.item.gingaman.item_ginga_brace;
import SS_Craft.item.kyuranger.item_seiza_blaster;
import SS_Craft.item.ninninger.item_ninja_ichibantou;
import SS_Craft.item.ryusoulger.item_ryusoul_changer;
import SS_Craft.mobs.Henchmen.Entity_base_henchmen;
import SS_Craft.mobs.allies.entity_ex_aid;
import SS_Craft.mobs.allies.entity_kyuranger;
import SS_Craft.mobs.bikes.EntityBikeBase;
import SS_Craft.mobs.bikes.entity_garu_bike;
import SS_Craft.mobs.mini_boss.entity_ular_captain;
import SS_Craft.potion.PotionCore;
import SS_Craft.util.IHasModel;
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
		if (this.get_ammo(par1ItemStack)==24000){
			return true;
		}else{
			return !true;
		}
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
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_geartlinger && playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() != RiderItems.stacaeser_geartozinger)
			{
				if ((this.get_ammo(par1ItemStack)==100))
				{
					if (num == 1) //Goranger
					{
						playerIn.dropItem(Items.SNOWBALL, 16);
					}
					if (num == 2) //J.A.K.Q.
					{
						if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.twokaizer_geardalinger)
						{
							playerIn.dropItem(RiderItems.big_baton, 1);
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
						
					}
					if (num == 6)//GoGo-V
					{
						if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.zenkaizer_geartlinger)
						{
							playerIn.dropItem(RiderItems.white_ribbon, 1);
						}
						else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.juran_geartlinger)
						{
							playerIn.dropItem(RiderItems.red_ribbon, 1);
						}
						else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.gaon_geartlinger)
						{
							playerIn.dropItem(RiderItems.yellow_ribbon, 1);
						}
						else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.magine_geartlinger)
						{
							playerIn.dropItem(RiderItems.pink_ribbon, 1);
						}
						else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.vroon_geartlinger)
						{
							playerIn.dropItem(RiderItems.blue_ribbon, 1);
						}
					}
					if (num == 7)//Dynaman
					{
						
					}
					if (num == 8)//Bioman
					{
						
					}
					if (num == 9)//Changeman
					{
						
					}
					if (num == 10)//Flashman
					{
						
					}
					if (num == 11)//Maskman
					{
						playerIn.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 1000, 2,true,false));
						playerIn.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 1000, 2,true,false));
					}
					if (num == 12)//Liveman
					{
						playerIn.dropItem(RiderItems.falcon_saber, 1);
					}
					if (num == 13)//Turboranger
					{
						playerIn.addPotionEffect(new PotionEffect(MobEffects.SPEED, 1000, 2,true,false));
					}
					if (num == 14)//Fiveman
					{
						
					}
					if (num == 15)//Jetman
					{
						
					}
					if (num == 16)//Zyuranger
					{
						
					}
					if (num == 17)//Dairanger
					{
						if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.zenkaizer_geartlinger)
						{
							playerIn.dropItem(RiderItems.dairen_rod_ryuu, 1);
						}
						else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.juran_geartlinger)
						{
							playerIn.dropItem(RiderItems.dairen_rod_shishi, 1);
						}
						else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.gaon_geartlinger)
						{
							playerIn.dropItem(RiderItems.dairen_rod_kirin, 1);
						}
						else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.magine_geartlinger)
						{
							playerIn.dropItem(RiderItems.dairen_rod_houou, 1);
						}
						else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.vroon_geartlinger)
						{
							playerIn.dropItem(RiderItems.dairen_rod_tenma, 1);
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
						
					}
					if (num == 20)//Carranger
					{
						
					}
					if (num == 21)//Megaranger
					{
						item_geartlinger.set_effect(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),1);
					}
					if (num == 22)//Gingaman
					{
						
					}
					if (num == 23)//GoGo-V
					{
						
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
						if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.twokaizer_geardalinger)
						{
							playerIn.dropItem(RiderItems.shurikens_bat, 1);
						}
						else
						{
							item_geartlinger.set_effect(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),2);
						}
					}
					if (num == 27)//Abaranger
					{
						
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
						
					}
					if (num == 30)//Boukenger
					{
						
					}
					if (num == 31)//Gekiranger
					{
						if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.twokaizer_geardalinger)
						{
							playerIn.dropItem(RiderItems.sai_blade_cutter, 1);
						}
					}
					if (num == 32)//Go-Onger
					{
						if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.twokaizer_geardalinger)
						{
							playerIn.dropItem(RiderItems.rocket_dagger, 1);
						}
					}
					if (num == 33)//Shinkenger
					{
						
					}
					if (num == 34)//Goseiger
					{
						playerIn.addPotionEffect(new PotionEffect(PotionCore.SS_SHOT_BOOST, 1000, 6,true,false));
					}
					if (num == 35)//Gokaiger
					{
						
					}
					if (num == 36)//Go-Busters
					{
						if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.gaon_geartlinger)
						{
							playerIn.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,1000, 4,true,false));
						}
						else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.vroon_geartlinger)
						{
							playerIn.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,1000, 4,true,false));
							playerIn.addPotionEffect(new PotionEffect(PotionCore.SS_PUNCH_BOOST,1000, 4,true,false));
						}
						else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() != RiderItems.twokaizer_geardalinger)
						{
							playerIn.addPotionEffect(new PotionEffect(MobEffects.SPEED,1000, 4,true,false));
						}
					}
					if (num == 37)//Kyoryuger
					{
						
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
						playerIn.addPotionEffect(new PotionEffect(PotionCore.SS_FLY_POTION,1000, 4,true,false));
						item_geartlinger.set_effect(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),3);
					}
					if (num == 41)//Kyuranger
					{
						if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.twokaizer_geardalinger)
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
						playerIn.dropItem(RiderItems.ryusoul_ken, 1);
					}
					if (num == 44)//Kirameiger
					{
						playerIn.addPotionEffect(new PotionEffect(PotionCore.SS_SHOT_BOOST,1000, 4,true,false));
					}
					if (num == 45)//Zenkaiger
					{
						if (item_geartlinger.get_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))==0 || (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() != RiderItems.twokaizer_geardalinger && playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() != RiderItems.zenkaizer_geartlinger))
						{
							item_geartlinger.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), 1);
						}
						else
						{
							item_geartlinger.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0);
						}
					}
				}
				this.set_ammo(playerIn.getHeldItem(handIn),0);
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