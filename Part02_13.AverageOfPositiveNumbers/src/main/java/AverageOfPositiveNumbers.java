
import java.util.Scanner;
 
public class AverageOfPositiveNumbers {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int amount = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            }
            if (number < 0) {
                continue;  
            }
            amount = amount + 1; 
            sum = number + sum;          
        }
        double average = (double) sum / amount;
        if (average > 0) {
            System.out.println(average);
        } else { 
            System.out.println("Cannot calculate the average");
        }  
    }
}