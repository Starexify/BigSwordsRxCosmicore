package net.nova.big_swords_addon.data.recipe;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.nova.big_swords.init.BSItems;
import net.nova.big_swords_addon.init.BCItems;
import net.nova.cosmicore.data.recipe.CRecipeProvider;

import java.util.concurrent.CompletableFuture;

public class BCSmithingRecipes extends CRecipeProvider {
    public final RecipeOutput recipeOutput;

    public BCSmithingRecipes(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, RecipeOutput recipeOutput) {
        super(output, lookupProvider);
        this.recipeOutput = recipeOutput;
    }

    public void build() {
        // Titanium Stuff
        titaniumSmithing(recipeOutput, BSItems.IRON_BIG_SWORD.asItem(), RecipeCategory.TOOLS, BCItems.TITANIUM_BIG_SWORD.get());
    }
}
