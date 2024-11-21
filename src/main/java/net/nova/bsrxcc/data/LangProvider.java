package net.nova.bsrxcc.data;

import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.common.data.LanguageProvider;
import net.nova.bsrxcc.init.BCItems;

import java.util.function.Supplier;

import static net.nova.bsrxcc.BSRxCC.MODID;

public class LangProvider extends LanguageProvider {
    public LangProvider(PackOutput output) {
        super(output, MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        // Big Swords
        addItem(BCItems.TITANIUM_BIG_SWORD, "Titanium Big Sword");
        addItem(BCItems.LONSDALEITE_BIG_SWORD, "Lonsdaleite Big Sword");

        // Glaives
        addItem(BCItems.TITANIUM_GLAIVE, "Titanium Glaive");
        addItem(BCItems.LONSDALEITE_GLAIVE, "Lonsdaleite Glaive");

        // Scythes
        addItem(BCItems.TITANIUM_SCYTHE, "Titanium Scythe");
        addItem(BCItems.LONSDALEITE_SCYTHE, "Lonsdaleite Scythe");

        // Shields
        addShield(BCItems.TITANIUM_SHIELD, "Titanium Shield", "Special Perk: Titanic Slam", "Weakness: Heavy");
        addShield(BCItems.GILDED_TITANIUM_SHIELD, "Gilded Titanium Shield", "Special Perk: Titanic Slam", "Weakness: Heavy");
        addShield(BCItems.LONSDALEITE_SHIELD, "Lonsdaleite Shield", "Special Perk: Kinetic Wave", "Weakness: Enchantment Singularity");
        addShield(BCItems.GILDED_LONSDALEITE_SHIELD, "Gilded Lonsdaleite Shield", "Special Perk: Kinetic Wave", "Weakness: Enchantment Singularity");
    }

    public void addShield(Supplier<? extends Item> key, String name, String perk, String weakness) {
        add(key.get(), name);
        add(key.get() + ".perk", perk);
        add(key.get() + ".weakness", weakness);
    }
}
