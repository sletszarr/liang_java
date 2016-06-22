package chapter5;

/**
 * Created by bnamora on 6/22/16.
 */

public class Ex5_6_MilesToKilometersViceVersa {

    public static void main(String[] args) {

        final double MILES_TO_KILOMETERS = 1.609;

        System.out.println("Miles\tKilometers\t|\tKilometers\tMiles");
        for (int i = 1, j = 20; i <= 10; i++, j += 5) {
            System.out.printf("%-2d\t\t%-6.3f\t\t|\t%2d\t\t\t%6.3f\n",
                    i, i * MILES_TO_KILOMETERS,
                    j, j / MILES_TO_KILOMETERS);
        }
    }
}
