package chapter2;

import java.util.Scanner;

/**
 * Created by bnamora on 6/13/16.
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
