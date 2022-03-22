package SS_Craft.mobs.Henchmen;

import SS_Craft.SentaiItems20;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class entity_crimers extends Entity_base_henchmen
{
	public entity_crimers(World par1World)
	{
		super(par1World);
		this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,new ItemStack(SentaiItems20.crimers_sword));
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			this.dropItem(SentaiItems20.blank_card, 1);
			switch (this.rand.nextInt(6))
			{   		   	    		
			case 0:
				this.dropItem(SentaiItems20.ace_card, 1);
				break;

			case 1:
				this.dropItem(SentaiItems20.jack_card, 1);
				break;

			case 2:
				this.dropItem(SentaiItems20.queen_card, 1);
				break;

			case 3:
				this.dropItem(SentaiItems20.king_card, 1);
				break;

			case 4:
				this.dropItem(SentaiItems20.big_one_card, 1);
				break;

			case 5:
				this.dropItem(SentaiItems20.blank_card, 2);
				break;
			}
		}
	}
}
