//PART 2
import java.util.ArrayList;
import java.util.Collections;
public class Demo {

	public static void main(String[] args) {
		//Create an ArrayList of Animal
		//Fill the list with differenet animals
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		
		Animal wolf = new Wolf("Wolfy" , 2);
        Animal parrot = new Parrot("Party" , 3);
        Animal cow = new Cow("Cowy" , 4);
        Animal newWolf = new Wolf();
        Animal polly = new Parrot(7);
        
		animalList.add(wolf);
		animalList.add(parrot);
		animalList.add(cow);
		animalList.add(newWolf);
		animalList.add(polly);
		
		//Print out animalList
		System.out.println("Printing animal list");
		for (Animal animal: animalList) {
			System.out.println("Name: " + animal.getName());
			System.out.println("Age: " + animal.getAge());
		}
		
		//Sort the animals to order from lowest to highest age
		Collections.sort(animalList);
		System.out.println("Printing animal list in asending order of the age");
		for (Animal animal: animalList) {
			System.out.println("Name: " + animal.getName());
			System.out.println("Age: " + animal.getAge());
		}
		
	}

}

/*
 * What is an interface?
 * Variables declared in an interface are by default public, static and final
 * Methods created in an interface are by default abstract
 * they don't have body and must be implemented by the class before accessing
 * The class that implements interface must also implement all method of that interface
 * 
 * How does it differ from an abstract class?
 * Abstract class can inherited by only one class or abstract class
 * whereas interface can extends any number of interfaces at a time, but only interface
 * 
 * Abstract class can have both abstract and concrete methods
 * whereas interface can only have abstract methods
 * 
 * Abstract class have protected and public abstract methods
 * whereas Interface can only have public abstract methods
 * 
 * Abstract class can have static, final or static final variables
 * whereas Interface can only have public static final variable
 */