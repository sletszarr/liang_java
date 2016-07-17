package chapter5;

/**
 * Created by bnamora on 6/28/16.
 */

public class Ex5_35_Summation {

    public static void main(String[] args) {

        double sum = 0.0;

        for (int i = 1; i < 625; i++) {
            sum += 1 / (Math.sqrt(i) + Math.sqrt(i + 1));
        }

        System.out.printf("The summation is %.2f", sum);

    }

}
