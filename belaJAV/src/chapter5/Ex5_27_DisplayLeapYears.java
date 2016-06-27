package chapter5;

/**
 * Created by bnamora on 6/27/16.
 */

public class Ex5_27_DisplayLeapYears {

    public static void main(String[] args) {

        final int DIGITS_PER_LINE = 10;
        int leapYearCount = 0;

        for (int i = 101; i <= 2100; i++) {
            if ((i % 4 == 0 || i % 400 == 0) && i % 100 != 0) {
                System.out.printf("%4d ", i);
                leapYearCount++;

                if (leapYearCount % DIGITS_PER_LINE == 0) {
                    System.out.println();
                }
            }
        }

        System.out.printf("\nThere are %d leap years from 101-2100", leapYearCount);
    }
}
