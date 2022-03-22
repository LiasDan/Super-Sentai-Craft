package SS_Craft.mobs.Henchmen;

import SS_Craft.SentaiItems20;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class entity_zolohs extends Entity_base_henchmen
{
	public entity_zolohs(World par1World)
	{
		super(par1World);
		this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,new ItemStack(SentaiItems20.blanknoitem));
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			this.dropItem(SentaiItems20.flashman_logo, 1);
			switch (this.rand.nextInt(6))
			{   		   	    		
			case 0:
				this.dropItem(SentaiItems20.red_flash_prism, 1);
				break;

			case 1:
				this.dropItem(SentaiItems20.green_flash_prism, 1);
				break;

			case 2:
				this.dropItem(SentaiItems20.blue_flash_prism, 1);
				break;

			case 3:
				this.dropItem(SentaiItems20.yellow_flash_prism, 1);
				break;

			case 4:
				this.dropItem(SentaiItems20.pink_flash_prism, 1);
				break;

			case 5:
				this.dropItem(SentaiItems20.flashman_logo, 2);
				break;
			}
		}
	}
}
