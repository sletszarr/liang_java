package chapter9;

import mylib.LinearEquation;

import java.util.Scanner;

/**
 * Created by bnamora on 7/22/16.
 */

public class Ex9_12_IntersectinPoint {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get points from user
        double[][] points = new double[4][2];
        for (int i = 0; i < points.length; i++) {
            System.out.printf("Enter point #%d's coordinate: ", i);
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }

        // get coefficients for eqn
        double a = points[0][1] - points[1][1];
        double b = points[0][0] - points[1][0];
        double c = points[2][1] - points[3][1];
        double d = points[2][0] - points[3][0];
        double e = a * points[0][0] - b * points[0][1];
        double f = c * points[2][0] - d * points[2][1];

        // get linear eqn object
        LinearEquation eqn = new LinearEquation(a, -b, c, -d, e, f);

        // display solution
        if (eqn.isSolvable()) {
            System.out.printf("The intersecting point is at " +
                    "(%.2f, %.2f)", eqn.getX(), eqn.getY());
        } else {
            System.out.println("The two lines are parallel");
        }

    }
}
