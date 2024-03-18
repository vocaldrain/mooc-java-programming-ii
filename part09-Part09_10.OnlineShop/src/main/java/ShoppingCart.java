
import java.util.HashMap;
import java.util.Map;


public class ShoppingCart {
    private Map<String, Item> items;

    public ShoppingCart() {
        this.items = new HashMap<>();
    }

    public void add(String product, int price) {
        this.items.computeIfPresent(product, (key, item) -> {
            item.increaseQuantity();
            return item;
        });
        this.items.putIfAbsent(product, new Item(product, 1, price));
    }

    public int price() {
        return this.items.values().stream().mapToInt(Item::price).sum();
    }

    public void print() {
        this.items.values().forEach(System.out::println);
    }
}