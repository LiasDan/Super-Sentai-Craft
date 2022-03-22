package SS_Craft.item;



import javax.annotation.Nullable;

import SS_Craft.SentaiItems20;
import SS_Craft.SentaiItems40;
import SS_Craft.SentaiItems60;
import SS_Craft.TokuCraft_core;
import SS_Craft.item.gaoranger.item_g_phone;
import SS_Craft.item.gekiranger.item_geki_changer;
import SS_Craft.item.gingaman.item_ginga_brace;
import SS_Craft.item.lupatranger.item_vs_changer;
import SS_Craft.item.maskman.item_masking_brace;
import SS_Craft.item.ninninger.item_ninja_ichibantou;
import SS_Craft.item.ryusoulger.item_ryusoul_changer;
import SS_Craft.item.shinkenger.item_shodophone;
import SS_Craft.item.sun_vulcan.item_vulcan_brace;
import SS_Craft.item.turboranger.item_turbo_brace;
import SS_Craft.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.EnchantmentFireAspect;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.EnumAction;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemBaseSword extends ItemSword implements IHasModel
{
    private float weaponDamage;

    public float ENT;
    private final ToolMaterial toolMaterial;
	private final Item base;   

    public ItemBaseSword(String name,ToolMaterial par2EnumToolMaterial, Item item)
    {
    	
        super(par2EnumToolMaterial);
        this.toolMaterial = par2EnumToolMaterial;
        this.maxStackSize = 1;
        this.setMaxDamage(par2EnumToolMaterial.getMaxUses());

        setTranslationKey(name);
        setRegistryName(name);
        TokuCraft_core.ITEMS.add(this);
        base = item;
        
        this.addPropertyOverride(new ResourceLocation("pull"), new IItemPropertyGetter()
	    {
        	@SideOnly(Side.CLIENT)
	        public float apply(ItemStack stack, @Nullable World worldIn, @Nullable EntityLivingBase entityIn)
	        {
        		if (stack.getItem() == SentaiItems20.ninja_ichibantou)
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
								if (entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems20.aka_ninja_ichibantou)
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
        		}
        		if (stack.getItem() == SentaiItems60.max_ryusoul_changer)
            	{

            		if (entityIn == null)
    	            {
    	                return 0.0F;
    	            }
        			else if (entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null)
					{
						if (entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_ryusoul_changer)
						{
							if (item_ryusoul_changer.get_core(entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)) == 1)
							{	
								if (entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.red_ryusoul_changer)
									return 1;
							}
						}
						else
						{
							return 0;
						}
						
						return 0;
					}
					
					return 0;
	            }
        		if (stack.getItem() == SentaiItems40.starbeast_sword)
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
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
    {
    	if (this == SentaiItems20.fire_sword|this == SentaiItems20.hurricane_sword|this == SentaiItems20.elec_sword|this == SentaiItems20.thunder_sword|this == SentaiItems20.laser_sword)
    	{
			Vec3d look = attacker.getLookVec();
    		target.setVelocity(look.x*1.5, look.y*1.5, look.z*1.5);
    		
    		target.setFire(10);
    	}

        stack.damageItem(1, attacker);
        return true;
    }
    
	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}
	
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
    	return base == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
    }
}