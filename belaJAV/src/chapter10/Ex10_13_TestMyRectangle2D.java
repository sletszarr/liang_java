package chapter10;

import mylib.MyRectangle2D;

/**
 * Created by bnamora on 7/27/16.
 */

public class Ex10_13_TestMyRectangle2D {

    public static void main(String[] args) {

        MyRectangle2D rect1 = new MyRectangle2D(2, 2, 5.5, 4.9);

        // display area and perimeter
        System.out.println("Area: " + rect1.getArea());
        System.out.println("Perimeter: " + rect1.getPerimeter());

        // test contains (x,y)
        System.out.printf("\n(%.1f, %.1f) is ", 3.0, 3.0);
        System.out.print((rect1.contains(3, 3))?"":"not ");
        System.out.print("inside this rectangle\n\n");

        // test contains another rect
        MyRectangle2D rect2 = new MyRectangle2D(4, 5, 10.5, 3.2);
        System.out.print("rect 2 is ");
        System.out.print((rect1.contains(rect2)) ? "" : "not ");
        System.out.print("inside rect1\n\n");

        // test overlaps another rect
        MyRectangle2D rect3 = new MyRectangle2D(3, 5, 2.3, 5.4);
        System.out.print("rect 3 is ");
        System.out.print((rect1.overlaps(rect3))?"":"not ");
        System.out.print("overlapping with rect1\n\n");
    }

}
