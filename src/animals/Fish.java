
package animals;


public class Fish extends Animal{
    
    public String outerCovering = "scales";
    public String reproduction = "spawning";
    

    @Override
    public void move() {
        System.out.println("Riba pliva");
    }

    @Override
    public void eat() {
        System.out.println("Riba jede crvice; ");
    }
    
    @Override
    public void info(){
        super.info();
        System.out.println("Outer Covering " + this.outerCovering);
        System.out.println("reproduction " + this.reproduction);
    }

    
    
    
    
}
