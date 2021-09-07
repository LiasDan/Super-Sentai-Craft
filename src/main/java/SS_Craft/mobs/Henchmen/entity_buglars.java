package SS_Craft.mobs.Henchmen;

import SS_Craft.RiderItems;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class entity_buglars extends Entity_base_henchmen
{
	public entity_buglars(World par1World)
	{
		super(par1World);
		this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,new ItemStack(RiderItems.buglars_katar));
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			if (this.world.provider.getDimensionType().getId()==-1)
			{
				this.dropItem(RiderItems.blank_animal_disk, 1);
				switch (this.rand.nextInt(4))
				{   		   	    		
				case 0:
					this.dropItem(RiderItems.cheetah_animal_disk, 1);
					break;
				
				case 1:
					this.dropItem(RiderItems.gorilla_animal_disk, 1);
					break;

				case 2:
					this.dropItem(RiderItems.rabbit_animal_disk, 1);
					break;

				case 3:
					switch (this.rand.nextInt(9))
					{  		   	    		
						case 0:
							this.dropItem(RiderItems.beetle_animal_disk, 1);
							break;
						
						case 1:
							this.dropItem(RiderItems.stag_animal_disk, 1);
							break;

						case 2:
							this.dropItem(RiderItems.hippopotamus_animal_disk, 2);
							break;

						case 3:
							this.dropItem(RiderItems.puma_animal_disk, 2);
							break;

						case 4:
							this.dropItem(RiderItems.blank_animal_disk, 2);
							break;

						case 5:
							this.dropItem(RiderItems.blank_animal_disk, 2);
							break;

						case 6:
							this.dropItem(RiderItems.blank_animal_disk, 2);
							break;

						case 7:
							this.dropItem(RiderItems.blank_animal_disk, 2);
							break;

						case 8:
							this.dropItem(RiderItems.blank_animal_disk, 2);
							break;
					}
					break;
				}
			}
			else
			{
				this.dropItem(RiderItems.enetron, 1);
				switch (this.rand.nextInt(4))
				{   		   	    		
				case 0:
					this.dropItem(RiderItems.red_enetron, 1);
					break;
				
				case 1:
					this.dropItem(RiderItems.blue_enetron, 1);
					break;

				case 2:
					this.dropItem(RiderItems.yellow_enetron, 1);
					break;

				case 3:
					switch (this.rand.nextInt(7))
					{
						case 0:
							this.dropItem(RiderItems.gold_enetron, 1);
							break;
					
						case 1:
							this.dropItem(RiderItems.silver_enetron, 1);
							break;

						case 2:
							this.dropItem(RiderItems.enetron, 2);
							break;

						case 3:
							this.dropItem(RiderItems.enetron, 2);
							break;

						case 4:
							this.dropItem(RiderItems.enetron, 2);
							break;

						case 5:
							this.dropItem(RiderItems.enetron, 2);
							break;

						case 6:
							this.dropItem(RiderItems.enetron, 2);
							break;
					}
					break;
				}
			}
		}
	}
}
