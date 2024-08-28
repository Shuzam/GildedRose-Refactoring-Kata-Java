package com.gildedrose.items;

import com.gildedrose.Item;
import com.gildedrose.ItemInterface;

public class AgedBrie implements ItemInterface {
    @Override
    public void updateItem(Item item) {
        item.quality = Math.min(item.quality+(item.sellIn>0?1:2), 50);
        item.sellIn--;
    }
}
