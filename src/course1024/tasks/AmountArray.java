package course1024.tasks;

import java.util.Scanner;

/**
 * Created by Maciej Polansky on 2018-11-29.
 **/

public class AmountArray {
    public static void main(String[] args) {

        final int n;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile liczb chcesz dodać do siebie?");
        n = scanner.nextInt();
        System.out.println("Podaj więc: " + n + " liczb a obliczę ich sumę!");

        int[] array = new int[n];
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            sum = sum + array[i];
        }

        System.out.println("Suma podanych liczb to: " +sum);

    }
}
