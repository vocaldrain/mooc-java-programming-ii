
import java.util.LinkedList;
import java.util.Queue;


public class Pipe<T> {
    Queue<T> list;
    
    public Pipe(){
        this.list = new LinkedList<>();
        
    }
    
    public void putIntoPipe(T value){
        list.add(value);
    }
    public T takeFromPipe(){
        if(list.isEmpty()){return null;
        }
        else {
            return list.remove();
        }
 
        
    }
    public boolean isInPipe(){
//        if(list.isEmpty()){
//            return false;
//        }else{
//            return true;
//        }
        return list.isEmpty();
    }
    
    
    
}
