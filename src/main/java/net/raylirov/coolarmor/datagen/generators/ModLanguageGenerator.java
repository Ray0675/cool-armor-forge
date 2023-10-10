package net.raylirov.coolarmor.datagen.generators;

import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;
import net.raylirov.coolarmor.CoolArmor;
import net.raylirov.coolarmor.datagen.providers.ModTranslationKeyTypeProvider;

import java.util.HashMap;
import java.util.Map;

import static net.raylirov.coolarmor.datagen.providers.ModTranslationKeyProvider.*;

public class ModLanguageGenerator extends LanguageProvider {

    private final String lang;
    private final Map<String, String> keyMap = new HashMap<>();

    public ModLanguageGenerator(PackOutput output, String locale) {
        super(output, CoolArmor.MOD_ID, locale);
        this.lang = locale;
    }

    @Override
    protected void addTranslations() {
        this.gatherKeyMapData();
        keyMap.forEach(this::add);
    }

    private void gatherKeyMapData(){
        if (lang.equals("en_us")) {
            
            keyMap.put(tabsTranslationKeyFor("cool_items_tab"), "Cool Items");
            
            keyMap.put(advancementTranslationKeyFor("rdy_for_winter", ModTranslationKeyTypeProvider.AdvancementKeySubType.TITLE), "Ready for Winter!");
            keyMap.put(advancementTranslationKeyFor("rdy_for_winter", ModTranslationKeyTypeProvider.AdvancementKeySubType.DESCRIPTION), "Get a full suit of Winterized armor.");

            keyMap.put(advancementTranslationKeyFor("turtle_power", ModTranslationKeyTypeProvider.AdvancementKeySubType.TITLE), "Turtle power!");
            keyMap.put(advancementTranslationKeyFor("turtle_power", ModTranslationKeyTypeProvider.AdvancementKeySubType.DESCRIPTION), "Get a full suit of Shell armor.");

            keyMap.put(advancementTranslationKeyFor("gilded", ModTranslationKeyTypeProvider.AdvancementKeySubType.TITLE), "Shiny!");
            keyMap.put(advancementTranslationKeyFor("gilded", ModTranslationKeyTypeProvider.AdvancementKeySubType.DESCRIPTION), "Get a full suit of gilded armor.");

            keyMap.put(itemTranslationKeyFor("netherite_tinted_helmet"), "Tinted helmet");

            keyMap.put(itemTranslationKeyFor("iron_wooled_boots"), "Iron wooled boots");

            keyMap.put(itemTranslationKeyFor("netherite_gilded_helmet"), "Gilded helmet");
            keyMap.put(itemTranslationKeyFor("netherite_gilded_chestplate"), "Gilded chestplate");
            keyMap.put(itemTranslationKeyFor("netherite_gilded_leggings"), "Gilded leggings");
            keyMap.put(itemTranslationKeyFor("netherite_gilded_boots"), "Gilded boots");

            keyMap.put(itemTranslationKeyFor("netherite_turtle_helmet"), "Shell helmet");
            keyMap.put(itemTranslationKeyFor("netherite_turtle_chestplate"), "Shell chestplate");
            keyMap.put(itemTranslationKeyFor("netherite_turtle_leggings"), "Shell leggings");
            keyMap.put(itemTranslationKeyFor("netherite_turtle_boots"), "Shell boots");

            keyMap.put(itemTranslationKeyFor("netherite_leathered_helmet"), "Winterized netherite helmet");
            keyMap.put(itemTranslationKeyFor("netherite_leathered_chestplate"), "Winterized netherite chestplate");
            keyMap.put(itemTranslationKeyFor("netherite_leathered_leggings"), "Winterized netherite leggings");
            keyMap.put(itemTranslationKeyFor("netherite_leathered_boots"), "Winterized netherite boots");

            keyMap.put(itemTranslationKeyFor("diamond_leathered_helmet"), "Winterized diamond helmet");
            keyMap.put(itemTranslationKeyFor("diamond_leathered_chestplate"), "Winterized diamond chestplate");
            keyMap.put(itemTranslationKeyFor("diamond_leathered_leggings"), "Winterized diamond leggings");
            keyMap.put(itemTranslationKeyFor("diamond_leathered_boots"), "Winterized diamond boots");

            keyMap.put(itemTranslationKeyFor("gold_leathered_helmet"), "Winterized golden helmet");
            keyMap.put(itemTranslationKeyFor("gold_leathered_chestplate"), "Winterized golden chestplate");
            keyMap.put(itemTranslationKeyFor("gold_leathered_leggings"), "Winterized golden leggings");
            keyMap.put(itemTranslationKeyFor("gold_leathered_boots"), "Winterized golden boots");

            keyMap.put(itemTranslationKeyFor("chain_leathered_helmet"), "Winterized chainmail helmet");
            keyMap.put(itemTranslationKeyFor("chain_leathered_chestplate"), "Winterized chainmail chestplate");
            keyMap.put(itemTranslationKeyFor("chain_leathered_leggings"), "Winterized chainmail leggings");
            keyMap.put(itemTranslationKeyFor("chain_leathered_boots"), "Winterized chainmail boots");

            keyMap.put(itemTranslationKeyFor("iron_leathered_helmet"), "Winterized iron helmet");
            keyMap.put(itemTranslationKeyFor("iron_leathered_chestplate"), "Winterized iron chestplate");
            keyMap.put(itemTranslationKeyFor("iron_leathered_leggings"), "Winterized iron leggings");
            keyMap.put(itemTranslationKeyFor("iron_leathered_boots"), "Winterized iron boots");

            keyMap.put(upgradeTranslationKeyFor("leather_upgrade"), "Leather Upgrade");
            keyMap.put(itemTranslationKeyFor("smithing_template.leather_upgrade.additions_slot_description"), "Add Leather");
            keyMap.put(itemTranslationKeyFor("smithing_template.leather_upgrade.applies_to"), "All armor, except leather");
            keyMap.put(itemTranslationKeyFor("smithing_template.leather_upgrade.base_slot_description"), "Add any armor, except leather");
            keyMap.put(itemTranslationKeyFor("smithing_template.leather_upgrade.ingredients"), "Leather");

            keyMap.put(upgradeTranslationKeyFor("turtle_upgrade"), "Turtle Upgrade");
            keyMap.put(itemTranslationKeyFor("smithing_template.turtle_upgrade.additions_slot_description"), "Add scute");
            keyMap.put(itemTranslationKeyFor("smithing_template.turtle_upgrade.applies_to"), "Netherite armor");
            keyMap.put(itemTranslationKeyFor("smithing_template.turtle_upgrade.base_slot_description"), "Add netherite armor");
            keyMap.put(itemTranslationKeyFor("smithing_template.turtle_upgrade.ingredients"), "Scute");

            keyMap.put(upgradeTranslationKeyFor("gilded_upgrade"), "Gilded Upgrade");
            keyMap.put(itemTranslationKeyFor("smithing_template.gilded_upgrade.additions_slot_description"), "Add Gold");
            keyMap.put(itemTranslationKeyFor("smithing_template.gilded_upgrade.applies_to"), "Netherite armor");
            keyMap.put(itemTranslationKeyFor("smithing_template.gilded_upgrade.base_slot_description"), "Add netherite armor");
            keyMap.put(itemTranslationKeyFor("smithing_template.gilded_upgrade.ingredients"), "Gold");

        }

        if (lang.equals("ru_ru")) {
            keyMap.put(tabsTranslationKeyFor("cool_items_tab"), "Cool Items");

            keyMap.put(advancementTranslationKeyFor("rdy_for_winter", ModTranslationKeyTypeProvider.AdvancementKeySubType.TITLE), "К Зиме готов!");
            keyMap.put(advancementTranslationKeyFor("rdy_for_winter", ModTranslationKeyTypeProvider.AdvancementKeySubType.DESCRIPTION), "Получите полный комплект утеплённой брони.");

            keyMap.put(advancementTranslationKeyFor("turtle_power", ModTranslationKeyTypeProvider.AdvancementKeySubType.TITLE), "Черепашья мощь!");
            keyMap.put(advancementTranslationKeyFor("turtle_power", ModTranslationKeyTypeProvider.AdvancementKeySubType.DESCRIPTION), "Получите полный комплект панцириевой брони.");

            keyMap.put(advancementTranslationKeyFor("gilded", ModTranslationKeyTypeProvider.AdvancementKeySubType.TITLE), "Блестяще!");
            keyMap.put(advancementTranslationKeyFor("gilded", ModTranslationKeyTypeProvider.AdvancementKeySubType.DESCRIPTION), "Получите полный комплект золочёной брони.");

            keyMap.put(itemTranslationKeyFor("netherite_tinted_helmet"), "Тонированный шлем");

            keyMap.put(itemTranslationKeyFor("iron_wooled_boots"), "Железные подкрадули");

            keyMap.put(itemTranslationKeyFor("netherite_gilded_helmet"), "Золочёный шлем");
            keyMap.put(itemTranslationKeyFor("netherite_gilded_chestplate"), "Золочёный нагрудник");
            keyMap.put(itemTranslationKeyFor("netherite_gilded_leggings"), "Золочёные поножи");
            keyMap.put(itemTranslationKeyFor("netherite_gilded_boots"), "Золоченые ботинки");

            keyMap.put(itemTranslationKeyFor("netherite_turtle_helmet"), "Панцирный шлем");
            keyMap.put(itemTranslationKeyFor("netherite_turtle_chestplate"), "Панцирный нагрудник");
            keyMap.put(itemTranslationKeyFor("netherite_turtle_leggings"), "Панцирные поножи");
            keyMap.put(itemTranslationKeyFor("netherite_turtle_boots"), "Панцирные ботинки");

            keyMap.put(itemTranslationKeyFor("netherite_leathered_helmet"), "Утеплённый незеритовый шлем");
            keyMap.put(itemTranslationKeyFor("netherite_leathered_chestplate"), "Утеплённый незеритовый нагрудник");
            keyMap.put(itemTranslationKeyFor("netherite_leathered_leggings"), "Утеплённые незеритовые поножи");
            keyMap.put(itemTranslationKeyFor("netherite_leathered_boots"), "Утеплённые незеритовые ботинки");

            keyMap.put(itemTranslationKeyFor("diamond_leathered_helmet"), "Утеплённый алмазный шлем");
            keyMap.put(itemTranslationKeyFor("diamond_leathered_chestplate"), "Утеплённый алмазный нагрудник");
            keyMap.put(itemTranslationKeyFor("diamond_leathered_leggings"), "Утеплённые алмазные поножи");
            keyMap.put(itemTranslationKeyFor("diamond_leathered_boots"), "Утеплённые алмазные ботинки");

            keyMap.put(itemTranslationKeyFor("gold_leathered_helmet"), "Утеплённый золотой шлем");
            keyMap.put(itemTranslationKeyFor("gold_leathered_chestplate"), "Утеплённый золотой нагрудник");
            keyMap.put(itemTranslationKeyFor("gold_leathered_leggings"), "Утеплённые золотые поножи");
            keyMap.put(itemTranslationKeyFor("gold_leathered_boots"), "Утеплённые золотые ботинки");

            keyMap.put(itemTranslationKeyFor("chain_leathered_helmet"), "Утеплённый кольчужный шлем");
            keyMap.put(itemTranslationKeyFor("chain_leathered_chestplate"), "Утеплённый кольчужный нагрудник");
            keyMap.put(itemTranslationKeyFor("chain_leathered_leggings"), "Утеплённые кольчужные поножи");
            keyMap.put(itemTranslationKeyFor("chain_leathered_boots"), "Утеплённые кольчужные ботинки");

            keyMap.put(itemTranslationKeyFor("iron_leathered_helmet"), "Утеплённый железный шлем");
            keyMap.put(itemTranslationKeyFor("iron_leathered_chestplate"), "Утеплённый железный нагрудник");
            keyMap.put(itemTranslationKeyFor("iron_leathered_leggings"), "Утеплённые железные поножи");
            keyMap.put(itemTranslationKeyFor("iron_leathered_boots"), "Утеплённые железные ботинки");

            keyMap.put(upgradeTranslationKeyFor("leather_upgrade"), "Кожаное улучшение");
            keyMap.put(itemTranslationKeyFor("smithing_template.leather_upgrade.additions_slot_description"), "Поместите кожу");
            keyMap.put(itemTranslationKeyFor("smithing_template.leather_upgrade.applies_to"), "Любой броне, кроме кожаной");
            keyMap.put(itemTranslationKeyFor("smithing_template.leather_upgrade.base_slot_description"), "Поместите любую броню, кроме кожаной");
            keyMap.put(itemTranslationKeyFor("smithing_template.leather_upgrade.ingredients"), "Кожа");

            keyMap.put(upgradeTranslationKeyFor("turtle_upgrade"), "Черепашье улучшение");
            keyMap.put(itemTranslationKeyFor("smithing_template.turtle_upgrade.additions_slot_description"), "Поместите щиток");
            keyMap.put(itemTranslationKeyFor("smithing_template.turtle_upgrade.applies_to"), "Незеритовой броне");
            keyMap.put(itemTranslationKeyFor("smithing_template.turtle_upgrade.base_slot_description"), "Поместите незеритовый доспех");
            keyMap.put(itemTranslationKeyFor("smithing_template.turtle_upgrade.ingredients"), "Щиток");

            keyMap.put(upgradeTranslationKeyFor("gilded_upgrade"), "Золочёное улучшение");
            keyMap.put(itemTranslationKeyFor("smithing_template.gilded_upgrade.additions_slot_description"), "Поместите золото");
            keyMap.put(itemTranslationKeyFor("smithing_template.gilded_upgrade.applies_to"), "Незеритовой броне");
            keyMap.put(itemTranslationKeyFor("smithing_template.gilded_upgrade.base_slot_description"), "Поместите незеритовый доспех");
            keyMap.put(itemTranslationKeyFor("smithing_template.gilded_upgrade.ingredients"), "Золото");
        }
    }
}