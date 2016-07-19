package chapter8;

import java.util.Scanner;

/**
 * Created by bnamora on 7/19/16.
 */

public class Ex8_31_IntersectingPoint {

    public static void main(String[] args) {

        // get points of 2 lines
        double[][] points = getPoints();

        // display intersecting point
        if (getIntersectingPoints(points) == null) {
            System.out.println("The two lines are parallel");
        } else {
            System.out.printf("The intersecting point is at (%.2f, %.2f)",
                    getIntersectingPoints(points)[0],
                    getIntersectingPoints(points)[1]);
        }

    }

    public static double[][] getPoints() {

        Scanner input = new Scanner(System.in);

        double[][] points = new double[4][2];

        for (int i = 0; i < points.length; i++) {
            System.out.printf("Enter point #%d's coordinate: ", i + 1);
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }

        return points;
    }

    public static double[] getIntersectingPoints(double[][] points) {
        double[] equation = getEquation(points);

        return solveEquation(equation);
    }

    public static double[] getEquation(double[][] points) {
        // redefine points
        double x1 = points[0][0];
        double y1 = points[0][1];
        double x2 = points[1][0];
        double y2 = points[1][1];
        double x3 = points[2][0];
        double y3 = points[2][1];
        double x4 = points[3][0];
        double y4 = points[3][1];

        // prepare equation holder
        double[] equation = new double[6];

        // get equation
        equation[0] = y1 - y2;
        equation[1] = -(x1 - x2);
        equation[2] = y3 - y4;
        equation[3] = -(x3 - x4);
        equation[4] = (y1 - y2) * x1 - (x1 - x2) * y1;
        equation[5] = (y3 - y4) * x3 - (x3 - x4) * y3;

        return equation;

    }

    public static double[] solveEquation(double[] equation) {
        // redefine equation
        double a = equation[0];
        double b = equation[1];
        double c = equation[2];
        double d = equation[3];
        double e = equation[4];
        double f = equation[5];

        // calculate determinant
        double determinant = a * d - b * c;

        // if equations has no roots
        if (determinant == 0) {
            return null;
        }

        // prepare roots' holder
        double[] roots = new double[2];

        // calculate root
        roots[0] = (e * d - b * f) / determinant;
        roots[1] = (a * f - e * c) / determinant;

        return roots;
    }
}
