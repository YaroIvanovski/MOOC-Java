
import java.util.ArrayList;
 
public class Stack {
    private ArrayList<String> values;
 
    public Stack() {
        this.values = new ArrayList<>();
    }
    
   public boolean isEmpty() {
       if (values == null || values.isEmpty()) {
           return true;
       }
       return false;
   }
   
   public void add(String value) {
       this.values.add(value);
   }
   
   public ArrayList<String> values() { 
       return values;
   }
   
   public String take() {
       return values.remove(values.size() -1);
  }
}