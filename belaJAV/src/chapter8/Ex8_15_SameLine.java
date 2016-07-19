package chapter8;

import java.util.Scanner;

/**
 * Created by Acer-756 on 7/14/2016.
 */

public class Ex8_15_SameLine {

    public static void main(String[] args) {

        // get points
        double[][] points = getPoints();

        // check if all points on the same line
        boolean onTheSameLine = isAllOnTheSameLine(points);

        // display result
        System.out.println("The five points are " +
                ((onTheSameLine) ? "" : "not ") +
                "on the same line"
        );

    }

    public static double[][] getPoints() {

        double[][] points = new double[5][2];

        Scanner input = new Scanner(System.in);
        System.out.println("Enter five points: ");
        for (int i = 0; i < points.length; i++) {
            System.out.printf("Enter point #%d's coordinate: ", i + 1);
            points[i][0] = input.nextDouble();  // x coordinate
            points[i][1] = input.nextDouble();  // y coordinate
        }

        return points;

    }

    public static boolean isAllOnTheSameLine(double[][] points) {

        for (int i = 2; i < points.length; i++) {
            if (!isOnTheSameLine(points[0], points[1], points[i])) {
                return false;
            }
        }

        return true;

    }

    public static boolean isOnTheSameLine(
            double[] lineStart, double[] lineEnd, double[] point) {

        // get line start's coordinate
        double startX = lineStart[0];
        double startY = lineStart[1];

        // get line end's coordinate
        double endX = lineEnd[0];
        double endY = lineEnd[1];

        // get point's cordinate
        double pX = point[0];
        double pY = point[1];

        // calculate determinant
        double determinant =
                (pY - startY) * (endX - startX) -
                        (pX - startX) * (endY - startY);

        return determinant == 0;
    }

}
