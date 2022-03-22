package SS_Craft.mobs.Henchmen;

import SS_Craft.SentaiItems20;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class entity_cutmen extends Entity_base_henchmen
{
	public entity_cutmen(World par1World)
	{
		super(par1World);
		this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,new ItemStack(SentaiItems20.cutmen_sword));
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			this.dropItem(SentaiItems20.battle_fever_logo, 1);
			switch (this.rand.nextInt(6))
			{   		   	    		
			case 0:
				this.dropItem(SentaiItems20.japan_badge, 1);
				break;

			case 1:
				this.dropItem(SentaiItems20.cossack_badge, 1);
				break;

			case 2:
				this.dropItem(SentaiItems20.france_badge, 1);
				break;

			case 3:
				this.dropItem(SentaiItems20.kenya_badge, 1);
				break;

			case 4:
				this.dropItem(SentaiItems20.america_badge, 1);
				break;

			case 5:
				this.dropItem(SentaiItems20.battle_fever_logo, 2);
				break;
			}
		}
	}
}
