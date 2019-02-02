
package animals;


public class Eagle extends Bird {
    
    private String name = "Orao";
    private int lifespan = 15;
    private int wingSpan = 2;
    private int babyBird;
    private int age = 1;
    
    @Override
    public void info(){
        super.info();
        System.out.println("Naziv ptice je " + this.name);
        System.out.println("Zivoni vek je " + this.lifespan);
        
        System.out.println("Sirina krila " + this.wingSpan + " m");
        System.out.println("Broj ptica " + this.babyBird);
    }
    
    public void owl(String customName, int customLifeSpan,int customWingSpan,int customBabyBird){
        this.name = customName;
        this.lifespan = customLifeSpan;
        this.wingSpan = customWingSpan;
        this.babyBird = customBabyBird;
    }
    
    public void numberOfBirds(int age){
        if(this.age > 3 + age){
            this.age += age;
            System.out.println("Moze da poleti");
        }else{
            System.out.println("Ne moze da leti");
        }
    }
    
}
