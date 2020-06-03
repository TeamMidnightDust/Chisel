package eu.midnightdust.chisel.blocks.Bookshelf;

import eu.midnightdust.chisel.blocks.Reference.ChiselBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

import static eu.midnightdust.chisel.Chisel.ChiselBookshelfGroup;

public class ChiselJungleBookshelf {
    public static Block JUNGLE_BOOKSHELF_ABANDONED;
    public static Block JUNGLE_BOOKSHELF_BRIM;
    public static Block JUNGLE_BOOKSHELF_CANS;
    public static Block JUNGLE_BOOKSHELF_HISTORIAN;
    public static Block JUNGLE_BOOKSHELF_HOARDER;
    public static Block JUNGLE_BOOKSHELF_NECROMANCER;
    public static Block JUNGLE_BOOKSHELF_NOVICE_NECROMANCER;
    public static Block JUNGLE_BOOKSHELF_PAPERS;
    public static Block JUNGLE_BOOKSHELF_RAINBOW;
    public static Block JUNGLE_BOOKSHELF_REDTOMES;

    public static void init() {
        JUNGLE_BOOKSHELF_ABANDONED = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselBookshelfGroup, "jungle_bookshelf_abandoned");
        JUNGLE_BOOKSHELF_BRIM = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselBookshelfGroup, "jungle_bookshelf_brim");
        JUNGLE_BOOKSHELF_CANS = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselBookshelfGroup, "jungle_bookshelf_cans");
        JUNGLE_BOOKSHELF_HISTORIAN = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselBookshelfGroup, "jungle_bookshelf_historian");
        JUNGLE_BOOKSHELF_HOARDER = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselBookshelfGroup, "jungle_bookshelf_hoarder");
        JUNGLE_BOOKSHELF_NECROMANCER = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselBookshelfGroup, "jungle_bookshelf_necromancer");
        JUNGLE_BOOKSHELF_NOVICE_NECROMANCER = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselBookshelfGroup, "jungle_bookshelf_novice_necromancer");
        JUNGLE_BOOKSHELF_PAPERS = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselBookshelfGroup, "jungle_bookshelf_papers");
        JUNGLE_BOOKSHELF_RAINBOW = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselBookshelfGroup, "jungle_bookshelf_rainbow");
        JUNGLE_BOOKSHELF_REDTOMES = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselBookshelfGroup, "jungle_bookshelf_redtomes");
    }
}
