package chapter3;

import java.util.Scanner;

/**
 * Created by bnamora on 6/16/16.
 */

public class Ex3_28_PositionOf2Rectangles {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter r1's center x and y coordinates, width and height: ");
        double aCenterX = input.nextDouble();
        double aCenterY = input.nextDouble();
        double aWidth = input.nextDouble();
        double aHeight = input.nextDouble();

        System.out.print("Enter r2's center x and y coordinates, width and height: ");
        double bCenterX = input.nextDouble();
        double bCenterY = input.nextDouble();
        double bWidth = input.nextDouble();
        double bHeight = input.nextDouble();

        double distanceXBetweenCenter = Math.abs(bCenterX - aCenterX);
        double distanceYBetweenCenter = Math.abs(bCenterY - aCenterY);

        boolean bXInsideA = (distanceXBetweenCenter + bWidth / 2) <= (aWidth / 2);
        boolean bYInsideA = (distanceYBetweenCenter + bHeight / 2) <= (aHeight / 2);
        boolean bInsideA = (bXInsideA && bYInsideA);

        boolean aXInsideB = (distanceXBetweenCenter + aWidth / 2) <= (bWidth / 2);
        boolean aYInsideB = (distanceYBetweenCenter + aHeight / 2) <= (bHeight / 2);
        boolean aInsideB = (aXInsideB && aYInsideB);

        boolean bXOverlapA = (distanceXBetweenCenter < (aWidth / 2 + bWidth / 2));
        boolean bYOverlapA = (distanceYBetweenCenter < (aHeight / 2 + bHeight / 2));
        boolean bOverlapA = (bXOverlapA || bYOverlapA);

        boolean bXOutsideA = (distanceXBetweenCenter > (aWidth / 2 + bWidth / 2));
        boolean bYOutsideA = (distanceYBetweenCenter > (aWidth / 2 + bWidth / 2));
        boolean bOutsideA = (bXOutsideA && bYOutsideA);

        if (bInsideA) {
            System.out.println("r2 is inside r1");
        }
        else if (aInsideB) {
            System.out.println("r1 is inside r2");
        }
        else if (bOverlapA) {
            System.out.println("r1 and r2 are overlapping each other");
        }
        else if (bOutsideA) {
            System.out.println("r1 and r2 are separated");
        }

    }

}
