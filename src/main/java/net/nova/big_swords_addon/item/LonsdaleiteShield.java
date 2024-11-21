package net.nova.big_swords_addon.item;

import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.enchantment.ItemEnchantments;
import net.nova.big_swords.item.TieredShield;

public class LonsdaleiteShield extends TieredShield {
    public LonsdaleiteShield(Tier pTier, Properties pProperties, int durabilityMultiplier, int additionalDurability) {
        super(pTier, pProperties, durabilityMultiplier, additionalDurability);
    }

    @Override
    public boolean isBookEnchantable(ItemStack stack, ItemStack book) {
        ItemEnchantments stackEnchantments = stack.getOrDefault(DataComponents.ENCHANTMENTS, ItemEnchantments.EMPTY);
        ItemEnchantments bookEnchantments = book.getOrDefault(DataComponents.STORED_ENCHANTMENTS, ItemEnchantments.EMPTY);

        return stackEnchantments.isEmpty() && bookEnchantments.entrySet().size() == 1;
    }

    @Override
    public boolean isEnchantable(ItemStack stack) {
        ItemEnchantments stackEnchantments = stack.getOrDefault(DataComponents.ENCHANTMENTS, ItemEnchantments.EMPTY);
        return stackEnchantments.isEmpty();
    }
}
