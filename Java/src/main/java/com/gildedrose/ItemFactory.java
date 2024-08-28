package com.gildedrose;

import com.gildedrose.constants.ItemLabels;
import com.gildedrose.items.*;

import java.util.HashMap;
import java.util.Map;


public class ItemFactory {


    private static final Map<String, String> map = new HashMap<String, String>() {{
        put(ItemLabels.SUBTYPE_CHEESE, ItemLabels.AGED_BRIE);
        put(ItemLabels.SUBTYPE_PASSES, ItemLabels.BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT);
        put(ItemLabels.SUBTYPE_LEGENDARY, ItemLabels.SULFURAS_HAND_OF_RAGNAROS);
        put(ItemLabels.SUBTYPE_CONJURED, ItemLabels.CONJURED_MANA_CAKE);
    }};

    public static ItemInterface updateItems(Item current) {
        if (map.get(ItemLabels.SUBTYPE_CHEESE).contains(current.name)) {
            return new AgedBrie();
        }
        if (map.get(ItemLabels.SUBTYPE_PASSES).contains(current.name)) {
            return new BackstagePasses();
        }
        if (map.get(ItemLabels.SUBTYPE_LEGENDARY).contains(current.name)) {
            return new Sulfuras();
        }
        if (map.get(ItemLabels.SUBTYPE_CONJURED).contains(current.name)) {
            return new Conjured();
        }
        return new Common();
    }
}
