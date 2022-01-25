
public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory history;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.history = new ChangeHistory();
        setInicialBalance(initialBalance);
    }

    public void setInicialBalance(double inicialBalance) {
        history.add(inicialBalance);
        super.addToWarehouse(inicialBalance);
    }
    
    public String history() {
        return history.toString();
    }
    
    @Override
    public void addToWarehouse (double amount) {
        super.addToWarehouse(amount);
        history.add(super.getBalance());
    }
    
    @Override
    public double takeFromWarehouse (double amount) {
        double value = super.takeFromWarehouse(amount);
        history.add(super.getBalance());
        return value;
    }
    
    public void printAnalysis() {
        System.out.println("Product: " + getName());
        System.out.println("History: " + history());
        System.out.println("Largest amount of product: " + history.maxValue());
        System.out.println("Smallest amount of product: " + history.minValue());
        System.out.println("Average: " + history.average());
    }
}