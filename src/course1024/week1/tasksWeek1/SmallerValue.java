package course1024.week1.tasksWeek1;

import java.util.Scanner;

/**
 * Created by Maciej Polansky on 2018-11-30.
 **/

public class SmallerValue {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wartocśi do tablicy: ");
        int[] values = new int[3];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        showValues(values);

        int smaller = iSmaller(values);
        System.out.println("\nThe smaller value is: " + smaller);

        int bigger = isBigger(values);
        System.out.println("The bigger value is: " +bigger);

    }

    public static int iSmaller(int[] values) {
        int iSmaller = values[1];

        for (int i = 0; i < values.length; i++) {
            if (iSmaller > values[i]) {
                iSmaller = values[i];
            }
        }
        return iSmaller;
    }
    public static int isBigger(int[] values) {
        int isBigger = values[1];

        for (int i = 0; i < values.length; i++) {
            if (isBigger < values[i]) {
                isBigger = values[i];
            }
        }
        return isBigger;
    }

    public static void showValues(int[] values) {
        System.out.println("\nWartości dla podanej tablicy to: ");
        for (int i = 0; i < values.length; i++)
            System.out.print("" + values[i] + " ");
    }


}
