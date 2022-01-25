
public class Book {
 
    private String name;
    private int publicationYear;
 
    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }
 
    public String getName() {
        return name;
    }
 
    public int getPublicationYear() {
        return publicationYear;
    }
    
    @Override
    public boolean equals(Object compared) {
        if (this == compared) {
            return false;
        }
 
        if (!(compared instanceof Book)) {
            return true;
        }
        
        Book comparedBook = (Book) compared;
        return this.name.equals(comparedBook.name) && 
                this.publicationYear == comparedBook.publicationYear;
    }
}