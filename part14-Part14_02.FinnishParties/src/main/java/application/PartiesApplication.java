package application;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PartiesApplication  extends Application {
    public void start(Stage window){
        
        NumberAxis xAxis = new NumberAxis(1968,2008,4);
        NumberAxis yAxis = new NumberAxis(0,30,5);
        
        LineChart<Number,Number> l = new LineChart<>(xAxis,yAxis);
        
        l.setTitle("Relative support of the parties");
        
        XYChart.Series line1  = new XYChart.Series<>();
        line1.setName("KOK");
        line1.getData().add(new XYChart.Data(1968, 16.1));
        line1.getData().add(new XYChart.Data(1972, 18.1));
        line1.getData().add(new XYChart.Data(1976, 20.9));
        line1.getData().add(new XYChart.Data(1980, 22.9));
        line1.getData().add(new XYChart.Data(1984, 23.0));
        line1.getData().add(new XYChart.Data(1988, 22.9));
        line1.getData().add(new XYChart.Data(1992, 19.1));
        line1.getData().add(new XYChart.Data(1996, 21.6));
        line1.getData().add(new XYChart.Data(2000, 20.8));
        line1.getData().add(new XYChart.Data(2004, 21.8));
        line1.getData().add(new XYChart.Data(2008, 23.4));

        
        l.getData().add(line1);
        
        XYChart.Series line2  = new XYChart.Series<>();
        line2.setName("SDP");
        line2.getData().add(new XYChart.Data(1968, 23.9));
        line2.getData().add(new XYChart.Data(1972, 27.1));
        line2.getData().add(new XYChart.Data(1976, 24.8));
        line2.getData().add(new XYChart.Data(1980, 25.5));
        line2.getData().add(new XYChart.Data(1984, 24.7));
        line2.getData().add(new XYChart.Data(1988, 25.2));
        line2.getData().add(new XYChart.Data(1992, 27.1));
        line2.getData().add(new XYChart.Data(1996, 24.5));
        line2.getData().add(new XYChart.Data(2000, 23.0));
        line2.getData().add(new XYChart.Data(2004, 24.1));
        line2.getData().add(new XYChart.Data(2008, 21.2));

        
        l.getData().add(line2);
        XYChart.Series line3  = new XYChart.Series<>();
        line3.setName("KESK");
        line3.getData().add(new XYChart.Data(1968, 18.9));
        line3.getData().add(new XYChart.Data(1972, 18.0));
        line3.getData().add(new XYChart.Data(1976, 18.4));
        line3.getData().add(new XYChart.Data(1980, 18.7));
        line3.getData().add(new XYChart.Data(1984, 20.2));
        line3.getData().add(new XYChart.Data(1988, 21.1));
        line3.getData().add(new XYChart.Data(1992, 19.2));
        line3.getData().add(new XYChart.Data(1996, 21.8));
        line3.getData().add(new XYChart.Data(2000, 23.8));
        line3.getData().add(new XYChart.Data(2004, 21.8));
        line3.getData().add(new XYChart.Data(2008, 23.4));

        
        l.getData().add(line3);
        XYChart.Series line4  = new XYChart.Series<>();
        line4.setName("VIHR");
//        line4.getData().add(new XYChart.Data(1968, 16.1));
//        line4.getData().add(new XYChart.Data(1972, 18.1));
//        line4.getData().add(new XYChart.Data(1976, 20.9));
//        line4.getData().add(new XYChart.Data(1980, 22.9));
        line4.getData().add(new XYChart.Data(1984, 2.8));
        line4.getData().add(new XYChart.Data(1988, 2.3));
        line4.getData().add(new XYChart.Data(1992, 6.9));
        line4.getData().add(new XYChart.Data(1996, 6.3));
        line4.getData().add(new XYChart.Data(2000, 7.7));
        line4.getData().add(new XYChart.Data(2004, 7.4));
        line4.getData().add(new XYChart.Data(2008, 8.9));

        
        l.getData().add(line4);
        XYChart.Series line5  = new XYChart.Series<>();
        
        line5.setName("VAS");
        line5.getData().add(new XYChart.Data(1968, 16.9));
        line5.getData().add(new XYChart.Data(1972, 17.5));
        line5.getData().add(new XYChart.Data(1976, 18.5));
        line5.getData().add(new XYChart.Data(1980, 16.6));
        line5.getData().add(new XYChart.Data(1984, 13.1));
        line5.getData().add(new XYChart.Data(1988, 12.6));
        line5.getData().add(new XYChart.Data(1992, 11.7));
        line5.getData().add(new XYChart.Data(1996, 10.4));
        line5.getData().add(new XYChart.Data(2000, 9.9));
        line5.getData().add(new XYChart.Data(2004, 9.6));
        line5.getData().add(new XYChart.Data(2008, 8.8));

        
        l.getData().add(line5);
        XYChart.Series line6  = new XYChart.Series<>();
        line6.setName("PS");
        line6.getData().add(new XYChart.Data(1968, 7.3));
        line6.getData().add(new XYChart.Data(1972, 5.0));
        line6.getData().add(new XYChart.Data(1976, 2.1));
        line6.getData().add(new XYChart.Data(1980, 3.0));
        line6.getData().add(new XYChart.Data(1984, 5.3));
        line6.getData().add(new XYChart.Data(1988, 3.6));
        line6.getData().add(new XYChart.Data(1992, 2.4));
        line6.getData().add(new XYChart.Data(1996, 0.9));
        line6.getData().add(new XYChart.Data(2000, 0.7));
        line6.getData().add(new XYChart.Data(2004, 0.9));
        line6.getData().add(new XYChart.Data(2008, 5.4));

        
        l.getData().add(line6);
        XYChart.Series line7  = new XYChart.Series<>();
        line7.setName("RKP");
        line7.getData().add(new XYChart.Data(1968, 5.6));
        line7.getData().add(new XYChart.Data(1972, 5.2));
        line7.getData().add(new XYChart.Data(1976, 4.7));
        line7.getData().add(new XYChart.Data(1980, 4.7));
        line7.getData().add(new XYChart.Data(1984, 5.1));
        line7.getData().add(new XYChart.Data(1988, 5.3));
        line7.getData().add(new XYChart.Data(1992, 5.0));
        line7.getData().add(new XYChart.Data(1996, 5.4));
        line7.getData().add(new XYChart.Data(2000, 5.1));
        line7.getData().add(new XYChart.Data(2004, 5.2));
        line7.getData().add(new XYChart.Data(2008, 4.7));

        
        l.getData().add(line7);
        
        
        
        Scene view = new Scene(l);
        window.setScene(view);
        window.show();
        
        
        
        
    }
    public static void main(String[] args) {
        launch(PartiesApplication.class);
    }
    
    
//    public void loadData(String file) throws IOException{
//        Scanner scan = new Scanner(Paths.get(file));
//        int line =0;
//        while(scan.hasNextLine()){
//            String s = scan.nextLine();
//            String[] broken = s.split("\t");
//            
//            
//            
//            if(line ==0){
//            
//              broken[0].getData.add( new XYChart.Data())  
//              
//            }
//            
//            
//            
//            
//            line++;
//                    
//        }
//    }

}
