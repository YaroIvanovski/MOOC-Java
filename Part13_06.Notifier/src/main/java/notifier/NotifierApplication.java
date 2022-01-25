
package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NotifierApplication extends Application {
    
    @Override
    public void start(Stage window) {
    TextField field = new TextField();
    Label text = new Label();
    Button button = new Button("Copy");

    button.setOnAction((event) -> {
        text.setText(field.getText());
    });

    VBox componentGroup = new VBox();
    componentGroup.setSpacing(10);
    componentGroup.getChildren().addAll(field, button, text);

    Scene scene = new Scene(componentGroup);

    window.setScene(scene);
    window.show();
    }

    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }
}