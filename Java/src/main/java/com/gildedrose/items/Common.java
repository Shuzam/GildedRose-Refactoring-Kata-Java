package com.gildedrose.items;

import com.gildedrose.Item;
import com.gildedrose.ItemInterface;

public class Common implements ItemInterface {
    @Override
    public void updateItem(Item item) {
        item.quality = Math.max(item.quality-(item.sellIn<0?2:1), 0);
        item.sellIn--;
    }
}
