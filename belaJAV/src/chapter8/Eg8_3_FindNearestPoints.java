package chapter8;

import java.util.Scanner;

/**
 * Created by Acer-756 on 7/10/2016.
 */

public class Eg8_3_FindNearestPoints {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get number of points
        System.out.print("Enter number of points: ");
        int numOfPoints = input.nextInt();

        // create points array
        double[][] points = new double[numOfPoints][2];

        // get points from user
        for (int i = 0; i < points.length; i++) {
            System.out.print("Enter point #" + i + "'s coordinate: ");
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }

        // get the nearest points
        double minDistance = getDistance(points[0], points[1]);
        int minPointSrc = 0;
        int minPointDest = 0;

        for (int i = 0; i < points.length; i++) {
            for (int k = i + 1; k < points.length; k++) {
                double distance = getDistance(points[i], points[k]);
                if (distance < minDistance) {
                    minDistance = distance;
                    minPointSrc = i;
                    minPointDest = k;
                }
            }
        }

        // display the closest points
        System.out.printf("The closest two points are " +
                        "(%.2f, %.2f) and (%.2f, %.2f)\n",
                points[minPointSrc][0], points[minPointSrc][1],
                points[minPointDest][0], points[minPointDest][1]);
        System.out.printf("with the distance of %.2f", minDistance);

    }


    public static double getDistance(double[] pointA, double[] pointB) {

        double xSquare = (pointA[0] - pointB[0]) * (pointA[0] - pointB[0]);
        double ySquare = (pointA[1] - pointB[1]) * (pointA[1] - pointB[1]);
        double distance = Math.sqrt(xSquare + ySquare);

        return distance;
    }

}

