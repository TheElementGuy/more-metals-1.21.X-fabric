package net.theelementguy.tegmoremetals.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.trim.TrimMaterial;
import net.minecraft.world.level.block.Block;
import net.theelementguy.tegmoremetals.MoreMetalsMod;
import net.theelementguy.tegmoremetals.block.ModBlocks;
import net.theelementguy.tegmoremetals.item.ModItems;
import net.theelementguy.tegmoremetals.trim.ModTrimMaterials;

import java.util.concurrent.CompletableFuture;

public class ModLanguageProviderLol extends FabricLanguageProvider {

    public ModLanguageProviderLol(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, "lol_us", registryLookup);
    }

    protected void addTrimMaterial(ResourceKey<TrimMaterial> key, String name, TranslationBuilder b) {
        b.add("trim_material." + MoreMetalsMod.MOD_ID + "." + key.location().getPath(), name);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider provider, TranslationBuilder b) {
        b.add(ModItems.CUBIC_ZIRCONIA, "tuff stuff");
        b.add(ModItems.RAW_CUBIC_ZIRCONIA, "RAWWWW tuff stuff");
        b.add(ModItems.CUBIC_ZIRCONIA_SWORD, "Tuff stuff sord");
        b.add(ModItems.CUBIC_ZIRCONIA_AXE, "tuff stuff Aks");
        b.add(ModItems.CUBIC_ZIRCONIA_PICKAXE, "tuff stuff pikakse");
        b.add(ModItems.CUBIC_ZIRCONIA_SHOVEL, "tuff stuff shaval");
        b.add(ModItems.CUBIC_ZIRCONIA_HOE, "tuff stuff Hoe");
        b.add(ModItems.CUBIC_ZIRCONIA_HELMET, "SO TUFF SAFTY HAT");
        b.add(ModItems.CUBIC_ZIRCONIA_CHESTPLATE, "tuff shirt");
        b.add(ModItems.CUBIC_ZIRCONIA_LEGGINGS, "tuff stuff PATNZ");
        b.add(ModItems.CUBIC_ZIRCONIA_BOOTS, "SUPA TUFF SAFTY BOOTZ");

        b.add(ModItems.RUBIDIUM, "OUCHIE SO HOT");
        b.add(ModItems.RUBIDIUM_SWORD, "rudibidium surd");
        b.add(ModItems.RUBIDIUM_AXE, "rudibidium aks");
        b.add(ModItems.RUBIDIUM_PICKAXE, "rudibidium pikaksee");
        b.add(ModItems.RUBIDIUM_SHOVEL, "rudibidium shuvl");
        b.add(ModItems.RUBIDIUM_HOE, "BROZ Befor RDBDM HOEZ");
        b.add(ModItems.RUBIDIUM_HELMET, "supa hot bike helmet");
        b.add(ModItems.RUBIDIUM_CHESTPLATE, "hot SHIRTZ");
        b.add(ModItems.RUBIDIUM_LEGGINGS, "hot pantz");
        b.add(ModItems.RUBIDIUM_BOOTS, "hot sohez");

        b.add(ModItems.STARSHARD, "oooh shiny");
        b.add(ModItems.STARSHARD_SWORD, "oooh shiny sowrd");
        b.add(ModItems.STARSHARD_AXE, "oooh shiny aks");
        b.add(ModItems.STARSHARD_PICKAXE, "oooh shiny pikakse");
        b.add(ModItems.STARSHARD_SHOVEL, "oooh shiny shovl");
        b.add(ModItems.STARSHARD_HOE, "oooh bent shiny on a stik");
        b.add(ModItems.STARSHARD_HELMET, "ooooh SHINNY HAT");
        b.add(ModItems.STARSHARD_CHESTPLATE, "oooh shiyn shurt");
        b.add(ModItems.STARSHARD_LEGGINGS, "oooh shiny pants");
        b.add(ModItems.STARSHARD_BOOTS, "ooooh shiny shooz (sparkel sparkel)");

        b.add(ModItems.BLOODSTONE, "gory stony");
        b.add(ModItems.BLOODSTONE_SWORD, "used(?) surd");
        b.add(ModItems.BLOODSTONE_AXE, "HORRRORRR MUVY pRop");
        b.add(ModItems.BLOODSTONE_PICKAXE, "wut dis pikakse uzed 4...");
        b.add(ModItems.BLOODSTONE_SHOVEL, "y iz it red olredy");
        b.add(ModItems.BLOODSTONE_HOE, "(c)reeeeper");
        b.add(ModItems.BLOODSTONE_HELMET, "red hulmit");
        b.add(ModItems.BLOODSTONE_CHESTPLATE, "read jursey");
        b.add(ModItems.BLOODSTONE_LEGGINGS, "gory panzzt");
        b.add(ModItems.BLOODSTONE_BOOTS, "bootz aund dey wer wallkinng thru teh pante but teh paaiint wuz red andn it got on teh boutz");

        b.add(ModBlocks.CUBIC_ZIRCONIA_BLOCK.asItem(), "Blok of tuff stuff");
        b.add(ModBlocks.RAW_CUBIC_ZIRCONIA_BLOCK.asItem(), "bLuk uv gross tuff stuff");
        b.add(ModBlocks.RUBIDIUM_BLOCK.asItem(), "hot Blouk");
        b.add(ModBlocks.STARSHARD_BLOCK.asItem(), "shiny shiny bluckc");
        b.add(ModBlocks.BLOODSTONE_BLOCK.asItem(), "blok ov uh oh");

        b.add(ModBlocks.CUBIC_ZIRCONIA_ORE.asItem(), "rokz wiht sum tuff stuff");
        b.add(ModBlocks.DEEPSLATE_CUBIC_ZIRCONIA_ORE.asItem(), "dark STONY roks withh sommmmmmmmmme tuf stuff");
        b.add(ModBlocks.BLOODSTONE_ORE.asItem(), "stony stony wiht...is that wut i thinks it izz???");
        b.add(ModBlocks.DEEPSLATE_BLOODSTONE_ORE.asItem(), "dark stony roks wihth gorre");
        b.add(ModBlocks.NETHER_RUBIDIUM_ORE.asItem(), "HHHHOT Nether ORe");
        b.add(ModBlocks.END_STARSHARD_ORE.asItem(), "shyni wite rockkz");

        b.add(ModBlocks.CUBIC_ZIRCONIA_BLOCK, "Blok of tuff stuff");
        b.add(ModBlocks.RAW_CUBIC_ZIRCONIA_BLOCK, "bLuk uv gross tuff stuff");
        b.add(ModBlocks.RUBIDIUM_BLOCK, "hot Blouk");
        b.add(ModBlocks.STARSHARD_BLOCK, "shiny shiny bluckc");
        b.add(ModBlocks.BLOODSTONE_BLOCK, "blok ov uh oh");

        b.add(ModBlocks.CUBIC_ZIRCONIA_ORE, "rokz wiht sum tuff stuff");
        b.add(ModBlocks.DEEPSLATE_CUBIC_ZIRCONIA_ORE, "dark STONY roks withh sommmmmmmmmme tuf stuff");
        b.add(ModBlocks.BLOODSTONE_ORE, "stony stony wiht...is that wut i thinks it izz???");
        b.add(ModBlocks.DEEPSLATE_BLOODSTONE_ORE, "dark stony roks wihth gorre");
        b.add(ModBlocks.NETHER_RUBIDIUM_ORE, "HHHHOT Nether ORe");
        b.add(ModBlocks.END_STARSHARD_ORE, "shyni wite rockkz");

        addTrimMaterial(ModTrimMaterials.CUBIC_ZIRCONIA, "tuff stuff", b);
        addTrimMaterial(ModTrimMaterials.RUBIDIUM, "burny clohtez", b);
        addTrimMaterial(ModTrimMaterials.STARSHARD, "oooh shiny", b);
    }
}