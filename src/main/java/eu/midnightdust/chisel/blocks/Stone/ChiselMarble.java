package eu.midnightdust.chisel.blocks.Stone;

import eu.midnightdust.chisel.blocks.Reference.ChiselBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

import static eu.midnightdust.chisel.Chisel.ChiselMarbleGroup;

public class ChiselMarble {
    public static Block MARBLE_ARRAY;
    public static Block MARBLE_BRAID;
    public static Block MARBLE_CHAOTIC_BRICKS;
    public static Block MARBLE_CHAOTIC_MEDIUM;
    public static Block MARBLE_CHAOTIC_SMALL;
    public static Block MARBLE_CIRCULAR;
    public static Block MARBLE_CIRCULAR_CT;
    public static Block MARBLE_CRACKED;
    public static Block MARBLE_CRACKED_BRICKS;
    public static Block MARBLE_CUTS;
    public static Block MARBLE_DENT;
    public static Block MARBLE_ENCASED_BRICKS;
    public static Block MARBLE_FRENCH_1;
    public static Block MARBLE_FRENCH_2;
    public static Block MARBLE_JELLYBEAN;
    public static Block MARBLE_LAYERS;
    public static Block MARBLE_MOSAIC;
    public static Block MARBLE_ORNATE;
    public static Block MARBLE_PANEL;
    public static Block MARBLE_PILLAR;
    public static Block MARBLE_PRISM;
    public static Block MARBLE_RAW;
    public static Block MARBLE_ROAD;
    public static Block MARBLE_SLANTED;
    public static Block MARBLE_SMALL_BRICKS;
    public static Block MARBLE_SOFT_BRICKS;
    public static Block MARBLE_SOLID_BRICKS;
    public static Block MARBLE_TILES_LARGE;
    public static Block MARBLE_TILES_MEDIUM;
    public static Block MARBLE_TILES_SMALL;
    public static Block MARBLE_TRIPLE_BRICKS;
    public static Block MARBLE_TWISTED;
    public static Block MARBLE_WEAVER;
    public static Block MARBLE_ZAG;

    public static void init() {
        MARBLE_ARRAY = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselMarbleGroup, "marble_array");
        MARBLE_BRAID = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselMarbleGroup, "marble_braid");
        MARBLE_CHAOTIC_BRICKS = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselMarbleGroup, "marble_chaotic_bricks");
        MARBLE_CHAOTIC_MEDIUM = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselMarbleGroup, "marble_chaotic_bricks_medium");
        MARBLE_CHAOTIC_SMALL = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselMarbleGroup, "marble_chaotic_bricks_small");
        MARBLE_CIRCULAR = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselMarbleGroup, "marble_circular");
        MARBLE_CIRCULAR_CT = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselMarbleGroup, "marble_circular_ct");
        MARBLE_CRACKED = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselMarbleGroup, "marble_cracked");
        MARBLE_CRACKED_BRICKS = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselMarbleGroup, "marble_cracked_bricks");
        MARBLE_CUTS = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselMarbleGroup, "marble_cuts");
        MARBLE_DENT = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselMarbleGroup, "marble_dent");
        MARBLE_ENCASED_BRICKS = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselMarbleGroup, "marble_encased_bricks");
        MARBLE_FRENCH_1 = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselMarbleGroup, "marble_french_1");
        MARBLE_FRENCH_2 = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselMarbleGroup, "marble_french_2");
        MARBLE_JELLYBEAN = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselMarbleGroup, "marble_jellybean");
        MARBLE_LAYERS = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselMarbleGroup, "marble_layers");
        MARBLE_MOSAIC = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselMarbleGroup, "marble_mosaic");
        MARBLE_ORNATE = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselMarbleGroup, "marble_ornate");
        MARBLE_PANEL = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselMarbleGroup, "marble_panel");
        MARBLE_PILLAR = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselMarbleGroup, "marble_pillar");
        MARBLE_PRISM = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselMarbleGroup, "marble_prism");
        MARBLE_RAW = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselMarbleGroup, "marble_raw");
        MARBLE_ROAD = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselMarbleGroup, "marble_road");
        MARBLE_SLANTED = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselMarbleGroup, "marble_slanted");
        MARBLE_SMALL_BRICKS = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselMarbleGroup, "marble_small_bricks");
        MARBLE_SOFT_BRICKS = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselMarbleGroup, "marble_soft_bricks");
        MARBLE_SOLID_BRICKS = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselMarbleGroup, "marble_solid_bricks");
        MARBLE_TILES_LARGE = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselMarbleGroup, "marble_tiles_large");
        MARBLE_TILES_MEDIUM = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselMarbleGroup, "marble_tiles_medium");
        MARBLE_TILES_SMALL = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselMarbleGroup, "marble_tiles_small");
        MARBLE_TRIPLE_BRICKS = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselMarbleGroup, "marble_triple_bricks");
        MARBLE_TWISTED = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselMarbleGroup, "marble_twisted");
        MARBLE_WEAVER = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselMarbleGroup, "marble_weaver");
        MARBLE_ZAG = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselMarbleGroup, "marble_zag");
    }
}
