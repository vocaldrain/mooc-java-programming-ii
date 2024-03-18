package buttonandlabel;

//import java.awt.Button;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.layout.FlowPane;
import javafx.scene.Scene;

import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class ButtonAndLabelApplication  extends Application {

    public void start (Stage window){
        
        Button b1 = new Button("Click Me");
        Label l1  = new Label("New World Order ");
        
        FlowPane p = new FlowPane();
        p.getChildren().add(b1);
        p.getChildren().add(l1); 
        
        Scene view = new Scene(p);

        
        window.setScene(view);
        window.show();
        
    }
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        launch(ButtonAndLabelApplication.class);
    }

}
