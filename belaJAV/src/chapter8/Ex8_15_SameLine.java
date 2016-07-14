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

        // get line
        int lineStartIndex = getLineIndexIn(points)[0];
        int lineEndIndex = getLineIndexIn(points)[1];

        // prepare flag
        boolean allOnTheSameLine = true;

        for (int i = 0; i < points.length; i++) {
            // if i is line start/end
            if (i == lineStartIndex || i == lineEndIndex)
                continue;

            if (!isOnTheSameLine(
                    points[lineStartIndex], points[lineEndIndex], points[i]))
                allOnTheSameLine = false;
        }

        return allOnTheSameLine;

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
        double determinant = (endX - startX) * (pY - startY) -
                (pX - startX) * (endY - startY);

        return determinant == 0;
    }

    public static int[] getLineIndexIn(double[][] points) {

        // initial line start's x coordinate
        double startX = points[0][0];
        int lineStart = 0;

        // initial line end's x coordinate
        double endX = points[0][0];
        int lineEnd = 0;

        // get the line's start point
        for (int i = 0; i < points.length; i++) {
            if (points[i][0] < startX) {
                startX = points[i][0];
                lineStart = i;
            }
        }

        // get the line's end point
        for (int i = 0; i < points.length; i++) {
            if (points[i][0] > endX) {
                endX = points[i][0];
                lineEnd = i;
            }
        }

        return new int[]{lineStart, lineEnd};
    }

}
