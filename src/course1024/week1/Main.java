package course1024.week1;

import java.util.Scanner;

/**
 * Created by &(USER) on &(DATE).
 **/

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Napisz jakieś słowo:");
        String inputText = scanner.nextLine();
        System.out.println("Napisane słowo to: " +inputText);


        System.out.println("Napisz jakieś zdanie:");
        String inputSentence = scanner.nextLine();
        System.out.println("Napisane zdanie to: " +inputSentence);


    }
}