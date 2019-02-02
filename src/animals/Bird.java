package animals;


public class Bird extends Animal{
    
    private String reproduction = "egg";
    private String outerCovering = "feather";
    private int hight = 180;
    private int flightDuratio = 3; // hour
    private Insect favoriteInsect;

    public void setReproduction(String reproduction) {
        this.reproduction = reproduction;
    }

    public void setOuterCovering(String outerCovering) {
        this.outerCovering = outerCovering;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }

    public void setFlightDuratio(int flightDuratio) {
        this.flightDuratio = flightDuratio;
    }

    public void setFavoriteInsect(Insect favoriteInsect) {
        this.favoriteInsect = favoriteInsect;
    }

    public String getReproduction() {
        return reproduction;
    }

    public String getOuterCovering() {
        return outerCovering;
    }

    public int getHight() {
        return hight;
    }

    public int getFlightDuratio() {
        return flightDuratio;
    }

    public Insect getFavoriteInsect() {
        return favoriteInsect;
    }
    
    
    
    
    @Override
    public void move() {
        System.out.println("Ptica leti.");
    }

    @Override
    public void eat() {
        System.out.println("Ptica kluca");
        
    }
    
   
    
    @Override
    public void info(){
        super.info();
        System.out.println("Reproduction " + this.reproduction);
        System.out.println("Outer Covering  " + this.outerCovering);
        
        
    }
}
