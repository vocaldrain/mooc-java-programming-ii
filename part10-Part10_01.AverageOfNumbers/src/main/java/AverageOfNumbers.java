
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> n = new ArrayList<>();
        
        
        while(true){
            String m = scanner.nextLine();
            if(m.equals("end")){
                break;
            }
            n.add(m);
        }
        double avg = n.stream().mapToInt(m -> Integer.valueOf(m)).average().getAsDouble();
        System.out.println("average of the numbers:" + avg);
    }
}
