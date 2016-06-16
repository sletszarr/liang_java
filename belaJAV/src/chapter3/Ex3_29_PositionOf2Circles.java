package chapter3;

import java.util.Scanner;

/**
 * Created by bnamora on 6/16/16.
 */

public class Ex3_29_PositionOf2Circles {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter circle1's center x and y coordinates, and radius: ");
        double aCenterX = input.nextDouble();
        double aCenterY = input.nextDouble();
        double aRadius = input.nextDouble();

        System.out.print("Enter circle2's center x and y coordinates, and radius: ");
        double bCenterX = input.nextDouble();
        double bCenterY = input.nextDouble();
        double bRadius = input.nextDouble();

        double centerDistance = Math.pow(Math.pow(bCenterX - aCenterX, 2) + Math.pow(bCenterY - aCenterY, 2), 0.5);
        double radiusDifference = Math.abs(aRadius - bRadius);
        double radiusSum = aRadius + bRadius;

        boolean isInside = (centerDistance <= radiusDifference);
        boolean aInsideB = (isInside && (aRadius < bRadius));
        boolean bInsideA = (isInside && (aRadius > bRadius));

        boolean isOverlapping = centerDistance <= radiusSum;
        boolean isOutside = centerDistance > radiusSum;

        if (isInside) {
            if (aInsideB) {
                System.out.println("Circle1 is inside Circle2");

            }
            else if (bInsideA) {
                System.out.println("Circle2 is inside Circle1");

            }
        }
        else if (isOverlapping) {
            System.out.println("Circle1 and Circle2 are overlapping with each other");
        }
        else if (isOutside) {
            System.out.println("Circle1 and Circle2 are separated");
        }

    }

}
