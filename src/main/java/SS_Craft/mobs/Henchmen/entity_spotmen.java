package SS_Craft.mobs.Henchmen;

import SS_Craft.SentaiItems20;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class entity_spotmen extends Entity_base_henchmen
{
	public entity_spotmen(World par1World)
	{
		super(par1World);
		this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,new ItemStack(SentaiItems20.spotmen_spear));
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			this.dropItem(SentaiItems20.goggle_v_logo, 1);
			switch (this.rand.nextInt(6))
			{   		   	    		
			case 0:
				this.dropItem(SentaiItems20.atlantis_ruby, 1);
				break;

			case 1:
				this.dropItem(SentaiItems20.angkor_wat_emerald, 1);
				break;

			case 2:
				this.dropItem(SentaiItems20.egypt_saphire, 1);
				break;

			case 3:
				this.dropItem(SentaiItems20.lemuria_opal, 1);
				break;

			case 4:
				this.dropItem(SentaiItems20.mayan_diamond, 1);
				break;

			case 5:
				this.dropItem(SentaiItems20.goggle_v_logo, 2);
				break;
			}
		}
	}
}
