
import java.util.HashMap;


public class IOU {
    private HashMap<String, Double> list;
    public IOU(){
      this.list = new HashMap<>();  
    }
    
    
    public void setSum(String toWhom, double amount){
        list.put(toWhom,amount);
    }
    
    public double howMuchDoIOweTo(String toWhom) throws Exception {
    if (list.containsKey(toWhom)) {
        return list.get(toWhom);
    } else {
//        throw 
        return 0.0;
    }
}

    }
    