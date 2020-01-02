package lab6.lab6part2;

public class Wolf extends Animal {

    public Wolf(String name, int age) {
        super(name, age);
    }

    public void makeNoise(String Noise) {
        System.out.println("Wolf " + this.getName() + " " + this.getAge() + " years old making "+Noise);

    }

}
