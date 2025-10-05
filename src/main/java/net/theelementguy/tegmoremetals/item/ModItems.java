package net.theelementguy.tegmoremetals.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.level.block.Blocks;
import net.theelementguy.tegmoremetals.MoreMetalsMod;
import net.theelementguy.tegmoremetals.block.ModBlocks;
import net.theelementguy.tegmoremetals.trim.ModTrimMaterials;
import net.theelementguy.tegmoremetals.util.ModUtil;

import java.util.function.Function;
import java.util.function.Supplier;

public class ModItems {

    public static Item CUBIC_ZIRCONIA = register("cubic_zirconia", (props) -> new Item(props.fireResistant().trimMaterial(ModTrimMaterials.CUBIC_ZIRCONIA)));

    public static final Item RAW_CUBIC_ZIRCONIA = register("raw_cubic_zirconia", Item::new);

    public static final Item CUBIC_ZIRCONIA_SWORD = register("cubic_zirconia_sword", () -> new Item((new Item.Properties()).fireResistant().sword(ModToolMaterials.CUBIC_ZIRCONIA, 3.0F, -2.4F).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "cubic_zirconia_sword")))));

    public static final Item CUBIC_ZIRCONIA_AXE = register("cubic_zirconia_axe", () -> new AxeItem(ModToolMaterials.CUBIC_ZIRCONIA, 6.0F, -3.1F, (new Item.Properties()).fireResistant().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "cubic_zirconia_axe")))));

    public static final Item CUBIC_ZIRCONIA_PICKAXE = register("cubic_zirconia_pickaxe", () -> new Item((new Item.Properties()).fireResistant().pickaxe(ModToolMaterials.CUBIC_ZIRCONIA, 1.0F, -2.8F).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "cubic_zirconia_pickaxe")))));

    public static final Item CUBIC_ZIRCONIA_SHOVEL = register("cubic_zirconia_shovel", () -> new ShovelItem(ModToolMaterials.CUBIC_ZIRCONIA, 1.5F, -3.0F, (new Item.Properties()).fireResistant().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "cubic_zirconia_shovel")))));

    public static final Item CUBIC_ZIRCONIA_HOE = register("cubic_zirconia_hoe", () -> new HoeItem(ModToolMaterials.CUBIC_ZIRCONIA, -2.0F, -1.0F, (new Item.Properties()).fireResistant().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "cubic_zirconia_hoe")))));

    public static final Item CUBIC_ZIRCONIA_HELMET = register("cubic_zirconia_helmet", () -> new Item(new Item.Properties().fireResistant().humanoidArmor(ModArmorMaterials.CUBIC_ZIRCONIA, ArmorType.HELMET).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "cubic_zirconia_helmet")))));

    public static final Item CUBIC_ZIRCONIA_CHESTPLATE = register("cubic_zirconia_chestplate", () -> new Item((new Item.Properties()).fireResistant().humanoidArmor(ModArmorMaterials.CUBIC_ZIRCONIA, ArmorType.CHESTPLATE).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "cubic_zirconia_chestplate")))));

    public static final Item CUBIC_ZIRCONIA_LEGGINGS = register("cubic_zirconia_leggings", () -> new Item((new Item.Properties()).fireResistant().humanoidArmor(ModArmorMaterials.CUBIC_ZIRCONIA, ArmorType.LEGGINGS).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "cubic_zirconia_leggings")))));

    public static final Item CUBIC_ZIRCONIA_BOOTS = register("cubic_zirconia_boots", () -> new Item((new Item.Properties()).fireResistant().humanoidArmor(ModArmorMaterials.CUBIC_ZIRCONIA, ArmorType.BOOTS).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "cubic_zirconia_boots")))));

    public static final Item RUBIDIUM = register("rubidium", () -> new Item((new Item.Properties()).trimMaterial(ModTrimMaterials.RUBIDIUM).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "rubidium")))));

    public static final Item RUBIDIUM_SWORD = register("rubidium_sword", () -> new Item((new Item.Properties()).sword(ModToolMaterials.RUBIDIUM, 3.0F, -2.4F).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "rubidium_sword")))));

    public static final Item RUBIDIUM_AXE = register("rubidium_axe", () -> new AxeItem(ModToolMaterials.RUBIDIUM, 6.0F, -3.1F, (new Item.Properties()).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "rubidium_axe")))));

    public static final Item RUBIDIUM_PICKAXE = register("rubidium_pickaxe", () -> new Item((new Item.Properties()).pickaxe(ModToolMaterials.RUBIDIUM, 1.0F, -2.8F).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "rubidium_pickaxe")))));

    public static final Item RUBIDIUM_SHOVEL = register("rubidium_shovel", () -> new ShovelItem(ModToolMaterials.RUBIDIUM, 1.5F, -3.0F, (new Item.Properties()).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "rubidium_shovel")))));

    public static final Item RUBIDIUM_HOE = register("rubidium_hoe", () -> new HoeItem(ModToolMaterials.RUBIDIUM, -2.0F, -1.0F, (new Item.Properties()).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "rubidium_hoe")))));

    public static final Item RUBIDIUM_HELMET = register("rubidium_helmet", () -> new Item((new Item.Properties()).humanoidArmor(ModArmorMaterials.RUBIDIUM, ArmorType.HELMET).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "rubidium_helmet")))));

    public static final Item RUBIDIUM_CHESTPLATE = register("rubidium_chestplate", () -> new Item((new Item.Properties()).humanoidArmor(ModArmorMaterials.RUBIDIUM, ArmorType.CHESTPLATE).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "rubidium_chestplate")))));

    public static final Item RUBIDIUM_LEGGINGS = register("rubidium_leggings", () -> new Item((new Item.Properties()).humanoidArmor(ModArmorMaterials.RUBIDIUM, ArmorType.LEGGINGS).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "rubidium_leggings")))));

    public static final Item RUBIDIUM_BOOTS = register("rubidium_boots", () -> new Item((new Item.Properties()).humanoidArmor(ModArmorMaterials.RUBIDIUM, ArmorType.BOOTS).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "rubidium_boots")))));

    public static final Item STARSHARD = register("starshard", () -> new Item((new Item.Properties()).rarity(Rarity.UNCOMMON).trimMaterial(ModTrimMaterials.STARSHARD).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "starshard")))));

    public static final Item STARSHARD_SWORD = register("starshard_sword", () -> new Item((new Item.Properties()).sword(ModToolMaterials.STARSHARD, 3.0F, -2.4F).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "starshard_sword")))));

    public static final Item STARSHARD_AXE = register("starshard_axe", () -> new AxeItem(ModToolMaterials.STARSHARD, 6.0F, -3.1F, (new Item.Properties()).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "starshard_axe")))));

    public static final Item STARSHARD_PICKAXE = register("starshard_pickaxe", () -> new Item((new Item.Properties()).pickaxe(ModToolMaterials.STARSHARD, 1.0F, -2.8F).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "starshard_pickaxe")))));

    public static final Item STARSHARD_SHOVEL = register("starshard_shovel", () -> new ShovelItem(ModToolMaterials.STARSHARD, 1.5F, -3.0F, (new Item.Properties()).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "starshard_shovel")))));

    public static final Item STARSHARD_HOE = register("starshard_hoe", () -> new HoeItem(ModToolMaterials.STARSHARD, -2.0F, -1.0F, (new Item.Properties()).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "starshard_hoe")))));

    public static final Item STARSHARD_HELMET = register("starshard_helmet", () -> new Item((new Item.Properties()).humanoidArmor(ModArmorMaterials.STARSHARD, ArmorType.HELMET).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "starshard_helmet")))));

    public static final Item STARSHARD_CHESTPLATE = register("starshard_chestplate", () -> new Item((new Item.Properties()).humanoidArmor(ModArmorMaterials.STARSHARD, ArmorType.CHESTPLATE).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "starshard_chestplate")))));

    public static final Item STARSHARD_LEGGINGS = register("starshard_leggings", () -> new Item((new Item.Properties()).humanoidArmor(ModArmorMaterials.STARSHARD, ArmorType.LEGGINGS).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "starshard_leggings")))));

    public static final Item STARSHARD_BOOTS = register("starshard_boots", () -> new Item((new Item.Properties()).humanoidArmor(ModArmorMaterials.STARSHARD, ArmorType.BOOTS).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "starshard_boots")))));

    public static final Item BLOODSTONE = register("bloodstone", () -> new Item(new Item.Properties().trimMaterial(ModTrimMaterials.BLOODSTONE).setId(ModUtil.createItemResourceKey("bloodstone"))));

    public static final Item BLOODSTONE_SWORD = registerSword("bloodstone_sword", ModToolMaterials.BLOODSTONE);

    public static final Item BLOODSTONE_AXE = registerAxe("bloodstone_axe", ModToolMaterials.BLOODSTONE);

    public static final Item BLOODSTONE_PICKAXE = registerPickaxe("bloodstone_pickaxe", ModToolMaterials.BLOODSTONE);

    public static final Item BLOODSTONE_SHOVEL = registerShovel("bloodstone_shovel", ModToolMaterials.BLOODSTONE);

    public static final Item BLOODSTONE_HOE = registerHoe("bloodstone_hoe", ModToolMaterials.BLOODSTONE);

    public static final Item BLOODSTONE_HELMET = registerHelmet("bloodstone_helmet", ModArmorMaterials.BLOODSTONE);

    public static final Item BLOODSTONE_CHESTPLATE = registerChestplate("bloodstone_chestplate", ModArmorMaterials.BLOODSTONE);

    public static final Item BLOODSTONE_LEGGINGS = registerLeggings("bloodstone_leggings", ModArmorMaterials.BLOODSTONE);

    public static final Item BLOODSTONE_BOOTS = registerBoots("bloodstone_boots", ModArmorMaterials.BLOODSTONE);

    public static Item registerSword(String name, ToolMaterial material) {
        return register(name, () -> new Item(new Item.Properties().sword(material, 3.0f, -2.4f).setId(ModUtil.createItemResourceKey(name))));
    }

    public static Item registerAxe(String name, ToolMaterial material) {
        return register(name, () -> new AxeItem(material, 6.0f, -3.1f, new Item.Properties().setId(ModUtil.createItemResourceKey(name))));
    }

    public static Item registerPickaxe(String name, ToolMaterial material) {
        return register(name, () -> new Item(new Item.Properties().pickaxe(material, 1.0f, -2.8f).setId(ModUtil.createItemResourceKey(name))));
    }

    public static Item registerShovel(String name, ToolMaterial material) {
        return register(name, () -> new ShovelItem(material, 1.5f, -3f, new Item.Properties().setId(ModUtil.createItemResourceKey(name))));
    }

    public static Item registerHoe(String name, ToolMaterial material) {
        return register(name, () -> new HoeItem(material, -2.0f, -1.0f, new Item.Properties().setId(ModUtil.createItemResourceKey(name))));
    }

    public static Item registerHelmet(String name, ArmorMaterial material) {
        return register(name, () -> new Item(new Item.Properties().humanoidArmor(material, ArmorType.HELMET).setId(ModUtil.createItemResourceKey(name))));
    }

    public static Item registerChestplate(String name, ArmorMaterial material) {
        return register(name, () -> new Item(new Item.Properties().humanoidArmor(material, ArmorType.CHESTPLATE).setId(ModUtil.createItemResourceKey(name))));
    }

    public static Item registerLeggings(String name, ArmorMaterial material) {
        return register(name, () -> new Item(new Item.Properties().humanoidArmor(material, ArmorType.LEGGINGS).setId(ModUtil.createItemResourceKey(name))));
    }

    public static Item registerBoots(String name, ArmorMaterial material) {
        return register(name, () -> new Item(new Item.Properties().humanoidArmor(material, ArmorType.BOOTS).setId(ModUtil.createItemResourceKey(name))));
    }

    private static Item register(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, ModUtil.createItemResourceKey(name), function.apply(new Item.Properties().setId(ModUtil.createItemResourceKey(name))));
    }

    private static Item register(String name, Supplier<? extends Item> item) {
        return register(name, (ignored) -> item.get());
    }

    public static void registerItems() {
        MoreMetalsMod.LOGGER.info("Just want to let you know...tegmoremetals is having its items registered");
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.addAfter(Items.GOLD_INGOT, ModItems.CUBIC_ZIRCONIA);
            fabricItemGroupEntries.addAfter(Items.LAPIS_LAZULI, ModItems.RAW_CUBIC_ZIRCONIA);
            fabricItemGroupEntries.addAfter(Items.DIAMOND, ModItems.RUBIDIUM);
            fabricItemGroupEntries.addAfter(ModItems.RUBIDIUM, ModItems.STARSHARD);
            fabricItemGroupEntries.addAfter(ModItems.CUBIC_ZIRCONIA, ModItems.BLOODSTONE);
            MoreMetalsMod.LOGGER.info("ingredients");
        });

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.addAfter(Blocks.LAPIS_BLOCK, ModBlocks.CUBIC_ZIRCONIA_BLOCK);
            fabricItemGroupEntries.addAfter(Blocks.DIAMOND_BLOCK, ModBlocks.RUBIDIUM_BLOCK);
            fabricItemGroupEntries.addAfter(Blocks.NETHERITE_BLOCK, ModBlocks.STARSHARD_BLOCK);
            fabricItemGroupEntries.addAfter(ModBlocks.CUBIC_ZIRCONIA_BLOCK, ModBlocks.BLOODSTONE_BLOCK);
        });

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.NATURAL_BLOCKS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.addAfter(Blocks.LAPIS_ORE, ModBlocks.CUBIC_ZIRCONIA_ORE);
            fabricItemGroupEntries.addAfter(ModBlocks.CUBIC_ZIRCONIA_ORE, ModBlocks.DEEPSLATE_CUBIC_ZIRCONIA_ORE);
            fabricItemGroupEntries.addAfter(Blocks.NETHER_QUARTZ_ORE, ModBlocks.NETHER_RUBIDIUM_ORE);
            fabricItemGroupEntries.addAfter(Blocks.ANCIENT_DEBRIS, ModBlocks.END_STARSHARD_ORE);
            fabricItemGroupEntries.addAfter(Blocks.RAW_IRON_BLOCK, ModBlocks.RAW_CUBIC_ZIRCONIA_BLOCK);
            fabricItemGroupEntries.addAfter(ModBlocks.DEEPSLATE_CUBIC_ZIRCONIA_ORE, ModBlocks.BLOODSTONE_ORE);
            fabricItemGroupEntries.addAfter(ModBlocks.BLOODSTONE_ORE, ModBlocks.DEEPSLATE_BLOODSTONE_ORE);

        });

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.addAfter(Items.IRON_SWORD, ModItems.CUBIC_ZIRCONIA_SWORD);
            fabricItemGroupEntries.addAfter(Items.IRON_AXE, ModItems.CUBIC_ZIRCONIA_AXE);
            fabricItemGroupEntries.addAfter(Items.IRON_BOOTS, ModItems.CUBIC_ZIRCONIA_HELMET);
            fabricItemGroupEntries.addAfter(ModItems.CUBIC_ZIRCONIA_HELMET, ModItems.CUBIC_ZIRCONIA_CHESTPLATE);
            fabricItemGroupEntries.addAfter(ModItems.CUBIC_ZIRCONIA_CHESTPLATE, ModItems.CUBIC_ZIRCONIA_LEGGINGS);
            fabricItemGroupEntries.addAfter(ModItems.CUBIC_ZIRCONIA_LEGGINGS, ModItems.CUBIC_ZIRCONIA_BOOTS);
            fabricItemGroupEntries.addAfter(Items.DIAMOND_SWORD, ModItems.RUBIDIUM_SWORD);
            fabricItemGroupEntries.addAfter(Items.DIAMOND_AXE, ModItems.RUBIDIUM_AXE);
            fabricItemGroupEntries.addAfter(Items.DIAMOND_BOOTS, ModItems.RUBIDIUM_HELMET);
            fabricItemGroupEntries.addAfter(ModItems.RUBIDIUM_HELMET, ModItems.RUBIDIUM_CHESTPLATE);
            fabricItemGroupEntries.addAfter(ModItems.RUBIDIUM_CHESTPLATE, ModItems.RUBIDIUM_LEGGINGS);
            fabricItemGroupEntries.addAfter(ModItems.RUBIDIUM_LEGGINGS, ModItems.RUBIDIUM_BOOTS);
            fabricItemGroupEntries.addAfter(Items.NETHERITE_SWORD, ModItems.STARSHARD_SWORD);
            fabricItemGroupEntries.addAfter(Items.NETHERITE_AXE, ModItems.STARSHARD_AXE);
            fabricItemGroupEntries.addAfter(Items.NETHERITE_BOOTS, ModItems.STARSHARD_HELMET);
            fabricItemGroupEntries.addAfter(ModItems.STARSHARD_HELMET, ModItems.STARSHARD_CHESTPLATE);
            fabricItemGroupEntries.addAfter(ModItems.STARSHARD_CHESTPLATE, ModItems.STARSHARD_LEGGINGS);
            fabricItemGroupEntries.addAfter(ModItems.STARSHARD_LEGGINGS, ModItems.STARSHARD_BOOTS);
            fabricItemGroupEntries.addAfter(ModItems.CUBIC_ZIRCONIA_SWORD, ModItems.BLOODSTONE_SWORD);
            fabricItemGroupEntries.addAfter(ModItems.CUBIC_ZIRCONIA_AXE, ModItems.BLOODSTONE_AXE);
            fabricItemGroupEntries.addAfter(ModItems.CUBIC_ZIRCONIA_BOOTS, ModItems.BLOODSTONE_HELMET);
            fabricItemGroupEntries.addAfter(ModItems.BLOODSTONE_HELMET, ModItems.BLOODSTONE_CHESTPLATE);
            fabricItemGroupEntries.addAfter(ModItems.BLOODSTONE_CHESTPLATE, ModItems.BLOODSTONE_LEGGINGS);
            fabricItemGroupEntries.addAfter(ModItems.BLOODSTONE_LEGGINGS, ModItems.BLOODSTONE_BOOTS);
        });

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.addAfter(Items.IRON_HOE, ModItems.CUBIC_ZIRCONIA_AXE);
            fabricItemGroupEntries.addAfter(ModItems.CUBIC_ZIRCONIA_AXE, ModItems.CUBIC_ZIRCONIA_PICKAXE);
            fabricItemGroupEntries.addAfter(ModItems.CUBIC_ZIRCONIA_PICKAXE, ModItems.CUBIC_ZIRCONIA_SHOVEL);
            fabricItemGroupEntries.addAfter(ModItems.CUBIC_ZIRCONIA_SHOVEL, ModItems.CUBIC_ZIRCONIA_HOE);
            fabricItemGroupEntries.addAfter(Items.DIAMOND_HOE, ModItems.RUBIDIUM_AXE);
            fabricItemGroupEntries.addAfter(ModItems.RUBIDIUM_AXE, ModItems.RUBIDIUM_PICKAXE);
            fabricItemGroupEntries.addAfter(ModItems.RUBIDIUM_PICKAXE, ModItems.RUBIDIUM_SHOVEL);
            fabricItemGroupEntries.addAfter(ModItems.RUBIDIUM_SHOVEL, ModItems.RUBIDIUM_HOE);
            fabricItemGroupEntries.addAfter(Items.NETHERITE_HOE, ModItems.STARSHARD_AXE);
            fabricItemGroupEntries.addAfter(ModItems.STARSHARD_AXE, ModItems.STARSHARD_PICKAXE);
            fabricItemGroupEntries.addAfter(ModItems.STARSHARD_PICKAXE, ModItems.STARSHARD_SHOVEL);
            fabricItemGroupEntries.addAfter(ModItems.STARSHARD_SHOVEL, ModItems.STARSHARD_HOE);
            fabricItemGroupEntries.addAfter(ModItems.CUBIC_ZIRCONIA_HOE, ModItems.BLOODSTONE_AXE);
            fabricItemGroupEntries.addAfter(ModItems.BLOODSTONE_AXE, ModItems.BLOODSTONE_PICKAXE);
            fabricItemGroupEntries.addAfter(ModItems.BLOODSTONE_PICKAXE, ModItems.BLOODSTONE_SHOVEL);
            fabricItemGroupEntries.addAfter(ModItems.BLOODSTONE_SHOVEL, ModItems.BLOODSTONE_HOE);

        });
    }

}
