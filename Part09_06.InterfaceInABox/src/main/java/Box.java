
import java.util.ArrayList;
public class Box implements Packable {
    private ArrayList<Packable> packables;
    private double maxWeight;

    public Box(double maxWeight) {
        this.packables = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public double current() {
        double currentWeights = 0;
        for (Packable value : packables) {
            currentWeights = currentWeights + value.weight();
        }
        return currentWeights;
    }
    
    public void add(Packable item) {
        if (this.current() + item.weight() > maxWeight) {
            return; 
        } 
        this.packables.add(item);
     }
    
    @Override
    public double weight() {
        double weight = 0;
        double newWeight = weight + current();
        return newWeight;
    }

    @Override
    public String toString() {
        return "Box: " + packables.size() + " items, total weight " + weight() + " kg";
    }
}
    
