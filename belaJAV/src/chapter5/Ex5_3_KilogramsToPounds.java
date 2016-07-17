package chapter5;

/**
 * Created by bnamora on 6/22/16.
 */

public class Ex5_3_KilogramsToPounds {

    public static void main(String[] args) {

        final double KILOGRAM_TO_POUND = 2.2;

        System.out.println("Kilograms      Pounds");
        for (int i = 1; i < 200; i++) {
            System.out.printf("%-3d             %5.1f\n", i, i * KILOGRAM_TO_POUND);

        }
    }
}
