package course1024.week3.userService;

/**
 * Created by Maciej Polansky on 2018-12-10.
 **/

public class UserService {

    String[] users;

    public UserService(String[] array) {
        this.users = array;
    }

    public boolean isUserExist(String login) {
        for (int i = 0; i < users.length; i++) {
            if (users.equals(login)) {
                return true;
            }
        }
        return false;
    }


    public int getUsersCount() {
        return users.length;
    }


    public int getCounterUserRepitBy(String login) {
        int counter = 0;
        for (int i = 0; i < users.length; i++) {
            if (users.equals(login)) {
                counter++;
            }
        }
        return counter;
    }


}
