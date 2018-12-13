package course1024.week2.access;

/**
 * Created by Maciej Polansky on 2018-12-04.
 **/

public class Human {
     String name;
     int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

     void displayInfo() {
        System.out.println("Imie: " + name + ", wiek: " + age);
    }

}
