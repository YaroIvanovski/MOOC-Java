
import java.util.Scanner;
 
public class Adulthood {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How old are you?");
        int first = Integer.valueOf(scan.nextLine()); 
        int number = first;
        if (number < 18) {
            System.out.println("You are not an adult");
        } else {
            System.out.println("You are an adult");
        }  
    }
}