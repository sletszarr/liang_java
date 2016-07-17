package chapter5;

/**
 * Created by bnamora on 6/22/16.
 */

public class Ex5_4_MilesToKilometers {

    public static void main(String[] args) {

        final double MILE_TO_KILOMETER = 1.609;

        System.out.println("Miles\tKilometers");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%-2d   \t%.3f\n", i, i * MILE_TO_KILOMETER);
        }

    }
}
