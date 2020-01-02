package lab6.lab6part3;

public class Omnivore extends Animal {

    public Omnivore(String name, int age) {
        super(name, age);
    }

    void makeNoise(String Noise) {
       
    }

    void eat(Food f) {
        System.out.println("Omnivore Animal " + this.getName() + " " + this.getAge() + " years old eating " + f.getName());
    }

}
