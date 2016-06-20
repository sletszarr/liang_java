package chapter4;

import java.util.Scanner;

/**
 * Created by bnamora on 6/20/16.
 */

public class Ex4_7_CoordinateOfAPentagon {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // prompt user to enter the bounding circle's radius
        System.out.print("Enter the radius of the bounding circle: ");
        double circleRadius = input.nextDouble();

        // computing point of pentagon
        double x1 = circleRadius * Math.cos(Math.PI / 2 - 2 * Math.PI / 5);
        double y1 = circleRadius * Math.sin(Math.PI / 2 - 2 * Math.PI / 5);
        double x2 = circleRadius * Math.cos(Math.PI / 2);
        double y2 = circleRadius * Math.sin(Math.PI / 2);
        double x3 = circleRadius * Math.cos(Math.PI / 2 + 2 * Math.PI / 5);
        double y3 = circleRadius * Math.sin(Math.PI / 2 + 2 * Math.PI / 5);
        double x4 = circleRadius * Math.cos(Math.PI / 2 + 4 * Math.PI / 5);
        double y4 = circleRadius * Math.sin(Math.PI / 2 + 4 * Math.PI / 5);
        double x5 = circleRadius * Math.cos(Math.PI / 2 + 6 * Math.PI / 5);
        double y5 = circleRadius * Math.sin(Math.PI / 2 + 6 * Math.PI / 5);

        // display the result
        System.out.println("The coordinates of five points on the pentagon are");
        System.out.printf("(%8.4f, %8.4f)\n", x1, y1);
        System.out.printf("(%8.4f, %8.4f)\n", x2, y2);
        System.out.printf("(%8.4f, %8.4f)\n", x3, y3);
        System.out.printf("(%8.4f, %8.4f)\n", x4, y4);
        System.out.printf("(%8.4f, %8.4f)\n", x5, y5);

    }

}
