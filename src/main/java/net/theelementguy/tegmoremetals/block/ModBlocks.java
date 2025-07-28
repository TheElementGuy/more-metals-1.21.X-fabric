package net.theelementguy.tegmoremetals.block;

import com.mojang.datafixers.types.Func;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.theelementguy.tegmoremetals.MoreMetalsMod;
import net.theelementguy.tegmoremetals.block.custom.ModHorizontalRotationBlock;
import net.theelementguy.tegmoremetals.item.ModItems;
import net.theelementguy.tegmoremetals.util.ModUtil;
import java.util.function.Function;
import java.util.function.Supplier;

public class ModBlocks {

    public static final Block CUBIC_ZIRCONIA_BLOCK = registerBlockWithItem("cubic_zirconia_block", (props) -> new Block(props.destroyTime(5f).explosionResistance(6f).mapColor(MapColor.COLOR_PINK).instrument(NoteBlockInstrument.XYLOPHONE).sound(SoundType.METAL).setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "cubic_zirconia_block")))), new Item.Properties().fireResistant().setId(ModUtil.createItemResourceKey("cubic_zirconia_block")));

    public static final Block RAW_CUBIC_ZIRCONIA_BLOCK = registerBlockWithItem("raw_cubic_zirconia_block", (props) -> new Block(props.destroyTime(3f).explosionResistance(6f).mapColor(MapColor.STONE).instrument(NoteBlockInstrument.XYLOPHONE).sound(SoundType.STONE).setId(ModUtil.createBlockResourceKey("raw_cubic_zirconia_block"))), null);

    public static final Block CUBIC_ZIRCONIA_ORE = registerBlockWithItem("cubic_zirconia_ore", (props) -> new Block(props.destroyTime(3f).mapColor((MapColor.STONE)).explosionResistance(3f).sound(SoundType.STONE).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.XYLOPHONE).setId(ModUtil.createBlockResourceKey("cubic_zirconia_ore")).setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "cubic_zirconia_ore")))), null);

    public static final Block DEEPSLATE_CUBIC_ZIRCONIA_ORE = registerBlockWithItem("deepslate_cubic_zirconia_ore", (props) -> new Block(props.destroyTime(4.5f).mapColor((MapColor.DEEPSLATE)).explosionResistance(3f).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "deepslate_cubic_zirconia_ore")))), null);

    public static final Block TIN_BLOCK = registerBlockWithItem("tin_block", (props) -> new Block(props.destroyTime(5f).mapColor(MapColor.RAW_IRON).explosionResistance(6f).sound(SoundType.METAL).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "tin_block")))), null);

    public static final Block TIN_ORE = registerBlockWithItem("tin_ore", (props) -> new Block(props.destroyTime(3f).mapColor(MapColor.STONE).explosionResistance(3f).sound(SoundType.STONE).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "tin_ore")))), null);

    public static final Block DEEPSLATE_TIN_ORE = registerBlockWithItem("deepslate_tin_ore", (props) -> new Block(props.destroyTime(4.5f).mapColor(MapColor.DEEPSLATE).explosionResistance(3f).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "deepslate_tin_ore")))), null);

    public static final Block RUBIDIUM_BLOCK = registerBlockWithItem("rubidium_block", (props) -> new Block(props.destroyTime(5f).explosionResistance(6f).sound(SoundType.METAL).mapColor(MapColor.COLOR_RED).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "rubidium_block")))), null);

    public static final Block NETHER_RUBIDIUM_ORE = registerBlockWithItem("nether_rubidium_ore", (props) -> new Block(props.destroyTime(3.0f).explosionResistance(3.0f).sound(SoundType.NETHER_ORE).mapColor(MapColor.NETHER).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "nether_rubidium_ore")))), null);

    public static final Block STARSHARD_BLOCK = registerBlockWithItem("starshard_block", (props) -> new ModHorizontalRotationBlock(props.destroyTime(5f).mapColor(MapColor.COLOR_GREEN).explosionResistance(6f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "starshard_block")))), new Item.Properties().rarity(Rarity.RARE).setId(ModUtil.createItemResourceKey("starshard_block")));

    public static final Block END_STARSHARD_ORE = registerBlockWithItem("end_starshard_ore", (props) -> new Block(props.destroyTime(4.5f).explosionResistance(9f).mapColor(MapColor.SAND).sound(SoundType.STONE).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "end_starshard_ore")))), null);

    public static final Block BRONZE_BLOCK = registerBlockWithItem("bronze_block", (props) -> new Block(props.destroyTime(4.5f).explosionResistance(6f).mapColor(MapColor.TERRACOTTA_ORANGE).sound(SoundType.METAL).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "bronze_block")))), null);

    public static final Block BLOODSTONE_BLOCK = registerBlockWithItem("bloodstone_block", (props) -> new Block(props.destroyTime(5f).explosionResistance(6f).mapColor(MapColor.COLOR_RED).sound(SoundType.METAL).requiresCorrectToolForDrops().setId(ModUtil.createBlockResourceKey("bloodstone_block"))), null);

    public static final Block BLOODSTONE_ORE = registerBlockWithItem("bloodstone_ore", (props) -> new Block(props.destroyTime(3f).explosionResistance(3f).mapColor(MapColor.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().setId(ModUtil.createBlockResourceKey("bloodstone_ore"))), null);

    public static final Block DEEPSLATE_BLOODSTONE_ORE = registerBlockWithItem("deepslate_bloodstone_ore", (props) -> new Block(props.destroyTime(4.5f).explosionResistance(3f).mapColor(MapColor.DEEPSLATE).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops().setId(ModUtil.createBlockResourceKey("deepslate_bloodstone_ore"))), null);

    public static Block registerBlockWithItem(String name, Supplier<Block> block, Item.Properties properties) {
        return registerBlock(name, (ignored) -> block.get(), properties);
    }

    public static Block registerBlockWithItem(String name, Function<BlockBehaviour.Properties, Block> settings, Item.Properties props) {

        if (props == null) {
            return registerBlock(name, settings, new Item.Properties());
        }

        return registerBlock(name, settings, props);
    }

    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> settings, Item.Properties props) {
        Block toRegister = settings.apply(BlockBehaviour.Properties.of().setId(ModUtil.createBlockResourceKey(name)));
        registerSimpleBlockItem(name, toRegister, props);
        return Registry.register(BuiltInRegistries.BLOCK, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, name), toRegister);
    }

    public static void registerSimpleBlockItem(String name, Block block, Item.Properties props) {
        Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, name), new BlockItem(block, props.setId(ModUtil.createItemResourceKey(name))));
    }

    public static void registerAllBlocks() {
        MoreMetalsMod.LOGGER.info("Hey guys welcome to group chat #registering blocks");
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(entries -> {
            entries.addAfter(Items.IRON_BLOCK, ModBlocks.CUBIC_ZIRCONIA_BLOCK);
        });
    }

}