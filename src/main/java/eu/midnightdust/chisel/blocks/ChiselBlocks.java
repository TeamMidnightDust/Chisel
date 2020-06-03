package eu.midnightdust.chisel.blocks;

import eu.midnightdust.chisel.Chisel;
import eu.midnightdust.chisel.blocks.Concrete.*;
import eu.midnightdust.chisel.blocks.Bookshelf.*;
import eu.midnightdust.chisel.blocks.Minerals.*;
import eu.midnightdust.chisel.blocks.Planks.*;
import eu.midnightdust.chisel.blocks.Stone.*;
import eu.midnightdust.chisel.blocks.Unique.*;
import eu.midnightdust.chisel.blocks.Wool.*;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class ChiselBlocks {
    public static final Set<Block> WOODCUTTERS = new HashSet<>();
    private static final Random RANDOM = new Random();
    private static ItemStack RANDOM_STACK = ItemStack.EMPTY;
    public static void init() {
        ChiselAndesite.init();
        ChiselAntiblock.init();
        ChiselBasalt.init();
        ChiselBricks.init();
        ChiselCharcoal.init();
        ChiselCoal.init();
        ChiselCobblestone.init();
        ChiselBlackConcrete.init();
        ChiselBlueConcrete.init();
        ChiselBrownConcrete.init();
        ChiselCyanConcrete.init();
        ChiselGrayConcrete.init();
        ChiselGreenConcrete.init();
        ChiselLightBlueConcrete.init();
        ChiselLightGrayConcrete.init();
        ChiselLimeConcrete.init();
        ChiselMagentaConcrete.init();
        ChiselOrangeConcrete.init();
        ChiselPinkConcrete.init();
        ChiselPurpleConcrete.init();
        ChiselRedConcrete.init();
        ChiselWhiteConcrete.init();
        ChiselYellowConcrete.init();
        ChiselAcaciaBookshelf.init();
        ChiselBirchBookshelf.init();
        ChiselDarkOakBookshelf.init();
        ChiselJungleBookshelf.init();
        ChiselOakBookshelf.init();
        ChiselSpruceBookshelf.init();
        ChiselFactory.init();
        ChiselLimestone.init();
        ChiselAcaciaPlanks.init();
        ChiselBirchPlanks.init();
        ChiselDarkOakPlanks.init();
        ChiselJunglePlanks.init();
        ChiselOakPlanks.init();
        ChiselSprucePlanks.init();
        ChiselStoneBricks.init();
        ChiselMarble.init();
        ChiselTyrian.init();
        ChiselBlackWool.init();
        ChiselBlueWool.init();
        ChiselBrownWool.init();
        ChiselCyanWool.init();
        ChiselGrayWool.init();
        ChiselGreenWool.init();
        ChiselLightBlueWool.init();
        ChiselLightGrayWool.init();
        ChiselLimeWool.init();
        ChiselMagentaWool.init();
        ChiselOrangeWool.init();
        ChiselPinkWool.init();
        ChiselPurpleWool.init();
        ChiselRedWool.init();
        ChiselWhiteWool.init();
        ChiselYellowWool.init();
    }
    public static ItemStack createRandomStack() {
        if (RANDOM_STACK.isEmpty()) {
            RANDOM_STACK = new ItemStack(ChiselBlocks.WOODCUTTERS.stream().skip(RANDOM.nextInt(ChiselBlocks.WOODCUTTERS.size())).findFirst().orElse(Blocks.STONECUTTER));
        }
        return RANDOM_STACK;
    }
}

