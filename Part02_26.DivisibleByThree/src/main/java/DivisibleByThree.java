
import java.util.Scanner;
 
public class DivisibleByThree {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.valueOf(scanner.nextLine());
        int number2 = Integer.valueOf(scanner.nextLine());
        divisibleByThreeInRange(number1, number2);
    }
    public static void divisibleByThreeInRange(int beginning, int end)  {
        for ( int i = beginning; i <= end; i++)  {
            if (i % 3 == 0)  {
                System.out.println(i);
            }
        }
    }
}