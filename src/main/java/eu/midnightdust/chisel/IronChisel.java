package eu.midnightdust.chisel;

import net.fabricmc.fabric.api.container.ContainerProviderRegistry;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class IronChisel extends Item {
    public IronChisel(Settings settings){
        super(settings);
    }
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        user.setCurrentHand(hand);

        if(world != null && !world.isClient) {
            ContainerProviderRegistry.INSTANCE.openContainer(Chisel.CHISEL_CONTAINER, user, buf -> { });
        }

        return TypedActionResult.success(user.getStackInHand(hand));
    }
}
