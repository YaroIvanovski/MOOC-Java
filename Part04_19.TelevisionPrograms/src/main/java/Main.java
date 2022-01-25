
import java.util.ArrayList;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int maxDur = 0;
         while (true) {
            System.out.print("Name: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            
            System.out.println("Duration: ");
            int duration = Integer.valueOf(scanner.nextLine());
            programs.add(new TelevisionProgram(name, duration));
         }
         
         System.out.println("Program's maximum duration?");
         maxDur = Integer.valueOf(scanner.nextLine());           
         System.out.println("");
         for (TelevisionProgram program : programs) {
             if (program.getDuration() <= maxDur) {
                 System.out.println(program);
             }
         }
    }
}