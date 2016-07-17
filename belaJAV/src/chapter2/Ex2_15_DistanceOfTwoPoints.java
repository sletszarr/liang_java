package chapter2;

import java.util.Scanner;

/**
 * Created by bnamora on 6/14/16.
 *
 * Geometry: distance of two points)
 * Write a program that prompts the user to enter two points (x1, y1) and (x2, y2)
 * and displays their distance between them.
 *
 * The formula for computing the distance is
 * [(x2 - x1)^2 + (y2 - y1)^2]^0.5
 *
 * Note that you can use Math.pow(a, 0.5) to compute a^0.5
 *
 */

public class Ex2_15_DistanceOfTwoPoints {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter x1 and y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.print("Enter x2 and y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double diffXSquare = Math.pow(x2 - x1, 2);
        double diffYSquare = Math.pow(y2 - y1, 2);
        double distanceOfTwoPoints = Math.pow(diffXSquare + diffYSquare, 0.5);

        System.out.println("The distance between the two points is " + distanceOfTwoPoints);

    }
}
