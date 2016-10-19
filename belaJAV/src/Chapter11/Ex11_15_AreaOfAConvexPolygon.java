package Chapter11;

import java.util.ArrayList;
import java.util.Scanner;
import mylib.Triangle2D;
import mylib.MyPoint;

/**
 * Created by bnamora on 10/19/16.
 */

public class Ex11_15_AreaOfAConvexPolygon {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<MyPoint> points = new ArrayList<MyPoint>();

        // get the number of points in a convex polygon
        System.out.print("Enter the number of points: ");
        int totalPoints = input.nextInt();

        // get points' coordinate
        for (int i = 0; i < totalPoints; i++) {
            System.out.printf("Enter point %d's coordinate: ", i);
            double x = input.nextDouble();
            double y = input.nextDouble();
            points.add(new MyPoint(x, y));
        }

        // get area and display to console
        System.out.println("The total Area is " + getArea(points));

    }

    public static double getArea(ArrayList<MyPoint> points) {

        ArrayList<Triangle2D> allSubTriangles = new ArrayList<Triangle2D>();

        // get all sub triangles
        for (int i = 1; i < points.size() - 1; i++) {
            Triangle2D subTriangle = new Triangle2D(points.get(0), points.get(i), points.get(i + 1));
            allSubTriangles.add(subTriangle);
        }

        // calculate area
        double area = 0;
        for (int i = 0; i < allSubTriangles.size(); i++) {
            area += allSubTriangles.get(i).getArea();
        }

        return area;

    }

}
