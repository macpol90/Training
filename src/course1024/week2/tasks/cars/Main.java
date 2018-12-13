package course1024.week2.tasks.cars;

/**
 * Created by Maciej Polansky on 2018-12-04.
 **/

public class Main {
    public static void main(String[] args) {

        Car elektryczny = new ElectricCar("Tesla","Czarny",88);
        Car spalinowy = new FuelCar("BMW","Czarny",28);

        System.out.println(((ElectricCar) elektryczny).getInfo());
        System.out.println();
        System.out.println(((FuelCar) spalinowy).getInfo());

        ElectricCar drugiEelektryczny = new ElectricCar("Opel","Biały", 59);
        FuelCar drugiSpalinowy = new FuelCar("Mercedes","Szary",45);

        System.out.println("\n"+drugiEelektryczny.getInfo());
        System.out.println("\n"+drugiSpalinowy.getInfo());


    }
}
