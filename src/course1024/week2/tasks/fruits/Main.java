package course1024.week2.tasks.fruits;

/**
 * Created by Maciej Polansky on 2018-12-04.
 **/

public class Main {
    public static void main(String[] args) {

        Fruit apple = new Apple();
        Fruit pinneapple = new Pinneapple();
        Fruit strawberry = new Strawberry();

        Fruit[] fruits = {apple, pinneapple, strawberry};

        for (Fruit fruit : fruits){
            System.out.println(fruit.getName());
         }

    }
}
