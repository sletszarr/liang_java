package chapter7;

/**
 * Created by Acer-756 on 7/4/2016.
 */

public class Ex7_13_RandomNumberChooser {

    public static void main(String[] args) {

        System.out.println("The random numbers between 1 and 54" +
                "\nthat excludes 1, 4, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50 and 53 is " +
                getRandom(1, 4, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 53));

    }

    public static int getRandom(int... numbers) {
        int randomNum;

        do {
            randomNum = (int) (1 + Math.random() * 54);
        } while (findNum(randomNum, numbers) == randomNum);

        return randomNum;
    }

    public static int findNum(int key, int[] numbers) {

        // linear search key in numbers
        for (int number : numbers) {
            if (number == key)
                return number;
        }

        return -1;
    }

}
