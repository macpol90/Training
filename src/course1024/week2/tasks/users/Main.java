package course1024.week2.tasks.users;

/**
 * Created by Maciej Polansky on 2018-12-05.
 **/

public class Main {
    public static void main(String[] args) {

        User user = new User(11L, "Maciej", "admin", "admin@mail.com");
        System.out.println("User id: " + user.getId() + " , user login: " + user.getName() +
                ", user email: " + user.getEmail() + ", user password: " + user.getPassword());


        user.setName("Admin");
        user.setEmail("newmail@mail.com");
        user.setPassword("top secret password");

        System.out.println("User id: " + user.getId() + " , user login: " + user.getName() +
                ", user email: " + user.getEmail() + ", user password: " + user.getPassword());

    }

}
