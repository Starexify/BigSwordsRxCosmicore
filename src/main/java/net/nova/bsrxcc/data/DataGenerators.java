package net.nova.bsrxcc.data;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.nova.big_swords.data.recipe.BSRecipeProvider;
import net.nova.bsrxcc.data.models.BCModelProvider;
import net.nova.bsrxcc.data.tags.BCBlockTagsProvider;
import net.nova.bsrxcc.data.tags.BCItemTagsProvider;

import static net.nova.bsrxcc.BSRxCC.MODID;

@EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent.Client event) {
        event.createProvider(LangProvider::new);
        event.createProvider(BCModelProvider::new);
        event.createProvider(BSRecipeProvider.Runner::new);
        event.createBlockAndItemTags(BCBlockTagsProvider::new, BCItemTagsProvider::new);
    }
}