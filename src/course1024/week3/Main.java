package course1024.week3;

/**
 * Created by Maciej Polansky on 2018-12-09.
 **/

public class Main {
    public static void main(String[] args) {

        Bike bike = new Bike();
        bike.drive();
        bike.stop();

        System.out.println();

        Car car = new Car();
        car.drive();
        car.stop();

    }
}
