package course1024.week2.tasks.dogs;

/**
 * Created by Maciej Polansky on 2018-12-05.
 **/

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("Azor","Husky");

        System.out.println(dog.toString());
        dog.setName("Pjetr");
        System.out.println(dog.toString());

    }
}
