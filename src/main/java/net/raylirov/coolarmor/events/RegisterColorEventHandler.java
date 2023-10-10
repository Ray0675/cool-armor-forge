package net.raylirov.coolarmor.events;


import net.minecraft.client.color.item.ItemColor;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.raylirov.coolarmor.CoolArmor;
import net.raylirov.coolarmor.armor.LeatheredArmorItem;
import net.raylirov.coolarmor.armor.WooledArmorItem;
import net.raylirov.coolarmor.init.ModItems;

@Mod.EventBusSubscriber(modid = CoolArmor.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RegisterColorEventHandler {
    @SubscribeEvent
    public static void handleItem(RegisterColorHandlersEvent.Item event) {
        event.register(new ItemColor() {


                    public int getColor(ItemStack itemStack, int tintIndex) {
                        return tintIndex > 0 ? -1 : ((LeatheredArmorItem) itemStack.getItem()).getColor(itemStack);
                    }},


                ModItems.IRON_WOOLED_BOOTS.get(),

                ModItems.NETHERITE_LEATHERED_HELMET.get(),
                ModItems.NETHERITE_LEATHERED_CHESTPLATE.get(),
                ModItems.NETHERITE_LEATHERED_LEGGINGS.get(),
                ModItems.NETHERITE_LEATHERED_BOOTS.get(),

                ModItems.DIAMOND_LEATHERED_HELMET.get(),
                ModItems.DIAMOND_LEATHERED_CHESTPLATE.get(),
                ModItems.DIAMOND_LEATHERED_LEGGINGS.get(),
                ModItems.DIAMOND_LEATHERED_BOOTS.get(),

                ModItems.GOLD_LEATHERED_HELMET.get(),
                ModItems.GOLD_LEATHERED_CHESTPLATE.get(),
                ModItems.GOLD_LEATHERED_LEGGINGS.get(),
                ModItems.GOLD_LEATHERED_BOOTS.get(),

                ModItems.CHAIN_LEATHERED_HELMET.get(),
                ModItems.CHAIN_LEATHERED_CHESTPLATE.get(),
                ModItems.CHAIN_LEATHERED_LEGGINGS.get(),
                ModItems.CHAIN_LEATHERED_BOOTS.get(),

                ModItems.IRON_LEATHERED_HELMET.get(),
                ModItems.IRON_LEATHERED_CHESTPLATE.get(),
                ModItems.IRON_LEATHERED_LEGGINGS.get(),
                ModItems.IRON_LEATHERED_BOOTS.get()
        );

        event.register(new ItemColor() {
                           public int getColor(ItemStack itemStack, int tintIndex) {
                               return tintIndex > 0 ? -1 : ((WooledArmorItem) itemStack.getItem()).getColor(itemStack);
                           }},
                ModItems.IRON_WOOLED_BOOTS.get()
        );
    }
}
