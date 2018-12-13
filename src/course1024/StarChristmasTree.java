package course1024;

import java.util.Scanner;

/**
 * Created by Maciej Polansky on 2018-11-26.
 **/

public class StarChristmasTree {
    public static void main(String[] args) {


        System.out.println("Enter the floors of your Christmas tree:");
        Scanner scaner = new Scanner(System.in);
//        int SIZE_OF_TREE = scaner.nextInt();
        final int SIZE_OF_TREE = 3;
        int firstSize = SIZE_OF_TREE;

        //  FIRST FLOOR

        while (firstSize >= 1) {


            for (int counterFloor = 0; counterFloor <= firstSize; counterFloor++) {
                System.out.print(" ");

                for (int counterSpaces = 1; counterSpaces <= (firstSize * 2) - counterFloor; counterSpaces++) {
                    System.out.print(" ");
                }

                for (int counterStars = 1; counterStars <= counterFloor * 2 - 1; counterStars++) {
                    System.out.print("*");
                }
                System.out.println();
            }


            firstSize--;
        }


    }
}
