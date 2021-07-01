package SS_Craft.mobs.Henchmen;

import SS_Craft.RiderItems;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class entity_crimers extends Entity_base_henchmen
{
	public entity_crimers(World par1World)
	{
		super(par1World);
		this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,new ItemStack(RiderItems.crimers_sword));
	}

	/**
	 * Returns the item that this EntityLiving is holding, if any.
	 */
	@Override
	public ItemStack getHeldItemMainhand()
	{
		return new ItemStack(RiderItems.crimers_sword);
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			this.dropItem(RiderItems.blank_card, 1);
			switch (this.rand.nextInt(6))
			{   		   	    		
			case 0:
				this.dropItem(RiderItems.ace_card, 1);
				break;

			case 1:
				this.dropItem(RiderItems.jack_card, 1);
				break;

			case 2:
				this.dropItem(RiderItems.queen_card, 1);
				break;

			case 3:
				this.dropItem(RiderItems.king_card, 1);
				break;

			case 4:
				this.dropItem(RiderItems.big_one_card, 1);
				break;

			case 5:
				this.dropItem(RiderItems.blank_card, 2);
				break;
			}
		}
	}
}
