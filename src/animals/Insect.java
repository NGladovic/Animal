
package animals;


public class Insect extends Animal{

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }
    
    public int numberOfLegs = 6;

    @Override
    public void move() {
       
    }

    @Override
    public void eat() {
       
    }

    
    
}
