
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();
        
        while(true){
            int n = scanner.nextInt();
            
            if(n<0){
                break;
            }else{
                num.add(n);
            }
            
            num.stream().filter(z -> (z>0)&(z<6)).forEach(y -> System.out.println(y));
        }
    }
}
