package net.nova.bsrxcc.init;

import net.minecraft.core.component.DataComponents;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.DamageTypeTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.component.BlocksAttacks;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.nova.big_swords.item.GlaiveItem;
import net.nova.big_swords.item.ScytheItem;
import net.nova.big_swords.item.TieredShield;
import net.nova.bsrxcc.item.LonsdaleiteShield;
import net.nova.cosmicore.init.CToolMaterial;

import java.util.List;
import java.util.Optional;

import static net.nova.bsrxcc.BSRxCC.MODID;

public class BCItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    // Big Swords
    public static DeferredItem<Item> TITANIUM_BIG_SWORD = ITEMS.registerItem("titanium_big_sword", properties -> new Item(properties.sword(CToolMaterial.TITANIUM, 6.5F, -2.8F).durability(CToolMaterial.TITANIUM.durability() * 2)));
    public static DeferredItem<Item> LONSDALEITE_BIG_SWORD = ITEMS.registerItem("lonsdaleite_big_sword", properties -> new Item(properties.sword(CToolMaterial.LONSDALEITE, 6.5F, -2.8F).durability(CToolMaterial.LONSDALEITE.durability() * 2)));

    // Glaives
    public static DeferredItem<Item> TITANIUM_GLAIVE = ITEMS.registerItem("titanium_glaive", properties -> new GlaiveItem(CToolMaterial.TITANIUM, 2, -2.2F, 4.4F, 5.4F, properties));
    public static DeferredItem<Item> LONSDALEITE_GLAIVE = ITEMS.registerItem("lonsdaleite_glaive", properties -> new GlaiveItem(CToolMaterial.LONSDALEITE, 2, -2.2F, 6.0F, 7.0F, properties));

    // Scythes
    public static DeferredItem<Item> TITANIUM_SCYTHE = ITEMS.registerItem("titanium_scythe", properties -> new ScytheItem(CToolMaterial.TITANIUM, 1, -2.0F, 3.4F, 4.4F, properties));
    public static DeferredItem<Item> LONSDALEITE_SCYTHE = ITEMS.registerItem("lonsdaleite_scythe", properties -> new ScytheItem(CToolMaterial.LONSDALEITE, 1, -2.0F, 5.0F, 6.0F, properties));

    // Shields
    public static DeferredItem<Item> TITANIUM_SHIELD = ITEMS.registerItem("titanium_shield", properties -> new TieredShield(CToolMaterial.TITANIUM,
            properties.component(DataComponents.BLOCKS_ATTACKS, new BlocksAttacks(0.25F, 1.0F,
                    List.of(new BlocksAttacks.DamageReduction(90.0F, Optional.empty(), 0.0F, 1.0F)),
                    new BlocksAttacks.ItemDamageFunction(3.0F, 1.0F, 1.0F),
                    Optional.of(DamageTypeTags.BYPASSES_SHIELD),
                    Optional.of(SoundEvents.SHIELD_BLOCK),
                    Optional.of(SoundEvents.SHIELD_BREAK)
            ))));
    public static DeferredItem<Item> GILDED_TITANIUM_SHIELD = ITEMS.registerItem("gilded_titanium_shield", properties -> new TieredShield(CToolMaterial.TITANIUM,
            properties.component(DataComponents.BLOCKS_ATTACKS, new BlocksAttacks(0.25F, 1.0F,
                    List.of(new BlocksAttacks.DamageReduction(90.0F, Optional.empty(), 0.0F, 1.0F)),
                    new BlocksAttacks.ItemDamageFunction(3.0F, 1.0F, 1.0F),
                    Optional.of(DamageTypeTags.BYPASSES_SHIELD),
                    Optional.of(SoundEvents.SHIELD_BLOCK),
                    Optional.of(SoundEvents.SHIELD_BREAK)
            )), 1, CToolMaterial.TITANIUM.durability() / 2));
    public static DeferredItem<Item> LONSDALEITE_SHIELD = ITEMS.registerItem("lonsdaleite_shield", properties -> new LonsdaleiteShield(CToolMaterial.LONSDALEITE,
            properties.component(DataComponents.BLOCKS_ATTACKS, new BlocksAttacks(0.25F, 1.0F,
                    List.of(new BlocksAttacks.DamageReduction(90.0F, Optional.empty(), 0.0F, 1.0F)),
                    new BlocksAttacks.ItemDamageFunction(3.0F, 1.0F, 1.0F),
                    Optional.of(DamageTypeTags.BYPASSES_SHIELD),
                    Optional.of(SoundEvents.SHIELD_BLOCK),
                    Optional.of(SoundEvents.SHIELD_BREAK)
            )), 1, -(CToolMaterial.LONSDALEITE.durability() / 2)));
    public static DeferredItem<Item> GILDED_LONSDALEITE_SHIELD = ITEMS.registerItem("gilded_lonsdaleite_shield", properties -> new LonsdaleiteShield(CToolMaterial.LONSDALEITE,
            properties.component(DataComponents.BLOCKS_ATTACKS, new BlocksAttacks(0.25F, 1.0F,
                    List.of(new BlocksAttacks.DamageReduction(90.0F, Optional.empty(), 0.0F, 1.0F)),
                    new BlocksAttacks.ItemDamageFunction(3.0F, 1.0F, 1.0F),
                    Optional.of(DamageTypeTags.BYPASSES_SHIELD),
                    Optional.of(SoundEvents.SHIELD_BLOCK),
                    Optional.of(SoundEvents.SHIELD_BREAK)
            )), 1, -938));
}
