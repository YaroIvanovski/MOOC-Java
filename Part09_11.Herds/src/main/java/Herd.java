
import java.util.ArrayList;
import java.util.List;
public class Herd implements Movable {
    private List<Movable> movables;
  
    public Herd() {
        this.movables = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable) {
        movables.add(movable);
    }

    @Override
    public String toString() { 
      StringBuilder builder = new StringBuilder();
      for (Movable x : movables) {
          builder.append(x.toString()).append("\n");
      }
      return builder.toString();
    }
    
    @Override
    public void move(int dx, int dy) {
        for (Movable x : movables) {
            x.move(dx, dy);
        }
    }
}

