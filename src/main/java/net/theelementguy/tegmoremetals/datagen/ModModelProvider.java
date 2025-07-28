package net.theelementguy.tegmoremetals.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.color.item.Dye;
import net.minecraft.client.color.item.ItemTintSource;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.*;
import net.minecraft.client.renderer.item.ItemModel;
import net.minecraft.client.renderer.item.SelectItemModel;
import net.minecraft.client.renderer.item.properties.select.TrimMaterialProperty;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.item.equipment.EquipmentAssets;
import net.minecraft.world.item.equipment.trim.MaterialAssetGroup;
import net.minecraft.world.item.equipment.trim.TrimMaterial;
import net.minecraft.world.item.equipment.trim.TrimMaterials;
import net.theelementguy.tegmoremetals.block.ModBlocks;
import net.theelementguy.tegmoremetals.item.ModEquipmentAssets;
import net.theelementguy.tegmoremetals.item.ModItems;
import net.theelementguy.tegmoremetals.trim.ModTrimMaterials;

import java.util.ArrayList;
import java.util.List;

import static net.minecraft.client.data.models.ItemModelGenerators.*;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    public static final List<ItemModelGenerators.TrimMaterialData> TRIM_MATERIAL_MODELS = List.of(
            new ItemModelGenerators.TrimMaterialData(MaterialAssetGroup.QUARTZ, TrimMaterials.QUARTZ),
            new ItemModelGenerators.TrimMaterialData(MaterialAssetGroup.IRON, TrimMaterials.IRON),
            new ItemModelGenerators.TrimMaterialData(MaterialAssetGroup.NETHERITE, TrimMaterials.NETHERITE),
            new ItemModelGenerators.TrimMaterialData(MaterialAssetGroup.REDSTONE, TrimMaterials.REDSTONE),
            new ItemModelGenerators.TrimMaterialData(MaterialAssetGroup.COPPER, TrimMaterials.COPPER),
            new ItemModelGenerators.TrimMaterialData(MaterialAssetGroup.GOLD, TrimMaterials.GOLD),
            new ItemModelGenerators.TrimMaterialData(MaterialAssetGroup.EMERALD, TrimMaterials.EMERALD),
            new ItemModelGenerators.TrimMaterialData(MaterialAssetGroup.DIAMOND, TrimMaterials.DIAMOND),
            new ItemModelGenerators.TrimMaterialData(MaterialAssetGroup.LAPIS, TrimMaterials.LAPIS),
            new ItemModelGenerators.TrimMaterialData(MaterialAssetGroup.AMETHYST, TrimMaterials.AMETHYST),
            new ItemModelGenerators.TrimMaterialData(MaterialAssetGroup.RESIN, TrimMaterials.RESIN),
            new ItemModelGenerators.TrimMaterialData(ModTrimMaterials.CUBIC_ZIRCONIA_ASSET_GROUP, ModTrimMaterials.CUBIC_ZIRCONIA),
            new ItemModelGenerators.TrimMaterialData(ModTrimMaterials.BRONZE_ASSET_GROUP, ModTrimMaterials.BRONZE),
            new ItemModelGenerators.TrimMaterialData(ModTrimMaterials.TIN_ASSET_GROUP, ModTrimMaterials.TIN),
            new ItemModelGenerators.TrimMaterialData(ModTrimMaterials.STARSHARD_ASSET_GROUP, ModTrimMaterials.STARSHARD),
            new ItemModelGenerators.TrimMaterialData(ModTrimMaterials.RUBIDIUM_ASSET_GROUP, ModTrimMaterials.RUBIDIUM),
            new ItemModelGenerators.TrimMaterialData(ModTrimMaterials.BLOODSTONE_ASSET_GROUP, ModTrimMaterials.BLOODSTONE)
    );

    @Override
    public void generateBlockStateModels(net.minecraft.client.data.models.BlockModelGenerators blockModels) {
        blockModels.createTrivialCube(ModBlocks.CUBIC_ZIRCONIA_BLOCK);
        blockModels.createTrivialCube(ModBlocks.RAW_CUBIC_ZIRCONIA_BLOCK);
        blockModels.createTrivialCube(ModBlocks.CUBIC_ZIRCONIA_ORE);
        blockModels.createTrivialCube(ModBlocks.DEEPSLATE_CUBIC_ZIRCONIA_ORE);
        blockModels.createTrivialCube(ModBlocks.TIN_BLOCK);
        blockModels.createTrivialCube(ModBlocks.TIN_ORE);
        blockModels.createTrivialCube(ModBlocks.DEEPSLATE_TIN_ORE);
        blockModels.createTrivialCube(ModBlocks.RUBIDIUM_BLOCK);
        blockModels.createTrivialCube(ModBlocks.NETHER_RUBIDIUM_ORE);
        blockModels.createColoredBlockWithStateRotations(TexturedModel.GLAZED_TERRACOTTA, ModBlocks.STARSHARD_BLOCK);
        blockModels.createTrivialCube(ModBlocks.END_STARSHARD_ORE);
        blockModels.createTrivialCube(ModBlocks.BRONZE_BLOCK);
        blockModels.createTrivialCube(ModBlocks.BLOODSTONE_BLOCK);
        blockModels.createTrivialCube(ModBlocks.BLOODSTONE_ORE);
        blockModels.createTrivialCube(ModBlocks.DEEPSLATE_BLOODSTONE_ORE);
    }

    @Override
    public void generateItemModels(net.minecraft.client.data.models.ItemModelGenerators itemModels) {
        itemModels.generateFlatItem(ModItems.CUBIC_ZIRCONIA, ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RAW_CUBIC_ZIRCONIA, ModelTemplates.FLAT_ITEM);
        //itemModels.generateFlatItem(ModItems.CELESTIAL_BRONZE_INGOT, ModelTemplates.FLAT_ITEM);
        //itemModels.generateFlatItem(ModItems.RAW_CELESTIAL_BRONZE, ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.TIN_SCRAPS, ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RUBIDIUM, ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.STARSHARD, ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.BRONZE_INGOT, ModelTemplates.FLAT_ITEM);
        normal(ModItems.BLOODSTONE, itemModels);

        itemModels.generateFlatItem(ModItems.CUBIC_ZIRCONIA_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.CUBIC_ZIRCONIA_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.CUBIC_ZIRCONIA_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.CUBIC_ZIRCONIA_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.CUBIC_ZIRCONIA_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.RUBIDIUM_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.RUBIDIUM_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.RUBIDIUM_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.RUBIDIUM_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.RUBIDIUM_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.STARSHARD_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.STARSHARD_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.STARSHARD_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.STARSHARD_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.STARSHARD_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.BRONZE_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.BRONZE_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.BRONZE_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.BRONZE_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.BRONZE_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.BLOODSTONE_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.BLOODSTONE_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.BLOODSTONE_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.BLOODSTONE_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.BLOODSTONE_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);

        generateTrimmableItemWithModdedMaterials(itemModels, ModItems.CUBIC_ZIRCONIA_HELMET, ModEquipmentAssets.CUBIC_ZIRCONIA, false);
        generateTrimmableItemWithModdedMaterials(itemModels, ModItems.CUBIC_ZIRCONIA_CHESTPLATE, ModEquipmentAssets.CUBIC_ZIRCONIA, false);
        generateTrimmableItemWithModdedMaterials(itemModels, ModItems.CUBIC_ZIRCONIA_LEGGINGS, ModEquipmentAssets.CUBIC_ZIRCONIA, false);
        generateTrimmableItemWithModdedMaterials(itemModels, ModItems.CUBIC_ZIRCONIA_BOOTS, ModEquipmentAssets.CUBIC_ZIRCONIA, false);
        generateTrimmableItemWithModdedMaterials(itemModels, ModItems.RUBIDIUM_HELMET, ModEquipmentAssets.RUBIDIUM, false);
        generateTrimmableItemWithModdedMaterials(itemModels, ModItems.RUBIDIUM_CHESTPLATE, ModEquipmentAssets.RUBIDIUM, false);
        generateTrimmableItemWithModdedMaterials(itemModels, ModItems.RUBIDIUM_LEGGINGS, ModEquipmentAssets.RUBIDIUM, false);
        generateTrimmableItemWithModdedMaterials(itemModels, ModItems.RUBIDIUM_BOOTS, ModEquipmentAssets.RUBIDIUM, false);
        generateTrimmableItemWithModdedMaterials(itemModels, ModItems.STARSHARD_HELMET, ModEquipmentAssets.STARSHARD, false);
        generateTrimmableItemWithModdedMaterials(itemModels, ModItems.STARSHARD_CHESTPLATE, ModEquipmentAssets.STARSHARD, false);
        generateTrimmableItemWithModdedMaterials(itemModels, ModItems.STARSHARD_LEGGINGS, ModEquipmentAssets.STARSHARD, false);
        generateTrimmableItemWithModdedMaterials(itemModels, ModItems.STARSHARD_BOOTS, ModEquipmentAssets.STARSHARD, false);
        generateTrimmableItemWithModdedMaterials(itemModels, ModItems.BRONZE_HELMET, ModEquipmentAssets.BRONZE, false);
        generateTrimmableItemWithModdedMaterials(itemModels, ModItems.BRONZE_CHESTPLATE, ModEquipmentAssets.BRONZE, false);
        generateTrimmableItemWithModdedMaterials(itemModels, ModItems.BRONZE_LEGGINGS, ModEquipmentAssets.BRONZE, false);
        generateTrimmableItemWithModdedMaterials(itemModels, ModItems.BRONZE_BOOTS, ModEquipmentAssets.BRONZE, false);
        generateTrimmableItemWithModdedMaterials(itemModels, ModItems.BLOODSTONE_HELMET, ModEquipmentAssets.BLOODSTONE, false);
        generateTrimmableItemWithModdedMaterials(itemModels, ModItems.BLOODSTONE_CHESTPLATE, ModEquipmentAssets.BLOODSTONE, false);
        generateTrimmableItemWithModdedMaterials(itemModels, ModItems.BLOODSTONE_LEGGINGS, ModEquipmentAssets.BLOODSTONE, false);
        generateTrimmableItemWithModdedMaterials(itemModels, ModItems.BLOODSTONE_BOOTS, ModEquipmentAssets.BLOODSTONE, false);

        generateTrimmableItemWithModdedMaterials(itemModels, Items.LEATHER_HELMET, EquipmentAssets.LEATHER, true);
        generateTrimmableItemWithModdedMaterials(itemModels, Items.LEATHER_CHESTPLATE, EquipmentAssets.LEATHER, true);
        generateTrimmableItemWithModdedMaterials(itemModels, Items.LEATHER_LEGGINGS, EquipmentAssets.LEATHER, true);
        generateTrimmableItemWithModdedMaterials(itemModels, Items.LEATHER_BOOTS, EquipmentAssets.LEATHER, true);


        generateTrimmableItemWithModdedMaterials(itemModels, Items.CHAINMAIL_HELMET, EquipmentAssets.CHAINMAIL, false);
        generateTrimmableItemWithModdedMaterials(itemModels, Items.CHAINMAIL_CHESTPLATE, EquipmentAssets.CHAINMAIL, false);
        generateTrimmableItemWithModdedMaterials(itemModels, Items.CHAINMAIL_LEGGINGS, EquipmentAssets.CHAINMAIL, false);
        generateTrimmableItemWithModdedMaterials(itemModels, Items.CHAINMAIL_BOOTS, EquipmentAssets.CHAINMAIL, false);


        generateTrimmableItemWithModdedMaterials(itemModels, Items.IRON_HELMET, EquipmentAssets.IRON, false);
        generateTrimmableItemWithModdedMaterials(itemModels, Items.IRON_CHESTPLATE, EquipmentAssets.IRON, false);
        generateTrimmableItemWithModdedMaterials(itemModels, Items.IRON_LEGGINGS, EquipmentAssets.IRON, false);
        generateTrimmableItemWithModdedMaterials(itemModels, Items.IRON_BOOTS, EquipmentAssets.IRON, false);


        generateTrimmableItemWithModdedMaterials(itemModels, Items.DIAMOND_HELMET, EquipmentAssets.DIAMOND, false);
        generateTrimmableItemWithModdedMaterials(itemModels, Items.DIAMOND_CHESTPLATE, EquipmentAssets.DIAMOND, false);
        generateTrimmableItemWithModdedMaterials(itemModels, Items.DIAMOND_LEGGINGS, EquipmentAssets.DIAMOND, false);
        generateTrimmableItemWithModdedMaterials(itemModels, Items.DIAMOND_BOOTS, EquipmentAssets.DIAMOND, false);
        generateTrimmableItemWithModdedMaterials(itemModels, Items.GOLDEN_HELMET, EquipmentAssets.GOLD, false);
        generateTrimmableItemWithModdedMaterials(itemModels, Items.GOLDEN_CHESTPLATE, EquipmentAssets.GOLD, false);
        generateTrimmableItemWithModdedMaterials(itemModels, Items.GOLDEN_LEGGINGS, EquipmentAssets.GOLD, false);
        generateTrimmableItemWithModdedMaterials(itemModels, Items.GOLDEN_BOOTS, EquipmentAssets.GOLD, false);
        generateTrimmableItemWithModdedMaterials(itemModels, Items.NETHERITE_HELMET, EquipmentAssets.NETHERITE, false);
        generateTrimmableItemWithModdedMaterials(itemModels, Items.NETHERITE_CHESTPLATE, EquipmentAssets.NETHERITE, false);
        generateTrimmableItemWithModdedMaterials(itemModels, Items.NETHERITE_LEGGINGS, EquipmentAssets.NETHERITE, false);
        generateTrimmableItemWithModdedMaterials(itemModels, Items.NETHERITE_BOOTS, EquipmentAssets.NETHERITE, false);

        generateTrimmableItemWithModdedMaterials(itemModels, Items.TURTLE_HELMET, EquipmentAssets.TURTLE_SCUTE, false);
    }

    public static void normal(Item item, ItemModelGenerators img) {
        img.generateFlatItem(item, ModelTemplates.FLAT_ITEM);
    }

    public void generateTrimmableItemWithModdedMaterials(ItemModelGenerators itemModels, Item item, ResourceKey<EquipmentAsset> equipmentAsset, boolean usesSecondLayer) {
        ResourceLocation resourcelocation = ModelLocationUtils.getModelLocation(item);
        ResourceLocation resourcelocation1 = TextureMapping.getItemTexture(item);
        ResourceLocation resourcelocation2 = TextureMapping.getItemTexture(item, "_overlay");
        List<SelectItemModel.SwitchCase<ResourceKey<TrimMaterial>>> list = new ArrayList(TRIM_MATERIAL_MODELS.size());

        for(ItemModelGenerators.TrimMaterialData itemmodelgenerators$trimmaterialdata : TRIM_MATERIAL_MODELS) {
            ResourceLocation resourcelocation3 = resourcelocation.withSuffix("_" + itemmodelgenerators$trimmaterialdata.assets().base().suffix() + "_trim");
            String var10001 = itemmodelgenerators$trimmaterialdata.assets().assetId(equipmentAsset).suffix();
            String path = item.getDescriptionId();
            ResourceLocation modelId = (path.contains("helmet")) ? TRIM_PREFIX_HELMET : ((path.contains("chestplate")) ? TRIM_PREFIX_CHESTPLATE : ((path.contains("leggings")) ? TRIM_PREFIX_LEGGINGS : ItemModelGenerators.TRIM_PREFIX_BOOTS));
            System.out.println(path);
            ResourceLocation resourcelocation4 = modelId.withSuffix("_" + var10001);
            ItemModel.Unbaked itemmodel$unbaked;
            if (usesSecondLayer) {
                itemModels.generateLayeredItem(resourcelocation3, resourcelocation1, resourcelocation2, resourcelocation4);
                itemmodel$unbaked = ItemModelUtils.tintedModel(resourcelocation3, new ItemTintSource[]{new Dye(-6265536)});
            } else {
                itemModels.generateLayeredItem(resourcelocation3, resourcelocation1, resourcelocation4);
                itemmodel$unbaked = ItemModelUtils.plainModel(resourcelocation3);
            }

            list.add(ItemModelUtils.when(itemmodelgenerators$trimmaterialdata.materialKey(), itemmodel$unbaked));
        }

        ItemModel.Unbaked itemmodel$unbaked1;
        if (usesSecondLayer) {
            ModelTemplates.TWO_LAYERED_ITEM.create(resourcelocation, TextureMapping.layered(resourcelocation1, resourcelocation2), itemModels.modelOutput);
            itemmodel$unbaked1 = ItemModelUtils.tintedModel(resourcelocation, new ItemTintSource[]{new Dye(-6265536)});
        } else {
            ModelTemplates.FLAT_ITEM.create(resourcelocation, TextureMapping.layer0(resourcelocation1), itemModels.modelOutput);
            itemmodel$unbaked1 = ItemModelUtils.plainModel(resourcelocation);
        }

        itemModels.itemModelOutput.accept(item, ItemModelUtils.select(new TrimMaterialProperty(), itemmodel$unbaked1, list));
    }
}