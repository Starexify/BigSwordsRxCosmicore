package net.nova.big_swords_addon.data.recipe;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.nova.big_swords.data.recipe.BSRecipeProvider;
import net.nova.big_swords.init.BSItems;
import net.nova.big_swords_addon.init.BCItems;
import net.nova.cosmicore.init.CItems;

import java.util.concurrent.CompletableFuture;

public class CraftingRecipes extends BSRecipeProvider {
    public final RecipeOutput recipeOutput;

    public CraftingRecipes(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, RecipeOutput recipeOutput) {
        super(output, lookupProvider);
        this.recipeOutput = recipeOutput;
    }

    public void build() {
        // Gilded Shields
        basicGildedShield(recipeOutput, BCItems.TITANIUM_SHIELD, BCItems.GILDED_TITANIUM_SHIELD);
    }
}
