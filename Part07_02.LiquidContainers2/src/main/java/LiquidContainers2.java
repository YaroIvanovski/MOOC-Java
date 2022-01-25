
import java.util.Scanner;
 
public class LiquidContainers2 {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Container container = new Container();
        Container container2 = new Container();
 
        UserInterface userInterface = new UserInterface(container, container2, scanner);
        userInterface.start();
    }
}