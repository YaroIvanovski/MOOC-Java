
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> price;
    private Map<String, Integer> stock;
    
    public Warehouse() {
        this.price = new HashMap<>();
        this.stock = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock) {
       this.price.put(product, price);
       this.stock.put(product, stock);
    }
    
    public int price(String product) {
        return price.getOrDefault(product, -99);
    }
    
    public int stock(String product) {
        return stock.getOrDefault(product, 0);
    }
    
    public boolean take(String product) {
         if (stock(product) > 0) {
             stock.put(product, stock.get(product) -1);
             return true;
         }
         return false;
    }
    
    public Set<String> products() {
        return stock.keySet();
    }
}
