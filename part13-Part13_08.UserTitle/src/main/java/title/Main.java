package title;
import java.util.Scanner;
import javafx.application.Application;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello world!");

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        
        String[] params = { "inputString=" + input };

        Application.launch(UserTitle.class,params);
        

    }

}
