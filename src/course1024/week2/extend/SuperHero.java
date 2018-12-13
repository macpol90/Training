package course1024.week2.extend;

/**
 * Created by Maciej Polansky on 2018-12-03.
 **/

public class SuperHero extends Human {
    String superPower;

    public SuperHero(String name, int age, String superPower) {
        super(name, age);
        this.superPower = superPower;
    }
}
