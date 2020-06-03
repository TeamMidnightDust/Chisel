package eu.midnightdust.chisel.blocks.Wool;

import eu.midnightdust.chisel.blocks.Reference.ChiselBlock;
import eu.midnightdust.chisel.blocks.Reference.ChiselCarpet;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

import static eu.midnightdust.chisel.Chisel.ChiselAntiblockGroup;
import static eu.midnightdust.chisel.Chisel.ChiselWoolGroup;

public class ChiselBlackWool {
    public static Block BLACK_WOOL_LEGACY;
    public static Block BLACK_WOOL_LLAMA;
    public static Block BLACK_WOOL_CARPET_LEGACY;
    public static Block BLACK_WOOL_CARPET_LLAMA;

    public static void init() {
        BLACK_WOOL_LEGACY = new ChiselBlock(Material.WOOL, 0.8f,0.8f, BlockSoundGroup.WOOL, ChiselWoolGroup, "black_wool_legacy");
        BLACK_WOOL_LLAMA= new ChiselBlock(Material.WOOL, 0.8f,0.8f, BlockSoundGroup.WOOL, ChiselWoolGroup, "black_wool_llama");
        BLACK_WOOL_CARPET_LEGACY = new ChiselCarpet(Material.WOOL, 0.1f,0.1f, BlockSoundGroup.WOOL, ChiselWoolGroup, "black_carpet_legacy");
        BLACK_WOOL_CARPET_LLAMA= new ChiselCarpet(Material.WOOL, 0.1f,0.1f, BlockSoundGroup.WOOL, ChiselWoolGroup, "black_carpet_llama");
    }
}
