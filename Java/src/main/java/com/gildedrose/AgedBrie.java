package com.gildedrose;

public class AgedBrie implements ItemInterface{
    @Override
    public void updateItem(Item item) {
        if (item.quality < 50) {
            item.quality++;
        }
        item.sellIn--;
        if (item.sellIn < 0) {
            if (item.quality < 50) {
                item.quality++;
            }
        }
        if (item.quality < 0) {item.quality = 0;}
    }
}
