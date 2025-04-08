package net.nova.bsrxcc.data.recipe;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.crafting.Ingredient;
import net.nova.bsrxcc.init.BCItems;
import net.nova.cosmicore.init.CItems;

public class FurnaceRecipes extends BCRecipeProvider {
    public FurnaceRecipes(HolderLookup.Provider lookupProvider, RecipeOutput recipeOutput) {
        super(lookupProvider, recipeOutput);
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
                .unlockedBy(getHasName(BCItems.TITANIUM_BIG_SWORD), has(BCItems.TITANIUM_BIG_SWORD))
                .save(output, path + getSmeltingRecipeName(BCItems.TITANIUM_BIG_SWORD));

        // Glaives & Scythes
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
                                BCItems.TITANIUM_GLAIVE,
                                BCItems.TITANIUM_SCYTHE
                        ),
                        RecipeCategory.MISC,
                        CItems.TITANIUM_NUGGET,
                        0.1F,
                        200
                )
                .unlockedBy(getHasName(BCItems.TITANIUM_GLAIVE), has(BCItems.TITANIUM_GLAIVE))
                .unlockedBy(getHasName(BCItems.TITANIUM_SCYTHE), has(BCItems.TITANIUM_SCYTHE))
                .save(output, path + getSmeltingRecipeName(CItems.TITANIUM_NUGGET));
    }
}
