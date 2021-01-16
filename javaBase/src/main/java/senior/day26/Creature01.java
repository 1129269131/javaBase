package senior.day26;

import java.io.Serializable;

/**
 * Create by koala on 2021-01-10
 */
public class Creature01<T> implements Serializable {
    private char gender;
    public double weight;

    private void breath(){
        System.out.println("生物呼吸");
    }

    public void eat(){
        System.out.println("生物吃东西");
    }
}
