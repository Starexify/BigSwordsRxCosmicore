package net.nova.big_swords_addon.event;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.living.LivingShieldBlockEvent;
import net.nova.big_swords_addon.init.BCItems;

import java.util.Random;

import static net.nova.big_swords_addon.BigSwordsRAddon.MODID;

@EventBusSubscriber(modid = MODID)
public class ShieldMechanics {

    @SubscribeEvent
    public static void onShieldBlock(LivingShieldBlockEvent event) {
        if (event.getEntity() instanceof Player player && event.getBlocked()) {
            ItemStack shield = player.getUseItem();
            Entity attacker = event.getDamageSource().getEntity();
            Entity sourceEntity = event.getDamageSource().getDirectEntity();
            DamageSource damageSource = event.getDamageSource();
            float blockedDamage = event.getBlockedDamage();
            float shieldDamage = event.shieldDamage();
            double randomChance = Math.random();
            double randomChanceE = Math.random();
            Random random = new Random();
            Level level = player.level();

            // Titanium Shields
            boolean isTitaniumShield = shield.is(BCItems.TITANIUM_SHIELD);
            boolean isGildedTitaniumShield = shield.is(BCItems.GILDED_TITANIUM_SHIELD);
            if ((isTitaniumShield || isGildedTitaniumShield)) {

            }
        }
    }
}
