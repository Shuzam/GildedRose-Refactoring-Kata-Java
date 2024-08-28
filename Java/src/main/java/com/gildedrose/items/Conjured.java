package com.gildedrose.items;

import com.gildedrose.Item;
import com.gildedrose.ItemInterface;

public class Conjured implements ItemInterface {
    @Override
    public void updateItem(Item item) {
            item.quality-=item.sellIn<=0?2:1;
            item.quality=Math.max(item.quality,0);
            item.sellIn--;
    }
}
