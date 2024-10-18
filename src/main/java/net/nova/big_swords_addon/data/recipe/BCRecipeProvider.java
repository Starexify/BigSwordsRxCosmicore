package net.nova.big_swords_addon.data.recipe;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.nova.big_swords.data.recipe.BSRecipeProvider;

import java.util.concurrent.CompletableFuture;

import static net.nova.big_swords_addon.BigSwordsRAddon.MODID;

public class BCRecipeProvider extends BSRecipeProvider {
    public final PackOutput output;
    public final CompletableFuture<HolderLookup.Provider> lookupProvider;
    public static String path = MODID + ":";

    public BCRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider);
        this.output = output;
        this.lookupProvider = lookupProvider;
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        new CraftingRecipes(output, lookupProvider, recipeOutput).build();
        new BCSmithingRecipes(output, lookupProvider, recipeOutput).build();
        new FurnaceRecipes(output, lookupProvider, recipeOutput).build();
    }
}
