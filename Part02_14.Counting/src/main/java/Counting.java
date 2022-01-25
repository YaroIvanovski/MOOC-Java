
import java.util.Scanner;
 
public class Counting {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = Integer.valueOf(scanner.nextLine());
        int start = 0;
        int end =  i;
        for (i = start; i < end +1; i++) {
            System.out.println(i);
        }
    }
}