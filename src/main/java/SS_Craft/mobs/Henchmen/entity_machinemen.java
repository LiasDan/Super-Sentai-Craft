package SS_Craft.mobs.Henchmen;

import SS_Craft.SentaiItems20;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class entity_machinemen extends Entity_base_henchmen
{
	public entity_machinemen(World par1World)
	{
		super(par1World);
		this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,new ItemStack(SentaiItems20.machinemen_knife));
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			this.dropItem(SentaiItems20.sun_vulcan_logo, 1);
			switch (this.rand.nextInt(4))
			{   		   	    		
			case 0:
				this.dropItem(SentaiItems20.vul_eagle_medal, 1);
				break;

			case 1:
				this.dropItem(SentaiItems20.vul_shark_medal, 1);
				break;

			case 2:
				this.dropItem(SentaiItems20.vul_panther_medal, 1);
				break;

			case 3:
				this.dropItem(SentaiItems20.sun_vulcan_logo, 2);
				break;
			}
		}
	}
}
