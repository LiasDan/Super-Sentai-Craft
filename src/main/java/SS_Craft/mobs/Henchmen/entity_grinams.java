package SS_Craft.mobs.Henchmen;

import SS_Craft.SentaiItems20;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class entity_grinams extends Entity_base_henchmen
{
	public entity_grinams(World par1World)
	{
		super(par1World);
		this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,new ItemStack(SentaiItems20.grinam_axe));
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			this.dropItem(SentaiItems20.birdonic_wave, 1);
			switch (this.rand.nextInt(6))
			{   		   	    		
			case 0:
				this.dropItem(SentaiItems20.hawk_birdonic_wave, 1);
				break;

			case 1:
				this.dropItem(SentaiItems20.condor_birdonic_wave, 1);
				break;

			case 2:
				this.dropItem(SentaiItems20.owl_birdonic_wave, 1);
				break;

			case 3:
				this.dropItem(SentaiItems20.swan_birdonic_wave, 1);
				break;

			case 4:
				this.dropItem(SentaiItems20.swallow_birdonic_wave, 1);
				break;

			case 5:
				this.dropItem(SentaiItems20.birdonic_wave, 2);
				break;
			}
		}
	}
}
