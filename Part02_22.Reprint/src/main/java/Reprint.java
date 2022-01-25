
import java.util.Scanner;
 
public class Reprint {
 
    public static void main(String[] args) {
        // ask the user for how many times should the text be printed
        // then call the printText-method multiple times with a while-loop
        System.out.println("How many times?");
        Scanner scanner = new Scanner(System.in);
        int input = Integer.valueOf(scanner.nextLine());
        int printing = 0;
        while (printing <= input -1) {
            printing++;
            printText();
        }
        }
        
    // Don't change the next line that defines the method!
    // (We aren't giving a method a parameter yet)
    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
        // write some code here
    }
}