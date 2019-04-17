import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
import java.io.BufferedReader;
import java.io.FileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Weather extends Application {

    @Override public void start(Stage stage) {
        stage.setTitle("Temperatures and Precipatation in Katy TX");
        //defining the axes
        final NumberAxis xAxis = new NumberAxis(2008,2019, 1);
        final NumberAxis yAxis = new NumberAxis(55,90,1);
        xAxis.setLabel("Number of Month");
        //creating the chart
        final LineChart<Number,Number> lineChart =
                new LineChart<Number,Number>(xAxis,yAxis);
        lineChart.setTitle("Temperatures and Precipitation in Katy TX");
        CSVReader csv=new CSVReader();
        ArrayList<String> stuff1=csv.country;
        double[] stuff=new double[333];
        for(int x=0; x<stuff1.size(); x++) {
            try {
                stuff[x] = (Double.parseDouble(stuff1.get(x)));
            }
            catch (NumberFormatException e){
                stuff[x]=70;
            }
        }
        //defining a series
        XYChart.Series series = new XYChart.Series();
        //System.out.println(stuff1.size());
        //for(int x=0; x<333; x++)
        //    System.out.println(stuff1.get(x));
        for(int x=0; x<333; x++)
            System.out.println(stuff[x]);
        series.setName("Average Temperature");
        //populating the series with data
        series.getData().add(new XYChart.Data(2009+0, stuff[23+25+31*0]));
        series.getData().add(new XYChart.Data(2009+1, stuff[23+25+31*1]));
        series.getData().add(new XYChart.Data(2009+2, stuff[23+25+31*2]));
        series.getData().add(new XYChart.Data(2009+3, stuff[23+25+31*3]));
        series.getData().add(new XYChart.Data(2009+4, stuff[23+25+31*4]));
        series.getData().add(new XYChart.Data(2009+5, stuff[23+25+31*5]));
        series.getData().add(new XYChart.Data(2009+6, stuff[23+25+31*6]));
        series.getData().add(new XYChart.Data(2009+7, stuff[23+25+31*7]));
        series.getData().add(new XYChart.Data(2009+8, stuff[23+25+31*8]));
        series.getData().add(new XYChart.Data(2009+9, stuff[23+25+31*9]));




        XYChart.Series series1 = new XYChart.Series();
        series1.setName("Minumum Temperature");
        //populating the series with data
        series1.getData().add(new XYChart.Data(2009+0, stuff[23+29+31*0]));
        series1.getData().add(new XYChart.Data(2009+1, stuff[23+29+31*1]));
        series1.getData().add(new XYChart.Data(2009+2, stuff[23+29+31*2]));
        series1.getData().add(new XYChart.Data(2009+3, stuff[23+29+31*3]));
        series1.getData().add(new XYChart.Data(2009+4, stuff[23+29+31*4]));
        series1.getData().add(new XYChart.Data(2009+5, stuff[23+29+31*5]));
        series1.getData().add(new XYChart.Data(2009+6, stuff[23+29+31*6]));
        series1.getData().add(new XYChart.Data(2009+7, stuff[23+29+31*7]));
        series1.getData().add(new XYChart.Data(2009+8, stuff[23+29+31*8]));
        series1.getData().add(new XYChart.Data(2009+9, stuff[23+29+31*9]));


        XYChart.Series series2 = new XYChart.Series();
        series2.setName("Maximum Temperature");
        //populating the series with data
        series2.getData().add(new XYChart.Data(2009+0, stuff[23+27+31*0]));
        series2.getData().add(new XYChart.Data(2009+1, stuff[23+27+31*1]));
        series2.getData().add(new XYChart.Data(2009+2, stuff[23+27+31*2]));
        series2.getData().add(new XYChart.Data(2009+3, stuff[23+27+31*3]));
        series2.getData().add(new XYChart.Data(2009+4, stuff[23+27+31*4]));
        series2.getData().add(new XYChart.Data(2009+5, stuff[23+27+31*5]));
        series2.getData().add(new XYChart.Data(2009+6, stuff[23+27+31*6]));
        series2.getData().add(new XYChart.Data(2009+7, stuff[23+27+31*7]));
        series2.getData().add(new XYChart.Data(2009+8, stuff[23+27+31*8]));
        series2.getData().add(new XYChart.Data(2009+9, stuff[23+27+31*9]));


        XYChart.Series series3 = new XYChart.Series();
        series3.setName("Precipatation(inches)");
        //populating the series with data
        series3.getData().add(new XYChart.Data(2009+0, stuff[23+23+31*0]));
        series3.getData().add(new XYChart.Data(2009+1, stuff[23+23+31*1]));
        series3.getData().add(new XYChart.Data(2009+2, stuff[23+23+31*2]));
        series3.getData().add(new XYChart.Data(2009+3, stuff[23+23+31*3]));
        series3.getData().add(new XYChart.Data(2009+4, stuff[23+23+31*4]));
        series3.getData().add(new XYChart.Data(2009+5, stuff[23+23+31*5]));
        series3.getData().add(new XYChart.Data(2009+6, stuff[23+23+31*6]));
        series3.getData().add(new XYChart.Data(2009+7, stuff[23+23+31*7]));
        series3.getData().add(new XYChart.Data(2009+8, stuff[23+23+31*8]));
        series3.getData().add(new XYChart.Data(2009+9, stuff[23+23+31*9]));
        
        lineChart.getData().add(series);
        lineChart.getData().add(series1);
        lineChart.getData().add(series2);
        lineChart.getData().add(series3);


        Scene scene  = new Scene(lineChart,800,600);


        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}

