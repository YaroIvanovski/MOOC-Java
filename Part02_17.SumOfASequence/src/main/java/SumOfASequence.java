
import java.util.Scanner;
 
public class SumOfASequence {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y =0;
        System.out.println("Last number? "); 
     
        int x = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i <= x; i++) {
            y = y + i;
        }
        System.out.println("The sum is " + y);
    }
}
