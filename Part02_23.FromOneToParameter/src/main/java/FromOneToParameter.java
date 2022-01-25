
public class FromOneToParameter {
 
    public static void main(String[] args) {
            printUntilNumber(5);
            System.out.println();
    }
    
    public static void printUntilNumber(int number) {
        int i = 1;
        while (i < number + 1) {
            System.out.println(i);
            i++;
        }
    }  
}