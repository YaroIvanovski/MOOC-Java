
import java.util.ArrayList;
 
public class Suitcase {
    private int maxWeight;
    private ArrayList<Item> items;
 
    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }
    
    public int totalWeight() {
        int sumOfWeights = 0;
        for (Item value : items) {
            sumOfWeights = sumOfWeights + value.getWeight();
        }
        return sumOfWeights;
    }
    
    public void addItem(Item item) { 
        if (this.totalWeight() + item.getWeight() <= maxWeight) {
            this.items.add(item); 
        }  
    }
    
    public void printItems() {
        for(Item item : items) {
            System.out.println(item);
        }
    }
    
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        Item returnObject = this.items.get(0);
        for (Item i: this.items) {
 
        if (returnObject.getWeight() < i.getWeight()) {
            returnObject = i;
        }
    }
    return returnObject;
    }
    
    @Override
    public String toString() {
        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        }
        if (this.items.size() == 1) {
            return "1 item (" + this.totalWeight() + " kg)";
        }
        return this.items.size() + " items (" + this.totalWeight() + " kg)";
    }
}