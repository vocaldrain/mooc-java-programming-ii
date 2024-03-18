package borderpane;

import javafx.application.Application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class BorderPaneApplication  extends Application {
    @Override
    public void start(Stage window){
        Label northLabel = new Label("NORTH");
        Label eastLabel = new Label("EAST");
        Label southLabel = new Label("SOUTH");
        
        
        
        BorderPane b = new BorderPane();
        b.setTop(northLabel);
        b.setRight(eastLabel);
        b.setBottom(southLabel);
        
        
        Scene s = new Scene(b);
        window.setScene(s);
        window.show();
        
        
    }
    
    
    


    public static void main(String[] args) {
//        System.out.println("Hello world!");
        launch(BorderPaneApplication.class);
                
    }

}
