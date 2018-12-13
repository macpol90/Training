package course1024.week1;

import java.util.Scanner;

/**
 * Created by Maciej Polansky on 2018-11-30.
 **/

public class isMaleOrFemale {
    public static void main(String[] args) {

        boolean isMale = isMale(yourName());

        System.out.println(theName()+" is a male?");
        System.out.println("Answer: " +isMale);

    }

    public static boolean isMale(String name) {
        int lastCharIndex = name.length() - 1;
        boolean isFemale = name.charAt(lastCharIndex) == 'a';

        if (isFemale) {
            return false;
        }
        return true;
    }

    public static String yourName(){
        System.out.println("Give me your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        return name;
    }

    public static String theName(){
        String name = yourName();
        return name;
    }

}
