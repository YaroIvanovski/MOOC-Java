
public class StarSign {
    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);
        System.out.println("\n---");  
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }
    public static void printStars(int number) {
        int stars = 0;
        while (stars < number) {
            System.out.print("*");
            stars += 1;
        }
        System.out.println("");
    }
    public static void printSquare(int size) {
        int square = 0;
        while (square < size) {
            printStars(size);
            square += 1;
        }
    }
    public static void printRectangle(int width, int height) {
        int rectangle = 0;
        while (rectangle < height) {
            printStars(width);
            rectangle += 1;
        }
    }
    public static void printTriangle(int size) {
        int triangle = 1;
        while (triangle <= size) {
            printStars(triangle);
            triangle += 1;
        }
    }
}