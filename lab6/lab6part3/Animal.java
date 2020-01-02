package lab6.lab6part3;

public abstract class Animal {

    private String name;
    private int age;

    public Animal() {
        this.name = "Animal";
        this.age = 5;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    abstract void makeNoise(String Noise);
    abstract void eat(Food f);
}
