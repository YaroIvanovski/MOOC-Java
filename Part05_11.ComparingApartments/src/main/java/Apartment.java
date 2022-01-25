
public class Apartment {
 
    private int rooms;
    private int squares;
    private int princePerSquare;
 
    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        }
        if (this.squares < compared.squares) {
            return false;
        }
        return false;
    }
    
    public int priceDifference(Apartment compared) {
       int price = this.princePerSquare * this.squares;
       return Math.abs(compared.squares * compared.princePerSquare - price);
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        return compared.squares * this.princePerSquare > compared.squares * compared.princePerSquare;
    }
    
}