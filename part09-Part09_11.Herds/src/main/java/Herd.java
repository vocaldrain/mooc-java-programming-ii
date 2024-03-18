
import java.util.ArrayList;
import java.util.List;


public class Herd implements Movable {
    private List<Movable> list;
    
    
    public Herd(){
        this.list = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable){
        list.add(movable);
    }
    public void move(int dx, int dy){
        for(Movable m: list){
            m.move(dx, dy);
        }
    }
    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        for(Movable m: list){
            stringBuilder.append(m.toString()).append("\n");   
        } 
        return stringBuilder.toString();
    }
}
