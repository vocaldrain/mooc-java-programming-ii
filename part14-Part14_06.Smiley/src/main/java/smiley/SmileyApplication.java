package smiley;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class SmileyApplication extends Application {

    public void start(Stage window){
        
        BorderPane b = new BorderPane();
        Canvas canva = new Canvas(640, 480);
        
        b.setCenter(canva);
        
        
        GraphicsContext painter = canva.getGraphicsContext2D();
        
        painter.setFill(Color.WHITE);
        painter.fillRect(0, 0, canva.getWidth(), canva.getHeight());
        
        painter.setFill(Color.BLACK);
        painter.fillRect(150, 100, 50, 50);
        painter.fillRect(350, 100, 50, 50);
        
        
        painter.fillRect(100, 250, 50, 50);
        painter.fillRect(400, 250, 50, 50);
        painter.fillRect(150, 275, 50, 50);
        painter.fillRect(200, 275, 50, 50);
        painter.fillRect(250, 275, 50, 50);
        painter.fillRect(300, 275, 50, 50);
        painter.fillRect(350, 275, 50, 50);
       
        Scene view = new Scene(b); 
        
        
        window.setScene(view);
        window.show();
    }
    public static void main(String[] args) {
        launch(SmileyApplication.class);
    }

}
