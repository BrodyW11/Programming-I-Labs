package lab6.lab6part3;

public class Herbivore extends Animal {

    public Herbivore(String name, int age) {
        super(name, age);
    }

    void makeNoise(String Noise) {
       
    }

    void eat(Food f) {
        System.out.println("Herbivore Animal " + this.getName() + " " + this.getAge() + " years old eating " + f.getName());
        try{
			if(f instanceof Meat)
				throw new Exception();
		}catch(Exception e){
			System.out.println("This animal should not eat meat");
		}
	
	}
	


}
