
import java.util.Scanner;
 
public class Login {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username: ");
        String input1 = scanner.nextLine();
        System.out.println("Enter password:");
        String input2 = scanner.nextLine();
        String a = "alex";
        String a1 = "sunshine";
        String b = "emma";
         String b1 = "haskell";       
        if (input1.equals(a) & input2.equals(a1) || input1.equals(b) & input2.equals(b1)) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}