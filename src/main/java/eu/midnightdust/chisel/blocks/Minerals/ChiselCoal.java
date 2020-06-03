package eu.midnightdust.chisel.blocks.Minerals;

import eu.midnightdust.chisel.blocks.Reference.ChiselBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

import static eu.midnightdust.chisel.Chisel.ChiselCoalGroup;

public class ChiselCoal {
    public static Block COAL_ARRAY;
    public static Block COAL_BRAID;
    public static Block COAL_CHAOTIC_BRICKS;
    public static Block COAL_CHAOTIC_MEDIUM;
    public static Block COAL_CHAOTIC_SMALL;
    public static Block COAL_CIRCULAR;
    public static Block COAL_CIRCULAR_CT;
    public static Block COAL_CRACKED;
    public static Block COAL_CRACKED_BRICKS;
    public static Block COAL_CUTS;
    public static Block COAL_DENT;
    public static Block COAL_ENCASED_BRICKS;
    public static Block COAL_FRENCH_1;
    public static Block COAL_FRENCH_2;
    public static Block COAL_JELLYBEAN;
    public static Block COAL_LAYERS;
    public static Block COAL_MOSAIC;
    public static Block COAL_ORNATE;
    public static Block COAL_PANEL;
    public static Block COAL_PILLAR;
    public static Block COAL_PRISM;
    public static Block COAL_ROAD;
    public static Block COAL_SLANTED;
    public static Block COAL_SMALL_BRICKS;
    public static Block COAL_SOFT_BRICKS;
    public static Block COAL_SOLID_BRICKS;
    public static Block COAL_TILES_LARGE;
    public static Block COAL_TILES_MEDIUM;
    public static Block COAL_TILES_SMALL;
    public static Block COAL_TRIPLE_BRICKS;
    public static Block COAL_TWISTED;
    public static Block COAL_WEAVER;
    public static Block COAL_ZAG;

    public static void init() {
        COAL_ARRAY = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselCoalGroup, "coal_array");
        COAL_BRAID = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselCoalGroup, "coal_braid");
        COAL_CHAOTIC_BRICKS = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselCoalGroup, "coal_chaotic_bricks");
        COAL_CHAOTIC_MEDIUM = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselCoalGroup, "coal_chaotic_bricks_medium");
        COAL_CHAOTIC_SMALL = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselCoalGroup, "coal_chaotic_bricks_small");
        COAL_CIRCULAR = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselCoalGroup, "coal_circular");
        COAL_CIRCULAR_CT = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselCoalGroup, "coal_circular_ct");
        COAL_CRACKED = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselCoalGroup, "coal_cracked");
        COAL_CRACKED_BRICKS = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselCoalGroup, "coal_cracked_bricks");
        COAL_CUTS = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselCoalGroup, "coal_cuts");
        COAL_DENT = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselCoalGroup, "coal_dent");
        COAL_ENCASED_BRICKS = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselCoalGroup, "coal_encased_bricks");
        COAL_FRENCH_1 = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselCoalGroup, "coal_french_1");
        COAL_FRENCH_2 = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselCoalGroup, "coal_french_2");
        COAL_JELLYBEAN = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselCoalGroup, "coal_jellybean");
        COAL_LAYERS = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselCoalGroup, "coal_layers");
        COAL_MOSAIC = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselCoalGroup, "coal_mosaic");
        COAL_ORNATE = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselCoalGroup, "coal_ornate");
        COAL_PANEL = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselCoalGroup, "coal_panel");
        COAL_PILLAR = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselCoalGroup, "coal_pillar");
        COAL_PRISM = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselCoalGroup, "coal_prism");
        COAL_ROAD = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselCoalGroup, "coal_road");
        COAL_SLANTED = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselCoalGroup, "coal_slanted");
        COAL_SMALL_BRICKS = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselCoalGroup, "coal_small_bricks");
        COAL_SOFT_BRICKS = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselCoalGroup, "coal_soft_bricks");
        COAL_SOLID_BRICKS = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselCoalGroup, "coal_solid_bricks");
        COAL_TILES_LARGE = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselCoalGroup, "coal_tiles_large");
        COAL_TILES_MEDIUM = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselCoalGroup, "coal_tiles_medium");
        COAL_TILES_SMALL = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselCoalGroup, "coal_tiles_small");
        COAL_TRIPLE_BRICKS = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselCoalGroup, "coal_triple_bricks");
        COAL_TWISTED = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselCoalGroup, "coal_twisted");
        COAL_WEAVER = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselCoalGroup, "coal_weaver");
        COAL_ZAG = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselCoalGroup, "coal_zag");
    }
}
