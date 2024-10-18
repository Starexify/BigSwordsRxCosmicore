package net.nova.big_swords_addon.event;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.nova.big_swords.init.BSItems;
import net.nova.big_swords.init.CreativeTab;
import net.nova.big_swords_addon.init.BCItems;

import java.util.function.Supplier;

import static net.nova.big_swords_addon.BigSwordsRAddon.MODID;

@EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BigSwordsRAddonClient {
    @SubscribeEvent
    public static void addCreative(BuildCreativeModeTabContentsEvent event) {
        CreativeModeTab bigSwordsTab = CreativeTab.BIG_SWORDS_TAB.get();

        if (event.getTab() == bigSwordsTab) {
            putAfter(BSItems.PATCHWORK_BIG_SWORD.get(), BCItems.TITANIUM_BIG_SWORD, event);
            putAfter(BSItems.LIVINGMETAL_GLAIVE.get(), BCItems.TITANIUM_GLAIVE, event);
        }
    }

    private static void putAfter(Item item, Supplier<? extends ItemLike> itemAfter, BuildCreativeModeTabContentsEvent event) {
        event.insertAfter(item.getDefaultInstance(), itemAfter.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
    }
}
