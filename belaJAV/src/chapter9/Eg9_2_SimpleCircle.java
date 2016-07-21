package chapter9;

/**
 * Created by bnamora on 7/21/16.
 */

public class Eg9_2_SimpleCircle {

    public static void main(String[] args) {

        // create circle with radius 1
        Eg9_2_SimpleCircle circle = new Eg9_2_SimpleCircle();
        System.out.println("The circle of radius " +
                circle.radius + " has area of " + circle.getArea());

        // create circle with radius 25
        Eg9_2_SimpleCircle circle1 = new Eg9_2_SimpleCircle(25);
        System.out.println("The circle of radius " +
                circle1.radius + " has area of " + circle1.getArea());

        // create circle with radius 125
        Eg9_2_SimpleCircle circle2 = new Eg9_2_SimpleCircle(125);
        System.out.println("The circle of radius " +
                circle2.radius + " has area of " + circle2.getArea());

        // modify circle1's radius
        circle1.radius = 100;
        System.out.println("The circle of radius " +
                circle1.radius + " has area of " + circle1.getArea());

    }

    double radius;

    Eg9_2_SimpleCircle() {
        radius = 1;
    }

    Eg9_2_SimpleCircle(double radius) {
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
