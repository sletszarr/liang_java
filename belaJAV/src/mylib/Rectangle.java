package mylib;

/**
 * Created by bnamora on 7/21/16.
 */

public class Rectangle {

    public double width;
    public double height;

    public Rectangle() {
        this(1, 1);
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * width + 2 * height;
    }

}
