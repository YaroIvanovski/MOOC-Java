
public class Container {
    private Integer liters;
    
    public Container() {
        this.liters = 0;
    }
    
    public int contains() {
        return this.liters;
    }
    
    public void add(int amount) {
        if (amount > 0) {
            this.liters += amount;
            if (this.liters > 100) {
                this.liters = 100;
            }
        }
    }
    
    public void remove(int amount) {
        if (amount > 0) {
            this.liters -= amount;
            if (this.liters < 0) {
                this.liters = 0;
            }
        }
    }
    
    @Override
    public String toString() {
      return  this.liters + "/100"; 
    }
}