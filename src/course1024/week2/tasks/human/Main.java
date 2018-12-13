package course1024.week2.tasks.human;

/**
 * Created by Maciej Polansky on 2018-12-02.
 **/

public class Main {
    public static void main(String[] args) {


        HumanService humanService = new HumanService();

        System.out.println("\nWyświetlam pełne dane z tablicy:");
        humanService.displayHumansName();


        System.out.println("\nIle jest osob wyzszych niz 173 cm");
        int higher = humanService.countHumanTallerThan(173);
        System.out.println("To: " + higher + " osób.");

        System.out.println("\nIle jest osób niższych niż 173 cm");
        int lower = humanService.countHumanLowerThan(173);
        System.out.println("To: " + lower + " osób.");

        System.out.println("\nWspólna waga wszystkich ludzi to : " + humanService.countWeight() + " [kg].");
        System.out.println("Wspólny wzrost wszystkich ludzi to : " + humanService.countHeight() + " [cm]");

        System.out.println("Na liście jest: " + humanService.getCountHumans() + " osób.");
        System.out.println("\nCzy na liście osób jest ktoś o imieniu: Gosia?\nJeśli tak podaj mi dane tej osoby: ");
        System.out.println("\t\t\t\t\nBAZA DANYCH: \n");
        humanService.getHumanByName("Gosia");

    }
}
