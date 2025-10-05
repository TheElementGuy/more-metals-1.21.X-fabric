package net.theelementguy.tegmoremetals.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.theelementguy.tegmoremetals.MoreMetalsMod;
import net.theelementguy.tegmoremetals.block.ModBlocks;
import net.theelementguy.tegmoremetals.item.ModItems;
import net.theelementguy.tegmoremetals.util.ModUtil;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import static net.minecraft.data.recipes.RecipeProvider.getHasName;
import static net.minecraft.data.recipes.RecipeProvider.getItemName;
import static net.minecraft.data.recipes.ShapedRecipeBuilder.shaped;
import static net.minecraft.data.recipes.ShapelessRecipeBuilder.shapeless;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider provider, RecipeOutput recipeOutput) {
        return new RecipeProvider(provider, recipeOutput) {
            @Override
            public void buildRecipes() {
                List<ItemLike> CUBIC_ZIRCONIA_SMELTABLES = List.of(ModItems.RAW_CUBIC_ZIRCONIA, ModBlocks.CUBIC_ZIRCONIA_ORE, ModBlocks.DEEPSLATE_CUBIC_ZIRCONIA_ORE);

                List<ItemLike> CELESTIAL_BRONZE_SMELTABLES = List.of();

                List<ItemLike> RUBIDIUM_SMELTABLES = List.of(ModBlocks.NETHER_RUBIDIUM_ORE);

                List<ItemLike> STARSHARD_SMELTABLES = List.of(ModBlocks.END_STARSHARD_ORE);

                List<ItemLike> BLOODSTONE_SMELTABLES = List.of(ModBlocks.BLOODSTONE_ORE, ModBlocks.DEEPSLATE_BLOODSTONE_ORE);

                blockRecipe(ModItems.CUBIC_ZIRCONIA, ModBlocks.CUBIC_ZIRCONIA_BLOCK.asItem(), this.output, this);

                blockRecipe(ModItems.RAW_CUBIC_ZIRCONIA, ModBlocks.RAW_CUBIC_ZIRCONIA_BLOCK.asItem(), this.output, this);

                blockRecipe(ModItems.RUBIDIUM, ModBlocks.RUBIDIUM_BLOCK.asItem(), this.output, this);

                blockRecipe(ModItems.STARSHARD, ModBlocks.STARSHARD_BLOCK.asItem(), this.output, this);

                blockRecipe(ModItems.BLOODSTONE, ModBlocks.BLOODSTONE_BLOCK.asItem(), this.output, this);

                swordRecipe(ModItems.CUBIC_ZIRCONIA_SWORD, ModItems.CUBIC_ZIRCONIA, "has_cz", this.output, this);

                axeRecipe(ModItems.CUBIC_ZIRCONIA_AXE, ModItems.CUBIC_ZIRCONIA, "has_cz", this.output, this);

                pickaxeRecipe(ModItems.CUBIC_ZIRCONIA_PICKAXE, ModItems.CUBIC_ZIRCONIA, "has_cz", this.output, this);

                shovelRecipe(ModItems.CUBIC_ZIRCONIA_SHOVEL, ModItems.CUBIC_ZIRCONIA, "has_cz", this.output, this);

                hoeRecipe(ModItems.CUBIC_ZIRCONIA_HOE, ModItems.CUBIC_ZIRCONIA, "has_cz", this.output, this);

                helmetRecipe(ModItems.CUBIC_ZIRCONIA_HELMET, ModItems.CUBIC_ZIRCONIA, "has_cz", this.output, this);

                chestplateRecipe(ModItems.CUBIC_ZIRCONIA_CHESTPLATE, ModItems.CUBIC_ZIRCONIA, "has_cz", this.output, this);

                leggingsRecipe(ModItems.CUBIC_ZIRCONIA_LEGGINGS, ModItems.CUBIC_ZIRCONIA, "has_cz", this.output, this);

                bootsRecipe(ModItems.CUBIC_ZIRCONIA_BOOTS, ModItems.CUBIC_ZIRCONIA, "has_cz", this.output, this);

                //Not doing this anymore:
                //swordRecipe(ModItems.CELESTIAL_BRRONZE_SWORD, ModItems.CELESTIAL_BRONZE_INGOT, "has_cb", this);

                swordRecipe(ModItems.RUBIDIUM_SWORD, ModItems.RUBIDIUM, "has_r", this.output, this);

                axeRecipe(ModItems.RUBIDIUM_AXE, ModItems.RUBIDIUM, "has_r", this.output, this);

                pickaxeRecipe(ModItems.RUBIDIUM_PICKAXE, ModItems.RUBIDIUM, "has_r", this.output, this);

                shovelRecipe(ModItems.RUBIDIUM_SHOVEL, ModItems.RUBIDIUM, "has_r", this.output, this);

                hoeRecipe(ModItems.RUBIDIUM_HOE, ModItems.RUBIDIUM, "has_r", this.output, this);

                helmetRecipe(ModItems.RUBIDIUM_HELMET, ModItems.RUBIDIUM, "has_r", this.output, this);

                chestplateRecipe(ModItems.RUBIDIUM_CHESTPLATE, ModItems.RUBIDIUM, "has_r", this.output, this);

                leggingsRecipe(ModItems.RUBIDIUM_LEGGINGS, ModItems.RUBIDIUM, "has_r", this.output, this);

                bootsRecipe(ModItems.RUBIDIUM_BOOTS, ModItems.RUBIDIUM, "has_r", this.output, this);

                swordRecipe(ModItems.STARSHARD_SWORD, ModItems.STARSHARD, "has_s", this.output, this);

                axeRecipe(ModItems.STARSHARD_AXE, ModItems.STARSHARD, "has_s", this.output, this);

                pickaxeRecipe(ModItems.STARSHARD_PICKAXE, ModItems.STARSHARD, "has_s", this.output, this);

                shovelRecipe(ModItems.STARSHARD_SHOVEL, ModItems.STARSHARD, "has_s", this.output, this);

                hoeRecipe(ModItems.STARSHARD_HOE, ModItems.STARSHARD, "has_s", this.output, this);

                helmetRecipe(ModItems.STARSHARD_HELMET, ModItems.STARSHARD, "has_s", this.output, this);

                chestplateRecipe(ModItems.STARSHARD_CHESTPLATE, ModItems.STARSHARD, "has_s", this.output, this);

                leggingsRecipe(ModItems.STARSHARD_LEGGINGS, ModItems.STARSHARD, "has_s", this.output, this);

                bootsRecipe(ModItems.STARSHARD_BOOTS, ModItems.STARSHARD, "has_s", this.output, this);

                allEquipmentRecipes(ModItems.BLOODSTONE_SWORD, ModItems.BLOODSTONE_AXE, ModItems.BLOODSTONE_PICKAXE, ModItems.BLOODSTONE_SHOVEL, ModItems.BLOODSTONE_HOE, ModItems.BLOODSTONE_HELMET, ModItems.BLOODSTONE_CHESTPLATE, ModItems.BLOODSTONE_LEGGINGS, ModItems.BLOODSTONE_BOOTS, ModItems.BLOODSTONE, "has_bl", this.output, this);

                allOreSmelting(ModItems.CUBIC_ZIRCONIA, CUBIC_ZIRCONIA_SMELTABLES, 1.0f, "cz", this);

                allOreSmelting(ModItems.RUBIDIUM, RUBIDIUM_SMELTABLES, 1.3f, "r", this);

                allOreSmelting(ModItems.STARSHARD, STARSHARD_SMELTABLES, 1.5f, "s", this);

                allOreSmelting(ModItems.BLOODSTONE, BLOODSTONE_SMELTABLES, 0.9f, "bl", this);


            }
        };
    }

    @Override
    public String getName() {
        return "More Metals Recipes";
    }

    protected void swordRecipe(Item result, Item ingredient, String advancementName, RecipeOutput output, RecipeProvider p) {
        p.shaped(RecipeCategory.COMBAT, result).pattern(" I ").pattern(" I ").pattern(" S ").define('I', ingredient).define('S', Items.STICK).unlockedBy(advancementName, p.has(ingredient)).save(output);
    }

    protected void axeRecipe(Item result, Item ingredient, String advancementName, RecipeOutput output, RecipeProvider p) {
        p.shaped(RecipeCategory.TOOLS, result).pattern("II ").pattern("IS ").pattern(" S ").define('I', ingredient).define('S', Items.STICK).unlockedBy(advancementName, p.has(ingredient)).save(output);


    }

    protected void pickaxeRecipe(Item result, Item ingredient, String advancementName, RecipeOutput output, RecipeProvider p) {
        p.shaped(RecipeCategory.TOOLS, result).pattern("III").pattern(" S ").pattern(" S ").define('I', ingredient).define('S', Items.STICK).unlockedBy(advancementName, p.has(ingredient)).save(output);
    }

    protected void shovelRecipe(Item result, Item ingredient, String advancementName, RecipeOutput output, RecipeProvider p) {
        p.shaped(RecipeCategory.TOOLS, result).pattern(" I ").pattern(" S ").pattern(" S ").define('I', ingredient).define('S', Items.STICK).unlockedBy(advancementName, p.has(ingredient)).save(output);
    }

    protected void hoeRecipe(Item result, Item ingredient, String advancementName, RecipeOutput output, RecipeProvider p) {
        p.shaped(RecipeCategory.COMBAT, result).pattern("II ").pattern(" S ").pattern(" S ").define('I', ingredient).define('S', Items.STICK).unlockedBy(advancementName, p.has(ingredient)).save(output);
    }

    protected void helmetRecipe(Item result, Item ingredient, String advancementName, RecipeOutput output, RecipeProvider p) {
        p.shaped(RecipeCategory.COMBAT, result).pattern("III").pattern("I I").pattern("   ").define('I', ingredient).unlockedBy(advancementName, p.has(ingredient)).save(output);
    }

    protected void chestplateRecipe(Item result, Item ingredient, String advancementName, RecipeOutput output, RecipeProvider p) {
        p.shaped(RecipeCategory.COMBAT, result).pattern("I I").pattern("III").pattern("III").define('I', ingredient).unlockedBy(advancementName, p.has(ingredient)).save(output);
    }

    protected void leggingsRecipe(Item result, Item ingredient, String advancementName, RecipeOutput output, RecipeProvider p) {
        p.shaped(RecipeCategory.COMBAT, result).pattern("III").pattern("I I").pattern("I I").define('I', ingredient).unlockedBy(advancementName, p.has(ingredient)).save(output);
    }

    protected void bootsRecipe(Item result, Item ingredient, String advancementName, RecipeOutput output, RecipeProvider p) {
        p.shaped(RecipeCategory.COMBAT, result).pattern("   ").pattern("I I").pattern("I I").define('I', ingredient).unlockedBy(advancementName, p.has(ingredient)).save(output);
    }

    protected void blockRecipe(Item material, Item block, RecipeOutput output, RecipeProvider p) {
        p.shapeless(RecipeCategory.MISC, material, 9).requires(block).unlockedBy("has_" + getItemName(material), p.has(block)).save(output);

        p.shapeless(RecipeCategory.MISC, block).requires(material, 9).unlockedBy("has_" + getItemName(material) + "_block", p.has(block)).save(output);
    }

    protected void allOreSmelting(Item material, List<ItemLike> smeltables, float experience, String group, RecipeProvider provider) {
        provider.oreSmelting(smeltables, RecipeCategory.MISC, material, experience, 200, group);
        provider.oreBlasting(smeltables, RecipeCategory.MISC, material, experience, 100, group);
    }

    protected void allEquipmentRecipes(Item sword, Item axe, Item pickaxe, Item shovel, Item hoe, Item helmet, Item chestplate, Item leggings, Item boots, Item material, String advancementNames, RecipeOutput output, RecipeProvider p) {
        swordRecipe(sword, material, advancementNames, output, p);
        axeRecipe(axe, material, advancementNames, output, p);
        pickaxeRecipe(pickaxe, material, advancementNames, output, p);
        shovelRecipe(shovel, material, advancementNames, output, p);
        hoeRecipe(hoe, material, advancementNames, output, p);

        helmetRecipe(helmet, material, advancementNames, output, p);
        chestplateRecipe(chestplate, material, advancementNames, output, p);
        leggingsRecipe(leggings, material, advancementNames, output, p);
        bootsRecipe(boots, material, advancementNames, output, p);
    }
}