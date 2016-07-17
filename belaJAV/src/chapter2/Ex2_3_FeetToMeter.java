package chapter2;

import java.util.Scanner;

/**
 * Created by bnamora on 6/13/16.
 *
 * (Convert feet into meters)
 * Write a program that reads a number in feet, converts it to meters, and displays the result.
 * One foot is 0.305 meter.
 *
 */

public class Ex2_3_FeetToMeter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value for feet: ");
        double feetVal = input.nextDouble();

        double meterVal = feetVal * 0.305;
        System.out.println(feetVal + " feet is " + meterVal + " meters");

    }
}
