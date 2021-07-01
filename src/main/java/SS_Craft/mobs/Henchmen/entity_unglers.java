package SS_Craft.mobs.Henchmen;

import SS_Craft.RiderItems;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class entity_unglers extends Entity_base_henchmen
{
	public entity_unglers(World par1World)
	{
		super(par1World);
	}

	/**
	 * Returns the item that this EntityLiving is holding, if any.
	 */
	@Override
	public ItemStack getHeldItemMainhand()
	{
		return new ItemStack(RiderItems.ungler_lance);
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			this.dropItem(RiderItems.maskman_logo, 1);
			switch (this.rand.nextInt(6))
			{   		   	    		
			case 0:
				this.dropItem(RiderItems.red_aura_power, 1);
				break;
				
			case 1:
				this.dropItem(RiderItems.black_aura_power, 1);
				break;

			case 2:
				this.dropItem(RiderItems.blue_aura_power, 1);
				break;

			case 3:
				this.dropItem(RiderItems.yellow_aura_power, 1);
				break;

			case 4:
				this.dropItem(RiderItems.pink_aura_power, 1);
				break;
				
			case 5:
				switch (this.rand.nextInt(6))
				{
					case 0:
						this.dropItem(RiderItems.x1_aura_power, 1);
						break;
					
					case 1:
						this.dropItem(RiderItems.maskman_logo, 2);
						break;

					case 2:
						this.dropItem(RiderItems.maskman_logo, 2);
						break;

					case 3:
						this.dropItem(RiderItems.maskman_logo, 2);
						break;

					case 4:
						this.dropItem(RiderItems.maskman_logo, 2);
						break;

					case 5:
						this.dropItem(RiderItems.maskman_logo, 2);
						break;
				}
				break;
			}
		}
	}
}
