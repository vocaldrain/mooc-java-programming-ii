package title;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class UserTitle extends Application {
    @Override
    public void start(Stage window){
        Parameters params = getParameters();
        String title = params.getNamed().get("inputString");
        window.setTitle(title);
        window.show();
        
    }
}
