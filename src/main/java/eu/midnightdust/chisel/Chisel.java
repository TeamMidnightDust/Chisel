package eu.midnightdust.chisel;

import eu.midnightdust.chisel.blocks.Bookshelf.ChiselSpruceBookshelf;
import eu.midnightdust.chisel.blocks.ChiselBlocks;
import eu.midnightdust.chisel.blocks.Minerals.ChiselCharcoal;
import eu.midnightdust.chisel.blocks.Minerals.ChiselCoal;
import eu.midnightdust.chisel.blocks.Planks.ChiselSprucePlanks;
import eu.midnightdust.chisel.blocks.Stone.*;
import eu.midnightdust.chisel.blocks.Concrete.ChiselLimeConcrete;
import eu.midnightdust.chisel.blocks.Unique.ChiselAntiblock;
import eu.midnightdust.chisel.blocks.Unique.ChiselFactory;
import eu.midnightdust.chisel.blocks.Unique.ChiselTyrian;
import eu.midnightdust.chisel.blocks.Wool.ChiselLimeWool;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Chisel implements ModInitializer {

    public static final String MOD_ID = "chisel";
    public static final String MOD_NAME = "Chisel";
    public static final Identifier CHISEL_CONTAINER = new Identifier("chisel", "chisel");

    public static final ItemGroup ChiselGroup = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "chisel"), () -> new ItemStack(Chisel.IronChisel));
    public static final ItemGroup ChiselAndesiteGroup = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "andesite"), () -> new ItemStack(ChiselAndesite.ANDESITE_ARRAY));
    public static final ItemGroup ChiselAntiblockGroup = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "antiblock"), () -> new ItemStack(ChiselAntiblock.ANTIBLOCK_LIME));
    public static final ItemGroup ChiselBasaltGroup = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "basalt"), () -> new ItemStack(ChiselBasalt.BASALT_ARRAY));
    public static final ItemGroup ChiselBrickGroup = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "brick"), () -> new ItemStack(ChiselBricks.BRICK_ARRAY));
    public static final ItemGroup ChiselBookshelfGroup = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "bookshelf"), () -> new ItemStack(ChiselSpruceBookshelf.SPRUCE_BOOKSHELF_HISTORIAN));
    public static final ItemGroup ChiselCoalGroup = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "coal"), () -> new ItemStack(ChiselCoal.COAL_ARRAY));
    public static final ItemGroup ChiselCharcoalGroup = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "charcoal"), () -> new ItemStack(ChiselCharcoal.CHARCOAL_ARRAY));
    public static final ItemGroup ChiselCobblestoneGroup = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "cobblestone"), () -> new ItemStack(ChiselCobblestone.COBBLESTONE_ARRAY));
    public static final ItemGroup ChiselConcreteGroup = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "concrete"), () -> new ItemStack(ChiselLimeConcrete.LIME_CONCRETE_ARRAY));
    public static final ItemGroup ChiselFactoryGroup = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "factory"), () -> new ItemStack(ChiselFactory.FACTORY_HAZARD));
    public static final ItemGroup ChiselLimestoneGroup = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "limestone"), () -> new ItemStack(ChiselLimestone.LIMESTONE_ARRAY));
    public static final ItemGroup ChiselMarbleGroup = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "marble"), () -> new ItemStack(ChiselMarble.MARBLE_ARRAY));
    public static final ItemGroup ChiselPlanksGroup = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "planks"), () -> new ItemStack(ChiselSprucePlanks.SPRUCE_PLANKS_CRUDE_HORIZONTAL));
    public static final ItemGroup ChiselStoneBrickGroup = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "stonebrick"), () -> new ItemStack(ChiselStoneBricks.STONEBRICK_ARRAY));
    public static final ItemGroup ChiselTyrianGroup = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "tyrian"), () -> new ItemStack(ChiselTyrian.TYRIAN));
    public static final ItemGroup ChiselWoolGroup = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "wool"), () -> new ItemStack(ChiselLimeWool.LIME_WOOL_LEGACY));
    public static final Item IronChisel = new IronChisel(new Item.Settings().group(Chisel.ChiselGroup).maxCount(1));

    @Override
    public void onInitialize() {
        ChiselBlocks.init();
        Registry.register(Registry.ITEM, new Identifier("chisel","iron_chisel"), IronChisel);
    }
}
