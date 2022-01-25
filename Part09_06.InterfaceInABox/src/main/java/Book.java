
public class Book implements Packable{
    private String author;
    private String name;
    private double weight;

    public Book(String author, String name, double weight) {
        this.author = author;
        this.name = name;
        this.weight = weight;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }
    
    @Override
    public double weight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return author + ": " + name;
    }
}