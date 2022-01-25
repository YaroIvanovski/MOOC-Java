
import java.util.Scanner;
 
public class GiftTax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int sum = Integer.valueOf(scanner.nextLine());
        
        if(sum < 5000) {
            System.out.println("No Tax!");
        }
        
        if (sum >= 5000 && sum < 25000) {
            double tax = 100 + (sum - 5000) * 0.08;
            System.out.println("Tax: " + tax); 
        }
        
        if (sum >= 25000 && sum < 55000) {
            double tax = 1700 + (sum - 25000) * 0.10;
            System.out.println("Tax: " + tax);
        }
        
        if (sum >= 55000 && sum < 200000) {
            double tax = 4700 + (sum - 55000) * 0.12;
            System.out.println("Tax: " + tax);  
        }
        
        if (sum >= 200000 && sum < 1000000) {
            double tax = 22100 + (sum - 200000) * 0.15;
            System.out.println("Tax: " + tax);
 
        } else {
            double tax = 142100 + (sum - 1000000) * 0.17;
            System.out.println("Tax: " + tax); 
        }
    }
}