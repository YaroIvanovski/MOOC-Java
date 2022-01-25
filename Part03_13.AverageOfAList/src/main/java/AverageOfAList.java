
import java.util.ArrayList;
import java.util.Scanner;
 
public class AverageOfAList {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            list.add(input);
        }
        double average = 0;
        double value = 0;
        for (Integer num: list) {
            value = value * 1.0 + num;
            average = value / list.size() * 1.0;
            }
        System.out.println("Average: " + average);
    }
}