package chapter9;

/**
 * Created by bnamora on 7/21/16.
 */

public class Eg9_8_CircleWithPrivateDataFields {

    // circle's radius
    private double radius = 1;

    // number of objects created
    private static int numberOfObjects = 0;

    // construct circle with radius 1
    Eg9_8_CircleWithPrivateDataFields() {
        numberOfObjects++;
    }

    // construct circle with specified radius
    Eg9_8_CircleWithPrivateDataFields(double radius) {
        this.radius = radius;
        numberOfObjects++;
    }

    // return radius
    public double getRadius() {
        return radius;
    }

    // set a new radius
    public void setRadius(double radius) {
        this.radius = (radius >= 0) ? radius : 0;
    }

    // return number of objects
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    // return area of this circle
    public double getArea() {
        return Math.PI * radius * radius;
    }

}
