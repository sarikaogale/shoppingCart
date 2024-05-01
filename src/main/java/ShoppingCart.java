import java.util.Arrays;
import java.util.List;


public class ShoppingCart {
    public static void main(String[] args) {

        ShoppingCartProcessor shoppingCartProcessor = new ShoppingCartProcessor();
        //test1
        List<String> shoppingList = Arrays.asList("Apple", "Banana", "Melon", "Lime", "Melon", "Melon", "Lime", "Lime", "Lime", "Lime");
        shoppingCartProcessor.calculateShoppingCost(shoppingList);

        //Added as calculateShoppingCost4()
        shoppingList = Arrays.asList("Apple", "Banana", "Melon", "Lime", "Melon", "Melon", "Lime", "Lime", "Lime", "Lime", "Lime", "Lime",
                "Apple", "Apple", "Melon", "Lime", "Melon");
        shoppingCartProcessor.calculateShoppingCost(shoppingList);
    }


}

