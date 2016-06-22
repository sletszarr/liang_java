package chapter5;

/**
 * Created by bnamora on 6/22/16.
 */

public class Ex5_5_KilogramsToPoundViceVersa {

    public static void main(String[] args) {

        final double KILOGRAM_TO_POUND = 2.2;

        System.out.println("Kilograms   Pounds\t|\tPounds       Kilograms");
        for (int i = 1, j = 20; i < 200; i += 2, j += 5) {
            System.out.printf("%-3d\t\t\t %5.1f\t|\t%-3d\t\t\t\t%6.2f\n",
                    i, i * KILOGRAM_TO_POUND,
                    j, j / KILOGRAM_TO_POUND);
        }

    }

}
