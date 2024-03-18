
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your  here!
    }
    
    
    
    public static void printKeys(HashMap<String,String> hashmap){
        hashmap.keySet().forEach(System.out::println);
    }
    
    public static void printKeysWhere(HashMap<String,String> hashmap,String text){
        hashmap.keySet().stream()
                .filter(key -> key.contains(text))
                .forEach(System.out::println);
    }
    
    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text){
        hashmap.entrySet().stream()
                .filter(entry -> entry.getKey().contains(text))
                .map(entry -> entry.getValue())
                .forEach(System.out::println);
    }

    }

