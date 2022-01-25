
package buttonandtextfield;
 
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
 
public class ButtonAndTextFieldApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
 
        TextField textField = new TextField();
        Button button = new Button("Enter");
        HBox hbox = new HBox(textField, button);
 
        Scene scene = new Scene(hbox, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
 
    }
 
    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class);
    }
 
}