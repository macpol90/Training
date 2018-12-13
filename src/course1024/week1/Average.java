package course1024.week1;

/**
 * Created by Maciej Polansky on 2018-11-30.
 **/

public class Average {
    public static void main(String[] args) {

        int[] values = {4, 7, 3, 2, 6,};
        float average = calculateAverage(values);
        System.out.println("Average: " + average);

    }

    public static float calculateAverage(int[] numbers) {
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
//            sum = sum + numbers[i];
            sum += numbers[i];
        }
        return sum / (float) numbers.length;
    }
}
