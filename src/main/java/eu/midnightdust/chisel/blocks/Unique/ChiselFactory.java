package eu.midnightdust.chisel.blocks.Unique;

import eu.midnightdust.chisel.blocks.Reference.ChiselBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

import static eu.midnightdust.chisel.Chisel.ChiselFactoryGroup;

public class ChiselFactory {
    public static Block FACTORY_CIRCUIT;
    public static Block FACTORY_COLUMN;
    public static Block FACTORY_DOTS;
    public static Block FACTORY_FRAMEBLUE;
    public static Block FACTORY_GOLDPLATE;
    public static Block FACTORY_GOLDPLATING;
    public static Block FACTORY_GRINDER;
    public static Block FACTORY_HAZARD;
    public static Block FACTORY_HAZARDORANGE;
    public static Block FACTORY_ICEICEICE;
    public static Block FACTORY_METALBOX;
    public static Block FACTORY_PLATEX;
    public static Block FACTORY_PLATING;
    public static Block FACTORY_RUST;
    public static Block FACTORY_RUST2;
    public static Block FACTORY_RUSTPLATES;
    public static Block FACTORY_TILEMOSAIC;
    public static Block FACTORY_VENT;
    public static Block FACTORY_WIREFRAME;
    public static Block FACTORY_WIREFRAMEBLUE;
    public static Block FACTORY_WIREFRAMEWHITE;

    public static void init() {
        FACTORY_CIRCUIT = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselFactoryGroup, "factory_circuit");
        FACTORY_COLUMN = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselFactoryGroup, "factory_column");
        FACTORY_DOTS = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselFactoryGroup, "factory_dots");
        FACTORY_FRAMEBLUE = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselFactoryGroup, "factory_frameblue");
        FACTORY_GOLDPLATE = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselFactoryGroup, "factory_goldplate");
        FACTORY_GOLDPLATING = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselFactoryGroup, "factory_goldplating");
        FACTORY_GRINDER = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselFactoryGroup, "factory_grinder");
        FACTORY_HAZARD = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselFactoryGroup, "factory_hazard");
        FACTORY_HAZARDORANGE = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselFactoryGroup, "factory_hazardorange");
        FACTORY_ICEICEICE = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselFactoryGroup, "factory_iceiceice");
        FACTORY_METALBOX = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselFactoryGroup, "factory_metalbox");
        FACTORY_PLATEX = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselFactoryGroup, "factory_platex");
        FACTORY_PLATING = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselFactoryGroup, "factory_plating");
        FACTORY_RUST = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselFactoryGroup, "factory_rust");
        FACTORY_RUST2 = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselFactoryGroup, "factory_rust2");
        FACTORY_RUSTPLATES = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselFactoryGroup, "factory_rustplates");
        FACTORY_TILEMOSAIC = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselFactoryGroup, "factory_tilemosaic");
        FACTORY_VENT = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselFactoryGroup, "factory_vent");
        FACTORY_WIREFRAME = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselFactoryGroup, "factory_wireframe");
        FACTORY_WIREFRAMEBLUE = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselFactoryGroup, "factory_wireframeblue");
        FACTORY_WIREFRAMEWHITE = new ChiselBlock(Material.STONE, 1.5f,6f, BlockSoundGroup.STONE, ChiselFactoryGroup, "factory_wireframewhite");
    }
}
