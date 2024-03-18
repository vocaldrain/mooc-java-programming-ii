package notifier;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;



public class NotifierApplication  extends Application{

    
    @Override
    public void start(Stage window){
        Button bu = new Button("Update");
        Label l = new Label("");
        TextField input = new TextField();
        VBox v = new VBox();
        v.getChildren().add(input);
        v.getChildren().add(bu);
        v.getChildren().add(l);
        
        
//        BorderPane b = new BorderPane();
        
//        b.setTop(input);
//        b.setCenter(bu);
//        b.setBottom(l);
        
        bu.setOnAction((event) -> l.setText(input.getText()) );
        
        Scene view = new Scene(v);
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
//        System.out.println("Hello world!");
    launch(NotifierApplication.class);
    }

}
