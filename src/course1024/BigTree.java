package course1024;

import java.util.Scanner;

/**
 * Created by Maciej Polansky on 2018-11-26.
 **/

public class BigTree {
    public static void main(String[] args) {

        System.out.println("Enter the big floor of tree:");
        Scanner scanner = new Scanner(System.in);

        final int BIG_FLOOR = scanner.nextInt();
        int lastFloor = BIG_FLOOR;


        while (lastFloor >= 0) {

            for (int height = 1; height <= 5 + (BIG_FLOOR - 1) * 2; height++) {
                System.out.print(height);


                int startStar = 1;
                for (int counterSpaces = 0; counterSpaces <= lastFloor + height; counterSpaces++) {
                    System.out.print("*");
                }


                lastFloor--;
                System.out.println();
            }
        }
    }
}
