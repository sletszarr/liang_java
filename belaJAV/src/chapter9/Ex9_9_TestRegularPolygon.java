package chapter9;

import mylib.RegularPolygon;

/**
 * Created by bnamora on 7/22/16.
 */

public class Ex9_9_TestRegularPolygon {

    public static void main(String[] args) {

        RegularPolygon poly1 = new RegularPolygon();
        RegularPolygon poly2 = new RegularPolygon(6, 4);
        RegularPolygon poly3 = new RegularPolygon(10, 4, 5.6, 7.8);

        // display polygon 1
        System.out.println("Polygon #1");
        System.out.println("Perimeter: " + poly1.getPerimeter());
        System.out.println("Area: " + poly1.getArea());

        // display polygon 2
        System.out.println("\nPolygon #2");
        System.out.println("Perimeter: " + poly2.getPerimeter());
        System.out.println("Area: " + poly2.getArea());

        // display polygon 3
        System.out.println("\nPolygon #3");
        System.out.println("Perimeter: " + poly3.getPerimeter());
        System.out.println("Area: " + poly3.getArea());

    }

}
