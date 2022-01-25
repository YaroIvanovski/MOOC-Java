
package application;
 
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
 
public class MultipleViews extends Application {
    @Override
    public void start(Stage window) {
        BorderPane pan = new BorderPane();
        Button firstB = new Button("To the second view!");
        pan.setTop(new Label("First view!"));
        pan.setCenter(firstB);
        Scene first = new Scene(pan);
        
        VBox pan2 = new VBox();
        Button secondB = new Button("To the third view!");
        Scene second = new Scene(pan2);
        pan2.getChildren().addAll(secondB, new Label("Second view!"));
        
        GridPane pan3 = new GridPane();
        Button thirdB = new Button("To the first view!");
        pan3.add(new Label("Third view!"), 0, 0);
        pan3.add(thirdB, 1, 1);
        Scene third = new Scene(pan3);
        
        firstB.setOnAction((event) -> {
            window.setScene(second);
        });
        
        secondB.setOnAction((event) -> {
            window.setScene(third);
        });
        
        thirdB.setOnAction((event) -> {
            window.setScene(first);
        
        });
        
        window.setScene(first);
        window.show();
    }
 
    public static void main(String[] args) {
        launch(MultipleViews.class);
    }
}