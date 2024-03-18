package myFirstApplication;
import javafx.stage.Stage;
import javafx.application.Application;

public class MyFirstApplication  extends Application {
    

    public void start(Stage window){
        window.setTitle("My first application");
        window.show();
                
    }
    
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        launch(MyFirstApplication.class);
    }

}
