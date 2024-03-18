
public class CD implements Packable{
    private String artist;
    private String name;
    private int year;
    
    
    public CD(String artist,String name, int year){
        this.artist = artist;
        this.name = name;
        this.year = year;
    }
    public String getArtist(){
        return this.artist;
    }
    public String getName(){
        return this.name;
    }
    public int getYear(){
        return this.year;
    }
    public double getWeight(){
        return 0.1;
        
    }
    
    
    public String toString(){
        return this.getArtist() + ": " + this.getName() + " (" + this.getYear() + ")";
    }

    @Override
    public double weight() {
         return 0.1;
    }
}
