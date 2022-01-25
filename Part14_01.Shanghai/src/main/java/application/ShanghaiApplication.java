
package application;

import java.util.HashMap;
import java.util.Map;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class ShanghaiApplication extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        // create the x and y axes that the chart is going to use
        NumberAxis xAxis = new NumberAxis(2006, 2018, 1);
        NumberAxis yAxis = new NumberAxis(0, 100, 10);

        // set the titles for the axes
        xAxis.setLabel("Year");
        yAxis.setLabel("Ranking");

        // create the line chart. The values of the chart are given as numbers
        // and it uses the axes we created earlier
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("University of Helsinki, Shanghai ranking");
        lineChart.setLegendVisible(false);

        // create the data set that is going to be added to the line chart
        XYChart.Series data = new XYChart.Series();
        Map<Integer, Integer> values = new HashMap<>();
        
        values.put(2007, 73);
        values.put(2008, 68);
        values.put(2009, 72);
        values.put(2010, 72);
        values.put(2011, 74);
        values.put(2012, 73);
        values.put(2013, 76);
        values.put(2014, 73);
        values.put(2015, 67);
        values.put(2016, 56);
        values.put(2017, 56);

         for (int key : values.keySet()) {
            data.getData().add(new XYChart.Data(key, values.get(key)));
        }
        
        // add the data set to the line chart
        lineChart.getData().add(data);

        // display the line chart
        Scene view = new Scene(lineChart, 640, 480);
        stage.setScene(view);
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(ShanghaiApplication.class);
    }
}