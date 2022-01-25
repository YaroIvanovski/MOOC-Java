
import java.util.Scanner;
public class Summation {
    
    public static int sum(int num1, int num2, int num3, int num4) {
       int sum = num1 + num2 + num3 + num4;
        
        return sum;
    }
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.valueOf(scanner.nextLine());
        int number2 = Integer.valueOf(scanner.nextLine());
        int number3 = Integer.valueOf(scanner.nextLine());
        int number4 = Integer.valueOf(scanner.nextLine());
        int result = sum(number1, number2, number3, number4);
        System.out.println("Sum: " + result);
    }
}