package SS_Craft.item.megaranger;

import SS_Craft.RiderItems;
import SS_Craft.TokuCraft_core;
import SS_Craft.potion.PotionCore;
import SS_Craft.util.IHasModel;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityFireball;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.init.Blocks;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class item_battleraizer extends Item implements IHasModel
{
	public item_battleraizer(String name)
	{
		super();
		setMaxDamage(0);
		maxStackSize = 1;
	    setTranslationKey(name);
	    setRegistryName(name);
	    TokuCraft_core.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}

	public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) 
	{
		if (par3Entity instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer) par3Entity;
			
			if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD)!= null)
			{
				if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST)!= null)
				{
					if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS)!= null)
					{
						if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null)
						{
							if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == RiderItems.megaranger_legs)
							{
								if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == RiderItems.megaranger_torso)
								{
									if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == RiderItems.megaranger_head)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20, 4,true,false));
									}
								}
							}
						}
					}
				}
			}
		}
	}
}




