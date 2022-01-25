
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LiteracyComparison {
    public static void main(String[] args) {
      List<Statistic> statistics = new ArrayList<>();
      
      try {
         Files.lines(Paths.get("literacy.csv"))
                  .map(row -> row.split(","))
                  .filter(parts -> parts.length >= 6)
                  .map(parts -> new Statistic((parts[0]), (parts[1]), (parts[2]), (parts[3]), Integer.valueOf(parts[4]), Double.valueOf(parts[5])))
                  .forEach(value -> statistics.add(value));
          
      } catch (IOException e) {
          System.out.println("Error: " + e.getMessage());
      }
       
       Collections.sort(statistics);
       statistics.stream().forEach(s -> System.out.println(s));
    }
}
