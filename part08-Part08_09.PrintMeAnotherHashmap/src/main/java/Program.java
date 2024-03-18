
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
    }
    
    public static void printValues(HashMap<String, Book> hashmap){
        for(Book n: hashmap.values()){
            System.out.println(n);
        }
    }
    
    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text){
        for(Book n: hashmap.values()){
            if(n.getName().contains(text)){
                System.out.println(n);
            }
        }
    }

}
