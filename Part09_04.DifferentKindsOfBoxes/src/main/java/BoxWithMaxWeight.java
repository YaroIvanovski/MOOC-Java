
import java.util.ArrayList;
public class BoxWithMaxWeight extends Box {
    private ArrayList<Item> items;
    private int capacity;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }
    
    public int current() {
        int currentWeights = 0;
        for (Item value : items) {
            currentWeights = currentWeights + value.getWeight();
        }
        return currentWeights;
    }
    
    @Override
    public void add(Item item) {
        if (this.current() + item.getWeight() > capacity) {
            return; 
        } 
        this.items.add(item);
     }
    
    @Override
    public boolean isInBox(Item item){
        return this.items.contains(item);
    }
}