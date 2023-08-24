package SS_Craft.mobs.Henchmen;

import SS_Craft.SentaiItems20;
import SS_Craft.mobs.Boss.EntityBossBase;
import SS_Craft.mobs.Boss.entity_signalman_evil;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class entity_wumpers_green extends Entity_base_henchmen
{
	public entity_wumpers_green(World par1World)
	{
		super(par1World);
		this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,new ItemStack(SentaiItems20.wumpers_sword));
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			this.dropItem(SentaiItems20.carranger_logo, 1);
			
			if (this.getAttackTarget() instanceof EntityPlayer)
			{
				EntityPlayer playerIn =	(EntityPlayer) this.getAttackTarget();
				EntityBossBase entityboss = new entity_signalman_evil(world);
				
				switch (this.rand.nextInt(5))
				{
				case 0:
					entityboss.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
					world.spawnEntity(entityboss);
					break;
				}
			}
			
			switch (this.rand.nextInt(6))
			{   		   	    		
			case 0:
				this.dropItem(SentaiItems20.red_racer_badge, 1);
				break;
				
			case 1:
				this.dropItem(SentaiItems20.blue_racer_badge, 1);
				break;

			case 2:
				this.dropItem(SentaiItems20.green_racer_badge, 1);
				break;

			case 3:
				this.dropItem(SentaiItems20.yellow_racer_badge, 1);
				break;

			case 4:
				this.dropItem(SentaiItems20.pink_racer_badge, 1);
				break;
				
			case 5:
				switch (this.rand.nextInt(8))
				{
					case 0:
						this.dropItem(SentaiItems20.white_racer_badge, 1);
						break;
					
					case 1:
						this.dropItem(SentaiItems20.signalman_badge, 1);
						break;

					case 2:
						this.dropItem(SentaiItems20.vrv_master_badge, 1);
						break;

					case 3:
						this.dropItem(SentaiItems20.carranger_logo, 2);
						break;

					case 4:
						this.dropItem(SentaiItems20.carranger_logo, 2);
						break;

					case 5:
						this.dropItem(SentaiItems20.carranger_logo, 2);
						break;

					case 6:
						this.dropItem(SentaiItems20.carranger_logo, 2);
						break;

					case 7:
						this.dropItem(SentaiItems20.carranger_logo, 2);
						break;
				}
				break;
			}
		}
	}
}
