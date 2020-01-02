//PART 2
/*
 public class Herbivore extends Animal{
 */

//PART 3
public abstract class Herbivore extends Animal{
    //Create a Herbivore and set its name and age
    public Herbivore(String name, int age){
        super(name, age);
    }
    
    //Get name of animal
    public String getName(){
        return super.getName();
    }
    
    //Method to feed animal to right food - plant
    public void eat(Food food) throws Exception{
        //If given food is meat, show error message
        if (food instanceof Meat){
            throw new Exception("An error message: Wrong food is given");
        }
        //If right food is given, print what food the animal is eating
        else{
            System.out.println("The animal " + getName() + " is eating " + food.getName());
        }
    }
    
    /*
    //Method to make a noise if class is not abstract
    public void makeNoise(String noise){
        System.out.println("Make some noise");
    }
    */
}