
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> num = new ArrayList<>();
        
        
        System.out.println("Input numbers, type \"end\" to stop.");
        while(true){
           String n = scanner.nextLine();
           if(n.equals("end")){
               break;
           }
           num.add(n);
        }
        System.out.println("Print the average of the negative numbers or the positive numbers?(n/p");
        String response = scanner.nextLine();
        if(response.equals("p")){
            System.out.println("Average of the positive numbers: " + num.stream().mapToInt(n -> Integer.valueOf(n)).filter(n -> n>0).average());
        }else{
            System.out.println("Average of the negative numbers: -" + num.stream().mapToInt(n -> Integer.valueOf(n)).filter(n -> n<0).average());
        }
        

    }
}
