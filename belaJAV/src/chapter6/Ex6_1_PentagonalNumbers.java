package chapter6;

/**
 * Created by bnamora on 6/30/16.
 */

public class Ex6_1_PentagonalNumbers {

    public static void main(String[] args) {

        final int NUMBERS_PER_LINE = 10;

        for (int i = 1; i <= 100; i++) {
            System.out.printf("%5d", getPentagonalNumber(i));
            System.out.print((i % NUMBERS_PER_LINE == 0) ? "\n" : " ");
        }

    }

    public static int getPentagonalNumber(int n) {

        return n * (3 * n - 1) / 2;

    }
}
