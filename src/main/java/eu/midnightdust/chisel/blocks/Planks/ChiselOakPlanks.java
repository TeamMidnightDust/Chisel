package eu.midnightdust.chisel.blocks.Planks;

import eu.midnightdust.chisel.blocks.Reference.ChiselBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

import static eu.midnightdust.chisel.Chisel.ChiselPlanksGroup;

public class ChiselOakPlanks {
    public static Block OAK_PLANKS_BRACED;
    public static Block OAK_PLANKS_BRAID;
    public static Block OAK_PLANKS_CRUDE_HORIZONTAL;
    public static Block OAK_PLANKS_CRUDE_PANELING;
    public static Block OAK_PLANKS_CRUDE_VERTICAL;
    public static Block OAK_PLANKS_ENCASED_LARGE;
    public static Block OAK_PLANKS_ENCASED;
    public static Block OAK_PLANKS_ENCASED_SMOOTH;
    public static Block OAK_PLANKS_LARGE;
    public static Block OAK_PLANKS_LOG_CABIN;
    public static Block OAK_PLANKS_PANELING;
    public static Block OAK_PLANKS_SHIPPING_CRATE;
    public static Block OAK_PLANKS_SMOOTH;
    public static Block OAK_PLANKS_STACKED;
    public static Block OAK_PLANKS_VERTICAL;

    public static void init() {
        OAK_PLANKS_BRACED = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "oak_planks_braced");
        OAK_PLANKS_BRAID = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "oak_planks_braid");
        OAK_PLANKS_CRUDE_HORIZONTAL = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "oak_planks_crude_horizontal");
        OAK_PLANKS_CRUDE_PANELING = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "oak_planks_crude_paneling");
        OAK_PLANKS_CRUDE_VERTICAL = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "oak_planks_crude_vertical");
        OAK_PLANKS_ENCASED_LARGE = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "oak_planks_encased_large");
        OAK_PLANKS_ENCASED = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "oak_planks_encased");
        OAK_PLANKS_ENCASED_SMOOTH = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "oak_planks_encased_smooth");
        OAK_PLANKS_LARGE = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "oak_planks_large");
        OAK_PLANKS_LOG_CABIN = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "oak_planks_log_cabin");
        OAK_PLANKS_PANELING = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "oak_planks_paneling");
        OAK_PLANKS_SHIPPING_CRATE = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "oak_planks_shipping_crate");
        OAK_PLANKS_SMOOTH = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "oak_planks_smooth");
        OAK_PLANKS_STACKED = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "oak_planks_stacked");
        OAK_PLANKS_VERTICAL = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "oak_planks_vertical");
    }
}
