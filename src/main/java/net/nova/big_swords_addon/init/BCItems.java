package net.nova.big_swords_addon.init;

import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.nova.big_swords.item.BigSwordItem;
import net.nova.cosmicore.init.CToolTiers;

import static net.nova.big_swords_addon.BigSwordsRAddon.MODID;

public class BCItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static DeferredItem<Item> TITANIUM_BIG_SWORD = ITEMS.register("titanium_big_sword", () -> new BigSwordItem(CToolTiers.TITANIUM, new Item.Properties().attributes(BigSwordItem.createAttributes(CToolTiers.TITANIUM, 6.5F, -2.8F))));
}
