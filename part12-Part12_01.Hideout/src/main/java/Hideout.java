import java.util.ArrayList;
public class Hideout<T> {
    
    ArrayList<T> hideout;
    
    public Hideout(){
        this.hideout = new ArrayList<>();
        
        
    }
    
    
    public void putIntoHideout(T toHide){
        if(hideout.contains(toHide)){
            hideout.remove(toHide);
            
        }else{
            hideout.add(toHide); 
        }
    }
    
    public T takeFromHideout(){
        if(hideout.isEmpty() ) return null;
        else {
           return  hideout.get(hideout.size()-1);
        }
    }
    public boolean isInHideout(){
        if(hideout.isEmpty() ){
            return false;
        }
        else return true;
        
    }
    
}
