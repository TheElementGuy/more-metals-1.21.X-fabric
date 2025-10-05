package net.theelementguy.tegmoremetals.util;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;
import net.theelementguy.tegmoremetals.MoreMetalsMod;

public class ModTags {

    public static class Blocks {

        public static final TagKey<Block> NEEDS_CUBIC_ZIRCONIA_TOOL = createTag("needs_cubic_zirconia");

        public static final TagKey<Block> INCORRECT_FOR_CUBIC_ZIRCONIA_TOOL = createTag("incorrect_for_cubic_zirconia_tool");

        public static final TagKey<Block> NEEDS_RUBIDIUM_TOOL = createTag("needs_rubidium");

        public static final TagKey<Block> INCORRECT_FOR_RUBIDIUM_TOOL = createTag("incorrect_for_rubidium_tool");

        public static final TagKey<Block> NEEDS_STARSHARD_TOOL = createTag("needs_starshard");

        public static final TagKey<Block> INCORRECT_FOR_STARSHARD_TOOL = createTag("incorrect_for_starshard_tool");

        public static final TagKey<Block> NEEDS_BLOODSTONE_TOOL = createTag("needs_bloodstone");

        public static final TagKey<Block> INCORRECT_FOR_BLOODSTONE_TOOL = createTag("incorrect_for_bloodstone_tool");

        public static final TagKey<Block> NEEDS_NETHERITE_TOOL = TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath("fabric", "needs_tool_level_4"));

        private static TagKey<Block> createTag(String name) {
            return TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, name));
        }

    }

    public static class Items {

        public static final TagKey<Item> CUBIC_ZIRCONIA_REPAIRABLES = createTag("cubic_zirconia_replaceables");
        public static final TagKey<Item> RUBIDIUM_REPAIRABLES = createTag("rubidium_replaceables");
        public static final TagKey<Item> STARSHARD_REPAIRABLES = createTag("starshard_replceables");

        public static final TagKey<Item> BLOODSTONE_REPAIRABLES = createTag("bloodstone_repairables");

        private static TagKey<Item> createTag(String name) {
            return TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, name));
        }

    }

    public static class Biomes {

        public static final TagKey<Biome> IS_END_AND_NOT_MAIN_ISLAND = createTag("is_end_and_not_main_island");

        private static TagKey<Biome> createTag(String name) {
            return TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, name));
        }

    }

}