
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String n = scanner.nextLine();
            if(n.equals("end")){
                break;
            }else{
                int nu = Integer.valueOf(n);
                System.out.println(nu*nu*nu);
            }
        }
    }
}
