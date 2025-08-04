package net.theelementguy.tegmoremetals.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.trim.TrimMaterial;
import net.minecraft.world.level.block.Block;
import net.theelementguy.tegmoremetals.MoreMetalsMod;
import net.theelementguy.tegmoremetals.block.ModBlocks;
import net.theelementguy.tegmoremetals.item.ModItems;
import net.theelementguy.tegmoremetals.trim.ModTrimMaterials;
import net.theelementguy.tegmoremetals.util.ModUtil;

import java.util.concurrent.CompletableFuture;

public class ModLanguageProviderPirate extends FabricLanguageProvider {

    public ModLanguageProviderPirate(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, "en_pt", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider provider, TranslationBuilder b) {
        b.add(ModItems.CUBIC_ZIRCONIA, "Fake booty");
        addMaterialSet("cubic_zirconia", "fake booty", b);

        b.add(ModItems.RAW_CUBIC_ZIRCONIA, "Rough fake booty");

        b.add(ModItems.TIN_SCRAPS, "Scraps o' tin");

        b.add(ModItems.BRONZE_INGOT, "Bullion o' brass");
        addMaterialSet("bronze", "brass", b);

        b.add(ModItems.RUBIDIUM, "Firestone");
        addMaterialSet("rubidium", "firestone", b);

        b.add(ModItems.STARSHARD, "Shard o' sun");
        addMaterialSet("starshard", "shard o' sun", b);

        b.add(ModItems.BLOODSTONE, "Gorestone");
        addMaterialSet("bloodstone", "gorestone", b);

        b.add(ModBlocks.RAW_CUBIC_ZIRCONIA_BLOCK, "Chunk o' rough fake booty");
        b.add(ModBlocks.TIN_BLOCK, "Chunk o' tin");

        b.add(ModBlocks.TIN_ORE, "Orrre o' tin");
        b.add(ModBlocks.DEEPSLATE_TIN_ORE, "Tough orre o' tin");

        b.add(ModBlocks.RAW_CUBIC_ZIRCONIA_BLOCK.asItem(), "Chunk o' rough fake booty");
        b.add(ModBlocks.TIN_BLOCK.asItem(), "Chunk o' tin");

        b.add(ModBlocks.TIN_ORE.asItem(), "Orrre o' tin");
        b.add(ModBlocks.DEEPSLATE_TIN_ORE.asItem(), "Tough orre o' tin");

        addTrimMaterial(ModTrimMaterials.CUBIC_ZIRCONIA, "fake booty", b);
        addTrimMaterial(ModTrimMaterials.TIN, "tin", b);
        addTrimMaterial(ModTrimMaterials.BRONZE, "brass", b);
        addTrimMaterial(ModTrimMaterials.RUBIDIUM, "firestone", b);
        addTrimMaterial(ModTrimMaterials.STARSHARD, "shard o' sun", b);
        addTrimMaterial(ModTrimMaterials.BLOODSTONE, "gorestone", b);
    }

    protected void addTrimMaterial(ResourceKey<TrimMaterial> key, String name, TranslationBuilder b) {
        b.add("trim_material." + MoreMetalsMod.MOD_ID + "." + key.location().getPath(), "Material o' " + name);
    }

    protected void addToolSet(Item sword, Item axe, Item pickaxe, Item shovel, Item hoe, Item helmet, Item chestplate, Item leggings, Item boots, String groupName, TranslationBuilder b) {
        System.out.println("Adding tool set");
        b.add(sword, "Cutlass o' " + groupName);
        b.add(axe, "Hatchet o' " + groupName);
        b.add(pickaxe, "Pickaxe o' " + groupName);
        b.add(shovel, "Spade o' " + groupName);
        b.add(hoe, "Farmin' stick o' " + groupName);
        b.add(helmet, "Helmet o' " + groupName);
        b.add(chestplate, "Chestplate o' " + groupName);
        b.add(leggings, "Greaves o' " + groupName);
        b.add(boots, "Peg-leg o' " + groupName);
    }

    protected void addToolSet(String group, String groupName, TranslationBuilder b) {
        System.out.println(ModUtil.getItemFromKey(group + "_boots") + " lol");
        addToolSet(ModUtil.getItemFromKey(group + "_sword"), ModUtil.getItemFromKey(group + "_axe"), ModUtil.getItemFromKey(group + "_pickaxe"), ModUtil.getItemFromKey(group + "_shovel"), ModUtil.getItemFromKey(group + "_hoe"), ModUtil.getItemFromKey(group + "_helmet"), ModUtil.getItemFromKey(group + "_chestplate"), ModUtil.getItemFromKey(group + "_leggings"), ModUtil.getItemFromKey(group + "_boots"), groupName, b);
    }

    protected void addMaterialSet(String group, String groupName, TranslationBuilder b) {
        addToolSet(group, groupName, b);
        b.add(BuiltInRegistries.BLOCK.get(ModUtil.createBlockResourceKey(group + "_block")).get().value().asItem(), "Chunk o' "+ groupName);
        b.add(BuiltInRegistries.BLOCK.get(ModUtil.createBlockResourceKey(group + "_block")).get().value(), "Chunk o' "+ groupName);
        addOptionalOre(group, groupName, b);
        addOptionalDeepslateOre(group, groupName, b);
        addOptionalNetherOre(group, groupName, b);
        addOptionalEndOre(group, groupName, b);
    }

    protected void addOptionalOre(String group, String groupName, TranslationBuilder b) {
        if (BuiltInRegistries.BLOCK.get(ModUtil.createBlockResourceKey(group + "_ore")).isPresent()) {
            b.add(ModUtil.getBlockFromKey(group + "_ore").asItem(), "Orrre o' " + groupName);
            b.add(ModUtil.getBlockFromKey(group + "_ore"), "Orrre o' " + groupName);
        }
    }

    protected void addOptionalDeepslateOre(String group, String groupName, TranslationBuilder b) {
        if (BuiltInRegistries.BLOCK.get(ModUtil.createBlockResourceKey("deepslate_" + group + "_ore")).isPresent()) {
            b.add(ModUtil.getBlockFromKey("deepslate_" + group + "_ore").asItem(), "Tough orrre o' " + groupName);
            b.add(ModUtil.getBlockFromKey("deepslate_" + group + "_ore"), "Tough orrre o' " + groupName);
        }
    }

    protected void addOptionalNetherOre(String group, String groupName, TranslationBuilder b) {
        if (BuiltInRegistries.BLOCK.get(ModUtil.createBlockResourceKey("nether_" + group + "_ore")).isPresent()) {
            b.add(ModUtil.getBlockFromKey("nether_" + group + "_ore").asItem(), "Orrre o' " + groupName);
            b.add(ModUtil.getBlockFromKey("nether_" + group + "_ore"), "Orrre o' " + groupName);
        }
    }

    protected void addOptionalEndOre(String group, String groupName, TranslationBuilder b) {
        if (BuiltInRegistries.BLOCK.get(ModUtil.createBlockResourceKey("end_" + group + "_ore")).isPresent()) {
            b.add(ModUtil.getBlockFromKey("end_" + group + "_ore").asItem(), "Orrre o' " + groupName);
            b.add(ModUtil.getBlockFromKey("end_" + group + "_ore"), "Orrre o' " + groupName);
        }
    }
}