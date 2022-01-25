
import java.util.Scanner;
 
public class NumberAndSumOfNumbers {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int value = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            } 
            if (number > 0 || number < 0){
                value = value + 1; 
                sum = number + sum;
            }
        }
        System.out.println("Number of numbers: " + value);
        System.out.println("Sum of the numbers: " + sum);
    }  
}