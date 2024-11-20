package net.nova.big_swords_addon.event;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.living.LivingFallEvent;
import net.neoforged.neoforge.event.entity.living.LivingShieldBlockEvent;
import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.nova.big_swords_addon.init.BCItems;

import java.util.List;
import java.util.Random;

import static net.nova.big_swords_addon.BigSwordsRAddon.MODID;

@EventBusSubscriber(modid = MODID)
public class ShieldMechanics {
    public static final ResourceLocation MOVEMENT_SPEED_ID = ResourceLocation.withDefaultNamespace("movement_speed");

    @SubscribeEvent
    public static void onShieldBlock(LivingShieldBlockEvent event) {
        if (event.getEntity() instanceof Player player && event.getBlocked()) {
            ItemStack shield = player.getUseItem();
            Level level = player.level();
            Entity attacker = event.getDamageSource().getEntity();
            Entity sourceEntity = event.getDamageSource().getDirectEntity();
            DamageSource damageSource = event.getDamageSource();
            float blockedDamage = event.getBlockedDamage();
            float shieldDamage = event.shieldDamage();
            double randomChance = Math.random();
            Random random = new Random();

            // Lonsdaleite Shields
            boolean isLonsdaleiteShield = shield.is(BCItems.LONSDALEITE_SHIELD);
            boolean isGildedLonsdaleiteShield = shield.is(BCItems.GILDED_LONSDALEITE_SHIELD);
            if ((isLonsdaleiteShield || isGildedLonsdaleiteShield)) {

            }
        }
    }

    @SubscribeEvent
    public static void onPlayerTick(PlayerTickEvent.Pre event) {
        if (event.getEntity() instanceof Player player) {
            ItemStack mainHandItem = player.getMainHandItem();
            ItemStack offHandItem = player.getOffhandItem();
            AttributeInstance speedAttribute = player.getAttribute(Attributes.MOVEMENT_SPEED);

            // Titanium Shields
            boolean isTitaniumShield = mainHandItem.is(BCItems.TITANIUM_SHIELD) || offHandItem.is(BCItems.TITANIUM_SHIELD);
            boolean isGildedTitaniumShield = mainHandItem.is(BCItems.GILDED_TITANIUM_SHIELD) || offHandItem.is(BCItems.GILDED_TITANIUM_SHIELD);
            if (isTitaniumShield || isGildedTitaniumShield) {
                // Weakness
                if (speedAttribute != null) {
                    speedAttribute.removeModifier(MOVEMENT_SPEED_ID);
                    speedAttribute.addPermanentModifier(
                            new AttributeModifier(MOVEMENT_SPEED_ID, -0.3, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
                    );
                }
            } else {
                if (speedAttribute != null) {
                    speedAttribute.removeModifier(MOVEMENT_SPEED_ID);
                }
            }
        }
    }

    @SubscribeEvent
    public static void onShieldStop(LivingFallEvent event) {
        if (event.getEntity() instanceof Player player) {
            ItemStack shield = player.getUseItem();
            Level level = player.level();

            // Titanium Shields
            boolean isTitaniumShield = shield.is(BCItems.TITANIUM_SHIELD);
            boolean isGildedTitaniumShield = shield.is(BCItems.GILDED_TITANIUM_SHIELD);
            if ((isTitaniumShield || isGildedTitaniumShield) && event.getDistance() >= 6.0) {
                // Perk
                float baseDamage = isGildedTitaniumShield ? 8.0f : 6.0f;
                float extraDamage = (float) Math.floor((event.getDistance() - 6.0) / 4.0) * 0.5f;
                float totalDamage = baseDamage + extraDamage;

                List<LivingEntity> nearbyEntities = level.getEntitiesOfClass(
                        LivingEntity.class,
                        player.getBoundingBox().inflate(2.0),
                        entity -> entity != player
                );

                for (LivingEntity target : nearbyEntities) {
                    target.hurt(level.damageSources().playerAttack(player), totalDamage);
                }
            }
        }
    }
}
