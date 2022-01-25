
import java.util.ArrayList;  
import java.util.Scanner;
import java.nio.file.Paths;
 
public class IsItInTheFile {
    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                list.add(fileReader.nextLine());
            }
            
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        } 
        
        System.out.print("");
        
        while (true) {
            if (list.isEmpty()) {
                break;
            }
            
            if (list.contains(searchedFor)) {
                System.out.println("Found!");
                break;
                
            } else {
                System.out.println("Not found.");
                break;
            }
        }
    }
}