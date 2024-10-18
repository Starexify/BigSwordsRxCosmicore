package net.nova.big_swords_addon.data.recipe;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.crafting.Ingredient;
import net.nova.big_swords_addon.init.BCItems;
import net.nova.cosmicore.init.CItems;

import java.util.concurrent.CompletableFuture;

public class FurnaceRecipes extends BCRecipeProvider {
    public final RecipeOutput recipeOutput;

    public FurnaceRecipes(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, RecipeOutput recipeOutput) {
        super(output, lookupProvider);
        this.recipeOutput = recipeOutput;
    }

    public void build() {
        // Big Swords
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
                                BCItems.TITANIUM_BIG_SWORD
                        ),
                        RecipeCategory.MISC,
                        CItems.TITANIUM_INGOT,
                        0.1F,
                        200
                )
                .unlockedBy("has_" + getItemName(BCItems.TITANIUM_BIG_SWORD), has(BCItems.TITANIUM_BIG_SWORD))
                .save(recipeOutput, path + getSmeltingRecipeName(BCItems.TITANIUM_BIG_SWORD));
    }
}
