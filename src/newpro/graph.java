package newpro;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
 
public class graph extends Application {
   
 
 
 
 
    @Override
    public void start(Stage stage) throws IOException, SQLException {
    
       final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        final BarChart<String,Number> bc = 
            new BarChart<String,Number>(xAxis,yAxis);
        bc.setTitle("Patient Summary");
        xAxis.setLabel("Month");     
        yAxis.setLabel("Number of Patients");
      String str[]={" ","January","Feburary","March","April","May","June","July","August","September","October","November","December"};
      for(int i=showg.m2+one.count;i<=12;i++)
    		str[i]="";  
      if(showg.flag==1)
        {
        	int year=Calendar.getInstance().get(Calendar.YEAR);
        	int arr1[]={year,year-1,year-2,year-3,year-4,year-5,year-6,year-7,year-8,year-9,year-10,year-11};
        	for(int i=1;i<=12;i++)
        	{
        		str[i]=Integer.toString(arr1[i-1]);
        	}
        	 for(int i=showg.m2+one.count-year+1;i<=12;i++)
         		str[i]=""; 
        	  xAxis.setLabel("Year");    
        }
        XYChart.Series series1 = new XYChart.Series();
        
        series1.setName("No of Patients");
    //  System.out.println("count="+one.count);
    


   series1.getData().add(new XYChart.Data(str[1],one.arr[1]));
        series1.getData().add(new XYChart.Data(str[2],one.arr[2]));
        series1.getData().add(new XYChart.Data(str[3], one.arr[3]));
        series1.getData().add(new XYChart.Data(str[4], one.arr[4]));
        series1.getData().add(new XYChart.Data(str[5],one.arr[5]));
        series1.getData().add(new XYChart.Data(str[6], one.arr[6]));
        series1.getData().add(new XYChart.Data(str[7], one.arr[7]));
        series1.getData().add(new XYChart.Data(str[8], one.arr[8]));
        series1.getData().add(new XYChart.Data(str[9],  one.arr[9]));
        series1.getData().add(new XYChart.Data(str[10],  one.arr[10]));
        series1.getData().add(new XYChart.Data(str[11], one.arr[11]));
        series1.getData().add(new XYChart.Data(str[12], one.arr[12]));
        /*XYChart.Series series2 = new XYChart.Series();
        series2.setName("2004");
        series2.getData().add(new XYChart.Data(austria, 57401.85));
        series2.getData().add(new XYChart.Data(brazil, 41941.19));
        series2.getData().add(new XYChart.Data(france, 45263.37));
        series2.getData().add(new XYChart.Data(italy, 117320.16));
        series2.getData().add(new XYChart.Data(usa, 14845.27));  
        
        XYChart.Series series3 = new XYChart.Series();
        series3.setName("2005");
        series3.getData().add(new XYChart.Data(austria, 45000.65));
        series3.getData().add(new XYChart.Data(brazil, 44835.76));
        series3.getData().add(new XYChart.Data(france, 18722.18));
        series3.getData().add(new XYChart.Data(italy, 17557.31));
        series3.getData().add(new XYChart.Data(usa, 92633.68)); */ 
        
        
        Scene scene  = new Scene(bc,800,600);
        bc.getData().addAll(series1);//, series2, series3);
        stage.setScene(scene);
        stage.show();
    }

 
    public static void main(String[] args) {
        launch(args);
    }
}
