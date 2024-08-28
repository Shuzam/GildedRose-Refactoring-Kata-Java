package com.gildedrose;

import com.gildedrose.constants.ItemLabels;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void agedbrie_increase_quality_by1_at_endofday(){
        Item[] items = new Item[] { new ItemBuilder().build(ItemLabels.AGED_BRIE,2,0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(1,app.items[0].sellIn);
        assertEquals(1,app.items[0].quality);
    }
    @Test
    void agedbrie_never_increase_quality_above_50(){
        Item[] items = new Item[] { new ItemBuilder().build(ItemLabels.AGED_BRIE,2,50) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(1,app.items[0].sellIn);
        assertEquals(50,app.items[0].quality);
    }
    @Test
    void agedbrie_minimal_quality_equals_0() {
        Item[] items = new Item[] {
            new ItemBuilder().build(ItemLabels.BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT,50,-1)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(49,app.items[0].sellIn);
        assertEquals(0,app.items[0].quality);
    }

    @Test
    void backstagepass_increase_quality_by1_at_endofday(){
        Item[] items = new Item[] { new ItemBuilder().build(ItemLabels.BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT,20,1) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(19,app.items[0].sellIn);
        assertEquals(2,app.items[0].quality);
    }
    @Test
    void backstagepass_increase_quality_by2_when_sellIn_between_10and5days(){
        Item[] items = new Item[] { new ItemBuilder().build(ItemLabels.BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT,10,1) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(9,app.items[0].sellIn);
        assertEquals(3,app.items[0].quality);
    }

    @Test
    void backstagepass_increase_quality_by3_when_sellIn_between_5and0days() {
        Item[] items = new Item[] {
            new ItemBuilder().build(ItemLabels.BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT,5,1)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(4,app.items[0].sellIn);
        assertEquals(4,app.items[0].quality);
    }
    @Test
    void backstagepass_increase_quality_by3_when_sellIn_equalsTo_0() {
        Item[] items = new Item[] {
            new ItemBuilder().build(ItemLabels.BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT,1,1)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0,app.items[0].sellIn);
        assertEquals(4,app.items[0].quality);
    }
    @Test
    void backstagepass_quality_setTo_0_when_sellIn_lesserThan_0() {
        Item[] items = new Item[] {
            new ItemBuilder().build(ItemLabels.BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT,0,50)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(-1,app.items[0].sellIn);
        assertEquals(0,app.items[0].quality);
    }
    @Test
    void backstagepass_minimal_quality_equals_0() {
        Item[] items = new Item[] {
            new ItemBuilder().build(ItemLabels.BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT,50,-1)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(49,app.items[0].sellIn);
        assertEquals(0,app.items[0].quality);
    }

    @Test
    void sulfuras_quality_never_decrease() {
        Item[] items = new Item[] {
            new ItemBuilder().build(ItemLabels.SULFURAS_HAND_OF_RAGNAROS,0,80)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0,app.items[0].sellIn);
        assertEquals(80,app.items[0].quality);
    }

    @Test
    void sulfuras_sellIn_never_changes() {
        Item[] items = new Item[] {
            new ItemBuilder().build(ItemLabels.SULFURAS_HAND_OF_RAGNAROS,99,80)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(99,app.items[0].sellIn);
        assertEquals(80,app.items[0].quality);
    }

    @Test
    void conjured_decrease_quality_by2_when_sellIn_EqualsOrLesserThan_0() {
        Item[] items = new Item[] {
            new ItemBuilder().build(ItemLabels.CONJURED_MANA_CAKE,0,50)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(-1,app.items[0].sellIn);
        assertEquals(48,app.items[0].quality);
    }

    @Test
    void conjured_minimal_quality_equals_0() {
        Item[] items = new Item[] {
            new ItemBuilder().build(ItemLabels.CONJURED_MANA_CAKE,0,1)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(-1,app.items[0].sellIn);
        assertEquals(0,app.items[0].quality);
    }
}
