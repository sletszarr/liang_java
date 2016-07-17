package chapter1;

/**
 * Created by bnamora on 6/8/16.
 *
 * (Average speed in kilometers)
 * Assume a runner runs 24 miles in 1 hour, 40 minutes, and 35 seconds.
 * Write a program that displays the average speed in kilometers per hour.
 * (Note that 1 mile is 1.6 kilometers.)
 *
 */

public class Ex1_12_AvgSpeedInKm {

    public static void main(String[] args) {

        double kms = 24 * 1.6;
        double hours = 1.0 + 40.0 / 60 + 35.0 / 3600;

        System.out.println("A runner runs " + kms + " kms in " + hours + " hours");
        System.out.println("His average speed is " + kms / hours + " km/hour");

    }
}
