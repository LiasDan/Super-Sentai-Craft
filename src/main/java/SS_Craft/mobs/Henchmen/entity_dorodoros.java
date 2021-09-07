package SS_Craft.mobs.Henchmen;

import SS_Craft.RiderItems;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class entity_dorodoros extends Entity_base_henchmen
{
	public entity_dorodoros(World par1World)
	{
		super(par1World);
		this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,new ItemStack(RiderItems.dorodoros_sword));
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			this.dropItem(RiderItems.kakuranger_logo, 1);
			switch (this.rand.nextInt(6))
			{   		   	    		
			case 0:
				this.dropItem(RiderItems.sasuke_medal, 1);
				break;
				
			case 1:
				this.dropItem(RiderItems.tsuruhime_medal, 1);
				break;

			case 2:
				this.dropItem(RiderItems.seikai_medal, 1);
				break;

			case 3:
				this.dropItem(RiderItems.saizou_medal, 1);
				break;

			case 4:
				this.dropItem(RiderItems.jiraiya_medal, 1);
				break;
				
			case 5:
				switch (this.rand.nextInt(6))
				{
					case 0:
						this.dropItem(RiderItems.ninjaman_medal, 1);
						break;
					
					case 1:
						this.dropItem(RiderItems.kakuranger_logo, 2);
						break;

					case 2:
						this.dropItem(RiderItems.kakuranger_logo, 2);
						break;

					case 3:
						this.dropItem(RiderItems.kakuranger_logo, 2);
						break;

					case 4:
						this.dropItem(RiderItems.kakuranger_logo, 2);
						break;

					case 5:
						this.dropItem(RiderItems.kakuranger_logo, 2);
						break;
				}
				break;
			}
		}
	}
}
