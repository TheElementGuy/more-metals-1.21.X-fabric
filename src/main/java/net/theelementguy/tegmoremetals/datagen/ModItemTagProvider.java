package net.theelementguy.tegmoremetals.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.IntrinsicHolderTagsProvider;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.theelementguy.tegmoremetals.item.ModItems;
import net.theelementguy.tegmoremetals.util.ModTags;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> providerCompletableFuture) {
        super(output, providerCompletableFuture);
        //this.blockTagProvider = blockTags;
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {

        valueLookupBuilder(ItemTags.SWORDS).add(ModItems.CUBIC_ZIRCONIA_SWORD).add(ModItems.RUBIDIUM_SWORD).add(ModItems.STARSHARD_SWORD);
        valueLookupBuilder(ItemTags.AXES).add(ModItems.CUBIC_ZIRCONIA_AXE).add(ModItems.RUBIDIUM_AXE).add(ModItems.STARSHARD_AXE).add(ModItems.BLOODSTONE_AXE);
        valueLookupBuilder(ItemTags.PICKAXES).add(ModItems.CUBIC_ZIRCONIA_PICKAXE).add(ModItems.RUBIDIUM_PICKAXE).add(ModItems.STARSHARD_PICKAXE);
        valueLookupBuilder(ItemTags.SHOVELS).add(ModItems.CUBIC_ZIRCONIA_SHOVEL).add(ModItems.RUBIDIUM_SHOVEL).add(ModItems.STARSHARD_SHOVEL);
        valueLookupBuilder(ItemTags.HOES).add(ModItems.CUBIC_ZIRCONIA_HOE).add(ModItems.RUBIDIUM_HOE).add(ModItems.STARSHARD_HOE);
        valueLookupBuilder(ModTags.Items.CUBIC_ZIRCONIA_REPAIRABLES).add(ModItems.CUBIC_ZIRCONIA);
        valueLookupBuilder(ModTags.Items.RUBIDIUM_REPAIRABLES).add(ModItems.RUBIDIUM);
        valueLookupBuilder(ModTags.Items.STARSHARD_REPAIRABLES).add(ModItems.STARSHARD);
        valueLookupBuilder(ModTags.Items.BLOODSTONE_REPAIRABLES).add(ModItems.BLOODSTONE);
        valueLookupBuilder(ItemTags.TRIM_MATERIALS).add(ModItems.CUBIC_ZIRCONIA).add(ModItems.RUBIDIUM).add(ModItems.STARSHARD).add(ModItems.BLOODSTONE);

        valueLookupBuilder(ItemTags.HEAD_ARMOR).add(ModItems.CUBIC_ZIRCONIA_HELMET).add(ModItems.RUBIDIUM_HELMET).add(ModItems.STARSHARD_HELMET).add(ModItems.BLOODSTONE_HELMET);
        valueLookupBuilder(ItemTags.CHEST_ARMOR).add(ModItems.CUBIC_ZIRCONIA_CHESTPLATE).add(ModItems.RUBIDIUM_CHESTPLATE).add(ModItems.STARSHARD_CHESTPLATE).add(ModItems.BLOODSTONE_CHESTPLATE);
        valueLookupBuilder(ItemTags.LEG_ARMOR).add(ModItems.CUBIC_ZIRCONIA_LEGGINGS).add(ModItems.RUBIDIUM_LEGGINGS).add(ModItems.STARSHARD_LEGGINGS).add(ModItems.BLOODSTONE_LEGGINGS);
        valueLookupBuilder(ItemTags.FOOT_ARMOR).add(ModItems.CUBIC_ZIRCONIA_BOOTS).add(ModItems.RUBIDIUM_BOOTS).add(ModItems.STARSHARD_BOOTS).add(ModItems.BLOODSTONE_BOOTS);
        valueLookupBuilder(ItemTags.TRIMMABLE_ARMOR).add(ModItems.CUBIC_ZIRCONIA_HELMET).add(ModItems.RUBIDIUM_LEGGINGS).add(ModItems.STARSHARD_BOOTS);

        //Neoforge tags
        valueLookupBuilder(ConventionalItemTags.GEMS).add(ModItems.CUBIC_ZIRCONIA).add(ModItems.RUBIDIUM).add(ModItems.STARSHARD).add(ModItems.BLOODSTONE);
        //valueLookupBuilder(ConventionalItemTags.INGOTS);
        valueLookupBuilder(ConventionalItemTags.RAW_MATERIALS).add(ModItems.RAW_CUBIC_ZIRCONIA);
        valueLookupBuilder(ConventionalItemTags.MELEE_WEAPON_TOOLS).add(ModItems.CUBIC_ZIRCONIA_SWORD).add(ModItems.RUBIDIUM_SWORD).add(ModItems.STARSHARD_SWORD).add(ModItems.BLOODSTONE_SWORD).add(ModItems.CUBIC_ZIRCONIA_AXE).add(ModItems.RUBIDIUM_AXE).add(ModItems.STARSHARD_AXE).add(ModItems.BLOODSTONE_AXE);
        valueLookupBuilder(ConventionalItemTags.MINING_TOOL_TOOLS).add(ModItems.CUBIC_ZIRCONIA_PICKAXE).add(ModItems.RUBIDIUM_PICKAXE).add(ModItems.STARSHARD_PICKAXE);
    }
}