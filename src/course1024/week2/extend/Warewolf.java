package course1024.week2.extend;

/**
 * Created by Maciej Polansky on 2018-12-03.
 **/

public class Warewolf extends Human {
    String furColor;

    public Warewolf(String name, int age, String furColor){
        super(name, age);
        this.furColor = furColor;
    }
}
