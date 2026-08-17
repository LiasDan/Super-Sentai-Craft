package com.liasdan.supersentaicraft.entity.ally;

import com.liasdan.supersentaicraft.entity.ally.BaseAllyEntity;
import com.liasdan.supersentaicraft.items.sentai_40.GoseigerItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.NeutralMob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.*;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.monster.Enemy;
import net.minecraft.world.entity.monster.Ghast;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.gameevent.GameEvent;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.AnimatableManager;
import software.bernie.geckolib.animation.AnimationController;
import software.bernie.geckolib.animation.RawAnimation;
import software.bernie.geckolib.util.GeckoLibUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static com.mojang.blaze3d.Blaze3D.process;

public class DatasEntity extends BaseAllyEntity implements GeoEntity {

    public static List<Item> MAIN_CARD = new ArrayList<>();
    public static List<Item> RED_CARD = new ArrayList<>();
    public static List<Item> PINK_CARD = new ArrayList<>();
    public static List<Item> BLACK_CARD = new ArrayList<>();
    public static List<Item> YELLOW_CARD = new ArrayList<>();
    public static List<Item> BLUE_CARD = new ArrayList<>();
    public static List<Item> KNIGHT_CARD = new ArrayList<>();

    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);

    public DatasEntity(EntityType<? extends DatasEntity> entityType, Level level) {
        super(entityType, level);
        NAME = "datas";
        this.setPersistenceRequired();

    }

    public static AttributeSupplier.Builder setAttributes() {
        return Mob.createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.3F).add(Attributes.MAX_HEALTH, 60.0D).add(Attributes.ATTACK_DAMAGE, 7.0D);
    }


    protected void registerGoals() {
        this.goalSelector.addGoal(1, new FloatGoal(this));
        this.goalSelector.addGoal(2, new SitWhenOrderedToGoal(this));
        this.goalSelector.addGoal(3, new MeleeAttackGoal(this, 1.0D, true));
        this.goalSelector.addGoal(4, new FollowOwnerGoal(this, 1.0D, 5.0F, 2.0F));
        this.goalSelector.addGoal(5, new WaterAvoidingRandomStrollGoal(this, 1.0D));
        this.goalSelector.addGoal(6, new LookAtPlayerGoal(this, Player.class, 8.0F));
        this.goalSelector.addGoal(6, new RandomLookAroundGoal(this));
        this.targetSelector.addGoal(1, (new HurtByTargetGoal(this, BaseAllyEntity.class)).setAlertOthers());
        this.targetSelector.addGoal(1, new OwnerHurtByTargetGoal(this));
        this.targetSelector.addGoal(2, new OwnerHurtTargetGoal(this));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, Mob.class, 5, false, false, (p_28879_) -> {
            if (isTame()) {
                if (p_28879_ instanceof Creeper || p_28879_ instanceof Ghast) {
                    return this.getMainHandItem().getItem() instanceof BowItem;
                }
                return p_28879_ instanceof Enemy && !(p_28879_ instanceof NeutralMob neutral && !neutral.isAngry());
            } else return false;
        }));
        this.targetSelector.addGoal(4, new NearestAttackableTargetGoal<>(this, Player.class, 10, true, false, this::isAngryAt));
        this.targetSelector.addGoal(8, new ResetUniversalAngerTargetGoal<>(this, true));

    }

    public void tame(Player p_21829_) {
        super.tame(p_21829_);
        this.getAttribute(Attributes.MAX_HEALTH).setBaseValue(40.0D);
        this.setHealth(40.0F);
    }

    public InteractionResult mobInteract(Player player, InteractionHand hand) {
        ItemStack itemstack = player.getItemInHand(hand);
        Item item = itemstack.getItem();
        if (!this.level().isClientSide || this.isBaby() && this.isFood(itemstack)) {
            if (this.isTame()) {
                if (this.isFood(itemstack) && this.getHealth() < this.getMaxHealth()) {
                    FoodProperties foodproperties = itemstack.getFoodProperties(this);
                    float f = foodproperties != null ? (float) foodproperties.nutrition() : 1.0F;
                    this.heal(2.0F * f);
                    itemstack.consume(1, player);
                    this.gameEvent(GameEvent.EAT);
                    return InteractionResult.sidedSuccess(this.level().isClientSide());
                } else {
                    if (player.isShiftKeyDown()) {
                        ItemStack itemstack2;
                        InteractionResult interactionresult = super.mobInteract(player, hand);
                        if (!interactionresult.consumesAction() && this.isOwnedBy(player)) {
                            this.setOrderedToSit(!this.isOrderedToSit());
                            this.jumping = false;
                            this.navigation.stop();
                            this.setTarget(null);
                            return InteractionResult.SUCCESS_NO_ITEM_USED;
                        } else {
                            return interactionresult;
                        }
                    } else if (player.getItemInHand(hand).getItem() == GoseigerItems.BLANK_GOSEI_CARD.asItem()) {
                        process(player, player.level(), hand, getCardDrop(0));
                    } else if (player.getItemInHand(hand).getItem() == GoseigerItems.GOSEI_RED_CARD.asItem()) {
                        process(player, player.level(), hand, getCardDrop(1));
                    } else if (player.getItemInHand(hand).getItem() == GoseigerItems.GOSEI_PINK_CARD.asItem()) {
                        process(player, player.level(), hand, getCardDrop(2));
                    } else if (player.getItemInHand(hand).getItem() == GoseigerItems.GOSEI_BLACK_CARD.asItem()) {
                        process(player, player.level(), hand, getCardDrop(3));
                    } else if (player.getItemInHand(hand).getItem() == GoseigerItems.GOSEI_YELLOW_CARD.asItem()) {
                        process(player, player.level(), hand, getCardDrop(4));
                    } else if (player.getItemInHand(hand).getItem() == GoseigerItems.GOSEI_BLUE_CARD.asItem()) {
                        process(player, player.level(), hand, getCardDrop(5));
                    } else if (player.getItemInHand(hand).getItem() == GoseigerItems.GOSEI_KNIGHT_CARD.asItem()) {
                        process(player, player.level(), hand, getCardDrop(6));
                    }
                    return InteractionResult.SUCCESS;
                }
            } else if (itemstack.is(GoseigerItems.BLANK_GOSEI_CARD.get()) && !this.isAngry()) {
                itemstack.consume(1, player);
                this.tryToTame(player);
                return InteractionResult.SUCCESS;
            }
            else {
                return super.mobInteract(player, hand);
            }
        }
        else {
            boolean flag = this.isOwnedBy(player) || this.isTame() || itemstack.is(Items.BONE) && !this.isTame() && !this.isAngry();
            return flag ? InteractionResult.CONSUME : InteractionResult.PASS;
        }
    }

    private void tryToTame(Player player) {
        this.tame(player);
        this.navigation.stop();
        this.setTarget(null);
        this.setOrderedToSit(true);
        this.level().broadcastEntityEvent(this, (byte) 7);
    }

    public boolean canMate(Animal p_30392_) {
        return false;
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.cache;
    }

    public boolean isFood(ItemStack p_30440_) {
        Item item = p_30440_.getItem();
        return item == GoseigerItems.BLANK_GOSEI_CARD.get();
    }

    // Add our generic idle animation controller
    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {

        RawAnimation IDLE = RawAnimation.begin().thenLoop("animation.datas.idle");
        RawAnimation WALK = RawAnimation.begin().thenLoop("animation.datas.walk");
        RawAnimation SIT = RawAnimation.begin().thenPlay("animation.datas.sit");

        controllers.add(new AnimationController<>(this, "Walk/Idle", 0, state -> state.setAndContinue(!isInSittingPose() ? state.isMoving() ? WALK : IDLE : SIT)));
    }

    public void process(Player player, Level world, InteractionHand hand, Item... items) {
        // world.playSound((double)pos.getX() + 0.5D, (double)pos.getY(), (double)pos.getZ() + 0.5D, SoundEvents.BLOCK_NOTE_BELL, SoundCategory.BLOCKS, 1.0F, 1.0F, false);
        for (Item item : items) player.drop(new ItemStack(item), false);
        player.getItemInHand(hand).shrink(1);
    }

    private Item getCardDrop(int num) {
        Random generator = new Random();

        if (num == 1) {
            int rand = generator.nextInt(RED_CARD.size());
            return RED_CARD.get(rand);
        } else if (num == 2) {
            int rand = generator.nextInt(PINK_CARD.size());
            return PINK_CARD.get(rand);
        } else if (num == 3) {
            int rand = generator.nextInt(BLACK_CARD.size());
            return BLACK_CARD.get(rand);
        } else if (num == 4) {
            int rand = generator.nextInt(YELLOW_CARD.size());
            return YELLOW_CARD.get(rand);
        } else if (num == 5) {
            int rand = generator.nextInt(BLUE_CARD.size());
            return BLUE_CARD.get(rand);
        } else if (num == 6) {
            int rand = generator.nextInt(KNIGHT_CARD.size());
            return KNIGHT_CARD.get(rand);
        } else {
            int rand = generator.nextInt(MAIN_CARD.size());
            return MAIN_CARD.get(rand);
        }
    }
}
