package net.nova.big_swords_addon.data.tags;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.nova.big_swords.init.Tags;
import net.nova.big_swords_addon.init.BCItems;

import java.util.concurrent.CompletableFuture;

import static net.nova.big_swords_addon.BSRxCC.MODID;

public class BCItemTagsProvider extends ItemTagsProvider {
    public BCItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, BCBlockTagsProvider provider, ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, provider.contentsGetter(), MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(Tags.BSItemTags.BIG_SWORDS).add(
                BCItems.TITANIUM_BIG_SWORD.get(), BCItems.LONSDALEITE_BIG_SWORD.get()
        );

        tag(Tags.BSItemTags.GLAIVES).add(
                BCItems.TITANIUM_GLAIVE.get(), BCItems.LONSDALEITE_GLAIVE.get()
        );

        tag(Tags.BSItemTags.SCYTHES).add(
                BCItems.TITANIUM_SCYTHE.get(), BCItems.LONSDALEITE_SCYTHE.get()
        );

        tag(Tags.BSItemTags.SHIELDS).add(
                BCItems.TITANIUM_SHIELD.get(), BCItems.GILDED_TITANIUM_SHIELD.get(), BCItems.LONSDALEITE_SHIELD.get(), BCItems.GILDED_LONSDALEITE_SHIELD.get()
        );
    }
}
