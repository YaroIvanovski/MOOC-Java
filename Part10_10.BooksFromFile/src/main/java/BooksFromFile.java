
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BooksFromFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
    }
    public static List<Book> readBooks(String file) {
      List<Book> books = new ArrayList<>();
      
      try {
          Files.lines(Paths.get(file))
                  .map(row -> row.split(","))
                  .filter(parts -> parts.length >= 4)
                  .map(parts -> new Book(parts[0], Integer.valueOf(parts[1]), Integer.valueOf(parts[2]), (parts[3])))
                  .forEach(book -> books.add(book));
                  
      } catch (IOException e) {
          System.out.println("Error: " + e.getMessage());
          
      } 
      return books;
   }
}

/*
Suggested solution:

return Files.lines(Paths.get(file))
                    .map(line -> line.split(","))
                    .map(parts -> new Book(parts[0], Integer.valueOf(parts[1]), Integer.valueOf(parts[2]), parts[3]))
                    .collect(Collectors.toList());
*/
