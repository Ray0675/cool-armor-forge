package net.raylirov.coolarmor.util;

import net.minecraft.advancements.critereon.*;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.registries.RegistryObject;
import net.raylirov.coolarmor.armor.ModArmorMaterials;
import net.raylirov.coolarmor.init.ModItems;

public class ArmorFilter {

    public static boolean isWearingWooledBoots(LivingEntity wearer){
        return wearer.getItemBySlot(EquipmentSlot.FEET).is(ModItems.IRON_WOOLED_BOOTS.get());
    }

    // For IF in ModelGen
    public static boolean trimArmorAnyLeatheredArmor(RegistryObject<Item> itemRegistryObject){
        if (itemRegistryObject.get() instanceof ArmorItem armorItem){
            return armorItem.getMaterial() == ModArmorMaterials.NETHERITE_LEATHERED ||
                    armorItem.getMaterial() == ModArmorMaterials.DIAMOND_LEATHERED ||
                    armorItem.getMaterial() == ModArmorMaterials.GOLD_LEATHERED ||
                    armorItem.getMaterial() == ModArmorMaterials.CHAIN_LEATHERED ||
                    armorItem.getMaterial() == ModArmorMaterials.IRON_LEATHERED;
        }
        return false;
    }

    public static boolean trimArmorAnyWooledArmor(RegistryObject<Item> itemRegistryObject){
        if (itemRegistryObject.get() instanceof ArmorItem armorItem){
            return armorItem.getMaterial() == ModArmorMaterials.IRON_WOOLED;
        }
        return false;

    }


    // For LeatheredArmorItem
    public static boolean anyLeatheredBoots(ItemStack stack){
        return stack.is(ModItems.NETHERITE_LEATHERED_BOOTS.get()) ||
                stack.is(ModItems.GOLD_LEATHERED_BOOTS.get()) ||
                stack.is(ModItems.CHAIN_LEATHERED_BOOTS.get()) ||
                stack.is(ModItems.DIAMOND_LEATHERED_BOOTS.get()) ||
                stack.is(ModItems.IRON_LEATHERED_BOOTS.get());
    }


    // For advancements

    public static InventoryChangeTrigger.TriggerInstance hasNetheriteLeatheredArmor() {
        return InventoryChangeTrigger.TriggerInstance.hasItems(
                ModItems.NETHERITE_LEATHERED_HELMET.get(),
                ModItems.NETHERITE_LEATHERED_CHESTPLATE.get(),
                ModItems.NETHERITE_LEATHERED_LEGGINGS.get(),
                ModItems.NETHERITE_LEATHERED_BOOTS.get());
    }

    public static InventoryChangeTrigger.TriggerInstance hasDiamondLeatheredArmor() {
        return InventoryChangeTrigger.TriggerInstance.hasItems(
                ModItems.DIAMOND_LEATHERED_HELMET.get(),
                ModItems.DIAMOND_LEATHERED_CHESTPLATE.get(),
                ModItems.DIAMOND_LEATHERED_LEGGINGS.get(),
                ModItems.DIAMOND_LEATHERED_BOOTS.get());
    }

    public static InventoryChangeTrigger.TriggerInstance hasGoldLeatheredArmor() {
        return InventoryChangeTrigger.TriggerInstance.hasItems(
                ModItems.GOLD_LEATHERED_HELMET.get(),
                ModItems.GOLD_LEATHERED_CHESTPLATE.get(),
                ModItems.GOLD_LEATHERED_LEGGINGS.get(),
                ModItems.GOLD_LEATHERED_BOOTS.get());
    }

    public static InventoryChangeTrigger.TriggerInstance hasChainLeatheredArmor() {
        return InventoryChangeTrigger.TriggerInstance.hasItems(
                ModItems.CHAIN_LEATHERED_HELMET.get(),
                ModItems.CHAIN_LEATHERED_CHESTPLATE.get(),
                ModItems.CHAIN_LEATHERED_LEGGINGS.get(),
                ModItems.CHAIN_LEATHERED_BOOTS.get());
    }

    public static InventoryChangeTrigger.TriggerInstance hasIronLeatheredArmor() {
        return InventoryChangeTrigger.TriggerInstance.hasItems(
                ModItems.IRON_LEATHERED_HELMET.get(),
                ModItems.IRON_LEATHERED_CHESTPLATE.get(),
                ModItems.IRON_LEATHERED_LEGGINGS.get(),
                ModItems.IRON_LEATHERED_BOOTS.get());
    }

    public static InventoryChangeTrigger.TriggerInstance hasNetheriteTurtleArmor() {
        return InventoryChangeTrigger.TriggerInstance.hasItems(
                ModItems.NETHERITE_TURTLE_HELMET.get(),
                ModItems.NETHERITE_TURTLE_CHESTPLATE.get(),
                ModItems.NETHERITE_TURTLE_LEGGINGS.get(),
                ModItems.NETHERITE_TURTLE_BOOTS.get());
    }

