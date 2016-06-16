package chapter3;

import java.util.Scanner;

/**
 * Created by bnamora on 6/16/16.
 */

public class Ex3_23_PointInARectangle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double rectCenterX = 0.0;
        double rectCenterY = 0.0;
        double rectWidth = 10;
        double rectHeight = 5;
        double xBoundary = rectWidth / 2;
        double yBoundary = rectHeight / 2;

        System.out.printf("Enter a point with two coordinates: ");
        double pointX = input.nextDouble();
        double pointY = input.nextDouble();

        boolean isInsideXBoundary = ((pointX - rectCenterX) < xBoundary);
        boolean isInsideYBoundary = ((pointY - rectCenterY) < yBoundary);
        boolean isInsideRect = (isInsideXBoundary && isInsideYBoundary);

        if (isInsideRect) {
            System.out.println("Point (" + pointX + ", " + pointY + ") is in the rectangle");
        }
        else {
            System.out.println("Point (" + pointX + ", " + pointY + ") is not in the rectangle");
        }

    }
}
