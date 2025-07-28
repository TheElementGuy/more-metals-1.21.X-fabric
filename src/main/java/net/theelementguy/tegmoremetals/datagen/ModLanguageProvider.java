package net.theelementguy.tegmoremetals.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.trim.TrimMaterial;
import net.theelementguy.tegmoremetals.MoreMetalsMod;
import net.theelementguy.tegmoremetals.block.ModBlocks;
import net.theelementguy.tegmoremetals.item.ModItems;
import net.theelementguy.tegmoremetals.trim.ModTrimMaterials;
import net.theelementguy.tegmoremetals.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModLanguageProvider extends FabricLanguageProvider {

    public ModLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider provider, TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.CUBIC_ZIRCONIA, "Cubic Zirconia");
        translationBuilder.add(ModItems.RAW_CUBIC_ZIRCONIA, "Raw Cubic Zirconia");
        translationBuilder.add(ModItems.CUBIC_ZIRCONIA_SWORD, "Cubic Zirconia Sword");
        translationBuilder.add(ModItems.CUBIC_ZIRCONIA_AXE, "Cubic Zirconia Axe");
        translationBuilder.add(ModItems.CUBIC_ZIRCONIA_PICKAXE, "Cubic Zirconia Pickaxe");
        translationBuilder.add(ModItems.CUBIC_ZIRCONIA_SHOVEL, "Cubic Zirconia Shovel");
        translationBuilder.add(ModItems.CUBIC_ZIRCONIA_HOE, "Cubic Zirconia Hoe");
        translationBuilder.add(ModItems.CUBIC_ZIRCONIA_HELMET, "Cubic Zirconia Helmet");
        translationBuilder.add(ModItems.CUBIC_ZIRCONIA_CHESTPLATE, "Cubic Zirconia Chestplate");
        translationBuilder.add(ModItems.CUBIC_ZIRCONIA_LEGGINGS, "Cubic Zirconia Leggings");
        translationBuilder.add(ModItems.CUBIC_ZIRCONIA_BOOTS, "Cubic Zirconia Boots");

        translationBuilder.add(ModItems.TIN_SCRAPS, "Tin Scraps");

        translationBuilder.add(ModItems.BRONZE_INGOT, "Bronze Ingot");
        translationBuilder.add(ModItems.BRONZE_SWORD, "Bronze Sword");
        translationBuilder.add(ModItems.BRONZE_AXE, "Bronze Axe");
        translationBuilder.add(ModItems.BRONZE_PICKAXE, "Bronze Pickaxe");
        translationBuilder.add(ModItems.BRONZE_SHOVEL, "Bronze Shovel");
        translationBuilder.add(ModItems.BRONZE_HOE, "Bronze Hoe");
        translationBuilder.add(ModItems.BRONZE_HELMET, "Bronze Helmet");
        translationBuilder.add(ModItems.BRONZE_CHESTPLATE, "Bronze Chestplate");
        translationBuilder.add(ModItems.BRONZE_LEGGINGS, "Bronze Leggings");
        translationBuilder.add(ModItems.BRONZE_BOOTS, "Bronze Boots");

        translationBuilder.add(ModItems.RUBIDIUM, "Rubidium");
        translationBuilder.add(ModItems.RUBIDIUM_SWORD, "Rubidium Sword");
        translationBuilder.add(ModItems.RUBIDIUM_AXE, "Rubidium Axe");
        translationBuilder.add(ModItems.RUBIDIUM_PICKAXE, "Rubidium Pickaxe");
        translationBuilder.add(ModItems.RUBIDIUM_SHOVEL, "Rubidium Shovel");
        translationBuilder.add(ModItems.RUBIDIUM_HOE, "Rubidium Hoe");
        translationBuilder.add(ModItems.RUBIDIUM_HELMET, "Rubidium Helmet");
        translationBuilder.add(ModItems.RUBIDIUM_CHESTPLATE, "Rubidium Chestplate");
        translationBuilder.add(ModItems.RUBIDIUM_LEGGINGS, "Rubidium Leggings");
        translationBuilder.add(ModItems.RUBIDIUM_BOOTS, "Rubidium Boots");

        translationBuilder.add(ModItems.STARSHARD, "Starshard");
        translationBuilder.add(ModItems.STARSHARD_SWORD, "Starshard Sword");
        translationBuilder.add(ModItems.STARSHARD_AXE, "Starshard Axe");
        translationBuilder.add(ModItems.STARSHARD_PICKAXE, "Starshard Pickaxe");
        translationBuilder.add(ModItems.STARSHARD_SHOVEL, "Starshard Shovel");
        translationBuilder.add(ModItems.STARSHARD_HOE, "Starshard Hoe");
        translationBuilder.add(ModItems.STARSHARD_HELMET, "Starshard Helmet");
        translationBuilder.add(ModItems.STARSHARD_CHESTPLATE, "Starshard Chestplate");
        translationBuilder.add(ModItems.STARSHARD_LEGGINGS, "Starshard Leggings");
        translationBuilder.add(ModItems.STARSHARD_BOOTS, "Starshard Boots");

        translationBuilder.add(ModItems.BLOODSTONE, "Bloodstone");
        addToolSet(ModItems.BLOODSTONE_SWORD, ModItems.BLOODSTONE_AXE, ModItems.BLOODSTONE_PICKAXE, ModItems.BLOODSTONE_SHOVEL, ModItems.BLOODSTONE_HOE, ModItems.BLOODSTONE_HELMET, ModItems.BLOODSTONE_CHESTPLATE, ModItems.BLOODSTONE_LEGGINGS, ModItems.BLOODSTONE_BOOTS, "Bloodstone", translationBuilder);

        translationBuilder.add(ModBlocks.CUBIC_ZIRCONIA_BLOCK, "Block of Cubic Zirconia");
        translationBuilder.add(ModBlocks.RAW_CUBIC_ZIRCONIA_BLOCK, "Block of Raw Cubic Zirconia");
        translationBuilder.add(ModBlocks.TIN_BLOCK, "Block of Tin");
        translationBuilder.add(ModBlocks.BRONZE_BLOCK, "Block of Bronze");
        translationBuilder.add(ModBlocks.RUBIDIUM_BLOCK, "Block of Rubidium");
        translationBuilder.add(ModBlocks.STARSHARD_BLOCK, "Block of Starshard");
        translationBuilder.add(ModBlocks.BLOODSTONE_BLOCK, "Block of Bloodstone");

        translationBuilder.add(ModBlocks.CUBIC_ZIRCONIA_BLOCK.asItem(), "Block of Cubic Zirconia");
        translationBuilder.add(ModBlocks.RAW_CUBIC_ZIRCONIA_BLOCK.asItem(), "Block of Raw Cubic Zirconia");
        translationBuilder.add(ModBlocks.TIN_BLOCK.asItem(), "Block of Tin");
        translationBuilder.add(ModBlocks.BRONZE_BLOCK.asItem(), "Block of Bronze");
        translationBuilder.add(ModBlocks.RUBIDIUM_BLOCK.asItem(), "Block of Rubidium");
        translationBuilder.add(ModBlocks.STARSHARD_BLOCK.asItem(), "Block of Starshard");
        translationBuilder.add(ModBlocks.BLOODSTONE_BLOCK.asItem(), "Block of Bloodstone");

        translationBuilder.add(ModBlocks.CUBIC_ZIRCONIA_ORE, "Cubic Zirconia Ore");
        translationBuilder.add(ModBlocks.DEEPSLATE_CUBIC_ZIRCONIA_ORE, "Deepslate Cubic Zirconia Ore");
        translationBuilder.add(ModBlocks.TIN_ORE, "Tin Ore");
        translationBuilder.add(ModBlocks.DEEPSLATE_TIN_ORE, "Deepslate Tin Ore");
        translationBuilder.add(ModBlocks.BLOODSTONE_ORE, "Bloodstone Ore");
        translationBuilder.add(ModBlocks.DEEPSLATE_BLOODSTONE_ORE, "Deepslate Bloodstone Ore");
        translationBuilder.add(ModBlocks.NETHER_RUBIDIUM_ORE, "Nether Rubidium Ore");
        translationBuilder.add(ModBlocks.END_STARSHARD_ORE, "End Starshard Ore");

        translationBuilder.add(ModBlocks.CUBIC_ZIRCONIA_ORE.asItem(), "Cubic Zirconia Ore");
        translationBuilder.add(ModBlocks.DEEPSLATE_CUBIC_ZIRCONIA_ORE.asItem(), "Deepslate Cubic Zirconia Ore");
        translationBuilder.add(ModBlocks.TIN_ORE.asItem(), "Tin Ore");
        translationBuilder.add(ModBlocks.DEEPSLATE_TIN_ORE.asItem(), "Deepslate Tin Ore");
        translationBuilder.add(ModBlocks.BLOODSTONE_ORE.asItem(), "Bloodstone Ore");
        translationBuilder.add(ModBlocks.DEEPSLATE_BLOODSTONE_ORE.asItem(), "Deepslate Bloodstone Ore");
        translationBuilder.add(ModBlocks.NETHER_RUBIDIUM_ORE.asItem(), "Nether Rubidium Ore");
        translationBuilder.add(ModBlocks.END_STARSHARD_ORE.asItem(), "End Starshard Ore");

        addTrimMaterial(ModTrimMaterials.CUBIC_ZIRCONIA, "Cubic Zirconia", translationBuilder);
        addTrimMaterial(ModTrimMaterials.TIN, "Tin", translationBuilder);
        addTrimMaterial(ModTrimMaterials.BRONZE, "Bronze", translationBuilder);
        addTrimMaterial(ModTrimMaterials.RUBIDIUM, "Rubidium", translationBuilder);
        addTrimMaterial(ModTrimMaterials.STARSHARD, "Starshard", translationBuilder);
        addTrimMaterial(ModTrimMaterials.BLOODSTONE, "Bloodstone", translationBuilder);
    }

    protected void addToolSet(Item sword, Item axe, Item pickaxe, Item shovel, Item hoe, Item helmet, Item chestplate, Item leggings, Item boots, String groupName, TranslationBuilder b) {
        b.add(sword, groupName + " Sword");
        b.add(axe, groupName + " Axe");
        b.add(pickaxe, groupName + " Pickaxe");
        b.add(shovel, groupName + " Shovel");
        b.add(hoe, groupName + " Hoe");
        b.add(helmet, groupName + " Helmet");
        b.add(chestplate, groupName + " Chestplate");
        b.add(leggings, groupName + " Leggings");
        b.add(boots, groupName + " Boots");
    }

    protected void addTrimMaterial(ResourceKey<TrimMaterial> key, String name, TranslationBuilder b) {
        b.add("trim_material." + MoreMetalsMod.MOD_ID + "." + key.location().getPath(), name);
    }
}