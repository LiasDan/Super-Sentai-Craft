package SS_Craft.mobs.Henchmen;

import SS_Craft.RiderItems;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class entity_machinemen extends Entity_base_henchmen
{
	public entity_machinemen(World par1World)
	{
		super(par1World);
		this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,new ItemStack(RiderItems.machinemen_knife));
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			this.dropItem(RiderItems.sun_vulcan_logo, 1);
			switch (this.rand.nextInt(4))
			{   		   	    		
			case 0:
				this.dropItem(RiderItems.vul_eagle_medal, 1);
				break;

			case 1:
				this.dropItem(RiderItems.vul_shark_medal, 1);
				break;

			case 2:
				this.dropItem(RiderItems.vul_panther_medal, 1);
				break;

			case 3:
				this.dropItem(RiderItems.sun_vulcan_logo, 2);
				break;
			}
		}
	}
}
