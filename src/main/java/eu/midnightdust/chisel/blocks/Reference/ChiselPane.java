package eu.midnightdust.chisel.blocks.Reference;

import eu.midnightdust.chisel.Chisel;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.PaneBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ChiselPane extends PaneBlock {

    public BlockItem blockItem;

    public ChiselPane(Material material, float hardness, float resistance, BlockSoundGroup sounds, ItemGroup group, String id) {
        super(FabricBlockSettings.of(material).strength(hardness, resistance).sounds(sounds));
        Registry.register(Registry.BLOCK, new Identifier(Chisel.MOD_ID, id), this);
        Registry.register(Registry.ITEM,new Identifier(Chisel.MOD_ID, id), blockItem = new BlockItem(this, new Item.Settings().group(group)));
    }

}
