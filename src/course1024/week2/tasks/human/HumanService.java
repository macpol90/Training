package course1024.week2.tasks.human;

/**
 * Created by Maciej Polansky on 2018-12-02.
 **/

public class HumanService {

    Human[] humans = {
            new Human("Maciej", 185, 85),
            new Human("Gosia ", 170, 50),
            new Human("Ania  ", 171, 54),
            new Human("Ania  ", 275, 54),
            new Human("Monika", 172, 52),
            new Human("Michał", 186, 78),
            new Human("Michał", 186, 78),
            new Human("Gosia ", 186, 78),
    };


    public HumanService() {
    }

    public void displayHumansName() {
        for (int i = 0; i < humans.length; i++) {
            System.out.println("Imię: " + humans[i].name + "\t\tWzrost: "
                    + humans[i].height + "\t\tWaga: " + humans[i].weight);
        }
    }

    public int countHumanTallerThan(int radix) {
        int counter = 0;

        for (int i = 0; i < humans.length; i++) {
            if (humans[i].height > radix) {
                counter++;
            }
        }
        return counter;
    }

    public int countHumanLowerThan(int radix) {
        int counter = 0;

        for (int i = 0; i < humans.length; i++) {
            if (humans[i].height < radix) {
                counter++;
            }
        }
        return counter;
    }

    public double countWeight() {
        int weight = 0;
        for (int i = 0; i < humans.length; i++) {

            weight += humans[i].weight;
        }
        return weight;
    }

    public int countHeight() {
        int height = 0;
        for (Human human : humans) {
            height += human.height;
        }
        return height;
    }

    public int getCountHumans() {
        return humans.length;
    }

    public void getHumanByName(String name) {
        for (Human human : humans) {

            if (human.name.equals(name)) {
                System.out.println("Imię: " + human.name + "\t\tWzrost: "
                        + human.height + "\t\tWaga: " + human.weight);

            } //else {  todo
//                System.out.println("  - BRAK   DANYCH  -");
//            }
        }
    }


}
