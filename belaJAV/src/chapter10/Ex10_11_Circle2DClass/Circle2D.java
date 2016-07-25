package chapter10.Ex10_11_Circle2DClass;

import chapter10.Ex10_4_MyPointClass.MyPoint;

/**
 * Created by bnamora on 7/25/16.
 */

public class Circle2D {

    private double cX; // center x
    private double cY; // center y
    private double radius;

    Circle2D() {
        this(0, 0, 1);
    }

    Circle2D(double cX, double cY, double radius) {
        this.cX = cX;
        this.cY = cY;
        this.radius = radius;
    }

    public double getCenterX() {
        return cX;
    }

    public double getCenterY() {
        return cY;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public boolean contains(double x, double y) {
        // return true if (x,y)
        // is inside this circle
        return distanceFromCenter(x, y) < radius;
    }

    public boolean contains(Circle2D c) {
        // return true if this circle
        // contains innerCircle
        return (distanceBetweenCenters(c)
                + c.getRadius()) < radius;
    }

    public boolean overlaps(Circle2D c) {
        // return true if this circle
        // and otherCircle are overlapping
        return (!this.contains(c) &&
                !c.contains(this) &&
                distanceBetweenCenters(c) <=
                        this.getRadius() + c.getRadius()
        );
    }

    private double distanceFromCenter(double x, double y) {
        // create point object
        // for the center of this circle
        MyPoint center = new MyPoint(cX, cY);

        // return the distance between
        // this.center and (x,y)
        return center.distance(x, y);

    }

    private double distanceBetweenCenters(Circle2D c) {
        return distanceFromCenter(c.getCenterX(), c.getCenterY());
    }

}
