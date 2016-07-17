package chapter3;

import java.util.Scanner;

/**
 * Created by bnamora on 6/16/16.
 */

public class Ex3_34_OnLineSegmentOrNot {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter three points for p0, p1, and p2: ");
        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double determinant = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
        boolean onLine = (determinant == 0);
        boolean onSegment = (x2 <= x0 ^ x2 <= x1 || x2 >= x0 ^ x2 >= x1);

        if (onLine && onSegment) {
            System.out.println("(" + x2 + ", " + y2 + ") is on the line segment from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
        }
        else {
            System.out.println("(" + x2 + ", " + y2 + ") is not on the line segment from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
        }

    }

}
