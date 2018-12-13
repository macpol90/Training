package course1024.week3;

/**
 * Created by Maciej Polansky on 2018-12-09.
 **/

public class Car implements Vehicle{

    public Car(){
    }


    @Override
    public void drive() {
        System.out.println("Jadę samochodem, więc dodaje gazu i się nie przejmuje.");
    }

    @Override
    public void stop() {
        System.out.println("Naciskam środkowy pedał i hamuje samochód!");
    }

}
