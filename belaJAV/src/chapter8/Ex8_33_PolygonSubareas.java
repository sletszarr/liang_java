package chapter8;

import java.util.Scanner;

/**
 * Created by bnamora on 7/19/16.
 */

public class Ex8_33_PolygonSubareas {

    public static void main(String[] args) {

        // get points from user
        double[][] points = getPoints();

        // get areas
        double[] areas = getAreas(points);

        // display in increasing order
        displayAreas(sortedAreas(areas));

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

    public static double[] getAreas(double[][] points) {

        // get center point
        double[] centerPoint =
                getIntersectingPoint(points[0], points[2],
                        points[1], points[3]);

        // prepare areas' holder
        double[] areas = new double[points.length];

        // get areas
        for (int i = 0; i < areas.length; i++) {
            areas[i] =
                    getTriangleArea(points[i], points[(i + 1) % 4],
                            centerPoint);
        }

        return areas;
    }

    public static double[] getIntersectingPoint(double[]... points) {

        double[] equation = getEquation(points);

        return solveEquation(equation);

    }

    public static double[] getEquation(double[][] points) {

        // get the first line's coordinate
        double startX1 = points[0][0];
        double startY1 = points[0][1];
        double endX1 = points[1][0];
        double endY1 = points[1][1];

        // get the second line's coordinate
        double startX2 = points[2][0];
        double startY2 = points[2][1];
        double endX2 = points[3][0];
        double endY2 = points[3][1];

        // prepare equation holder
        double[] equation = new double[6];

        // get equation
        equation[0] = startY1 - endY1;
        equation[1] = -(startX1 - endX1);
        equation[2] = startY2 - endY2;
        equation[3] = -(startX2 - endX2);
        equation[4] = (startY1 - endY1) * startX1 - (startX1 - endX1) * startY1;
        equation[5] = (startY2 - endY2) * startX2 - (startX2 - endX2) * startY2;

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

    public static double getTriangleArea(double[]...points) {

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

    public static double[] sortedAreas(double[] areas) {

        double[] copyOfArea = new double[areas.length];

        // make a copy of area
        for (int i = 0; i < areas.length; i++) {
            copyOfArea[i] = areas[i];
        }

        // sort copyOfArea
        for (int i = 0; i < copyOfArea.length; i++) {
            int minIndex = i;

            for (int k = i + 1; k < copyOfArea.length; k++) {
                if (copyOfArea[k] < copyOfArea[minIndex]) {
                    minIndex = k;
                }
            }

            if (minIndex != i) {
                double temp = copyOfArea[i];
                copyOfArea[i] = copyOfArea[minIndex];
                copyOfArea[minIndex] = temp;
            }
        }

        return copyOfArea;

    }

    public static void displayAreas(double[] areas) {
        System.out.print("The areas are ");
        for (double area : areas) {
            System.out.printf("%.2f ", area);
        }
    }

}
