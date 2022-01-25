
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private TodoList list;

    public UserInterface(TodoList list, Scanner scanner) {
        this.scanner = scanner;
        this.list = list;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }
            processCommand(command);
        }
    }
    
    public void processCommand(String command) {
        if (command.equals("add")) {
            add();
        } else if (command.equals("list")) {
            list();
        } else if (command.equals("remove")) {
            remove();
        }
    }
    
    public void add() {
        System.out.print("To add: ");
        String add = scanner.nextLine();
        this.list.add(add);
    }
    
    public void list() {
        this.list.print();
    }
    
    public void remove() {
        System.out.print("Which one is removed? ");
        int remove = Integer.valueOf(scanner.nextLine());
        this.list.remove(remove);
    }
}