package eu.midnightdust.chisel.blocks.Stone;

import eu.midnightdust.chisel.blocks.Reference.ChiselBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

import static eu.midnightdust.chisel.Chisel.ChiselCobblestoneGroup;

public class ChiselCobblestone {
    public static Block COBBLESTONE_ARRAY;
    public static Block COBBLESTONE_BRAID;
    public static Block COBBLESTONE_CHAOTIC_BRICKS;
    public static Block COBBLESTONE_CHAOTIC_MEDIUM;
    public static Block COBBLESTONE_CHAOTIC_SMALL;
    public static Block COBBLESTONE_CIRCULAR;
    public static Block COBBLESTONE_CIRCULAR_CT;
    public static Block COBBLESTONE_CRACKED;
    public static Block COBBLESTONE_CRACKED_BRICKS;
    public static Block COBBLESTONE_CUTS;
    public static Block COBBLESTONE_DENT;
    public static Block COBBLESTONE_ENCASED_BRICKS;
    public static Block COBBLESTONE_FRENCH_1;
    public static Block COBBLESTONE_FRENCH_2;
    public static Block COBBLESTONE_JELLYBEAN;
    public static Block COBBLESTONE_LAYERS;
    public static Block COBBLESTONE_MOSAIC;
    public static Block COBBLESTONE_ORNATE;
    public static Block COBBLESTONE_PANEL;
    public static Block COBBLESTONE_PILLAR;
    public static Block COBBLESTONE_PRISM;
    public static Block COBBLESTONE_ROAD;
    public static Block COBBLESTONE_SLANTED;
    public static Block COBBLESTONE_SMALL_BRICKS;
    public static Block COBBLESTONE_SOFT_BRICKS;
    public static Block COBBLESTONE_SOLID_BRICKS;
    public static Block COBBLESTONE_TILES_LARGE;
    public static Block COBBLESTONE_TILES_MEDIUM;
    public static Block COBBLESTONE_TILES_SMALL;
    public static Block COBBLESTONE_TRIPLE_BRICKS;
    public static Block COBBLESTONE_TWISTED;
    public static Block COBBLESTONE_WEAVER;
    public static Block COBBLESTONE_ZAG;

    public static void init() {
        COBBLESTONE_ARRAY = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselCobblestoneGroup, "cobblestone_array");
        COBBLESTONE_BRAID = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselCobblestoneGroup, "cobblestone_braid");
        COBBLESTONE_CHAOTIC_BRICKS = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselCobblestoneGroup, "cobblestone_chaotic_bricks");
        COBBLESTONE_CHAOTIC_MEDIUM = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselCobblestoneGroup, "cobblestone_chaotic_bricks_medium");
        COBBLESTONE_CHAOTIC_SMALL = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselCobblestoneGroup, "cobblestone_chaotic_bricks_small");
        COBBLESTONE_CIRCULAR = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselCobblestoneGroup, "cobblestone_circular");
        COBBLESTONE_CIRCULAR_CT = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselCobblestoneGroup, "cobblestone_circular_ct");
        COBBLESTONE_CRACKED = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselCobblestoneGroup, "cobblestone_cracked");
        COBBLESTONE_CRACKED_BRICKS = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselCobblestoneGroup, "cobblestone_cracked_bricks");
        COBBLESTONE_CUTS = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselCobblestoneGroup, "cobblestone_cuts");
        COBBLESTONE_DENT = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselCobblestoneGroup, "cobblestone_dent");
        COBBLESTONE_ENCASED_BRICKS = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselCobblestoneGroup, "cobblestone_encased_bricks");
        COBBLESTONE_FRENCH_1 = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselCobblestoneGroup, "cobblestone_french_1");
        COBBLESTONE_FRENCH_2 = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselCobblestoneGroup, "cobblestone_french_2");
        COBBLESTONE_JELLYBEAN = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselCobblestoneGroup, "cobblestone_jellybean");
        COBBLESTONE_LAYERS = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselCobblestoneGroup, "cobblestone_layers");
        COBBLESTONE_MOSAIC = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselCobblestoneGroup, "cobblestone_mosaic");
        COBBLESTONE_ORNATE = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselCobblestoneGroup, "cobblestone_ornate");
        COBBLESTONE_PANEL = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselCobblestoneGroup, "cobblestone_panel");
        COBBLESTONE_PILLAR = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselCobblestoneGroup, "cobblestone_pillar");
        COBBLESTONE_PRISM = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselCobblestoneGroup, "cobblestone_prism");
        COBBLESTONE_ROAD = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselCobblestoneGroup, "cobblestone_road");
        COBBLESTONE_SLANTED = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselCobblestoneGroup, "cobblestone_slanted");
        COBBLESTONE_SMALL_BRICKS = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselCobblestoneGroup, "cobblestone_small_bricks");
        COBBLESTONE_SOFT_BRICKS = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselCobblestoneGroup, "cobblestone_soft_bricks");
        COBBLESTONE_SOLID_BRICKS = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselCobblestoneGroup, "cobblestone_solid_bricks");
        COBBLESTONE_TILES_LARGE = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselCobblestoneGroup, "cobblestone_tiles_large");
        COBBLESTONE_TILES_MEDIUM = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselCobblestoneGroup, "cobblestone_tiles_medium");
        COBBLESTONE_TILES_SMALL = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselCobblestoneGroup, "cobblestone_tiles_small");
        COBBLESTONE_TRIPLE_BRICKS = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselCobblestoneGroup, "cobblestone_triple_bricks");
        COBBLESTONE_TWISTED = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselCobblestoneGroup, "cobblestone_twisted");
        COBBLESTONE_WEAVER = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselCobblestoneGroup, "cobblestone_weaver");
        COBBLESTONE_ZAG = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselCobblestoneGroup, "cobblestone_zag");
    }
}
