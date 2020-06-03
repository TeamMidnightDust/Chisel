package eu.midnightdust.chisel.blocks.Planks;

import eu.midnightdust.chisel.blocks.Reference.ChiselBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

import static eu.midnightdust.chisel.Chisel.ChiselPlanksGroup;

public class ChiselSprucePlanks {
    public static Block SPRUCE_PLANKS_BRACED;
    public static Block SPRUCE_PLANKS_BRAID;
    public static Block SPRUCE_PLANKS_CRUDE_HORIZONTAL;
    public static Block SPRUCE_PLANKS_CRUDE_PANELING;
    public static Block SPRUCE_PLANKS_CRUDE_VERTICAL;
    public static Block SPRUCE_PLANKS_ENCASED_LARGE;
    public static Block SPRUCE_PLANKS_ENCASED;
    public static Block SPRUCE_PLANKS_ENCASED_SMOOTH;
    public static Block SPRUCE_PLANKS_LARGE;
    public static Block SPRUCE_PLANKS_LOG_CABIN;
    public static Block SPRUCE_PLANKS_PANELING;
    public static Block SPRUCE_PLANKS_SHIPPING_CRATE;
    public static Block SPRUCE_PLANKS_SMOOTH;
    public static Block SPRUCE_PLANKS_STACKED;
    public static Block SPRUCE_PLANKS_VERTICAL;

    public static void init() {
        SPRUCE_PLANKS_BRACED = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "spruce_planks_braced");
        SPRUCE_PLANKS_BRAID = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "spruce_planks_braid");
        SPRUCE_PLANKS_CRUDE_HORIZONTAL = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "spruce_planks_crude_horizontal");
        SPRUCE_PLANKS_CRUDE_PANELING = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "spruce_planks_crude_paneling");
        SPRUCE_PLANKS_CRUDE_VERTICAL = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "spruce_planks_crude_vertical");
        SPRUCE_PLANKS_ENCASED_LARGE = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "spruce_planks_encased_large");
        SPRUCE_PLANKS_ENCASED = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "spruce_planks_encased");
        SPRUCE_PLANKS_ENCASED_SMOOTH = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "spruce_planks_encased_smooth");
        SPRUCE_PLANKS_LARGE = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "spruce_planks_large");
        SPRUCE_PLANKS_LOG_CABIN = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "spruce_planks_log_cabin");
        SPRUCE_PLANKS_PANELING = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "spruce_planks_paneling");
        SPRUCE_PLANKS_SHIPPING_CRATE = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "spruce_planks_shipping_crate");
        SPRUCE_PLANKS_SMOOTH = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "spruce_planks_smooth");
        SPRUCE_PLANKS_STACKED = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "spruce_planks_stacked");
        SPRUCE_PLANKS_VERTICAL = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "spruce_planks_vertical");
    }
}
