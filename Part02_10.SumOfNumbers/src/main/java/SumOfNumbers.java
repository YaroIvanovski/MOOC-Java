
import java.util.Scanner;
 
public class SumOfNumbers {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            } 
            if (number > 0 || number < 0){
                value = value + number;    
            }
        }
        System.out.println("Sum of the numbers: " + value);
    }  
}