package eu.midnightdust.chisel.blocks.Planks;

import eu.midnightdust.chisel.blocks.Reference.ChiselBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

import static eu.midnightdust.chisel.Chisel.ChiselPlanksGroup;

public class ChiselDarkOakPlanks {
    public static Block DARK_OAK_PLANKS_BRACED;
    public static Block DARK_OAK_PLANKS_BRAID;
    public static Block DARK_OAK_PLANKS_CRUDE_HORIZONTAL;
    public static Block DARK_OAK_PLANKS_CRUDE_PANELING;
    public static Block DARK_OAK_PLANKS_CRUDE_VERTICAL;
    public static Block DARK_OAK_PLANKS_ENCASED_LARGE;
    public static Block DARK_OAK_PLANKS_ENCASED;
    public static Block DARK_OAK_PLANKS_ENCASED_SMOOTH;
    public static Block DARK_OAK_PLANKS_LARGE;
    public static Block DARK_OAK_PLANKS_LOG_CABIN;
    public static Block DARK_OAK_PLANKS_PANELING;
    public static Block DARK_OAK_PLANKS_SHIPPING_CRATE;
    public static Block DARK_OAK_PLANKS_SMOOTH;
    public static Block DARK_OAK_PLANKS_STACKED;
    public static Block DARK_OAK_PLANKS_VERTICAL;

    public static void init() {
        DARK_OAK_PLANKS_BRACED = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "dark_oak_planks_braced");
        DARK_OAK_PLANKS_BRAID = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "dark_oak_planks_braid");
        DARK_OAK_PLANKS_CRUDE_HORIZONTAL = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "dark_oak_planks_crude_horizontal");
        DARK_OAK_PLANKS_CRUDE_PANELING = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "dark_oak_planks_crude_paneling");
        DARK_OAK_PLANKS_CRUDE_VERTICAL = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "dark_oak_planks_crude_vertical");
        DARK_OAK_PLANKS_ENCASED_LARGE = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "dark_oak_planks_encased_large");
        DARK_OAK_PLANKS_ENCASED = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "dark_oak_planks_encased");
        DARK_OAK_PLANKS_ENCASED_SMOOTH = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "dark_oak_planks_encased_smooth");
        DARK_OAK_PLANKS_LARGE = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "dark_oak_planks_large");
        DARK_OAK_PLANKS_LOG_CABIN = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "dark_oak_planks_log_cabin");
        DARK_OAK_PLANKS_PANELING = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "dark_oak_planks_paneling");
        DARK_OAK_PLANKS_SHIPPING_CRATE = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "dark_oak_planks_shipping_crate");
        DARK_OAK_PLANKS_SMOOTH = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "dark_oak_planks_smooth");
        DARK_OAK_PLANKS_STACKED = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "dark_oak_planks_stacked");
        DARK_OAK_PLANKS_VERTICAL = new ChiselBlock(Material.WOOD, 2f,3f, BlockSoundGroup.WOOD, ChiselPlanksGroup, "dark_oak_planks_vertical");
    }
}
