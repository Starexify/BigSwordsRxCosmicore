package net.nova.big_swords_addon.init;

import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.nova.big_swords.item.BigSwordItem;
import net.nova.big_swords.item.GlaiveItem;
import net.nova.big_swords.item.ScytheItem;
import net.nova.big_swords.item.TieredShield;
import net.nova.cosmicore.init.CTiers;

import static net.nova.big_swords_addon.BigSwordsRAddon.MODID;

public class BCItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    // Big Swords
    public static DeferredItem<Item> TITANIUM_BIG_SWORD = ITEMS.register("titanium_big_sword", () -> new BigSwordItem(CTiers.TITANIUM, new Item.Properties().attributes(BigSwordItem.createAttributes(CTiers.TITANIUM, 6.5F, -2.8F))));
    public static DeferredItem<Item> LONSDALEITE_BIG_SWORD = ITEMS.register("lonsdaleite_big_sword", () -> new BigSwordItem(CTiers.LONSDALEITE, new Item.Properties().attributes(BigSwordItem.createAttributes(CTiers.LONSDALEITE, 6.5F, -2.8F))));

    // Glaives
    public static DeferredItem<Item> TITANIUM_GLAIVE = ITEMS.register("titanium_glaive", () -> new GlaiveItem(CTiers.TITANIUM, new Item.Properties().attributes(GlaiveItem.createAttributes(CTiers.TITANIUM, 2, -2.2F)), 4.4F, 5.4F));
    public static DeferredItem<Item> LONSDALEITE_GLAIVE = ITEMS.register("lonsdaleite_glaive", () -> new GlaiveItem(CTiers.LONSDALEITE, new Item.Properties().attributes(GlaiveItem.createAttributes(CTiers.LONSDALEITE, 2, -2.2F)), 6.0F, 7.0F));

    // Scythes
    public static DeferredItem<Item> TITANIUM_SCYTHE = ITEMS.register("titanium_scythe", () -> new ScytheItem(CTiers.TITANIUM, new Item.Properties().attributes(ScytheItem.createAttributes(CTiers.TITANIUM, 1, -2.0F)), 3.4F, 4.4F));
    public static DeferredItem<Item> LONSDALEITE_SCYTHE = ITEMS.register("lonsdaleite_scythe", () -> new ScytheItem(CTiers.LONSDALEITE, new Item.Properties().attributes(ScytheItem.createAttributes(CTiers.LONSDALEITE, 1, -2.0F)), 5.0F, 6.0F));

    // Shields
    public static DeferredItem<Item> TITANIUM_SHIELD = ITEMS.register("titanium_shield", () -> new TieredShield(CTiers.TITANIUM, new Item.Properties()));
    public static DeferredItem<Item> GILDED_TITANIUM_SHIELD = ITEMS.register("gilded_titanium_shield", () -> new TieredShield(CTiers.TITANIUM, new Item.Properties(), 1, CTiers.TITANIUM.getUses() / 2));
    public static DeferredItem<Item> LONSDALEITE_SHIELD = ITEMS.register("lonsdaleite_shield", () -> new TieredShield(CTiers.LONSDALEITE, new Item.Properties(), 1, -(CTiers.LONSDALEITE.getUses() / 2)));
    public static DeferredItem<Item> GILDED_LONSDALEITE_SHIELD = ITEMS.register("gilded_lonsdaleite_shield", () -> new TieredShield(CTiers.LONSDALEITE, new Item.Properties(), 1, -938));
}
