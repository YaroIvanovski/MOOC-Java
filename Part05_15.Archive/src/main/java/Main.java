
import java.util.ArrayList;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> items = new ArrayList<>();
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            
            Archive archive = new Archive(identifier, name);
            if (!(items.contains(archive))) {
                items.add(archive);
            }
        }
        items.forEach((archive) -> {    // the same with 1*
            System.out.println(archive);
        });
    }
}
 
/* 
1*
for (Archive archive: items) {
     System.out.println(archive);
  }
*/