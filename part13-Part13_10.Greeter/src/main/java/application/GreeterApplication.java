package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class GreeterApplication  extends Application{

    @Override
    public void start(Stage window){
        VBox hori = new VBox();
        Label l = new Label("Username: ");
        Button bo = new Button("Go");
                
        TextField input = new TextField();
        
        
        hori.getChildren().addAll(l, input ,bo);
        
        String messsage = input.getText();

        BorderPane s = new BorderPane();
        Label n = new Label("");
        
        s.getChildren().add(n);
        Scene firstView = new Scene(hori);
        Scene secondView = new Scene(s);
        
       bo.setOnAction((event)-> {
           String message = input.getText();
            n.setText("Welcome " + message + "!");
            window.setScene(secondView);
       });
        
       
        
        window.setScene(firstView);
        window.show();
    }
    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }
}
