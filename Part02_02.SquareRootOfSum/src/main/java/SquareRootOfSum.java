
import java.util.Scanner;
 
public class SquareRootOfSum {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a seconf number: ");
        int second = Integer.valueOf(scanner.nextLine());
        
        int number = first + second;
        double squareRoot = Math.sqrt(number);
        System.out.println(squareRoot);
        
    }
}