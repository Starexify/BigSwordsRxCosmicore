package net.nova.bsrxcc.client.render.item;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import net.nova.big_swords.client.renderer.item.BSItemProperties;
import net.nova.bsrxcc.init.BCItems;

@OnlyIn(Dist.CLIENT)
public class BCItemProperties extends BSItemProperties {

    public static void addCustomItemProperties() {
        makeShield(BCItems.TITANIUM_SHIELD.get());
        makeShield(BCItems.GILDED_TITANIUM_SHIELD.get());
        makeShield(BCItems.LONSDALEITE_SHIELD.get());
        makeShield(BCItems.GILDED_LONSDALEITE_SHIELD.get());
    }
}
