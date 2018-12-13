package course1024.week2.tasks.cars;

/**
 * Created by Maciej Polansky on 2018-12-04.
 **/

public class FuelCar extends Car {
    int fuelAmount;

    public FuelCar(String carBrand, String carColour, int fuelAmount) {
        super(carBrand, carColour);
        this.fuelAmount = fuelAmount;
    }

    public String getInfo() {
        return "Samochód spalinowy:" +
                "\nMarka: " + carBrand +
                "\nKolor: " + carColour +
                "\nIlość paliwa: " + fuelAmount;
    }


}
