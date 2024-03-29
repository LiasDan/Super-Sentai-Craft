package SS_Craft.mobs.Henchmen;

import SS_Craft.SentaiItems20;
import SS_Craft.SentaiItems60;
import SS_Craft.mobs.Boss.EntityBossBase;
import SS_Craft.mobs.Boss.entity_dark_shishi_red;
import SS_Craft.mobs.Boss.entity_hebitsukai_metal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class entity_indavers_green extends Entity_base_henchmen
{
	public entity_indavers_green(World par1World)
	{
		super(par1World);
		this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,new ItemStack(SentaiItems20.gyoi_saber));
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			this.dropItem(SentaiItems60.blank_kyutama, 1);
			
			if (this.getAttackTarget() instanceof EntityPlayer)
			{
				EntityPlayer playerIn =	(EntityPlayer) this.getAttackTarget();
				EntityBossBase entityboss = new entity_dark_shishi_red(world);
				
				switch (this.rand.nextInt(5))
				{
					case 0:
					entityboss.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
					world.spawnEntity(entityboss);
					break;
				}
			}
			
			switch (this.rand.nextInt(4))
			{   		   	    		
			case 0:
				this.dropItem(SentaiItems60.sasori_kyutama, 1);
				break;
				
			case 1:
				this.dropItem(SentaiItems60.oushi_kyutama, 1);
				break;

			case 2:
				this.dropItem(SentaiItems60.washi_kyutama, 1);
				break;

			case 3:
				switch (this.rand.nextInt(12))
				{
					case 0:
						this.dropItem(SentaiItems60.hercules_kyutama, 1);
						break;
						
					case 1:
						this.dropItem(SentaiItems60.centaurus_kyutama, 1);
						break;
							
					case 2:
						this.dropItem(SentaiItems60.kirin_kyutama, 1);
						break;
							
					case 3:
						this.dropItem(SentaiItems60.otome_kyutama, 1);
						break;
							
					case 4:
						this.dropItem(SentaiItems60.mizuhebi_kyutama, 1);
						break;
							
					case 5:
						this.dropItem(SentaiItems60.reticle_kyutama, 1);
						break;
							
					case 6:
						this.dropItem(SentaiItems60.yamaneko_kyutama, 1);
						break;

					case 7:
						this.dropItem(SentaiItems60.blank_kyutama, 2);
						break;

					case 8:
						this.dropItem(SentaiItems60.blank_kyutama, 2);
						break;

					case 9:
						this.dropItem(SentaiItems60.blank_kyutama, 2);
						break;

					case 10:
						this.dropItem(SentaiItems60.blank_kyutama, 2);
						break;

					case 11:
						this.dropItem(SentaiItems60.blank_kyutama, 2);
						break;
				}
				break;
			}
		}
	}
}
