package net.nova.big_swords_addon.data;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.nova.big_swords.client.renderer.item.BSItemProperties;
import net.nova.big_swords.data.BSItemModelProvider;
import net.nova.big_swords_addon.init.BCItems;

import static net.nova.big_swords_addon.BigSwordsRAddon.MODID;

public class BCItemModelProvider extends BSItemModelProvider {
    public BCItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        // Big Swords
        handheldItem(BCItems.TITANIUM_BIG_SWORD.get());
    }

    private void shieldItem(Item item) {
        getBuilder(getItemName(item) + "_blocking")
                .parent(getExistingFile(modLoc("item/template_shield_blocking")))
                .texture("layer0", "item/" + getItemName(item));

        getBuilder(getItemName(item))
                .parent(getExistingFile(modLoc("item/template_shield")))
                .texture("layer0", "item/" + getItemName(item))
                .override().predicate(BSItemProperties.blockingPredicate, 1)
                .model(getExistingFile(modLoc("item/" + getItemName(item) + "_blocking")));
    }

    private void handheldGlaive(Item item) {
        getBuilder(getItemName(item))
                .parent(getExistingFile(modLoc("item/handheld_glaive")))
                .texture("layer0", "item/" + getItemName(item));
    }

    private String getItemName(Item item) {
        return BuiltInRegistries.ITEM.getKey(item).toString().replace(MODID + ":", "");
    }
}
