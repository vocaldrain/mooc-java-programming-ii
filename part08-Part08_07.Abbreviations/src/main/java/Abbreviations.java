import java.util.HashMap;
public class Abbreviations {
    private HashMap<String,String> abb;
    
    
    public Abbreviations(){
        this.abb=new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation){
        abb.put(abbreviation, explanation);
    }
    public boolean hasAbbreviation(String abbreviation){
        return abb.get(abbreviation) != null;
    }
    public String findExplanationFor(String abbreviation){
        return abb.get(abbreviation);
    }
}
