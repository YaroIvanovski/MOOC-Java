
import java.util.Scanner;
public class Smallest {
 
    public static int smallest(int num1, int num2) {
        int smallest = Math.min(num1,num2);
        return smallest;
    }
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.valueOf(scanner.nextLine());
        int num2 = Integer.valueOf(scanner.nextLine());  
        int result = smallest(num1, num2);
        System.out.println("Smallest: " + result);
    }
}