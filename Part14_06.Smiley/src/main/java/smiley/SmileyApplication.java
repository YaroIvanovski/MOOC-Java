
package smiley;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SmileyApplication extends Application {
     @Override
    public void start(Stage window) {

        Canvas paintingCanvas = new Canvas(500, 500);
        GraphicsContext painter = paintingCanvas.getGraphicsContext2D();
        
        painter.setFill(Color.WHITE);
        painter.clearRect(0, 0, 600, 400);
        
        painter.setFill(Color.BLACK);
        painter.fillRect(125, 50, 80, 60);
        painter.fillRect(315, 50, 80, 60);
        painter.fillRect(90, 210, 60, 60);
        painter.fillRect(360, 210, 60, 60);
        painter.fillRect(140, 270, 230, 60); 
        
        BorderPane paintingLayout = new BorderPane();
        paintingLayout.setCenter(paintingCanvas);
        Scene view = new Scene(paintingLayout);

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(SmileyApplication.class);
    }
}

/*
PAINTER WITH MOUSE, CHOSE  the COLOR

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MiniPaint extends Application {

    @Override
    public void start(Stage window) {

        Canvas paintingCanvas = new Canvas(640, 480);
        GraphicsContext painter = paintingCanvas.getGraphicsContext2D();

        ColorPicker colorPalette = new ColorPicker();

        BorderPane paintingLayout = new BorderPane();
        paintingLayout.setCenter(paintingCanvas);
        paintingLayout.setRight(colorPalette);

        paintingCanvas.setOnMouseDragged((event) -> {
            double xLocation = event.getX();
            double yLocation = event.getY();
            painter.setFill(colorPalette.getValue());
            painter.fillOval(xLocation, yLocation, 4, 4);
        });

        Scene view = new Scene(paintingLayout);

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(MiniPaint.class);
    }
}

*/
