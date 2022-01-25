
import java.util.Scanner;
 
public class UserInterface {
    private Container container;
    private Container container2;
    private Scanner scanner;
 
    public UserInterface(Container container, Container container2, Scanner scanner) {
        this.container = container;
        this.container2 = container2;
        this.scanner = scanner;
    }
    
    public void start() {
         System.out.println("First: " + this.container);
        System.out.println("Second: " + this.container2);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("quit")) {
                break;
            }
             String[] partsOfInput = input.split(" ");
            input = partsOfInput[0];
            int amount = Integer.valueOf(partsOfInput[1]);
            processCommand(input, amount);
             System.out.println("First: " + this.container);
             System.out.println("Second: " + this.container2);
            
        }
    }
    
    public void processCommand(String command, int amount) {
        if (command.equals("add")) {
            add(amount);
        } else if (command.equals("move")) {
            move(amount);
        } else if (command.equals("remove")) {
            remove(amount);
        }
    }
    
    
    public void add(int amount) {
       this.container.add(amount);
    }
    
    public void move(int amount) {
        if (amount > container.contains()) {
            amount = container.contains();
                }
                container.remove(amount);
                container2.add(amount);
    }
    
    public void remove(int amount) {
        this.container2.remove(amount);
    }
}