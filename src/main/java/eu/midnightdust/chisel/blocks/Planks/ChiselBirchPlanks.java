package eu.midnightdust.chisel.blocks.Planks;

import eu.midnightdust.chisel.blocks.Reference.ChiselBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

import static eu.midnightdust.chisel.Chisel.ChiselPlanksGroup;

public class ChiselBirchPlanks {
    public static Block BIRCH_PLANKS_BRACED;
    public static Block BIRCH_PLANKS_BRAID;
    public static Block BIRCH_PLANKS_CRUDE_HORIZONTAL;
    public static Block BIRCH_PLANKS_CRUDE_PANELING;
    public static Block BIRCH_PLANKS_CRUDE_VERTICAL;
    public static Block BIRCH_PLANKS_ENCASED_LARGE;
    public static Block BIRCH_PLANKS_ENCASED;
    public static Block BIRCH_PLANKS_ENCASED_SMOOTH;
    public static Block BIRCH_PLANKS_LARGE;
    public static Block BIRCH_PLANKS_LOG_CABIN;
    public static Block BIRCH_PLANKS_PANELING;
    public static Block BIRCH_PLANKS_SHIPPING_CRATE;
    public static Block BIRCH_PLANKS_SMOOTH;
    public static Block BIRCH_PLANKS_STACKED;
    public static Block BIRCH_PLANKS_VERTICAL;

    public static void init() {
        BIRCH_PLANKS_BRACED = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "birch_planks_braced");
        BIRCH_PLANKS_BRAID = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "birch_planks_braid");
        BIRCH_PLANKS_CRUDE_HORIZONTAL = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "birch_planks_crude_horizontal");
        BIRCH_PLANKS_CRUDE_PANELING = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "birch_planks_crude_paneling");
        BIRCH_PLANKS_CRUDE_VERTICAL = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "birch_planks_crude_vertical");
        BIRCH_PLANKS_ENCASED_LARGE = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "birch_planks_encased_large");
        BIRCH_PLANKS_ENCASED = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "birch_planks_encased");
        BIRCH_PLANKS_ENCASED_SMOOTH = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "birch_planks_encased_smooth");
        BIRCH_PLANKS_LARGE = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "birch_planks_large");
        BIRCH_PLANKS_LOG_CABIN = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "birch_planks_log_cabin");
        BIRCH_PLANKS_PANELING = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "birch_planks_paneling");
        BIRCH_PLANKS_SHIPPING_CRATE = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "birch_planks_shipping_crate");
        BIRCH_PLANKS_SMOOTH = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "birch_planks_smooth");
        BIRCH_PLANKS_STACKED = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "birch_planks_stacked");
        BIRCH_PLANKS_VERTICAL = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "birch_planks_vertical");
    }
}
