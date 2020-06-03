package eu.midnightdust.chisel.blocks.Bookshelf;

import eu.midnightdust.chisel.blocks.Reference.ChiselBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

import static eu.midnightdust.chisel.Chisel.ChiselBookshelfGroup;

public class ChiselBirchBookshelf {
    public static Block BIRCH_BOOKSHELF_ABANDONED;
    public static Block BIRCH_BOOKSHELF_BRIM;
    public static Block BIRCH_BOOKSHELF_CANS;
    public static Block BIRCH_BOOKSHELF_HISTORIAN;
    public static Block BIRCH_BOOKSHELF_HOARDER;
    public static Block BIRCH_BOOKSHELF_NECROMANCER;
    public static Block BIRCH_BOOKSHELF_NOVICE_NECROMANCER;
    public static Block BIRCH_BOOKSHELF_PAPERS;
    public static Block BIRCH_BOOKSHELF_RAINBOW;
    public static Block BIRCH_BOOKSHELF_REDTOMES;

    public static void init() {
        BIRCH_BOOKSHELF_ABANDONED = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselBookshelfGroup, "birch_bookshelf_abandoned");
        BIRCH_BOOKSHELF_BRIM = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselBookshelfGroup, "birch_bookshelf_brim");
        BIRCH_BOOKSHELF_CANS = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselBookshelfGroup, "birch_bookshelf_cans");
        BIRCH_BOOKSHELF_HISTORIAN = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselBookshelfGroup, "birch_bookshelf_historian");
        BIRCH_BOOKSHELF_HOARDER = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselBookshelfGroup, "birch_bookshelf_hoarder");
        BIRCH_BOOKSHELF_NECROMANCER = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselBookshelfGroup, "birch_bookshelf_necromancer");
        BIRCH_BOOKSHELF_NOVICE_NECROMANCER = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselBookshelfGroup, "birch_bookshelf_novice_necromancer");
        BIRCH_BOOKSHELF_PAPERS = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselBookshelfGroup, "birch_bookshelf_papers");
        BIRCH_BOOKSHELF_RAINBOW = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselBookshelfGroup, "birch_bookshelf_rainbow");
        BIRCH_BOOKSHELF_REDTOMES = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselBookshelfGroup, "birch_bookshelf_redtomes");
    }
}
