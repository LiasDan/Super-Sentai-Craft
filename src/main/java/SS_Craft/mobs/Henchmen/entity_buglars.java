package SS_Craft.mobs.Henchmen;

import SS_Craft.SentaiItems20;
import SS_Craft.SentaiItems40;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class entity_buglars extends Entity_base_henchmen
{
	public entity_buglars(World par1World)
	{
		super(par1World);
		this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,new ItemStack(SentaiItems20.buglars_katar));
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			if (this.world.provider.getDimensionType().getId()==-1)
			{
				this.dropItem(SentaiItems40.blank_animal_disk, 1);
				switch (this.rand.nextInt(4))
				{   		   	    		
				case 0:
					this.dropItem(SentaiItems40.cheetah_animal_disk, 1);
					break;
				
				case 1:
					this.dropItem(SentaiItems40.gorilla_animal_disk, 1);
					break;

				case 2:
					this.dropItem(SentaiItems40.rabbit_animal_disk, 1);
					break;

				case 3:
					switch (this.rand.nextInt(9))
					{  		   	    		
						case 0:
							this.dropItem(SentaiItems40.beetle_animal_disk, 1);
							break;
						
						case 1:
							this.dropItem(SentaiItems40.stag_animal_disk, 1);
							break;

						case 2:
							this.dropItem(SentaiItems40.hippopotamus_animal_disk, 2);
							break;

						case 3:
							this.dropItem(SentaiItems40.puma_animal_disk, 2);
							break;

						case 4:
							this.dropItem(SentaiItems40.blank_animal_disk, 2);
							break;

						case 5:
							this.dropItem(SentaiItems40.blank_animal_disk, 2);
							break;

						case 6:
							this.dropItem(SentaiItems40.blank_animal_disk, 2);
							break;

						case 7:
							this.dropItem(SentaiItems40.blank_animal_disk, 2);
							break;

						case 8:
							this.dropItem(SentaiItems40.blank_animal_disk, 2);
							break;
					}
					break;
				}
			}
			else
			{
				this.dropItem(SentaiItems40.enetron, 1);
				switch (this.rand.nextInt(4))
				{   		   	    		
				case 0:
					this.dropItem(SentaiItems40.red_enetron, 1);
					break;
				
				case 1:
					this.dropItem(SentaiItems40.blue_enetron, 1);
					break;

				case 2:
					this.dropItem(SentaiItems40.yellow_enetron, 1);
					break;

				case 3:
					switch (this.rand.nextInt(7))
					{
						case 0:
							this.dropItem(SentaiItems40.gold_enetron, 1);
							break;
					
						case 1:
							this.dropItem(SentaiItems40.silver_enetron, 1);
							break;

						case 2:
							this.dropItem(SentaiItems40.enetron, 2);
							break;

						case 3:
							this.dropItem(SentaiItems40.enetron, 2);
							break;

						case 4:
							this.dropItem(SentaiItems40.enetron, 2);
							break;

						case 5:
							this.dropItem(SentaiItems40.enetron, 2);
							break;

						case 6:
							this.dropItem(SentaiItems40.enetron, 2);
							break;
					}
					break;
				}
			}
		}
	}
}
