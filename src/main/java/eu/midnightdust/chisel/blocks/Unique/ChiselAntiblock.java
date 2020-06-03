package eu.midnightdust.chisel.blocks.Unique;

import eu.midnightdust.chisel.blocks.Reference.ChiselBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

import static eu.midnightdust.chisel.Chisel.ChiselAntiblockGroup;

public class ChiselAntiblock {
    public static Block ANTIBLOCK_BLACK;
    public static Block ANTIBLOCK_BLUE;
    public static Block ANTIBLOCK_BROWN;
    public static Block ANTIBLOCK_CYAN;
    public static Block ANTIBLOCK_GRAY;
    public static Block ANTIBLOCK_GREEN;
    public static Block ANTIBLOCK_LIGHT_BLUE;
    public static Block ANTIBLOCK_LIGHT_GRAY;
    public static Block ANTIBLOCK_LIME;
    public static Block ANTIBLOCK_MAGENTA;
    public static Block ANTIBLOCK_ORANGE;
    public static Block ANTIBLOCK_PINK;
    public static Block ANTIBLOCK_PURPLE;
    public static Block ANTIBLOCK_RED;
    public static Block ANTIBLOCK_WHITE;
    public static Block ANTIBLOCK_YELLOW;

    public static void init() {
        ANTIBLOCK_BLACK = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselAntiblockGroup, "antiblock_black");
        ANTIBLOCK_BLUE = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselAntiblockGroup, "antiblock_blue");
        ANTIBLOCK_BROWN = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselAntiblockGroup, "antiblock_brown");
        ANTIBLOCK_CYAN = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselAntiblockGroup, "antiblock_cyan");
        ANTIBLOCK_GRAY = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselAntiblockGroup, "antiblock_gray");
        ANTIBLOCK_GREEN = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselAntiblockGroup, "antiblock_green");
        ANTIBLOCK_LIGHT_BLUE = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselAntiblockGroup, "antiblock_light_blue");
        ANTIBLOCK_LIGHT_GRAY = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselAntiblockGroup, "antiblock_light_gray");
        ANTIBLOCK_LIME = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselAntiblockGroup, "antiblock_lime");
        ANTIBLOCK_MAGENTA = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselAntiblockGroup, "antiblock_magenta");
        ANTIBLOCK_ORANGE = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselAntiblockGroup, "antiblock_orange");
        ANTIBLOCK_PINK = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselAntiblockGroup, "antiblock_pink");
        ANTIBLOCK_PURPLE = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselAntiblockGroup, "antiblock_purple");
        ANTIBLOCK_RED = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselAntiblockGroup, "antiblock_red");
        ANTIBLOCK_WHITE = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselAntiblockGroup, "antiblock_white");
        ANTIBLOCK_YELLOW = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselAntiblockGroup, "antiblock_yellow");
    }
}
