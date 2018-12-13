package course1024.tasks;

import java.util.Scanner;

/**
 * Created by Maciej Polansky on 2018-11-29.
 **/

public class NameArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] arrayName = new String[3];

        System.out.println("Nasza lista ma " + arrayName.length + " miejsc ..");

        for (int counterNames = 0; counterNames < arrayName.length; counterNames++) {
            System.out.println("Podaj imię:");
            arrayName[counterNames] = scanner.nextLine();
        }

        System.out.println("\n\nNasza lista wygląda następująco:");
        for (int i = 0; i < arrayName.length; i++) {
            System.out.println(i+1+ " miejsce: " +arrayName[i]);
        }

    }
}
