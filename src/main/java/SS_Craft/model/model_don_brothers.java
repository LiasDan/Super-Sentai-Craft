package SS_Craft.model;

import SS_Craft.SentaiItems60;
import SS_Craft.item.don_brothers.item_don_blaster;
import SS_Craft.util.Refercence;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityArmorStand;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.util.ResourceLocation;

/**
 * ModelPlayer - Either Mojang or a mod author
 * Created using Tabula 7.1.0
 */
public class model_don_brothers extends model_belt_plus
{
    public ModelRenderer inuheadextra;
    public ModelRenderer inurightarm;
    public ModelRenderer inurightleg;
    public ModelRenderer inuhead;
    public ModelRenderer inubody;
    public ModelRenderer inuleftarm;
    public ModelRenderer inuleftleg;
    
    public ModelRenderer kijiheadextra;
    public ModelRenderer kijirightarm;
    public ModelRenderer kijirightleg;
    public ModelRenderer kijihead;
    public ModelRenderer kijibody;
    public ModelRenderer kijileftarm;
    public ModelRenderer kijileftleg;

    public ModelRenderer ryusoulrightleg;
    public ModelRenderer ryusoulheadextra;
    public ModelRenderer ryusoulleftleg;
    public ModelRenderer ryusoulrightarm;
    public ModelRenderer ryusoulbackrightleg;
    public ModelRenderer ryusoulhead;
    public ModelRenderer ryusoulbody;
    public ModelRenderer ryusoulleftarm;
    public ModelRenderer ryusoulbackleftleg;
    public ModelRenderer ryusoulbodyextra;
    public ModelRenderer ryusoulbody1;

    public ModelRenderer toqrightleg;
    public ModelRenderer toqheadextra;
    public ModelRenderer toqleftleg;
    public ModelRenderer toqrightarm;
    public ModelRenderer toqbackrightleg;
    public ModelRenderer toqhead;
    public ModelRenderer toqbody;
    public ModelRenderer toqleftarm;
    public ModelRenderer toqbackleftleg;
    public ModelRenderer toqbodyextra;

    public model_don_brothers()
    {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.inuheadextra = new ModelRenderer(this, 32, 0);
        this.inuheadextra.setRotationPoint(0.0F, 8.0F, 0.0F);
        this.inuheadextra.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F);
        this.inubody = new ModelRenderer(this, 16, 16);
        this.inubody.setRotationPoint(0.0F, 8.0F, 0.0F);
        this.inubody.addBox(-4.0F, 0.0F, -2.0F, 8, 8, 4, 0.0F);
        this.inuleftarm = new ModelRenderer(this, 40, 16);
        this.inuleftarm.mirror = true;
        this.inuleftarm.setRotationPoint(5.0F, 10.0F, 0.0F);
        this.inuleftarm.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(inuleftarm, 0.0F, 0.0F, -0.10000736613927509F);
        this.inuleftleg = new ModelRenderer(this, 0, 16);
        this.inuleftleg.mirror = true;
        this.inuleftleg.setRotationPoint(1.9F, 16.0F, 0.1F);
        this.inuleftleg.addBox(-2.0F, 0.0F, -2.0F, 4, 8, 4, 0.0F);
        this.inurightleg = new ModelRenderer(this, 0, 16);
        this.inurightleg.setRotationPoint(-1.9F, 16.0F, 0.1F);
        this.inurightleg.addBox(-2.0F, 0.0F, -2.0F, 4, 8, 4, 0.0F);
        this.inuhead = new ModelRenderer(this, 0, 0);
        this.inuhead.setRotationPoint(0.0F, 8.0F, 0.0F);
        this.inuhead.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.inurightarm = new ModelRenderer(this, 40, 16);
        this.inurightarm.setRotationPoint(-5.0F, 10.0F, 0.0F);
        this.inurightarm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(inurightarm, 0.0F, 0.0F, 0.10000736613927509F);

