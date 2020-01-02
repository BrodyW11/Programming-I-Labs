public abstract class Animal implements Comparable<Animal>{
    String name;
    Integer age;
    String noise;
    
    //Create animal and set its name and age
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    //LAB8
    public Animal() {
    	this("newborn", 0);
    }
    
    //Get name of animal
    public String getName(){
        return name;
    }
    
    //Get animal's age
    public int getAge(){
        return age;
    }
    /*
     * Method to make a noise
    public void makeNoise(String noise){
        System.out.println(noise);
    }
    */
    

    //Abstract method that require animal to have method to make a noise
    public abstract void makeNoise(String noise);
    //Abstract method that requires animal to have method to eat
    public abstract void eat(Food name) throws Exception;

    //LAB 8
    //Feed the Food object to the Animal for the specified number of times
    public void eat(Food food, int times) {
    	for (int i = 0; i < times; i++) {
    		System.out.println("The animal " + getName() + " is eating " + food.getName());
    	}
    }
    
    //Compare the ages of the Animals
    public int compareTo(Animal animal) {
    	//If the objects are the same, return 0
    	if (this == animal) {
    		return 0;
    	}
    	//To order the animals from highest age to lowest age
    	//Uncomment the following line
    	//else if (this.getAge() < animal.getAge()){
    	
    	//If the current object is greater than the given object
    	//Return a positive value
    	else if (this.getAge() > animal.getAge()) {
    		return 1;
    	}
    	return -1;
    }
    
    
}