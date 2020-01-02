package lab6.lab6part3;

public class Parrot extends Omnivore {

    public Parrot(String name, int age) {
        super(name, age);
    }

    public void makeNoise(String Noise) {
        System.out.println("Parrot " + this.getName() + " " + this.getAge() + " years old making " + Noise);

    }

    public void eat(Food f) {

        System.out.println("Omnivore Animal " + this.getName() + " " + this.getAge() + " years old eating " + f.getName());

    }
}
