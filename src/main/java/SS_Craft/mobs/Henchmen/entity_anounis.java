package SS_Craft.mobs.Henchmen;

import SS_Craft.SentaiItems20;
import SS_Craft.SentaiItems60;
import SS_Craft.item.don_brothers.item_don_blaster;
import SS_Craft.item.zenkaiger.item_geartlinger;
import SS_Craft.mobs.Boss.EntityBossBase;
import SS_Craft.mobs.Boss.entity_dark_kiramei_silver;
import SS_Craft.mobs.Boss.entity_don_murasame;
import SS_Craft.mobs.Boss.entity_hebitsukai_metal;
import SS_Craft.mobs.Boss.entity_nouto;
import SS_Craft.potion.PotionCore;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class entity_anounis extends Entity_base_henchmen
{
	public entity_anounis(World par1World)
	{
		super(par1World);
		this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,new ItemStack(SentaiItems20.ano_hammer));
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			this.dropItem(SentaiItems60.blank_avatarou_gear, 1);
			
			if (this.getAttackTarget() instanceof EntityPlayer)
			{
				EntityPlayer playerIn =	(EntityPlayer) this.getAttackTarget();
				EntityBossBase entityboss = new entity_nouto(world);
				EntityBossBase entityboss1 = new entity_don_murasame(world);
				
				switch (this.rand.nextInt(5))
				{
				case 0:
					switch (this.rand.nextInt(4))
					{
						case 0:
							entityboss.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
							world.spawnEntity(entityboss);
							break;
						case 1:
							entityboss.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
							item_don_blaster.set_lock(entityboss.getItemStackFromSlot(EntityEquipmentSlot.FEET), 3);
							entityboss.setItemStackToSlot(EntityEquipmentSlot.OFFHAND,new ItemStack(SentaiItems60.sono_shield));
							world.spawnEntity(entityboss);
							break;
						case 2:
							entityboss.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
							entityboss.setItemStackToSlot(EntityEquipmentSlot.FEET,new ItemStack(SentaiItems60.sononi_nouto_brace));
							entityboss.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,new ItemStack(SentaiItems60.condor_arrow));
							world.spawnEntity(entityboss);
							break;
						case 3:
							entityboss.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
							entityboss.setItemStackToSlot(EntityEquipmentSlot.FEET,new ItemStack(SentaiItems60.sonoza_nouto_brace));
							entityboss.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,new ItemStack(SentaiItems60.condor_sword));
							world.spawnEntity(entityboss);
							break;
					}
					break;
				case 1:
					switch (this.rand.nextInt(3))
					{
						case 0:
							playerIn.sendMessage( new TextComponentString(TextFormatting.DARK_PURPLE+"What's Up?! Don Murasame! Kirisute Sorry!"));
							
							entityboss1.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
							world.spawnEntity(entityboss1);
							break;
						case 5:
							playerIn.sendMessage( new TextComponentString(TextFormatting.DARK_PURPLE+"Ark! Dark! Jark! Shark! Ah! Don Murasame Alter! Wow! Same Ninja!"));
							
							entityboss1.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
							item_don_blaster.set_alter(entityboss1.getItemStackFromSlot(EntityEquipmentSlot.FEET), 1);
							entityboss1.addPotionEffect(new PotionEffect(PotionCore.SS_SMALL, 5, 0,true,false));
							world.spawnEntity(entityboss1);
							break;
						case 6:
							playerIn.sendMessage( new TextComponentString(TextFormatting.DARK_PURPLE+"What's Up?! Don Murasame! Kirisute Sorry!"));
							
							entityboss1.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
							entityboss1.setItemStackToSlot(EntityEquipmentSlot.FEET,new ItemStack(SentaiItems60.future_ninjark_sword));
							world.spawnEntity(entityboss1);
							break;
					}
					break;
				}
			}
			
			switch (this.rand.nextInt(6))
			{   		   	    		
			case 0:
				this.dropItem(SentaiItems60.don_momotarou_avatarou_gear, 1);
				break;
				
			case 1:
				this.dropItem(SentaiItems60.saru_brother_avatarou_gear, 1);
				break;

			case 2:
				this.dropItem(SentaiItems60.oni_sister_avatarou_gear, 1);
				break;

			case 3:
				this.dropItem(SentaiItems60.inu_brother_avatarou_gear, 1);
				break;

			case 4:
				this.dropItem(SentaiItems60.kiji_brother_avatarou_gear, 1);
				break;
				
			case 5:
				switch (this.rand.nextInt(7))
				{
					case 0:
						switch (this.rand.nextInt(2))
						{
							case 0:
								this.dropItem(SentaiItems60.don_doragoku_avatarou_gear, 1);
								break;
								
							case 1:
								this.dropItem(SentaiItems60.don_torabolt_avatarou_gear, 1);
								break;
						}
						break;
					
					case 1:
						this.dropItem(SentaiItems60.zenkaizer_black_avatarou_gear, 1);
						break;

					case 2:
						this.dropItem(SentaiItems60.blank_avatarou_gear, 2);
						break;

					case 3:
						this.dropItem(SentaiItems60.blank_avatarou_gear, 2);
						break;

					case 4:
						this.dropItem(SentaiItems60.blank_avatarou_gear, 2);
						break;

					case 5:
						this.dropItem(SentaiItems60.blank_avatarou_gear, 2);
						break;

					case 6:
						this.dropItem(SentaiItems60.blank_avatarou_gear, 2);
						break;
				}
				break;
			}
		}
	}
}
