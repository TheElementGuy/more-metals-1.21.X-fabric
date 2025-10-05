package net.theelementguy.tegmoremetals.item;

import net.minecraft.client.resources.model.EquipmentClientInfo;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.theelementguy.tegmoremetals.util.ModUtil;

import java.util.function.BiConsumer;

import static net.theelementguy.tegmoremetals.MoreMetalsMod.MOD_ID;

public class ModEquipmentAssets {

    public static final ResourceKey<EquipmentAsset> CUBIC_ZIRCONIA = ModUtil.createEquipmentAssetResourceKey("cubic_zirconia");
    public static final ResourceKey<EquipmentAsset> RUBIDIUM = ModUtil.createEquipmentAssetResourceKey("rubidium");
    public static final ResourceKey<EquipmentAsset> STARSHARD = ModUtil.createEquipmentAssetResourceKey("starshard");
    public static final ResourceKey<EquipmentAsset> BLOODSTONE = ModUtil.createEquipmentAssetResourceKey("bloodstone");
    public static void bootstrap(BiConsumer<ResourceKey<EquipmentAsset>, EquipmentClientInfo> consumer) {
        acceptEquipmentAsset(consumer, CUBIC_ZIRCONIA);
        acceptEquipmentAsset(consumer, RUBIDIUM);
        acceptEquipmentAsset(consumer, STARSHARD);
        acceptEquipmentAsset(consumer, BLOODSTONE);
    }

    private static void acceptEquipmentAsset(BiConsumer<ResourceKey<EquipmentAsset>, EquipmentClientInfo> resourceKeyEquipmentClientInfoBiConsumer, ResourceKey<EquipmentAsset> key) {
        resourceKeyEquipmentClientInfoBiConsumer.accept(key, EquipmentClientInfo.builder().addHumanoidLayers(ResourceLocation.fromNamespaceAndPath(MOD_ID, key.location().getPath())).build());
    }
}