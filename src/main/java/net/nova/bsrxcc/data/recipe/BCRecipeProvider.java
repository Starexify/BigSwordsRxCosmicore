package net.nova.bsrxcc.data.recipe;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeOutput;
import net.nova.big_swords.data.recipe.BSRecipeProvider;

import static net.nova.bsrxcc.BSRxCC.MODID;

public class BCRecipeProvider extends BSRecipeProvider {
    public static String path = MODID + ":";

    public BCRecipeProvider(HolderLookup.Provider lookupProvider, RecipeOutput recipeOutput) {
        super(lookupProvider, recipeOutput);
    }

    @Override
    protected void buildRecipes() {
        new CraftingRecipes(registries, output).build();
        new BCSmithingRecipes(registries, output).build();
        new FurnaceRecipes(registries, output).build();
    }
}
