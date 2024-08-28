package com.gildedrose;

public class Conjured implements ItemInterface{
    @Override
    public void updateItem(Item item) {
        if (item.sellIn<=0){item.quality -= 2;}else item.quality--;
        item.sellIn--;
        if (item.quality < 0) {item.quality = 0;}
    }
}
