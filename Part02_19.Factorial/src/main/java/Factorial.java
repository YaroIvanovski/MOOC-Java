
import java.util.Scanner;
 
public class Factorial {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = 1;
        System.out.println("Give a number: "); 
     
        int x = Integer.valueOf(scanner.nextLine());
        for (int i = 1; i <= x; i++) {
            y = y * i;
        }
        System.out.println("Factorial: " + y);
    }
}
 