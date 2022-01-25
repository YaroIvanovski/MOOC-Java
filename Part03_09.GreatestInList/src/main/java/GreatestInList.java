
import java.util.ArrayList;
import java.util.Scanner;
 
public class GreatestInList {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
 
            list.add(input);
        }
        
        int greatest = list.get(0);
        for(int i = 0; i < list.size(); i++) {
            if (list.get(i) > greatest) {
                greatest = list.get(i);
            }
        }
        System.out.println("The greatest number: " + greatest);
    }
}
 
/*
int smallest = list.get(0);
        for(int i = 0; i < list.size(); i++) {
            if (smallest > list.get(i)) {
                smallest = list.get(i);
            }
        }
        System.out.println("The smallest number: " + smallest);
 
*/