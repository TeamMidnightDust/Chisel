package eu.midnightdust.chisel.blocks.Bookshelf;

import eu.midnightdust.chisel.blocks.Reference.ChiselBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

import static eu.midnightdust.chisel.Chisel.ChiselAndesiteGroup;
import static eu.midnightdust.chisel.Chisel.ChiselBookshelfGroup;

public class ChiselAcaciaBookshelf {
    public static Block ACACIA_BOOKSHELF_ABANDONED;
    public static Block ACACIA_BOOKSHELF_BRIM;
    public static Block ACACIA_BOOKSHELF_CANS;
    public static Block ACACIA_BOOKSHELF_HISTORIAN;
    public static Block ACACIA_BOOKSHELF_HOARDER;
    public static Block ACACIA_BOOKSHELF_NECROMANCER;
    public static Block ACACIA_BOOKSHELF_NOVICE_NECROMANCER;
    public static Block ACACIA_BOOKSHELF_PAPERS;
    public static Block ACACIA_BOOKSHELF_RAINBOW;
    public static Block ACACIA_BOOKSHELF_REDTOMES;

    public static void init() {
        ACACIA_BOOKSHELF_ABANDONED = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselBookshelfGroup, "acacia_bookshelf_abandoned");
        ACACIA_BOOKSHELF_BRIM = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselBookshelfGroup, "acacia_bookshelf_brim");
        ACACIA_BOOKSHELF_CANS = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselBookshelfGroup, "acacia_bookshelf_cans");
        ACACIA_BOOKSHELF_HISTORIAN = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselBookshelfGroup, "acacia_bookshelf_historian");
        ACACIA_BOOKSHELF_HOARDER = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselBookshelfGroup, "acacia_bookshelf_hoarder");
        ACACIA_BOOKSHELF_NECROMANCER = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselBookshelfGroup, "acacia_bookshelf_necromancer");
        ACACIA_BOOKSHELF_NOVICE_NECROMANCER = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselBookshelfGroup, "acacia_bookshelf_novice_necromancer");
        ACACIA_BOOKSHELF_PAPERS = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselBookshelfGroup, "acacia_bookshelf_papers");
        ACACIA_BOOKSHELF_RAINBOW = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselBookshelfGroup, "acacia_bookshelf_rainbow");
        ACACIA_BOOKSHELF_REDTOMES = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselBookshelfGroup, "acacia_bookshelf_redtomes");
    }
}
