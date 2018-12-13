package course1024.week1;

/**
 * Created by Maciej Polansky on 2018-11-30.
 **/

public class Functions {
    public static void main(String[] args) {

        int [] values = {5,0,6,12,44,101,42,12,16,120};

        sayHello("");
        sayHello("Kamil");
        sayHello("Maciej");

    }

    public static void sayHello(String name){

        if (name.length()==0){
            return;
        }
        System.out.println("Hello " +name);
    }


}