        this.kijirightleg = new ModelRenderer(this, 0, 16);
        this.kijirightleg.setRotationPoint(-1.9F, 0.0F, 0.1F);
        this.kijirightleg.addBox(-2.0F, 0.0F, -2.0F, 4, 24, 4, 0.0F);
        this.kijihead = new ModelRenderer(this, 0, 0);
        this.kijihead.setRotationPoint(0.0F, -12.0F, 0.0F);
        this.kijihead.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.kijileftarm = new ModelRenderer(this, 40, 16);
        this.kijileftarm.mirror = true;
        this.kijileftarm.setRotationPoint(5.0F, -10.0F, 0.0F);
        this.kijileftarm.addBox(-1.0F, -2.0F, -2.0F, 4, 20, 4, 0.0F);
        this.setRotateAngle(kijileftarm, 0.0F, 0.0F, -0.10000736613927509F);
        this.kijiheadextra = new ModelRenderer(this, 32, 0);
        this.kijiheadextra.setRotationPoint(0.0F, -12.0F, 0.0F);
        this.kijiheadextra.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F);
        this.kijileftleg = new ModelRenderer(this, 0, 16);
        this.kijileftleg.mirror = true;
        this.kijileftleg.setRotationPoint(1.9F, 0.0F, 0.1F);
        this.kijileftleg.addBox(-2.0F, 0.0F, -2.0F, 4, 24, 4, 0.0F);
        this.kijibody = new ModelRenderer(this, 16, 16);
        this.kijibody.setRotationPoint(0.0F, -12.0F, 0.0F);
        this.kijibody.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F);
        this.kijirightarm = new ModelRenderer(this, 40, 16);
        this.kijirightarm.setRotationPoint(-5.0F, -10.0F, 0.0F);
        this.kijirightarm.addBox(-3.0F, -2.0F, -2.0F, 4, 20, 4, 0.0F);
        this.setRotateAngle(kijirightarm, 0.0F, 0.0F, 0.10000736613927509F);
        
        this.ryusoulbody = new ModelRenderer(this, 16, 16);
        this.ryusoulbody.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ryusoulbody.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F);
        this.ryusoulhead = new ModelRenderer(this, 0, 0);
        this.ryusoulhead.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ryusoulhead.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.ryusoulbodyextra = new ModelRenderer(this, 16, 32);
        this.ryusoulbodyextra.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ryusoulbodyextra.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.25F);
        this.ryusoulrightarm = new ModelRenderer(this, 40, 16);
        this.ryusoulrightarm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.ryusoulrightarm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(ryusoulrightarm, 0.0F, 0.0F, 0.10000736613927509F);
        this.ryusoulrightleg = new ModelRenderer(this, 0, 32);
        this.ryusoulrightleg.setRotationPoint(-1.9F, 12.0F, 0.1F);
        this.ryusoulrightleg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.ryusoulbackrightleg = new ModelRenderer(this, 0, 16);
        this.ryusoulbackrightleg.setRotationPoint(-1.9F, 12.0F, 12.0F);
        this.ryusoulbackrightleg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.ryusoulbackleftleg = new ModelRenderer(this, 0, 16);
        this.ryusoulbackleftleg.setRotationPoint(1.9F, 12.0F, 12.0F);
        this.ryusoulbackleftleg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.ryusoulbackleftleg.mirror = true;
        this.ryusoulleftleg = new ModelRenderer(this, 0, 32);
        this.ryusoulleftleg.setRotationPoint(1.9F, 12.0F, 0.1F);
        this.ryusoulleftleg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.ryusoulleftleg.mirror = true;
        this.ryusoulheadextra = new ModelRenderer(this, 32, 0);
        this.ryusoulheadextra.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ryusoulheadextra.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F);
        this.ryusoulleftarm = new ModelRenderer(this, 40, 16);
        this.ryusoulleftarm.mirror = true;
        this.ryusoulleftarm.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.ryusoulleftarm.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(ryusoulleftarm, 0.0F, 0.0F, -0.10000736613927509F);
        this.ryusoulbody1 = new ModelRenderer(this, 12, 48);
        this.ryusoulbody1.setRotationPoint(0.0F, 12.1F, 0.0F);
        this.ryusoulbody1.addBox(-4.0F, 0.0F, 2.0F, 8, 4, 8, 0.0F);

        this.toqrightarm = new ModelRenderer(this, 40, 16);
        this.toqrightarm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.toqrightarm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(toqrightarm, 0.0F, 0.0F, 0.10000000149011613F);
        this.toqbackleftleg = new ModelRenderer(this, 16, 48);
        this.toqbackleftleg.setRotationPoint(1.8F, 14.0F, -2.0F);
        this.toqbackleftleg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(toqbackleftleg, -1.5707963267948966F, 3.141592653589793F, -0.0F);
        this.toqbody = new ModelRenderer(this, 16, 16);
        this.toqbody.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.toqbody.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F);
        this.toqleftleg = new ModelRenderer(this, 0, 48);
        this.toqleftleg.setRotationPoint(1.9F, 14.0F, -1.9F);
        this.toqleftleg.addBox(-2.0F, 0.0F, -2.0F, 4, 9, 4, 0.0F);
        this.setRotateAngle(toqleftleg, -1.5707963267948966F, -0.0F, 0.0F);
        this.toqhead = new ModelRenderer(this, 0, 0);
        this.toqhead.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.toqhead.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.toqbackrightleg = new ModelRenderer(this, 0, 16);
        this.toqbackrightleg.setRotationPoint(-1.9F, 14.0F, -2.0F);
        this.toqbackrightleg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(toqbackrightleg, -1.5707963267948966F, 3.141592653589793F, 0.0F);
        this.toqrightleg = new ModelRenderer(this, 0, 32);
        this.toqrightleg.setRotationPoint(-1.9F, 14.0F, -2.0F);
        this.toqrightleg.addBox(-2.0F, 0.0F, -2.0F, 4, 9, 4, 0.0F);
        this.setRotateAngle(toqrightleg, -1.5707963267948966F, 0.0F, 0.0F);
        this.toqheadextra = new ModelRenderer(this, 32, 0);
        this.toqheadextra.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.toqheadextra.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F);
        this.toqleftarm = new ModelRenderer(this, 32, 48);
        this.toqleftarm.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.toqleftarm.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(toqleftarm, 0.0F, 0.0F, -0.10000000149011613F);
        this.toqbodyextra = new ModelRenderer(this, 16, 32);
        this.toqbodyextra.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.toqbodyextra.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.25F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) 
    { 
    	this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		if (entity instanceof EntityLivingBase)
		{
			EntityLivingBase player = ((EntityLivingBase)entity);
			
			if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD)!= null)
			{
				if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST)!= null)
				{
					if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS)!= null)
					{
						if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null)
						{
							if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == SentaiItems60.don_brothers_legs)
							{
								if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == SentaiItems60.don_brothers_torso)
								{
									if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == SentaiItems60.don_brothers_head)
									{
										if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.inu_don_blaster)
										{
											if (item_don_blaster.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))==0&item_don_blaster.get_avatar(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))==0)
											{	
												GlStateManager.pushMatrix();
												GlStateManager.translate(0, 0, 0);
												
												Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(Refercence.MODID+":textures/armor/inu_brother.png"));
												
												this.inuheadextra.render(f5);

												GlStateManager.popMatrix();
												GlStateManager.pushMatrix();
												GlStateManager.translate(0, 0, 0);
												
										        this.inubody.render(f5);
										        this.inuleftarm.render(f5);
										        this.inuhead.render(f5);
										        this.inurightarm.render(f5);
										        
										        if (entity.isSneaking())
										        {
										        	GlStateManager.translate(0.0F, -0.1F, 0.2F);
										        }
										        else
										        {
										        	GlStateManager.translate(0.0F, 0F, 0.0F);
										        }
										        this.inuleftleg.render(f5);
										        this.inurightleg.render(f5);
										        
												GlStateManager.popMatrix();
											}
										}
										if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.kiji_don_blaster)
										{
											if (item_don_blaster.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))==0&item_don_blaster.get_avatar(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))==0)
											{ 
												Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(Refercence.MODID+":textures/armor/kiji_brother.png"));

												GlStateManager.pushMatrix();
												GlStateManager.translate(0, 0, 0);
												
												this.kijiheadextra.render(f5);
												this.kijihead.render(f5);
												
												GlStateManager.popMatrix();
												GlStateManager.pushMatrix();
												GlStateManager.translate(0, 0, 0);
												
												this.kijileftarm.render(f5);
												this.kijibody.render(f5);
												this.kijirightarm.render(f5);
												
												if (entity.isSneaking())
										        {
										        	GlStateManager.translate(0.0F, -0.2F, 0.3F);
										        }
										        else
										        {
										        	GlStateManager.translate(0.0F, 0F, 0.0F);
										        }
										        this.kijirightleg.render(f5);
												this.kijileftleg.render(f5);

												GlStateManager.popMatrix();
											}
										}
										if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.momotarou_don_blaster)
										{
											if (item_don_blaster.get_alter(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))==11)
											{
												Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(Refercence.MODID+":textures/armor/don_momotarou_alter_ryusoul.png"));

												GlStateManager.pushMatrix();
												GlStateManager.translate(0, 0, 0);
												
												this.ryusoulheadextra.render(f5);
												this.ryusoulhead.render(f5);
												
												GlStateManager.popMatrix();
												GlStateManager.pushMatrix();
												GlStateManager.translate(0, 0, 0);

												this.ryusoulrightarm.render(f5);
												this.ryusoulleftarm.render(f5);
												this.ryusoulbody.render(f5);
												this.ryusoulbodyextra.render(f5);
												this.ryusoulbody1.render(f5);
												this.ryusoulrightleg.render(f5);
												this.ryusoulleftleg.render(f5);
												this.ryusoulbackrightleg.render(f5);
												this.ryusoulbackleftleg.render(f5);
												
												GlStateManager.popMatrix();
											}
											if (item_don_blaster.get_alter(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))==5)
											{
												Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(Refercence.MODID+":textures/armor/don_momotarou_alter_toq.png"));

												GlStateManager.pushMatrix();
												GlStateManager.translate(0, 0, 0);
												
												this.toqheadextra.render(f5);
												this.toqhead.render(f5);
												
												GlStateManager.popMatrix();
												GlStateManager.pushMatrix();
												GlStateManager.translate(0, 0, 0);

										        this.toqrightarm.render(f5);
										        this.toqbackleftleg.render(f5);
										        this.toqbody.render(f5);
										        this.toqleftleg.render(f5);
										        this.toqbackrightleg.render(f5);
										        this.toqrightleg.render(f5);
										        this.toqleftarm.render(f5);
										        this.toqbodyextra.render(f5);
												
												GlStateManager.popMatrix();
											}
										}
										if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.toradora_ryuko_no_geki)
										{
											if (item_don_blaster.get_alter(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))==11)
											{
												Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(Refercence.MODID+":textures/armor/don_doragoku_alter_ryusoul.png"));

												GlStateManager.pushMatrix();
												GlStateManager.translate(0, 0, 0);
												
												this.ryusoulheadextra.render(f5);
												this.ryusoulhead.render(f5);
												
												GlStateManager.popMatrix();
												GlStateManager.pushMatrix();
												GlStateManager.translate(0, 0, 0);

												this.ryusoulrightarm.render(f5);
												this.ryusoulleftarm.render(f5);
												this.ryusoulbody.render(f5);
												this.ryusoulbodyextra.render(f5);
												this.ryusoulbody1.render(f5);
												this.ryusoulrightleg.render(f5);
												this.ryusoulleftleg.render(f5);
												this.ryusoulbackrightleg.render(f5);
												this.ryusoulbackleftleg.render(f5);
												
												GlStateManager.popMatrix();
											}
											if (item_don_blaster.get_alter(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))==5)
											{
												Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(Refercence.MODID+":textures/armor/don_doragoku_alter_toq.png"));

												GlStateManager.pushMatrix();
												GlStateManager.translate(0, 0, 0);
												
												this.toqheadextra.render(f5);
												this.toqhead.render(f5);
												
												GlStateManager.popMatrix();
												GlStateManager.pushMatrix();
												GlStateManager.translate(0, 0, 0);

										        this.toqrightarm.render(f5);
										        this.toqbackleftleg.render(f5);
										        this.toqbody.render(f5);
										        this.toqleftleg.render(f5);
										        this.toqbackrightleg.render(f5);
										        this.toqrightleg.render(f5);
										        this.toqleftarm.render(f5);
										        this.toqbodyextra.render(f5);
												
												GlStateManager.popMatrix();
											}
										}
										if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.murasame_ninjark_sword)
										{
											if (item_don_blaster.get_alter(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))==11)
											{
												Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(Refercence.MODID+":textures/armor/don_murasame_alter_ryusoul.png"));

												GlStateManager.pushMatrix();
												GlStateManager.translate(0, 0, 0);
												
												this.ryusoulheadextra.render(f5);
												this.ryusoulhead.render(f5);
												
												GlStateManager.popMatrix();
												GlStateManager.pushMatrix();
												GlStateManager.translate(0, 0, 0);

												this.ryusoulrightarm.render(f5);
												this.ryusoulleftarm.render(f5);
												this.ryusoulbody.render(f5);
												this.ryusoulbodyextra.render(f5);
												this.ryusoulbody1.render(f5);
												this.ryusoulrightleg.render(f5);
												this.ryusoulleftleg.render(f5);
												this.ryusoulbackrightleg.render(f5);
												this.ryusoulbackleftleg.render(f5);
												
												GlStateManager.popMatrix();
											}
											if (item_don_blaster.get_alter(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))==5)
											{
												Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(Refercence.MODID+":textures/armor/don_murasame_alter_toq.png"));

												GlStateManager.pushMatrix();
												GlStateManager.translate(0, 0, 0);
												
												this.toqheadextra.render(f5);
												this.toqhead.render(f5);
												
												GlStateManager.popMatrix();
												GlStateManager.pushMatrix();
												GlStateManager.translate(0, 0, 0);

										        this.toqrightarm.render(f5);
										        this.toqbackleftleg.render(f5);
										        this.toqbody.render(f5);
										        this.toqleftleg.render(f5);
										        this.toqbackrightleg.render(f5);
										        this.toqrightleg.render(f5);
										        this.toqleftarm.render(f5);
										        this.toqbodyextra.render(f5);
												
												GlStateManager.popMatrix();
											}
										}
									}
								}
							}
						}
					}
				}
			}
			
			GlStateManager.pushMatrix();
			super.render(entity, f, f1, f2, f3, f4, f5);

			GlStateManager.popMatrix();
		}
    }
    
	public void setRotationAngles(float p_78087_1_, float p_78087_2_, float p_78087_3_, float p_78087_4_, float p_78087_5_, float p_78087_6_, Entity entityIn)
	{
		if (entityIn instanceof EntityArmorStand)
	    {
	        EntityArmorStand entityarmorstand = (EntityArmorStand)entityIn;
	        this.inuhead.rotateAngleX = 0.017453292F * entityarmorstand.getHeadRotation().getX();
	        this.inuhead.rotateAngleY = 0.017453292F * entityarmorstand.getHeadRotation().getY();
	        this.inuhead.rotateAngleZ = 0.017453292F * entityarmorstand.getHeadRotation().getZ();
	        this.inubody.rotateAngleX = 0.017453292F * entityarmorstand.getBodyRotation().getX();
	        this.inubody.rotateAngleY = 0.017453292F * entityarmorstand.getBodyRotation().getY();
	        this.inubody.rotateAngleZ = 0.017453292F * entityarmorstand.getBodyRotation().getZ();
	        this.inuleftarm.rotateAngleX = 0.017453292F * entityarmorstand.getLeftArmRotation().getX();
	        this.inuleftarm.rotateAngleY = 0.017453292F * entityarmorstand.getLeftArmRotation().getY();
	        this.inuleftarm.rotateAngleZ = 0.017453292F * entityarmorstand.getLeftArmRotation().getZ();
	        this.inurightarm.rotateAngleX = 0.017453292F * entityarmorstand.getRightArmRotation().getX();
	        this.inurightarm.rotateAngleY = 0.017453292F * entityarmorstand.getRightArmRotation().getY();
	        this.inurightarm.rotateAngleZ = 0.017453292F * entityarmorstand.getRightArmRotation().getZ();
	        this.inuleftleg.rotateAngleX = 0.017453292F * entityarmorstand.getLeftLegRotation().getX();
	        this.inuleftleg.rotateAngleY = 0.017453292F * entityarmorstand.getLeftLegRotation().getY();
	        this.inuleftleg.rotateAngleZ = 0.017453292F * entityarmorstand.getLeftLegRotation().getZ();
	        this.inurightleg.rotateAngleX = 0.017453292F * entityarmorstand.getRightLegRotation().getX();
	        this.inurightleg.rotateAngleY = 0.017453292F * entityarmorstand.getRightLegRotation().getY();
	        this.inurightleg.rotateAngleZ = 0.017453292F * entityarmorstand.getRightLegRotation().getZ();
	        copyModelAngles(this.inuhead, this.inuheadextra);

	        this.kijihead.rotateAngleX = 0.017453292F * entityarmorstand.getHeadRotation().getX();
	        this.kijihead.rotateAngleY = 0.017453292F * entityarmorstand.getHeadRotation().getY();
	        this.kijihead.rotateAngleZ = 0.017453292F * entityarmorstand.getHeadRotation().getZ();
	        this.kijibody.rotateAngleX = 0.017453292F * entityarmorstand.getBodyRotation().getX();
	        this.kijibody.rotateAngleY = 0.017453292F * entityarmorstand.getBodyRotation().getY();
	        this.kijibody.rotateAngleZ = 0.017453292F * entityarmorstand.getBodyRotation().getZ();
	        this.kijileftarm.rotateAngleX = 0.017453292F * entityarmorstand.getLeftArmRotation().getX();
	        this.kijileftarm.rotateAngleY = 0.017453292F * entityarmorstand.getLeftArmRotation().getY();
	        this.kijileftarm.rotateAngleZ = 0.017453292F * entityarmorstand.getLeftArmRotation().getZ();
	        this.kijirightarm.rotateAngleX = 0.017453292F * entityarmorstand.getRightArmRotation().getX();
	        this.kijirightarm.rotateAngleY = 0.017453292F * entityarmorstand.getRightArmRotation().getY();
	        this.kijirightarm.rotateAngleZ = 0.017453292F * entityarmorstand.getRightArmRotation().getZ();
	        this.kijileftleg.rotateAngleX = 0.017453292F * entityarmorstand.getLeftLegRotation().getX();
	        this.kijileftleg.rotateAngleY = 0.017453292F * entityarmorstand.getLeftLegRotation().getY();
	        this.kijileftleg.rotateAngleZ = 0.017453292F * entityarmorstand.getLeftLegRotation().getZ();
	        this.kijirightleg.rotateAngleX = 0.017453292F * entityarmorstand.getRightLegRotation().getX();
	        this.kijirightleg.rotateAngleY = 0.017453292F * entityarmorstand.getRightLegRotation().getY();
	        this.kijirightleg.rotateAngleZ = 0.017453292F * entityarmorstand.getRightLegRotation().getZ();
	        copyModelAngles(this.kijihead, this.kijiheadextra);

	        this.ryusoulhead.rotateAngleX = 0.017453292F * entityarmorstand.getHeadRotation().getX();
	        this.ryusoulhead.rotateAngleY = 0.017453292F * entityarmorstand.getHeadRotation().getY();
	        this.ryusoulhead.rotateAngleZ = 0.017453292F * entityarmorstand.getHeadRotation().getZ();
	        this.ryusoulbody.rotateAngleX = 0.017453292F * entityarmorstand.getBodyRotation().getX();
	        this.ryusoulbody.rotateAngleY = 0.017453292F * entityarmorstand.getBodyRotation().getY();
	        this.ryusoulbody.rotateAngleZ = 0.017453292F * entityarmorstand.getBodyRotation().getZ();
	        this.ryusoulleftarm.rotateAngleX = 0.017453292F * entityarmorstand.getLeftArmRotation().getX();
	        this.ryusoulleftarm.rotateAngleY = 0.017453292F * entityarmorstand.getLeftArmRotation().getY();
	        this.ryusoulleftarm.rotateAngleZ = 0.017453292F * entityarmorstand.getLeftArmRotation().getZ();
	        this.ryusoulrightarm.rotateAngleX = 0.017453292F * entityarmorstand.getRightArmRotation().getX();
	        this.ryusoulrightarm.rotateAngleY = 0.017453292F * entityarmorstand.getRightArmRotation().getY();
	        this.ryusoulrightarm.rotateAngleZ = 0.017453292F * entityarmorstand.getRightArmRotation().getZ();
	        this.ryusoulleftleg.rotateAngleX = 0.017453292F * entityarmorstand.getLeftLegRotation().getX();
	        this.ryusoulleftleg.rotateAngleY = 0.017453292F * entityarmorstand.getLeftLegRotation().getY();
	        this.ryusoulleftleg.rotateAngleZ = 0.017453292F * entityarmorstand.getLeftLegRotation().getZ();
	        this.ryusoulrightleg.rotateAngleX = 0.017453292F * entityarmorstand.getRightLegRotation().getX();
	        this.ryusoulrightleg.rotateAngleY = 0.017453292F * entityarmorstand.getRightLegRotation().getY();
	        this.ryusoulrightleg.rotateAngleZ = 0.017453292F * entityarmorstand.getRightLegRotation().getZ();
	        copyModelAngles(this.ryusoulhead, this.ryusoulheadextra);

	        this.toqhead.rotateAngleX = 0.017453292F * entityarmorstand.getHeadRotation().getX();
	        this.toqhead.rotateAngleY = 0.017453292F * entityarmorstand.getHeadRotation().getY();
	        this.toqhead.rotateAngleZ = 0.017453292F * entityarmorstand.getHeadRotation().getZ();
	        this.toqbody.rotateAngleX = 0.017453292F * entityarmorstand.getBodyRotation().getX();
	        this.toqbody.rotateAngleY = 0.017453292F * entityarmorstand.getBodyRotation().getY();
	        this.toqbody.rotateAngleZ = 0.017453292F * entityarmorstand.getBodyRotation().getZ();
	        this.toqleftarm.rotateAngleX = 0.017453292F * entityarmorstand.getLeftArmRotation().getX();
	        this.toqleftarm.rotateAngleY = 0.017453292F * entityarmorstand.getLeftArmRotation().getY();
	        this.toqleftarm.rotateAngleZ = 0.017453292F * entityarmorstand.getLeftArmRotation().getZ();
	        this.toqrightarm.rotateAngleX = 0.017453292F * entityarmorstand.getRightArmRotation().getX();
	        this.toqrightarm.rotateAngleY = 0.017453292F * entityarmorstand.getRightArmRotation().getY();
	        this.toqrightarm.rotateAngleZ = 0.017453292F * entityarmorstand.getRightArmRotation().getZ();
	        copyModelAngles(this.toqhead, this.toqheadextra);
	        copyModelAngles(this.toqbody, this.toqbodyextra);
	    }else{
	    	super.setRotationAngles(p_78087_1_, p_78087_2_, p_78087_3_, p_78087_4_, p_78087_5_, p_78087_6_, entityIn);
	    }
		this.inuleftarm.rotateAngleX=this.bipedLeftArm.rotateAngleX;
		this.inuleftarm.rotateAngleY=this.bipedLeftArm.rotateAngleY;
		this.inuleftarm.rotateAngleZ=this.bipedLeftArm.rotateAngleZ;
		
		this.inuleftleg.rotateAngleX=this.bipedLeftLeg.rotateAngleX;
		this.inuleftleg.rotateAngleY=this.bipedLeftLeg.rotateAngleY;
		this.inuleftleg.rotateAngleZ=this.bipedLeftLeg.rotateAngleZ;
		
		this.inuhead.rotateAngleX=this.bipedHead.rotateAngleX;
		this.inuhead.rotateAngleY=this.bipedHead.rotateAngleY;
		this.inuhead.rotateAngleZ=this.bipedHead.rotateAngleZ;
		
		this.inuheadextra.rotateAngleX=this.bipedHeadwear.rotateAngleX;
		this.inuheadextra.rotateAngleY=this.bipedHeadwear.rotateAngleY;
		this.inuheadextra.rotateAngleZ=this.bipedHeadwear.rotateAngleZ;
		
		this.inubody.rotateAngleX=this.bipedBody.rotateAngleX;
		this.inubody.rotateAngleY=this.bipedBody.rotateAngleY;
		this.inubody.rotateAngleZ=this.bipedBody.rotateAngleZ;

		this.inurightarm.rotateAngleX=this.bipedRightArm.rotateAngleX;
		this.inurightarm.rotateAngleY=this.bipedRightArm.rotateAngleY;
		this.inurightarm.rotateAngleZ=this.bipedRightArm.rotateAngleZ;

		this.inurightleg.rotateAngleX=this.bipedRightLeg.rotateAngleX;
		this.inurightleg.rotateAngleY=this.bipedRightLeg.rotateAngleY;
		this.inurightleg.rotateAngleZ=this.bipedRightLeg.rotateAngleZ;

		this.kijileftarm.rotateAngleX=this.bipedLeftArm.rotateAngleX;
		this.kijileftarm.rotateAngleY=this.bipedLeftArm.rotateAngleY;
		this.kijileftarm.rotateAngleZ=this.bipedLeftArm.rotateAngleZ;
		
		this.kijileftleg.rotateAngleX=this.bipedLeftLeg.rotateAngleX;
		this.kijileftleg.rotateAngleY=this.bipedLeftLeg.rotateAngleY;
		this.kijileftleg.rotateAngleZ=this.bipedLeftLeg.rotateAngleZ;
		
		this.kijihead.rotateAngleX=this.bipedHead.rotateAngleX;
		this.kijihead.rotateAngleY=this.bipedHead.rotateAngleY;
		this.kijihead.rotateAngleZ=this.bipedHead.rotateAngleZ;
		
		this.kijiheadextra.rotateAngleX=this.bipedHeadwear.rotateAngleX;
		this.kijiheadextra.rotateAngleY=this.bipedHeadwear.rotateAngleY;
		this.kijiheadextra.rotateAngleZ=this.bipedHeadwear.rotateAngleZ;
		
		this.kijibody.rotateAngleX=this.bipedBody.rotateAngleX;
		this.kijibody.rotateAngleY=this.bipedBody.rotateAngleY;
		this.kijibody.rotateAngleZ=this.bipedBody.rotateAngleZ;

		this.kijirightarm.rotateAngleX=this.bipedRightArm.rotateAngleX;
		this.kijirightarm.rotateAngleY=this.bipedRightArm.rotateAngleY;
		this.kijirightarm.rotateAngleZ=this.bipedRightArm.rotateAngleZ;

		this.kijirightleg.rotateAngleX=this.bipedRightLeg.rotateAngleX;
		this.kijirightleg.rotateAngleY=this.bipedRightLeg.rotateAngleY;
		this.kijirightleg.rotateAngleZ=this.bipedRightLeg.rotateAngleZ;

		this.ryusoulleftarm.rotateAngleX=this.bipedLeftArm.rotateAngleX;
		this.ryusoulleftarm.rotateAngleY=this.bipedLeftArm.rotateAngleY;
		this.ryusoulleftarm.rotateAngleZ=this.bipedLeftArm.rotateAngleZ;
		
		this.ryusoulleftleg.rotateAngleX=this.bipedLeftLeg.rotateAngleX;
		this.ryusoulleftleg.rotateAngleY=this.bipedLeftLeg.rotateAngleY;
		this.ryusoulleftleg.rotateAngleZ=this.bipedLeftLeg.rotateAngleZ;
		this.ryusoulbackleftleg.rotateAngleX=this.bipedRightLeg.rotateAngleX;
		this.ryusoulbackleftleg.rotateAngleY=this.bipedRightLeg.rotateAngleY;
		this.ryusoulbackleftleg.rotateAngleZ=this.bipedRightLeg.rotateAngleZ;
		
		this.ryusoulhead.rotateAngleX=this.bipedHead.rotateAngleX;
		this.ryusoulhead.rotateAngleY=this.bipedHead.rotateAngleY;
		this.ryusoulhead.rotateAngleZ=this.bipedHead.rotateAngleZ;
		
		this.ryusoulheadextra.rotateAngleX=this.bipedHeadwear.rotateAngleX;
		this.ryusoulheadextra.rotateAngleY=this.bipedHeadwear.rotateAngleY;
		this.ryusoulheadextra.rotateAngleZ=this.bipedHeadwear.rotateAngleZ;
		
		this.ryusoulbody.rotateAngleX=this.bipedBody.rotateAngleX;
		this.ryusoulbody.rotateAngleY=this.bipedBody.rotateAngleY;
		this.ryusoulbody.rotateAngleZ=this.bipedBody.rotateAngleZ;

		this.ryusoulrightarm.rotateAngleX=this.bipedRightArm.rotateAngleX;
		this.ryusoulrightarm.rotateAngleY=this.bipedRightArm.rotateAngleY;
		this.ryusoulrightarm.rotateAngleZ=this.bipedRightArm.rotateAngleZ;

		this.ryusoulrightleg.rotateAngleX=this.bipedRightLeg.rotateAngleX;
		this.ryusoulrightleg.rotateAngleY=this.bipedRightLeg.rotateAngleY;
		this.ryusoulrightleg.rotateAngleZ=this.bipedRightLeg.rotateAngleZ;
		this.ryusoulbackrightleg.rotateAngleX=this.bipedLeftLeg.rotateAngleX;
		this.ryusoulbackrightleg.rotateAngleY=this.bipedLeftLeg.rotateAngleY;
		this.ryusoulbackrightleg.rotateAngleZ=this.bipedLeftLeg.rotateAngleZ;

		this.toqleftarm.rotateAngleX=this.bipedLeftArm.rotateAngleX;
		this.toqleftarm.rotateAngleY=this.bipedLeftArm.rotateAngleY;
		this.toqleftarm.rotateAngleZ=this.bipedLeftArm.rotateAngleZ;
		
		this.toqhead.rotateAngleX=this.bipedHead.rotateAngleX;
		this.toqhead.rotateAngleY=this.bipedHead.rotateAngleY;
		this.toqhead.rotateAngleZ=this.bipedHead.rotateAngleZ;
		
		this.toqheadextra.rotateAngleX=this.bipedHeadwear.rotateAngleX;
		this.toqheadextra.rotateAngleY=this.bipedHeadwear.rotateAngleY;
		this.toqheadextra.rotateAngleZ=this.bipedHeadwear.rotateAngleZ;
		
		this.toqbody.rotateAngleX=this.bipedBody.rotateAngleX;
		this.toqbody.rotateAngleY=this.bipedBody.rotateAngleY;
		this.toqbody.rotateAngleZ=this.bipedBody.rotateAngleZ;
		
		this.toqbodyextra.rotateAngleX=this.bipedBody.rotateAngleX;
		this.toqbodyextra.rotateAngleY=this.bipedBody.rotateAngleY;
		this.toqbodyextra.rotateAngleZ=this.bipedBody.rotateAngleZ;

		this.toqrightarm.rotateAngleX=this.bipedRightArm.rotateAngleX;
		this.toqrightarm.rotateAngleY=this.bipedRightArm.rotateAngleY;
		this.toqrightarm.rotateAngleZ=this.bipedRightArm.rotateAngleZ;
	}

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
