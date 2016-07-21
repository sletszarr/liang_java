package chapter9;

/**
 * Created by bnamora on 7/21/16.
 */

public class Eg9_1_TestSimpleCircle {

    public static void main(String[] args) {

        // create circle with radius 1
        SimpleCircle circle = new SimpleCircle();
        System.out.println("The circle of radius " +
                circle.radius + " has area of " + circle.getArea());

        // create circle wiht radius 25
        SimpleCircle circle1 = new SimpleCircle(25);
        System.out.println("The circle of radius " +
                circle1.radius + " has area of " + circle1.getArea());

        // create circle wiht radius 125
        SimpleCircle circle2 = new SimpleCircle(125);
        System.out.println("The circle of radius " +
                circle2.radius + " has area of " + circle2.getArea());

        // modify circle1's radius
        circle1.radius = 100;
        System.out.println("The circle of radius " +
                circle1.radius + " has area of " + circle1.getArea());

    }

}

class SimpleCircle {

    double radius;

    SimpleCircle() {
        radius = 1;
    }

    SimpleCircle(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

}
