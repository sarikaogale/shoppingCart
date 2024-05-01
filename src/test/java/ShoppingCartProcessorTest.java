import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartProcessorTest {

    @Test
    void processCartItemsTest() {
        List<String> shoppingItems = Arrays.asList("Apple", "Banana", "Melon", "Lime", "Melon", "Melon", "Lime", "Lime", "Lime", "Lime");
        ShoppingCartProcessor shoppingCartProcessor = new ShoppingCartProcessor();
        assertNotNull(shoppingCartProcessor.processCartItems(shoppingItems));
    }

    @Test
    void calculateTotalCostPerItemPerItemTest() {
        List<String> shoppingItems = Arrays.asList("Apple", "Banana", "Melon", "Lime", "Melon", "Melon", "Lime", "Lime", "Lime", "Lime");
        ShoppingCartProcessor shoppingCartProcessor = new ShoppingCartProcessor();
        assertNotNull(shoppingCartProcessor.calculateTotalCostPerItem(shoppingItems));
        assertEquals(215.0, shoppingCartProcessor.calculateTotalCostPerItem(shoppingItems));

    }

    @Test
    void calculateShoppingCost1() {
        List<String> shoppingItems = Arrays.asList("Apple", "Banana", "Melon", "Lime", "Melon", "Melon", "Lime", "Lime", "Lime", "Lime",
                "Lime", "Apple");

        ShoppingCartProcessor shoppingCartProcessor = new ShoppingCartProcessor();
        assertNotNull(shoppingCartProcessor.calculateTotalCostPerItem(shoppingItems));
        assertEquals(250.0, shoppingCartProcessor.calculateTotalCostPerItem(shoppingItems));
    }
    @Test
    void calculateShoppingCost2() {
        List<String> shoppingItems = Arrays.asList("Apple", "Banana", "Melon", "Lime");

        ShoppingCartProcessor shoppingCartProcessor = new ShoppingCartProcessor();
        assertNotNull(shoppingCartProcessor.calculateTotalCostPerItem(shoppingItems));
        assertEquals(120.0, shoppingCartProcessor.calculateTotalCostPerItem(shoppingItems));
    }
    @Test
    void calculateShoppingCost3() {
        List<String> shoppingItems = Arrays.asList("Apple", "Banana", "Melon", "Lime", "Melon", "Melon", "Lime", "Lime", "Lime", "Lime", "Lime", "Lime",
                "Banana", "Melon", "Apple");

        ShoppingCartProcessor shoppingCartProcessor = new ShoppingCartProcessor();
        assertNotNull(shoppingCartProcessor.calculateTotalCostPerItem(shoppingItems));
        assertEquals(285.0, shoppingCartProcessor.calculateTotalCostPerItem(shoppingItems));

    }
    @Test
    void calculateShoppingCost4() {
        List<String> shoppingItems = Arrays.asList("Apple", "Banana", "Melon", "Lime", "Melon", "Melon", "Lime", "Lime", "Lime", "Lime", "Lime", "Lime",
                "Apple", "Apple", "Melon", "Lime", "Melon");

        ShoppingCartProcessor shoppingCartProcessor = new ShoppingCartProcessor();
        assertNotNull(shoppingCartProcessor.calculateTotalCostPerItem(shoppingItems));
        assertEquals(365.0, shoppingCartProcessor.calculateTotalCostPerItem(shoppingItems));

    }
}