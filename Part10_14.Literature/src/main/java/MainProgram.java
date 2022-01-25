
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Books> book = new ArrayList<>();
        
        while (true) {
            System.out.print("Input the name of the book, empty stops:");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            
            System.out.println("Input the age recommendation:");
            int age = Integer.valueOf(scanner.nextLine());
            
            book.add(new Books(name, age));
        }
        System.out.println();
        System.out.println(book.size() + " books in total.");
        System.out.println("Books:");
        
        Comparator<Books> comparator = Comparator
                .comparing(Books::getAge)
                .thenComparing(Books::getName);
        
        Collections.sort(book, comparator);
        for (Books x: book) {
            System.out.println(x);
        }
    }
}
