package net.theelementguy.tegmoremetals;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.theelementguy.tegmoremetals.datagen.*;
import net.theelementguy.tegmoremetals.trim.ModTrimMaterials;
import net.theelementguy.tegmoremetals.worldgen.ModConfiguredFeatures;
import net.theelementguy.tegmoremetals.worldgen.ModPlacedFeatures;

public class MoreMetalsModDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack packPackYumYum = fabricDataGenerator.createPack();

        packPackYumYum.addProvider(ModBiomeTagProvider::new);
        packPackYumYum.addProvider(ModBlockLootTableProvider::new);
        packPackYumYum.addProvider(ModBlockTagProvider::new);
        packPackYumYum.addProvider(ModItemTagProvider::new);
        packPackYumYum.addProvider(ModLanguageProvider::new);
        packPackYumYum.addProvider(ModModelProvider::new);
        packPackYumYum.addProvider(ModRecipeProvider::new);
        packPackYumYum.addProvider(ModRegistryDataGenerator::new);
        packPackYumYum.addProvider((FabricDataGenerator.Pack.Factory<ModEquipmentAssetProvider>) ModEquipmentAssetProvider::new);

    }

    @Override
    public void buildRegistry(RegistrySetBuilder registryBuilder) {
        registryBuilder.add(Registries.TRIM_MATERIAL, ModTrimMaterials::bootstrap);
        registryBuilder.add(Registries.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap);
        registryBuilder.add(Registries.PLACED_FEATURE, ModPlacedFeatures::bootstrap);
    }
}
