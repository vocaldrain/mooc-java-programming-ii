package application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;




public class JokeApplication  extends Application {
    
    
    public void start(Stage window) throws Exception {
    
    BorderPane pane = new BorderPane();    
    //view Labels 
    
    HBox hbo = new HBox();
    
    Label question = new Label("What do you call a bear with no teeth?");
    Label answer = new Label("A gummy bear.");
    Label explaination = new Label("Eating too much sugar");
    
    
    //Buttons
    Button firstbutton = new Button("Joke");
    Button secondbutton = new Button("Answer");
    Button thirdbutton = new Button("Explanation");
    
    hbo.setSpacing(10);
    hbo.getChildren().addAll(firstbutton,secondbutton,thirdbutton);
    
    pane.setTop(hbo);    
    
    //Action based on buttons 
    
    firstbutton.setOnAction((event)->
    {pane.setCenter(question);}
    );
    
    secondbutton.setOnAction((event)->
    {
        pane.setCenter((answer));
    });
    
    thirdbutton.setOnAction((event)->{
        pane.setCenter((explaination));
    });
    pane.setCenter(question);
    
    Scene view = new Scene(pane);
    window.setScene(view);
    window.show();
    
    
    }

    public static void main(String[] args) {
//        System.out.println("Hello world!");
        launch(JokeApplication.class);
    }
}
