
import java.util.Scanner;
 
public class SumOfASequenceTheSequel {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number ");
        int x = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number ");
        int y = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        int first = x;
        int last =  y;
        for (int i = first; i <=  last; i++) { 
            sum = sum + i;
        }
        System.out.println("The sum is: " + sum);  
    }
}