
import java.util.Scanner;


public class UserInterface {
    private TodoList todo;
    private Scanner scan;

    public UserInterface(TodoList todo, Scanner scan){
        this.todo=todo;
        this.scan = scan;
        
    }
    
    public void start(){
        while(true){
        System.out.println("Command: ");
        String input = scan.nextLine().trim();
        
        if(input.equals("stop")){
            break;
        }
        else if(input.equals("add")){
             System.out.println("To add:");
             String add = scan.nextLine();
             todo.add(add);
//             todo.print(); 
        }else if(input.equals("remove")){
//            System.out.println("Which one is removed?");
            int n = scan.nextInt();
            scan.nextLine();
            todo.remove(n);
        }else if(input.equals("list")){
            todo.print();
        }
        
    }

}
}

