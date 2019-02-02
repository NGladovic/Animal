
import animals.Bird;
import animals.Eagle;
import animals.Fish;
import animals.Insect;


public class Main {

    
    public static void main(String[] args) {
        
        Bird myBird = new Bird();
        
        myBird.info();
        myBird.move();
        myBird.eat();
        
        
        Eagle eagle = new Eagle();
        eagle.info();
        eagle.move();
        eagle.eat();
        
        eagle.owl("Sova", 10, 1,2);
        eagle.info();
        
        eagle.numberOfBirds(1);
        
        
        Fish myFish = new Fish();
        
        myFish.info();
        myFish.move();
        myFish.eat();
        
       Insect fly = new Insect();
       myBird.setFavoriteInsect(fly);
        System.out.println("My birds favorite insect has " + myBird.getFavoriteInsect().getNumberOfLegs());
    }
    
}
