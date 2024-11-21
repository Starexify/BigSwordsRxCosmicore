package net.nova.bsrxcc.event;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.nova.big_swords.init.BSItems;
import net.nova.big_swords.init.CreativeTab;
import net.nova.bsrxcc.client.render.item.BCItemProperties;
import net.nova.bsrxcc.init.BCItems;

import java.util.function.Supplier;

import static net.nova.bsrxcc.BSRxCC.MODID;

@EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BigSwordsRAddonClient {

    @SubscribeEvent
    public static void addCreative(BuildCreativeModeTabContentsEvent event) {
        CreativeModeTab bigSwordsTab = CreativeTab.BIG_SWORDS_TAB.value();

        if (event.getTab() == bigSwordsTab) {
            putAfter(BSItems.PATCHWORK_BIG_SWORD.get(), BCItems.TITANIUM_BIG_SWORD, event);
            putAfter(BCItems.TITANIUM_BIG_SWORD.get(), BCItems.LONSDALEITE_BIG_SWORD, event);
            putAfter(BSItems.LIVINGMETAL_GLAIVE.get(), BCItems.TITANIUM_GLAIVE, event);
            putAfter(BCItems.TITANIUM_GLAIVE.get(), BCItems.LONSDALEITE_GLAIVE, event);
            putAfter(BSItems.SOUL_REAPER.get(), BCItems.TITANIUM_SCYTHE, event);
            putAfter(BCItems.TITANIUM_SCYTHE.get(), BCItems.LONSDALEITE_SCYTHE, event);
            putAfter(BSItems.GILDED_PATCHWORK_SHIELD.get(), BCItems.TITANIUM_SHIELD, event);
            putAfter(BCItems.TITANIUM_SHIELD.get(), BCItems.GILDED_TITANIUM_SHIELD, event);
            putAfter(BCItems.GILDED_TITANIUM_SHIELD.get(), BCItems.LONSDALEITE_SHIELD, event);
            putAfter(BCItems.LONSDALEITE_SHIELD.get(), BCItems.GILDED_LONSDALEITE_SHIELD, event);
        }
    }

    public static void putAfter(Item item, Supplier<? extends ItemLike> itemAfter, BuildCreativeModeTabContentsEvent event) {
        event.insertAfter(item.getDefaultInstance(), itemAfter.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
    }

    @SubscribeEvent
    public static void setupClient(FMLClientSetupEvent event) {
        // Item Properties
        event.enqueueWork(BCItemProperties::addCustomItemProperties);
    }
}
