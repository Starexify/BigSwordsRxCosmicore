package net.nova.bsrxcc.data.models;

import net.minecraft.client.data.models.ItemModelOutput;
import net.minecraft.client.data.models.model.ModelInstance;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.resources.ResourceLocation;
import net.nova.big_swords.data.models.BSItemModelGenerator;
import net.nova.big_swords.data.models.BSModelTemplates;
import net.nova.bsrxcc.init.BCItems;

import java.util.function.BiConsumer;

public class BCItemModelGenerator extends BSItemModelGenerator {
    public BCItemModelGenerator(ItemModelOutput itemModelOutput, BiConsumer<ResourceLocation, ModelInstance> modelOutput) {
        super(itemModelOutput, modelOutput);
    }

    @Override
    public void run() {
        // Big Swords
        generateFlatItem(BCItems.TITANIUM_BIG_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        generateFlatItem(BCItems.LONSDALEITE_BIG_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);

        // Glaives
        generateFlatItem(BCItems.TITANIUM_GLAIVE.get(), BSModelTemplates.FLAT_HANDHELD_GLAIVE_ITEM);
        generateFlatItem(BCItems.LONSDALEITE_GLAIVE.get(), BSModelTemplates.FLAT_HANDHELD_GLAIVE_ITEM);

        // Scythes
        generateFlatItem(BCItems.TITANIUM_SCYTHE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        generateFlatItem(BCItems.LONSDALEITE_SCYTHE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);

        // Shields
        generateShield(BCItems.TITANIUM_SHIELD.get());
        generateShield(BCItems.GILDED_TITANIUM_SHIELD.get());
        generateShield(BCItems.LONSDALEITE_SHIELD.get());
        generateShield(BCItems.GILDED_LONSDALEITE_SHIELD.get());
    }
}
