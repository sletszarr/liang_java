package chapter9;

import java.util.Scanner;

import javafx.geometry.Point2D;

/**
 * Created by bnamora on 7/21/16.
 */

public class Eg9_5_TestPoint2D {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // declare x and y
        double x, y;

        // get x and y
        System.out.print("Enter point1's x-, y-coordinates: ");
        x = input.nextDouble();
        y = input.nextDouble();

        // create the first Point2D object
        Point2D p1 = new Point2D(x, y);

        // get x and y
        System.out.print("Enter point2's x-, y-coordinates: ");
        x = input.nextDouble();
        y = input.nextDouble();

        // create the second Point2D object
        Point2D p2 = new Point2D(x, y);

        System.out.println("p1 is " + p1.toString());
        System.out.println("p2 is " + p2.toString());
        System.out.println("The distance between " +
                "p1 and p2 is " + p1.distance(p2));

    }
}
