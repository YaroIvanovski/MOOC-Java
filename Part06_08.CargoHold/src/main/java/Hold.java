
import java.util.ArrayList;
 
public class Hold {
    private int maxWeight; 
    private ArrayList<Suitcase> suitcases;
 
    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight() + suitcase.totalWeight() > maxWeight) {
            return; 
        } 
        this.suitcases.add(suitcase);
        } 
    
    public int totalWeight() {
        int sumOfWeights = 0;
        for (Suitcase value : suitcases) {
            sumOfWeights = sumOfWeights + value.totalWeight();
        }
        return sumOfWeights;
    }
    
    public void printItems() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printItems();
        }
    }
    
    @Override
    public String toString() {
        return this.suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";  
    }
 
}