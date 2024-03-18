
public class Person {
    private String name;
    private String address;
    
    public Person(String name, String address){
        this.name=name;
        this.address=address;
    }
    public String name(){
        return name;
    }
    public String address(){
        return address;
    }
    @Override
    public String toString(){
        return name + "\n" + "  " + address ;
    }
}
