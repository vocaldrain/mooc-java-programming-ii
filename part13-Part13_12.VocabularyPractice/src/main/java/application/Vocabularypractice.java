
package application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Vocabularypractice {
    private HashMap<String,String> vocab;
    private List<String> words;

    public Vocabularypractice(){
        this.words = new ArrayList<>();
        this.vocab= new HashMap<>();
        
    }
    public void addWord(String word, String translation){
        vocab.put(word,translation);
    }
    
    public boolean check(String word, String translation ){
        if(vocab.containsKey(word)){
            if(vocab.get(word).equals(translation)){
                return true; 
            }else {
                    return false;}
        }
        return false;
    } 
    public String get(String word){
        if(vocab.containsKey(word)){
            return vocab.get(word);
        }
        return null;
    }
    
    
    public String getRandomWord(){
        Random rand = new Random();
        return this.vocab.get((rand.nextInt(this.vocab.size())));
    }
     

    
}
