package SS_Craft.mobs.Henchmen;

import SS_Craft.SentaiItems20;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class entity_cotpotros extends Entity_base_henchmen
{
	public entity_cotpotros(World par1World)
	{
		super(par1World);
		this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,new ItemStack(SentaiItems20.cotpotros_staff));
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			this.dropItem(SentaiItems20.dairanger_logo, 1);
			switch (this.rand.nextInt(6))
			{   		   	    		
			case 0:
				this.dropItem(SentaiItems20.red_lailai_jewel, 1);
				break;
				
			case 1:
				this.dropItem(SentaiItems20.green_lailai_jewel, 1);
				break;

			case 2:
				this.dropItem(SentaiItems20.blue_lailai_jewel, 1);
				break;

			case 3:
				this.dropItem(SentaiItems20.yellow_lailai_jewel, 1);
				break;

			case 4:
				this.dropItem(SentaiItems20.pink_lailai_jewel, 1);
				break;
				
			case 5:
				switch (this.rand.nextInt(6))
				{
					case 0:
						this.dropItem(SentaiItems20.white_lailai_jewel, 1);
						break;
					
					case 1:
						this.dropItem(SentaiItems20.dairanger_logo, 2);
						break;

					case 2:
						this.dropItem(SentaiItems20.dairanger_logo, 2);
						break;

					case 3:
						this.dropItem(SentaiItems20.dairanger_logo, 2);
						break;

					case 4:
						this.dropItem(SentaiItems20.dairanger_logo, 2);
						break;

					case 5:
						this.dropItem(SentaiItems20.dairanger_logo, 2);
						break;
				}
				break;
			}
		}
	}
}
