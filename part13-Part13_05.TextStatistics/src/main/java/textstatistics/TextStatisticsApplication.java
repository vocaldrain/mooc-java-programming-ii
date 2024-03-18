package textstatistics;

import javafx.application.Application;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;

import javafx.scene.Scene;
import javafx.scene.control.Label;
//import java.
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;


public class TextStatisticsApplication  extends Application{

    @Override
    public void start(Stage window){
        
        BorderPane b = new BorderPane();
        HBox hbo = new HBox();
        hbo.getChildren().add(new Label("Letters: 0"));
        hbo.getChildren().add(new Label("Words: 0"));
        hbo.getChildren().add(new Label("The longest word is:"));
        
        b.setCenter(new TextArea());
        b.setBottom(hbo);
        
        
        Scene view = new Scene(b);
        
        
        window.setScene(view);
        window.show();
    }
    public static void main(String[] args) {
//        System.out.println("Hello world!");
    launch(TextStatisticsApplication.class);
    }

}
