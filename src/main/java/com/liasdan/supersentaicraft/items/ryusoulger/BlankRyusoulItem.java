package com.liasdan.supersentaicraft.items.ryusoulger;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.liasdan.supersentaicraft.items.others.BaseItem;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class BlankRyusoulItem extends BaseItem {

	public static final List<Item> RYUSOUL = new ArrayList<Item>();
	
	public BlankRyusoulItem(Properties prop) {
		
		super(prop);
	}

	private Item getRyusoulDrop(Item item) {
		
		Random generator = new Random();
		
		int rand = generator.nextInt(RYUSOUL.size());
		
		return RYUSOUL.get(rand);
	}
	
	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int i, boolean flag) {
		
		if (entity instanceof Player) {
			
			Player playerIn = ((Player)entity);
			Item ryusoul = getRyusoulDrop(itemstack.getItem());

			if (!world.isClientSide()) {
				
				playerIn.drop(new ItemStack (ryusoul), true);
				
				itemstack.shrink(1);
			}
		}
	}
}
