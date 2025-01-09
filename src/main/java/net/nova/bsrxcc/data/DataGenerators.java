package net.nova.bsrxcc.data;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.nova.big_swords.data.recipe.BSRecipeProvider;
import net.nova.bsrxcc.data.models.BCModelProvider;
import net.nova.bsrxcc.data.tags.BCBlockTagsProvider;
import net.nova.bsrxcc.data.tags.BCItemTagsProvider;

import java.util.concurrent.CompletableFuture;

import static net.nova.bsrxcc.BSRxCC.MODID;

@EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent.Client event) {
        PackOutput output = event.getGenerator().getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        event.addProvider(new LangProvider(output));
        event.addProvider(new BCModelProvider(output));

        event.addProvider(new BSRecipeProvider.Runner(output, lookupProvider));

        BCBlockTagsProvider modBlockTagsProvider = new BCBlockTagsProvider(output, lookupProvider);
        event.addProvider(modBlockTagsProvider);
        event.addProvider(new BCItemTagsProvider(output, lookupProvider, modBlockTagsProvider));

    }
}