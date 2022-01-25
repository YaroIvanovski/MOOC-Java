
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LimitedNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input < 0) {
                break;
            }
            numbers.add(input);
        }
        ArrayList<Integer> num = numbers.stream()
                .filter(value -> value < 6)
                .collect(Collectors.toCollection(ArrayList::new));
        
        num.stream()
                .forEach(value -> System.out.println(value));  
    }
}
