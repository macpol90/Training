package course1024.week2;

/**
 * Created by Maciej Polansky on 2018-11-30.
 **/

public class User {

    String login;
    String password;
    String email;
    int age;

        public User(){
            login = "login";
            password = "pass";
            email = "mail@gmail.com";
            age = 0;
        }

    public User(String login, String password, String email, int age) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.age = age;
    }
}
