
import java.util.ArrayList;


 public class BoxWithMaxWeight extends Box {
    private int capacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
          if(item.getWeight()<= this.capacity){
              items.add(item);
              this.capacity -= item.getWeight();
          }  
        
//        int sum =0;
//        for(Item i:items){
//            sum += i.getWeight();
//        }
//        if(item.getWeight()+ sum <= this.capacity){
//            items.add(item);
//        }
    }

    @Override
    public boolean isInBox(Item item) {
        for(Item i:items){
            if(i.equals(item)) return true;
        }
        return false;
    }
}

