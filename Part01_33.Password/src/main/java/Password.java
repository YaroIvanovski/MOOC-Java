
import java.util.Scanner;
 
public class Password {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Password?");
        String first = scan.nextLine();
        String second = "Caput Draconis";
        if (first.equals(second)) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }
    } 
}
 