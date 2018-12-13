package course1024.week2.tasks;

import java.util.Scanner;

/**
 * Created by Maciej Polansky on 2018-12-01.
 **/

public class Main {
    public static void main(String[] args) {

        NumberService numberService = new NumberService();

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj liczbę:");
//        int number = scanner.nextInt();

        System.out.println("\nWyświetlam całą tablicę: ");
        numberService.displayNumbers();

        System.out.println("\n\n\t\tSORTUJĘ");
        numberService.sortNumber();
        System.out.println("\nWyświetlam całą tablicę: ");
        numberService.displayNumbers();


        int count = numberService.getCountNumber();
        System.out.println("\n\nW tej tablicy jest: " + count + " liczb.");

        int number = 50;
        int higherThan = numberService.countNumbersHigherThan(number);
        System.out.println("W tej tablicy jest: " + higherThan + " liczb większych od: " + number);
        int lowerThan = numberService.countNumberLowerThan(number);
        System.out.println("W tej tablicy jest: " + lowerThan + " liczb mniejszych od: " + number);

        int sum = numberService.sumNumber();
        System.out.println("Suma liczb tej tablicy to: " +sum);


    }
}

