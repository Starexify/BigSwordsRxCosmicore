package net.nova.bsrxcc.data.recipe;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.nova.big_swords.init.BSItems;
import net.nova.bsrxcc.init.BCItems;
import net.nova.cosmicore.data.recipe.CRecipeProvider;

public class BCSmithingRecipes extends CRecipeProvider {
    public BCSmithingRecipes(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
    }

    public void build() {
        // Titanium Stuff
        titaniumSmithing(BSItems.IRON_BIG_SWORD.asItem(), RecipeCategory.TOOLS, BCItems.TITANIUM_BIG_SWORD.get());
        titaniumSmithing(BSItems.IRON_GLAIVE.asItem(), RecipeCategory.TOOLS, BCItems.TITANIUM_GLAIVE.get());
        titaniumSmithing(BSItems.IRON_SCYTHE.asItem(), RecipeCategory.TOOLS, BCItems.TITANIUM_SCYTHE.get());
        titaniumSmithing(BSItems.IRON_SHIELD.asItem(), RecipeCategory.TOOLS, BCItems.TITANIUM_SHIELD.get());
        titaniumSmithing(BSItems.GILDED_IRON_SHIELD.asItem(), RecipeCategory.TOOLS, BCItems.GILDED_TITANIUM_SHIELD.get());

        // Lonsdaleite Stuff
        lonsdaleiteSmithing(BSItems.DIAMOND_BIG_SWORD.asItem(), RecipeCategory.TOOLS, BCItems.LONSDALEITE_BIG_SWORD.get());
        lonsdaleiteSmithing(BSItems.DIAMOND_GLAIVE.asItem(), RecipeCategory.TOOLS, BCItems.LONSDALEITE_GLAIVE.get());
        lonsdaleiteSmithing(BSItems.DIAMOND_SCYTHE.asItem(), RecipeCategory.TOOLS, BCItems.LONSDALEITE_SCYTHE.get());
        lonsdaleiteSmithing(BSItems.DIAMOND_SHIELD.asItem(), RecipeCategory.TOOLS, BCItems.LONSDALEITE_SHIELD.get());
        lonsdaleiteSmithing(BSItems.GILDED_DIAMOND_SHIELD.asItem(), RecipeCategory.TOOLS, BCItems.GILDED_LONSDALEITE_SHIELD.get());
    }
}
