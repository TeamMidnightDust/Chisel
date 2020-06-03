package eu.midnightdust.chisel.blocks.Unique;

import eu.midnightdust.chisel.blocks.Reference.ChiselBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

import static eu.midnightdust.chisel.Chisel.ChiselTyrianGroup;

public class ChiselTyrian {
    public static Block TYRIAN_BLACK;
    public static Block TYRIAN_BLACK2;
    public static Block TYRIAN_BLUEPLATING;
    public static Block TYRIAN_CHAOTIC;
    public static Block TYRIAN_DENT;
    public static Block TYRIAN_DIAGONAL;
    public static Block TYRIAN_ELABORATE;
    public static Block TYRIAN_OPENING;
    public static Block TYRIAN_PLATE;
    public static Block TYRIAN_PLATETILES;
    public static Block TYRIAN_PLATFORM;
    public static Block TYRIAN_ROUTES;
    public static Block TYRIAN_RUST;
    public static Block TYRIAN_SHINING;
    public static Block TYRIAN_SOFTPLATE;
    public static Block TYRIAN;

    public static void init() {
        TYRIAN = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselTyrianGroup, "tyrian");
        TYRIAN_BLACK = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselTyrianGroup, "tyrian_black");
        TYRIAN_BLACK2 = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselTyrianGroup, "tyrian_black2");
        TYRIAN_BLUEPLATING = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselTyrianGroup, "tyrian_blueplating");
        TYRIAN_CHAOTIC = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselTyrianGroup, "tyrian_chaotic");
        TYRIAN_DENT = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselTyrianGroup, "tyrian_dent");
        TYRIAN_DIAGONAL = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselTyrianGroup, "tyrian_diagonal");
        TYRIAN_ELABORATE = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselTyrianGroup, "tyrian_elaborate");
        TYRIAN_OPENING = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselTyrianGroup, "tyrian_opening");
        TYRIAN_PLATE = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselTyrianGroup, "tyrian_plate");
        TYRIAN_PLATETILES = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselTyrianGroup, "tyrian_platetiles");
        TYRIAN_PLATFORM = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselTyrianGroup, "tyrian_platform");
        TYRIAN_ROUTES= new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselTyrianGroup, "tyrian_routes");
        TYRIAN_RUST = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselTyrianGroup, "tyrian_rust");
        TYRIAN_SHINING = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselTyrianGroup, "tyrian_shining");
        TYRIAN_SOFTPLATE = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselTyrianGroup, "tyrian_softplate");
    }
}
