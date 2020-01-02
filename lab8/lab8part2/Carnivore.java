//PART 2
/*
 public class Carnivore extends Animal{
 */

//PART 3
public abstract class Carnivore extends Animal{
    //Create a carnivore and set its name and age
    public Carnivore(String name, int age){
        super(name, age);
    }
    
    //LAB 8
    public Carnivore() {
    	super();
    }
    
    //Get name of animal
    public String getName(){
        return super.getName();
    }
    
    //Method to feed animal to right food - meat
    public void eat(Food food) throws Exception{
        //If given food is plant, show error message
        if (food instanceof Plant){
            throw new Exception("An error message: Wrong type of food is given");
        }
        //If right food is given, print what food the animal is eating
        else{
            System.out.println("The animal " + getName() + " is eating " + food.getName());
        }
    }
    
    /*
    //Method to make a noise if this class is not abstract
    public void makeNoise(String noise){
        System.out.println("Make some noise");
    }
    */
}