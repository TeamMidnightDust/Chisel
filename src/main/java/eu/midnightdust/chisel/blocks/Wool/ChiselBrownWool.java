package eu.midnightdust.chisel.blocks.Wool;

import eu.midnightdust.chisel.blocks.Reference.ChiselBlock;
import eu.midnightdust.chisel.blocks.Reference.ChiselCarpet;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

import static eu.midnightdust.chisel.Chisel.ChiselWoolGroup;

public class ChiselBrownWool {
    public static Block BROWN_WOOL_LEGACY;
    public static Block BROWN_WOOL_LLAMA;
    public static Block BROWN_WOOL_CARPET_LEGACY;
    public static Block BROWN_WOOL_CARPET_LLAMA;

    public static void init() {
        BROWN_WOOL_LEGACY = new ChiselBlock(Material.WOOL, 0.8f,0.8f, BlockSoundGroup.WOOL, ChiselWoolGroup, "brown_wool_legacy");
        BROWN_WOOL_LLAMA= new ChiselBlock(Material.WOOL, 0.8f,0.8f, BlockSoundGroup.WOOL, ChiselWoolGroup, "brown_wool_llama");
        BROWN_WOOL_CARPET_LEGACY = new ChiselCarpet(Material.WOOL, 0.1f,0.1f, BlockSoundGroup.WOOL, ChiselWoolGroup, "brown_carpet_legacy");
        BROWN_WOOL_CARPET_LLAMA= new ChiselCarpet(Material.WOOL, 0.1f,0.1f, BlockSoundGroup.WOOL, ChiselWoolGroup, "brown_carpet_llama");
    }
}
