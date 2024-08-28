package com.gildedrose.items;

import com.gildedrose.Item;
import com.gildedrose.ItemInterface;

public class BackstagePasses implements ItemInterface {
    @Override
    public void updateItem(Item item) {
        if (item.quality < 50) {
            if (item.sellIn < 6) {
                item.quality+=3;
            }else if (item.sellIn < 11) {
                item.quality+=2;
            }else {item.quality++;}
        }
        item.quality=Math.min(item.quality,50);
        item.sellIn--;
        if (item.sellIn < 0) {
            item. quality = 0;
        }
    }
}
