package course1024.week1.tasksWeek1;

import java.util.Scanner;

/**
 * Created by Maciej Polansky on 2018-11-30.
 **/

public class HelloYouName {
    public static void main(String[] args) {

        helloYou(name(),lastname());


    }

    public static void helloYou(String name, String lastname){
        System.out.println("Hello " +name+ " "+lastname);
    }

    public static String name(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = scanner.nextLine();
        return name;
    }

    public static String lastname(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your lastname?");
        String lastname = scanner.nextLine();
        return lastname;
    }




}
