package chapter6;

/**
 * Created by bnamora on 6/30/16.
 */

public class Ex6_9_FeetToMeters {

    public static void main(String[] args) {

        // display header
        System.out.println("Feet\t\tMeters\t\t|\t\tMeters\t\tFeet");

        // display table body
        for (double feet = 1.0, meters = 20.0;
             feet <= 10.0;
             feet++, meters += 5.0) {

            System.out.printf("%4.1f\t\t%.3f\t\t|\t\t%.1f\t\t%.3f\n",
                    feet, footToMeter(feet),
                    meters, meterToFoot(meters));

        }

    }

    public static double footToMeter(double foot) {

        return 0.305 * foot;

    }

    public static double meterToFoot(double meter) {

        return 3.279 * meter;

    }
}
