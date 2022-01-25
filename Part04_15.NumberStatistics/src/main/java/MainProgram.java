
import java.util.Scanner;
 
public class MainProgram {
 
    public static void main(String[] args) {
        
        Statistics sum = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }
            sum.addNumber(number);
 
            if (number % 2 == 0) {
                even.addNumber(number);
            } else {
                odd.addNumber(number);
            }
        }
        System.out.println("Sum: " + sum.sum());
        System.out.println("Sum of even numbers: " + even.sum());
        System.out.println("Sum of odd numbers: " + odd.sum());
    }
}