package course1024.week2.tasks.users;

/**
 * Created by Maciej Polansky on 2018-12-05.
 **/

public class User {
    private Long id;
    private  String name;
    private String password;
    private String email;

    public User(Long id, String name, String password, String email){
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
    }

    public Long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getPassword(){
        return password;
    }

    public String getEmail(){
        return email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPassword(String password){
        this.password = password;
    }


    public void setEmail(String email){
        this.email = email;
    }



}
