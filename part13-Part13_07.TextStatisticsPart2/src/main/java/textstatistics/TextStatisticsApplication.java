package textstatistics;


import java.util.Arrays;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TextStatisticsApplication extends Application {

    @Override
    public void start(Stage window) {
        Label letters = new Label("Letters: 0");
        Label words = new Label("Words: 0");
        Label longest = new Label("The longest word is: ");

        TextArea textArea = new TextArea();

        // Add listener to TextArea's textProperty
        textArea.textProperty().addListener((ObservableValue<? extends String> observable, String oldValue, String newValue) -> {
            int characters = newValue.length(); // Count characters excluding white spaces
            String[] parts = newValue.split("\\s+"); // Split text by white spaces
            int wordsCount = parts.length;
            String longestWord = Arrays.stream(parts)
                    .max((s1, s2) -> s1.length() - s2.length())
                    .orElse("");
            
            letters.setText("Letters: " + characters);
            words.setText("Words: " + wordsCount);
            longest.setText("The longest word is: " + longestWord);
        });

        // Create layout
        BorderPane borderPane = new BorderPane();
        HBox bottomBox = new HBox(10);
        bottomBox.getChildren().addAll(letters, words, longest);
        borderPane.setCenter(textArea);
        borderPane.setBottom(bottomBox);

        // Set Scene
        Scene scene = new Scene(borderPane, 400, 300);
        window.setScene(scene);
        window.setTitle("Text Statistics");
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
