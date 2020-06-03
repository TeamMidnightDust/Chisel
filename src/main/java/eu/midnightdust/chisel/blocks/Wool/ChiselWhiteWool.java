package eu.midnightdust.chisel.blocks.Wool;

import eu.midnightdust.chisel.blocks.Reference.ChiselBlock;
import eu.midnightdust.chisel.blocks.Reference.ChiselCarpet;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

import static eu.midnightdust.chisel.Chisel.ChiselWoolGroup;

public class ChiselWhiteWool {
    public static Block WHITE_WOOL_LEGACY;
    public static Block WHITE_WOOL_LLAMA;
    public static Block WHITE_WOOL_CARPET_LEGACY;
    public static Block WHITE_WOOL_CARPET_LLAMA;

    public static void init() {
        WHITE_WOOL_LEGACY = new ChiselBlock(Material.WOOL, 0.8f,0.8f, BlockSoundGroup.WOOL, ChiselWoolGroup, "white_wool_legacy");
        WHITE_WOOL_LLAMA= new ChiselBlock(Material.WOOL, 0.8f,0.8f, BlockSoundGroup.WOOL, ChiselWoolGroup, "white_wool_llama");
        WHITE_WOOL_CARPET_LEGACY = new ChiselCarpet(Material.WOOL, 0.1f,0.1f, BlockSoundGroup.WOOL, ChiselWoolGroup, "white_carpet_legacy");
        WHITE_WOOL_CARPET_LLAMA= new ChiselCarpet(Material.WOOL, 0.1f,0.1f, BlockSoundGroup.WOOL, ChiselWoolGroup, "white_carpet_llama");
    }
}
