
import java.util.Scanner;
public class UserInterface {
    private Scanner scanner;
    private JokeManager jokeManager;
 
    public UserInterface(JokeManager jokeManager, Scanner scanner) {
        this.scanner = scanner;
        this.jokeManager = jokeManager;
    }
    
    public void start() {
        while (true) {
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");
            
            String command = scanner.nextLine();
            
            if (command.equals("X")) {
                break;
            }
            processCommand(command);
        }
    }
    
    public void processCommand(String command) {
        if (command.equals("1")) {
            add();
        } else if (command.equals("3")) {
            list();
        } else if (command.equals("2")) {
            drawing();
        }
    }
    
    public void add() {
        System.out.print("Write the joke to be added: ");
        String add = scanner.nextLine();
        jokeManager.addJoke(add);
    }
    
    public void list() {
        System.out.println("Printing the jokes.");
        jokeManager.printJokes();
    }
    
    public void drawing() {
        System.out.println("Drawing a joke.");
        System.out.println(jokeManager.drawJoke());
    }
}