
import java.util.Scanner;
public class Averaging {
    public static int sum(int number1, int number2, int number3, int number4) {
        return number1 + number2 + number3 + number4;
    }
 
    public static double average(int number1, int number2, int number3, int number4) {
        return sum(number1, number2, number3, number4) / 4.0;
    }
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.valueOf(scanner.nextLine());
        int number2 = Integer.valueOf(scanner.nextLine());
        int number3 = Integer.valueOf(scanner.nextLine());
        int number4 = Integer.valueOf(scanner.nextLine());
        double result = average(number1, number2, number3, number4);
        System.out.println("Average: " + result);
    }
}