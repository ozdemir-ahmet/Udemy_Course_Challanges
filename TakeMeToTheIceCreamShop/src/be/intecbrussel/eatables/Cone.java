package be.intecbrussel.eatables;

import java.util.Arrays;

public class Cone implements Eatable{
    private  Flavor[] balls;

    public Cone () {

    }

    public Cone (Flavor[] balls) {
        this.balls = balls;
    }

    @Override
    public void eat () {
        System.out.print("you are now eating a Cone with balls ");
        for (int i = 0 ; i < balls.length ; i ++) {
            System.out.println(balls[i]);
        }
    }
}
