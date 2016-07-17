package chapter8;

import java.util.Scanner;

/**
 * Created by Acer-756 on 7/13/2016.
 */
public class Ex8_8_AllClosestPairs {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get numbers of points
        System.out.print("Enter the number of points: ");
        int numOfPoints = input.nextInt();

        // prepare array
        double[][] points = new double[numOfPoints][2];

        // get points' coordinate from user
        for (int i = 0; i < points.length; i++) {
            System.out.print("Enter point #" + i + "'s coordinate: ");
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }

        // get the shortest distance
        double shortestDistance = getShorestDistance(points);

        // dislay all closest pairs
        displayAllShortestPairs(points, shortestDistance);

    }

    public static double getDistance(double[] pointA, double[] pointB) {

        // get the first point's coordinate
        double x1 = pointA[0];
        double y1 = pointA[1];

        // get the second point's coordinate
        double x2 = pointB[0];
        double y2 = pointB[1];

        // get diff square
        double diffXSquare = (x2 - x1) * (x2 - x1);
        double diffYSquare = (y2 - y1) * (y2 - y1);

        return Math.sqrt(diffXSquare + diffYSquare);
    }

    public static double getShorestDistance(double[][] points) {

        double shortestDistance = getDistance(points[0], points[1]);
        for (int i = 0; i < points.length; i++) {
            for (int k = i + 1; k < points.length; k++) {
                double distance = getDistance(points[i], points[k]);
                if (distance < shortestDistance) {
                    shortestDistance = distance;
                }
            }
        }

        return shortestDistance;
    }

    public static void displayAllShortestPairs(
            double[][] points, double shortestDistance) {

        for (int i = 0; i < points.length; i++) {
            for (int k = i + 1; k < points.length; k++) {
                double distance = getDistance(points[i], points[k]);
                if (distance == shortestDistance) {
                    System.out.printf("The closest two points are " +
                                    "(%.1f, %.1f) and (%.1f, %.1f)\n",
                            points[i][0], points[i][1],
                            points[k][0], points[k][1]);
                }
            }

        }

    }
}
