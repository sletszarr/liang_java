package chapter8;

import java.util.Scanner;

/**
 * Created by Acer-756 on 7/13/2016.
 */

public class Ex8_7_PointsNearestToEachOther {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // initialize 3D points
        double[][] points = {{-1, 0, 3}, {-1, -1, -1}, {4, 1, 1},
                {2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3}, {-1.5, 4, 2},
                {5.5, 4, -0.5}};

        // get initial minimum distance
        double minDistance = getDistance(points[0], points[1]);

        // initialize minimum points' index
        int minSrc = 0;
        int minDest = 0;

        // find the smallest distance
        for (int i = 0; i < points.length; i++) {
            for (int k = i + 1; k < points.length; k++) {
                double distance = getDistance(points[i], points[k]);
                if (distance < minDistance) {
                    minDistance = distance;
                    minSrc = i;
                    minDest = k;
                }
            }
        }

        // display the closest points
        System.out.printf("The closest two points are " +
                "(%.2f, %.2f, %.2f) and (%.2f, %.2f, %.2f)\n",
                points[minSrc][0], points[minSrc][1], points[minSrc][2],
                points[minDest][0], points[minDest][1], points[minDest][2]);
        System.out.printf("with the distance of %.2f", minDistance);

    }

    public static double getDistance(double[] pointA, double[] pointB) {

        // get first point's coordinate
        double x1 = pointA[0];
        double y1 = pointA[1];
        double z1 = pointA[2];

        // get second point's coordinate
        double x2 = pointB[0];
        double y2 = pointB[1];
        double z2 = pointB[2];

        // calculate diff square
        double diffXSquare = (x2 - x1) * (x2 - x1);
        double diffYSquare = (y2 - y1) * (y2 - y1);
        double diffZSquare = (z2 - z1) * (z2 - z1);

        return Math.sqrt(diffXSquare + diffYSquare + diffZSquare);

    }
}
