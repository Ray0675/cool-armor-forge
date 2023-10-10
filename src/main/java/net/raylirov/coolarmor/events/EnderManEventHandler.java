package net.raylirov.coolarmor.events;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.living.EnderManAngerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.raylirov.coolarmor.CoolArmor;
import net.raylirov.coolarmor.armor.ModArmorItem;
import net.raylirov.coolarmor.init.ModItems;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
@Mod.EventBusSubscriber(modid = CoolArmor.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class EnderManEventHandler {

    @SuppressWarnings("unused")
    @SubscribeEvent
    public static void onEnderManAngerEvent(final EnderManAngerEvent event)
    {
        Player player = event.getPlayer(); // Gets the player (target)
        EnderMan enderMan = event.getEntity(); // Gets the enderman

        // return early if player is in creative mode
        if (player.isCreative())
            return;

        for (ItemStack stack : player.getArmorSlots())
        {
            Item item = stack.getItem();
            if (item instanceof ModArmorItem && player.getItemBySlot(EquipmentSlot.HEAD).is(ModItems.NETHERITE_TINTED_HELMET.get()))
            {
                event.setCanceled(true); // Cancels the enderman anger if conditions are met
            }
        }
    }
}
