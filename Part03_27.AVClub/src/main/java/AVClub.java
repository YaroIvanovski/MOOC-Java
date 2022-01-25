
import java.util.Scanner;
 
public class AVClub {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] line = input.split(" ");
            for (String part : line) {
                if (part.contains("av")) {
                    System.out.println(part);
                }
            }
        }
    }
}
 