
import java.util.Scanner;
 
public class CountingToHundred {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = Integer.valueOf(scanner.nextLine());
        int start = i;
        int end =  100;
        for (i = start; i < end +1; i++) {
            System.out.println(i);
        }
    }
}