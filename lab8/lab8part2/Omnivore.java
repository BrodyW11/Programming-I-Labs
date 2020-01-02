//PART 2
/*
 public class Omivore extends Animal{
 */

//PART 3
public abstract class Omnivore extends Animal{
    //Create a omnivore and set its name and age
    public Omnivore(String name, int age){
        super(name, age);
    }
    
    //Get name of animal
    public String getName(){
        return super.getName();
    }
    
    //Method to eat food - either plant or meat
    public void eat(Food food){
        //Print out what the animal is eating
        System.out.println("The animal " + getName() + " is eating " + food.getName());
    }
    
    /*
    //Method to make a noise if this class is not abstract
    public void makeNoise(String noise){
        System.out.println("Make some noise");
    }
    */
}