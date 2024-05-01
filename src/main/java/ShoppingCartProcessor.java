import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ShoppingCartProcessor
{

    /**
     * this method is used to get the total Qty per Item
     * @param shoppingItems
     * @return
     */
     Map<String, Integer> processCartItems(List<String> shoppingItems) {
        Map<String, Integer> itemWiseQtyMap = new HashMap<>();

        for (Item inventoryItem : Item.values()) {
            List<String> result = shoppingItems.stream()
                    .filter(item -> inventoryItem.name().equalsIgnoreCase(item))
                    .collect(Collectors.toList());
            itemWiseQtyMap.put(inventoryItem.name(), result.size());
        }
        return itemWiseQtyMap;
    }

    /**
     * This method calculates the total cost of all items in the shopping basket
     * @param shoppingItems
     */
     Double calculateTotalCostPerItem(List<String> shoppingItems) {
        double totalCost = 0.0;
        double itemTotal;
        Map<String, Integer> itemWiseQtyMap = processCartItems(shoppingItems);

        for (Item inventoryItem : Item.values()) {
            itemTotal = inventoryItem.calculateItemPrice(itemWiseQtyMap.get(inventoryItem.name()));
            System.out.println("Item: " + inventoryItem.name() + ", Total Item price: " + itemTotal);

            totalCost += itemTotal;
        }

        System.out.println("--------------------------------------------Total shopping cost is: " + totalCost + "p--------------------------------------------");
        return  totalCost;

    }

    public Double calculateShoppingCost(List<String> shoppingItems) {

        return calculateTotalCostPerItem(shoppingItems);
    }
}
