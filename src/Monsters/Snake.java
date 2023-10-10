package Monsters;

import java.util.Random;

public class Snake extends Monster {

    Random r = new Random();
    public Snake() {
        super(4, "Serpent", 0,12,0);
    }


    @Override
    public int setRandomDamage() {
        return r.nextInt(3,7);
    }
}