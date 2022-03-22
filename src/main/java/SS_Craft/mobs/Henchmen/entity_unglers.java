package SS_Craft.mobs.Henchmen;

import SS_Craft.SentaiItems20;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class entity_unglers extends Entity_base_henchmen
{
	public entity_unglers(World par1World)
	{
		super(par1World);
		this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,new ItemStack(SentaiItems20.ungler_lance));
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			this.dropItem(SentaiItems20.maskman_logo, 1);
			switch (this.rand.nextInt(6))
			{   		   	    		
			case 0:
				this.dropItem(SentaiItems20.red_aura_power, 1);
				break;
				
			case 1:
				this.dropItem(SentaiItems20.black_aura_power, 1);
				break;

			case 2:
				this.dropItem(SentaiItems20.blue_aura_power, 1);
				break;

			case 3:
				this.dropItem(SentaiItems20.yellow_aura_power, 1);
				break;

			case 4:
				this.dropItem(SentaiItems20.pink_aura_power, 1);
				break;
				
			case 5:
				switch (this.rand.nextInt(6))
				{
					case 0:
						this.dropItem(SentaiItems20.x1_aura_power, 1);
						break;
					
					case 1:
						this.dropItem(SentaiItems20.maskman_logo, 2);
						break;

					case 2:
						this.dropItem(SentaiItems20.maskman_logo, 2);
						break;

					case 3:
						this.dropItem(SentaiItems20.maskman_logo, 2);
						break;

					case 4:
						this.dropItem(SentaiItems20.maskman_logo, 2);
						break;

					case 5:
						this.dropItem(SentaiItems20.maskman_logo, 2);
						break;
				}
				break;
			}
		}
	}
}
