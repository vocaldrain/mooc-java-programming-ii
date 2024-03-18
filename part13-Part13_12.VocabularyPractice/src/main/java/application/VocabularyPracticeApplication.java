//package application;
//
//
//import javafx.application.Application;
//import javafx.scene.Scene;
//import javafx.stage.Stage;
//import javafx.scene.control.Button;
//import javafx.scene.layout.BorderPane;
//import javafx.scene.layout.HBox;
//
//// END SOLUTION
//public class VocabularyPracticeApplication extends Application {
//    
//    @Override
//    public void start(Stage window){
//        BorderPane bor = new BorderPane();
//        
//        HBox hbo = new HBox();
//        Button newWords = new Button("Enter new words");
//        Button practice = new Button("Practice");
//        
//        
//        hbo.getChildren().addAll(hbo);
//        
//        bor.setTop(hbo);
//        
//        
//        //Labels 
////        Label 
//        
//    
//        
//        
//        
//        
//        
//        Scene firstView = new Scene(bor);
//        window.setScene(firstView);
//        window.show();
//    }
//
//    public static void main(String[] args) {
//        
//        launch(VocabularyPracticeApplication.class);
//        
//    }
//}
package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class VocabularyPracticeApplication extends Application {

    private Vocabularypractice dictionary;

    @Override
    public void init() throws Exception {
        // 1. Create the dictionary that the application uses
        this.dictionary = new Vocabularypractice();
    }

    @Override
    public void start(Stage stage) throws Exception {
        // 2. Create the views ("subviews")
        PracticeView practiceView = new PracticeView(dictionary);
        InputView inputView = new InputView(dictionary);

        // 3. Create the higher level layout
        BorderPane layout = new BorderPane();

        // 3.1. Create the menu for the general layout
        HBox menu = new HBox();
        menu.setPadding(new Insets(20, 20, 20, 20));
        menu.setSpacing(10);

        // 3.2. Create the menu buttons
        Button enterButton = new Button("Enter new words");
        Button practiceButton = new Button("Practice");

        // 3.3. Add the buttons to the menu
        menu.getChildren().addAll(enterButton, practiceButton);
        layout.setTop(menu);


        // 4. Connect the subviews with the buttons. Clicking menu buttons changes the subview.
        enterButton.setOnAction((event) -> layout.setCenter(inputView.getView()));
        practiceButton.setOnAction((event) -> layout.setCenter(practiceView.getView()));

        // 5. First show the input view
        layout.setCenter(inputView.getView());

        // 6. Create the main view and add the high level layout
        Scene view = new Scene(layout, 400, 300);

        // 7. Show the application
        stage.setScene(view);
        stage.show();
    }

    public static void main(String[] args) {
        launch(VocabularyPracticeApplication.class);
    }
}