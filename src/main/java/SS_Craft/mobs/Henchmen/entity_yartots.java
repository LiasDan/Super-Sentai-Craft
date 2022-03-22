package SS_Craft.mobs.Henchmen;

import SS_Craft.SentaiItems20;
import SS_Craft.SentaiItems40;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class entity_yartots extends Entity_base_henchmen
{
	public entity_yartots(World par1World)
	{
		super(par1World);
		this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,new ItemStack(SentaiItems20.yartots_saber));
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			this.dropItem(SentaiItems40.gingaman_logo, 1);
			switch (this.rand.nextInt(6))
			{   		   	    		
			case 0:
				this.dropItem(SentaiItems40.red_ginga_medal, 1);
				break;
				
			case 1:
				this.dropItem(SentaiItems40.green_ginga_medal, 1);
				break;

			case 2:
				this.dropItem(SentaiItems40.blue_ginga_medal, 1);
				break;

			case 3:
				this.dropItem(SentaiItems40.yellow_ginga_medal, 1);
				break;

			case 4:
				this.dropItem(SentaiItems40.pink_ginga_medal, 1);
				break;
				
			case 5:
				switch (this.rand.nextInt(6))
				{
					case 0:
						this.dropItem(SentaiItems40.black_knight_core, 1);
						break;
					
					case 1:
						this.dropItem(SentaiItems40.gingaman_logo, 2);
						break;

					case 2:
						this.dropItem(SentaiItems40.gingaman_logo, 2);
						break;

					case 3:
						this.dropItem(SentaiItems40.gingaman_logo, 2);
						break;

					case 4:
						this.dropItem(SentaiItems40.gingaman_logo, 2);
						break;

					case 5:
						this.dropItem(SentaiItems40.gingaman_logo, 2);
						break;
				}
				break;
			}
		}
	}
}
