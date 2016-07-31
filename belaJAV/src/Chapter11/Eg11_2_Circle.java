package Chapter11;

/**
 * Created by bnamora on 7/31/16.
 */

public class Eg11_2_Circle
        extends Eg11_1_GeometricObject {

    private double radius;

    public Eg11_2_Circle() {
    }

    public Eg11_2_Circle(double radius) {
        this.radius = radius;
    }

    public Eg11_2_Circle(double radius,
                         String color,
                         boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public void printCircle() {
        System.out.println("The circle is created at " +
                getDateCreated() + " and the radius is " +
                this.radius);
    }

}
