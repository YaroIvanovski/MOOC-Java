
import java.util.ArrayList;

public class Pipe<T> {
   private ArrayList<T> elements;

    public Pipe() {
        this.elements = new ArrayList<>();
    }
    
    public void putIntoPipe(T value) {
        this.elements.add(value);
    }
    
    public T takeFromPipe() {
        if (elements.isEmpty()) {
            return null;
        }
        T element = elements.get(0);
        elements.remove(0);
        return element;
    }
    
    public boolean isInPipe() {
        if (elements.isEmpty()) {
          return false;
      } else {
          return true;
      }
    }
}
