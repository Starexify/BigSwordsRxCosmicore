package net.nova.bsrxcc.data.recipe;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.nova.big_swords.init.BSItems;
import net.nova.bsrxcc.init.BCItems;
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
        titaniumSmithing(recipeOutput, BSItems.IRON_GLAIVE.asItem(), RecipeCategory.TOOLS, BCItems.TITANIUM_GLAIVE.get());
        titaniumSmithing(recipeOutput, BSItems.IRON_SCYTHE.asItem(), RecipeCategory.TOOLS, BCItems.TITANIUM_SCYTHE.get());
        titaniumSmithing(recipeOutput, BSItems.IRON_SHIELD.asItem(), RecipeCategory.TOOLS, BCItems.TITANIUM_SHIELD.get());
        titaniumSmithing(recipeOutput, BSItems.GILDED_IRON_SHIELD.asItem(), RecipeCategory.TOOLS, BCItems.GILDED_TITANIUM_SHIELD.get());

        // Lonsdaleite Stuff
        lonsdaleiteSmithing(recipeOutput, BSItems.DIAMOND_BIG_SWORD.asItem(), RecipeCategory.TOOLS, BCItems.LONSDALEITE_BIG_SWORD.get());
        lonsdaleiteSmithing(recipeOutput, BSItems.DIAMOND_GLAIVE.asItem(), RecipeCategory.TOOLS, BCItems.LONSDALEITE_GLAIVE.get());
        lonsdaleiteSmithing(recipeOutput, BSItems.DIAMOND_SCYTHE.asItem(), RecipeCategory.TOOLS, BCItems.LONSDALEITE_SCYTHE.get());
        lonsdaleiteSmithing(recipeOutput, BSItems.DIAMOND_SHIELD.asItem(), RecipeCategory.TOOLS, BCItems.LONSDALEITE_SHIELD.get());
        lonsdaleiteSmithing(recipeOutput, BSItems.GILDED_DIAMOND_SHIELD.asItem(), RecipeCategory.TOOLS, BCItems.GILDED_LONSDALEITE_SHIELD.get());
    }
}
