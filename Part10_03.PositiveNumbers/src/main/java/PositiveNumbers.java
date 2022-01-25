
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {
    List<Integer> positive = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
    }
    
    public static List<Integer> positive(List<Integer> numbers) {
      return numbers.stream().filter(value -> value > 0).collect(Collectors.toCollection(ArrayList::new));
    
    }
}
