package com.gildedrose;

public class Common implements ItemInterface{
    @Override
    public void updateItem(Item item) {
        if (item.quality > 0) {
            item.quality--;
        }
        item.sellIn--;
        if ( item.sellIn < 0) {
            if ( item.quality > 0) {
                item.quality--;
            }
        }
    }
}
