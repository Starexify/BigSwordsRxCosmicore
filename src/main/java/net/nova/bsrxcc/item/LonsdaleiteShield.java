package net.nova.bsrxcc.item;

import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.enchantment.ItemEnchantments;
import net.nova.big_swords.item.TieredShield;

public class LonsdaleiteShield extends TieredShield {
    public LonsdaleiteShield(ToolMaterial toolMaterial, Properties properties, int durabilityMultiplier, int additionalDurability) {
        super(toolMaterial, properties, durabilityMultiplier, additionalDurability);
    }

    @Override
    public boolean isBookEnchantable(ItemStack stack, ItemStack book) {
        ItemEnchantments stackEnchantments = stack.getOrDefault(DataComponents.ENCHANTMENTS, ItemEnchantments.EMPTY);
        ItemEnchantments bookEnchantments = book.getOrDefault(DataComponents.STORED_ENCHANTMENTS, ItemEnchantments.EMPTY);

        return stackEnchantments.isEmpty() && bookEnchantments.entrySet().size() == 1;
    }
}
