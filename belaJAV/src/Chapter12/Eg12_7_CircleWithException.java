package Chapter12;

/**
 * Created by bnamora on 1/22/17.
 */

public class Eg12_7_CircleWithException {

    private double radius;

    private static int numberOfObjects = 0;

    public Eg12_7_CircleWithException() {
        this(1.0);
    }

    public Eg12_7_CircleWithException(double radius) {

        setRadius(radius);
        numberOfObjects++;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius)
            throws IllegalArgumentException {

        if (radius >= 0) {
            this.radius = radius;
        }
        else {
            throw new IllegalArgumentException(
                    "Radius can not be negative");
        }
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    public double findArea() {
        return Math.PI * radius * radius;
    }

}
