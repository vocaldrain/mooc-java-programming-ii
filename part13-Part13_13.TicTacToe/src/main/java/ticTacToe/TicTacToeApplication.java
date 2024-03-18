package ticTacToe;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TicTacToeApplication extends Application {
    private char currentPlayer = 'X';
    private boolean gameOver = false;
    private Button[][] buttons = new Button[3][3];
    private Text turnText = new Text("Turn: X");

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        root.setTop(turnText);

        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                Button btn = new Button(" ");
                btn.setFont(Font.font("Monospaced", 40));
                final int currentRow = row;
final int currentCol = col;
btn.setOnAction(e -> {
    if (!gameOver && buttons[currentRow][currentCol].getText().equals(" ")) {
        buttons[currentRow][currentCol].setText(Character.toString(currentPlayer));
        if (checkWin(currentRow, currentCol)) {
            turnText.setText("The end!");
            gameOver = true;
        } else {
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            turnText.setText("Turn: " + currentPlayer);
        }
    }
});
                buttons[row][col] = btn;
                gridPane.add(btn, col, row);
            }
        }

        root.setCenter(gridPane);

        Scene scene = new Scene(root, 300, 300);
        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private final boolean  checkWin(int row, int col) {
        String symbol = Character.toString(currentPlayer);

        // Check row
        if (buttons[row][0].getText().equals(symbol) &&
            buttons[row][1].getText().equals(symbol) &&
            buttons[row][2].getText().equals(symbol)) {
            return true;
        }
        // Check column
        if (buttons[0][col].getText().equals(symbol) &&
            buttons[1][col].getText().equals(symbol) &&
            buttons[2][col].getText().equals(symbol)) {
            return true;
        }
        // Check diagonals
        if ((buttons[0][0].getText().equals(symbol) &&
             buttons[1][1].getText().equals(symbol) &&
             buttons[2][2].getText().equals(symbol)) ||
            (buttons[0][2].getText().equals(symbol) &&
             buttons[1][1].getText().equals(symbol) &&
             buttons[2][0].getText().equals(symbol))) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }
}
