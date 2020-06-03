package eu.midnightdust.chisel.blocks.Bookshelf;

import eu.midnightdust.chisel.blocks.Reference.ChiselBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

import static eu.midnightdust.chisel.Chisel.ChiselBookshelfGroup;

public class ChiselOakBookshelf {
    public static Block OAK_BOOKSHELF_ABANDONED;
    public static Block OAK_BOOKSHELF_BRIM;
    public static Block OAK_BOOKSHELF_CANS;
    public static Block OAK_BOOKSHELF_HISTORIAN;
    public static Block OAK_BOOKSHELF_HOARDER;
    public static Block OAK_BOOKSHELF_NECROMANCER;
    public static Block OAK_BOOKSHELF_NOVICE_NECROMANCER;
    public static Block OAK_BOOKSHELF_PAPERS;
    public static Block OAK_BOOKSHELF_RAINBOW;
    public static Block OAK_BOOKSHELF_REDTOMES;

    public static void init() {
        OAK_BOOKSHELF_ABANDONED = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselBookshelfGroup, "oak_bookshelf_abandoned");
        OAK_BOOKSHELF_BRIM = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselBookshelfGroup, "oak_bookshelf_brim");
        OAK_BOOKSHELF_CANS = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselBookshelfGroup, "oak_bookshelf_cans");
        OAK_BOOKSHELF_HISTORIAN = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselBookshelfGroup, "oak_bookshelf_historian");
        OAK_BOOKSHELF_HOARDER = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselBookshelfGroup, "oak_bookshelf_hoarder");
        OAK_BOOKSHELF_NECROMANCER = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselBookshelfGroup, "oak_bookshelf_necromancer");
        OAK_BOOKSHELF_NOVICE_NECROMANCER = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselBookshelfGroup, "oak_bookshelf_novice_necromancer");
        OAK_BOOKSHELF_PAPERS = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselBookshelfGroup, "oak_bookshelf_papers");
        OAK_BOOKSHELF_RAINBOW = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselBookshelfGroup, "oak_bookshelf_rainbow");
        OAK_BOOKSHELF_REDTOMES = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselBookshelfGroup, "oak_bookshelf_redtomes");
    }
}
