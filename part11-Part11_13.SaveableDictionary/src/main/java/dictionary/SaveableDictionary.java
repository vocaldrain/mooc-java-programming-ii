
package dictionary;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SaveableDictionary {
    private Dictionary d ;
    private String savefile;
    
    
    public SaveableDictionary(){
        this.d = new Dictionary();
    }
    
    public SaveableDictionary(String file) throws IOException{
        this();
        this.savefile = file;     
    }
    public void add(String words, String translation){
            d.add(words,translation);
            
//            Dictionary.putIfAbsent(translation,words);
    }
    
    public String translate(String word){
        return d.translate(word);
    }
    public void delete(String word){
        d.delete(word);
    }
    public boolean load(){
        try {
            Scanner fileReader = new Scanner(Paths.get(savefile));
            while(fileReader.hasNextLine()){
                String n = fileReader.nextLine();
                String[] part = n.split(":");
                d.add(part[0],part[1]);
            }
            return true;
        } catch (IOException ex) {
            return false;
        }
        }
    
    
    public boolean save() {
    try (PrintWriter writer = new PrintWriter(new FileWriter(savefile, false))) {
        for (Map.Entry<String, String> entry : d.getDictionary().entrySet()) {
            writer.println(entry.getKey() + ":" + entry.getValue());
        }
        return true;
    } catch (IOException ex) {
        return false;
    }
}
}

