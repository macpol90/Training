package course1024.week2;

/**
 * Created by Maciej Polansky on 2018-11-30.
 **/

public class Main {
    public static void main(String[] args) {

        UserService userService = new UserService();

        User user = userService.getUserByLogin("pablo");
        User kamil = userService.getUserByLogin("kamil");


        System.out.println("Znaleziono usera: " +user.login);

        if (kamil != null) {
            System.out.println("Znaleziono usera: " + kamil.login + " " + kamil.email);
        } else {
            System.out.println("Nie znaleziono usera.");
        }


        int sumAge = userService.sumUserAge();
        System.out.println("Suma wieku wszystkich uźytkowników to: " + sumAge);


    }
}
