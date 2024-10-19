package net.nova.big_swords_addon.client.render.item;

import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.world.item.Item;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import net.nova.big_swords.client.renderer.item.BSItemProperties;
import net.nova.big_swords_addon.init.BCItems;

@OnlyIn(Dist.CLIENT)
public class BCItemProperties extends BSItemProperties {

    public static void addCustomItemProperties() {
        makeShield(BCItems.TITANIUM_SHIELD.get());
        makeShield(BCItems.GILDED_TITANIUM_SHIELD.get());
    }

    private static void makeShield(Item item) {
        ItemProperties.register(item, blockingPredicate,
                (p_174575_, p_174576_, p_174577_, p_174578_) -> p_174577_ != null && p_174577_.isUsingItem() && p_174577_.getUseItem() == p_174575_ ? 1.0F : 0.0F
        );
    }
}
