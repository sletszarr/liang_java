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

        boolean bXInsideA = ((Math.abs(bCenterX - aCenterX) + bWidth / 2) <= (aWidth / 2));
        boolean bYInsideA = ((Math.abs(bCenterY - aCenterY) + bHeight / 2) <= (aHeight / 2));
        boolean bInsideA = (bXInsideA && bYInsideA);

        boolean aXInsideB = ((Math.abs(aCenterX - bCenterX) + aWidth / 2) <= (bWidth / 2));
        boolean aYInsideB = ((Math.abs(aCenterX - bCenterX) + aHeight / 2) <= (bHeight / 2));
        boolean aInsideB = (aXInsideB && aYInsideB);

        boolean bXOverlapA = (Math.abs(aCenterX - bCenterX) < (aWidth / 2 + bWidth / 2));
        boolean bYOverlapA = (Math.abs(aCenterY - bCenterY) < (aHeight / 2 + bHeight / 2));
        boolean bOverlapA = (bXOverlapA || bYOverlapA);

        boolean bXOutsideA = (Math.abs(aCenterX - bCenterX) > (aWidth / 2 + bWidth / 2));
        boolean bYOutsideA = (Math.abs(aCenterY - bCenterY) > (aWidth / 2 + bWidth / 2));
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
