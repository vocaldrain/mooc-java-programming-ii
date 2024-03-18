import java.util.HashMap;
import java.util.ArrayList;

public class StorageFacility {
    HashMap<String, ArrayList<String>> list;

    public StorageFacility(){
        this.list = new HashMap<>();
    }

    
    public void add(String unit, String item){
        list.putIfAbsent(unit, new ArrayList<>());
        ArrayList<String> lis = list.get(unit);
        lis.add(item);
        
        
    }
    public ArrayList<String> contents(String storageUnit){
        if(list.containsKey(storageUnit)){
            return list.get(storageUnit);
        }else{
            return new ArrayList<>();
            
        }
    }
    
    public void remove(String storageUnit, String item){
        ArrayList<String> itemList = list.get(storageUnit);
        if (itemList != null) {
            itemList.remove(item);
            if (itemList.isEmpty()) {
                list.remove(storageUnit);
            }
        }
    }
    
    public ArrayList<String> storageUnits(){
                return new ArrayList<>(list.keySet());

    }
    
}
    
