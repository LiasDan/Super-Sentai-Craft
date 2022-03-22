package SS_Craft.mobs.Henchmen;

import SS_Craft.SentaiItems20;
import SS_Craft.SentaiItems40;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class entity_kunekunes extends Entity_base_henchmen
{
	public entity_kunekunes(World par1World)
	{
		super(par1World);
		this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,new ItemStack(SentaiItems20.kunekunes_sword));
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			this.dropItem(SentaiItems40.megaranger_logo, 1);
			switch (this.rand.nextInt(6))
			{   		   	    		
			case 0:
				this.dropItem(SentaiItems40.mega_red_disk, 1);
				break;
				
			case 1:
				this.dropItem(SentaiItems40.mega_black_disk, 1);
				break;

			case 2:
				this.dropItem(SentaiItems40.mega_blue_disk, 1);
				break;

			case 3:
				this.dropItem(SentaiItems40.mega_yellow_disk, 1);
				break;

			case 4:
				this.dropItem(SentaiItems40.mega_pink_disk, 1);
				break;
				
			case 5:
				switch (this.rand.nextInt(6))
				{
					case 0:
						this.dropItem(SentaiItems40.mega_silver_disk, 1);
						break;
					
					case 1:
						this.dropItem(SentaiItems40.megaranger_logo, 2);
						break;

					case 2:
						this.dropItem(SentaiItems40.megaranger_logo, 2);
						break;

					case 3:
						this.dropItem(SentaiItems40.megaranger_logo, 2);
						break;

					case 4:
						this.dropItem(SentaiItems40.megaranger_logo, 2);
						break;

					case 5:
						this.dropItem(SentaiItems40.megaranger_logo, 2);
						break;
				}
				break;
			}
		}
	}
}
