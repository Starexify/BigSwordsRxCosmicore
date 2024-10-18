package net.nova.big_swords_addon.data;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;
import net.nova.big_swords_addon.init.BCItems;

import static net.nova.big_swords_addon.BigSwordsRAddon.MODID;

public class LangProvider extends LanguageProvider {
    public LangProvider(PackOutput output) {
        super(output, MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        // Big Swords
        addItem(BCItems.TITANIUM_BIG_SWORD, "Titanium Big Sword");

        // Glaives
        addItem(BCItems.TITANIUM_GLAIVE, "Titanium Glaive");

        // Scythes
        addItem(BCItems.TITANIUM_SCYTHE, "Titanium Scythe");
    }
}