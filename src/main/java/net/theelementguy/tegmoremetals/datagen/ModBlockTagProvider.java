package net.theelementguy.tegmoremetals.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalBlockTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.theelementguy.tegmoremetals.MoreMetalsMod;
import net.theelementguy.tegmoremetals.util.ModTags;
import net.theelementguy.tegmoremetals.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {

    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        valueLookupBuilder(BlockTags.MINEABLE_WITH_PICKAXE).add(ModBlocks.CUBIC_ZIRCONIA_BLOCK).add(ModBlocks.RAW_CUBIC_ZIRCONIA_BLOCK).add(ModBlocks.CUBIC_ZIRCONIA_ORE).add(ModBlocks.DEEPSLATE_CUBIC_ZIRCONIA_ORE).add(ModBlocks.TIN_BLOCK).add(ModBlocks.TIN_ORE).add(ModBlocks.DEEPSLATE_TIN_ORE).add(ModBlocks.RUBIDIUM_BLOCK).add(ModBlocks.STARSHARD_BLOCK).add(ModBlocks.END_STARSHARD_ORE).add(ModBlocks.BRONZE_BLOCK).add(ModBlocks.BLOODSTONE_BLOCK).add(ModBlocks.BLOODSTONE_ORE).add(ModBlocks.DEEPSLATE_BLOODSTONE_ORE);

        valueLookupBuilder(BlockTags.NEEDS_IRON_TOOL).add(ModBlocks.CUBIC_ZIRCONIA_BLOCK).add(ModBlocks.RAW_CUBIC_ZIRCONIA_BLOCK).add(ModBlocks.CUBIC_ZIRCONIA_ORE).add(ModBlocks.DEEPSLATE_CUBIC_ZIRCONIA_ORE).add(ModBlocks.BLOODSTONE_BLOCK).add(ModBlocks.BLOODSTONE_ORE).add(ModBlocks.DEEPSLATE_BLOODSTONE_ORE);

        valueLookupBuilder(BlockTags.NEEDS_STONE_TOOL).add(ModBlocks.TIN_ORE).add(ModBlocks.DEEPSLATE_TIN_ORE);

        valueLookupBuilder(BlockTags.NEEDS_DIAMOND_TOOL).add(ModBlocks.RUBIDIUM_BLOCK).add(ModBlocks.NETHER_RUBIDIUM_ORE).add(ModBlocks.STARSHARD_BLOCK);

        valueLookupBuilder(ModTags.Blocks.NEEDS_NETHERITE_TOOL).add(ModBlocks.END_STARSHARD_ORE);

        valueLookupBuilder(ModTags.Blocks.NEEDS_CUBIC_ZIRCONIA_TOOL).addOptionalTag(BlockTags.NEEDS_IRON_TOOL);

        valueLookupBuilder(ModTags.Blocks.INCORRECT_FOR_CUBIC_ZIRCONIA_TOOL).addOptionalTag(BlockTags.INCORRECT_FOR_IRON_TOOL).addOptionalTag(ModTags.Blocks.NEEDS_NETHERITE_TOOL);

        valueLookupBuilder(ModTags.Blocks.NEEDS_RUBIDIUM_TOOL).addOptionalTag(BlockTags.NEEDS_DIAMOND_TOOL);

        valueLookupBuilder(ModTags.Blocks.INCORRECT_FOR_RUBIDIUM_TOOL).addOptionalTag(BlockTags.INCORRECT_FOR_DIAMOND_TOOL).addOptionalTag(ModTags.Blocks.NEEDS_NETHERITE_TOOL);

        valueLookupBuilder(ModTags.Blocks.NEEDS_STARSHARD_TOOL).addOptionalTag(ModTags.Blocks.NEEDS_NETHERITE_TOOL);

        valueLookupBuilder(ModTags.Blocks.INCORRECT_FOR_STARSHARD_TOOL).addOptionalTag(BlockTags.INCORRECT_FOR_NETHERITE_TOOL);

        valueLookupBuilder(ModTags.Blocks.NEEDS_BRONZE_TOOL).addOptionalTag(BlockTags.NEEDS_IRON_TOOL);

        valueLookupBuilder(ModTags.Blocks.INCORRECT_FOR_BRONZE_TOOL).addOptionalTag(BlockTags.INCORRECT_FOR_IRON_TOOL).addOptionalTag(ModTags.Blocks.NEEDS_NETHERITE_TOOL);

        valueLookupBuilder(ModTags.Blocks.NEEDS_BLOODSTONE_TOOL).addOptionalTag(BlockTags.NEEDS_STONE_TOOL);

        valueLookupBuilder(ModTags.Blocks.INCORRECT_FOR_BLOODSTONE_TOOL).addOptionalTag(BlockTags.INCORRECT_FOR_STONE_TOOL).addOptionalTag(ModTags.Blocks.NEEDS_NETHERITE_TOOL);

        valueLookupBuilder(BlockTags.INCORRECT_FOR_DIAMOND_TOOL).addOptionalTag(ModTags.Blocks.NEEDS_NETHERITE_TOOL);

        valueLookupBuilder(BlockTags.INCORRECT_FOR_IRON_TOOL).addOptionalTag(ModTags.Blocks.NEEDS_NETHERITE_TOOL);

        valueLookupBuilder(BlockTags.INCORRECT_FOR_STONE_TOOL).addOptionalTag(ModTags.Blocks.NEEDS_NETHERITE_TOOL);

        valueLookupBuilder(BlockTags.INCORRECT_FOR_GOLD_TOOL).addOptionalTag(ModTags.Blocks.NEEDS_NETHERITE_TOOL);

        valueLookupBuilder(BlockTags.INCORRECT_FOR_WOODEN_TOOL).addOptionalTag(ModTags.Blocks.NEEDS_NETHERITE_TOOL);

        //Neoforge tags
        valueLookupBuilder(ConventionalBlockTags.ORE_RATES_DENSE).add(ModBlocks.TIN_ORE).add(ModBlocks.DEEPSLATE_TIN_ORE);

        valueLookupBuilder(ConventionalBlockTags.ORE_RATES_SINGULAR).add(ModBlocks.CUBIC_ZIRCONIA_ORE).add(ModBlocks.DEEPSLATE_CUBIC_ZIRCONIA_ORE).add(ModBlocks.NETHER_RUBIDIUM_ORE).add(ModBlocks.END_STARSHARD_ORE).add(ModBlocks.BLOODSTONE_ORE).add(ModBlocks.DEEPSLATE_BLOODSTONE_ORE);

        valueLookupBuilder(ConventionalBlockTags.ORES).add(ModBlocks.TIN_ORE).add(ModBlocks.DEEPSLATE_TIN_ORE).add(ModBlocks.CUBIC_ZIRCONIA_ORE).add(ModBlocks.DEEPSLATE_CUBIC_ZIRCONIA_ORE).add(ModBlocks.NETHER_RUBIDIUM_ORE).add(ModBlocks.END_STARSHARD_ORE).add(ModBlocks.BLOODSTONE_ORE).add(ModBlocks.DEEPSLATE_BLOODSTONE_ORE);

        valueLookupBuilder(ConventionalBlockTags.ORES_IN_GROUND_STONE).add(ModBlocks.TIN_ORE).add(ModBlocks.CUBIC_ZIRCONIA_ORE).add(ModBlocks.BLOODSTONE_ORE);

        valueLookupBuilder(ConventionalBlockTags.ORES_IN_GROUND_DEEPSLATE).add(ModBlocks.DEEPSLATE_TIN_ORE).add(ModBlocks.DEEPSLATE_CUBIC_ZIRCONIA_ORE).add(ModBlocks.DEEPSLATE_BLOODSTONE_ORE);

        valueLookupBuilder(ConventionalBlockTags.ORES_IN_GROUND_NETHERRACK).add(ModBlocks.NETHER_RUBIDIUM_ORE);

        valueLookupBuilder(ConventionalBlockTags.STORAGE_BLOCKS).add(ModBlocks.TIN_BLOCK).add(ModBlocks.CUBIC_ZIRCONIA_BLOCK).add(ModBlocks.RUBIDIUM_BLOCK).add(ModBlocks.STARSHARD_BLOCK).add(ModBlocks.BLOODSTONE_BLOCK);

    }
}