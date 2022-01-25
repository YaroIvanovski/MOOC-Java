
import java.util.ArrayList;
 
public class Hideout<T> {
    private ArrayList<T> values;
 
    public Hideout() {
        this.values = new ArrayList<>();
    }
 
    public void putIntoHideout(T toHide) {
        values.clear();
        values.add(toHide);
    }
    
    public T takeFromHideout() {
        T value = values.get(0);
        values.clear();
        return value;
    }
 
    public boolean isInHideout() {
      if (values.isEmpty()) {
          return false;
      } else {
          return true;
      }
    }
}