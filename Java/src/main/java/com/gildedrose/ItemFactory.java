package com.gildedrose;

import java.util.HashMap;
import java.util.Map;

public class ItemFactory {
    private static final Map<String, String> map = new HashMap<String, String>() {{
        put("cheese", "Aged Brie");
        put("concertPasses", "Backstage passes to a TAFKAL80ETC concert");
        put("legendary", "Sulfuras, Hand of Ragnaros");
        put("conjured", "Conjured Mana Cake");
    }};

    public static ItemInterface updateItems(Item current) {
        if (map.get("cheese").contains(current.name)) {
            return new AgedBrie();
        }
        if (map.get("concertPasses").contains(current.name)) {
            return new BackstagePasses();
        }
        if (map.get("legendary").contains(current.name)) {
            return new Sulfuras();
        }
        if (map.get("conjured").contains(current.name)) {
            return new Conjured();
        }
        return new Common();
    }
}
