package SS_Craft.mobs.Henchmen;

import SS_Craft.RiderItems;
import SS_Craft.mobs.Boss.EntityBossBase;
import SS_Craft.mobs.Boss.entity_rouki;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class entity_orgettes extends Entity_base_henchmen
{
	public entity_orgettes(World par1World)
	{
		super(par1World);
	}

	/**
	 * Returns the item that this EntityLiving is holding, if any.
	 */
	@Override
	public ItemStack getHeldItemMainhand()
	{
		return new ItemStack(RiderItems.orgettes_club);
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			this.dropItem(RiderItems.empty_gao_jewel, 1);

			if (this.getAttackTarget() instanceof EntityPlayer)
			{
				EntityPlayer playerIn =	(EntityPlayer) this.getAttackTarget();
				EntityBossBase entityboss = new entity_rouki(world);
				
				switch (this.rand.nextInt(5))
				{
					case 0:
					entityboss.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
					world.spawnEntity(entityboss);
					break;
				}
			}
			
			switch (this.rand.nextInt(6))
			{   		   	    		
			case 0:
				this.dropItem(RiderItems.gao_lion_jewel, 1);
				break;
				
			case 1:
				this.dropItem(RiderItems.gao_eagle_jewel, 1);
				break;

			case 2:
				this.dropItem(RiderItems.gao_shark_jewel, 1);
				break;

			case 3:
				this.dropItem(RiderItems.gao_bison_jewel, 1);
				break;

			case 4:
				this.dropItem(RiderItems.gao_tiger_jewel, 1);
				break;
				
			case 5:
				this.dropItem(RiderItems.empty_gao_jewel, 2);
				break;
			}
		}
	}
}
