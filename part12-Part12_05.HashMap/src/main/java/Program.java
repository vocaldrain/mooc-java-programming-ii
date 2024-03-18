
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random num = new Random();
        int input = scanner.nextInt();
        
        while(input-- >=0){
            System.out.println(num.nextInt(10));
        }

    }

}
