
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> input = new ArrayList<>();
        
        while(true){
            String word = scanner.nextLine();
            if(word.equals("")){
                break;
            }else{
                input.add(word);
            }
        }
        
        input.stream().forEach(str -> System.out.println(str));

    }
}
