package com.gildedrose;

import static com.gildedrose.ItemFactory.updateItems;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) updateItems(item).updateItem(item);
    }

}
