package SS_Craft.mobs.Henchmen;

import SS_Craft.RiderItems;
import SS_Craft.mobs.Boss.EntityBossBase;
import SS_Craft.mobs.Boss.entity_bio_hunter_silva;
import SS_Craft.mobs.Boss.entity_dark_kiramei_silver;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class entity_mechaclones extends Entity_base_henchmen
{
	public entity_mechaclones(World par1World)
	{
		super(par1World);
	}

	/**
	 * Returns the item that this EntityLiving is holding, if any.
	 */
	@Override
	public ItemStack getHeldItemMainhand()
	{
		return new ItemStack(RiderItems.mechaclones_sword);
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			this.dropItem(RiderItems.bioman_logo, 1);
			
			if (this.getAttackTarget() instanceof EntityPlayer)
			{
				EntityPlayer playerIn =	(EntityPlayer) this.getAttackTarget();
				EntityBossBase entityboss = new entity_bio_hunter_silva(world);
				
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
				this.dropItem(RiderItems.red_bio_particles, 1);
				break;

			case 1:
				this.dropItem(RiderItems.green_bio_particles, 1);
				break;

			case 2:
				this.dropItem(RiderItems.blue_bio_particles, 1);
				break;

			case 3:
				this.dropItem(RiderItems.yellow_bio_particles, 1);
				break;

			case 4:
				this.dropItem(RiderItems.pink_bio_particles, 1);
				break;

			case 5:
				this.dropItem(RiderItems.bioman_logo, 2);
				break;
			}
		}
	}
}
