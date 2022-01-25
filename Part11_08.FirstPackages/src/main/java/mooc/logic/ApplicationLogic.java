
package mooc.logic;
import mooc.ui.UserInterface;

public class ApplicationLogic {
    private UserInterface ui;

    public ApplicationLogic(UserInterface ui) {
        this.ui = ui;
    }
            
    public void execute(int times) {
        int i;
        for (i = 0; i < times; i++) {
            System.out.println("Application logic is working");
            ui.update(); 
            
        } 
    }
}
