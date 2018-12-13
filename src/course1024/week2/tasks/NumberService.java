package course1024.week2.tasks;

/**
 * Created by Maciej Polansky on 2018-12-01.
 **/

public class NumberService {

    int[] numbers = {10, 2, 85, 23, 491, 3, 23, 412, 42, 41, 22, 25};


    public NumberService() {
    }


    public int getCountNumber() {
        return numbers.length;
    }

    public int countNumbersHigherThan(int number) {
        int higher = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (number < numbers[i]) {
                higher++;
            }
        }
        return higher;
    }

    public int countNumberLowerThan(int number) {
        int lower = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (number > numbers[i]) {
                lower++;
            }
        }
        return lower;
    }


    public int sumNumber() {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        return sum;
    }

    public void displayNumbers() {
        for (int number : numbers) {
            System.out.print(number + "\t");
        }
    }

    public void sortNumber() {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {

                boolean sameNumbers = i == j;
                if (sameNumbers) continue;

                boolean numberIsHigher = numbers[i] > numbers[j];
                if (numberIsHigher) {
                    int tempNumber = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = tempNumber;
                }
            }
        }
    }


//    public void changePlace() {
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = 0; j < numbers.length - 1; j++) {
//
//                int temp = numbers[i];
//                numbers[j] =
//
//            }
//        }
//    }


}
