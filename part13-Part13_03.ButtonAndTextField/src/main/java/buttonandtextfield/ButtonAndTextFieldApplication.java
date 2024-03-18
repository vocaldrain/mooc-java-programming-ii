package buttonandtextfield;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;


public class ButtonAndTextFieldApplication extends Application {
    
    @Override
    public void start(Stage window){
        
        Button b = new Button("Click Me");
        TextField t = new TextField();
        
        FlowPane p = new FlowPane();
        p.getChildren().add(t);
        p.getChildren().add(b);
        
        Scene s = new Scene(p);
        
        window.setScene(s);
        window.show();
        
        
    }
    
    
    
        


    public static void main(String[] args) {
//        System.out.println("Hello world!");



        launch(ButtonAndTextFieldApplication.class);
    }

    

}
