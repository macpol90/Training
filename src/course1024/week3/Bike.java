package course1024.week3;

/**
 * Created by Maciej Polansky on 2018-12-09.
 **/

public class Bike implements Vehicle {

    public Bike(){
    }


    @Override
    public void drive() {
        System.out.println("Jade rowerem, więc muszę pedałować.");
    }

    @Override
    public void stop() {
        System.out.println("Hamuje rowerem, muszę używać hamulca tylniego.");
    }

}
