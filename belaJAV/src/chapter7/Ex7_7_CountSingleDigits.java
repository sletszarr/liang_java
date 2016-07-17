package chapter7;

/**
 * Created by Acer-756 on 7/4/2016.
 */

public class Ex7_7_CountSingleDigits {

    public static void main(String[] args) {

        int[] numberCount = new int[10];
        int randomNum;

        for (int i = 0; i < 100; i++) {
            randomNum = (int)(Math.random() * 10);
            numberCount[randomNum]++;
            System.out.printf("%d ", randomNum);

            // print 10 nums per line
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }

        printNumberCount(numberCount);

    }

    public static void printNumberCount(int[] numberCount) {

        for (int i = 0; i < numberCount.length; i++) {
            System.out.println(i+" appears "+numberCount[i]+" times.");
        }
    }
}
