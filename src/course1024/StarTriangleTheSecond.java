package course1024;

import java.util.Scanner;

/**
 * Created by Maciej Polansky on 2018-11-26.
 **/

public class StarTriangleTheSecond {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of floors:");
        int floorNumber = scanner.nextInt();


        for (int counterFloors = 1; counterFloors <= floorNumber; counterFloors++) {
            System.out.print(" ");

            for (int counterSpace = 0; counterSpace < floorNumber - counterFloors; counterSpace++) {
                System.out.print(" ");
            }

            for (int counterStars = 1; counterStars <= (counterFloors * 2) - 1; counterStars++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
