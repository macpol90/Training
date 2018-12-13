package course1024;

import java.util.Scanner;

/**
 * Created by $USER on $DATE.
 **/

public class starTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of floors:");
        int numberFloors = scanner.nextInt();


        for (int floor = 1; floor <= numberFloors; floor++) {
            System.out.print(" ");

            for (int counterSpace = 0; counterSpace < numberFloors-floor; counterSpace++) {
                System.out.print(" ");
            }

            for (int counterStars = 1; counterStars <= floor ; counterStars++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
