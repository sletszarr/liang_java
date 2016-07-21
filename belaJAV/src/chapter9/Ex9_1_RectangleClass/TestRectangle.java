package chapter9.Ex9_1_RectangleClass;

/**
 * Created by bnamora on 7/21/16.
 */

public class TestRectangle {

    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle(4, 40);
        System.out.println("Rectangle #1");
        System.out.println("width: " + rect1.width);
        System.out.println("height: " + rect1.height);
        System.out.println("area: " + rect1.getArea());
        System.out.println("perimeter: " + rect1.getPerimeter());

        Rectangle rect2 = new Rectangle(3.5, 35.9);
        System.out.println("\nRectangle #2");
        System.out.println("width: " + rect2.width);
        System.out.println("height: " + rect2.height);
        System.out.println("area: " + rect2.getArea());
        System.out.println("perimeter: " + rect2.getPerimeter());

    }
}