    public static InventoryChangeTrigger.TriggerInstance hasNetheriteGildedArmor() {
        return InventoryChangeTrigger.TriggerInstance.hasItems(
                ModItems.NETHERITE_GILDED_HELMET.get(),
                ModItems.NETHERITE_GILDED_CHESTPLATE.get(),
                ModItems.NETHERITE_GILDED_LEGGINGS.get(),
                ModItems.NETHERITE_GILDED_BOOTS.get());
    }
    // For advancements


    // For ModPlayer
    public static boolean isWearingNetheriteTurtleArmor(LivingEntity wearer){
        return wearer.getItemBySlot(EquipmentSlot.HEAD).is(ModItems.NETHERITE_TURTLE_HELMET.get()) &&
                wearer.getItemBySlot(EquipmentSlot.CHEST).is(ModItems.NETHERITE_TURTLE_CHESTPLATE.get()) &&
                wearer.getItemBySlot(EquipmentSlot.LEGS).is(ModItems.NETHERITE_TURTLE_LEGGINGS.get()) &&
                wearer.getItemBySlot(EquipmentSlot.FEET).is(ModItems.NETHERITE_TURTLE_BOOTS.get());
    }

    public static boolean isWearingGildedBoots(LivingEntity wearer){
        return wearer.getItemBySlot(EquipmentSlot.FEET).is(ModItems.NETHERITE_GILDED_BOOTS.get());
    }

    // For IDK for what
    /*
    public static boolean isWearingAnyLeatheredArmor(LivingEntity wearer){
        return isWearingNetheriteLeatheredArmor(wearer) ||
                isWearingDiamondLeatheredArmor(wearer) ||
                isWearingGoldLeatheredArmor(wearer) ||
                isWearingChainLeatheredArmor(wearer) ||
                isWearingIronLeatheredArmor(wearer);
    }

    public static boolean isWearingNetheriteLeatheredArmor(LivingEntity wearer){
        return wearer.getItemBySlot(EquipmentSlot.HEAD).is(ModItems.NETHERITE_LEATHERED_HELMET.get()) &&
                wearer.getItemBySlot(EquipmentSlot.CHEST).is(ModItems.NETHERITE_LEATHERED_CHESTPLATE.get()) &&
                wearer.getItemBySlot(EquipmentSlot.LEGS).is(ModItems.NETHERITE_LEATHERED_LEGGINGS.get()) &&
                wearer.getItemBySlot(EquipmentSlot.FEET).is(ModItems.NETHERITE_LEATHERED_BOOTS.get());
    }
    public static boolean isWearingDiamondLeatheredArmor(LivingEntity wearer){
        return wearer.getItemBySlot(EquipmentSlot.HEAD).is(ModItems.DIAMOND_LEATHERED_HELMET.get()) &&
                wearer.getItemBySlot(EquipmentSlot.CHEST).is(ModItems.DIAMOND_LEATHERED_CHESTPLATE.get()) &&
                wearer.getItemBySlot(EquipmentSlot.LEGS).is(ModItems.DIAMOND_LEATHERED_LEGGINGS.get()) &&
                wearer.getItemBySlot(EquipmentSlot.FEET).is(ModItems.DIAMOND_LEATHERED_BOOTS.get());
    }
    public static boolean isWearingGoldLeatheredArmor(LivingEntity wearer){
        return wearer.getItemBySlot(EquipmentSlot.HEAD).is(ModItems.GOLD_LEATHERED_HELMET.get()) &&
                wearer.getItemBySlot(EquipmentSlot.CHEST).is(ModItems.GOLD_LEATHERED_CHESTPLATE.get()) &&
                wearer.getItemBySlot(EquipmentSlot.LEGS).is(ModItems.GOLD_LEATHERED_LEGGINGS.get()) &&
                wearer.getItemBySlot(EquipmentSlot.FEET).is(ModItems.GOLD_LEATHERED_BOOTS.get());
    }
    public static boolean isWearingChainLeatheredArmor(LivingEntity wearer){
        return wearer.getItemBySlot(EquipmentSlot.HEAD).is(ModItems.CHAIN_LEATHERED_HELMET.get()) &&
                wearer.getItemBySlot(EquipmentSlot.CHEST).is(ModItems.CHAIN_LEATHERED_CHESTPLATE.get()) &&
                wearer.getItemBySlot(EquipmentSlot.LEGS).is(ModItems.CHAIN_LEATHERED_LEGGINGS.get()) &&
                wearer.getItemBySlot(EquipmentSlot.FEET).is(ModItems.CHAIN_LEATHERED_BOOTS.get());
    }
    public static boolean isWearingIronLeatheredArmor(LivingEntity wearer){
        return wearer.getItemBySlot(EquipmentSlot.HEAD).is(ModItems.IRON_LEATHERED_HELMET.get()) &&
                wearer.getItemBySlot(EquipmentSlot.CHEST).is(ModItems.IRON_LEATHERED_CHESTPLATE.get()) &&
                wearer.getItemBySlot(EquipmentSlot.LEGS).is(ModItems.IRON_LEATHERED_LEGGINGS.get()) &&
                wearer.getItemBySlot(EquipmentSlot.FEET).is(ModItems.IRON_LEATHERED_BOOTS.get());
    }
    */

}
