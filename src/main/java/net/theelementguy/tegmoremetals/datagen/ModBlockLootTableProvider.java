package net.theelementguy.tegmoremetals.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.theelementguy.tegmoremetals.MoreMetalsMod;
import net.theelementguy.tegmoremetals.block.ModBlocks;
import net.theelementguy.tegmoremetals.item.ModItems;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class ModBlockLootTableProvider extends FabricBlockLootTableProvider {

    public ModBlockLootTableProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> providir) {
        super(output, providir);
    }

    @Override
    public void generate() {

        dropSelf(ModBlocks.CUBIC_ZIRCONIA_BLOCK);
        dropSelf(ModBlocks.RAW_CUBIC_ZIRCONIA_BLOCK);
        dropSelf(ModBlocks.TIN_BLOCK);
        dropSelf(ModBlocks.RUBIDIUM_BLOCK);
        dropSelf(ModBlocks.STARSHARD_BLOCK);
        dropSelf(ModBlocks.BRONZE_BLOCK);
        dropSelf(ModBlocks.BLOODSTONE_BLOCK);

        add(ModBlocks.CUBIC_ZIRCONIA_ORE, block -> createOreDrop(ModBlocks.CUBIC_ZIRCONIA_ORE, ModItems.RAW_CUBIC_ZIRCONIA));
        add(ModBlocks.DEEPSLATE_CUBIC_ZIRCONIA_ORE, block -> createOreDrop(ModBlocks.DEEPSLATE_CUBIC_ZIRCONIA_ORE, ModItems.RAW_CUBIC_ZIRCONIA));

        add(ModBlocks.TIN_ORE, block -> createMultipleOreDrops(ModBlocks.TIN_ORE, ModItems.TIN_SCRAPS, 2.0f, 5.0f));
        add(ModBlocks.DEEPSLATE_TIN_ORE, block -> createMultipleOreDrops(ModBlocks.DEEPSLATE_TIN_ORE, ModItems.TIN_SCRAPS, 2.0f, 5.0f));

        add(ModBlocks.NETHER_RUBIDIUM_ORE, block -> createOreDrop(ModBlocks.NETHER_RUBIDIUM_ORE, ModItems.RUBIDIUM));

        add(ModBlocks.END_STARSHARD_ORE, block -> createOreDrop(ModBlocks.END_STARSHARD_ORE, ModItems.STARSHARD));

        add(ModBlocks.BLOODSTONE_ORE, block -> createOreDrop(ModBlocks.BLOODSTONE_ORE, ModItems.BLOODSTONE));
        add(ModBlocks.DEEPSLATE_BLOODSTONE_ORE, block -> createOreDrop(ModBlocks.DEEPSLATE_BLOODSTONE_ORE, ModItems.BLOODSTONE));

    }

    protected LootTable.Builder createMultipleOreDrops(Block pBlock, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(pBlock, this.applyExplosionDecay(pBlock, LootItem.lootTableItem(item).apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops))).apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))));
    }
}