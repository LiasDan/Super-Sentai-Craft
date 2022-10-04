package SS_Craft.mobs.Henchmen;

import SS_Craft.SentaiItems20;
import SS_Craft.SentaiItems60;
import SS_Craft.item.zenkaiger.item_geartlinger;
import SS_Craft.mobs.Boss.EntityBossBase;
import SS_Craft.mobs.Boss.entity_dark_kiramei_silver;
import SS_Craft.mobs.Boss.entity_hakaizer;
import SS_Craft.mobs.Boss.entity_hebitsukai_metal;
import SS_Craft.mobs.Boss.entity_stacaesar;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class entity_kudakks extends Entity_base_henchmen
{
	public entity_kudakks(World par1World)
	{
		super(par1World);
		this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,new ItemStack(SentaiItems20.plug_lancer));
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			this.dropItem(SentaiItems60.blank_sentai_gear, 1);
			
			if (this.getAttackTarget() instanceof EntityPlayer)
			{
				EntityPlayer playerIn =	(EntityPlayer) this.getAttackTarget();
				EntityBossBase entityboss = new entity_stacaesar(world);
				EntityBossBase entityboss1 = new entity_hakaizer(world);
				
				switch (this.rand.nextInt(10))
				{
				case 0:
					playerIn.sendMessage( new TextComponentString(TextFormatting.DARK_PURPLE+"Ja-BAN! Stacaesar!"));
					playerIn.sendStatusMessage(new TextComponentString(TextFormatting.DARK_PURPLE+"Ankoku Change!"), true);
					
					entityboss.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
					world.spawnEntity(entityboss);
					break;
				case 1:
					playerIn.sendMessage( new TextComponentString(TextFormatting.DARK_PURPLE+"Fe-BAN! Stacaesar!"));
					playerIn.sendStatusMessage(new TextComponentString(TextFormatting.DARK_PURPLE+"Ankoku Change!"), true);
					item_geartlinger.set_core(entityboss.getItemStackFromSlot(EntityEquipmentSlot.FEET), 1);
					entityboss.setItemStackToSlot(EntityEquipmentSlot.OFFHAND,new ItemStack(SentaiItems60.sta_shield));
					entityboss.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
					world.spawnEntity(entityboss);
					break;
				case 2:
					playerIn.sendMessage( new TextComponentString(TextFormatting.DARK_RED+"KIKAI NO POWER! HAKAIZER!"));
					entityboss1.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
					world.spawnEntity(entityboss1);
					break;
				case 3:
					playerIn.sendMessage( new TextComponentString(TextFormatting.DARK_RED+"Zenryoku de Hakai!"));
					item_geartlinger.set_core(entityboss1.getItemStackFromSlot(EntityEquipmentSlot.FEET), 1);
					entityboss1.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
					world.spawnEntity(entityboss1);
					break;
				}
			}
			
			switch (this.rand.nextInt(6))
			{   		   	    		
			case 0:
				this.dropItem(SentaiItems60.zenkaizer_gear, 1);
				break;
				
			case 1:
				this.dropItem(SentaiItems60.zenkai_juran_gear, 1);
				break;

			case 2:
				this.dropItem(SentaiItems60.zenkai_gaon_gear, 1);
				break;

			case 3:
				this.dropItem(SentaiItems60.zenkai_magine_gear, 1);
				break;

			case 4:
				this.dropItem(SentaiItems60.zenkai_vroon_gear, 1);
				break;
				
			case 5:
				switch (this.rand.nextInt(7))
				{
					case 0:
						this.dropItem(SentaiItems60.twokaizer_gear, 1);
						break;
					
					case 1:
						this.dropItem(SentaiItems60.zenkai_red_gear, 1);
						break;

					case 2:
						this.dropItem(SentaiItems60.twokai_flint_gear, 1);
						break;

					case 3:
						this.dropItem(SentaiItems60.blank_sentai_gear, 2);
						break;

					case 4:
						this.dropItem(SentaiItems60.blank_sentai_gear, 2);
						break;

					case 5:
						this.dropItem(SentaiItems60.blank_sentai_gear, 2);
						break;

					case 6:
						this.dropItem(SentaiItems60.blank_sentai_gear, 2);
						break;

					case 7:
						this.dropItem(SentaiItems60.blank_sentai_gear, 2);
						break;
				}
				break;
			}
		}
	}
}
