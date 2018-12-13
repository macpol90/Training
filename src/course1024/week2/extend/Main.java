package course1024.week2.extend;

/**
 * Created by Maciej Polansky on 2018-12-03.
 **/

public class Main {
    public static void main(String[] args) {

        Human human = new Human("Czlowiek",20);
        SuperHero superHero = new SuperHero("SpiderMan",22,"Shooting");
        Warewolf warewolf = new Warewolf("Wolverin",45,"Black");

        System.out.println("Human name: " +human.name);
        System.out.println("SuperHero name: " +superHero.name);
        System.out.println("Warewolf name: " +warewolf.name);


    }
}
