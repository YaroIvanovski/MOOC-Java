
import java.util.Scanner;
 
public class FromWhereToWhere {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where to ? ");
        int x = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        int y = Integer.valueOf(scanner.nextLine());
        int start = y;
        int end =  x;
        for (int i = start; i <  end +1; i++) {
            System.out.println(i);       
            
        }
    }
}