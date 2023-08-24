package SS_Craft;

import SS_Craft.util.Refercence;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Tabs
{
	public static ToolMaterial sword = new EnumHelper().addToolMaterial("sword", 10, 4000, 12.0F, 5.0F, 22);
	public static ToolMaterial super_sword = new EnumHelper().addToolMaterial("super_sword", 10, 8000, 12.0F, 12.0F, 22);
	public static ToolMaterial rod = new EnumHelper().addToolMaterial("rod", 10, 4000, 12.0F, 4.0F, 22);
	public static ToolMaterial axe = new EnumHelper().addToolMaterial("axe", 10, 4000, 12.0F, 6.0F, 22);
	public static ToolMaterial gun = new EnumHelper().addToolMaterial("gun", 10, 2000, 12.0F, 0.0F, 22);
	public static ToolMaterial super_gun = new EnumHelper().addToolMaterial("super_gun", 10, 3000, 12.0F, 3.0F, 22);
	public static ToolMaterial hyper_gun = new EnumHelper().addToolMaterial("hyper_gun", 10, 4000, 12.0F, 5.0F, 22);
	public static ToolMaterial bow = new EnumHelper().addToolMaterial("bow", 10, 5000, 12.0F, 2.0F, 22);
	public static ToolMaterial stronger_bow = new EnumHelper().addToolMaterial("stronger_bow", 10, 10000, 12.0F, 4.0F, 22);
	public static ToolMaterial bomb = new EnumHelper().addToolMaterial("bomb", 10, 2500, 12.0F, 7.0F, 22);
	public static ToolMaterial boomerang = new EnumHelper().addToolMaterial("boomerang", 10, 4000, 12.0F, 3.0F, 22);
	public static ToolMaterial tonfa = new EnumHelper().addToolMaterial("tonfa", 10, 4000, 12.0F, 6.0F, 22);
	public static ToolMaterial throwable = new EnumHelper().addToolMaterial("throwable", 10, 2500, 12.0F, 5.0F, 22);
	public static ToolMaterial whip = new EnumHelper().addToolMaterial("whip", 10, 4000, 12.0F, 6.0F, 22);
	public static ToolMaterial megaton = new EnumHelper().addToolMaterial("megaton", 10, 4000, 12.0F, 8.0F, 22);
	public static ToolMaterial bazooka = new EnumHelper().addToolMaterial("bazooka", 10, 5000, 12.0F, 10.0F, 22);
	public static ToolMaterial hammer = new EnumHelper().addToolMaterial("hammer", 10, 4000, 12.0F, 4.0F, 22);
	public static ToolMaterial sword_gun = new EnumHelper().addToolMaterial("sword_gun", 10, 3500, 12.0F, 5.0F, 22);
	
	public static ArmorMaterial mecha = new EnumHelper().addArmorMaterial("mecha", "diamond", 99, new int[]{9, 18, 24, 9}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 8.0F);
	public static ToolMaterial mecha_sword = new EnumHelper().addToolMaterial("mecha_sword", 10, 30000, 30.0F, 30.0F, 22);
	
	//01
	public static CreativeTabs tabGoranger= new CreativeTabs("tabGoranger")
	{
		@SideOnly(Side.CLIENT)
	    public net.minecraft.util.ResourceLocation getBackgroundImage()
	    {
	        return new net.minecraft.util.ResourceLocation(Refercence.MODID,"textures/gui/tab_goranger_items.png");
	    }
		@Override
		public ItemStack createIcon() {
			return new ItemStack(SentaiItems20.goranger_head);
		}
	};
	//02
	public static CreativeTabs tabJakq= new CreativeTabs("tabJakq")
	{
		@SideOnly(Side.CLIENT)
	    public net.minecraft.util.ResourceLocation getBackgroundImage()
	    {
	        return new net.minecraft.util.ResourceLocation(Refercence.MODID,"textures/gui/tab_jakq_items.png");
	    }
		@Override
		public ItemStack createIcon() {
			return new ItemStack(SentaiItems20.jakq_head);
		}
	};
	//03
	public static CreativeTabs tabBattleFever= new CreativeTabs("tabBattleFever")
	{
		@SideOnly(Side.CLIENT)
	    public net.minecraft.util.ResourceLocation getBackgroundImage()
	    {
	        return new net.minecraft.util.ResourceLocation(Refercence.MODID,"textures/gui/tab_battle_fever_items.png");
	    }
		@Override
		public ItemStack createIcon() {
			return new ItemStack(SentaiItems20.battle_fever_head);
		}
	};
	//04
	public static CreativeTabs tabDenziman= new CreativeTabs("tabDenziman")
	{
		@SideOnly(Side.CLIENT)
	    public net.minecraft.util.ResourceLocation getBackgroundImage()
	    {
	        return new net.minecraft.util.ResourceLocation(Refercence.MODID,"textures/gui/tab_denziman_items.png");
	    }
		@Override
		public ItemStack createIcon() {
			return new ItemStack(SentaiItems20.denziman_head);
		}
	};
	//05
	public static CreativeTabs tabSunVulcan= new CreativeTabs("tabSunVulcan")
	{
		@SideOnly(Side.CLIENT)
	    public net.minecraft.util.ResourceLocation getBackgroundImage()
	    {
	        return new net.minecraft.util.ResourceLocation(Refercence.MODID,"textures/gui/tab_sun_vulcan_items.png");
	    }
		@Override
		public ItemStack createIcon() {
			return new ItemStack(SentaiItems20.sun_vulcan_head);
		}
	};
	//06
	public static CreativeTabs tabGoggleV= new CreativeTabs("tabGoggleV")
	{
		@SideOnly(Side.CLIENT)
	    public net.minecraft.util.ResourceLocation getBackgroundImage()
	    {
	        return new net.minecraft.util.ResourceLocation(Refercence.MODID,"textures/gui/tab_goggle_v_items.png");
	    }
		@Override
		public ItemStack createIcon() {
			return new ItemStack(SentaiItems20.goggle_v_head);
		}
	};
	//08
	public static CreativeTabs tabBioman= new CreativeTabs("tabBioman")
	{
		@SideOnly(Side.CLIENT)
	    public net.minecraft.util.ResourceLocation getBackgroundImage()
	    {
	        return new net.minecraft.util.ResourceLocation(Refercence.MODID,"textures/gui/tab_bioman_items.png");
	    }
		@Override
		public ItemStack createIcon() {
			return new ItemStack(SentaiItems20.bioman_head);
		}
	};
	//10
	public static CreativeTabs tabFlashman= new CreativeTabs("tabFlashman")
	{
		@SideOnly(Side.CLIENT)
	    public net.minecraft.util.ResourceLocation getBackgroundImage()
	    {
	        return new net.minecraft.util.ResourceLocation(Refercence.MODID,"textures/gui/tab_flashman_items.png");
	    }
		@Override
		public ItemStack createIcon() {
			return new ItemStack(SentaiItems20.flashman_head);
		}
	};
	//11
	public static CreativeTabs tabMaskman= new CreativeTabs("tabMaskman")
	{
		@SideOnly(Side.CLIENT)
	    public net.minecraft.util.ResourceLocation getBackgroundImage()
	    {
	        return new net.minecraft.util.ResourceLocation(Refercence.MODID,"textures/gui/tab_maskman_items.png");
	    }
		@Override
		public ItemStack createIcon() {
			return new ItemStack(SentaiItems20.maskman_head);
		}
	};
	//12
	public static CreativeTabs tabLiveman= new CreativeTabs("tabLiveman")
	{
		@SideOnly(Side.CLIENT)
	    public net.minecraft.util.ResourceLocation getBackgroundImage()
	    {
	        return new net.minecraft.util.ResourceLocation(Refercence.MODID,"textures/gui/tab_liveman_items.png");
	    }
		@Override
		public ItemStack createIcon() {
			return new ItemStack(SentaiItems20.liveman_head);
		}
	};
	//13
	public static CreativeTabs tabTurboranger= new CreativeTabs("tabTurboranger")
	{
		@SideOnly(Side.CLIENT)
	    public net.minecraft.util.ResourceLocation getBackgroundImage()
	    {
	        return new net.minecraft.util.ResourceLocation(Refercence.MODID,"textures/gui/tab_turboranger_items.png");
	    }
		@Override
		public ItemStack createIcon() {
			return new ItemStack(SentaiItems20.turboranger_head);
		}
	};
	//15
	public static CreativeTabs tabJetman= new CreativeTabs("tabJetman")
	{
		@SideOnly(Side.CLIENT)
	    public net.minecraft.util.ResourceLocation getBackgroundImage()
	    {
	        return new net.minecraft.util.ResourceLocation(Refercence.MODID,"textures/gui/tab_jetman_items.png");
	    }
		@Override
		public ItemStack createIcon() {
			return new ItemStack(SentaiItems20.jetman_head);
		}
	};
	//16
	public static CreativeTabs tabZyuranger= new CreativeTabs("tabZyuranger")
	{
		@SideOnly(Side.CLIENT)
	    public net.minecraft.util.ResourceLocation getBackgroundImage()
	    {
	        return new net.minecraft.util.ResourceLocation(Refercence.MODID,"textures/gui/tab_zyuranger_items.png");
	    }
		@Override
		public ItemStack createIcon() {
			return new ItemStack(SentaiItems20.zyuranger_head);
		}
	};
	//17
	public static CreativeTabs tabDairanger= new CreativeTabs("tabDairanger")
	{
		@SideOnly(Side.CLIENT)
	    public net.minecraft.util.ResourceLocation getBackgroundImage()
	    {
	        return new net.minecraft.util.ResourceLocation(Refercence.MODID,"textures/gui/tab_dairanger_items.png");
	    }
		@Override
		public ItemStack createIcon() {
			return new ItemStack(SentaiItems20.dairanger_head);
		}
	};
	//18
	public static CreativeTabs tabKakuranger= new CreativeTabs("tabKakuranger")
	{
		@SideOnly(Side.CLIENT)
	    public net.minecraft.util.ResourceLocation getBackgroundImage()
	    {
	        return new net.minecraft.util.ResourceLocation(Refercence.MODID,"textures/gui/tab_kakuranger_items.png");
	    }
		@Override
		public ItemStack createIcon() {
			return new ItemStack(SentaiItems20.kakuranger_head);
		}
	};
	//20
	public static CreativeTabs tabCarranger= new CreativeTabs("tabCarranger")
	{
		@SideOnly(Side.CLIENT)
	    public net.minecraft.util.ResourceLocation getBackgroundImage()
	    {
	        return new net.minecraft.util.ResourceLocation(Refercence.MODID,"textures/gui/tab_carranger_items.png");
	    }
		@Override
		public ItemStack createIcon() {
			return new ItemStack(SentaiItems20.carranger_head);
		}
	};
	//21
	public static CreativeTabs tabMegaranger= new CreativeTabs("tabMegaranger")
	{
		@SideOnly(Side.CLIENT)
	    public net.minecraft.util.ResourceLocation getBackgroundImage()
	    {
	        return new net.minecraft.util.ResourceLocation(Refercence.MODID,"textures/gui/tab_megaranger_items.png");
	    }
		@Override
		public ItemStack createIcon() {
			return new ItemStack(SentaiItems40.megaranger_head);
		}
	};
	//22
	public static CreativeTabs tabGingaman= new CreativeTabs("tabGingaman")
	{
		@SideOnly(Side.CLIENT)
	    public net.minecraft.util.ResourceLocation getBackgroundImage()
	    {
	        return new net.minecraft.util.ResourceLocation(Refercence.MODID,"textures/gui/tab_gingaman_items.png");
	    }
		@Override
		public ItemStack createIcon() {
			return new ItemStack(SentaiItems40.gingaman_head);
		}
	};
	//23
	public static CreativeTabs tabGogoV= new CreativeTabs("tabGogoV")
	{
		@SideOnly(Side.CLIENT)
	    public net.minecraft.util.ResourceLocation getBackgroundImage()
	    {
	        return new net.minecraft.util.ResourceLocation(Refercence.MODID,"textures/gui/tab_gogo_v_items.png");
	    }
		@Override
		public ItemStack createIcon() {
			return new ItemStack(SentaiItems40.gogo_v_head);
		}
	};
	//25
	public static CreativeTabs tabGaoranger= new CreativeTabs("tabGaoranger")
	{
		@SideOnly(Side.CLIENT)
	    public net.minecraft.util.ResourceLocation getBackgroundImage()
	    {
	        return new net.minecraft.util.ResourceLocation(Refercence.MODID,"textures/gui/tab_gaoranger_items.png");
	    }
		@Override
		public ItemStack createIcon() {
			return new ItemStack(SentaiItems40.gaoranger_head);
		}
	};
	//27
	public static CreativeTabs tabAbaranger= new CreativeTabs("tabAbaranger")
	{
		@SideOnly(Side.CLIENT)
	    public net.minecraft.util.ResourceLocation getBackgroundImage()
	    {
	        return new net.minecraft.util.ResourceLocation(Refercence.MODID,"textures/gui/tab_abaranger_items.png");
	    }
		@Override
		public ItemStack createIcon() {
			return new ItemStack(SentaiItems40.abaranger_head);
		}
	};
	//28
	public static CreativeTabs tabDekaranger= new CreativeTabs("tabDekaranger")
	{
		@SideOnly(Side.CLIENT)
	    public net.minecraft.util.ResourceLocation getBackgroundImage()
	    {
	        return new net.minecraft.util.ResourceLocation(Refercence.MODID,"textures/gui/tab_dekaranger_items.png");
	    }
		@Override
		public ItemStack createIcon() {
			return new ItemStack(SentaiItems40.dekaranger_head);
		}
	};
	//30
	public static CreativeTabs tabBoukenger= new CreativeTabs("tabBoukenger")
	{
		@SideOnly(Side.CLIENT)
	    public net.minecraft.util.ResourceLocation getBackgroundImage()
	    {
	        return new net.minecraft.util.ResourceLocation(Refercence.MODID,"textures/gui/tab_boukenger_items.png");
	    }
		@Override
		public ItemStack createIcon() {
			return new ItemStack(SentaiItems40.boukenger_head);
		}
	};
	//31
	public static CreativeTabs tabGekiranger= new CreativeTabs("tabGekiranger")
	{
		@SideOnly(Side.CLIENT)
	    public net.minecraft.util.ResourceLocation getBackgroundImage()
	    {
	        return new net.minecraft.util.ResourceLocation(Refercence.MODID,"textures/gui/tab_gekiranger_items.png");
	    }
		@Override
		public ItemStack createIcon() {
			return new ItemStack(SentaiItems40.gekiranger_head);
		}
	};
	//32
	public static CreativeTabs tabGoOnger= new CreativeTabs("tabGoOnger")
	{
		@SideOnly(Side.CLIENT)
	    public net.minecraft.util.ResourceLocation getBackgroundImage()
	    {
	        return new net.minecraft.util.ResourceLocation(Refercence.MODID,"textures/gui/tab_go_onger_items.png");
	    }
		@Override
		public ItemStack createIcon() {
			return new ItemStack(SentaiItems40.go_onger_head);
		}
	};
	//33
	public static CreativeTabs tabShinkenger= new CreativeTabs("tabShinkenger")
	{
		@SideOnly(Side.CLIENT)
	    public net.minecraft.util.ResourceLocation getBackgroundImage()
	    {
	        return new net.minecraft.util.ResourceLocation(Refercence.MODID,"textures/gui/tab_shinkenger_items.png");
	    }
		@Override
		public ItemStack createIcon() {
			return new ItemStack(SentaiItems40.shinkenger_head);
		}
	};
	//36
	public static CreativeTabs tabGoBusters= new CreativeTabs("tabGoBusters")
	{
		@SideOnly(Side.CLIENT)
	    public net.minecraft.util.ResourceLocation getBackgroundImage()
	    {
	        return new net.minecraft.util.ResourceLocation(Refercence.MODID,"textures/gui/tab_go_busters_items.png");
	    }
		@Override
		public ItemStack createIcon() {
			return new ItemStack(SentaiItems40.go_busters_head);
		}
	};
	//??
	public static CreativeTabs tabAkibaranger= new CreativeTabs("tabAkibaranger")
	{
		@SideOnly(Side.CLIENT)
	    public net.minecraft.util.ResourceLocation getBackgroundImage()
	    {
	        return new net.minecraft.util.ResourceLocation(Refercence.MODID,"textures/gui/tab_akibaranger_items.png");
	    }
		@Override
		public ItemStack createIcon() {
			return new ItemStack(SentaiItems40.akibaranger_head);
		}
	};
	//37
	public static CreativeTabs tabKyoryuger= new CreativeTabs("tabKyoryuger")
	{
		@SideOnly(Side.CLIENT)
	    public net.minecraft.util.ResourceLocation getBackgroundImage()
	    {
	        return new net.minecraft.util.ResourceLocation(Refercence.MODID,"textures/gui/tab_kyoryuger_items.png");
	    }
		@Override
		public ItemStack createIcon() {
			return new ItemStack(SentaiItems40.kyoryuger_head);
		}
	};
	//38
	public static CreativeTabs tabToQger= new CreativeTabs("tabToQger")
	{
		@SideOnly(Side.CLIENT)
	    public net.minecraft.util.ResourceLocation getBackgroundImage()
	    {
	        return new net.minecraft.util.ResourceLocation(Refercence.MODID,"textures/gui/tab_toqger_items.png");
	    }
		@Override
		public ItemStack createIcon() {
			return new ItemStack(SentaiItems40.toqger_head);
		}
	};
	//40
	public static CreativeTabs tabZyuohger= new CreativeTabs("tabZyuohger")
	{
		@SideOnly(Side.CLIENT)
	    public net.minecraft.util.ResourceLocation getBackgroundImage()
	    {
	        return new net.minecraft.util.ResourceLocation(Refercence.MODID,"textures/gui/tab_zyuohger_items.png");
	    }
		@Override
		public ItemStack createIcon() {
			return new ItemStack(SentaiItems40.zyuohger_head);
		}
	};
	//41
	public static CreativeTabs tabKyuranger= new CreativeTabs("tabKyuranger")
	{
		@SideOnly(Side.CLIENT)
	    public net.minecraft.util.ResourceLocation getBackgroundImage()
	    {
	        return new net.minecraft.util.ResourceLocation(Refercence.MODID,"textures/gui/tab_kyuranger_items.png");
	    }
		@Override
		public ItemStack createIcon() {
			return new ItemStack(SentaiItems60.kyuranger_head);
		}
	};
	//42
	public static CreativeTabs tabLupat= new CreativeTabs("tabLupat")
	{
		@SideOnly(Side.CLIENT)
	    public net.minecraft.util.ResourceLocation getBackgroundImage()
	    {
	        return new net.minecraft.util.ResourceLocation(Refercence.MODID,"textures/gui/tab_lupat_items.png");
	    }
		@Override
		public ItemStack createIcon() {
			return new ItemStack(SentaiItems60.lupat_head);
		}
	};
	//43
	public static CreativeTabs tabRyusoulger= new CreativeTabs("tabRyusoulger")
	{
		@SideOnly(Side.CLIENT)
	    public net.minecraft.util.ResourceLocation getBackgroundImage()
	    {
	        return new net.minecraft.util.ResourceLocation(Refercence.MODID,"textures/gui/tab_ryusoulger_items.png");
	    }
		@Override
		public ItemStack createIcon() {
			return new ItemStack(SentaiItems60.ryusoulger_head);
		}
	};
	//44
	public static CreativeTabs tabKirameiger= new CreativeTabs("tabKirameiger")
	{
		@SideOnly(Side.CLIENT)
	    public net.minecraft.util.ResourceLocation getBackgroundImage()
	    {
	        return new net.minecraft.util.ResourceLocation(Refercence.MODID,"textures/gui/tab_kirameiger_items.png");
	    }
		@Override
		public ItemStack createIcon() {
			return new ItemStack(SentaiItems60.kirameiger_head);
		}
	};
	//45
	public static CreativeTabs tabZenkaiger= new CreativeTabs("tabZenkaiger")
	{
		@SideOnly(Side.CLIENT)
	    public net.minecraft.util.ResourceLocation getBackgroundImage()
	    {
	        return new net.minecraft.util.ResourceLocation(Refercence.MODID,"textures/gui/tab_zenkaiger_items.png");
	    }
		@Override
		public ItemStack createIcon() {
			return new ItemStack(SentaiItems60.zenkaiger_head);
		}
	};
	//46
	public static CreativeTabs tabDonBrothers= new CreativeTabs("tabDonBrothers")
	{
		@SideOnly(Side.CLIENT)
	    public net.minecraft.util.ResourceLocation getBackgroundImage()
	    {
	        return new net.minecraft.util.ResourceLocation(Refercence.MODID,"textures/gui/tab_don_brothers_items.png");
	    }
		@Override
		public ItemStack createIcon() {
			return new ItemStack(SentaiItems60.don_brothers_head);
		}
	};
	//??
	public static CreativeTabs tabMisc= new CreativeTabs("tabMisc")
	{
		@SideOnly(Side.CLIENT)
	    public net.minecraft.util.ResourceLocation getBackgroundImage()
	    {
	        return new net.minecraft.util.ResourceLocation(Refercence.MODID,"textures/gui/tab_misc_items.png");
	    }
		@Override
		public ItemStack createIcon() {
			return new ItemStack(SentaiItems20.super_sentai_logo);
		}
	};
	
}
