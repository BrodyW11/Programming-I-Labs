package lab6.lab6part3;

public class TestLab6Part3 {

    public static void main(String[] args) {
        Meat M = new Meat("Chicken");
        Plant pl = new Plant("Plant");
        
        Wolf w = new Wolf("GrimWolf", 10);
        w.makeNoise("ooooo");
        w.eat(M);
        w.eat(pl);
        
        Parrot p = new Parrot("Moe", 5);
        p.makeNoise("kawaa");
        p.eat(M);
        p.eat(pl);
        
        Goat G = new Goat("Goat",8);
         G.makeNoise("Gawaa");
        G.eat(M);
        G.eat(pl);
    }
}
