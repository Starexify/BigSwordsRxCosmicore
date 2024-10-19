package net.nova.big_swords_addon.data;

import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.common.data.LanguageProvider;
import net.nova.big_swords_addon.init.BCItems;

import java.util.function.Supplier;

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

        // Shields
        addShield(BCItems.TITANIUM_SHIELD, "Titanium Shield", "Special Perk: Titanic Slam", "Weakness: Heavy");
        addShield(BCItems.GILDED_TITANIUM_SHIELD, "Gilded Titanium Shield", "Special Perk: Titanic Slam", "Weakness: Heavy");
    }

    public void addShield(Supplier<? extends Item> key, String name, String perk, String weakness) {
        add(key.get(), name);
        add(key.get() + ".perk", perk);
        add(key.get() + ".weakness", weakness);
    }
}
