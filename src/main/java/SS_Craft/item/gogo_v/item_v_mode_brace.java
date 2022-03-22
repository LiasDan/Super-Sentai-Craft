package SS_Craft.item.gogo_v;

import SS_Craft.SentaiItems40;
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

public class item_v_mode_brace extends Item implements IHasModel
{
	public item_v_mode_brace(String name)
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
							if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == SentaiItems40.gogo_v_legs)
							{
								if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == SentaiItems40.gogo_v_torso)
								{
									if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == SentaiItems40.gogo_v_head)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20, 3,true,false));
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




