package course1024.week2.tasks.cars;

/**
 * Created by Maciej Polansky on 2018-12-04.
 **/

public class ElectricCar extends Car {
    int capacityBattery;

    public ElectricCar(String carBrand, String carColour, int capacityBattery) {
        super(carBrand, carColour);
        this.capacityBattery = capacityBattery;
    }

    public String getInfo() {
        return "Samochód elektryczny:" +
                "\nMarka: " + carBrand +
                "\nKolor: " + carColour +
                "\nPojemność baterii: " + capacityBattery;
    }


}
