//PART 1
/*
public class Parrot extends Animal{
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
public class Parrot extends Omnivore{
    //Create Parrot and set its name and age
    public Parrot(String name, int age){
        super(name, age);
    }
    
    //LAB 8
    
    public Parrot(int age) {
    	this("Polly",age);
    }

    //Method for Parrot to make a noise
    public void makeNoise(String noise){
        noise = "Aw";
        System.out.println(super.getName() + " goes " + noise);
    }
}