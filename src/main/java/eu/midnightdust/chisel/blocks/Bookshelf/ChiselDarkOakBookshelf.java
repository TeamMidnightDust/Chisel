package eu.midnightdust.chisel.blocks.Bookshelf;

import eu.midnightdust.chisel.blocks.Reference.ChiselBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

import static eu.midnightdust.chisel.Chisel.ChiselBookshelfGroup;

public class ChiselDarkOakBookshelf {
    public static Block DARK_OAK_BOOKSHELF_ABANDONED;
    public static Block DARK_OAK_BOOKSHELF_BRIM;
    public static Block DARK_OAK_BOOKSHELF_CANS;
    public static Block DARK_OAK_BOOKSHELF_HISTORIAN;
    public static Block DARK_OAK_BOOKSHELF_HOARDER;
    public static Block DARK_OAK_BOOKSHELF_NECROMANCER;
    public static Block DARK_OAK_BOOKSHELF_NOVICE_NECROMANCER;
    public static Block DARK_OAK_BOOKSHELF_PAPERS;
    public static Block DARK_OAK_BOOKSHELF_RAINBOW;
    public static Block DARK_OAK_BOOKSHELF_REDTOMES;

    public static void init() {
        DARK_OAK_BOOKSHELF_ABANDONED = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselBookshelfGroup, "dark_oak_bookshelf_abandoned");
        DARK_OAK_BOOKSHELF_BRIM = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselBookshelfGroup, "dark_oak_bookshelf_brim");
        DARK_OAK_BOOKSHELF_CANS = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselBookshelfGroup, "dark_oak_bookshelf_cans");
        DARK_OAK_BOOKSHELF_HISTORIAN = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselBookshelfGroup, "dark_oak_bookshelf_historian");
        DARK_OAK_BOOKSHELF_HOARDER = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselBookshelfGroup, "dark_oak_bookshelf_hoarder");
        DARK_OAK_BOOKSHELF_NECROMANCER = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselBookshelfGroup, "dark_oak_bookshelf_necromancer");
        DARK_OAK_BOOKSHELF_NOVICE_NECROMANCER = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselBookshelfGroup, "dark_oak_bookshelf_novice_necromancer");
        DARK_OAK_BOOKSHELF_PAPERS = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselBookshelfGroup, "dark_oak_bookshelf_papers");
        DARK_OAK_BOOKSHELF_RAINBOW = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselBookshelfGroup, "dark_oak_bookshelf_rainbow");
        DARK_OAK_BOOKSHELF_REDTOMES = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselBookshelfGroup, "dark_oak_bookshelf_redtomes");
    }
}
