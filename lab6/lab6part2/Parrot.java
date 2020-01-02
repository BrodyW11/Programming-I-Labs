package lab6.lab6part2;

public class Parrot extends Animal {

    public Parrot(String name, int age) {
        super(name, age);
    }

    public void makeNoise(String Noise) {
        System.out.println("Parrot " + this.getName() + " " + this.getAge() + " years old making "+Noise);

    }
}
