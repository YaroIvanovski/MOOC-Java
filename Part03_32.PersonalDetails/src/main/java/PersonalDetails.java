
import java.util.ArrayList;
import java.util.Scanner;
public class PersonalDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> years = new ArrayList<>();
        
        int sumOfYears = 0;
        String name = " ";
        
        while (true) {
           String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] parts = input.split(",");
            list.add(parts[0]);
            years.add(Integer.valueOf(parts[1]));
        }
        
        name = list.get(0);
        for (String s : list) {
            if (s.length() > name.length()) {
                name = s;
            }
        }
        
        System.out.println("Longest name: " + name);
        for (int year : years) {
            sumOfYears += year;
        }
        System.out.println("Average of the birth years: " + 1.0 * sumOfYears / years.size());
    }
}