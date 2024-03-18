
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First:" + first);
            System.out.println("Second:" + second);
            

            String input = scan.nextLine();
            
            if (input.equals("quit")) {
                break;
            }
            else if(input.contains("add")){
                String[] split =  input.split(" ");
                first.add(Integer.valueOf(split[1]));
            }
            else if(input.contains("remove")){
                String[] split = input.split(" ");
                second.remove(Integer.valueOf(split[1]));
            }
            else if(input.contains("move")){
                String[] split = input.split(" ");
                if(first.contains() >= (Integer.valueOf(split[1]))){
                first.remove(Integer.valueOf(split[1]));
                second.add(Integer.valueOf(split[1]));    
                }else{
                    second.add(first.contains());
                    first.remove(first.contains());
                }
                
            }
            System.out.print("");

        }
    }

}
