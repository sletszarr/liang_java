package chapter8;

import javax.print.DocFlavor;
import java.util.Scanner;

/**
 * Created by bnamora on 7/19/16.
 */

public class Ex8_32_AreaOfATriangle {

    public static void main(String[] args) {

        double[][] points = getPoints();

        double area = getTriangleArea(points);

        if (area == 0) {
            System.out.println("The three points are on the same line");
        } else {
            System.out.printf("The area of the triangle is %.2f", area);
        }

    }

    public static double[][] getPoints() {

        Scanner input = new Scanner(System.in);

        double[][] points = new double[3][2];

        for (int i = 0; i < points.length; i++) {
            System.out.printf("Enter point #%d's coordinate: ", i + 1);
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }

        return points;
    }

    public static double getTriangleArea(double[][] points) {

        if (isOnTheSameLine(points)) {
            return 0;
        }

        // get sides
        double side1 = getDistance(points[0], points[1]);
        double side2 = getDistance(points[0], points[2]);
        double side3 = getDistance(points[1], points[2]);

        // calculate s
        double s = (side1 + side2 + side3) / 2;

        // return area
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

    }

    public static double getDistance(double[] start, double[] end) {
        // redefine points
        double x1 = start[0];
        double y1 = start[1];
        double x2 = end[0];
        double y2 = end[1];

        // return distance
        return  Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

    }

    public static boolean isOnTheSameLine(double[][] points) {

        // redefine points
        double startX = points[0][0];
        double startY = points[0][1];
        double endX = points[1][0];
        double endY = points[1][1];
        double pX = points[2][0];
        double pY = points[2][1];

        // calculate determinant
        double determinant =
                (pY - startY) * (endX - startX) -
                        (pX - startX) * (endY - startY);

        return determinant == 0;

    }

}
