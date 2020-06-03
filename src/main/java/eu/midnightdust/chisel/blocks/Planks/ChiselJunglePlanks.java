package eu.midnightdust.chisel.blocks.Planks;

import eu.midnightdust.chisel.blocks.Reference.ChiselBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

import static eu.midnightdust.chisel.Chisel.ChiselPlanksGroup;

public class ChiselJunglePlanks {
    public static Block JUNGLE_PLANKS_BRACED;
    public static Block JUNGLE_PLANKS_BRAID;
    public static Block JUNGLE_PLANKS_CRUDE_HORIZONTAL;
    public static Block JUNGLE_PLANKS_CRUDE_PANELING;
    public static Block JUNGLE_PLANKS_CRUDE_VERTICAL;
    public static Block JUNGLE_PLANKS_ENCASED_LARGE;
    public static Block JUNGLE_PLANKS_ENCASED;
    public static Block JUNGLE_PLANKS_ENCASED_SMOOTH;
    public static Block JUNGLE_PLANKS_LARGE;
    public static Block JUNGLE_PLANKS_LOG_CABIN;
    public static Block JUNGLE_PLANKS_PANELING;
    public static Block JUNGLE_PLANKS_SHIPPING_CRATE;
    public static Block JUNGLE_PLANKS_SMOOTH;
    public static Block JUNGLE_PLANKS_STACKED;
    public static Block JUNGLE_PLANKS_VERTICAL;

    public static void init() {
        JUNGLE_PLANKS_BRACED = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "jungle_planks_braced");
        JUNGLE_PLANKS_BRAID = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "jungle_planks_braid");
        JUNGLE_PLANKS_CRUDE_HORIZONTAL = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "jungle_planks_crude_horizontal");
        JUNGLE_PLANKS_CRUDE_PANELING = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "jungle_planks_crude_paneling");
        JUNGLE_PLANKS_CRUDE_VERTICAL = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "jungle_planks_crude_vertical");
        JUNGLE_PLANKS_ENCASED_LARGE = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "jungle_planks_encased_large");
        JUNGLE_PLANKS_ENCASED = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "jungle_planks_encased");
        JUNGLE_PLANKS_ENCASED_SMOOTH = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "jungle_planks_encased_smooth");
        JUNGLE_PLANKS_LARGE = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "jungle_planks_large");
        JUNGLE_PLANKS_LOG_CABIN = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "jungle_planks_log_cabin");
        JUNGLE_PLANKS_PANELING = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "jungle_planks_paneling");
        JUNGLE_PLANKS_SHIPPING_CRATE = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "jungle_planks_shipping_crate");
        JUNGLE_PLANKS_SMOOTH = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "jungle_planks_smooth");
        JUNGLE_PLANKS_STACKED = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "jungle_planks_stacked");
        JUNGLE_PLANKS_VERTICAL = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "jungle_planks_vertical");
    }
}
