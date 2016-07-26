package chapter10;

import mylib.MyPoint;
import mylib.Triangle2D;

/**
 * Created by bnamora on 7/27/16.
 */

public class Ex10_12_TestTriangle2D {

    public static void main(String[] args) {

        Triangle2D t1 = new Triangle2D(
                new MyPoint(2.5, 2),
                new MyPoint(4.2, 3),
                new MyPoint(5, 3.5));

        // display area and perimeter
        System.out.println("Area: " + t1.getArea());
        System.out.println("Perimeter: " + t1.getPerimeter());

        // display contains(x,y)
        System.out.printf("(%.1f, %.1f) is ", 4.0, 2.8);
        System.out.print((t1.contains(4.0, 2.8)) ? "" : "not ");
        System.out.print("in this triangle\n");

        Triangle2D t2 = new Triangle2D(
                new MyPoint(2.9, 2),
                new MyPoint(4, 1),
                new MyPoint(1, 3.4));

        // display contains(triangle)
        System.out.printf("\nTriangle\n" +
                        "(%.1f, %.1f)\n" +
                        "(%.1f, %.1f)\n" +
                        "(%.1f, %.1f)\nis ",
                t2.getP1().x, t2.getP1().y,
                t2.getP2().x, t2.getP2().y,
                t2.getP3().x, t2.getP3().y);
        System.out.printf((t1.contains(t2))?"":"not ");
        System.out.printf("in this triangle\n");

        Triangle2D t3 = new Triangle2D(
                new MyPoint(2.9, 2),
                new MyPoint(4, 1),
                new MyPoint(1, 3.4));

        // display contains(triangle)
        System.out.printf("\nTriangle\n" +
                        "(%.1f, %.1f)\n" +
                        "(%.1f, %.1f)\n" +
                        "(%.1f, %.1f)\nis ",
                t3.getP1().x, t3.getP1().y,
                t3.getP2().x, t3.getP2().y,
                t3.getP3().x, t3.getP3().y);
        System.out.printf((t1.overlaps(t3))?"":"not ");
        System.out.printf("overlapping with this triangle");

    }
}
