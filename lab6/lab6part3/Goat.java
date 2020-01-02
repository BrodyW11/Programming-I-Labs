
package lab6.lab6part3;


public class Goat extends Herbivore {
    public Goat(String name, int age) {
        super(name, age);
    }

      public void makeNoise(String Noise) {
        System.out.println("Goat " + this.getName() + " " + this.getAge() + " years old making "+Noise);

    }
      
      public void eat(Food f){
        if(f instanceof Meat)
        {
            throw new IllegalArgumentException("Goat dont eat Meat");
        }
        else{
            System.out.println("Herbivore Animal " + this.getName() + " " + this.getAge() + " years old eating " + f.getName());
        }
    }  
}
