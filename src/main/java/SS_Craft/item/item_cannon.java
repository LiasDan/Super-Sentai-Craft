package SS_Craft.item;



import javax.annotation.Nullable;

import SS_Craft.RiderItems;
import SS_Craft.TokuCraft_core;
import SS_Craft.item.gaoranger.item_g_phone;
import SS_Craft.item.gekiranger.item_geki_changer;
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

public class item_cannon extends ItemSword implements IHasModel
{
    private float weaponDamage;

    public float ENT;
    private final ToolMaterial toolMaterial;

    public item_cannon(String name,ToolMaterial par2EnumToolMaterial)
    {
    	
        super(par2EnumToolMaterial);
        this.toolMaterial = par2EnumToolMaterial;
        this.maxStackSize = 1;
        this.setMaxDamage(par2EnumToolMaterial.getMaxUses());

        setTranslationKey(name);
        setRegistryName(name);
        TokuCraft_core.ITEMS.add(this);
    }
    
	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}
    
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
    {
		if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_g_phone)
			{
				if (this==RiderItems.evil_crushing_hundred_beast_sword)
				{
					if (playerIn.isSneaking())
					{
						playerIn.getHeldItemMainhand().shrink(1);
						
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
		
        playerIn.setActiveHand(handIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
}