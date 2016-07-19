package chapter8;

import java.util.Scanner;

/**
 * Created by bnamora on 7/19/16.
 */

public class Ex8_34_RightmostLowestPoint {

    public static void main(String[] args) {

        // get points from user
        double[][] points = getPoints();

        // display the rightmost lowest point
        System.out.printf("The righmost lowest point" +
                        "is (%.1f, %.1f)",
                getRightMostLowestPoint(points)[0],
                getRightMostLowestPoint(points)[1]);

    }

    public static double[][] getPoints() {

        Scanner input = new Scanner(System.in);

        double[][] points = new double[6][2];

        for (int i = 0; i < points.length; i++) {
            System.out.printf("Enter point #%d's coordinate: ", i + 1);
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }

        return points;
    }

    public static double[] getRightMostLowestPoint(double[][] points) {

        int rightMostLowest = 0;

        for (int i = 1; i < points.length; i++) {
            // if y is lower
            if (points[i][1] < points[rightMostLowest][1]) {
                rightMostLowest = i;
            }
            // if y is equal
            else if (points[i][1] == points[rightMostLowest][1]) {
                // get the bigger x
                if (points[i][0] > points[rightMostLowest][0]) {
                    rightMostLowest = i;
                }
            }
        }

        return points[rightMostLowest];
    }

}
