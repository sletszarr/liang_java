package chapter3;

import java.util.Scanner;

/**
 * Created by bnamora on 6/16/16.
 */

public class Ex3_25_IntersectingPoint {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();

        double a = y1 - y2;
        double b = -(x1 - x2);
        double c = y3 - y4;
        double d = -(x3 - x4);
        double e = a * x1 + b * y1;
        double f = c * x3 + d * y3;

        System.out.println("\nThe equation to solve");
        System.out.println(a + "x + " + b + "y = " + e);
        System.out.println(c + "x + " + d + "y = " + f);

        double x = (e * d - b * f) / (a * d - b * c);
        double y = (a * f - e * c) / (a * d - b * c);

        if (Double.isInfinite(x) || Double.isInfinite(y)) {
            System.out.println("\nThe two lines are parallel");
        }
        else {
            System.out.println("\nThe intersecting point is at (" + x + ", " + y + ")");
        }

    }

}
