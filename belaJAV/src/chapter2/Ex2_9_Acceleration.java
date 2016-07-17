package chapter2;

import java.util.Scanner;

/**
 * Created by bnamora on 6/13/16.
 *
 * (Physics: acceleration)
 * Average acceleration is defined as the change of velocity divided by the time taken to make the change,
 * as shown in the following formula:
 *
 *          v1 - v0
 *      a = -------
 *             t
 *
 * Write a program that prompts the user to enter the starting velocity v0 in meters/ second,
 * the ending velocity v1 in meters/second, and the time span t in seconds,
 * and displays the average acceleration.
 *
 */

public class Ex2_9_Acceleration {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter v0, v1, and t: ");
        double v0Val = input.nextDouble();
        double v1Val = input.nextDouble();
        double tVal = input.nextDouble();

        double accelaration = (v1Val - v0Val) / tVal;
        System.out.println("The average acceleration is " + accelaration);

    }
}
