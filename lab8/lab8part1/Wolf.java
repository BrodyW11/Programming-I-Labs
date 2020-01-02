//PART 1
/*
public class Wolf extends Animal{
    //Get animal's name
    private String getName(){
        return name;
    }
    
    //Get animal's age
    private int getAge(){
        return age;
    }
}
*/
public class Wolf extends Carnivore{
    //Create wolf and set its name and age
    public Wolf(String name, int age){
        super(name, age);
    }
    
    //LAB 8
    public Wolf() {
    	super();
    }
    
    //Method for wolf to make a noise
    public void makeNoise(String noise){
        noise = "Ow";
        System.out.println(super.getName() + " goes " + noise);
    }

}