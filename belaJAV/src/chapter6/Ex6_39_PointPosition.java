package chapter6;

import java.util.Scanner;

/**
 * Created by Acer-756 on 7/2/2016.
 */

public class Ex6_39_PointPosition {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter three points for p0, p1, and p2: ");
        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        System.out.printf("(%.1f, %.1f) is on the ", x2, y2);
        if (onTheLineSegment(x0, y0, x1, y1, x2, y2)) {
            System.out.printf("line segment ");
        }
        else if (onTheSameLine(x0, y0, x1, y1, x2, y2)) {
            System.out.printf("same line ");
        }
        else if (leftOfTheLine(x0, y0, x1, y1, x2, y2)) {
            System.out.printf("the left side of the line ");
        }
        else {
            System.out.printf("the right side of the line ");
        }
        System.out.printf("\nfrom (%.1f, %.1f) to (%.1f, %.1f)", x0, y0, x1, y1);

    }

    // return true if (x2,y2) is on the left side of the
    // line from (x0, y0) to (x1,y1)
    public static boolean leftOfTheLine(
            double x0, double y0,
            double x1, double y1,
            double x2, double y2) {

        return ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)) > 0;

    }

    // return true if (x2,y2) is on the right side of the
    // line from (x0, y0) to (x1,y1)
    public static boolean rightOfTheLine(
            double x0, double y0,
            double x1, double y1,
            double x2, double y2) {

        return ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)) < 0;

    }

    // return true if (x2,y2) is on the same
    // line from (x0, y0) to (x1,y1)
    public static boolean onTheSameLine(
            double x0, double y0,
            double x1, double y1,
            double x2, double y2) {

        return ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)) == 0;

    }

    // return true if (x2,y2) is on the
    // line segment from (x0, y0) to (x1,y1)
    public static boolean onTheLineSegment(
            double x0, double y0,
            double x1, double y1,
            double x2, double y2) {

        boolean onSegment = (x2 >= Math.min(x0, x1) && x2 <= Math.max(x0, x1));

        return onSegment && onTheSameLine(x0, y0, x1, y1, x2, y2);

    }
}
