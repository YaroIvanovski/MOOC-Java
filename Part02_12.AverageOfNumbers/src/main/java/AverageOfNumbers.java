
import java.util.Scanner;
 
public class AverageOfNumbers {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int amount = 0;
        double average = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            } 
            if (number > 0 || number < 0){
                amount = amount + 1; 
                sum = number + sum;
                average = (double) sum / amount;
            }
        }
        System.out.println("Average of the numbers: " + average);
    }  
}