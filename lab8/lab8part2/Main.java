public class Main{
    public static void main (String arg[]){
        //Create new animals and food
        Animal wolf = new Wolf("Wolfy" , 2);
        Animal parrot = new Parrot("Party" , 3);
        Animal cow = new Cow("Cowy" , 4);
        Food meat = new Meat("chicken");
        Food plant = new Plant("grass");
        
        //LAB 8
        Animal newWolf = new Wolf();
        Animal polly = new Parrot(7);
        
        //Print out the name, age, noise of the wolf
        System.out.println("There is a wolf called " + wolf.getName() + ", aged " + wolf.getAge());
        wolf.makeNoise("Ow");
        System.out.println();
        
        //Print out the name, age, noise of the parrot
        System.out.println("There is a parrot called " + parrot.getName() + ", aged " + parrot.getAge());
        parrot.makeNoise("Aw");
        System.out.println();
        
        //If Herbivore class is not abstract, the following line of code is required
        //cow.makeNoise("Moo");
        //System.out.println();
        
        /*
         * Demonstrate eat method which prints out what the animal eats
        wolf.eat(meat);
        parrot.eat(plant);
        cow.eat(plant);  
        */
        
        //Try feeding an animal a wrong type of food
        try{
            //Feed chicken to a cow
            System.out.println("Feeding " + meat.getName() + " to cow which is a herbivore");
            cow.eat(meat);
            //Feed grass to a wolf
            System.out.println("Feeding " + plant.getName() + " to wolf which is a herbivore");
            wolf.eat(plant);
        }
        //Throw exception in the error panel saying wrong food is given
        catch (Exception e){
            System.err.println(e);
        }

        //LAB 8
        
        //PART 1
        //Demonstrate eat method which prints out what the animal eats till the number of times given
        wolf.eat(meat, 3);
        parrot.eat(plant, 3);
        cow.eat(plant, 3);
        
        
    }
}