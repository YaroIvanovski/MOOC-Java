
import java.util.Scanner;
 
public class ComparingNumbers {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a second number: ");
        int secondNumber = Integer.valueOf(scanner.nextLine());
 
        if (firstNumber > secondNumber) { 
            System.out.println(firstNumber + " is greater than " + secondNumber);
        } else if (firstNumber < secondNumber) { 
            System.out.println(firstNumber + " is smaller than " + secondNumber);
        } else { 
            System.out.println(firstNumber + " is equal to " + secondNumber);
        }
    }
}