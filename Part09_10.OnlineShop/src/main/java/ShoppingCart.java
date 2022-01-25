
import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Item> products;

    public ShoppingCart() {
        this.products = new HashMap<>();
    }
    
    public void add(String product, int price) {
       this.products.putIfAbsent(product, new Item(product, 0, price));
        this.products.get(product).increaseQuantity();
    }
    
    public int price() {
        int amount = 0;
        for (Item item : this.products.values()) {
            amount += item.price();
        }
        return amount;
    }
    
    public void print() {
        for (String i : products.keySet()) {
            System.out.println(products.get(i).toString()); 
        }
    }
}
