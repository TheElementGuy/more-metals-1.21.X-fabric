package net.theelementguy.tegmoremetals.util;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.level.block.Block;
import net.theelementguy.tegmoremetals.MoreMetalsMod;

import java.util.ArrayList;

public class ModUtil {

    public static ResourceKey<Item> createItemResourceKey(String name) {
        return ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, name));
    }

    public static ResourceKey<Block> createBlockResourceKey(String name) {
        return ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, name));
    }

    public static ResourceKey<Recipe<?>> createRecipeResourceKey(String name) {
        return ResourceKey.create(Registries.RECIPE, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, name));
    }

    public static ResourceKey<EquipmentAsset> createEquipmentAssetResourceKey(String name) {
        return ResourceKey.create(ResourceKey.createRegistryKey(ResourceLocation.fromNamespaceAndPath("minecraft", "equipment_asset")), ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, name));
    }

    /*public static void inventoryAddAfter(Item item, Item referenceItem, BuildCreativeModeTabContentsEvent event) {
        event.insertAfter(new ItemStack(referenceItem, 1), new ItemStack(item, 1), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
    }

    public static void inventoryAddAfter(DeferredItem<? extends Item> item, Item referenceItem, BuildCreativeModeTabContentsEvent event) {
        event.insertAfter(new ItemStack(referenceItem, 1), new ItemStack(item.get(), 1), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
    }

    public static void inventoryAddAfter(DeferredItem<? extends Item> item, DeferredItem<? extends Item> referenceItem, BuildCreativeModeTabContentsEvent event) {
        event.insertAfter(new ItemStack(referenceItem.get(), 1), new ItemStack(item.get(), 1), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
    }

    public static void inventoryAddAfter(Block item, Block referenceItem, BuildCreativeModeTabContentsEvent event) {
        event.insertAfter(new ItemStack(referenceItem, 1), new ItemStack(item, 1), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
    }

    public static void inventoryAddAfter(DeferredBlock<? extends Block> item, Block referenceItem, BuildCreativeModeTabContentsEvent event) {
        event.insertAfter(new ItemStack(referenceItem, 1), new ItemStack(item, 1), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
    }

    public static void inventoryAddAfter(DeferredBlock<? extends Block> item, DeferredBlock<? extends Block> referenceItem, BuildCreativeModeTabContentsEvent event) {
        event.insertAfter(new ItemStack(referenceItem, 1), new ItemStack(item, 1), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
    }*/

    public static Item getItemFromKey(String key) {

        return BuiltInRegistries.ITEM.get(ModUtil.createItemResourceKey(key)).get().value();
    }

    public static Block getBlockFromKey(String key) {
        return BuiltInRegistries.BLOCK.get(ModUtil.createBlockResourceKey(key)).get().value();
    }


}