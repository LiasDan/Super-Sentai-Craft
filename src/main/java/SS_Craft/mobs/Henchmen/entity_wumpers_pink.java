package SS_Craft.mobs.Henchmen;

import SS_Craft.SentaiItems20;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class entity_wumpers_pink extends Entity_base_henchmen
{
	public entity_wumpers_pink(World par1World)
	{
		super(par1World);
		this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,new ItemStack(SentaiItems20.wumpers_sword));
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			this.dropItem(SentaiItems20.carranger_logo, 1);
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
				switch (this.rand.nextInt(7))
				{
					case 0:
						this.dropItem(SentaiItems20.white_racer_badge, 1);
						break;
					
					case 1:
						this.dropItem(SentaiItems20.signalman_badge, 1);
						break;

					case 2:
						this.dropItem(SentaiItems20.carranger_logo, 2);
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
				}
				break;
			}
		}
	}
}
