package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void testCommons() {
        Item[] items = new Item[] { new ItemBuilder().build("+5 Dexterity Vest",10,20) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("+5 Dexterity Vest", app.items[0].name);
        assertEquals(9,app.items[0].sellIn);
        assertEquals(19,app.items[0].quality);
    }
}
