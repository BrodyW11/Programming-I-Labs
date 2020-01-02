//PART 3
public class Cow extends Herbivore{
    //Create Cow and set its name and age
    public Cow (String name, int age){
        super(name, age);
    }
    
    //Method for Cow to make a noise
    public void makeNoise(String noise){
        noise = "Moo";
        System.out.println(super.getName() + " goes " + noise);
    }
}