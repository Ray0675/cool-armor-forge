package net.raylirov.coolarmor.item;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.SmithingTemplateItem;
import net.raylirov.coolarmor.CoolArmor;

import java.util.List;

public class GildedSmithingTemplateItem extends SmithingTemplateItem {
    public GildedSmithingTemplateItem(Component component, Component ingredients, Component description, Component baseSlotDescr, Component additionsSlotDescr, List<ResourceLocation> baseSlotEmptIcons, List<ResourceLocation> additonalSlotEmptIcons) {
        super(component, ingredients, description, baseSlotDescr, additionsSlotDescr, baseSlotEmptIcons, additonalSlotEmptIcons);
    }

    private static final ChatFormatting DESCRIPTION_FORMAT = ChatFormatting.BLUE;
    private static final ChatFormatting TITLE_FORMAT = ChatFormatting.GRAY;
    private static final Component GILDED_UPGRADE_BASE_SLOT_DESCRIPTION = Component.translatable("item." + CoolArmor.MOD_ID + ".smithing_template.gilded_upgrade.base_slot_description");
    private static final Component GILDED_UPGRADE_ADDITIONS_SLOT_DESCRIPTION = Component.translatable("item." + CoolArmor.MOD_ID + ".smithing_template.gilded_upgrade.additions_slot_description");
    private static final Component GILDED_UPGRADE = Component.translatable("upgrade." + CoolArmor.MOD_ID + ".gilded_upgrade").withStyle(TITLE_FORMAT);
    private static final Component GILDED_UPGRADE_APPLIES_TO = Component.translatable("item." + CoolArmor.MOD_ID + ".smithing_template.gilded_upgrade.applies_to").withStyle(DESCRIPTION_FORMAT);
    private static final Component GILDED_UPGRADE_INGREDIENTS = Component.translatable("item." + CoolArmor.MOD_ID + ".smithing_template.gilded_upgrade.ingredients").withStyle(DESCRIPTION_FORMAT);

    private static final ResourceLocation EMPTY_SLOT_HELMET = new ResourceLocation("item/empty_armor_slot_helmet");
    private static final ResourceLocation EMPTY_SLOT_CHESTPLATE = new ResourceLocation("item/empty_armor_slot_chestplate");
    private static final ResourceLocation EMPTY_SLOT_LEGGINGS = new ResourceLocation("item/empty_armor_slot_leggings");
    private static final ResourceLocation EMPTY_SLOT_BOOTS = new ResourceLocation("item/empty_armor_slot_boots");
    private static final ResourceLocation EMPTY_SLOT_INGOT = new ResourceLocation("item/empty_slot_ingot");

    private static List<ResourceLocation> createLeatherUpgradeIconList() {
        return List.of(EMPTY_SLOT_HELMET, EMPTY_SLOT_CHESTPLATE, EMPTY_SLOT_LEGGINGS, EMPTY_SLOT_BOOTS);
    }

    private static List<ResourceLocation> createLeatherUpgradeMaterialList() {
        return List.of(EMPTY_SLOT_INGOT);
    }

    public static GildedSmithingTemplateItem createLeatherUpgradeTemplate() {
        return new GildedSmithingTemplateItem(GILDED_UPGRADE_APPLIES_TO, GILDED_UPGRADE_INGREDIENTS, GILDED_UPGRADE, GILDED_UPGRADE_BASE_SLOT_DESCRIPTION, GILDED_UPGRADE_ADDITIONS_SLOT_DESCRIPTION, createLeatherUpgradeIconList(), createLeatherUpgradeMaterialList());
    }

}
