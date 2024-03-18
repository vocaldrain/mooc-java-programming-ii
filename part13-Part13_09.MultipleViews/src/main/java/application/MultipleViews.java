package application;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class MultipleViews extends Application {
    
    @Override
    public void start(Stage window){
        
        //First View
        BorderPane b = new BorderPane();
        Button firstViewButton = new Button("To the second view!");
        b.setTop( new Label("First view!"));
        b.setCenter(firstViewButton);
        
        
        
        //Second View
        VBox second = new VBox();
        Button secondViewButton = new Button("To the third view!");
        second.getChildren().add(secondViewButton);
        second.getChildren().add(new Label("Second view!"));
                
        
        
       //Third View 
       GridPane third = new GridPane();
       Label thirdViewText = new Label("Third view!");
       Button thirdViewButton = new Button("To the first view!");
       third.add(thirdViewText, 0, 0);
       third.add(thirdViewButton, 0, 1);
      
       
        
        
        
       
        
        
        
        
        Scene firstScene = new Scene(b);
        Scene secondScene = new Scene(second);
        Scene thirdScene = new Scene(third);
        window.setScene(firstScene);
        window.show();
        
        
        
        //Action Buttons
               
       firstViewButton.setOnAction((event) ->
       window.setScene(secondScene));
        
       secondViewButton.setOnAction((event) ->
       window.setScene(thirdScene));
        
       thirdViewButton.setOnAction((event) ->
       window.setScene(firstScene));
        
      
    }
    public static void main(String[] args) {
       launch(MultipleViews.class);
    }

}
