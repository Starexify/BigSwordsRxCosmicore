package net.nova.bsrxcc.data.recipe;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeOutput;
import net.nova.big_swords.data.recipe.BSRecipeProvider;
import net.nova.bsrxcc.init.BCItems;

public class CraftingRecipes extends BSRecipeProvider {
    public CraftingRecipes(HolderLookup.Provider lookupProvider, RecipeOutput recipeOutput) {
        super(lookupProvider, recipeOutput);
    }

    public void build() {
        // Gilded Shields
        basicGildedShield(BCItems.TITANIUM_SHIELD, BCItems.GILDED_TITANIUM_SHIELD);
        basicGildedShield(BCItems.LONSDALEITE_SHIELD, BCItems.GILDED_LONSDALEITE_SHIELD);
    }
}
