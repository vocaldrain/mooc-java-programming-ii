
public class Book  implements Packable {
    private String author;
    private String name;
    private double weight;
    public Book(String author, String name,double weight){
        this.author = author;
        this.name = name;
        this.weight= weight;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public double weight() {
         return weight;
    }
    
    public String toString(){
        return this.getAuthor() + ": " + this.getName();
    }
    
}
