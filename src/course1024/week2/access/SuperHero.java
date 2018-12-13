package course1024.week2.access;

/**
 * Created by Maciej Polansky on 2018-12-04.
 **/

public class SuperHero extends  Human {
     String superPower;

    public SuperHero(String name, int age, String superPower){
        super(name, age);
        this.superPower = superPower;
    }

     void displayAboutMe(){
        displayInfo();
        System.out.println("A super moc to: "+superPower);
    }

}
