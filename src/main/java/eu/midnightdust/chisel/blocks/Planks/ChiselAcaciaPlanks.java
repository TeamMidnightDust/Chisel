package eu.midnightdust.chisel.blocks.Planks;

import eu.midnightdust.chisel.blocks.Reference.ChiselBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

import static eu.midnightdust.chisel.Chisel.ChiselPlanksGroup;

public class ChiselAcaciaPlanks {
    public static Block ACACIA_PLANKS_BRACED;
    public static Block ACACIA_PLANKS_BRAID;
    public static Block ACACIA_PLANKS_CRUDE_HORIZONTAL;
    public static Block ACACIA_PLANKS_CRUDE_PANELING;
    public static Block ACACIA_PLANKS_CRUDE_VERTICAL;
    public static Block ACACIA_PLANKS_ENCASED_LARGE;
    public static Block ACACIA_PLANKS_ENCASED;
    public static Block ACACIA_PLANKS_ENCASED_SMOOTH;
    public static Block ACACIA_PLANKS_LARGE;
    public static Block ACACIA_PLANKS_LOG_CABIN;
    public static Block ACACIA_PLANKS_PANELING;
    public static Block ACACIA_PLANKS_SHIPPING_CRATE;
    public static Block ACACIA_PLANKS_SMOOTH;
    public static Block ACACIA_PLANKS_STACKED;
    public static Block ACACIA_PLANKS_VERTICAL;

    public static void init() {
        ACACIA_PLANKS_BRACED = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "acacia_planks_braced");
        ACACIA_PLANKS_BRAID = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "acacia_planks_braid");
        ACACIA_PLANKS_CRUDE_HORIZONTAL = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "acacia_planks_crude_horizontal");
        ACACIA_PLANKS_CRUDE_PANELING = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "acacia_planks_crude_paneling");
        ACACIA_PLANKS_CRUDE_VERTICAL = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "acacia_planks_crude_vertical");
        ACACIA_PLANKS_ENCASED_LARGE = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "acacia_planks_encased_large");
        ACACIA_PLANKS_ENCASED = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "acacia_planks_encased");
        ACACIA_PLANKS_ENCASED_SMOOTH = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "acacia_planks_encased_smooth");
        ACACIA_PLANKS_LARGE = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "acacia_planks_large");
        ACACIA_PLANKS_LOG_CABIN = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "acacia_planks_log_cabin");
        ACACIA_PLANKS_PANELING = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "acacia_planks_paneling");
        ACACIA_PLANKS_SHIPPING_CRATE = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "acacia_planks_shipping_crate");
        ACACIA_PLANKS_SMOOTH = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "acacia_planks_smooth");
        ACACIA_PLANKS_STACKED = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "acacia_planks_stacked");
        ACACIA_PLANKS_VERTICAL = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "acacia_planks_vertical");
    }
}
