package chapter3;

import java.util.Scanner;

/**
 * Created by bnamora on 6/16/16.
 */

public class Ex3_22_PointInACircle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double centerXCircle = 0.0;
        double centerYCircle = 0.0;
        double circleRadius = 10.0;

        System.out.printf("Enter a point with two coordinates: ");
        double pointX = input.nextDouble();
        double pointY = input.nextDouble();

        double distanceFromCenter = Math.pow(Math.pow(pointX - centerXCircle, 2.0)
                                            + Math.pow(pointY - centerYCircle, 2.0), 0.5);

        boolean isInsideCircle = (distanceFromCenter < circleRadius);

        if (isInsideCircle) {
            System.out.println("Point (" + pointX + ", " + pointY + ") is in the circle");
        }
        else {
            System.out.println("Point ("+pointX+", "+pointY+") is not in the circle");
        }

    }

}
