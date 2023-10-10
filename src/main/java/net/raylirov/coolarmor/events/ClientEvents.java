package net.raylirov.coolarmor.events;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterGuiOverlaysEvent;
import net.minecraftforge.client.gui.overlay.VanillaGuiOverlay;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.raylirov.coolarmor.CoolArmor;
import net.raylirov.coolarmor.client.ThirstHudOverlay;

public class ClientEvents {
    @Mod.EventBusSubscriber(modid = CoolArmor.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModBusEvents {
        @SubscribeEvent
        public static void registerGuiOverlays(RegisterGuiOverlaysEvent event) {
          event.registerBelow(VanillaGuiOverlay.HOTBAR.id(),"thirst", ThirstHudOverlay.HUD_THIRST);
        }

    }
}
