package net.raylirov.coolarmor.events;


import net.minecraft.core.cauldron.CauldronInteraction;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.raylirov.coolarmor.CoolArmor;
import net.raylirov.coolarmor.init.ModItems;

@Mod.EventBusSubscriber(modid = CoolArmor.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class FMLCommonSetupEventHandler {
    @SubscribeEvent
    public static void handle(FMLCommonSetupEvent event) {

        CauldronInteraction.WATER.put(ModItems.IRON_WOOLED_BOOTS.get(), CauldronInteraction.DYED_ITEM);

        CauldronInteraction.WATER.put(ModItems.NETHERITE_LEATHERED_HELMET.get(), CauldronInteraction.DYED_ITEM);
        CauldronInteraction.WATER.put(ModItems.NETHERITE_LEATHERED_CHESTPLATE.get(), CauldronInteraction.DYED_ITEM);
        CauldronInteraction.WATER.put(ModItems.NETHERITE_LEATHERED_LEGGINGS.get(), CauldronInteraction.DYED_ITEM);
        CauldronInteraction.WATER.put(ModItems.NETHERITE_LEATHERED_BOOTS.get(), CauldronInteraction.DYED_ITEM);

        CauldronInteraction.WATER.put(ModItems.DIAMOND_LEATHERED_HELMET.get(), CauldronInteraction.DYED_ITEM);
        CauldronInteraction.WATER.put(ModItems.DIAMOND_LEATHERED_CHESTPLATE.get(), CauldronInteraction.DYED_ITEM);
        CauldronInteraction.WATER.put(ModItems.DIAMOND_LEATHERED_LEGGINGS.get(), CauldronInteraction.DYED_ITEM);
        CauldronInteraction.WATER.put(ModItems.DIAMOND_LEATHERED_BOOTS.get(), CauldronInteraction.DYED_ITEM);

        CauldronInteraction.WATER.put(ModItems.GOLD_LEATHERED_HELMET.get(), CauldronInteraction.DYED_ITEM);
        CauldronInteraction.WATER.put(ModItems.GOLD_LEATHERED_CHESTPLATE.get(), CauldronInteraction.DYED_ITEM);
        CauldronInteraction.WATER.put(ModItems.GOLD_LEATHERED_LEGGINGS.get(), CauldronInteraction.DYED_ITEM);
        CauldronInteraction.WATER.put(ModItems.GOLD_LEATHERED_BOOTS.get(), CauldronInteraction.DYED_ITEM);

        CauldronInteraction.WATER.put(ModItems.CHAIN_LEATHERED_HELMET.get(), CauldronInteraction.DYED_ITEM);
        CauldronInteraction.WATER.put(ModItems.CHAIN_LEATHERED_CHESTPLATE.get(), CauldronInteraction.DYED_ITEM);
        CauldronInteraction.WATER.put(ModItems.CHAIN_LEATHERED_LEGGINGS.get(), CauldronInteraction.DYED_ITEM);
        CauldronInteraction.WATER.put(ModItems.CHAIN_LEATHERED_BOOTS.get(), CauldronInteraction.DYED_ITEM);

        CauldronInteraction.WATER.put(ModItems.IRON_LEATHERED_HELMET.get(), CauldronInteraction.DYED_ITEM);
        CauldronInteraction.WATER.put(ModItems.IRON_LEATHERED_CHESTPLATE.get(), CauldronInteraction.DYED_ITEM);
        CauldronInteraction.WATER.put(ModItems.IRON_LEATHERED_LEGGINGS.get(), CauldronInteraction.DYED_ITEM);
        CauldronInteraction.WATER.put(ModItems.IRON_LEATHERED_BOOTS.get(), CauldronInteraction.DYED_ITEM);


    }

}
