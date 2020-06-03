package eu.midnightdust.chisel.blocks.Bookshelf;

import eu.midnightdust.chisel.blocks.Reference.ChiselBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

import static eu.midnightdust.chisel.Chisel.ChiselBookshelfGroup;

public class ChiselSpruceBookshelf {
    public static Block SPRUCE_BOOKSHELF_ABANDONED;
    public static Block SPRUCE_BOOKSHELF_BRIM;
    public static Block SPRUCE_BOOKSHELF_CANS;
    public static Block SPRUCE_BOOKSHELF_HISTORIAN;
    public static Block SPRUCE_BOOKSHELF_HOARDER;
    public static Block SPRUCE_BOOKSHELF_NECROMANCER;
    public static Block SPRUCE_BOOKSHELF_NOVICE_NECROMANCER;
    public static Block SPRUCE_BOOKSHELF_PAPERS;
    public static Block SPRUCE_BOOKSHELF_RAINBOW;
    public static Block SPRUCE_BOOKSHELF_REDTOMES;

    public static void init() {
        SPRUCE_BOOKSHELF_ABANDONED = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselBookshelfGroup, "spruce_bookshelf_abandoned");
        SPRUCE_BOOKSHELF_BRIM = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselBookshelfGroup, "spruce_bookshelf_brim");
        SPRUCE_BOOKSHELF_CANS = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselBookshelfGroup, "spruce_bookshelf_cans");
        SPRUCE_BOOKSHELF_HISTORIAN = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselBookshelfGroup, "spruce_bookshelf_historian");
        SPRUCE_BOOKSHELF_HOARDER = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselBookshelfGroup, "spruce_bookshelf_hoarder");
        SPRUCE_BOOKSHELF_NECROMANCER = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselBookshelfGroup, "spruce_bookshelf_necromancer");
        SPRUCE_BOOKSHELF_NOVICE_NECROMANCER = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselBookshelfGroup, "spruce_bookshelf_novice_necromancer");
        SPRUCE_BOOKSHELF_PAPERS = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselBookshelfGroup, "spruce_bookshelf_papers");
        SPRUCE_BOOKSHELF_RAINBOW = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselBookshelfGroup, "spruce_bookshelf_rainbow");
        SPRUCE_BOOKSHELF_REDTOMES = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselBookshelfGroup, "spruce_bookshelf_redtomes");
    }
}
