package chapter2;

import java.util.Scanner;

/**
 * Created by bnamora on 6/13/16.
 *
 * (Physics: finding runway length)
 * Given an airplane’s acceleration a and take-off speed v,
 * you can compute the minimum runway length needed for an airplane to take off using the following formula:
 *
 *               v^2
 *      length = ---
 *                2a
 *
 * Write a program that prompts the user to enter v in meters/second (m/s)
 * and the acceleration a in meters/second squared (m/s2),
 * and displays the minimum run- way length.
 *
 */

public class Ex2_12_RunwayLength {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter speed and acceleration: ");
        double speed = input.nextDouble();
        double acceleration = input.nextDouble();

        double minimumRunwayLength = Math.pow(speed, 2.0) / (2 * acceleration);

        System.out.println("The minimum runway length for this airplane is " + minimumRunwayLength);

    }
}
