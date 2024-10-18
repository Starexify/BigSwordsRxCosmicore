package net.nova.big_swords_addon.data;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.nova.big_swords_addon.BigSwordsRAddon;

import java.util.concurrent.CompletableFuture;

import static net.nova.big_swords_addon.BigSwordsRAddon.MODID;

@EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        try {
            DataGenerator generator = event.getGenerator();
            PackOutput output = generator.getPackOutput();
            ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
            CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

            generator.addProvider(true, new LangProvider(output));
            generator.addProvider(true, new BCItemModelProvider(output, existingFileHelper));

        } catch (RuntimeException e) {
            BigSwordsRAddon.logger.error("Big Swords R x Cosmicore Add-On failed to gather data", e);
        }
    }
}