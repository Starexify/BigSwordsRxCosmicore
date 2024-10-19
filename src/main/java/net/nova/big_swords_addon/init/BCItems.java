package net.nova.big_swords_addon.init;

import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.nova.big_swords.item.BigSwordItem;
import net.nova.big_swords.item.GlaiveItem;
import net.nova.big_swords.item.ScytheItem;
import net.nova.big_swords.item.TieredShield;
import net.nova.cosmicore.init.CToolTiers;

import static net.nova.big_swords_addon.BigSwordsRAddon.MODID;

public class BCItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    // Big Swords
    public static DeferredItem<Item> TITANIUM_BIG_SWORD = ITEMS.register("titanium_big_sword", () -> new BigSwordItem(CToolTiers.TITANIUM, new Item.Properties().attributes(BigSwordItem.createAttributes(CToolTiers.TITANIUM, 6.5F, -2.8F))));

    // Glaives
    public static DeferredItem<Item> TITANIUM_GLAIVE = ITEMS.register("titanium_glaive", () -> new GlaiveItem(CToolTiers.TITANIUM, new Item.Properties().attributes(GlaiveItem.createAttributes(CToolTiers.TITANIUM, 2, -2.2F)), 4.4F, 5.4F));

    // Scythes
    public static DeferredItem<Item> TITANIUM_SCYTHE = ITEMS.register("titanium_scythe", () -> new ScytheItem(CToolTiers.TITANIUM, new Item.Properties().attributes(ScytheItem.createAttributes(CToolTiers.TITANIUM, 1, -2.0F)), 3.4F, 4.4F));

    // Shields
    public static DeferredItem<Item> TITANIUM_SHIELD = ITEMS.register("titanium_shield", () -> new TieredShield(CToolTiers.TITANIUM, new Item.Properties()));
    public static DeferredItem<Item> GILDED_TITANIUM_SHIELD = ITEMS.register("gilded_titanium_shield", () -> new TieredShield(CToolTiers.TITANIUM, new Item.Properties(), 1, CToolTiers.TITANIUM.getUses() / 2));
}
