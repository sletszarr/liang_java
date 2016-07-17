package chapter5;

/**
 * Created by bnamora on 6/22/16.
 */

public class Ex5_10_DivisibleBy5And6 {

    public static void main(String[] args) {

        final int NUMBERS_PER_LINE = 10;
        int numberCount = 0;

        for (int i = 100; i < 1000; i++) {

            if (i % 5 == 0 && i % 6 == 0) {
                System.out.printf("%3d ", i);
                numberCount++;

                if (numberCount % NUMBERS_PER_LINE == 0) {
                    System.out.println();
                }
            }
        }

    }
}
