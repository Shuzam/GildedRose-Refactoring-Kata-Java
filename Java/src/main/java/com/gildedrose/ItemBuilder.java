package com.gildedrose;

public class ItemBuilder {
    public String name;
    public int quality;
    public int sellIn;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public int getSellIn() {
        return sellIn;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public Item build() {
        return new Item(name, sellIn, quality);
    }
}
