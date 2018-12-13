package course1024.week2.access;

/**
 * Created by Maciej Polansky on 2018-12-04.
 **/

public class Main {
    public static void main(String[] args) {

        Human human = new Human("human", 20);
        SuperHero superHero = new SuperHero("superhero", 24, "Flying");

        System.out.println("Human: " + human.name + ", age: " + human.age);
        System.out.println("Super Hero: " + superHero.name + ", age: " + superHero.age + ", super power: " + superHero.superPower);
        System.out.println();
        human.displayInfo();
        superHero.displayAboutMe();
        superHero.displayInfo();

    }
}
