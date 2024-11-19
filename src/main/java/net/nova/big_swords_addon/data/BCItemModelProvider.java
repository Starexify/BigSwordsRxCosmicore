package net.nova.big_swords_addon.data;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.nova.big_swords.BigSwordsR;
import net.nova.big_swords.client.renderer.item.BSItemProperties;
import net.nova.big_swords.data.BSItemModelProvider;
import net.nova.big_swords_addon.init.BCItems;

import static net.nova.big_swords_addon.BigSwordsRAddon.MODID;

public class BCItemModelProvider extends ItemModelProvider {
    public BCItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        // Big Swords
        handheldItem(BCItems.TITANIUM_BIG_SWORD.get());
        handheldItem(BCItems.LONSDALEITE_BIG_SWORD.get());

        // Glaives
        handheldGlaive(BCItems.TITANIUM_GLAIVE.get());
        handheldGlaive(BCItems.LONSDALEITE_GLAIVE.get());

        // Scythes
        handheldItem(BCItems.TITANIUM_SCYTHE.get());
        handheldItem(BCItems.LONSDALEITE_SCYTHE.get());

        // Shields
        shieldItem(BCItems.TITANIUM_SHIELD.get());
        shieldItem(BCItems.GILDED_TITANIUM_SHIELD.get());
        shieldItem(BCItems.LONSDALEITE_SHIELD.get());
        shieldItem(BCItems.GILDED_LONSDALEITE_SHIELD.get());
    }

    private void shieldItem(Item item) {
        getBuilder(getItemName(item) + "_blocking")
                .parent(new ModelFile.UncheckedModelFile(BigSwordsR.rl("item/template_shield_blocking")))
                .texture("layer0", "item/" + getItemName(item));

        getBuilder(getItemName(item))
                .parent(new ModelFile.UncheckedModelFile(BigSwordsR.rl("item/template_shield")))
                .texture("layer0", "item/" + getItemName(item))
                .override().predicate(BSItemProperties.blockingPredicate, 1)
                .model(getExistingFile(modLoc("item/" + getItemName(item) + "_blocking")));
    }

    private void handheldGlaive(Item item) {
        getBuilder(getItemName(item))
                .parent(new ModelFile.UncheckedModelFile(BigSwordsR.rl("item/handheld_glaive")))
                .texture("layer0", "item/" + getItemName(item));
    }

    public String getItemName(Item item) {
        return BuiltInRegistries.ITEM.getKey(item).toString().replace(MODID + ":", "");
    }
}
