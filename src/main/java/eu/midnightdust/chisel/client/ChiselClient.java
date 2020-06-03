package eu.midnightdust.chisel.client;

import eu.midnightdust.chisel.blocks.Bookshelf.*;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class ChiselClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ChiselAcaciaBookshelf.ACACIA_BOOKSHELF_ABANDONED);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ChiselAcaciaBookshelf.ACACIA_BOOKSHELF_BRIM);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ChiselAcaciaBookshelf.ACACIA_BOOKSHELF_CANS);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ChiselAcaciaBookshelf.ACACIA_BOOKSHELF_HISTORIAN);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ChiselAcaciaBookshelf.ACACIA_BOOKSHELF_HOARDER);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ChiselAcaciaBookshelf.ACACIA_BOOKSHELF_NECROMANCER);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ChiselAcaciaBookshelf.ACACIA_BOOKSHELF_NOVICE_NECROMANCER);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ChiselAcaciaBookshelf.ACACIA_BOOKSHELF_PAPERS);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ChiselAcaciaBookshelf.ACACIA_BOOKSHELF_RAINBOW);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ChiselAcaciaBookshelf.ACACIA_BOOKSHELF_REDTOMES);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ChiselBirchBookshelf.BIRCH_BOOKSHELF_ABANDONED);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ChiselBirchBookshelf.BIRCH_BOOKSHELF_BRIM);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ChiselBirchBookshelf.BIRCH_BOOKSHELF_CANS);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ChiselBirchBookshelf.BIRCH_BOOKSHELF_HISTORIAN);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ChiselBirchBookshelf.BIRCH_BOOKSHELF_HOARDER);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ChiselBirchBookshelf.BIRCH_BOOKSHELF_NECROMANCER);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ChiselBirchBookshelf.BIRCH_BOOKSHELF_NOVICE_NECROMANCER);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ChiselBirchBookshelf.BIRCH_BOOKSHELF_PAPERS);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ChiselBirchBookshelf.BIRCH_BOOKSHELF_RAINBOW);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ChiselBirchBookshelf.BIRCH_BOOKSHELF_REDTOMES);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ChiselDarkOakBookshelf.DARK_OAK_BOOKSHELF_ABANDONED);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ChiselDarkOakBookshelf.DARK_OAK_BOOKSHELF_BRIM);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ChiselDarkOakBookshelf.DARK_OAK_BOOKSHELF_CANS);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ChiselDarkOakBookshelf.DARK_OAK_BOOKSHELF_HISTORIAN);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ChiselDarkOakBookshelf.DARK_OAK_BOOKSHELF_HOARDER);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ChiselDarkOakBookshelf.DARK_OAK_BOOKSHELF_NECROMANCER);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ChiselDarkOakBookshelf.DARK_OAK_BOOKSHELF_NOVICE_NECROMANCER);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ChiselDarkOakBookshelf.DARK_OAK_BOOKSHELF_PAPERS);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ChiselDarkOakBookshelf.DARK_OAK_BOOKSHELF_RAINBOW);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ChiselDarkOakBookshelf.DARK_OAK_BOOKSHELF_REDTOMES);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ChiselJungleBookshelf.JUNGLE_BOOKSHELF_ABANDONED);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ChiselJungleBookshelf.JUNGLE_BOOKSHELF_BRIM);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ChiselJungleBookshelf.JUNGLE_BOOKSHELF_CANS);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ChiselJungleBookshelf.JUNGLE_BOOKSHELF_HISTORIAN);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ChiselJungleBookshelf.JUNGLE_BOOKSHELF_HOARDER);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ChiselJungleBookshelf.JUNGLE_BOOKSHELF_NECROMANCER);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ChiselJungleBookshelf.JUNGLE_BOOKSHELF_NOVICE_NECROMANCER);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ChiselJungleBookshelf.JUNGLE_BOOKSHELF_PAPERS);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ChiselJungleBookshelf.JUNGLE_BOOKSHELF_RAINBOW);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ChiselJungleBookshelf.JUNGLE_BOOKSHELF_REDTOMES);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ChiselOakBookshelf.OAK_BOOKSHELF_ABANDONED);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ChiselOakBookshelf.OAK_BOOKSHELF_BRIM);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ChiselOakBookshelf.OAK_BOOKSHELF_CANS);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ChiselOakBookshelf.OAK_BOOKSHELF_HISTORIAN);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ChiselOakBookshelf.OAK_BOOKSHELF_HOARDER);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ChiselOakBookshelf.OAK_BOOKSHELF_NECROMANCER);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ChiselOakBookshelf.OAK_BOOKSHELF_NOVICE_NECROMANCER);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ChiselOakBookshelf.OAK_BOOKSHELF_PAPERS);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ChiselOakBookshelf.OAK_BOOKSHELF_RAINBOW);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ChiselOakBookshelf.OAK_BOOKSHELF_REDTOMES);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ChiselSpruceBookshelf.SPRUCE_BOOKSHELF_ABANDONED);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ChiselSpruceBookshelf.SPRUCE_BOOKSHELF_BRIM);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ChiselSpruceBookshelf.SPRUCE_BOOKSHELF_CANS);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ChiselSpruceBookshelf.SPRUCE_BOOKSHELF_HISTORIAN);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ChiselSpruceBookshelf.SPRUCE_BOOKSHELF_HOARDER);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ChiselSpruceBookshelf.SPRUCE_BOOKSHELF_NECROMANCER);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ChiselSpruceBookshelf.SPRUCE_BOOKSHELF_NOVICE_NECROMANCER);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ChiselSpruceBookshelf.SPRUCE_BOOKSHELF_PAPERS);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ChiselSpruceBookshelf.SPRUCE_BOOKSHELF_RAINBOW);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ChiselSpruceBookshelf.SPRUCE_BOOKSHELF_REDTOMES);
    }

}
