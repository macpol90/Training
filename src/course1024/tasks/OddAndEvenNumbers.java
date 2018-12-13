package course1024.tasks;

/**
 * Created by Maciej Polansky on 2018-11-29.
 **/

public class OddAndEvenNumbers {
    public static void main(String[] args) {

        System.out.println("\n SORTOWACZ LICZB PARZYSTYCH: ON");
        System.out.println(" SORTOWACZ LICZB NIEPARZYSTYCH: ON\n");

        System.out.println("Mamy zbiór liczb: 12, 67, 58, 49, 44, 21, 23, 22, 47, 59, 40");
        System.out.println("\nZACZYNAM SORTOWANIE\n");

        int[] allNumbers = {12, 67, 58, 49, 44, 21, 23, 22, 47, 59, 40};
        int[] eveNumbers = new int[allNumbers.length];
        int[] oddNumbers = new int[allNumbers.length];

        int m = 0;
        int n = 0;


        for (int i = 0; i < allNumbers.length; i++) {

            if (allNumbers[i] % 2 == 0) {
                eveNumbers[m] = allNumbers[i];
                m++;
            } else if (allNumbers[i] % 2 != 0) {
                oddNumbers[n] = allNumbers[i];
                n++;
            }
        }

        System.out.println("Liczby parzyste to: ");
        for (int i = 0; i < eveNumbers.length; i++) {
            System.out.println(eveNumbers[i]);
        }

        System.out.println("\nLiczby nieparzyste to:");
        for (int i = 0; i < oddNumbers.length; i++){
            System.out.println(oddNumbers[i]);
        }


    }
}
