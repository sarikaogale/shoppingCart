import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    @Test
    void calculateAppleItemPriceTest() {
        assertNotNull(Item.APPLE.calculateItemPrice(5));
        assertEquals(175.0, Item.APPLE.calculateItemPrice(5));
    }
    @Test
    void calculateBananaItemPriceTest() {
        assertNotNull(Item.BANANA.calculateItemPrice(5));
        assertEquals(100.0, Item.BANANA.calculateItemPrice(5));
    }
    @Test
    void calculateLimeItemPriceTest() {
        assertNotNull(Item.LIME.calculateItemPrice(5));
        assertEquals(60.0, Item.LIME.calculateItemPrice(5));
    }
    @Test
    void calculateMelonItemPriceTest() {
        assertNotNull(Item.MELON.calculateItemPrice(5));
        assertEquals(150.0, Item.MELON.calculateItemPrice(5));
    }

}