package net.nova.big_swords_addon.client.render.item;

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
}
