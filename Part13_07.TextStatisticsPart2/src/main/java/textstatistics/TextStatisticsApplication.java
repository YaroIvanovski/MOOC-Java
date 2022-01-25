
package textstatistics;

import java.util.Arrays;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TextStatisticsApplication extends Application {
    @Override
    public void start(Stage window) {
        TextArea area = new TextArea();
        BorderPane layout = new BorderPane();
        Label length = new Label();
        Label wordsNum = new Label();
        Label longestWord = new Label();
        
        
        area.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            
            int words = parts.length;
            String longest = Arrays.stream(parts).sorted((s1, s2) -> s2.length() - s1.length()).findFirst().get();
           
            length.setText("Letters: " + String.valueOf(characters));
            wordsNum.setText("Words: " + String.valueOf(words));
            longestWord.setText("The longest word is: " + longest);
        });
        
        HBox text = new HBox();
        text.setSpacing(10);
        text.getChildren().add(length);
        text.getChildren().add(wordsNum);
        text.getChildren().add(longestWord);
        
        layout.setBottom(text);
        layout.setCenter(area);
        
        Scene view = new Scene(layout);
        window.setScene(view);
        window.show();
    }
    
    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }
}