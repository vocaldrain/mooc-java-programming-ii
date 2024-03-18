
package dictionary;
import java.util.HashMap;

public class Dictionary {
    private HashMap<String, String> dictionary;
    
    
    
    public Dictionary(){
        dictionary = new HashMap<>();
        
    }
    
    
    
    public void add(String words, String translarion){
        dictionary.putIfAbsent(words, translarion);
    }
    public String translate(String word){
      if(dictionary.containsKey(word) )
      {
          return dictionary.get(word);
      }
      else if(dictionary.containsValue(word)){
          for(String k : dictionary.keySet()){
              if(dictionary.get(k).equals(word)){
                  return k;}
          }
      }    
      return null;
    }
    
//   public void delete(String word) {
//    String translation = dictionary.remove(word);
//    if (translation != null) {
//        dictionary.values().removeIf(value -> value.equals(translation));
//    }
    
//}
    
    
    
    public void delete(String word) {
        String itemToRemove = "";
        for (String item : this.dictionary.keySet()) {
            if (this.dictionary.get(item).equals(word)) {
                itemToRemove = item;
            } else if (this.dictionary.get(word) != null) {
                itemToRemove = word;
            }
        }

        this.dictionary.remove(itemToRemove);
    }
    public HashMap<String, String> getDictionary() {
        return dictionary;
    }
}
