package lab6.lab6part3;

public class Wolf extends Carnivore {

    public Wolf(String name, int age) {
        super(name, age);
    }

      public void makeNoise(String Noise) {
        System.out.println("Wolf " + this.getName() + " " + this.getAge() + " years old making "+Noise);

    }
      
    public void eat(Food f){
        if(f instanceof Plant)
        {
            throw new IllegalArgumentException("Wolf dont eat plants");
        }
        else{
            System.out.println("Carnivore Animal " + this.getName() + " " + this.getAge() + " years old eating " + f.getName());
        }
    }  
      
}
