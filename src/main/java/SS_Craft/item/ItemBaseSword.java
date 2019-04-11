package SS_Craft.item;



import javax.annotation.Nullable;

import SS_Craft.RiderItems;
import SS_Craft.TokuCraft_core;
import SS_Craft.item.gaoranger.item_g_phone;
import SS_Craft.item.gingaman.item_ginga_brace;
import SS_Craft.item.lupatranger.item_vs_changer;
import SS_Craft.item.maskman.item_masking_brace;
import SS_Craft.item.ninninger.item_ninja_ichibantou;
import SS_Craft.item.shinkenger.item_shodophone;
import SS_Craft.item.sun_vulcan.item_vulcan_brace;
import SS_Craft.item.turboranger.item_turbo_brace;
import SS_Craft.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.EnumAction;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemBaseSword extends ItemSword implements IHasModel
{
    private float weaponDamage;

    public float ENT;
    private final ToolMaterial toolMaterial;

    public ItemBaseSword(String name,ToolMaterial par2EnumToolMaterial)
    {
    	
        super(par2EnumToolMaterial);
        this.toolMaterial = par2EnumToolMaterial;
        this.maxStackSize = 1;
        this.setMaxDamage(par2EnumToolMaterial.getMaxUses());

        setUnlocalizedName(name);
        setRegistryName(name);
        TokuCraft_core.ITEMS.add(this);
        
        this.addPropertyOverride(new ResourceLocation("pull"), new IItemPropertyGetter()
	    {
        	@SideOnly(Side.CLIENT)
	        public float apply(ItemStack stack, @Nullable World worldIn, @Nullable EntityLivingBase entityIn)
	        {
        		if (stack.getItem() == RiderItems.x_rod_sword)
        		{

        			if (entityIn == null)
	                {
	                    return 0.0F;
	                }
        			else if (entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null)
					{
						if (entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_vs_changer)
						{
							if (entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.patran_x_changer)
								return 1;
						}
						else
						{
							return 0;
						}
						
						return 0;
					}
					
					return 0;
	            }
        		if (stack.getItem() == RiderItems.ninja_ichibantou)
        		{

        			if (entityIn == null)
	                {
	                    return 0.0F;
	                }
        			else if (entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null)
					{
						if (entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_ninja_ichibantou)
						{
							if (item_ninja_ichibantou.get_lock(entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)) == "blank")
							{	
								if (entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.aka_ninja_ichibantou)
									return 1;
							}
							if (item_ninja_ichibantou.get_lock(entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)) == "_chouzetsu")
								return 6;
						}
						else
						{
							return 0;
						}
						
						return 0;
					}
					
					return 0;
	            }
        		if (stack.getItem() == RiderItems.starbeast_sword_red || stack.getItem() == RiderItems.starbeast_sword_blue || stack.getItem() == RiderItems.starbeast_sword_yellow || stack.getItem() == RiderItems.starbeast_sword_pink || stack.getItem() == RiderItems.starbeast_sword_green)
        		{

        			if (entityIn == null)
	                {
	                    return 0.0F;
	                }
        			else if (entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null)
					{
						if (entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_ginga_brace)
						{
							if (item_ginga_brace.get_lock(entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)) == "beast_armor_shine")
								return 1;
						}
						else
						{
							return 0;
						}
						
						return 0;
					}
					
					return 0;
	            }
        		return 0;
	        }
		});
    }
    
	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}
    
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
    {
		if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null)
		{
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_masking_brace)
			{
				if (this==RiderItems.laser_magnum_sword)
				{
					if (playerIn.isSneaking())
					{
						playerIn.inventory.clearMatchingItems(RiderItems.laser_magnum_sword, 0, 1, null);
						playerIn.setHeldItem(EnumHand.MAIN_HAND, new ItemStack(RiderItems.laser_magnum_gun));
					}
				}
			}
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_turbo_brace)
			{
				if (this==RiderItems.turbo_laser_sword)
				{
					if (playerIn.isSneaking())
					{
						playerIn.inventory.clearMatchingItems(RiderItems.turbo_laser_sword, 0, 1, null);
						playerIn.setHeldItem(EnumHand.MAIN_HAND, new ItemStack(RiderItems.turbo_laser_gun));
					}
				}
			}
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_g_phone)
			{
				if (this==RiderItems.evil_crushing_hundred_beast_sword)
				{
					if (playerIn.isSneaking())
					{
						playerIn.inventory.clearMatchingItems(RiderItems.evil_crushing_hundred_beast_sword, 0, 1, null);
						
						if (!worldIn.isRemote)
						{
							EntityItem item = new EntityItem(worldIn, playerIn.posX, playerIn.posY, playerIn.posZ, new ItemStack(RiderItems.lion_fang, 1));
							worldIn.spawnEntity(item);
							EntityItem item1 = new EntityItem(worldIn, playerIn.posX, playerIn.posY, playerIn.posZ, new ItemStack(RiderItems.eagle_sword, 1));
							worldIn.spawnEntity(item1);
							EntityItem item2 = new EntityItem(worldIn, playerIn.posX, playerIn.posY, playerIn.posZ, new ItemStack(RiderItems.shark_cutter, 1));
							worldIn.spawnEntity(item2);
							EntityItem item3 = new EntityItem(worldIn, playerIn.posX, playerIn.posY, playerIn.posZ, new ItemStack(RiderItems.bison_axe, 1));
							worldIn.spawnEntity(item3);
							EntityItem item4 = new EntityItem(worldIn, playerIn.posX, playerIn.posY, playerIn.posZ, new ItemStack(RiderItems.tiger_baton, 1));
							worldIn.spawnEntity(item4);
						}
					}
				}
			}
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_vulcan_brace)
			{
				item_vulcan_brace belt = (item_vulcan_brace) playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem();
				
				if (belt == RiderItems.eagle_vulcan_brace)
				{
					if (playerIn.isSneaking())
					{
						if (this==RiderItems.vulcan_stick)
						{
							playerIn.inventory.clearMatchingItems(RiderItems.vulcan_stick, 0, 1, null);
							playerIn.setHeldItem(EnumHand.MAIN_HAND, new ItemStack(RiderItems.vulcan_stick_eagle));
						}
						if (this==RiderItems.vulcan_stick_eagle)
						{
							playerIn.inventory.clearMatchingItems(RiderItems.vulcan_stick, 0, 1, null);
							playerIn.setHeldItem(EnumHand.MAIN_HAND, new ItemStack(RiderItems.vulcan_stick));
						}
					}
				}
			}
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_g_phone)
			{
				if (this == RiderItems.lion_fang)
				{
					if (playerIn.isSneaking())
					{
						playerIn.inventory.clearMatchingItems(RiderItems.lion_fang, 0, 1, null);
						playerIn.setHeldItem(EnumHand.MAIN_HAND, new ItemStack(RiderItems.gao_mane_buster));
					}
				}
			}
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_vs_changer)
			{
				if (this == RiderItems.lupin_sword)
				{
					if (playerIn.isSneaking())
					{
						playerIn.inventory.clearMatchingItems(RiderItems.lupin_sword, 0, 1, null);
						playerIn.setHeldItem(EnumHand.MAIN_HAND, new ItemStack(RiderItems.lupin_sword_magic_hand));
					}
				}
				if (this == RiderItems.lupin_sword_magic_hand)
				{
					if (playerIn.isSneaking())
					{
						playerIn.inventory.clearMatchingItems(RiderItems.lupin_sword_magic_hand, 0, 1, null);
						playerIn.setHeldItem(EnumHand.MAIN_HAND, new ItemStack(RiderItems.lupin_sword));
					}
				}
			}
		}
		
        playerIn.setActiveHand(handIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
}